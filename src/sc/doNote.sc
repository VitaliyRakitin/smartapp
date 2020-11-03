theme: /

    state: ВыполнениеЭлемента
        q!: (я сделал)
            $AnyText::anyText

        a: Молодец
        
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            done_note(item_id,$context);