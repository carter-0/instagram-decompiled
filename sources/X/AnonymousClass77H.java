package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Deprecated;

/* renamed from: X.77H  reason: invalid class name */
public abstract class AnonymousClass77H {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b8, code lost:
        if (r7.length == 0) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0057, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36329101132316465L) == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r14, X.C242553Us r15, X.C376649Iu r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, com.instagram.common.typedurl.ImageUrl r19, X.AnonymousClass77D r20, X.AnonymousClass77G r21, X.AnonymousClass7L2 r22, java.lang.Integer r23) {
        /*
            r5 = 0
            r7 = r18
            X.0qQ.A0B(r7, r5)
            r4 = 1
            r9 = r14
            X.0qQ.A0B(r14, r4)
            r0 = 4
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r0 = 5
            r6 = r22
            X.0qQ.A0B(r6, r0)
            r0 = 7
            r8 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 9
            r13 = r17
            X.0qQ.A0B(r13, r0)
            X.3v7 r15 = r1.A00
            r2 = r16
            java.lang.Object r10 = r2.A00
            X.OMk r10 = (X.C70815OMk) r10
            java.lang.String r12 = r10.A02
            java.lang.String r1 = r10.A01
            X.Nj6 r11 = r10.A00
            int r0 = A00(r11)
            java.lang.String r3 = r2.A01
            X.DGi r2 = new X.DGi
            r2.<init>(r12, r1, r0, r3)
            r1 = -1
            X.3ed r0 = X.C256013v5.A00
            r12 = r19
            X.3ev r14 = X.C246473ef.A00(r2, r12, r0, r1, r5)
            boolean r0 = r10.A03
            r2 = 1
            if (r0 == 0) goto L_0x0059
            X.0Tu r10 = X.0Tu.A05
            r0 = 36329101132316465(0x81112000003f31, double:3.038008069400942E-306)
            boolean r0 = X.182.A06(r10, r7, r0)
            r18 = 1
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r18 = 0
        L_0x005b:
            X.0Tu r10 = X.0Tu.A05
            r0 = 36328731765194301(0x8110ca00013e3d, double:3.037774480145563E-306)
            boolean r19 = X.182.A06(r10, r7, r0)
            float[] r0 = r8.A01
            X.0qQ.A07(r0)
            r17 = r4
            r16 = r0
            X.C256013v5.A02(r13, r14, r15, r16, r17, r18, r19)
            android.widget.ImageView r1 = r15.A02
            if (r1 == 0) goto L_0x0096
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r7, r0)
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            if (r23 == 0) goto L_0x0135
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r1 = r0.getResources()
            int r0 = r23.intValue()
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x0093:
            r7.setMargins(r5, r0, r5, r5)
        L_0x0096:
            X.Nj6 r0 = X.C69305Nj6.PRIVATE
            if (r11 == r0) goto L_0x009b
            r2 = 0
        L_0x009b:
            r10 = 0
            if (r3 != 0) goto L_0x00d6
            if (r2 != 0) goto L_0x00a6
            r0 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r10 = java.lang.Float.valueOf(r0)
        L_0x00a6:
            com.instagram.direct.model.DirectThreadThemeInfo r3 = r6.A08
            if (r2 == 0) goto L_0x0119
            boolean r1 = X.AnonymousClass3HA.A00(r9)
            X.7Kv r0 = X.C329947Kv.A00
            int[] r7 = r0.A00(r9, r3, r1)
            X.0qQ.A07(r7)
            int r0 = r7.length
            if (r0 != 0) goto L_0x00c6
        L_0x00ba:
            int[] r7 = new int[r4]
            boolean r0 = X.AnonymousClass3HA.A00(r9)
            int r0 = X.C250563lf.A01(r9, r3, r0)
        L_0x00c4:
            r7[r5] = r0
        L_0x00c6:
            r0 = r20
            X.C256013v5.A01(r8, r0, r15, r7, r2)
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r0 = X.2Yu.A0H(r9, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x00d6:
            if (r2 == 0) goto L_0x00fe
            X.7Kz r0 = r6.A06
            int r3 = r0.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            android.widget.TextView r0 = r15.A05
            if (r0 == 0) goto L_0x00fd
            if (r1 == 0) goto L_0x00fd
            r0.setTextColor(r3)
            android.widget.ImageView r0 = r15.A02
            if (r0 == 0) goto L_0x00fd
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            if (r2 == 0) goto L_0x00fd
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r1)
            r2.setColorFilter(r0)
        L_0x00fd:
            return
        L_0x00fe:
            android.widget.TextView r2 = r15.A05
            if (r2 == 0) goto L_0x00fd
            android.content.Context r1 = r2.getContext()
            if (r10 == 0) goto L_0x0114
            int r0 = r10.intValue()
        L_0x010c:
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
            return
        L_0x0114:
            int r0 = X.2Yu.A08(r1)
            goto L_0x010c
        L_0x0119:
            if (r10 == 0) goto L_0x00ba
            int[] r7 = new int[r4]
            boolean r0 = X.AnonymousClass3HA.A00(r9)
            int r3 = X.C250563lf.A01(r9, r3, r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r1 = r9.getColor(r0)
            float r0 = r10.floatValue()
            int r0 = X.2eL.A03(r0, r3, r1)
            goto L_0x00c4
        L_0x0135:
            r0 = 0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77H.A01(android.content.Context, X.3Us, X.9Iu, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.77D, X.77G, X.7L2, java.lang.Integer):void");
    }

    @Deprecated(message = "Use other bindView")
    public static final void A02(C376649Iu r12, AnonymousClass0iw r13, UserSession userSession, AnonymousClass77G r15) {
        0qQ.A0B(r15, 3);
        C256033v7 r7 = r15.A00;
        C70815OMk oMk = (C70815OMk) r12.A00;
        boolean z = false;
        C246633ev A00 = C246473ef.A00(new C45953DGi(oMk.A02, oMk.A01, A00(oMk.A00), r12.A01), (ImageUrl) null, C256013v5.A00, -1, false);
        if (oMk.A03 && 182.A06(0Tu.A05, userSession, 36329101132316465L)) {
            z = true;
        }
        C256013v5.A02(r13, A00, r7, new float[8], true, z, false);
    }

    public static final void A03(AnonymousClass77G r1) {
        0qQ.A0B(r1, 0);
        C256013v5.A03(r1.A00);
    }

    public static final int A00(C69305Nj6 nj6) {
        switch (nj6.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 5;
        }
    }
}
