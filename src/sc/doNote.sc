theme: /

    state: ВыполнениеЭлементаПоНомеру
        q!: [я] (выполнил|сделал)
            $AnyDigit:: digit
            $weight<1.001>
        
        script:
            var item_id = get_id_by_selected_item_number($parseTree._digit)
            doneNote(item_id,$context);
            
        random:
            a: Молодец!
            a: Супер!

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            $weight<-0.8>
            
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            doneNote(item_id,$context);
    
        random:
            a: Молодец!
            a: Супер!