/**
 * 
 */
package de.itter.logic;

import java.util.Collection;

/**
 * @author eriki
 *
 */
public interface Classifier {

	public void addClassifier(Classifier classifier);

	public Collection<Classifier> classify(Object o);

}
