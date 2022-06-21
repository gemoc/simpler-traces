package org.eclipse.gemoc.trace.simple.addon;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimpleDynamicAnnotationHelper {
  public static final String DYNAMIC_ANNOTATION_URI = "aspect";
  
  public static boolean isDynamic(final EModelElement o) {
    final Function1<EAnnotation, Boolean> _function = new Function1<EAnnotation, Boolean>() {
      public Boolean apply(final EAnnotation a) {
        return Boolean.valueOf(a.getSource().equals(SimpleDynamicAnnotationHelper.DYNAMIC_ANNOTATION_URI));
      }
    };
    return IterableExtensions.<EAnnotation>exists(o.getEAnnotations(), _function);
  }
}
