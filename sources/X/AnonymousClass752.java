package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.752  reason: invalid class name */
public final class AnonymousClass752 extends AnonymousClass7FV implements AnonymousClass7FF, AnonymousClass7FW {
    public final int A00;
    public final AnonymousClass77B A01;
    public final AnonymousClass7FE A02;
    public final C328667Fr A03;
    public final AnonymousClass755 A04;
    public final AnonymousClass75J A05;
    public final DirectThreadAnalyticsParams A06;
    public final PrivacyMediaOverlayViewModel A07;
    public final 1Xj A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final /* synthetic */ AnonymousClass7FE A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass752) {
                AnonymousClass752 r5 = (AnonymousClass752) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A09, r5.A09) || this.A00 != r5.A00 || !0qQ.A0K(this.A05, r5.A05) || this.A0A != r5.A0A || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07) || this.A0B != r5.A0B || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass752(AnonymousClass77B r2, C328667Fr r3, AnonymousClass755 r4, AnonymousClass75J r5, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, 1Xj r8, String str, int i, boolean z, boolean z2) {
        super(r3.A0B);
        AnonymousClass7FE r0 = r3.A0C;
        this.A0C = r0;
        this.A04 = r4;
        this.A03 = r3;
        this.A09 = str;
        this.A00 = i;
        this.A05 = r5;
        this.A0A = z;
        this.A08 = r8;
        this.A01 = r2;
        this.A07 = privacyMediaOverlayViewModel;
        this.A0B = z2;
        this.A06 = directThreadAnalyticsParams;
        this.A02 = r0;
    }

    public final boolean CUQ() {
        return this.A0C.A00;
    }

    public final boolean CUR() {
        return this.A0C.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        AnonymousClass755 r0 = this.A04;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode6 = ((((((hashCode * 31) + this.A03.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A00) * 31;
        AnonymousClass75J r02 = this.A05;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        1Xj r03 = this.A08;
        if (r03 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r03.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        AnonymousClass77B r04 = this.A01;
        if (r04 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r04.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = this.A07;
        if (privacyMediaOverlayViewModel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = privacyMediaOverlayViewModel.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        DirectThreadAnalyticsParams directThreadAnalyticsParams = this.A06;
        if (directThreadAnalyticsParams != null) {
            i = directThreadAnalyticsParams.hashCode();
        }
        return i9 + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
