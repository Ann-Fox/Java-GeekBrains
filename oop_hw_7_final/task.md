# Урок 7. ООП Дизайн и Solid ч.2

Изучите ваш код к семинару №2, выделите комментариями ошибки в нем (не соответствие ООП или SOLID принципам) и предложите идеи по его улучшению
Задачние по желанию: Перепишите программу для второго семинара со всеми исправлениями, что были вами предложены.

Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию и номер группы

## Ответ:

Вендинг машина `VendingMachine` не должна ничего знать про конкрентные свойства напитка, т.к. в будущем напитков с разными свойствами может быть много.

Соответственно, метод `getDrink` должен выглядеть так:

```
public void makeDrink(Drink drink)
```

Он должен принимать любой класс-наследник `Drink`

В `Main.java` мы делаем так:

```
vendingMachine.makeDrink(new HotDrink("tea", 250, 50, 60));
```