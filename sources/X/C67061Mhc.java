package X;

import android.view.View;

/* renamed from: X.Mhc  reason: case insensitive filesystem */
public abstract class C67061Mhc {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r5.A05 != X.AnonymousClass70M.A05) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r5.A05 != X.AnonymousClass70M.A05) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0173, code lost:
        if (r11.A04() != true) goto L_0x0175;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0iw r15, X.C71662eb r16, X.C67058MhZ r17, X.C74512Pw7 r18, X.C67059Mha r19, X.C66776McM r20, X.C67285MlK r21, java.util.List r22, boolean r23, boolean r24) {
        /*
            r7 = 0
            r5 = r20
            X.0qQ.A0B(r5, r7)
            r4 = 1
            r9 = r16
            r6 = r19
            r10 = r22
            X.DbZ.A0t(r4, r10, r6, r9)
            X.Nof r2 = r5.A01
            boolean r1 = r2 instanceof X.C66695Mb2
            if (r1 == 0) goto L_0x01b6
            r0 = r2
            X.Mb2 r0 = (X.C66695Mb2) r0
            com.instagram.common.typedurl.ImageUrl r3 = r0.A00
            X.9IV r0 = r5.A00
            r6.A02(r0, r15, r3)
        L_0x0020:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r6.A04
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A0L
            if (r0 == 0) goto L_0x0028
            r0.A0M = r4
        L_0x0028:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A0K
            r0.A0M = r4
            X.Nog r11 = r5.A03
            boolean r0 = r11 instanceof X.C66715MbM
            if (r0 == 0) goto L_0x01b1
            r3.setGradientSpinnerVisible(r4)
            X.MbM r11 = (X.C66715MbM) r11
            com.instagram.api.schemas.RingSpec r0 = r11.A00
            X.0qQ.A0B(r0, r7)
            r3.setGradientColor(r0)
            boolean r0 = r11.A01
            r3.setGradientSpinnerActivated(r0)
        L_0x0044:
            if (r24 == 0) goto L_0x004d
            X.70M r12 = r5.A05
            X.70M r11 = X.AnonymousClass70M.A05
            r0 = 1
            if (r12 == r11) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            X.2eb r11 = r6.A01
            if (r0 == 0) goto L_0x016c
            if (r11 == 0) goto L_0x0062
            A01(r11, r7)
            android.view.View r0 = r11.A01()
            com.instagram.ui.widget.emitter.PulseEmitter r0 = (com.instagram.ui.widget.emitter.PulseEmitter) r0
            if (r0 == 0) goto L_0x0062
            r0.A01()
        L_0x0062:
            X.2eb r0 = r6.A02
            if (r0 == 0) goto L_0x0069
            A01(r0, r7)
        L_0x0069:
            if (r1 == 0) goto L_0x0080
            X.Mb2 r2 = (X.C66695Mb2) r2
            if (r2 == 0) goto L_0x0080
            com.instagram.common.typedurl.ImageUrl r1 = r2.A00
            if (r1 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            android.view.View r0 = r0.A01()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r0 = (com.instagram.ui.widget.imageview.PulsingMultiImageView) r0
            if (r0 == 0) goto L_0x0080
            r0.setAnimatingImageUrl(r1, r15)
        L_0x0080:
            if (r24 == 0) goto L_0x0089
            X.70M r1 = r5.A05
            X.70M r0 = X.AnonymousClass70M.A05
            r14 = 1
            if (r1 == r0) goto L_0x008a
        L_0x0089:
            r14 = 0
        L_0x008a:
            X.Noh r2 = r5.A04
            boolean r1 = r2 instanceof X.C66714MbL
            r0 = 0
            if (r1 == 0) goto L_0x0169
            r8 = r2
            X.MbL r8 = (X.C66714MbL) r8
            if (r8 == 0) goto L_0x0169
            com.instagram.model.reels.Reel r11 = r8.A01
        L_0x0098:
            r13 = 1
            X.2eb r12 = r6.A00
            if (r14 == 0) goto L_0x0158
            if (r12 == 0) goto L_0x00a2
            A01(r12, r7)
        L_0x00a2:
            if (r11 == 0) goto L_0x00dd
            X.3NV r14 = r11.A0E()
            boolean r8 = r11.A0j()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r8)
            X.4gL r8 = r11.A0H
            if (r8 == 0) goto L_0x0155
            X.4w0 r8 = r8.A02
            if (r8 == 0) goto L_0x0155
            X.4vt r8 = r8.A0A
            if (r8 == 0) goto L_0x0155
            boolean r8 = r8.CVs()
            if (r8 != r4) goto L_0x0155
        L_0x00c2:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r13)
            X.0eM r8 = r6.A05
            android.view.View r11 = X.AnonymousClass7TE.A0c(r8)
            X.0eM r8 = r6.A06
            java.lang.Object r12 = r8.getValue()
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            X.0eM r8 = r6.A07
            android.widget.TextView r13 = X.JTO.A0I(r8)
            X.C278194wQ.A00(r11, r12, r13, r14, r15, r16)
        L_0x00dd:
            java.lang.String r11 = r5.A06
            r8 = 0
            if (r11 != 0) goto L_0x00e3
            r8 = 2
        L_0x00e3:
            r3.setImportantForAccessibility(r8)
            r3.setContentDescription(r11)
            android.content.Context r11 = r3.getContext()
            r6.A00(r0)
            r6.A01(r0)
            r3.setForeground(r0)
            r12 = r21
            if (r21 == 0) goto L_0x010c
            X.34Y r0 = r12.A02
            if (r0 == 0) goto L_0x0105
            X.MlL r8 = r12.A03
            java.util.Set r0 = r0.A02
            r0.remove(r8)
        L_0x0105:
            java.util.List r0 = r12.A04
            r0.clear()
            r12.A00 = r7
        L_0x010c:
            r9.A02()
            if (r24 == 0) goto L_0x0117
            X.70M r8 = r5.A05
            X.70M r0 = X.AnonymousClass70M.A05
            if (r8 == r0) goto L_0x0128
        L_0x0117:
            X.NpW r8 = r5.A02
            boolean r0 = r8 instanceof X.C66795Mch
            if (r0 == 0) goto L_0x014e
            X.Mch r8 = (X.C66795Mch) r8
            int r0 = r8.A00
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            r6.A00(r0)
        L_0x0128:
            if (r23 != 0) goto L_0x01ef
            r3.setClickable(r4)
            r4 = r18
            if (r1 == 0) goto L_0x013e
            r0 = 16
            X.Ojy r7 = new X.Ojy
            r7.<init>(r0, r4, r5, r6)
        L_0x0138:
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            X.AnonymousClass0fU.A00(r7, r3)
            return
        L_0x013e:
            boolean r0 = r2 instanceof X.C66704MbB
            if (r0 == 0) goto L_0x01ea
            r8 = 7
            X.Ojz r7 = new X.Ojz
            r9 = r17
            r12 = r4
            r11 = r10
            r10 = r5
            r7.<init>((int) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12)
            goto L_0x0138
        L_0x014e:
            if (r8 == 0) goto L_0x0128
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0155:
            r13 = 0
            goto L_0x00c2
        L_0x0158:
            if (r12 == 0) goto L_0x00dd
            boolean r8 = r12.A04()
            if (r8 != r4) goto L_0x00dd
            android.view.View r8 = r12.A01()
            X.AnonymousClass7TH.A0R(r8)
            goto L_0x00dd
        L_0x0169:
            r11 = r0
            goto L_0x0098
        L_0x016c:
            if (r11 == 0) goto L_0x0175
            boolean r1 = r11.A04()
            r0 = 1
            if (r1 == r4) goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            r2 = 8
            if (r0 == 0) goto L_0x018a
            if (r11 == 0) goto L_0x018a
            A01(r11, r2)
            android.view.View r0 = r11.A01()
            com.instagram.ui.widget.emitter.PulseEmitter r0 = (com.instagram.ui.widget.emitter.PulseEmitter) r0
            if (r0 == 0) goto L_0x018a
            r0.A02()
        L_0x018a:
            X.2eb r1 = r6.A02
            if (r1 == 0) goto L_0x01a2
            boolean r0 = r1.A04()
            if (r0 != r4) goto L_0x01a2
            A01(r1, r2)
            android.view.View r0 = r1.A01()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r0 = (com.instagram.ui.widget.imageview.PulsingMultiImageView) r0
            if (r0 == 0) goto L_0x01a2
            r0.A0I()
        L_0x01a2:
            X.2eb r1 = r6.A00
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1.A04()
            if (r0 != r4) goto L_0x0080
            A01(r1, r2)
            goto L_0x0080
        L_0x01b1:
            r3.setGradientSpinnerVisible(r7)
            goto L_0x0044
        L_0x01b6:
            boolean r0 = r2 instanceof X.C66824MdG
            if (r0 == 0) goto L_0x01d5
            r0 = r2
            X.MdG r0 = (X.C66824MdG) r0
            com.instagram.common.typedurl.ImageUrl r12 = r0.A00
            com.instagram.common.typedurl.ImageUrl r11 = r0.A01
            X.9IV r3 = r5.A00
            X.AnonymousClass7TF.A1H(r15, r12)
            X.3oV r0 = r6.A03
            X.C66582MXn.A1G(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A04
            r0.setVisibility(r7)
            r0.A0G(r3, r15, r12, r11)
            goto L_0x0020
        L_0x01d5:
            boolean r0 = r2 instanceof X.C68779NWo
            if (r0 == 0) goto L_0x01e3
            r0 = r2
            X.NWo r0 = (X.C68779NWo) r0
            java.util.List r0 = r0.A00
            r6.A03(r0, r15)
            goto L_0x0020
        L_0x01e3:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A04
            r0.A04()
            goto L_0x0020
        L_0x01ea:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ef:
            r3.setClickable(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67061Mhc.A00(X.0iw, X.2eb, X.MhZ, X.Pw7, X.Mha, X.McM, X.MlK, java.util.List, boolean, boolean):void");
    }

    public static void A01(C71662eb r0, int i) {
        View A01 = r0.A01();
        if (A01 != null) {
            A01.setVisibility(i);
        }
    }
}
