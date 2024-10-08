package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.List;

public final class GVW extends AnonymousClass0T0 {
    public final C53368Gms A00;
    public final C61037Jvb A01;
    public final 1ro A02;
    public final C2606046i A03;
    public final MusicAssetModel A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final MusicPageTabType A0B;

    public GVW(C53368Gms gms, C61037Jvb jvb, MusicPageTabType musicPageTabType, 1ro r5, C2606046i r6, MusicAssetModel musicAssetModel, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        C51969G9p.A1N(list, 1, musicPageTabType);
        this.A06 = list;
        this.A08 = z;
        this.A0A = z2;
        this.A07 = z3;
        this.A03 = r6;
        this.A05 = str;
        this.A09 = z4;
        this.A01 = jvb;
        this.A02 = r5;
        this.A0B = musicPageTabType;
        this.A00 = gms;
        this.A04 = musicAssetModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GVW) {
                GVW gvw = (GVW) obj;
                if (!0qQ.A0K(this.A06, gvw.A06) || this.A08 != gvw.A08 || this.A0A != gvw.A0A || this.A07 != gvw.A07 || !0qQ.A0K(this.A03, gvw.A03) || !0qQ.A0K(this.A05, gvw.A05) || this.A09 != gvw.A09 || !0qQ.A0K(this.A01, gvw.A01) || !0qQ.A0K(this.A02, gvw.A02) || this.A0B != gvw.A0B || !0qQ.A0K(this.A00, gvw.A00) || !0qQ.A0K(this.A04, gvw.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A08, AnonymousClass7TE.A0K(this.A06)));
        boolean z = this.A09;
        return ((AnonymousClass7TF.A07(this.A0B, (((AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A09(this.A07, A092) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }
}
