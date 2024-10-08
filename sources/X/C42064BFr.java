package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BFr  reason: case insensitive filesystem */
public final class C42064BFr extends AnonymousClass0T0 implements C46299DUc {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final String A04;
    public final List A05;

    public final C42064BFr F7c(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42064BFr) {
                C42064BFr bFr = (C42064BFr) obj;
                if (!0qQ.A0K(this.A05, bFr.A05) || !0qQ.A0K(this.A01, bFr.A01) || !0qQ.A0K(this.A02, bFr.A02) || !0qQ.A0K(this.A03, bFr.A03) || !0qQ.A0K(this.A04, bFr.A04) || !0qQ.A0K(this.A00, bFr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Ai9() {
        return this.A05;
    }

    public final Boolean AkR() {
        return this.A01;
    }

    public final Boolean AkT() {
        return this.A02;
    }

    public final Float BLJ() {
        return this.A03;
    }

    public final User CCd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPostLiveItem", C44243Cbe.A00(this));
    }

    public final String getPk() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42064BFr(User user, Boolean bool, Boolean bool2, Float f, String str, List list) {
        this.A05 = list;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = f;
        this.A04 = str;
        this.A00 = user;
    }

    public final C46299DUc E7x(1E9 r1) {
        return this;
    }
}
