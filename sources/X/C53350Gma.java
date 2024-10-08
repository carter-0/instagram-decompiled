package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.Gma  reason: case insensitive filesystem */
public final class C53350Gma extends AnonymousClass0T0 {
    public final C267324bN A00;
    public final AnonymousClass3W1 A01;
    public final User A02;
    public final String A03;
    public final String A04 = "clips_viewer_go_to_profile";
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final HLF A08;
    public final Float A09;
    public final Float A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53350Gma) {
                C53350Gma gma = (C53350Gma) obj;
                if (!0qQ.A0K(this.A03, gma.A03) || !0qQ.A0K(this.A00, gma.A00) || !0qQ.A0K(this.A01, gma.A01) || !0qQ.A0K(this.A02, gma.A02) || !0qQ.A0K(this.A04, gma.A04) || this.A08 != gma.A08 || !0qQ.A0K(this.A05, gma.A05) || !0qQ.A0K(this.A06, gma.A06) || this.A07 != gma.A07 || !0qQ.A0K(this.A09, gma.A09) || !0qQ.A0K(this.A0A, gma.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53350Gma(C267324bN r4, HLF hlf, AnonymousClass3W1 r6, User user, Float f, Float f2, String str, String str2, boolean z) {
        DbW.A1O(str, 1, hlf);
        this.A03 = str;
        this.A00 = r4;
        this.A01 = r6;
        this.A02 = user;
        this.A08 = hlf;
        this.A05 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        this.A06 = str2;
        this.A07 = z;
        this.A09 = f;
        this.A0A = f2;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A07, G9w.A01(AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A03)))))))))) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A0A);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProfileLaunchInfo(moduleName=");
        A1A.append(this.A03);
        A1A.append(", clipsItem=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(202));
        A1A.append(this.A01);
        A1A.append(", user=");
        A1A.append(this.A02);
        A1A.append(", profileEntryTrigger=");
        A1A.append(this.A04);
        A1A.append(", profileType=");
        A1A.append(this.A08);
        A1A.append(", sourceOfTapping=");
        A1A.append(this.A05);
        A1A.append(", startingTab=");
        A1A.append(this.A06);
        C51975G9x.A1G(A1A, ", isFromSidePanel=");
        A1A.append(", enableProfileAndBrowse=");
        A1A.append(this.A07);
        A1A.append(", tapXPosition=");
        A1A.append(this.A09);
        A1A.append(", tapYPosition=");
        return AnonymousClass7TG.A0n(this.A0A, A1A);
    }
}
