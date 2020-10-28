require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js

# Подключение сценарных файлов
require: main.sc


theme: /
    state: Start
        q!: $regex</start>
        q!: (запусти | открой | вруби) напоминания
        a: Начнём.
        

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

