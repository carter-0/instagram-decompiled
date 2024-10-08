package X;

import com.facebook.superpack.SuperpackFileInputStream;
import java.io.InputStream;

public final class Sly implements 0Da {
    public static final Sly A00 = new Sly();

    public final SuperpackFileInputStream AOB(InputStream inputStream) {
        0qQ.A0B(inputStream, 0);
        return SuperpackFileInputStream.createFromSingletonArchiveInputStream(inputStream, "xz");
    }
}
