package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.GaI  reason: case insensitive filesystem */
public final class C52644GaI extends AnonymousClass0T0 implements JTM {
    public final JV5 A00;
    public final ClipsMidCardSubtype A01;
    public final InstagramMidcardType A02;
    public final C53452Gok A03;
    public final C53332GmI A04;
    public final ImageUrl A05;
    public final JNG A06;
    public final JNG A07;
    public final JNI A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;
    public final MidCardOverlayType A0D;
    public final C266444Yx A0E;
    public final C266444Yx A0F;
    public final 1Xj A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public C52644GaI(JV5 jv5, ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C53452Gok gok, MidCardOverlayType midCardOverlayType, C53332GmI gmI, C266444Yx r12, C266444Yx r13, ImageUrl imageUrl, 1Xj r15, JNG jng, JNG jng2, JNI jni, String str, String str2, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str2;
        AnonymousClass7TF.A1F(str3, 5, clipsMidCardSubtype);
        List list5 = list2;
        List list6 = list3;
        List list7 = list4;
        C51973G9u.A0v(14, list5, list6, list7);
        this.A09 = str;
        this.A04 = gmI;
        this.A0L = z;
        this.A0D = midCardOverlayType;
        this.A0H = str3;
        this.A0A = list;
        this.A02 = instagramMidcardType;
        this.A01 = clipsMidCardSubtype;
        this.A03 = gok;
        this.A0F = r12;
        this.A0E = r13;
        this.A05 = imageUrl;
        this.A0K = z2;
        this.A0B = list5;
        this.A0J = list6;
        this.A0I = list7;
        this.A0G = r15;
        this.A06 = jng;
        this.A07 = jng2;
        this.A08 = jni;
        this.A0C = z3;
        this.A0M = z4;
        this.A00 = jv5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52644GaI) {
                C52644GaI gaI = (C52644GaI) obj;
                if (!0qQ.A0K(this.A09, gaI.A09) || !0qQ.A0K(this.A04, gaI.A04) || this.A0L != gaI.A0L || this.A0D != gaI.A0D || !0qQ.A0K(this.A0H, gaI.A0H) || !0qQ.A0K(this.A0A, gaI.A0A) || this.A02 != gaI.A02 || this.A01 != gaI.A01 || !0qQ.A0K(this.A03, gaI.A03) || !0qQ.A0K(this.A0F, gaI.A0F) || !0qQ.A0K(this.A0E, gaI.A0E) || !0qQ.A0K(this.A05, gaI.A05) || this.A0K != gaI.A0K || !0qQ.A0K(this.A0B, gaI.A0B) || !0qQ.A0K(this.A0J, gaI.A0J) || !0qQ.A0K(this.A0I, gaI.A0I) || !0qQ.A0K(this.A0G, gaI.A0G) || !0qQ.A0K(this.A06, gaI.A06) || !0qQ.A0K(this.A07, gaI.A07) || !0qQ.A0K(this.A08, gaI.A08) || this.A0C != gaI.A0C || this.A0M != gaI.A0M || !0qQ.A0K(this.A00, gaI.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl Aeu() {
        return this.A05;
    }

    public final String AvZ() {
        return this.A0H;
    }

    public final List BQW() {
        return this.A0A;
    }

    public final C53332GmI BSz() {
        return this.A04;
    }

    public final MidCardOverlayType BZs() {
        return this.A0D;
    }

    public final C266444Yx C2Y() {
        return this.A0E;
    }

    public final C266444Yx C7g() {
        return this.A0F;
    }

    public final boolean CCZ() {
        return this.A0M;
    }

    public final JV5 CG2() {
        return this.A00;
    }

    public final boolean CcA() {
        return this.A0K;
    }

    public final boolean CeV() {
        return this.A0L;
    }

    public final String getId() {
        return this.A09;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(this.A09));
        String str = this.A0H;
        int A073 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A09(this.A0L, A072) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31));
        int A074 = AnonymousClass7TF.A07(this.A0J, AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A07(this.A05, (((AnonymousClass7TF.A07(this.A03, A073) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31))));
        return AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A06, (AnonymousClass7TF.A07(this.A0I, A074) + AnonymousClass7TG.A0C(this.A0G)) * 31))))) + AnonymousClass7TE.A0L(this.A00);
    }
}
