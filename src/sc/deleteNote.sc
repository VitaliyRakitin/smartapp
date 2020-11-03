theme: /

    state: УдалениеЭлемента
        q!: удали
            $AnyText::anyText
            
        a: Удаляю
        
        script:
            deleteNote("123",$context);
        
        