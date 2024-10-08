package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4Jn  reason: invalid class name and case insensitive filesystem */
public abstract class C263204Jn {
    /* JADX WARNING: type inference failed for: r9v4, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01d3, code lost:
        if (r11 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        if (X.2R8.A02(r6, r9) == false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r21, X.C243043Xe r22, X.AnonymousClass9NR r23, X.C258243yh r24, java.lang.String r25) {
        /*
            r3 = 0
            r0 = 1
            r7 = r23
            X.0qQ.A0B(r7, r0)
            r1 = 3
            r0 = r25
            X.0qQ.A0B(r0, r1)
            r4 = r24
            android.view.View r1 = r4.A00()
            r0 = 0
            r1.setAlpha(r0)
            X.9Ib r8 = r7.A00
            java.lang.Object r0 = r8.A02
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = r8.A00
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r2 = r0.invoke()
            X.4Wb r2 = (X.C265734Wb) r2
            X.4Wc r10 = new X.4Wc
            r5 = r22
            r10.<init>(r5, r4)
            X.1Xj r9 = r2.A00
            java.lang.String r0 = r9.A0M
            r1 = 1
            r6 = r21
            if (r0 == 0) goto L_0x004a
            boolean r0 = X.2R8.A02(r6, r9)
            r11 = 1
            if (r0 != 0) goto L_0x01c8
        L_0x004a:
            r11 = 0
            boolean r0 = X.AnonymousClass3WS.A08(r6, r9)
            if (r0 == 0) goto L_0x01c8
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder r0 = (com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder) r0
            X.C265764We.A00(r6, r0, r10, r2)
        L_0x005c:
            boolean r0 = X.AnonymousClass3WS.A0A(r6, r9)
            if (r0 == 0) goto L_0x01d7
            X.0eM r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.4WO r0 = (X.AnonymousClass4WO) r0
            X.C265774Wf.A00(r6, r10, r0, r2)
        L_0x006d:
            X.3WT r10 = X.AnonymousClass3WT.CLIPS_SPIN_TEXT
            java.util.List r0 = r9.A3o(r10)
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fc
            X.0eM r0 = r4.A06
            java.lang.Object r13 = r0.getValue()
            X.ACp r13 = (X.C39868ACp) r13
            X.0qQ.A0B(r13, r1)
            java.util.List r0 = r9.A3o(r10)
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r12 = X.00k.A0J(r0)
            X.3ui r12 = (X.C255783ui) r12
            if (r12 == 0) goto L_0x01bf
            X.DV5 r14 = r12.A0F
            if (r14 == 0) goto L_0x01bf
            java.lang.String r11 = r14.getText()
            if (r11 == 0) goto L_0x01bf
            boolean r0 = X.00l.A0W(r11)
            if (r0 != 0) goto L_0x01bf
            X.3oV r0 = r13.A00
            r17 = r0
            android.view.View r0 = r17.getView()
            android.content.Context r16 = r0.getContext()
            android.view.View r9 = r17.getView()
            r0 = 2131430240(0x7f0b0b60, float:1.8482175E38)
            android.view.View r10 = r9.requireViewById(r0)
            X.0qQ.A07(r10)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r10.removeAllViews()
            android.view.View r0 = r17.getView()
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r0)
            r9 = 2131624540(0x7f0e025c, float:1.8876263E38)
            r0 = 0
            android.view.View r9 = r15.inflate(r9, r0, r3)
            r0 = 2131430239(0x7f0b0b5f, float:1.8482173E38)
            android.view.View r15 = r9.findViewById(r0)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0 = r16
            X.6Ly r0 = X.C39603A1t.A00(r0, r14, r6, r11)
            r15.setImageDrawable(r0)
            X.C39868ACp.A00(r9, r6, r13, r12, r2)
            X.AOn r0 = new X.AOn
            r0.<init>(r6, r13, r12, r2)
            r9.addOnLayoutChangeListener(r0)
            r10.addView(r9)
            r0 = r17
            r0.setVisibility(r3)
        L_0x00fc:
            X.4Wg r10 = new X.4Wg
            r10.<init>(r5)
            X.0eM r0 = r4.A05
            java.lang.Object r9 = r0.getValue()
            X.4Wi r9 = (X.C265804Wi) r9
            java.lang.Object r0 = r8.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            X.9JD r0 = (X.AnonymousClass9JD) r0
            r17 = -1
            java.lang.String r15 = "MediaInteractiveViewBinder"
            java.lang.String r16 = "traySessionId"
            r11 = r6
            r12 = r10
            r13 = r9
            r14 = r2
            r18 = r1
            r10 = r0
            X.C265814Wk.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.4Wl r12 = new X.4Wl
            r12.<init>(r5)
            X.0eM r0 = r4.A02
            java.lang.Object r11 = r0.getValue()
            X.4Wn r11 = (X.C265844Wn) r11
            X.0eM r0 = r4.A01
            java.lang.Object r10 = r0.getValue()
            X.4Wp r10 = (X.C265864Wp) r10
            java.lang.String r9 = r7.A02
            java.lang.String r8 = r7.A01
            boolean r0 = r7.A04
            java.util.List r7 = r7.A03
            float r22 = r2.AcY(r6)
            java.lang.String r20 = X.1Xv.A04(r9)
            r13 = 0
            r16 = r12
            r17 = r13
            r18 = r9
            r19 = r8
            r21 = r7
            r23 = r0
            r24 = r1
            r12 = r6
            r14 = r10
            r15 = r11
            X.C265884Wr.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.0rm r9 = new X.0rm
            r9.<init>()
            X.3ui r0 = X.C265894Ws.A00(r2)
            if (r0 == 0) goto L_0x018e
            X.0eM r8 = r4.A00
            java.lang.Object r0 = r8.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r7 = r0.getContext()
            X.0qQ.A07(r7)
            X.6ag r0 = new X.6ag
            r0.<init>(r7, r6)
            r9.A00 = r0
            r0.A01()
            java.lang.Object r7 = r9.A00
            X.6ag r7 = (X.C310256ag) r7
            java.lang.Object r0 = r8.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A05(r0, r2)
        L_0x018e:
            X.4Wt r7 = new X.4Wt
            r7.<init>(r5, r9)
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.4Wv r0 = (X.C265924Wv) r0
            X.C265944Wx.A00(r6, r2, r7, r0, r1)
            X.4Wy r7 = new X.4Wy
            r7.<init>(r5)
            X.0eM r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            X.4X0 r0 = (X.AnonymousClass4X0) r0
            r8 = r6
            r9 = r13
            r10 = r2
            r11 = r7
            r12 = r0
            r13 = r25
            r14 = r1
            r15 = r1
            X.AnonymousClass4X1.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            android.view.View r0 = r4.A00()
            r0.setVisibility(r3)
            return
        L_0x01bf:
            X.3oV r9 = r13.A00
            r0 = 8
            r9.setVisibility(r0)
            goto L_0x00fc
        L_0x01c8:
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder r0 = (com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder) r0
            X.C265764We.A01(r0)
            if (r11 != 0) goto L_0x01d7
            goto L_0x005c
        L_0x01d7:
            X.0eM r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.4WO r0 = (X.AnonymousClass4WO) r0
            X.C265774Wf.A01(r0)
            goto L_0x006d
        L_0x01e4:
            android.view.View r1 = r4.A00()
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263204Jn.A00(com.instagram.common.session.UserSession, X.3Xe, X.9NR, X.3yh, java.lang.String):void");
    }

    public static final boolean A01(UserSession userSession, AnonymousClass9NR r7) {
        List A3o;
        List list;
        List A3o2;
        0qQ.A0B(userSession, 1);
        C376459Ib r1 = r7.A00;
        C265734Wb r4 = (C265734Wb) ((C62320sa) r1.A00).invoke();
        1Xj r3 = r4.A00;
        if (!AnonymousClass3WS.A08(userSession, r3) && !AnonymousClass3WS.A0A(userSession, r3) && (((A3o = r3.A3o(AnonymousClass3WT.CLIPS_SPIN_TEXT)) == null || A3o.isEmpty()) && ((list = (List) ((AnonymousClass9JD) ((C62320sa) r1.A01).invoke()).A01) == null || list.isEmpty()))) {
            if (C289745e8.A00(AnonymousClass3WT.POLLING, r7.A03) == null) {
                C255783ui A00 = C265894Ws.A00(r4);
                C19471WaJ A01 = C265894Ws.A01(r4);
                if ((A00 == null || A01 == null) && ((A3o2 = r3.A3o(AnonymousClass3WT.PROMPT)) == null || A3o2.isEmpty())) {
                    return false;
                }
            }
        }
        return true;
    }
}
