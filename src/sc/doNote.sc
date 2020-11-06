theme: /

    state: ВыполнениеЭлемента
        q!: [я] (выполнил|сделал)
            $AnyText::anyText
            
        script:
            var tmp = $parseTree._number;

        a: Успех: {{$parseTree._number}}