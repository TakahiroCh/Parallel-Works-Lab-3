# Parallel-Works-Lab-4 Приложение akka предназначенное для удаленного тестирования JS приложений.

Примеры запросов :
Запрос на запуск теста

POST
{ 
  "packageId":"11",
  "jsScript":"var divideFn = function(a,b) { return a/b} ",
  "functionName":"divideFn",
  "tests": [
    {
      "testName":"test1",
      "expectedResult":"2.0",
      "params":[2,1]
    },
    {
      "testName":"test2",
      "expectedResult":"2.0",
      "params":[4,2]
    }
  ]
}

Запрос на получение результатов
GET http://localhost:8080/packageId=11
