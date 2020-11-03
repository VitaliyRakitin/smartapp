theme: /

    state: УдалениеЭлемента
        q!: (~удалить)
            $AnyText::anyText
            
        a: Удаляю
        
        script:
            deleteNote("123",$context);
        
        