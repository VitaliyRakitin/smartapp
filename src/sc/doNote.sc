theme: /

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            
        script:
            var tmp = $parseTree._number;

        a: {{$parseTree._number}}