# Proyecto - StockMarket

# Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Clase
---
classDiagram
      class Clase
      Clase: -x
      Clase: -y
      Clase: +op1()
      Clase: +op2()
      Clase: +op3()
      Clase: +op4()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

**Observer Design Pattern Assignment**

This assignment will give you practice in using the Observer Design Pattern.

Consider a stock trading system whereby there is a stock market that keeps track of all trades of specific stocks (subjects) and must inform all traders (observers) when a new trade has been made for a certain stock. Stocks are distinguished by short acronyms (i.e. MSFT, GOOG, AAPL. A trade of a specific stock can be either a buy or sell and it occurs at a certain price. Each stock subject will maintain a list of all traders registered with it and will notify each registered trader when a trade has been made for that specific stock.

Design the Trader class (which implements the Observer interface)
Design the Stock class (which implements the Subject interface)

Write some test code that creates a StockMarket as well as 3-4 Stock objects. Create 3-4 Trader objects. Have the stock market register each trader with a few stocks and then have the traders make trades for those stocks. Remember trades are either a buy or sell and occur at a certain price. Make sure your test code illustrates how each trader is notified when a trade for the stock(s) they are registered for is made. A Trader can own many stocks. A stock can be owned by many Traders. This is very important to the design of the project.

Each stock will have its own list of observers. You will probably have to add the observers to each stock separately from their constructor. 

The output must have not only the trader’s name and amount, it must indicate the stock symbol and the transaction type (buy or sell).

Here’s some sample output:

* *The latest trade is Trader: Julie sell $160.0 Stock: MSFT*

* *The latest trade is Trader: Julie sell $160.0 Stock: MSFT*

* *The latest trade is Trader: Amy sell $165.0 Stock: AAPL*

* *The latest trade is Trader: Amy sell $165.0 Stock: AAPL*

* *The latest trade is Trader: Julie buy $170.0 Stock: GOOG*

[Proyecto original](https://web.csulb.edu/~mopkins/cecs277/projectobserver.shtml)


# Uso del proyecto con make

## Default - Compilar+Probar+Ejecutar
```
make
```
## Compilar
```
make compile
```
## Probar todo
```
make test
```
## Ejecutar App
```
make run
```
## Limpiar binarios
```
make clean
```
# Comandos Git-Cambios y envío a Autograding

## Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
## Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
# Comandos individuales
## Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


## Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
## Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
## Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
