require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js
require: js/reply.js
require: js/actions.js

# Подключение сценарных файлов
require: sc/addNote.sc
require: sc/doNote.sc
require: sc/deleteNote.sc
require: sc/noteDone.sc


patterns:
    $AnyText = $nonEmptyGarbage

theme: /
    state: Start
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: (запусти | открой | вруби) моё приложение
        a: Начнём.

    state: Fallback
        event!: noMatch
        script:
            log($request);
        a: Я не понимаю. Вы сказали: {{$request.query}}

