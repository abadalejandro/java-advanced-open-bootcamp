package com.designpattern.structural.ejercicios_6_7_8;
//    Los patrones de diseño más importantes
//    1. Factory method
//    Una fábrica normal produce bienes; una fábrica de software produce
//    objetos. Y no solo eso, lo hace sin especificar la clase exacta del
//    objeto que se creará. Para lograr esto, los objetos se crean llamando
//    a un método de fábrica en lugar de llamar a un constructor.
//
//    Por lo general, la creación de objetos en Java se realiza así:
//    Falcon objeto = new Falcon();
//    El problema con el enfoque anterior es que el código que usa el objeto
//    de Falcon, de repente ahora se vuelve dependiente de la implementación
//    concreta de Falcon. No hay nada de malo en usar new para crear objetos,
//    pero viene con el bagaje de acoplar estrechamente nuestro código a la
//    clase de implementación concreta, lo que ocasionalmente puede ser
//    problemático.
//
//    2.Singleton
//    El patrón singleton se utiliza para limitar la creación de una clase a
//    un solo objeto. Esto es beneficioso cuando se necesita un objeto
//    (y solo uno) para coordinar acciones en todo el sistema. Hay varios
//     ejemplos en dónde debería existir una única instancia de una clase,
//     incluidos cachés, grupos de subprocesos y registros.
//
//    Es trivial iniciar un objeto de una clase, pero ¿cómo nos aseguramos
//    de que solo se cree un objeto? La respuesta es hacer que el constructor sea "privado" para la clase que pretendemos definir como singleton. De esa forma, solo los miembros de la clase pueden acceder al constructor privado y nadie más.
//
//    Consideración importante: es posible subclasificar un singleton haciendo que el constructor esté protegido en lugar de privado. Esto podría ser adecuado en algunas circunstancias. Un enfoque adoptado en estos escenarios es crear un registro de singletons de las subclases y el método getInstance puede tomar un parámetro o usar una variable de entorno para devolver el singleton deseado. Luego, el registro mantiene una asignación de nombres de cadenas a objetos singleton, a los que se puede acceder según sea necesario.
//
//    3.Observer
//    Este patrón es una dependencia de uno a muchos entre objetos, de modo
//    que cuando un objeto cambia de estado, se notifica a todos sus
//    dependientes. Normalmente, esto se hace llamando a uno de sus métodos.
//    En aras de la simplicidad, piense en lo que sucede cuando sigue a
//    alguien en Twitter. Básicamente, le estás pidiendo a Twitter que te
//    envíe (el observador) actualizaciones de tweets de la persona
//    (el sujeto) que seguiste. El patrón consta de dos actores, el
//    observador que está interesado en las actualizaciones y el sujeto que
//    genera las actualizaciones.
//
//    4.Strategy
//    El patrón de estrategia permite agrupar algoritmos relacionados bajo
//    una abstracción, lo que permite cambiar un algoritmo o política por
//    otro sin modificar el cliente. En lugar de implementar directamente
//    un solo algoritmo, el código recibe instrucciones en tiempo de
//    ejecución que especifican cuál del grupo de algoritmos ejecutar.
//
//    5.Adapter
//    Esto permite que las clases incompatibles trabajen juntas al convertir
//    la interfaz de una clase en otra. Piense en ello como una especie de
//    traductor: cuando dos jefes de estado que no hablan un idioma común
//    se encuentran, generalmente un intérprete se sienta entre los dos y
//    traduce la conversación, lo que permite la comunicación.
//
//    Si tienes dos aplicaciones, una de las cuales arroja la salida como
//    XML y la otra requiere una entrada JSON, entonces necesitará un
//    adaptador entre las dos para que funcionen sin problemas.
//
//    6.Builder
//    Como su nombre lo indica, se utiliza un patrón de construcción para
//    construir objetos. A veces, los objetos que creamos pueden ser
//    complejos, estar formados por varios subobjetos o requerir un
//    elaborado proceso de construcción. El ejercicio de crear tipos
//    complejos se puede simplificar utilizando el patrón de construcción.
//    Un objeto compuesto o agregado es lo que generalmente construye un
//    constructor.
//    Consideración clave: el patrón Builder puede parecer similar al
//    patrón de "fábrica abstracta", pero una diferencia es que el patrón
//    Builder crea un objeto paso a paso, mientras que el patrón de fábrica
//    abstracto devuelve el objeto de una vez.
//
//    7.State
//    El patrón State encapsula los diversos estados en los que puede estar
//    una máquina y permite que un objeto altere su comportamiento cuando
//    cambia su estado interno. La máquina o el contexto, como se le llama
//    en lenguaje de patrones, puede tener acciones que lo impulsen a
//    diferentes estados. Sin el uso del patrón, el código se vuelve
//    inflexible y está plagado de condicionales if-else.

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        dbConnection1.Run();
        dbConnection2.Run();
        System.out.println(dbConnection1);
        System.out.println(dbConnection2);
        System.out.println("Las instancias son iguales? :" + (dbConnection1 == dbConnection2));

    }


}
