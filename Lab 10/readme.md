W przypadku poprawnego wczytania pliku: try >> finally >> try
W przypadku niepoprawnego wczytania pliku: try >> catch >> finally


Try with resources pozwala nam pominąć blok finally, ponieważ zastosowanie tej konstrukcji
automatycznie zamyka wszystkie obiekty stworzone w obrębie bloku try.


Realizacja w pliku CSVReader.java


Sprawdzenie dla liczb zmiennoprzecinkowych ma sens, pod warunkiem że do każdej liczby całkowitej używanej w testach
dodamy ".0".
