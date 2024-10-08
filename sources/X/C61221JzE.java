package X;

import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JzE  reason: case insensitive filesystem */
public final class C61221JzE extends AnonymousClass0T0 implements C66555MWj {
    public final MediaKitVisibility A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C61221JzE(MediaKitVisibility mediaKitVisibility, User user, String str, String str2, String str3, String str4, List list, boolean z) {
        0qQ.A0B(list, 1);
        C51973G9u.A0s(5, user, str4, mediaKitVisibility);
        this.A06 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A07 = z;
        this.A01 = user;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = mediaKitVisibility;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61221JzE) {
                C61221JzE jzE = (C61221JzE) obj;
                if (!0qQ.A0K(this.A06, jzE.A06) || !0qQ.A0K(this.A02, jzE.A02) || !0qQ.A0K(this.A03, jzE.A03) || this.A07 != jzE.A07 || !0qQ.A0K(this.A01, jzE.A01) || !0qQ.A0K(this.A04, jzE.A04) || !0qQ.A0K(this.A05, jzE.A05) || this.A00 != jzE.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TE.A0K(this.A06) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31);
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A05, (AnonymousClass7TF.A07(this.A01, A09) + C41845B3m.A00(this.A04)) * 31));
    }
}
