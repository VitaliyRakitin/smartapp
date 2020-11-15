theme: /
    
    state: ЗаданиеВыполнено
        event!: done
        event!: DONE
        
        script:
            addSuggestions(["Добавь задачу купить машину"], $context);
            
        random: 
            a: Молодец!
            a: Красавичк!
            a: Супер
            
    state: ДобавленаНоваяЗапись
        event!: note_added
        event!: NOTE_ADDED

        random: 
            a: Добавлено!
            a: Сохранено!

