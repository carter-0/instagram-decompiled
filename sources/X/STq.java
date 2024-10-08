package X;

import android.graphics.RectF;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class STq {
    public static final STq A00 = new Object();

    public static final C266754aI A00(C266714aE r3, MediaComposition mediaComposition) {
        List A08 = mediaComposition.A08(r3, 0);
        if (A08 == null || A08.isEmpty()) {
            return null;
        }
        return (C266754aI) A08.get(0);
    }

    public static final boolean A03(MediaComposition mediaComposition) {
        STq sTq = A00;
        C266714aE r2 = C266714aE.VIDEO;
        if (!Q1Z.A04(r2, mediaComposition) && !mediaComposition.A0B(r2)) {
            C266714aE r1 = C266714aE.AUDIO;
            if (Q1Z.A04(r1, mediaComposition) || mediaComposition.A0B(r1) || A01(r2, mediaComposition) || A01(r1, mediaComposition)) {
                return false;
            }
            C266754aI A002 = A00(r2, mediaComposition);
            C266754aI A003 = A00(r1, mediaComposition);
            if (A002 == null || !sTq.A05(A002)) {
                if (A003 != null && sTq.A05(A003)) {
                    return false;
                }
                if (A002 == null || A003 == null || A002.equals(A003)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean A04(MediaComposition mediaComposition, C10864RzP rzP) {
        if (mediaComposition != null) {
            if (A03(mediaComposition)) {
                C266714aE r5 = C266714aE.VIDEO;
                C266754aI A002 = A00(r5, mediaComposition);
                if (A002 != null && A002.A02 > 0) {
                    if (A03(mediaComposition)) {
                        A00(r5, mediaComposition);
                    }
                }
            }
            return false;
        }
        if (rzP.A04 >= 0 || rzP.A03 >= 0 || A06(rzP)) {
            return false;
        }
        return true;
    }

    private final boolean A05(C266754aI r7) {
        C266724aF r5 = r7.A03;
        if (r5.A03(TimeUnit.MICROSECONDS) > 0) {
            return true;
        }
        long A02 = r5.A02(TimeUnit.MILLISECONDS);
        if (A02 < 0 || A02 == r7.A01) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C10864RzP rzP) {
        C11354SOn sOn = rzP.A0H;
        if (rzP.A0U || sOn.A05 != 0) {
            return true;
        }
        Integer num = sOn.A0H;
        if (num != null && num != AnonymousClass05K.A00) {
            return true;
        }
        RectF rectF = sOn.A0E;
        RectF rectF2 = C11354SOn.A0P;
        if (!RV5.A00(rectF.left, rectF2.left) || !RV5.A00(rectF.bottom, rectF2.bottom) || !RV5.A00(rectF.top, rectF2.top) || !RV5.A00(rectF.right, rectF2.right)) {
            return true;
        }
        List list = sOn.A0J;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C266714aE r2, MediaComposition mediaComposition) {
        HashMap A07 = mediaComposition.A07(r2);
        if (A07 != null && A07.size() > 1) {
            return true;
        }
        List A08 = mediaComposition.A08(r2, 0);
        if (A08 == null || A08.size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C266714aE r2, MediaComposition mediaComposition, STq sTq) {
        HashMap A07 = mediaComposition.A07(r2);
        if (A07 == null) {
            return false;
        }
        Iterator A0t = AnonymousClass7TF.A0t(A07);
        while (A0t.hasNext()) {
            Iterator A16 = Pxg.A16(((C266794aM) AnonymousClass7TF.A0a(A0t)).A04);
            while (true) {
                if (A16.hasNext()) {
                    if (sTq.A05((C266754aI) AnonymousClass7TF.A0a(A16))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
