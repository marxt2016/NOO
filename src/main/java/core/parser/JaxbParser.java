package core.parser;

import javax.xml.bind.JAXBException;
import java.io.File;

/**
 * Created by Olga_Melnikova on 12/12/2016.
 */
public interface JaxbParser {
    Object getObject(File file, Class c) throws JAXBException;
    void saveObject(File file, Object o) throws JAXBException;
}
