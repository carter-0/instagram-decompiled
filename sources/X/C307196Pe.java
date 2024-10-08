package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Pe  reason: invalid class name and case insensitive filesystem */
public final class C307196Pe implements C307166Pb {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public IgImageView A0A;
    public final C252063oV A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r9 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009e, code lost:
        if (r9 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        r8 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        if (r8 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a8, code lost:
        X.0qQ.A0F("ctaSectionDivider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ac, code lost:
        r6 = r11.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        if (r6 == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b0, code lost:
        r3 = new X.C270354gb();
        r0 = r7.getParent();
        X.0qQ.A0C(r0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        r3.A0I((androidx.constraintlayout.widget.ConstraintLayout) r0);
        r3.A0C(r7.getId(), 3, r10.getId(), 4);
        r3.A0C(r9.getId(), 3, r7.getId(), 4);
        r3.A0C(r8.getId(), 3, r9.getId(), 4);
        r3.A0C(r6.getId(), 3, r8.getId(), 4);
        r0 = r7.getParent();
        X.0qQ.A0C(r0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        r3.A0G((androidx.constraintlayout.widget.ConstraintLayout) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EvG(java.lang.Boolean r12, java.lang.CharSequence r13, java.lang.CharSequence r14) {
        /*
            r11 = this;
            r5 = 0
            if (r13 == 0) goto L_0x0107
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0107
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 == 0) goto L_0x0107
            android.widget.TextView r0 = r11.A07
            java.lang.String r6 = "bodySignalTextView"
            if (r0 == 0) goto L_0x0032
            r0.setVisibility(r5)
            android.widget.TextView r0 = r11.A07
            if (r0 == 0) goto L_0x0032
            r0.setText(r13)
            android.widget.TextView r1 = r11.A07
            if (r1 == 0) goto L_0x0032
            X.3aa r0 = X.C244063aa.CARD_OVERLAY_CAPTION
            X.C244083ac.A05(r1, r0)
            android.view.View r0 = r11.A01
            if (r0 != 0) goto L_0x003a
            java.lang.String r6 = "ctaSectionDivider"
        L_0x0032:
            X.0qQ.A0F(r6)
        L_0x0035:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003a:
            r0.setVisibility(r5)
            android.widget.TextView r0 = r11.A09
            if (r0 == 0) goto L_0x0103
            r0.setVisibility(r5)
            android.widget.TextView r1 = r11.A09
            if (r1 == 0) goto L_0x0103
            X.3aa r0 = X.C244063aa.CARD_OVERLAY_CTA
            X.C244083ac.A05(r1, r0)
            java.lang.String r4 = "ctaSectionDivider"
            java.lang.String r3 = "bottomSignalTextView"
            java.lang.String r2 = "signalsDivider"
            android.widget.TextView r0 = r11.A08
            if (r14 != 0) goto L_0x0078
            if (r0 == 0) goto L_0x00a0
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r11.A03
            if (r0 == 0) goto L_0x00fe
            r0.setVisibility(r1)
            android.widget.TextView r7 = r11.A06
            if (r7 == 0) goto L_0x0075
            android.widget.TextView r10 = r11.A05
            if (r10 == 0) goto L_0x0072
            android.widget.TextView r9 = r11.A07
            if (r9 != 0) goto L_0x00a4
            goto L_0x0032
        L_0x0072:
            java.lang.String r6 = "avatarSubtitleView"
            goto L_0x0032
        L_0x0075:
            java.lang.String r6 = "avatarUrlView"
            goto L_0x0032
        L_0x0078:
            if (r0 == 0) goto L_0x00a0
            r0.setVisibility(r5)
            android.widget.TextView r0 = r11.A08
            if (r0 == 0) goto L_0x00a0
            r0.setText(r14)
            android.widget.TextView r1 = r11.A08
            if (r1 == 0) goto L_0x00a0
            X.3aa r0 = X.C244063aa.CARD_OVERLAY_INFO_LABEL
            X.C244083ac.A05(r1, r0)
            android.view.View r0 = r11.A03
            if (r0 == 0) goto L_0x00fe
            r0.setVisibility(r5)
            android.view.View r7 = r11.A03
            if (r7 == 0) goto L_0x00fe
            android.widget.TextView r10 = r11.A07
            if (r10 == 0) goto L_0x0032
            android.widget.TextView r9 = r11.A08
            if (r9 != 0) goto L_0x00a4
        L_0x00a0:
            X.0qQ.A0F(r3)
            goto L_0x0035
        L_0x00a4:
            android.view.View r8 = r11.A01
            if (r8 != 0) goto L_0x00ac
            X.0qQ.A0F(r4)
            goto L_0x0035
        L_0x00ac:
            android.widget.TextView r6 = r11.A09
            if (r6 == 0) goto L_0x0103
            r5 = 3
            r4 = 4
            X.4gb r3 = new X.4gb
            r3.<init>()
            android.view.ViewParent r0 = r7.getParent()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r0, r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r3.A0I(r0)
            int r1 = r7.getId()
            int r0 = r10.getId()
            r3.A0C(r1, r5, r0, r4)
            int r1 = r9.getId()
            int r0 = r7.getId()
            r3.A0C(r1, r5, r0, r4)
            int r1 = r8.getId()
            int r0 = r9.getId()
            r3.A0C(r1, r5, r0, r4)
            int r1 = r6.getId()
            int r0 = r8.getId()
            r3.A0C(r1, r5, r0, r4)
            android.view.ViewParent r0 = r7.getParent()
            X.0qQ.A0C(r0, r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r3.A0G(r0)
            return
        L_0x00fe:
            X.0qQ.A0F(r2)
            goto L_0x0035
        L_0x0103:
            java.lang.String r6 = "ctaSectionTextView"
            goto L_0x0032
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307196Pe.EvG(java.lang.Boolean, java.lang.CharSequence, java.lang.CharSequence):void");
    }

    public final void CLo() {
        String str;
        TextView textView = this.A07;
        if (textView == null) {
            str = "bodySignalTextView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A08;
            if (textView2 == null) {
                str = "bottomSignalTextView";
            } else {
                textView2.setVisibility(8);
                View view = this.A03;
                if (view == null) {
                    str = "signalsDivider";
                } else {
                    view.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C307196Pe(ViewStub viewStub) {
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A0B = A012;
        A012.EeU(new C307206Pf(this));
    }
}
