package X;

import android.view.View;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.3N0  reason: invalid class name */
public final class AnonymousClass3N0 {
    public final View A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1 != null) goto L_0x0014;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A00() {
        /*
            r3 = this;
            X.0eM r0 = r3.A03
            java.lang.Object r2 = r0.getValue()
            X.3N9 r2 = (X.AnonymousClass3N9) r2
            com.instagram.ui.widget.imageview.PulsingMultiImageView r1 = r2.A0B
            X.3NU r0 = r2.A09
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0018
        L_0x0014:
            X.0qQ.A07(r1)
            return r1
        L_0x0018:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A0L
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3N0.A00():android.view.View");
    }

    public final ReelBrandingBadgeView A01() {
        AnonymousClass0eM r1 = this.A01;
        if (((C252063oV) r1.getValue()).CVM()) {
            return (ReelBrandingBadgeView) ((C252063oV) r1.getValue()).getView();
        }
        return null;
    }

    public final GradientSpinner A02() {
        GradientSpinner gradientSpinner = ((AnonymousClass3N9) this.A03.getValue()).A0O;
        0qQ.A06(gradientSpinner);
        return gradientSpinner;
    }

    public AnonymousClass3N0(View view) {
        this.A00 = view;
        this.A03 = AnonymousClass0eN.A01(new C377079Kl(view, 29));
        this.A02 = AnonymousClass0eN.A01(new C377079Kl(view, 28));
        this.A04 = AnonymousClass0eN.A01(new C377079Kl(view, 30));
        this.A09 = AnonymousClass0eN.A01(new C377079Kl(view, 35));
        this.A05 = AnonymousClass0eN.A01(new C377079Kl(view, 31));
        this.A01 = AnonymousClass0eN.A01(new C377079Kl(view, 27));
        this.A0C = AnonymousClass0eN.A01(new C377079Kl(view, 26));
        this.A08 = AnonymousClass0eN.A01(new C377079Kl(view, 34));
        this.A07 = AnonymousClass0eN.A01(new C377079Kl(view, 33));
        this.A0B = AnonymousClass0eN.A01(new C377079Kl(view, 37));
        this.A0A = AnonymousClass0eN.A01(new C377079Kl(view, 36));
        this.A06 = AnonymousClass0eN.A01(new C377079Kl(view, 32));
    }
}
