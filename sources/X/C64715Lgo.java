package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.Lgo  reason: case insensitive filesystem */
public final class C64715Lgo implements C348927zH {
    public final int A00;

    public C64715Lgo(int i) {
        this.A00 = i;
    }

    public final boolean CeG(Medium medium) {
        boolean A02;
        switch (this.A00) {
            case 0:
                0t0 A01 = AnonymousClass0eN.A01(new MMT(medium, 19));
                if (medium.CeS()) {
                    A02 = C59796JYp.A02((String) A01.getValue());
                    break;
                } else {
                    return true;
                }
            case 1:
                if (AnonymousClass7TE.A0t(medium.A0X).length() > 0) {
                    return true;
                }
                return false;
            default:
                File A0t = AnonymousClass7TE.A0t(medium.A0X);
                if (A0t.exists()) {
                    A02 = A0t.canRead();
                    break;
                } else {
                    return false;
                }
        }
        if (A02) {
            return true;
        }
        return false;
    }
}
