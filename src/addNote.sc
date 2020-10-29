theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|запиши|поставь|закинь) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText

        script:
            addNote($parseTree._anyText);
