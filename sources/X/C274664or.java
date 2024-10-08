package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ActionButtonPartnerType;

/* renamed from: X.4or  reason: invalid class name and case insensitive filesystem */
public final class C274664or extends AnonymousClass0T0 implements C274674os {
    public final ActionButtonPartnerType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C274664or(ActionButtonPartnerType actionButtonPartnerType, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str6, 6);
        0qQ.A0B(actionButtonPartnerType, 7);
        0qQ.A0B(str7, 8);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A00 = actionButtonPartnerType;
        this.A07 = str7;
    }

    public final C274664or F0B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274664or) {
                C274664or r5 = (C274664or) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || this.A00 != r5.A00 || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A02;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.A06.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A07.hashCode();
    }

    public final String Ac5() {
        return this.A01;
    }

    public final String Ac9() {
        return this.A02;
    }

    public final String Ain() {
        return this.A03;
    }

    public final String AmM() {
        return this.A04;
    }

    public final String Ay3() {
        return this.A05;
    }

    public final String Bao() {
        return this.A06;
    }

    public final ActionButtonPartnerType Bap() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTActionButtonPartner", C48321Ece.A00(this));
    }

    public final String getUrl() {
        return this.A07;
    }
}
