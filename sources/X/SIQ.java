package X;

import android.net.Uri;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public final class SIQ {
    public static final SIc A02;
    public static final Object A03 = Pxe.A0p();
    public SIc A00 = A02;
    public Object A01 = A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            SIQ siq = (SIQ) obj;
            if (!Util.A0E(this.A01, siq.A01) || !Util.A0E(this.A00, siq.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return G9w.A02(((G9w.A02(Pxi.A03(AnonymousClass7TF.A07(this.A00, (217 + this.A01.hashCode()) * 31) * 31 * 31, i), i) * 31) + i) * 31, i) + i;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.QDa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.S3d, java.lang.Object] */
    static {
        C10995S4p s4p = null;
        ImmutableList.of();
        List emptyList = Collections.emptyList();
        ImmutableList of = ImmutableList.of();
        C10975S3j s3j = C10975S3j.A00;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            s4p = new C10995S4p(uri, of, emptyList);
        }
        SIc sIc = SIc.A08;
        A02 = new SIc(new Object(), new Object(), s4p, s3j, C21979XoR.A0W, "androidx.media3.common.Timeline");
    }
}
