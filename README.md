# TDD @FizzBuzz

## 开发环境

- JDK1.8+

## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有 N 名学生在上课。游戏的规则是：

- 让所有学生排成一队，然后按顺序报数。

- 学生报数时，如果所报数字是 3 的倍数，那么不能说该数字，而要说 Fizz；如果所报数字是 5 的倍数，那么要说 Buzz；如果所报数字是第 7 的倍数，那么要说 Whizz。

- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如 3 和 5 的倍数，那么不能说该数字，而是要说 FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说 FizzBuzzWhizz。

## Tasking

given 学生顺序是 3 的倍数
when 报数
then 报 Fizz

given 学生顺序是 5 的倍数
when 报数
then 报 Buzz

given 学生顺序是 7 的倍数
when 报数
then 报 Whizz

given 学生顺序是 3 和 5 的倍数
when 报数
then 报 FizzBuzz

given 学生顺序是 3 和 7 的倍数
when 报数
then 报 FizzWhizz

given 学生顺序是 5 和 7 的倍数
when 报数
then 报 BuzzWhizz

given 学生顺序是 3 和 5 和 7 的倍数
when 报数
then 报 FizzBuzzWhizz

given 学生顺序是不是 3 或 5 或 7 的倍数
when 报数
then 报数字
