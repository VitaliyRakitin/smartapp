theme: /

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            
        script:
            var tmp = $parseTree._number;
            var item_id = get_id_by_selected_item(get_request($context));
            doneNote(item_id,$context);
            
        a: {{$parseTree._number}}