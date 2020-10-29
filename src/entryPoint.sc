require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js

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
        q!: (~добавить|~записать|~поставить|~установить) [~напоминание|~заметка|~задание|~задача] $AnyText::anyText
        a: {{ $parseTree._anyText }}

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

