package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

public final class NVH extends P8Z implements C232262tL {
    public 0sP A00 = C74037Po2.A00;
    public final N3F A01;
    public final C72581PBm A02;
    public final C68955Nbe A03;
    public final DirectThreadAnalyticsParams A04;
    public final C60958JuG A05;
    public final PrivacyMediaOverlayViewModel A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final GMQ A0C;
    public final String A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NVH(GMQ gmq, N3F n3f, C72581PBm pBm, C68955Nbe nbe, DirectThreadAnalyticsParams directThreadAnalyticsParams, C60958JuG juG, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(n3f, str, str2);
        0qQ.A0B(num, 7);
        this.A01 = n3f;
        this.A03 = nbe;
        this.A02 = pBm;
        this.A08 = str;
        this.A0D = str2;
        this.A0C = gmq;
        this.A07 = num;
        this.A0B = z;
        this.A06 = privacyMediaOverlayViewModel;
        this.A05 = juG;
        this.A09 = z2;
        this.A0A = z3;
        this.A04 = directThreadAnalyticsParams;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVH) {
                NVH nvh = (NVH) obj;
                if (!0qQ.A0K(this.A01, nvh.A01) || !0qQ.A0K(this.A03, nvh.A03) || !0qQ.A0K(this.A02, nvh.A02) || !0qQ.A0K(this.A08, nvh.A08) || !0qQ.A0K(this.A0D, nvh.A0D) || !0qQ.A0K(this.A0C, nvh.A0C) || this.A07 != nvh.A07 || this.A0B != nvh.A0B || !0qQ.A0K(this.A06, nvh.A06) || !0qQ.A0K(this.A05, nvh.A05) || this.A09 != nvh.A09 || this.A0A != nvh.A0A || !0qQ.A0K(this.A04, nvh.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A05;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int A082 = AnonymousClass7TF.A08(this.A08, (AnonymousClass7TF.A07(this.A03, A0K) + AnonymousClass7TG.A0C(this.A02)) * 31);
        boolean z = this.A0B;
        return AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A08(this.A0D, A082) + AnonymousClass7TG.A0C(this.A0C)) * 31) + C69907Nu9.A00(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31)) + AnonymousClass7TE.A0L(this.A04);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NVH nvh = (NVH) obj;
        0qQ.A0B(nvh, 0);
        N3F n3f = this.A01;
        String str = n3f.A05;
        N3F n3f2 = nvh.A01;
        if (!0qQ.A0K(str, n3f2.A05) || !0qQ.A0K(n3f.A07, n3f2.A07) || n3f.A03 != nvh.A07 || this.A0B != nvh.A0B || !0qQ.A0K(this.A06, nvh.A06) || this.A0A != nvh.A0A || !0qQ.A0K(this.A04, nvh.A04)) {
            return false;
        }
        return true;
    }
}
