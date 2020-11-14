# Parallel-Works-Lab-4 Приложение akka предназначенное для удаленного тестирования JS приложений.

Примеры запросов :
Запрос на запуск теста

curl --header "Content-Type: application/json" --request POST --data '{ "packageId":"11", "jsScript":"var divideFn = function(a,b) { return a/b} ", "functionName":"divideFn", "tests": [ {"testName":"test1", "expectedResult":"2.0", "params":[2,1] }]}' 127.0.0.1:8080

Запрос на получение результатов
curl -X GET "127.0.0.1:8080/?packageId=11"
