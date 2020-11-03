theme: /

    state: УдалениеЭлемента
        q!: (~удалить|) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        
        script:
            var selected_item = get_selected_item($context);