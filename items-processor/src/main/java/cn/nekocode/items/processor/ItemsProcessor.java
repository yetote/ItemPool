package cn.nekocode.items.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.JavaFileObject;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@SupportedAnnotationTypes("cn.nekocode.items.processor.Test")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class ItemsProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

        return true;
    }
}
