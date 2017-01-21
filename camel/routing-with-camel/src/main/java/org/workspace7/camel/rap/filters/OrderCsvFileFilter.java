package org.workspace7.camel.rap.filters;

import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;

/**
 * @author kameshs
 */
public class OrderCsvFileFilter<T> implements GenericFileFilter<T> {
    @Override
    public boolean accept(GenericFile<T> file) {
        return file.getFileName().endsWith("csv");
    }
}
