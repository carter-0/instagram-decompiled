package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.BIv  reason: case insensitive filesystem */
public final class C42140BIv extends AnonymousClass0T0 implements DUJ {
    public final User A00;
    public final String A01;
    public final String A02;

    public final C42140BIv FGW(1E9 r1) {
        return this;
    }

    public final C42140BIv FGX(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42140BIv) {
                C42140BIv bIv = (C42140BIv) obj;
                if (!0qQ.A0K(this.A01, bIv.A01) || !0qQ.A0K(this.A00, bIv.A00) || !0qQ.A0K(this.A02, bIv.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BGL() {
        return this.A01;
    }

    public final User C4Y() {
        return this.A00;
    }

    public final String C4Z() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTemplateInfo", C45005Coi.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, (AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public C42140BIv(User user, String str, String str2) {
        AnonymousClass7TG.A1P(str, str2);
        this.A01 = str;
        this.A00 = user;
        this.A02 = str2;
    }

    public final DUJ EAT(1E9 r1) {
        return this;
    }
}
