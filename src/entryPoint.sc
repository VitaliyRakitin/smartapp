require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js
require: js/reply.js
require: js/actions.js

# Подключение сценарных файлов
require: main.sc

patterns:
    $AnyText = $nonEmptyGarbage

theme: /
    state: Start
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: (запусти | открой | вруби) моё приложение
        a: Начнём.
    
    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|запиши|поставь|закинь) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
        script:
            addNote(anyText);

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

