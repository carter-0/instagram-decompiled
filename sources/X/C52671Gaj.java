package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gaj  reason: case insensitive filesystem */
public final class C52671Gaj extends AnonymousClass0T0 {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52671Gaj) {
                C52671Gaj gaj = (C52671Gaj) obj;
                if (!0qQ.A0K(this.A00, gaj.A00) || !0qQ.A0K(this.A01, gaj.A01) || this.A05 != gaj.A05 || !0qQ.A0K(this.A02, gaj.A02) || !0qQ.A0K(this.A04, gaj.A04) || !0qQ.A0K(this.A03, gaj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)))) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
    }

    public C52671Gaj(C267324bN r1, C52058GDe gDe, UserSession userSession, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A01 = gDe;
        this.A05 = z;
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CtaStickerUiState(legacyClipsItem=");
        A1A.append(this.A00);
        A1A.append(", legacyClipsItemState=");
        A1A.append(this.A01);
        A1A.append(", isEnabled=");
        A1A.append(this.A05);
        A1A.append(", userSession=");
        A1A.append(this.A02);
        A1A.append(", text=");
        A1A.append(this.A04);
        A1A.append(", contextualColor=");
        A1A.append(this.A03);
        A1A.append(", contentDescriptionText=");
        return C51975G9x.A0i((String) null, A1A);
    }
}
