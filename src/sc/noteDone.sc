theme: /
    
    state: ЗаданиеВыполнено
        event!: done
        event!: DONE
        
        random: 
            a: Молодец!
            a: Красавичк!
            a: Супер!
        
        script:
            addSuggestions(["Добавь задачу купить машину"], $context);