package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.3ef  reason: invalid class name and case insensitive filesystem */
public abstract class C246473ef {
    public static final C246633ev A00(AnonymousClass1Xp r21, ImageUrl imageUrl, C246453ed r23, int i, boolean z) {
        C277994w4 BQf;
        String BTL;
        SimpleImageUrl simpleImageUrl;
        AnonymousClass1Xp r13 = r21;
        0qQ.A0B(r13, 0);
        C246453ed r14 = r23;
        0qQ.A0B(r14, 2);
        int i2 = i;
        if (i2 == -1 || !(r13 instanceof 1Xj)) {
            BQf = r13.BQf();
            BTL = r13.BTL();
        } else {
            1Xj r1 = (1Xj) r13;
            1Xj A1c = r1.A1c(i2);
            if (A1c == null) {
                A1c = r1;
            }
            BQf = A1c.BQf();
            1Xj A1c2 = r1.A1c(i2);
            if (A1c2 == null) {
                A1c2 = r1;
            }
            BTL = A1c2.BTL();
        }
        String str = null;
        if (BQf == null) {
            return null;
        }
        C278014w6 A01 = C52501GVd.A01(BQf);
        C278014w6 A00 = C52501GVd.A00(BQf);
        if (BTL != null) {
            simpleImageUrl = new SimpleImageUrl(002.A0R("preview:/", BTL));
        } else {
            simpleImageUrl = null;
        }
        int A002 = C69760Nrj.A00(BQf.BE7());
        String title = BQf.getTitle();
        boolean z2 = false;
        if (A01 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (A00 != null) {
            z3 = true;
            str = A00.getText();
        }
        return new C246633ev(new AnonymousClass9IV(28, (Object) new C59368JGu(A01, BQf, r13, r14, i2), (Object) new AnonymousClass9MK(i2, 3, r13, A00, r14)), simpleImageUrl, imageUrl, title, str, A002, z2, z3, z);
    }
}
