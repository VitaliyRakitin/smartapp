theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|запиши|поставь|закинь) 
            [~напоминание|~заметка|~задание|~задача|~напомнить]
            $AnyText::anyText
            
        random:
            a: Добавлено!
            a: Записано!
            
        script:
            addNote($parseTree._anyText, $context);
            addSuggestions(["Добавь задачу купить машину"], $context);