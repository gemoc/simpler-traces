package org.eclipse.gemoc.trace.simple.addon

import org.eclipse.emf.ecore.EModelElement

class SimpleDynamicAnnotationHelper {
	public static val DYNAMIC_ANNOTATION_URI = "aspect"

	static def boolean isDynamic(EModelElement o) {
		return o.EAnnotations.exists[a|a.source.equals(DYNAMIC_ANNOTATION_URI)]
	}
}
