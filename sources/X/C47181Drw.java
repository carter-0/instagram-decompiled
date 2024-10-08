package X;

import com.instagram.android.R;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;

/* renamed from: X.Drw  reason: case insensitive filesystem */
public final class C47181Drw extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C47181Drw(C266444Yx r2, String str, String str2, String str3, String str4, int i, boolean z) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(str4, 4);
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = r2;
        this.A07 = z;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47181Drw)) {
                return false;
            }
            C47181Drw drw = (C47181Drw) obj;
            if (drw.A00 != 1 || !0qQ.A0K(this.A03, drw.A03) || !0qQ.A0K(this.A05, drw.A05) || this.A02 != drw.A02 || !0qQ.A0K(this.A06, drw.A06) || this.A01 != drw.A01 || this.A07 != drw.A07 || !0qQ.A0K(this.A04, drw.A04)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C47181Drw)) {
                return false;
            }
            C47181Drw drw2 = (C47181Drw) obj;
            if (drw2.A00 != 0 || !0qQ.A0K(this.A05, drw2.A05) || !0qQ.A0K(this.A04, drw2.A04) || !0qQ.A0K(this.A06, drw2.A06) || !0qQ.A0K(this.A03, drw2.A03) || !0qQ.A0K(this.A02, drw2.A02) || this.A07 != drw2.A07 || this.A01 != drw2.A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int A09;
        int i;
        if (this.A00 != 0) {
            int A072 = AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0E(this.A05)) * 31);
            A09 = AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A08(this.A06, A072) + this.A01) * 31);
            i = C41845B3m.A00(this.A04);
        } else {
            A09 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A05))))));
            i = this.A01;
        }
        return A09 + i;
    }

    public C47181Drw(IgUserBioLinkTypeEnum igUserBioLinkTypeEnum, String str, String str2, String str3) {
        this(igUserBioLinkTypeEnum, str, str2, str3, (String) null, (int) R.drawable.instagram_facebook_circle_pano_outline_24, true);
    }

    public C47181Drw(IgUserBioLinkTypeEnum igUserBioLinkTypeEnum, String str, String str2, String str3, String str4, int i, boolean z) {
        AnonymousClass7TF.A1C(str, 1, igUserBioLinkTypeEnum);
        this.A03 = str;
        this.A05 = str2;
        this.A02 = igUserBioLinkTypeEnum;
        this.A06 = str3;
        this.A01 = i;
        this.A07 = z;
        this.A04 = str4;
    }
}
