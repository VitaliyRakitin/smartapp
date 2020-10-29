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
    for (int index = 0; context.response.replies && index < context.response.replies.length; index ++) {
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

    for (int index = 0; context.response.replies && index < context.response.replies.length; index ++) {
        if (context.response.replies[index].type === "raw" &&
            context.response.replies[index].body)
        ) {
            context.response.replies[index].body.items.push({command: command});
            return;
        }
    }

    reply({suggestions: {buttons: buttons}}, context);
    log(context.response.replies);
}