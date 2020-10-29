function reply(body, response){
    var reply = {
        type: "raw",
        body: body
    };
    response.replies = response.replies || [];
    response.replies.push(reply);
}



function addAction(action, context){
    var body = {
        "items": [
            {
                "command": {
                    "type": "smart_app_data",
                    "action": action
                }
            }
        ]
    }; 
    return reply(context.response);
}
