package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.NYd  reason: case insensitive filesystem */
public final class C68819NYd extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass9IP A00;
    public final AnonymousClass7FT A01;
    public final AnonymousClass7FE A02;
    public final C69611Not A03;
    public final DirectThreadAnalyticsParams A04;
    public final PrivacyMediaOverlayViewModel A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68819NYd) {
                C68819NYd nYd = (C68819NYd) obj;
                if (this.A08 != nYd.A08 || this.A09 != nYd.A09 || !0qQ.A0K(this.A03, nYd.A03) || !0qQ.A0K(this.A00, nYd.A00) || !0qQ.A0K(this.A02, nYd.A02) || !0qQ.A0K(this.A01, nYd.A01) || !0qQ.A0K(this.A06, nYd.A06) || this.A0A != nYd.A0A || this.A07 != nYd.A07 || !0qQ.A0K(this.A05, nYd.A05) || this.A0B != nYd.A0B || !0qQ.A0K(this.A04, nYd.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int BIZ() {
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = this.A05;
        if (privacyMediaOverlayViewModel != null) {
            return privacyMediaOverlayViewModel.A00;
        }
        return 0;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A08);
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A09(this.A09, A052) + AnonymousClass7TG.A0C(this.A03)) * 31));
        int A092 = AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A07(this.A01, A072) + AnonymousClass7TG.A0E(this.A06)) * 31);
        return AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(this.A07, A092) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C68819NYd(AnonymousClass9IP r1, AnonymousClass7FT r2, AnonymousClass7FE r3, C69611Not not, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(r2);
        this.A08 = z;
        this.A09 = z2;
        this.A03 = not;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str;
        this.A0A = z3;
        this.A07 = z4;
        this.A05 = privacyMediaOverlayViewModel;
        this.A0B = z5;
        this.A04 = directThreadAnalyticsParams;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
