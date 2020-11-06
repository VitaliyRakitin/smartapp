theme: /

    state: ВыполнениеЭлементаПоНомеру
        q!: $AnyDigit: digit
        
        a: Оки {{$parseTree._digit}}

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            $weight<-0.8>
            
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            doneNote(item_id,$context);
        
        a: Супер!
        
    