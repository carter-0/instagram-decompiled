package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* renamed from: X.KsT  reason: case insensitive filesystem */
public abstract class C63160KsT {
    public static final L92 A00(MediaComposition mediaComposition, AnonymousClass51R r7, Integer num, String str) {
        int i;
        int i2;
        int i3;
        Integer num2 = num;
        if (num != AnonymousClass05K.A01 || (i3 = r7.A07) == 0 || i3 == 180) {
            i = r7.A09;
            i2 = r7.A05;
        } else {
            i = r7.A05;
            i2 = r7.A09;
        }
        return new L92(mediaComposition, num2, str, i, i2);
    }
}
