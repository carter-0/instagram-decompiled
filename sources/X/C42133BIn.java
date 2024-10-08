package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BIn  reason: case insensitive filesystem */
public final class C42133BIn extends AnonymousClass0T0 implements C46319DUw {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final C42133BIn FFu(1E9 r1) {
        return this;
    }

    public final C42133BIn FFv(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42133BIn) {
                C42133BIn bIn = (C42133BIn) obj;
                if (!0qQ.A0K(this.A01, bIn.A01) || !0qQ.A0K(this.A02, bIn.A02) || !0qQ.A0K(this.A00, bIn.A00) || !0qQ.A0K(this.A07, bIn.A07) || !0qQ.A0K(this.A03, bIn.A03) || !0qQ.A0K(this.A04, bIn.A04) || !0qQ.A0K(this.A05, bIn.A05) || !0qQ.A0K(this.A06, bIn.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final User BRo() {
        return this.A00;
    }

    public final List Bzq() {
        return this.A07;
    }

    public final String C5C() {
        return this.A04;
    }

    public final String CDo() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryStorefrontTappableData", C44946Cng.A00(this));
    }

    public final String getId() {
        return this.A01;
    }

    public final String getMediaId() {
        return this.A02;
    }

    public final String getText() {
        return this.A03;
    }

    public final String getUserId() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public C42133BIn(User user, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = user;
        this.A07 = list;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
    }

    public final C46319DUw EAE(1E9 r1) {
        return this;
    }
}
