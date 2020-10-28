require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js

# Подключение сценарных файлов
require: main.sc


theme: /
    state: Start
        q!: $regex</start>
        # При запуске приложения с голоса прилетит сказанная фраза. 
        q!: (запусти | открой | вруби) моё приложение
        a: Начнём.
        

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

