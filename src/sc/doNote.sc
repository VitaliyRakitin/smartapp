theme: /

    state: ВыполнениеЭлементаПоНомеру
        q!: [я] (выполнил|сделал) номер
            @duckling.number:: digit
            $weight<1.001>
        
        script:
            var item_id = findItemIdByNumber($parseTree._digit,getRequest($context))
            doneNote(item_id,$context);
            
        random:
            a: Молодец!
            a: Супер!

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            $weight<-0.8>
            
        script:
            var item_id = findItemIdBySelectedItem(getRequest($context));
            doneNote(item_id,$context);
    
        random:
            a: Молодец!
            a: Супер!