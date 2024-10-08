package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.4tw  reason: invalid class name and case insensitive filesystem */
public final class C276814tw {
    public static final C276814tw A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026f, code lost:
        r5.removeCallbacks(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0272, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f7, code lost:
        r5.setTag(r1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0416, code lost:
        r2.post(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C307786Rm r12, X.C276544tV r13, X.C276544tV r14, java.lang.Object r15) {
        /*
            r11 = this;
            r7 = r13
            r5 = r15
            int r1 = r13.A04
            boolean r0 = X.C250563lf.A0l(r1)
            if (r0 == 0) goto L_0x0419
            android.view.View r5 = (android.view.View) r5
            switch(r1) {
                case 13313: goto L_0x03be;
                case 13337: goto L_0x03a7;
                case 13383: goto L_0x037a;
                case 13394: goto L_0x0343;
                case 13538: goto L_0x02e3;
                case 13565: goto L_0x0419;
                case 13566: goto L_0x03f4;
                case 13615: goto L_0x029d;
                case 13627: goto L_0x0273;
                case 13638: goto L_0x03e8;
                case 13656: goto L_0x0255;
                case 13688: goto L_0x0208;
                case 13712: goto L_0x01f3;
                case 13713: goto L_0x01c2;
                case 13748: goto L_0x0419;
                case 13762: goto L_0x01a4;
                case 13768: goto L_0x0187;
                case 13774: goto L_0x015f;
                case 13914: goto L_0x0144;
                case 13981: goto L_0x03ec;
                case 14001: goto L_0x00f3;
                case 15833: goto L_0x03fc;
                case 15909: goto L_0x0419;
                case 16123: goto L_0x00e2;
                case 16310: goto L_0x003f;
                case 16375: goto L_0x0419;
                case 16409: goto L_0x0032;
                case 16485: goto L_0x00ca;
                case 16493: goto L_0x0419;
                case 16515: goto L_0x00c1;
                case 16529: goto L_0x00a5;
                case 16792: goto L_0x0086;
                case 16807: goto L_0x0419;
                case 16906: goto L_0x0023;
                case 16913: goto L_0x006d;
                case 16932: goto L_0x0060;
                case 16952: goto L_0x004e;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            r0.getClass()
            X.VZ1 r0 = (X.VZ1) r0
            android.os.Handler r2 = X.VJN.A00
            java.lang.Runnable r0 = r0.A03
            goto L_0x0416
        L_0x0032:
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            r0.getClass()
            X.XU2 r0 = (X.XU2) r0
            r0.A01()
            return
        L_0x003f:
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            r0.getClass()
            X.Tyw r0 = (X.C14592Tyw) r0
            android.os.Handler r2 = X.C14595Tyz.A00
            java.lang.Runnable r0 = r0.A02
            goto L_0x0416
        L_0x004e:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 2131428755(0x7f0b0593, float:1.8479163E38)
            r1 = 0
            r5.setTag(r0, r1)
            r0 = 2131428754(0x7f0b0592, float:1.8479161E38)
            r5.setTag(r0, r1)
            return
        L_0x0060:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r0 = r5 instanceof com.facebook.rendercore.text.RCTextView
            if (r0 == 0) goto L_0x0419
            r1 = 2131428755(0x7f0b0593, float:1.8479163E38)
            goto L_0x03f7
        L_0x006d:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            boolean r0 = r13.A0T(r0)
            if (r0 == 0) goto L_0x0419
            boolean r0 = r5 instanceof X.C13427TaD
            if (r0 == 0) goto L_0x0419
            X.TaD r5 = (X.C13427TaD) r5
            r0 = 0
            com.facebook.primitive.textinput.TextInputView r5 = (com.facebook.primitive.textinput.TextInputView) r5
            r5.A02 = r0
            r5.A00 = r0
            return
        L_0x0086:
            java.lang.Object r5 = X.C307476Qg.A06(r12, r13)
            X.LAA r5 = (X.LAA) r5
            if (r5 == 0) goto L_0x0419
            X.4Cq r4 = r5.A06
            r3 = 0
            r0 = 47
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r0 = X.1Eo.A03(r0, r1, r2, r4)
            r5.A02 = r0
            r5.A01 = r3
            return
        L_0x00a5:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r1 = 1
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            r0.getClass()
            X.Evh r0 = (X.C49441Evh) r0
            java.lang.Runnable r2 = r0.A00
            boolean r0 = r2 instanceof X.C67607Mqf
            if (r0 == 0) goto L_0x026f
            r0 = r2
            X.Mqf r0 = (X.C67607Mqf) r0
            if (r0 == 0) goto L_0x026f
            r0.A00 = r1
            return
        L_0x00c1:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r1 = 2131428763(0x7f0b059b, float:1.847918E38)
            goto L_0x03f7
        L_0x00ca:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.2nJ r0 = r12.A02
            X.2nI r0 = (X.C229382nI) r0
            X.0lg r0 = r0.A06
            X.0qQ.A07(r0)
            X.3Dp r0 = X.C238833Dp.A00(r0)
            X.0qQ.A07(r0)
            r0.A04(r5)
            return
        L_0x00e2:
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            X.Et5 r0 = (X.Et5) r0
            r1 = 0
            if (r0 == 0) goto L_0x00f0
            X.8Qm r0 = r0.A00
            r0.A0A(r1)
        L_0x00f0:
            X.C16714V2x.A02 = r1
            return
        L_0x00f3:
            java.lang.Object r2 = X.C307476Qg.A06(r12, r13)
            X.XbG r2 = (X.XbG) r2
            if (r2 == 0) goto L_0x0419
            r1 = 0
            X.03v.A0B(r5, r1)
            java.lang.String r0 = r2.A03
            r5.setContentDescription(r0)
            java.lang.Integer r0 = r2.A00
            int r0 = r0.intValue()
            r5.setImportantForAccessibility(r0)
            java.lang.Integer r0 = r2.A01
            int r0 = r0.intValue()
            r5.setAccessibilityLiveRegion(r0)
            boolean r0 = r2.A05
            r5.setFocusable(r0)
            boolean r0 = r2.A08
            r5.setSelected(r0)
            boolean r0 = r2.A04
            r5.setEnabled(r0)
            boolean r0 = r2.A06
            X.03v.A0I(r5, r0)
            boolean r0 = r2.A07
            X.03v.A0J(r5, r0)
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0136
            r5.setOnLongClickListener(r1)
        L_0x0136:
            r0 = 56
            java.util.List r0 = r13.A0N(r0)
            X.C7213Pzh.A00(r12, r14, r0)
            r0 = -1
            r5.setLabelFor(r0)
            return
        L_0x0144:
            r0 = 43
            X.4uI r2 = r13.A0A(r0)
            if (r2 == 0) goto L_0x0419
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A01(r14)
            java.util.List r1 = r0.A00
            X.6Tm r0 = new X.6Tm
            r0.<init>(r1)
            X.C307886Rw.A03(r12, r13, r0, r2)
            return
        L_0x015f:
            java.lang.Object r2 = X.C307476Qg.A06(r12, r13)
            X.TzG r2 = (X.C14609TzG) r2
            if (r2 == 0) goto L_0x0419
            X.Tz8 r1 = r2.A00
            if (r1 != 0) goto L_0x016f
            r0 = 0
            r2.A01 = r0
            return
        L_0x016f:
            boolean r0 = r1.A00
            r2.A01 = r0
            java.util.List r0 = r1.A03
            r0.clear()
            android.view.View r0 = r1.A02
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0183
            r0.removeOnGlobalLayoutListener(r1)
        L_0x0183:
            r0 = 0
            r2.A00 = r0
            return
        L_0x0187:
            java.lang.Object r1 = X.C307476Qg.A06(r12, r13)
            X.W7j r1 = (X.W7j) r1
            if (r1 == 0) goto L_0x0419
            java.lang.Object r0 = X.C307476Qg.A06(r12, r14)
            X.GbJ r0 = (X.C52706GbJ) r0
            if (r0 == 0) goto L_0x019a
            r0.A05(r1)
        L_0x019a:
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
            r1.A03 = r0
            r1.A01 = r0
            return
        L_0x01a4:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            X.VL2 r0 = (X.VL2) r0
            if (r0 == 0) goto L_0x0419
            android.view.View$OnLayoutChangeListener r0 = r0.A00
            r5.removeOnLayoutChangeListener(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            r0 = 0
            r5.setTranslationY(r0)
            return
        L_0x01c2:
            java.lang.Object r2 = X.C307476Qg.A06(r12, r13)
            X.OFq r2 = (X.C70669OFq) r2
            if (r2 == 0) goto L_0x01eb
            android.text.TextWatcher r0 = r2.A02
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r1 = X.C307476Qg.A06(r12, r14)
            X.GbJ r1 = (X.C52706GbJ) r1
            if (r1 == 0) goto L_0x01dd
            android.text.TextWatcher r0 = r2.A02
            if (r0 == 0) goto L_0x01e3
            r1.A05(r0)
        L_0x01dd:
            r0 = 0
            r2.A03 = r0
            r2.A04 = r0
            return
        L_0x01e3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x01eb:
            java.lang.String r0 = "TextInputNumberFormatterExtensionBinder defines a controller but none was found"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x01f3:
            r0 = 0
            r5.setOnTouchListener(r0)
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            r0.getClass()
            X.Hhs r0 = (X.C55448Hhs) r0
            X.4rx r0 = r0.A00
            if (r0 == 0) goto L_0x0419
            r0.dismiss()
            return
        L_0x0208:
            java.lang.Object r4 = X.C307476Qg.A06(r12, r13)
            X.6Th r4 = (X.C308246Th) r4
            if (r4 != 0) goto L_0x0218
            java.lang.String r1 = "ViewTransformsExtensionBinderUtils"
            java.lang.String r0 = "Null controller while binding ViewTransformsExtension"
            X.1Kn.A02(r1, r0)
            return
        L_0x0218:
            r0 = 0
            r4.A0E = r0
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r4.A0C
            r1.removeOnPreDrawListener(r0)
            r0 = 0
            r4.A0B = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r3)
            r2 = 0
            r5.setRotation(r2)
            r5.setRotationX(r2)
            r5.setRotationY(r2)
            android.content.Context r1 = r12.A00
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = X.AnonymousClass6Tj.A00(r1, r0)
            r5.setCameraDistance(r0)
            r5.setTranslationX(r2)
            r5.setTranslationY(r2)
            r5.setScaleX(r3)
            r5.setScaleY(r3)
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0419
            r5.resetPivot()
            return
        L_0x0255:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 2131439828(0x7f0b30d4, float:1.8501622E38)
            java.lang.Object r2 = r5.getTag(r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            boolean r0 = r2 instanceof X.C67607Mqf
            if (r0 == 0) goto L_0x026f
            r1 = r2
            X.Mqf r1 = (X.C67607Mqf) r1
            if (r1 == 0) goto L_0x026f
            r0 = 1
            r1.A00 = r0
            return
        L_0x026f:
            r5.removeCallbacks(r2)
            return
        L_0x0273:
            java.lang.Object r4 = X.C307476Qg.A06(r12, r13)
            X.FXh r4 = (X.C50302FXh) r4
            r4.getClass()
            X.C308206Td.A0J(r12, r4)
            X.VvH r0 = r4.A03
            r3 = 0
            if (r0 == 0) goto L_0x0289
            r0.A01()
            r4.A03 = r3
        L_0x0289:
            X.27S r2 = r4.A01
            if (r2 == 0) goto L_0x0419
            X.0lg r0 = X.C308206Td.A0A(r12)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.FWT> r0 = X.FWT.class
            r1.A02(r2, r0)
            r4.A01 = r3
            return
        L_0x029d:
            r5 = 1
            java.lang.Object r4 = X.C307476Qg.A06(r12, r13)
            X.OFp r4 = (X.C70668OFp) r4
            if (r4 == 0) goto L_0x02db
            android.text.TextWatcher r2 = r4.A02
            r3 = 0
            if (r2 == 0) goto L_0x02b8
            java.lang.Object r1 = X.C307476Qg.A06(r12, r14)
            boolean r0 = r1 instanceof X.C52706GbJ
            if (r0 == 0) goto L_0x02bd
            X.GbJ r1 = (X.C52706GbJ) r1
            r1.A05(r2)
        L_0x02b8:
            r4.A03 = r3
            r4.A04 = r3
            return
        L_0x02bd:
            if (r1 == 0) goto L_0x02d8
            java.lang.String r2 = "Unrecognized controller type: "
            java.lang.Class r1 = r1.getClass()
            java.util.Map r0 = X.0Yh.A03
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = X.0q1.A01(r1)
            java.lang.String r1 = X.002.A0R(r2, r0)
        L_0x02d2:
            java.lang.String r0 = "TextInputCurrencyFormatterExtensionBinderUtils"
            X.1Kn.A00(r12, r0, r1, r3)
            goto L_0x02b8
        L_0x02d8:
            java.lang.String r1 = "Missing text input controller"
            goto L_0x02d2
        L_0x02db:
            java.lang.String r1 = "TextInputCurrencyFormatterExtensionBinder defines a controller but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02e3:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r6 = X.C307476Qg.A06(r12, r13)
            X.Tr3 r6 = (X.C14165Tr3) r6
            if (r6 == 0) goto L_0x033b
            int r10 = r14.A03
            android.util.SparseArray r2 = r6.A01
            java.lang.Object r9 = r2.get(r10)
            java.util.Set r9 = (java.util.Set) r9
            if (r9 == 0) goto L_0x0419
            android.util.SparseArray r0 = r6.A00
            r0.get(r10)
            int r1 = r9.size()
            r0 = 1
            if (r1 != r0) goto L_0x0337
            X.2el r8 = X.C308206Td.A0D(r12)
            if (r8 == 0) goto L_0x0330
            X.2et r0 = r8.A01
            if (r0 == 0) goto L_0x032b
            X.2er r0 = r0.A02
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x032b
            X.TrN r4 = new X.TrN
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.util.LinkedHashMap r1 = r8.A03
            monitor-enter(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0328 }
            r1.put(r0, r4)     // Catch:{ all -> 0x0328 }
            monitor-exit(r1)     // Catch:{ all -> 0x0328 }
            return
        L_0x0328:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0328 }
            throw r2
        L_0x032b:
            X.30Y r0 = X.AnonymousClass30Y.A07
            r8.A05(r5, r0)
        L_0x0330:
            r9.remove(r13)
            r2.remove(r10)
            return
        L_0x0337:
            r9.remove(r13)
            return
        L_0x033b:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0343:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = X.C307476Qg.A06(r12, r13)
            if (r0 == 0) goto L_0x0372
            X.01c r3 = X.C299225um.A00
            int r0 = r14.A03
            long r1 = (long) r0
            java.lang.Object r0 = r3.A05(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0419
            r0.remove(r13)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0419
            r3.A08(r1)
            X.2el r1 = X.C308206Td.A0D(r12)
            if (r1 == 0) goto L_0x0419
            X.30Y r0 = X.AnonymousClass30Y.A07
            r1.A05(r5, r0)
            return
        L_0x0372:
            java.lang.String r1 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x037a:
            java.lang.Class<X.2kt> r2 = X.C228162kt.class
            r1 = 2131435801(0x7f0b2119, float:1.8493454E38)
            r0 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            java.lang.Object r0 = r12.A00(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r2 = r2.cast(r0)
            X.2kt r2 = (X.C228162kt) r2
            java.lang.Object r1 = X.C307476Qg.A06(r12, r13)
            X.EtI r1 = (X.EtI) r1
            if (r2 == 0) goto L_0x0419
            if (r1 == 0) goto L_0x0419
            X.3je r0 = r1.A00
            if (r0 == 0) goto L_0x0419
            r2.FJ2(r0)
            r0 = 0
            r1.A00 = r0
            return
        L_0x03a7:
            java.lang.Object r1 = X.C307476Qg.A06(r12, r13)
            X.I9n r1 = (X.C56727I9n) r1
            if (r1 == 0) goto L_0x0419
            r0 = 0
            r1.A00 = r0
            java.lang.Object r0 = X.C307476Qg.A06(r12, r14)
            X.GbJ r0 = (X.C52706GbJ) r0
            if (r0 == 0) goto L_0x0419
            r0.A05(r1)
            return
        L_0x03be:
            java.lang.Object r1 = X.C307476Qg.A06(r12, r13)
            X.5ug r1 = (X.C299165ug) r1
            if (r1 == 0) goto L_0x0419
            boolean r0 = r5.isFocused()
            r1.A02 = r0
            r0 = 0
            X.03v.A0B(r5, r0)
            java.lang.Integer r0 = r1.A00
            int r0 = r0.intValue()
            r5.setImportantForAccessibility(r0)
            boolean r0 = r1.A01
            r5.setFocusable(r0)
            r0 = 45
            java.util.List r0 = r13.A0N(r0)
            X.C7213Pzh.A00(r12, r14, r0)
            return
        L_0x03e8:
            X.C49740F4f.A01(r5, r12, r13)
            return
        L_0x03ec:
            r0 = 0
            r5.setOnTouchListener(r0)
            r5.setOnKeyListener(r0)
            return
        L_0x03f4:
            r1 = 2131442565(0x7f0b3b85, float:1.8507173E38)
        L_0x03f7:
            r0 = 0
            r5.setTag(r1, r0)
            return
        L_0x03fc:
            r2 = 0
            r5.setOnTouchListener(r2)
            r5.setOnKeyListener(r2)
            java.lang.Object r1 = X.C307476Qg.A06(r12, r13)
            r1.getClass()
            X.6Oi r1 = (X.C306976Oi) r1
            X.6Om r0 = r1.A01
            if (r0 == 0) goto L_0x0412
            r0.A01 = r2
        L_0x0412:
            android.os.Handler r2 = X.C307006Ol.A00
            java.lang.Runnable r0 = r1.A03
        L_0x0416:
            r2.post(r0)
        L_0x0419:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276814tw.A02(X.6Rm, X.4tV, X.4tV, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.V8q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.V8p, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v15, types: [X.XYv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v24, types: [X.6Th, java.lang.Object] */
    public final Object A00(C307786Rm r5, C276544tV r6) {
        int i = r6.A04;
        if (!C250563lf.A0l(i)) {
            return null;
        }
        switch (i) {
            case 13313:
                return new Object();
            case 13337:
                String A0D = r6.A0D();
                if (A0D == null || A0D.length() <= 0) {
                    return null;
                }
                return new C56727I9n(A0D);
            case 13383:
                return new Object();
            case 13394:
                return C299225um.A01;
            case 13538:
                C14165Tr3 tr3 = C16710V2t.A00;
                if (tr3 != null) {
                    return tr3;
                }
                C14165Tr3 tr32 = new C14165Tr3(new Object(), new Object());
                C16710V2t.A00 = tr32;
                return tr32;
            case 13565:
            case 13566:
            case 13656:
            case 15909:
            case 16375:
            case 16485:
            case 16493:
            case 16515:
            case 16913:
            case 16932:
            case 16952:
                return null;
            case 13615:
                return new C70668OFp();
            case 13627:
                return new C50302FXh(r5, r6, 0Gl.A01(C308206Td.A0A(r5)));
            case 13638:
                return new Object();
            case 13688:
                ? obj = new Object();
                C308246Th.A00(r6, obj);
                return obj;
            case 13712:
                return new Object();
            case 13713:
                return new C70669OFq();
            case 13748:
                C277014uI A0A = r6.A0A(35);
                if (A0A != null) {
                    return new EE5(r5, r6, A0A);
                }
                1Kn.A02("IgShopsScreenLifecycleExtensionBinderUtils", "Expected onExit expression in this extension");
                return null;
            case 13762:
                return new Object();
            case 13768:
                return new W7j();
            case 13774:
                return new C14609TzG();
            case 13914:
                ? obj2 = new Object();
                obj2.A00 = false;
                return obj2;
            case 13981:
                return new C46599Dhf();
            case 14001:
                return new Object();
            case 15833:
                return new C306976Oi();
            case 16123:
                return new Et5(new C355568Qm(new U9X(r5, r6)));
            case 16310:
                return new C14592Tyw(r5, r6);
            case 16409:
                0lg A0A2 = C308206Td.A0A(r5);
                Context context = r5.A00;
                C57089IOd iOd = new C57089IOd(r5, r6);
                if (A0A2 != null) {
                    return new NQM(context, iOd, A0A2);
                }
                return new Object();
            case 16529:
                return new Object();
            case 16792:
                C17843Vgw vgw = C17843Vgw.A03;
                if (vgw == null) {
                    vgw = new C17843Vgw();
                    C17843Vgw.A03 = vgw;
                }
                return new LAA(vgw, AnonymousClass1HX.A01(1749652546, 3));
            case 16807:
                return new C45263CtR(r5.A00);
            case 16906:
                return new VZ1((C307756Ri) r5.A01.get(R.id.bloks_ig_scrollable_navigation_helper), r5);
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0535, code lost:
        r2.setOnKeyListener(new X.C307036Oo(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x053d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x070b, code lost:
        X.1Kn.A02(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x070e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0793, code lost:
        r2.setTag(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0796, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08ab, code lost:
        r2.setTag(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x08ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0ae5, code lost:
        r0 = (X.C52706GbJ) X.C307476Qg.A06(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0aeb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0aed, code lost:
        r0.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0af0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0b4b, code lost:
        X.C7213Pzh.A01(r3, r5, r1.A0N(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0b52, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0299, code lost:
        r0.A05(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0846  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x085b  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0875  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0891  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C307786Rm r22, X.C276544tV r23, X.C276544tV r24, java.lang.Object r25) {
        /*
            r21 = this;
            r1 = r23
            r2 = r25
            int r4 = r1.A04
            boolean r0 = X.C250563lf.A0l(r4)
            if (r0 == 0) goto L_0x0c94
            android.view.View r2 = (android.view.View) r2
            r3 = r22
            r5 = r24
            switch(r4) {
                case 13313: goto L_0x0af9;
                case 13337: goto L_0x0aaf;
                case 13383: goto L_0x0a6e;
                case 13394: goto L_0x0993;
                case 13538: goto L_0x090e;
                case 13565: goto L_0x08af;
                case 13566: goto L_0x08a2;
                case 13615: goto L_0x0797;
                case 13627: goto L_0x0c84;
                case 13638: goto L_0x0c80;
                case 13656: goto L_0x0763;
                case 13688: goto L_0x06ff;
                case 13712: goto L_0x00db;
                case 13713: goto L_0x0655;
                case 13748: goto L_0x0646;
                case 13762: goto L_0x05ff;
                case 13768: goto L_0x05be;
                case 13774: goto L_0x058a;
                case 13914: goto L_0x053e;
                case 13981: goto L_0x0524;
                case 14001: goto L_0x0393;
                case 15833: goto L_0x0080;
                case 15909: goto L_0x02f3;
                case 16123: goto L_0x02e1;
                case 16310: goto L_0x0029;
                case 16375: goto L_0x02ac;
                case 16409: goto L_0x0c88;
                case 16485: goto L_0x026a;
                case 16493: goto L_0x021c;
                case 16515: goto L_0x01ff;
                case 16529: goto L_0x01c7;
                case 16792: goto L_0x0185;
                case 16807: goto L_0x013b;
                case 16906: goto L_0x0bbc;
                case 16913: goto L_0x0b55;
                case 16932: goto L_0x010f;
                case 16952: goto L_0x00ed;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0029:
            java.lang.Object r8 = X.C307476Qg.A06(r3, r1)
            r8.getClass()
            X.Tyw r8 = (X.C14592Tyw) r8
            android.os.Handler r2 = X.C14595Tyz.A00
            java.lang.Runnable r0 = r8.A02
            r2.removeCallbacks(r0)
            r0 = 41
            java.lang.Object r7 = X.C276544tV.A00(r1, r0)
            r0 = 42
            r6 = 1
            boolean r2 = r1.A0R(r0, r6)
            boolean r0 = r8.A01
            r5 = 0
            if (r0 != 0) goto L_0x004d
            if (r2 == 0) goto L_0x007b
        L_0x004d:
            java.lang.Object r0 = r8.A00
            boolean r0 = X.Q06.A00(r7, r0)
            if (r0 != 0) goto L_0x007b
            r8.A00()
            r0 = 35
            X.4uI r4 = r1.A0A(r0)
            if (r4 == 0) goto L_0x007b
            X.6Tl r2 = new X.6Tl
            r2.<init>()
            r2.A03(r3, r5)
            java.lang.Object r0 = r8.A00
            r2.A03(r0, r6)
            r0 = 2
            r2.A03(r7, r0)
            java.util.List r2 = r2.A00
            X.6Tm r0 = new X.6Tm
            r0.<init>(r2)
            X.C307886Rw.A03(r3, r1, r0, r4)
        L_0x007b:
            r8.A00 = r7
            r8.A01 = r6
            return
        L_0x0080:
            java.lang.Object r4 = X.C307476Qg.A06(r3, r1)
            r4.getClass()
            X.6Oi r4 = (X.C306976Oi) r4
            android.os.Handler r6 = X.C307006Ol.A00
            java.lang.Runnable r0 = r4.A03
            r6.removeCallbacks(r0)
            r0 = 67
            r8 = 0
            boolean r7 = r1.A0R(r0, r8)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x00be
            X.6Om r6 = new X.6Om
            r6.<init>(r3, r1, r5)
            android.content.Context r0 = r3.A00
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r0, r6)
            android.view.ScaleGestureDetector r1 = new android.view.ScaleGestureDetector
            r1.<init>(r0, r6)
            r1.setQuickScaleEnabled(r8)
            r1.setStylusScaleEnabled(r8)
            r4.A01 = r6
            X.6On r0 = new X.6On
            r0.<init>(r3, r1, r6, r7)
            r4.A00 = r0
            r0 = 1
            r4.A02 = r0
        L_0x00be:
            X.6Om r0 = r4.A01
            if (r0 == 0) goto L_0x00c4
            r0.A01 = r2
        L_0x00c4:
            if (r7 == 0) goto L_0x00d4
            boolean r0 = r2 instanceof X.C273704n3
            if (r0 == 0) goto L_0x00d4
            r1 = r2
            X.4n3 r1 = (X.C273704n3) r1
            X.XyZ r0 = new X.XyZ
            r0.<init>(r4)
            r1.A00 = r0
        L_0x00d4:
            X.6On r0 = r4.A00
            r2.setOnTouchListener(r0)
            goto L_0x0535
        L_0x00db:
            java.lang.Object r4 = X.C307476Qg.A06(r3, r1)
            r4.getClass()
            X.Hhs r4 = (X.C55448Hhs) r4
            X.IDa r0 = new X.IDa
            r0.<init>(r4, r3, r1, r5)
            r2.setOnTouchListener(r0)
            return
        L_0x00ed:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r4 = 0
            r0 = 35
            java.lang.String r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x00fb
            r4 = r0
        L_0x00fb:
            X.0qQ.A07(r4)
            r0 = 36
            java.lang.Object r3 = X.C276544tV.A00(r1, r0)
            r0 = 2131428755(0x7f0b0593, float:1.8479163E38)
            r2.setTag(r0, r4)
            r0 = 2131428754(0x7f0b0592, float:1.8479161E38)
            goto L_0x0793
        L_0x010f:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r3 = 0
            r0 = 35
            java.lang.String r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x011d
            r3 = r0
        L_0x011d:
            X.0qQ.A07(r3)
            boolean r0 = r2 instanceof com.facebook.rendercore.text.RCTextView
            if (r0 == 0) goto L_0x0129
            r0 = 2131428755(0x7f0b0593, float:1.8479163E38)
            goto L_0x0793
        L_0x0129:
            java.lang.String r3 = "BKBloksExtensionRendervalidationShowreelDynamicTextV2BinderUtil"
            java.lang.String r1 = "Failed to assign semantic tag on non text view "
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = X.002.A0R(r1, r0)
            goto L_0x070b
        L_0x013b:
            r4 = 1
            java.lang.Object r3 = X.C307476Qg.A06(r3, r1)
            X.CtR r3 = (X.C45263CtR) r3
            if (r3 == 0) goto L_0x0c94
            r2 = 0
            r0 = 35
            boolean r2 = r1.A0R(r0, r2)
            java.lang.Boolean r1 = r3.A00
            if (r1 == 0) goto L_0x015a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x015a
            return
        L_0x015a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A00 = r0
            android.content.Context r0 = r3.A01
            android.app.Activity r1 = X.C46604Dhk.A00(r0)
            if (r1 == 0) goto L_0x0c94
            if (r2 == 0) goto L_0x017f
            android.view.Window r0 = r1.getWindow()
            X.0qQ.A07(r0)
            X.2db.A08(r0, r4)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r0 = r1.getColor(r0)
            X.2db.A02(r1, r0)
            return
        L_0x017f:
            X.2k3 r0 = X.C227842k3.DEFAULT
            X.2db.A05(r1, r0)
            return
        L_0x0185:
            java.lang.Object r6 = X.C307476Qg.A06(r3, r1)
            X.LAA r6 = (X.LAA) r6
            if (r6 == 0) goto L_0x0c94
            r0 = 12
            X.TYA r5 = new X.TYA
            r5.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r3)
            X.4Co r0 = r6.A02
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x019d
            r0.AG7(r4)
        L_0x019d:
            r6.A02 = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A05
            r3 = 0
            boolean r0 = r0.compareAndSet(r3, r1)
            if (r0 == 0) goto L_0x01bb
            X.Vgw r2 = r6.A04
            X.LBp r1 = r6.A03
            X.0qQ.A0B(r1, r3)
            java.util.List r0 = r2.A02
            r0.add(r1)
            java.lang.Integer r0 = r2.A00()
            r1.A00(r0)
        L_0x01bb:
            r6.A01 = r5
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0c94
            r5.invoke(r0)
            r6.A00 = r4
            return
        L_0x01c7:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 2131428812(0x7f0b05cc, float:1.847928E38)
            android.util.SparseArray r4 = r3.A01
            java.lang.Object r0 = r4.get(r0)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r2 = X.C307476Qg.A06(r3, r1)
            r2.getClass()
            X.Evh r2 = (X.C49441Evh) r2
            X.DhV r6 = new X.DhV
            r7 = r2
            r8 = r3
            r9 = r1
            r10 = r5
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            X.Mqf r1 = new X.Mqf
            r1.<init>(r6)
            r0 = 2131428753(0x7f0b0591, float:1.847916E38)
            java.lang.Object r0 = r4.get(r0)
            X.6QX r0 = (X.AnonymousClass6QX) r0
            if (r0 == 0) goto L_0x01fc
            r0.A00(r1)
        L_0x01fc:
            r2.A00 = r1
            return
        L_0x01ff:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 35
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r1.A03(r0, r3)
            if (r0 != r3) goto L_0x0213
            java.lang.String r3 = "BloksViewTagExtension"
            java.lang.String r0 = "ViewTagExtension is used, but no actual tag value is provided or FALLBACK_INT_TAG is found. This redundantly forces parent component for have a View"
            goto L_0x070b
        L_0x0213:
            r3 = 2131428763(0x7f0b059b, float:1.847918E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x08ab
        L_0x021c:
            X.0lg r0 = X.C308206Td.A0A(r3)
            com.instagram.common.session.UserSession r11 = X.0Gl.A01(r0)
            java.lang.String r10 = "IG_IX"
            if (r11 != 0) goto L_0x022e
            java.lang.String r0 = "Attempt to reportMediaMetricForView without a userSession."
        L_0x022a:
            X.1Kn.A02(r10, r0)
            return
        L_0x022e:
            r0 = 35
            r3 = -1
            int r0 = r1.A03(r0, r3)
            if (r0 != r3) goto L_0x023a
            java.lang.String r0 = "Attempt to reportMediaMetricForView without a nodeType."
            goto L_0x022a
        L_0x023a:
            long r5 = (long) r0
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            X.3Ds[] r8 = X.C238863Ds.values()
            int r7 = r8.length
            r4 = 0
        L_0x0246:
            if (r4 >= r7) goto L_0x0256
            r3 = r8[r4]
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.put(r0, r3)
            int r4 = r4 + 1
            goto L_0x0246
        L_0x0256:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r9.get(r0)
            X.3Ds r7 = (X.C238863Ds) r7
            if (r7 != 0) goto L_0x0265
            java.lang.String r0 = "Attempt to reportMediaMetricForView without an extraTrackingNode."
            goto L_0x022a
        L_0x0265:
            X.3Dp r0 = X.C238833Dp.A00(r11)
            goto L_0x0299
        L_0x026a:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r4 = 35
            r0 = -1
            int r6 = r1.A03(r4, r0)
            X.3Ds[] r5 = X.C238863Ds.values()
            int r4 = r5.length
            r1 = 0
        L_0x027b:
            if (r1 >= r4) goto L_0x02a0
            r7 = r5[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x029d
            X.2nJ r0 = r3.A02
            X.2nI r0 = (X.C229382nI) r0
            X.0lg r0 = r0.A06
            X.0qQ.A07(r0)
            X.3Dp r0 = X.C238833Dp.A00(r0)
            X.0qQ.A07(r0)
        L_0x0299:
            r0.A05(r2, r7)
            return
        L_0x029d:
            int r1 = r1 + 1
            goto L_0x027b
        L_0x02a0:
            java.lang.String r0 = "Failed to tag view with node type "
            java.lang.String r1 = X.002.A0O(r0, r6)
            java.lang.String r0 = "ALLoggingExtension"
            X.1Kn.A02(r0, r1)
            return
        L_0x02ac:
            java.lang.Class<X.XaI> r4 = X.C21409XaI.class
            r2 = 2131441873(0x7f0b38d1, float:1.850577E38)
            r0 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            java.lang.Object r0 = r3.A00(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r4 = r4.cast(r0)
            X.XaI r4 = (X.C21409XaI) r4
            X.4uI r0 = r1.A09()
            if (r4 == 0) goto L_0x0c94
            if (r0 == 0) goto L_0x0c94
            X.Sb3 r2 = new X.Sb3
            r2.<init>(r3, r1, r0)
            android.view.View r0 = r4.A00
            X.AnonymousClass0fU.A00(r2, r0)
            android.view.View r0 = r4.A02
            X.AnonymousClass0fU.A00(r2, r0)
            android.view.View r0 = r4.A01
            X.AnonymousClass0fU.A00(r2, r0)
            return
        L_0x02e1:
            X.C16714V2x.A02 = r24
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            X.Et5 r0 = (X.Et5) r0
            if (r0 == 0) goto L_0x0c94
            X.8Qm r0 = r0.A00
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0.A0A(r2)
            return
        L_0x02f3:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r5 = 1
            X.0lg r4 = X.C308206Td.A0A(r3)
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            java.lang.String r3 = "CXF_CPDP"
            if (r0 != 0) goto L_0x0306
            java.lang.String r0 = "Attempt to reportMediaMetricForView without a userSession."
            goto L_0x070b
        L_0x0306:
            r8 = 35
            r0 = -1
            int r7 = r1.A03(r8, r0)
            if (r7 != r0) goto L_0x0313
            java.lang.String r0 = "Attempt to reportMediaMetricForView without a nodeType."
            goto L_0x070b
        L_0x0313:
            r6 = 40
            X.4tV r1 = r1.A07(r6)
            if (r1 != 0) goto L_0x031f
            java.lang.String r0 = "Attempt to onAutomatedLoggingExtension with a null tracking_data_generator"
            goto L_0x070b
        L_0x031f:
            r0 = 41
            java.lang.String r10 = r1.A0K(r0)
            r0 = 36
            java.lang.String r12 = r1.A0K(r0)
            java.lang.String r11 = r1.A0K(r6)
            r0 = 38
            java.lang.String r14 = r1.A0K(r0)
            java.lang.String r16 = r1.A0K(r8)
            if (r10 == 0) goto L_0x0385
            if (r12 == 0) goto L_0x0385
            if (r14 == 0) goto L_0x0385
            if (r16 == 0) goto L_0x0385
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            long r0 = (long) r7
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            X.3Ds[] r8 = X.C238863Ds.values()
            int r7 = r8.length
            r6 = 0
        L_0x034e:
            if (r6 >= r7) goto L_0x0361
            r3 = r8[r6]
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 != 0) goto L_0x0362
            int r6 = r6 + 1
            goto L_0x034e
        L_0x0361:
            r3 = 0
        L_0x0362:
            X.0qQ.A0B(r4, r5)
            X.3Dp r1 = X.C238833Dp.A00(r4)
            if (r3 == 0) goto L_0x036e
            r1.A05(r2, r3)
        L_0x036e:
            X.1E8 r0 = X.1E7.A00(r4)
            X.1Xj r7 = r0.A02(r12)
            X.IL9 r0 = new X.IL9
            r6 = r0
            r8 = r14
            r9 = r10
            r10 = r12
            r12 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.A0A(r2, r0)
            return
        L_0x0385:
            java.lang.String r9 = "Attempt to onAutomatedLoggingExtension with one of those values null productId: "
            java.lang.String r11 = " , merchantId "
            java.lang.String r13 = " moduleName "
            java.lang.String r15 = " cpdpVersion "
            java.lang.String r0 = X.002.A16(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x070b
        L_0x0393:
            java.lang.Object r11 = X.C307476Qg.A06(r3, r1)
            X.XbG r11 = (X.XbG) r11
            if (r11 == 0) goto L_0x0c94
            java.lang.CharSequence r0 = r2.getContentDescription()
            java.lang.String r0 = (java.lang.String) r0
            r11.A03 = r0
            int r0 = r2.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A00 = r0
            int r0 = r2.getAccessibilityLiveRegion()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A01 = r0
            boolean r0 = r2.isFocusable()
            r11.A05 = r0
            boolean r0 = r2.isSelected()
            r11.A08 = r0
            boolean r0 = r2.isEnabled()
            r11.A04 = r0
            boolean r0 = X.03v.A0K(r2)
            r11.A06 = r0
            boolean r0 = X.03v.A0L(r2)
            r11.A07 = r0
            X.TyF r0 = new X.TyF
            r0.<init>(r3, r1, r5)
            X.03v.A0B(r2, r0)
            java.lang.String r12 = r11.A03
            r14 = 35
            java.lang.String r0 = r1.A0K(r14)
            if (r0 == 0) goto L_0x03e8
            r12 = r0
        L_0x03e8:
            java.util.Map r4 = X.C14572Tyb.A00
            r0 = 42
            java.lang.String r0 = r1.A0K(r0)
            java.lang.Object r10 = r4.get(r0)
            java.lang.Number r10 = (java.lang.Number) r10
            java.util.Map r4 = X.C14572Tyb.A01
            r0 = 44
            java.lang.String r0 = r1.A0K(r0)
            java.lang.Object r9 = r4.get(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            r4 = 40
            boolean r0 = r11.A05
            boolean r20 = r1.A0R(r4, r0)
            r4 = 49
            boolean r0 = r11.A08
            boolean r19 = r1.A0R(r4, r0)
            boolean r4 = r11.A04
            r0 = 38
            boolean r18 = r1.A0R(r0, r4)
            r4 = 41
            boolean r0 = r11.A06
            boolean r7 = r1.A0R(r4, r0)
            r4 = 48
            boolean r0 = r11.A07
            boolean r6 = r1.A0R(r4, r0)
            r0 = 43
            java.lang.Object r8 = X.C276544tV.A00(r1, r0)
            r0 = 55
            java.util.List r4 = r1.A0N(r0)
            if (r4 == 0) goto L_0x049e
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x049e
            java.util.Iterator r17 = r4.iterator()
        L_0x0444:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x049e
            java.lang.Object r4 = r17.next()
            X.4tV r4 = (X.C276544tV) r4
            java.lang.String r13 = r4.A0K(r14)
            r0 = 38
            X.4uI r16 = r4.A0A(r0)
            if (r13 == 0) goto L_0x0444
            java.util.Map r4 = X.C14550TyF.A05
            boolean r0 = r4.containsKey(r13)
            if (r0 == 0) goto L_0x0444
            java.lang.Object r0 = r4.get(r13)
            java.lang.Number r0 = (java.lang.Number) r0
            int r15 = r0.intValue()
            java.lang.String r0 = "click"
            java.lang.Object r0 = r4.get(r0)
            X.0Sd.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r13 = r0.intValue()
            java.lang.String r0 = "long_click"
            java.lang.Object r0 = r4.get(r0)
            X.0Sd.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = 1
            if (r15 == r13) goto L_0x0444
            if (r15 != r4) goto L_0x0444
            if (r16 == 0) goto L_0x0444
            r11.A09 = r0
            X.WBY r0 = new X.WBY
            r0.<init>(r4)
            r2.setOnLongClickListener(r0)
            goto L_0x0444
        L_0x049e:
            java.lang.String r4 = r11.A02
            r2.setContentDescription(r12)
            r11.A02 = r12
            if (r9 == 0) goto L_0x04ad
            int r0 = r9.intValue()
            if (r0 != 0) goto L_0x04d8
        L_0x04ad:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x04d8
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x04d8
            boolean r0 = r12.equals(r4)
            if (r0 != 0) goto L_0x04d8
            boolean r0 = r2.isAccessibilityFocused()
            if (r0 == 0) goto L_0x04d8
            android.view.accessibility.AccessibilityEvent r4 = android.view.accessibility.AccessibilityEvent.obtain()
            r0 = 2048(0x800, float:2.87E-42)
            r4.setEventType(r0)
            r0 = 4
            r4.setContentChangeTypes(r0)
            r4.setContentDescription(r12)
            r2.sendAccessibilityEventUnchecked(r4)
        L_0x04d8:
            if (r10 != 0) goto L_0x04dc
            java.lang.Integer r10 = r11.A00
        L_0x04dc:
            int r0 = r10.intValue()
            r2.setImportantForAccessibility(r0)
            if (r9 != 0) goto L_0x04e7
            java.lang.Integer r9 = r11.A01
        L_0x04e7:
            int r0 = r9.intValue()
            r2.setAccessibilityLiveRegion(r0)
            r0 = r20
            r2.setFocusable(r0)
            if (r8 == 0) goto L_0x0508
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x051c
            android.os.Handler r4 = new android.os.Handler
            r4.<init>(r0)
            X.Q3d r0 = new X.Q3d
            r0.<init>(r2, r3, r8)
            r4.post(r0)
        L_0x0508:
            r0 = r19
            r2.setSelected(r0)
            r0 = r18
            r2.setEnabled(r0)
            X.03v.A0I(r2, r7)
            X.03v.A0J(r2, r6)
            r0 = 56
            goto L_0x0b4b
        L_0x051c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0524:
            X.Dhe r0 = new X.Dhe
            r0.<init>(r3, r1, r5)
            r2.setOnTouchListener(r0)
            java.lang.Object r4 = X.C307476Qg.A06(r3, r1)
            r4.getClass()
            X.6Oj r4 = (X.C306986Oj) r4
        L_0x0535:
            X.6Oo r0 = new X.6Oo
            r0.<init>(r4)
            r2.setOnKeyListener(r0)
            return
        L_0x053e:
            r7 = 1
            java.lang.Object r2 = X.C307476Qg.A06(r3, r1)
            r2.getClass()
            X.XYv r2 = (X.C21366XYv) r2
            boolean r0 = r2.A00
            r6 = 0
            if (r0 != 0) goto L_0x056c
            r2.A00 = r7
            r0 = 41
            X.4uI r4 = r1.A0A(r0)
            if (r4 == 0) goto L_0x056c
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A03(r5, r6)
            r0.A03(r3, r7)
            java.util.List r2 = r0.A00
            X.6Tm r0 = new X.6Tm
            r0.<init>(r2)
            X.C307886Rw.A03(r3, r1, r0, r4)
        L_0x056c:
            r0 = 42
            X.4uI r4 = r1.A0A(r0)
            if (r4 == 0) goto L_0x0c94
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A03(r5, r6)
            r0.A03(r3, r7)
            java.util.List r2 = r0.A00
            X.6Tm r0 = new X.6Tm
            r0.<init>(r2)
            X.C307886Rw.A03(r3, r1, r0, r4)
            return
        L_0x058a:
            java.lang.Object r7 = X.C307476Qg.A06(r3, r1)
            X.TzG r7 = (X.C14609TzG) r7
            if (r7 == 0) goto L_0x0c94
            X.Tz8 r0 = r7.A00
            if (r0 != 0) goto L_0x0c94
            android.content.Context r6 = r3.A00
            android.app.Activity r4 = X.C46604Dhk.A00(r6)
            if (r4 == 0) goto L_0x05b9
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r4.findViewById(r0)
        L_0x05a5:
            boolean r0 = r7.A01
            X.Tz8 r4 = new X.Tz8
            r4.<init>(r2, r0)
            X.TzC r2 = new X.TzC
            r2.<init>(r6, r3, r1, r5)
            java.util.List r0 = r4.A03
            r0.add(r2)
            r7.A00 = r4
            return
        L_0x05b9:
            android.view.View r2 = r2.getRootView()
            goto L_0x05a5
        L_0x05be:
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x05f1
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.Object r6 = X.C307476Qg.A06(r3, r5)
            X.GbJ r6 = (X.C52706GbJ) r6
            r0 = 36
            X.4uI r4 = r1.A0A(r0)
            if (r4 == 0) goto L_0x0c94
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            X.W7j r0 = (X.W7j) r0
            if (r0 != 0) goto L_0x05e0
            java.lang.String r3 = "BKBloksComponentsBKSTextInputFormatterBinderUtil"
            java.lang.String r0 = "Unexpected null ExpressionMask in TextInputFormatterExtension"
            goto L_0x070b
        L_0x05e0:
            r0.A02 = r5
            r0.A00 = r2
            r0.A03 = r4
            r0.A01 = r3
            if (r6 == 0) goto L_0x0c94
            r6.A05(r0)
            r6.A04(r0)
            return
        L_0x05f1:
            java.lang.String r1 = "Text Input Formatter extension attached to non-text-input component with style ID: "
            int r0 = r5.A04
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05ff:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            int r4 = r5.A04
            r0 = 13323(0x340b, float:1.867E-41)
            if (r4 == r0) goto L_0x0611
            java.lang.String r1 = "invalid_extension_used"
            java.lang.String r0 = "bk.components.AvatarImageExtension should only be used for image components"
            android.util.Log.e(r1, r0)
            return
        L_0x0611:
            r4 = 35
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.A02(r4, r0)
            r4 = 38
            r0 = 0
            float r5 = r1.A02(r4, r0)
            r2.setScaleX(r6)
            r2.setScaleY(r6)
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 * r6
            r2.setTranslationY(r0)
            X.AOg r4 = new X.AOg
            r4.<init>(r6, r5)
            r2.addOnLayoutChangeListener(r4)
            X.0qQ.A0A(r3)
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            X.VL2 r0 = (X.VL2) r0
            if (r0 == 0) goto L_0x0c94
            r0.A00 = r4
            return
        L_0x0646:
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            X.3om r0 = (X.C252233om) r0
            if (r0 == 0) goto L_0x0c94
            X.C308206Td.A0J(r3, r0)
            X.C308206Td.A0I(r3, r0)
            return
        L_0x0655:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r8 = X.C307476Qg.A06(r3, r1)
            X.OFq r8 = (X.C70669OFq) r8
            if (r8 == 0) goto L_0x06f7
            android.content.Context r0 = r3.A00
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            X.0qQ.A0A(r0)
            java.text.NumberFormat r0 = X.C9776RgY.A00(r0)
            r8.A04 = r0
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.CharSequence r0 = r2.getHint()
            if (r0 != 0) goto L_0x068c
            java.text.NumberFormat r0 = r8.A04
            X.0qQ.A0A(r0)
            r6 = 0
            java.lang.String r0 = r0.format(r6)
            r2.setHint(r0)
        L_0x068c:
            android.text.Editable r0 = r2.getText()
            if (r0 == 0) goto L_0x06c9
            android.text.Editable r0 = r2.getText()
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "\\D"
            X.11S r4 = new X.11S
            r4.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r4 = r4.A00(r6, r0)
            boolean r0 = X.0mp.A0B(r4)
            if (r0 != 0) goto L_0x06c9
            java.text.NumberFormat r0 = r8.A04
            X.0qQ.A0A(r0)
            double r6 = java.lang.Double.parseDouble(r4)
            java.lang.String r0 = r0.format(r6)
            r2.setText(r0)
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            r8.A01 = r0
            r8.A00 = r0
        L_0x06c9:
            int r4 = r8.A01
            r0 = -1
            if (r4 != r0) goto L_0x06f1
            android.text.Editable r0 = r2.getText()
            if (r0 == 0) goto L_0x06df
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            r2.setSelection(r0)
        L_0x06df:
            X.OhH r4 = new X.OhH
            r4.<init>(r3, r1)
            android.text.TextWatcher r0 = r8.A02
            if (r0 == 0) goto L_0x06eb
            r2.removeTextChangedListener(r0)
        L_0x06eb:
            r8.A02 = r4
            r8.A03 = r2
            goto L_0x0ae5
        L_0x06f1:
            int r0 = r8.A00
            r2.setSelection(r4, r0)
            goto L_0x06df
        L_0x06f7:
            java.lang.String r1 = "TextInputNumberFormatterExtensionBinder defines a controller but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x06ff:
            java.lang.Object r4 = X.C307476Qg.A06(r3, r1)
            X.6Th r4 = (X.C308246Th) r4
            if (r4 != 0) goto L_0x070f
            java.lang.String r3 = "ViewTransformsExtensionBinderUtils"
            java.lang.String r0 = "Null controller while binding ViewTransformsExtension"
        L_0x070b:
            X.1Kn.A02(r3, r0)
            return
        L_0x070f:
            boolean r5 = X.C307476Qg.A0B(r3)
            if (r5 == 0) goto L_0x0718
            X.C308246Th.A00(r1, r4)
        L_0x0718:
            r4.A0B = r2
            float r0 = r4.A00
            r2.setAlpha(r0)
            float r0 = r4.A04
            r2.setRotation(r0)
            float r0 = r4.A05
            r2.setRotationX(r0)
            float r0 = r4.A06
            r2.setRotationY(r0)
            android.content.Context r1 = r3.A00
            float r0 = r4.A01
            float r0 = X.AnonymousClass6Tj.A00(r1, r0)
            r2.setCameraDistance(r0)
            float r0 = r4.A07
            r2.setScaleX(r0)
            float r0 = r4.A08
            r2.setScaleY(r0)
            r3 = 1
            r4.A0E = r3
            if (r5 == 0) goto L_0x0750
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0750
            X.AnonymousClass6Tj.A01(r2, r4)
            return
        L_0x0750:
            X.6Tk r0 = new X.6Tk
            r0.<init>(r2, r4)
            r4.A0C = r0
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r4.A0C
            r1.addOnPreDrawListener(r0)
            r4.A0D = r3
            return
        L_0x0763:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 2131428812(0x7f0b05cc, float:1.847928E38)
            android.util.SparseArray r6 = r3.A01
            java.lang.Object r4 = r6.get(r0)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.Tyn r0 = new X.Tyn
            r7 = r0
            r8 = r2
            r9 = r3
            r10 = r5
            r11 = r1
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            X.Mqf r3 = new X.Mqf
            r3.<init>(r0)
            r0 = 2131428753(0x7f0b0591, float:1.847916E38)
            java.lang.Object r0 = r6.get(r0)
            X.6QX r0 = (X.AnonymousClass6QX) r0
            if (r0 == 0) goto L_0x0790
            r0.A00(r3)
        L_0x0790:
            r0 = 2131439828(0x7f0b30d4, float:1.8501622E38)
        L_0x0793:
            r2.setTag(r0, r3)
            return
        L_0x0797:
            java.lang.String r4 = "TextInputCurrencyFormatterExtensionBinderUtils"
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r10 = 1
            java.lang.Object r9 = X.C307476Qg.A06(r3, r1)
            r9.getClass()
            X.OFp r9 = (X.C70668OFp) r9
            android.content.Context r0 = r3.A00
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r6 = r0.locale
            java.lang.String r13 = r1.A0D()
            r8 = 0
            X.0qQ.A0A(r6)     // Catch:{ IllegalArgumentException -> 0x0897 }
            java.util.Currency r0 = java.util.Currency.getInstance(r13)     // Catch:{ IllegalArgumentException -> 0x0897 }
            X.0qQ.A07(r0)     // Catch:{ IllegalArgumentException -> 0x0897 }
            java.text.NumberFormat r11 = java.text.NumberFormat.getCurrencyInstance(r6)     // Catch:{ IllegalArgumentException -> 0x0897 }
            r11.setCurrency(r0)     // Catch:{ IllegalArgumentException -> 0x0897 }
            r15 = r11
            java.text.DecimalFormat r15 = (java.text.DecimalFormat) r15     // Catch:{ IllegalArgumentException -> 0x0897 }
            java.text.DecimalFormatSymbols r14 = r15.getDecimalFormatSymbols()     // Catch:{ IllegalArgumentException -> 0x0897 }
            char r0 = r14.getGroupingSeparator()     // Catch:{ IllegalArgumentException -> 0x0897 }
            r12 = 32
            r7 = 8239(0x202f, float:1.1545E-41)
            r6 = 0
            if (r0 != r7) goto L_0x07e1
            r14.setGroupingSeparator(r12)     // Catch:{ IllegalArgumentException -> 0x0897 }
            r16 = 1
            goto L_0x07e3
        L_0x07e1:
            r16 = 0
        L_0x07e3:
            char r0 = r14.getDecimalSeparator()     // Catch:{ IllegalArgumentException -> 0x0897 }
            if (r0 != r7) goto L_0x07f3
            r14.setDecimalSeparator(r12)     // Catch:{ IllegalArgumentException -> 0x0897 }
        L_0x07ec:
            r15.setDecimalFormatSymbols(r14)     // Catch:{ IllegalArgumentException -> 0x0897 }
        L_0x07ef:
            r15.setMaximumFractionDigits(r6)     // Catch:{ IllegalArgumentException -> 0x0897 }
            goto L_0x07f6
        L_0x07f3:
            if (r16 == 0) goto L_0x07ef
            goto L_0x07ec
        L_0x07f6:
            r9.A04 = r11
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.CharSequence r0 = r2.getHint()
            if (r0 != 0) goto L_0x0809
            r6 = 0
            java.lang.String r0 = r11.format(r6)
            r2.setHint(r0)
        L_0x0809:
            android.text.Editable r0 = r2.getText()
            if (r0 == 0) goto L_0x0841
            android.text.Editable r0 = r2.getText()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "\\D"
            X.11S r6 = new X.11S
            r6.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r6 = r6.A00(r7, r0)
            boolean r0 = X.0mp.A0B(r6)
            if (r0 != 0) goto L_0x0841
            double r6 = java.lang.Double.parseDouble(r6)
            java.lang.String r0 = r11.format(r6)
            r2.setText(r0)
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            r9.A01 = r0
            r9.A00 = r0
        L_0x0841:
            int r6 = r9.A01
            r0 = -1
            if (r6 != r0) goto L_0x0891
            android.text.Editable r0 = r2.getText()
            if (r0 == 0) goto L_0x0857
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            r2.setSelection(r0)
        L_0x0857:
            android.text.TextWatcher r0 = r9.A02
            if (r0 == 0) goto L_0x085e
            r2.removeTextChangedListener(r0)
        L_0x085e:
            X.OhG r6 = new X.OhG
            r6.<init>(r3, r1)
            r9.A03 = r2
            java.lang.Object r1 = X.C307476Qg.A06(r3, r5)
            boolean r0 = r1 instanceof X.C52706GbJ
            if (r0 == 0) goto L_0x0875
            X.GbJ r1 = (X.C52706GbJ) r1
            r1.A04(r6)
        L_0x0872:
            r9.A02 = r6
            return
        L_0x0875:
            if (r1 == 0) goto L_0x088e
            java.lang.String r2 = "Unrecognized controller type: "
            java.lang.Class r1 = r1.getClass()
            java.util.Map r0 = X.0Yh.A03
            X.0qQ.A0B(r1, r10)
            java.lang.String r0 = X.0q1.A01(r1)
            java.lang.String r0 = X.002.A0R(r2, r0)
        L_0x088a:
            X.1Kn.A00(r3, r4, r0, r8)
            goto L_0x0872
        L_0x088e:
            java.lang.String r0 = "Missing text input controller"
            goto L_0x088a
        L_0x0891:
            int r0 = r9.A00
            r2.setSelection(r6, r0)
            goto L_0x0857
        L_0x0897:
            r1 = move-exception
            java.lang.String r0 = "Invalid currency code: "
            java.lang.String r0 = X.002.A0R(r0, r13)
            X.1Kn.A00(r3, r4, r0, r1)
            return
        L_0x08a2:
            r3 = 2131442565(0x7f0b3b85, float:1.8507173E38)
            r0 = 35
            java.lang.String r0 = r1.A0K(r0)
        L_0x08ab:
            r2.setTag(r3, r0)
            return
        L_0x08af:
            X.0lg r0 = X.C308206Td.A0A(r3)
            com.instagram.common.session.UserSession r9 = X.0Gl.A01(r0)
            if (r9 == 0) goto L_0x0c94
            r0 = 42
            r8 = 0
            boolean r0 = r1.A0R(r0, r8)
            if (r0 != 0) goto L_0x0c94
            java.lang.String r7 = ""
            r6 = 36
            r3 = r7
            java.lang.String r0 = r1.A0K(r6)
            if (r0 == 0) goto L_0x08ce
            r3 = r0
        L_0x08ce:
            X.Xlx r5 = X.C21920Xlx.A00
            monitor-enter(r5)
            X.1Am r0 = X.1Al.A01(r9)     // Catch:{ all -> 0x090b }
            X.1An r4 = X.1An.A0W     // Catch:{ all -> 0x090b }
            X.0xa r0 = r0.A03(r4)     // Catch:{ all -> 0x090b }
            monitor-exit(r5)
            boolean r0 = r0.getBoolean(r3, r8)
            if (r0 != 0) goto L_0x0c94
            java.lang.String r0 = r1.A0K(r6)
            if (r0 == 0) goto L_0x08e9
            r7 = r0
        L_0x08e9:
            r3 = 1
            monitor-enter(r5)
            X.1Am r0 = X.1Al.A01(r9)     // Catch:{ all -> 0x090b }
            X.0xa r0 = r0.A03(r4)     // Catch:{ all -> 0x090b }
            monitor-exit(r5)
            X.0xY r0 = r0.AR4()
            r0.E5T(r7, r3)
            r0.apply()
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            X.FPl r0 = new X.FPl
            r0.<init>(r2, r1)
            r3.addOnPreDrawListener(r0)
            return
        L_0x090b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x090e:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r8 = X.C307476Qg.A06(r3, r1)
            X.Tr3 r8 = (X.C14165Tr3) r8
            if (r8 == 0) goto L_0x098b
            int r7 = r5.A03
            X.2el r6 = X.C308206Td.A0D(r3)
            if (r6 == 0) goto L_0x093c
            java.util.LinkedHashMap r5 = r6.A03
            monitor-enter(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0934 }
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x0934 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0934 }
            r5.remove(r4)     // Catch:{ all -> 0x0934 }
            monitor-exit(r5)     // Catch:{ all -> 0x0934 }
            goto L_0x0937
        L_0x0934:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0934 }
            throw r1
        L_0x0937:
            if (r0 == 0) goto L_0x093c
            r0.run()
        L_0x093c:
            android.util.SparseArray r0 = r8.A01
            java.lang.Object r5 = r0.get(r7)
            java.util.Set r5 = (java.util.Set) r5
            if (r5 != 0) goto L_0x0987
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r0.append(r7, r5)
            if (r6 == 0) goto L_0x0987
            X.2hO r4 = X.C226592hN.A00(r2)
            X.2et r0 = r6.A01
            if (r0 == 0) goto L_0x0980
            X.2eq r0 = r0.A01
            X.30Y r4 = r0.A00(r4)
            X.30Y r0 = X.AnonymousClass30Y.A07
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0980
            X.WpU r4 = new X.WpU
            r9 = r4
            r10 = r2
            r11 = r8
            r12 = r3
            r13 = r6
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            java.util.LinkedHashMap r2 = r6.A03
            monitor-enter(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x097d }
            r2.put(r0, r4)     // Catch:{ all -> 0x097d }
            monitor-exit(r2)     // Catch:{ all -> 0x097d }
            goto L_0x0987
        L_0x097d:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x097d }
            throw r1
        L_0x0980:
            X.30Y r0 = X.C14165Tr3.A00(r8, r3, r7)
            r6.A05(r2, r0)
        L_0x0987:
            r5.add(r1)
            return
        L_0x098b:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0993:
            r12 = 0
            X.0qQ.A0B(r2, r12)
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            if (r0 == 0) goto L_0x0a66
            X.01c r4 = X.C299225um.A00
            int r0 = r5.A03
            r17 = r0
            long r6 = (long) r0
            java.lang.Object r9 = r4.A05(r6)
            java.util.Set r9 = (java.util.Set) r9
            if (r9 != 0) goto L_0x09e7
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r10 = r4.A00
            if (r10 == 0) goto L_0x0a01
            long[] r8 = r4.A02
            int r0 = r10 + -1
            r13 = r8[r0]
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0a01
            r4.A09(r6, r9)
        L_0x09c2:
            X.2el r8 = X.C308206Td.A0D(r3)
            if (r8 == 0) goto L_0x09eb
            java.lang.String r7 = java.lang.String.valueOf(r17)
            r4 = 0
            X.30Y r0 = X.AnonymousClass30Y.A07
            X.30a r6 = new X.30a
            r6.<init>(r4, r4, r7)
            X.2nB r4 = X.C300825xy.A00(r3)
            X.5un r0 = new X.5un
            r0.<init>(r3, r5, r4)
            r6.A00(r0)
            X.30Y r0 = r6.A01()
            r8.A05(r2, r0)
        L_0x09e7:
            r9.add(r1)
            return
        L_0x09eb:
            java.lang.String r4 = "Visibility extension requires host: "
            X.0iw r0 = X.C308206Td.A07(r3)
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "to have a viewpoint manager"
            java.lang.String r2 = X.002.A0g(r4, r2, r0)
            java.lang.String r0 = "missing_viewpoint_manager"
            X.0wb.A03(r0, r2)
            goto L_0x09e7
        L_0x0a01:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0a2b
            long[] r14 = r4.A02
            int r0 = r14.length
            if (r10 < r0) goto L_0x0a2b
            java.lang.Object[] r13 = r4.A03
            r11 = 0
            r8 = 0
        L_0x0a0e:
            if (r11 >= r10) goto L_0x0a26
            r0 = r13[r11]
            java.lang.Object r15 = X.AnonymousClass01d.A00
            if (r0 == r15) goto L_0x0a23
            if (r11 == r8) goto L_0x0a21
            r15 = r14[r11]
            r14[r8] = r15
            r13[r8] = r0
            r0 = 0
            r13[r11] = r0
        L_0x0a21:
            int r8 = r8 + 1
        L_0x0a23:
            int r11 = r11 + 1
            goto L_0x0a0e
        L_0x0a26:
            r4.A01 = r12
            r4.A00 = r8
            r10 = r8
        L_0x0a2b:
            long[] r12 = r4.A02
            int r0 = r12.length
            if (r10 < r0) goto L_0x0a58
            int r0 = r10 + 1
            int r11 = r0 * 8
            r8 = 4
        L_0x0a35:
            r0 = 1
            int r0 = r0 << r8
            int r0 = r0 + -12
            if (r11 <= r0) goto L_0x0a42
            int r8 = r8 + 1
            r0 = 32
            if (r8 < r0) goto L_0x0a35
            r0 = r11
        L_0x0a42:
            int r8 = r0 / 8
            long[] r0 = java.util.Arrays.copyOf(r12, r8)
            X.0qQ.A07(r0)
            r4.A02 = r0
            java.lang.Object[] r0 = r4.A03
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            X.0qQ.A07(r0)
            r4.A03 = r0
        L_0x0a58:
            long[] r0 = r4.A02
            r0[r10] = r6
            java.lang.Object[] r0 = r4.A03
            r0[r10] = r9
            int r0 = r10 + 1
            r4.A00 = r0
            goto L_0x09c2
        L_0x0a66:
            java.lang.String r1 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0a6e:
            java.lang.Class<X.2kt> r5 = X.C228162kt.class
            r4 = 2131435801(0x7f0b2119, float:1.8493454E38)
            r0 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            java.lang.Object r0 = r3.A00(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.Object r6 = r5.cast(r0)
            X.2kt r6 = (X.C228162kt) r6
            java.lang.Object r5 = X.C307476Qg.A06(r3, r1)
            X.EtI r5 = (X.EtI) r5
            if (r5 == 0) goto L_0x0aa7
            if (r6 == 0) goto L_0x0c94
            X.3je r0 = r5.A00
            if (r0 == 0) goto L_0x0a97
            r6.FJ2(r0)
        L_0x0a97:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            X.EMj r0 = new X.EMj
            r0.<init>(r4, r2, r3, r1)
            r5.A00 = r0
            r6.EBt(r0)
            return
        L_0x0aa7:
            java.lang.String r1 = "NetegoNodeExtension defines a controller but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0aaf:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x0c94
            android.widget.EditText r2 = (android.widget.EditText) r2
            if (r2 == 0) goto L_0x0c94
            java.lang.Object r4 = X.C307476Qg.A06(r3, r1)
            X.I9n r4 = (X.C56727I9n) r4
            if (r4 == 0) goto L_0x0c94
            r4.A00 = r2
            java.lang.String r1 = r1.A0D()
            if (r1 == 0) goto L_0x0af1
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0ae5
            r4.A01 = r1
            X.C56727I9n.A00(r4)
            android.widget.EditText r0 = r4.A00
            if (r0 == 0) goto L_0x0ae5
            android.text.Editable r0 = r0.getEditableText()
            if (r0 == 0) goto L_0x0ae5
            r4.afterTextChanged(r0)
        L_0x0ae5:
            java.lang.Object r0 = X.C307476Qg.A06(r3, r5)
            X.GbJ r0 = (X.C52706GbJ) r0
            if (r0 == 0) goto L_0x0c94
            r0.A04(r4)
            return
        L_0x0af1:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0af9:
            java.lang.Object r9 = X.C307476Qg.A06(r3, r1)
            X.5ug r9 = (X.C299165ug) r9
            if (r9 == 0) goto L_0x0c94
            int r0 = r2.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A00 = r0
            boolean r0 = r2.isFocusable()
            r9.A01 = r0
            r0 = 35
            r8 = 1
            boolean r0 = r1.A0R(r0, r8)
            r7 = 0
            if (r0 != 0) goto L_0x0b53
            r0 = 2
            r2.setImportantForAccessibility(r0)
            r6 = 0
        L_0x0b20:
            r0 = 36
            java.lang.String r4 = r1.A0K(r0)
            r0 = 38
            java.lang.String r0 = r1.A0K(r0)
            if (r4 != 0) goto L_0x0b30
            if (r0 == 0) goto L_0x0b31
        L_0x0b30:
            r7 = 1
        L_0x0b31:
            r6 = r6 | r7
            if (r6 == 0) goto L_0x0b41
            r2.setImportantForAccessibility(r8)
            r2.setFocusable(r8)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0b41
            r2.requestFocus()
        L_0x0b41:
            X.5uh r0 = new X.5uh
            r0.<init>(r1)
            X.03v.A0B(r2, r0)
            r0 = 45
        L_0x0b4b:
            java.util.List r0 = r1.A0N(r0)
            X.C7213Pzh.A01(r3, r5, r0)
            return
        L_0x0b53:
            r6 = 1
            goto L_0x0b20
        L_0x0b55:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1
            boolean r0 = r1.A0T(r0)
            if (r0 == 0) goto L_0x0c94
            boolean r0 = r2 instanceof X.C13427TaD
            if (r0 == 0) goto L_0x0c94
            X.4uI r6 = r1.A08()
            if (r6 == 0) goto L_0x0c94
            X.TaD r2 = (X.C13427TaD) r2
            java.lang.String r7 = r1.A0D()
            r0 = 225(0xe1, float:3.15E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String[] r4 = new java.lang.String[]{r0}
            if (r7 == 0) goto L_0x0ba1
            int r1 = r7.hashCode()
            r0 = 96673(0x179a1, float:1.35468E-40)
            if (r1 == r0) goto L_0x0ba1
            r0 = 102340(0x18fc4, float:1.43409E-40)
            if (r1 == r0) goto L_0x0bad
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r1 != r0) goto L_0x0ba1
            java.lang.String r0 = "image"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0ba1
            java.lang.String r4 = "image/png"
            java.lang.String r1 = "image/jpeg"
            java.lang.String r0 = "image/webp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r1, r0}
        L_0x0ba1:
            com.facebook.primitive.textinput.TextInputView r2 = (com.facebook.primitive.textinput.TextInputView) r2
            r2.A02 = r4
            X.Sof r0 = new X.Sof
            r0.<init>(r3, r5, r6)
            r2.A00 = r0
            return
        L_0x0bad:
            java.lang.String r0 = "gif"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0ba1
            java.lang.String r0 = "image/gif"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            goto L_0x0ba1
        L_0x0bbc:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r6 = 1
            r7 = 3
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x0c94
            java.lang.Object r5 = X.C307476Qg.A06(r3, r1)
            r5.getClass()
            X.VZ1 r5 = (X.VZ1) r5
            android.os.Handler r4 = X.VJN.A00
            java.lang.Runnable r0 = r5.A03
            r4.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.fragment.app.Fragment r0 = X.C308206Td.A00(r3)
            androidx.fragment.app.FragmentActivity r9 = X.C308206Td.A03(r3)
            android.content.Context r13 = r0.getContext()
            r8 = 2131428805(0x7f0b05c5, float:1.8479265E38)
            android.util.SparseArray r0 = r3.A01
            java.lang.Object r11 = r0.get(r8)
            X.6Ri r11 = (X.C307756Ri) r11
            boolean r12 = r1.A0T(r6)
            r0 = 36
            boolean r14 = r1.A0R(r0, r6)
            X.4uI r0 = r1.A09()
            X.VUO r10 = new X.VUO
            r10.<init>(r3, r1, r0)
            if (r13 == 0) goto L_0x0c94
            if (r11 == 0) goto L_0x0c94
            boolean r0 = r5.A00
            r20 = r0 ^ 1
            r8 = 0
            X.0qQ.A0B(r9, r7)
            int r0 = X.AnonymousClass3D4.A00(r13)
            float r7 = (float) r0
            X.0sn r17 = X.0sn.A00
            r18 = r17
            if (r12 == 0) goto L_0x0c7d
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A03(r9)
            android.view.ViewGroup r0 = r0.A0O
            java.util.List r18 = X.0sr.A1N(r0)
            r11.A01 = r6
        L_0x0c27:
            if (r14 == 0) goto L_0x0c7a
            boolean r0 = r9 instanceof X.2ZR
            if (r0 == 0) goto L_0x0c7a
            r13 = r9
            X.2ZR r13 = (X.2ZR) r13
            r0 = r13
            com.instagram.mainactivity.InstagramMainActivity r0 = (com.instagram.mainactivity.InstagramMainActivity) r0
            X.0eM r0 = r0.A0k
            java.lang.Object r0 = r0.getValue()
            X.2au r0 = (X.2au) r0
            android.view.View r12 = r0.A02
            android.view.ViewGroup r0 = r13.C3o()
            android.view.View[] r0 = new android.view.View[]{r12, r0}
            java.util.List r17 = X.0sr.A1Q(r0)
            r11.A00 = r6
        L_0x0c4b:
            X.2js r15 = r11.A02
            X.WNk r0 = new X.WNk
            r0.<init>(r10, r7)
            r19 = r7
            r16 = r0
            r15.A05(r16, r17, r18, r19, r20)
            if (r14 == 0) goto L_0x0c74
            boolean r0 = r9 instanceof X.2ZR
            if (r0 == 0) goto L_0x0c74
            X.2ZR r9 = (X.2ZR) r9
            r9.Eu7(r8)
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            r0.getClass()
            X.VZ1 r0 = (X.VZ1) r0
            java.lang.Runnable r3 = r0.A04
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r3, r0)
        L_0x0c74:
            r2.A15(r15)
            r5.A00 = r6
            return
        L_0x0c7a:
            r11.A00 = r8
            goto L_0x0c4b
        L_0x0c7d:
            r11.A01 = r8
            goto L_0x0c27
        L_0x0c80:
            X.C49740F4f.A00(r2, r3, r1)
            return
        L_0x0c84:
            X.C48383Ede.A00(r2, r3, r1)
            return
        L_0x0c88:
            java.lang.Object r0 = X.C307476Qg.A06(r3, r1)
            r0.getClass()
            X.XU2 r0 = (X.XU2) r0
            r0.A00()
        L_0x0c94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276814tw.A01(X.6Rm, X.4tV, X.4tV, java.lang.Object):void");
    }
}
