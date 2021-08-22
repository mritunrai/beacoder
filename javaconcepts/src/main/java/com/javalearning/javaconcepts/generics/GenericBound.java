package com.javalearning.javaconcepts.generics;

import java.util.Arrays;
import java.util.List;

/*
Upper bound Wildcard − ? extends Type.:Upper Bounded Wildcards
You can use an upper bounded wildcard to relax the restrictions on a variable. For example, say you want to write a method that works on List<Integer>, List<Double>, and List<Number>; you can achieve this by using an upper bounded wildcard.

To declare an upper-bounded wildcard, use the wildcard character ('?'), followed by the extends keyword, followed by its upper bound. Note that, in this context, extends is used in a general sense to mean either "extends" (as in classes) or "implements" (as in interfaces).
Bounded Type  :when you want to restrict the types that can be used as type arguments in a parameterized type.
Lower bound Wildcard − ? super Type.

Unbounded Wildcards:
The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>.
This is called a list of unknown type. There are two scenarios where an unbounded wildcard is a useful approach:

If you are writing a method that can be implemented using functionality provided in the Object class.
When the code is using methods in the generic class that don't depend on the type parameter.
For example, List.size or List.clear. In fact, Class<?> is so often used because most of the methods in Class<T> do not depend on T.
 */

public class GenericBound {
    public static double sum(List<? extends Number> numberList) {
        double sum = 0.0;

        for (Number n : numberList) sum += n.doubleValue();
        return sum;

    }

    public static <U extends Number> void inspect(U u)
    {
        System.out.println("U :"+u);
        System.out.println("T :" + u.getClass().getName());
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3);

        System.out.println("sum = "+sum(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sum(doubleList));

        inspect(12);


        //Upper Bound
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

       // A list of Double values can use the same sumOfList method. The following code prints sum = 7.0:

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));

    }
}
