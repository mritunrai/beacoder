package com.javalearning.javaconcepts.annotation;

import javax.annotation.processing.*;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import java.util.Set;

public class NullProcessor extends AbstractProcessor {

    private Elements elementUtils;
    private Filer filer;
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        elementUtils = processingEnvironment.getElementUtils();
        filer = processingEnvironment.getFiler();
        messager = processingEnvironment.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();

        for(TypeElement typeElement :annotations) {

            for(Element element : roundEnv.getElementsAnnotatedWith(typeElement)){
                NotNull null1 = element.getAnnotation(NotNull.class);

                messager.printMessage(Diagnostic.Kind.ERROR,"Not NUll :Null Pointer Exception");
                System.out.println("Annotation processor is processing.....");
            }
        }
        return true;
    }
}
