theme: /
    state: УдалениеЭлементаПоНомеру
        q!: (~удалить|удали) номер
            $AnyDigit:: digit
            $weight<1.001>
        
        script:
            var item_id = get_id_by_selected_item_number($parseTree._digit,get_request($context))
            deleteNote(item_id,$context);

        a: Удаляю

    state: УдалениеЭлемента
        q!: (~удалить|удали)
            $AnyText::anyText
            $weight<-0.8>
            
        
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            deleteNote(item_id,$context);
        
        a: Удаляю