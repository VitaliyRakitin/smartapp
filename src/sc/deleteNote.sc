theme: /

    state: УдалениеЭлемента
        q!: (~удалить|) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            if (item_id !== null){
                deleteNote(item_id,
            }