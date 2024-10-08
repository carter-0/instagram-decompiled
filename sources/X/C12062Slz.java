package X;

import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFileInputStream;
import java.io.InputStream;

/* renamed from: X.Slz  reason: case insensitive filesystem */
public final class C12062Slz implements 0Da {
    public static final C12062Slz A00 = new C12062Slz();

    public final SuperpackFileInputStream AOB(InputStream inputStream) {
        0qQ.A0B(inputStream, 0);
        String str = SuperpackArchive.TAG;
        return SuperpackFileInputStream.createFromSingletonArchiveInputStream(inputStream, "spo", Runtime.getRuntime().availableProcessors());
    }
}
