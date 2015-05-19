package com.dujay.generator.writers;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public interface WriteableByteStream {
  
  public ByteArrayOutputStream getStream();
  
  default public ByteStreamWriter getStreamWriter() {
    return new ByteStreamWriter(getStream());
  }
  
  default public void writeToStream(OutputStream out) throws IOException {
    getStream().writeTo(out);
  }
}
