require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js

# Подключение сценарных файлов
require: main.sc

theme: /

    pattern:
        $AnyText = $regexp<.*>

    state: Start
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: (запусти | открой | вруби) моё приложение
        a: Начнём.
    
    state: ДобавлениеЭлемента
        q!: (добавь) $AnyText::anyText
        a: {{ $parseTree }}

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

