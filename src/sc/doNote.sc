theme: /

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            $weight<-0.2>
            
        script:
            var item_id = get_id_by_selected_item(get_request($context));
            doneNote(item_id,$context);
        
        a: Молодец
        
        
    state: ВыполнениеЭлементаПоНомеру
    
        q: [я] (выполнил|сделал) номер 
        
        a: Оки