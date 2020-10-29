function reply(body, response){
    var reply = {
        type: "raw",
        body: body
    };
    response.replies = response.replies || [];
    response.replies.push(reply);
}


function addAction(action, context){
    var command = {
        type: "smart_app_data",
        action: action
    };
    
    if (context.response.replies &&
        context.response.replies.length &&
        context.response.replies[0].body &&
        context.response.replies[0].body.items
    ) {
        context.response.replies[0].body.items.push({command: command});
        return;
    };
    
    return reply({items: [{command: command}]}, context.response);
}


function addSuggestions(suggestions, context) {
    var buttons = [];
    
    suggestions.forEach (function(suggest) {
        buttons.push(
            {
                action: {
                    text: suggest,
                    type: "text"
                },
                title: suggest
            }
        );
    });
    log(buttons);

    if (context.response.replies &&
        context.response.replies.length &&
        context.response.replies[0].body
    ) {
        log("IN");
        context.response.replies[0].body.suggestions = {buttons: buttons};
        return;
    }
    
    reply({suggestions: {buttons: buttons}}, context);
    log(context.response.replies);
}