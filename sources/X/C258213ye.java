package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SocialContextType;
import java.util.List;

/* renamed from: X.3ye  reason: invalid class name and case insensitive filesystem */
public final class C258213ye extends AnonymousClass0T0 implements C258223yf {
    public final int A00;
    public final SocialContextType A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public C258213ye(SocialContextType socialContextType, String str, List list, List list2, List list3, int i) {
        0qQ.A0B(list2, 2);
        0qQ.A0B(socialContextType, 5);
        this.A03 = list;
        this.A04 = list2;
        this.A02 = str;
        this.A05 = list3;
        this.A01 = socialContextType;
        this.A00 = i;
    }

    public final C258213ye F99(1E9 r1) {
        return this;
    }

    public final C258213ye F9A(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C258213ye) {
                C258213ye r5 = (C258213ye) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || this.A01 != r5.A01 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int i = 0;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.A04.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.A05;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public final List BxP() {
        return this.A03;
    }

    public final List BxQ() {
        return this.A04;
    }

    public final String BxR() {
        return this.A02;
    }

    public final List BxU() {
        return this.A05;
    }

    public final SocialContextType BxW() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextInfo", B4R.A00(this));
    }

    public final int getSocialContextUsersCount() {
        return this.A00;
    }

    public final C258223yf E8E(1E9 r1) {
        return this;
    }
}
