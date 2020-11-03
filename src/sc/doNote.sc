theme: /

    state: ВыполнениеЭлемента
        q!: (я сделал)
            $AnyText::anyText

        a: Молодец
        
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            doneNote(item_id,$context);