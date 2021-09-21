package core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 将相关的资源转换成inputStream
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}