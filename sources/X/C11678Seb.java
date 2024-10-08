package X;

import java.lang.reflect.Constructor;

/* renamed from: X.Seb  reason: case insensitive filesystem */
public final /* synthetic */ class C11678Seb implements C13510Tbb {
    public final Constructor Aq7() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(C13809Thc.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }
}
