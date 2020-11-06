theme: /

    state: ВыполнениеЭлемента
        intent!: /doNote
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            
        script:
            var tmp = $parseTree._number;

        a: Успех: {{$parseTree._number}}