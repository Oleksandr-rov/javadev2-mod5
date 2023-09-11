# Завдання

1. Розробити три варіанти реалізації розв'язання задачі про числа Фібоначчі: ітераційний, рекурсивний та за принципом динамічного програмування.
2. Для кожного з цих методів визначити просторову і часову складності.
3. Для кожного з цих методів підготувати доречний тип UML діаграми.

## 1. Ітераційний метод (FibonacciIterative)

* **Просторова складність -** O(1) Використовується кілька змінних
* **Часова складність -** O(n) Вимагає n ітерацій для обчислення n-го числа Фібоначчі

## 2. Рекурсивний метод (FibonacciRecursive)

* **Просторова складність -** O(n) Використовується стек викликів і n є вхідним параметром кожного виклику
* **Часова складність -** O(n) Вимагає n ітерацій для обчислення n-го числа Фібоначчі

## 3. Динамічний метод (FibonacciDynamic)

* **Просторова складність -** O(n) Використовується memo для зберігання обчислених значень та у тих випадках, коли відсутній результат у мапі memo, де n є вхідним параметром кожного виклику (рекурсивний метод розрахунку)
* **Часова складність -** O(n) - В залежності від того чи є збережений результат в памяті **memo**, якщо є то складність О(1), якщо число нове то О(n) так як в даному алгоритмі використовується рекурсивний метод розрахунку.