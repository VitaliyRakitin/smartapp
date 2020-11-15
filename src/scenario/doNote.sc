theme: /

    state: ВыполнениеЭлементаПоНомеру
        q!: [я] (выполнил|сделал) номер
            @duckling.number:: digit
            $weight<1.001>
        
        script:
            var itemId = findItemIdByNumber(
                $parseTree._digit,
                getRequest($context)
            );
            doneNote(itemId, $context);
            
        random:
            a: Молодец!
            a: Супер!


    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            $weight<-0.8>
            
        script:
            var itemId = findItemIdBySelectedItem(getRequest($context));
            doneNote(itemId, $context);
    
        random:
            a: Молодец!
            a: Супер!