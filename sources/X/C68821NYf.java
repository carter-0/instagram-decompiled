package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NYf  reason: case insensitive filesystem */
public final class C68821NYf extends AnonymousClass7FV implements AnonymousClass7FW {
    public final int A00;
    public final AnonymousClass77B A01;
    public final C328667Fr A02;
    public final DirectThreadAnalyticsParams A03;
    public final PrivacyMediaOverlayViewModel A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68821NYf(AnonymousClass77B r2, C328667Fr r3, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(r3.A0B);
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A05 = z;
        this.A01 = r2;
        this.A06 = z2;
        this.A04 = privacyMediaOverlayViewModel;
        this.A07 = z3;
        this.A00 = i;
        this.A08 = z4;
        this.A03 = directThreadAnalyticsParams;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68821NYf) {
                C68821NYf nYf = (C68821NYf) obj;
                if (!(0qQ.A0K(this.A02, nYf.A02) && this.A05 == nYf.A05 && 0qQ.A0K(this.A01, nYf.A01) && this.A06 == nYf.A06 && 0qQ.A0K(this.A04, nYf.A04) && this.A07 == nYf.A07 && this.A00 == nYf.A00 && this.A08 == nYf.A08 && 0qQ.A0K(this.A03, nYf.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A02);
        boolean z = this.A06;
        boolean z2 = this.A07;
        return AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A09(z2, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A09(this.A05, A0K) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public static C328667Fr A00(Iterator it) {
        return ((C68821NYf) it.next()).A02;
    }

    public static C328667Fr A01(List list, int i) {
        return ((C68821NYf) list.get(i)).A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
