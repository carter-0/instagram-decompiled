package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import java.io.File;

/* renamed from: X.I3m  reason: case insensitive filesystem */
public final class C56596I3m {
    public static final C56596I3m A00 = new Object();

    public static final C299515vK A00(AnonymousClass3Q2 r10) {
        long j;
        String str;
        GifUrlImpl gifUrlImpl;
        JV7 jv7 = r10.A0o;
        if (jv7 == null || (str = jv7.A02) == null || (gifUrlImpl = (GifUrlImpl) jv7.A00) == null) {
            String str2 = r10.A33;
            if (str2 == null) {
                return null;
            }
            SimpleImageUrl A01 = C253833rU.A01(new File(str2));
            String str3 = r10.A35;
            int i = r10.A0H;
            int i2 = r10.A0G;
            1Xj r0 = r10.A1C;
            if (r0 != null) {
                j = r0.A17();
            } else {
                j = Long.MAX_VALUE;
            }
            return new AnonymousClass9JJ((ImageUrl) A01, (ImageUrl) null, AnonymousClass05K.A01, str3, (String) null, (String) null, i, i2, j);
        }
        return new C53489GpL(DbS.A0V(gifUrlImpl.A09), gifUrlImpl, r10.A35, (String) null, str, (int) gifUrlImpl.A03.floatValue(), (int) gifUrlImpl.A02.floatValue());
    }
}
