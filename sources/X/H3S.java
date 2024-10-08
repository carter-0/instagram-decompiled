package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class H3S extends C57088IOc {
    public static final C45438CwJ A08 = new Object();
    public AnonymousClass5DY A00;
    public ImageUrl A01 = DbS.A0V("");
    public String A02;
    public final Context A03;
    public final String A04;
    public final String A05;
    public final String A06 = "";
    public final UserSession A07;

    public H3S(Context context, AnonymousClass5DY r4, UserSession userSession, String str, String str2) {
        String str3;
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = context;
        this.A07 = userSession;
        this.A00 = r4;
        this.A02 = AnonymousClass7TE.A16(context, 2131957289);
        1Xj A022 = 1E7.A00(userSession).A02(this.A04);
        if (A022 != null) {
            C247733gp A1V = A022.A1V();
            if (!(A1V == null || (str3 = A1V.A0d) == null)) {
                this.A02 = str3;
            }
            ImageUrl A1Q = A022.A1Q();
            if (A1Q != null) {
                this.A01 = A1Q;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3S) {
                H3S h3s = (H3S) obj;
                if (!0qQ.A0K(this.A04, h3s.A04) || !0qQ.A0K(this.A05, h3s.A05) || !0qQ.A0K(this.A03, h3s.A03) || !0qQ.A0K(this.A07, h3s.A07) || !0qQ.A0K(this.A00, h3s.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04)))) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CutoutSticker(id=");
        C57088IOc.A03(A1A, this.A04);
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(840));
        A1A.append(this.A03);
        A1A.append(", userSession=");
        A1A.append(this.A07);
        A1A.append(", stickerInfo=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
