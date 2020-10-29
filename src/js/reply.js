function reply(body, response){
    var reply_data = {
        type: "raw",
        body: body
    };    
    log('reply_data')
    log(reply_data);

    response.replies = response.replies || [];
    response.replies.push(reply_data);
    log(response.replies);

}


function addAction(action, context){
    var command = {
        type: "smart_app_data",
        action: action
    };
    for (var index = 0; context.response.replies && index < context.response.replies.length; index ++) {
        if (context.response.replies[index].type === "raw" &&
            context.response.replies[index].body &&
            context.response.replies[index].body.items
        ) {
            context.response.replies[index].body.items.push({command: command});
            return;
        }
    }
    
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

    for (var index = 0; context.response.replies && index < context.response.replies.length; index ++) {
        if (context.response.replies[index].type === "raw" &&
            context.response.replies[index].body
        ) {
            log("IN")
            context.response.replies[index].body.suggestions = {buttons: buttons};
            return;
        }
    }

    reply({"suggestions": {"buttons": buttons}}, context);
    log(context.response.replies);
}