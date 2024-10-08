package X;

import androidx.fragment.app.Fragment;
import java.util.List;

public final class TYA extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Object A00(Object obj, TYA tya) {
        0qQ.A0B(obj, 0);
        return tya.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TYA(C11230SGo sGo, List list, int i) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 31:
            case 32:
            case 33:
                this.A02 = sGo;
                this.A01 = list;
                break;
            default:
                this.A01 = sGo;
                this.A02 = list;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04ab, code lost:
        r0 = "paymentDefaultErrorMessageText";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b0, code lost:
        r0 = "paymentDefaultErrorTitleText";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04e7, code lost:
        if (r0 == null) goto L_0x0e26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04e9, code lost:
        r0.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0545, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0547, code lost:
        if (r0 == null) goto L_0x0e26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0549, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x058c, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0593, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05b5, code lost:
        if (r2.equals(r4.A0E.A04()) != false) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x080f, code lost:
        if (r0 == 0) goto L_0x0811;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0811, code lost:
        r2.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08af, code lost:
        r1 = (androidx.fragment.app.Fragment) r1;
        X.0qQ.A0C(r1, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        r1.D68();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08bd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0996, code lost:
        if (r6 == X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a91, code lost:
        if (java.lang.Integer.valueOf(r4) != null) goto L_0x08f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a96, code lost:
        if (r0 != null) goto L_0x08f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0e23, code lost:
        r0.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0e28, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0924  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0993  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x099b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x0039;
                case 1: goto L_0x002a;
                case 2: goto L_0x0079;
                case 3: goto L_0x0114;
                case 4: goto L_0x0127;
                case 5: goto L_0x016f;
                case 6: goto L_0x017c;
                case 7: goto L_0x0190;
                case 8: goto L_0x01a4;
                case 9: goto L_0x01d2;
                case 10: goto L_0x0200;
                case 11: goto L_0x0022;
                case 12: goto L_0x0325;
                case 13: goto L_0x0340;
                case 14: goto L_0x035b;
                case 15: goto L_0x0379;
                case 16: goto L_0x039e;
                case 17: goto L_0x03c4;
                case 18: goto L_0x03f7;
                case 19: goto L_0x040f;
                case 20: goto L_0x0493;
                case 21: goto L_0x054e;
                case 22: goto L_0x060f;
                case 23: goto L_0x0624;
                case 24: goto L_0x0682;
                case 25: goto L_0x0693;
                case 26: goto L_0x06c5;
                case 27: goto L_0x06e9;
                case 28: goto L_0x0751;
                case 29: goto L_0x0786;
                case 30: goto L_0x07a9;
                case 31: goto L_0x07ba;
                case 32: goto L_0x07cb;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07ed;
                case 35: goto L_0x0800;
                case 36: goto L_0x0818;
                case 37: goto L_0x0896;
                case 38: goto L_0x08a4;
                case 39: goto L_0x08be;
                case 40: goto L_0x0a9d;
                case 41: goto L_0x0ab6;
                case 42: goto L_0x0009;
                case 43: goto L_0x0009;
                case 44: goto L_0x0acf;
                case 45: goto L_0x0ae9;
                case 46: goto L_0x0b22;
                case 47: goto L_0x0b63;
                case 48: goto L_0x0dea;
                case 49: goto L_0x0e30;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Ln r0 = (X.1Ln) r0
            X.QIF r3 = new X.QIF
            r3.<init>()
            java.lang.Object r2 = r1.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r2 = "checkout_confirmation"
            X.Pxg.A1J(r0, r3, r2)
            java.lang.Object r1 = r1.A01
            X.C51969G9p.A1G(r0, r1)
            return r0
        L_0x0022:
            java.lang.String r0 = "setName"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)
            throw r1
        L_0x002a:
            java.lang.Object r0 = r1.A02
            X.5PQ r0 = (X.AnonymousClass5PQ) r0
            android.view.Choreographer r2 = r0.A00
            java.lang.Object r0 = r1.A01
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r2.removeFrameCallback(r0)
            goto L_0x0e26
        L_0x0039:
            java.lang.Object r2 = r1.A01
            X.Hnb r2 = (X.C55795Hnb) r2
            java.lang.Object r7 = r2.A03
            monitor-enter(r7)
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x074e }
            X.5Pl r6 = r2.A00     // Catch:{ all -> 0x074e }
            int r5 = r6.A00     // Catch:{ all -> 0x074e }
            if (r5 <= 0) goto L_0x0068
            r4 = 0
            java.lang.Object[] r3 = r6.A02     // Catch:{ all -> 0x074e }
        L_0x004c:
            r0 = r3[r4]     // Catch:{ all -> 0x074e }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x074e }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x074e }
            X.JSc r2 = (X.C59658JSc) r2     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0064
            X.IGt r2 = (X.C56898IGt) r2     // Catch:{ all -> 0x074e }
            android.view.inputmethod.InputConnection r0 = r2.A00     // Catch:{ all -> 0x074e }
            if (r0 == 0) goto L_0x0064
            r0.closeConnection()     // Catch:{ all -> 0x074e }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x074e }
        L_0x0064:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x004c
        L_0x0068:
            r6.A01()     // Catch:{ all -> 0x074e }
            monitor-exit(r7)
            java.lang.Object r0 = r1.A02
            androidx.compose.ui.platform.AndroidPlatformTextInputSession r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) r0
            X.5Ui r0 = r0.A01
            X.5Te r0 = r0.A00
            r0.EyE()
            goto L_0x0e26
        L_0x0079:
            X.JNY r0 = (X.JNY) r0
            java.lang.Object r1 = r1.A01
            if (r1 != r0) goto L_0x0110
            java.lang.String r2 = " > "
        L_0x0081:
            boolean r1 = r0 instanceof X.C56896IGr
            r5 = 41
            java.lang.String r4 = ", newCursorPosition="
            if (r1 == 0) goto L_0x00b3
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "CommitTextCommand(text.length="
            r3.append(r1)
            X.IGr r0 = (X.C56896IGr) r0
            X.5Tq r1 = r0.A01
            java.lang.String r1 = r1.A00
            int r1 = r1.length()
            r3.append(r1)
            r3.append(r4)
            int r0 = r0.A00
        L_0x00a4:
            r3.append(r0)
            r3.append(r5)
        L_0x00aa:
            java.lang.String r0 = r3.toString()
        L_0x00ae:
            java.lang.String r0 = X.002.A0R(r2, r0)
            return r0
        L_0x00b3:
            boolean r1 = r0 instanceof X.C56894IGp
            if (r1 == 0) goto L_0x00d3
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "SetComposingTextCommand(text.length="
            r3.append(r1)
            X.IGp r0 = (X.C56894IGp) r0
            X.5Tq r1 = r0.A01
            java.lang.String r1 = r1.A00
            int r1 = r1.length()
            r3.append(r1)
            r3.append(r4)
            int r0 = r0.A00
            goto L_0x00a4
        L_0x00d3:
            boolean r1 = r0 instanceof X.C56893IGo
            if (r1 != 0) goto L_0x010b
            boolean r1 = r0 instanceof X.C56891IGm
            if (r1 != 0) goto L_0x010b
            boolean r1 = r0 instanceof X.C56892IGn
            if (r1 != 0) goto L_0x010b
            boolean r1 = r0 instanceof X.C56895IGq
            if (r1 != 0) goto L_0x010b
            boolean r1 = r0 instanceof X.C56890IGl
            if (r1 != 0) goto L_0x010b
            boolean r1 = r0 instanceof X.C56889IGk
            if (r1 != 0) goto L_0x010b
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Unknown EditCommand: "
            r3.append(r1)
            java.lang.Class r1 = r0.getClass()
            java.util.Map r0 = X.0Yh.A03
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = X.0q1.A01(r1)
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "{anonymous EditCommand}"
        L_0x0107:
            r3.append(r0)
            goto L_0x00aa
        L_0x010b:
            java.lang.String r0 = r0.toString()
            goto L_0x00ae
        L_0x0110:
            java.lang.String r2 = "   "
            goto L_0x0081
        L_0x0114:
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            java.lang.Object r2 = r1.A02
            X.5R6 r2 = (X.AnonymousClass5R6) r2
            java.lang.Object r1 = r1.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.ui.Modifier r0 = r0.Ezh(r1)
            r2.Edb(r0)
            goto L_0x0e26
        L_0x0127:
            X.4co r0 = (X.C268124co) r0
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x015e
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            if (r0 == 0) goto L_0x015e
            java.lang.Object r4 = r1.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r1.A01
            X.5R6 r3 = (X.AnonymousClass5R6) r3
            X.6Gd r2 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r2 = r2.A00
            r2.put(r4, r3)
            X.6Gd r2 = r0.getAndroidViewsHandler$ui_release()
            r2.addView(r4)
            X.6Gd r2 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r2 = r2.A01
            r2.put(r3, r4)
            r2 = 1
            r4.setImportantForAccessibility(r2)
            X.9Y7 r2 = new X.9Y7
            r2.<init>(r3, r0, r0)
            X.03v.A0B(r4, r2)
        L_0x015e:
            java.lang.Object r2 = r1.A02
            X.Gdi r2 = (X.C52849Gdi) r2
            android.view.View r1 = r2.A0J
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r2) goto L_0x0e26
            r2.addView(r1)
            goto L_0x0e26
        L_0x016f:
            java.lang.Object r2 = r1.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r1.A01
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.C56387Hxg.A00(r2, r0)
            goto L_0x0e26
        L_0x017c:
            java.lang.Object r2 = r1.A02
            X.Gdi r2 = (X.C52849Gdi) r2
            java.lang.Object r0 = r1.A01
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.C56387Hxg.A00(r2, r0)
            X.4co r1 = r2.A0O
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            r0 = 1
            r1.A08 = r0
            goto L_0x0e26
        L_0x0190:
            java.lang.Object r2 = r1.A01
            androidx.compose.ui.window.PopupLayout r2 = (androidx.compose.ui.window.PopupLayout) r2
            java.lang.Object r0 = r1.A02
            X.JNb r0 = (X.C59529JNb) r0
            r2.A01 = r0
            r2.A09()
            r1 = 2
            X.Gc5 r0 = new X.Gc5
            r0.<init>(r1)
            return r0
        L_0x01a4:
            X.SOO r0 = (X.SOO) r0
            java.lang.Object r2 = A00(r0, r1)
            X.Htj r2 = (X.C56156Htj) r2
            java.lang.Object r2 = r2.A08
            X.Sd4 r4 = r0.A00(r2)
            java.lang.Object r3 = r1.A01
            X.Tio r3 = (X.C13867Tio) r3
            X.IHA r3 = (X.IHA) r3
            X.0sP r1 = r3.A01
            java.lang.Object r2 = r1.invoke(r0)
            X.SR7 r2 = (X.SR7) r2
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r1 = X.SR7.A08
            if (r0 != r1) goto L_0x01ce
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x01ce
            r2.A02 = r1
        L_0x01ce:
            r4.A0H = r2
            goto L_0x0e26
        L_0x01d2:
            X.SOO r0 = (X.SOO) r0
            java.lang.Object r2 = A00(r0, r1)
            X.Htj r2 = (X.C56156Htj) r2
            java.lang.Object r2 = r2.A08
            X.Sd4 r4 = r0.A00(r2)
            java.lang.Object r3 = r1.A01
            X.Tio r3 = (X.C13867Tio) r3
            X.IHA r3 = (X.IHA) r3
            X.0sP r1 = r3.A01
            java.lang.Object r2 = r1.invoke(r0)
            X.SR7 r2 = (X.SR7) r2
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x01fc
            java.lang.Object r1 = X.SR7.A08
            if (r0 != r1) goto L_0x01fc
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x01fc
            r2.A02 = r1
        L_0x01fc:
            r4.A0G = r2
            goto L_0x0e26
        L_0x0200:
            X.4cl r0 = (X.C268104cl) r0
            r8 = 0
            X.0qQ.A0B(r0, r8)
            java.lang.Object r7 = r1.A02
            X.Sd5 r7 = (X.Sd5) r7
            java.lang.Object r9 = r1.A01
            java.util.List r9 = (java.util.List) r9
            r1 = 1
            X.0qQ.A0B(r9, r1)
            java.util.Map r6 = r7.A04
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x025e
            X.2d1 r1 = r7.A03
            java.util.ArrayList r1 = r1.A00
            java.util.Iterator r11 = r1.iterator()
        L_0x0222:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x025e
            java.lang.Object r2 = r11.next()
            X.2d3 r2 = (X.2d3) r2
            java.lang.Object r10 = r2.A0m
            boolean r1 = r10 instanceof X.C268074ci
            if (r1 == 0) goto L_0x0222
            X.2d4 r5 = r2.A0Y
            X.2d3 r4 = r5.A0G
            if (r4 == 0) goto L_0x0255
            int r3 = r4.A08()
            r5.A0C = r3
            int r2 = r4.A09()
            r5.A0E = r2
            int r1 = r4.A0S
            int r3 = r3 + r1
            r5.A0D = r3
            int r1 = r4.A0A
            int r2 = r2 + r1
            r5.A0B = r2
            X.2d4 r1 = r4.A0Y
            r5.A00(r1)
        L_0x0255:
            X.2d4 r1 = new X.2d4
            r1.<init>((X.C71422d4) r5)
            r6.put(r10, r1)
            goto L_0x0222
        L_0x025e:
            r1 = 0
            int r5 = X.C51966G9m.A06(r9)
            if (r5 < 0) goto L_0x0e26
        L_0x0265:
            int r4 = r1 + 1
            java.lang.Object r12 = r9.get(r1)
            java.lang.Object r2 = r6.get(r12)
            X.2d4 r2 = (X.C71422d4) r2
            if (r2 == 0) goto L_0x0e26
            float r1 = r2.A03
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A04
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A05
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A08
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A09
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A0A
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A06
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A07
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            float r1 = r2.A00
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02e8
            java.lang.Object r1 = r6.get(r12)
            X.2d4 r1 = (X.C71422d4) r1
            X.0qQ.A0A(r1)
            int r3 = r1.A0C
            java.lang.Object r1 = r6.get(r12)
            X.2d4 r1 = (X.C71422d4) r1
            X.0qQ.A0A(r1)
            int r2 = r1.A0E
            java.util.Map r1 = r7.A06
            java.lang.Object r10 = r1.get(r12)
            X.4cY r10 = (X.C267974cY) r10
            if (r10 == 0) goto L_0x02e3
            long r1 = X.AnonymousClass5TW.A00(r3, r2)
            r3 = 0
            r0.A06(r10, r3, r1)
        L_0x02e3:
            if (r4 > r5) goto L_0x0e26
            r1 = r4
            goto L_0x0265
        L_0x02e8:
            X.MMt r11 = new X.MMt
            r11.<init>(r2, r8)
            java.lang.Object r1 = r6.get(r12)
            X.2d4 r1 = (X.C71422d4) r1
            X.0qQ.A0A(r1)
            int r10 = r1.A0C
            java.lang.Object r1 = r6.get(r12)
            X.2d4 r1 = (X.C71422d4) r1
            X.0qQ.A0A(r1)
            int r3 = r1.A0E
            float r1 = r2.A0A
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0322
            r1 = 0
        L_0x030c:
            java.util.Map r2 = r7.A06
            java.lang.Object r2 = r2.get(r12)
            X.4cY r2 = (X.C267974cY) r2
            if (r2 == 0) goto L_0x02e3
            r12 = r0
            r13 = r2
            r14 = r11
            r15 = r1
            r16 = r10
            r17 = r3
            r12.A09(r13, r14, r15, r16, r17)
            goto L_0x02e3
        L_0x0322:
            float r1 = r2.A0A
            goto L_0x030c
        L_0x0325:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r3 = r1.A01
            X.6Rm r3 = (X.C307786Rm) r3
            java.lang.Object r2 = r1.A02
            X.4tV r2 = (X.C276544tV) r2
            X.4uI r1 = r2.A09()
            if (r1 == 0) goto L_0x0e26
            X.6Tm r0 = X.DbY.A0Q(r0)
            X.C307886Rw.A03(r3, r2, r0, r1)
            goto L_0x0e26
        L_0x0340:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r3 = r1.A02
            X.4tV r3 = (X.C276544tV) r3
            r2 = 43
            X.4uI r3 = r3.A0A(r2)
            X.6Tm r2 = X.DbY.A0Q(r0)
            java.lang.Object r0 = r1.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r2, r3)
            r0 = 0
            return r0
        L_0x035b:
            java.lang.Object r2 = A00(r0, r1)
            X.6S4 r2 = (X.AnonymousClass6S4) r2
            X.6Rp r4 = r2.A00
            java.lang.Object r1 = r1.A01
            X.4tV r1 = (X.C276544tV) r1
            int r3 = r1.A03
            r2 = 1
            X.Sd0 r1 = new X.Sd0
            r1.<init>((java.lang.Object) r0, (int) r2)
            X.Spk r0 = new X.Spk
            r0.<init>(r1, r3)
            r4.ASZ(r0)
            goto L_0x0e26
        L_0x0379:
            X.GeB r0 = (X.C52876GeB) r0
            java.lang.Object r4 = A00(r0, r1)
            java.lang.Object r3 = r1.A01
            r2 = 33
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r4)
            r0.A04 = r1
            r2 = 34
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r4)
            r0.A02 = r1
            r2 = 35
            X.IwR r1 = new X.IwR
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r4)
            r0.A03 = r1
            goto L_0x0e26
        L_0x039e:
            java.lang.String r5 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r1.A02
            X.ONS r0 = (X.ONS) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r0.A02
            int r3 = r0.A00
            int r2 = r0.A01
            java.lang.String r0 = "add_device_fetch_vd_info_gql_error_message"
            r4.markerAnnotate(r3, r2, r0, r5)
            java.lang.Object r2 = r1.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.FetchVirtualDeviceInfoGraphQLException r1 = new com.encryptedbackups.statemanager.model.FetchVirtualDeviceInfoGraphQLException
            r1.<init>(r5)
            X.N0J r0 = new X.N0J
            r0.<init>(r1)
            r2.A05(r0)
            goto L_0x0e26
        L_0x03c4:
            boolean r5 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r1.A02
            X.Hmx r0 = (X.C55762Hmx) r0
            com.facebook.quicklog.QuickPerformanceLogger r4 = r0.A01
            r3 = 47647318(0x2d70a56, float:3.1597343E-37)
            java.lang.String r0 = "backup_end"
            r4.markerPoint(r3, r0)
            java.lang.Object r2 = r1.A01
            X.1K2 r2 = (X.1K2) r2
            if (r5 == 0) goto L_0x03e6
            r0 = 0
            r2.set(r0)
            r0 = 2
        L_0x03e1:
            r4.markerEnd(r3, r0)
            goto L_0x0e26
        L_0x03e6:
            java.lang.String r1 = "Failed to backup cookie store"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r2.setException(r0)
            java.lang.String r0 = "backup_fail"
            r4.markerPoint(r3, r0)
            r0 = 3
            goto L_0x03e1
        L_0x03f7:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x040d
            java.lang.Object r2 = r1.A02
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            X.TBJ r0 = new X.TBJ
            r0.<init>(r1)
            r2.post(r0)
        L_0x040d:
            r0 = 0
            return r0
        L_0x040f:
            X.QOo r0 = (X.C7606QOo) r0
            java.lang.String r4 = r0.A05
            if (r4 == 0) goto L_0x0427
            java.lang.Object r3 = r1.A02
            X.QKL r3 = (X.QKL) r3
            java.lang.String r2 = r3.A0G
            if (r2 == 0) goto L_0x04b0
            java.lang.String r1 = r3.A0F
            if (r1 == 0) goto L_0x04ab
            r0 = 0
            X.QKL.A01(r3, r0, r2, r1, r4)
            goto L_0x0e26
        L_0x0427:
            X.SFq r3 = r0.A04
            java.lang.Object r4 = r1.A02
            X.QKL r4 = (X.QKL) r4
            if (r3 == 0) goto L_0x046d
            X.0eM r0 = r3.A08
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x045b
            X.0eM r0 = r3.A05
            java.lang.String r0 = X.DbS.A0t(r0)
            if (r0 == 0) goto L_0x044a
            android.widget.TextView r1 = r4.A0A
            if (r1 == 0) goto L_0x044a
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x044a:
            android.widget.EditText r0 = r4.A05
            if (r0 == 0) goto L_0x0457
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0457
            r0.clear()
        L_0x0457:
            android.widget.EditText r0 = r4.A05
            goto L_0x04e7
        L_0x045b:
            X.0eM r0 = r3.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            r0 = 0
            X.QKL.A01(r4, r3, r2, r1, r0)
            goto L_0x0e26
        L_0x046d:
            java.lang.Integer r1 = X.C51967G9n.A0j()
            r4.A0D = r1
            r6 = 0
            com.fbpay.w3c.CardDetails r5 = r0.A00
            long r1 = r0.A01
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            long r1 = r0.A03
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            long r0 = r0.A02
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r11 = r6
            android.content.Intent r0 = r4.A0H(r5, r6, r7, r8, r9, r10, r11)
            r4.A00 = r0
            goto L_0x0545
        L_0x0493:
            X.QOq r0 = (X.C7608QOq) r0
            java.lang.String r4 = r0.A06
            if (r4 == 0) goto L_0x04b5
            java.lang.Object r3 = r1.A02
            X.QKE r3 = (X.QKE) r3
            java.lang.String r2 = r3.A0J
            if (r2 == 0) goto L_0x04b0
            java.lang.String r1 = r3.A0I
            if (r1 == 0) goto L_0x04ab
            r0 = 0
            X.QKE.A01(r3, r0, r2, r1, r4)
            goto L_0x0e26
        L_0x04ab:
            java.lang.String r0 = "paymentDefaultErrorMessageText"
            goto L_0x058c
        L_0x04b0:
            java.lang.String r0 = "paymentDefaultErrorTitleText"
            goto L_0x058c
        L_0x04b5:
            X.SFq r3 = r0.A05
            java.lang.Object r4 = r1.A02
            X.QKE r4 = (X.QKE) r4
            if (r3 == 0) goto L_0x051b
            X.0eM r0 = r3.A08
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0509
            X.0eM r0 = r3.A05
            java.lang.String r0 = X.DbS.A0t(r0)
            if (r0 == 0) goto L_0x04ee
            android.widget.TextView r1 = r4.A0B
            if (r1 == 0) goto L_0x04ee
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x04d8:
            android.widget.EditText r0 = r4.A05
            if (r0 == 0) goto L_0x04e5
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x04e5
            r0.clear()
        L_0x04e5:
            android.widget.EditText r0 = r4.A05
        L_0x04e7:
            if (r0 == 0) goto L_0x0e26
            r0.requestFocus()
            goto L_0x0e26
        L_0x04ee:
            com.fbpay.w3c.views.AutofillTextInputLayout r1 = r4.A0F
            if (r1 == 0) goto L_0x04fb
            X.0eM r0 = r3.A06
            java.lang.String r0 = X.DbS.A0t(r0)
            r1.A0U(r0)
        L_0x04fb:
            com.fbpay.w3c.views.AutofillTextInputLayout r1 = r4.A0E
            if (r1 == 0) goto L_0x04d8
            X.0eM r0 = r3.A04
            java.lang.String r0 = X.DbS.A0t(r0)
            r1.A0U(r0)
            goto L_0x04d8
        L_0x0509:
            X.0eM r0 = r3.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            r0 = 0
            X.QKE.A01(r4, r3, r2, r1, r0)
            goto L_0x0e26
        L_0x051b:
            java.lang.Integer r1 = X.C51967G9n.A0j()
            r4.A0G = r1
            r6 = 0
            com.fbpay.w3c.CardDetails r5 = r0.A00
            long r1 = r0.A01
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            long r1 = r0.A04
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            long r1 = r0.A03
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            long r0 = r0.A02
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r12 = r6
            android.content.Intent r0 = r4.A0H(r5, r6, r7, r8, r9, r10, r11, r12)
            r4.A00 = r0
        L_0x0545:
            android.app.Dialog r0 = r4.A01
            if (r0 == 0) goto L_0x0e26
            r0.cancel()
            goto L_0x0e26
        L_0x054e:
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            java.lang.Object r4 = r1.A02
            X.QCj r4 = (X.C7420QCj) r4
            X.2gB r3 = r4.A07
            java.lang.Object r1 = r1.A01
            X.2Fk r1 = (X.2Fk) r1
            r3.A0D(r1)
            if (r0 != 0) goto L_0x0576
            X.REL r0 = X.REL.Error
            r3.A0B(r0)
            X.2Fj r0 = r4.A08
            r2 = 0
            r5 = -1
            java.lang.String r4 = "error_card_not_found"
            X.QOq r1 = new X.QOq
            r3 = r2
            r7 = r5
            r9 = r5
            r11 = r5
            r1.<init>(r2, r3, r4, r5, r7, r9, r11)
            goto L_0x0e23
        L_0x0576:
            com.fbpay.w3c.CardDetails r1 = r0.A00
            java.lang.String r5 = r1.A05
            java.lang.String r2 = ""
            if (r5 != 0) goto L_0x057f
            r5 = r2
        L_0x057f:
            r4.A03 = r5
            java.lang.String r1 = r1.A0A
            if (r1 == 0) goto L_0x0586
            r2 = r1
        L_0x0586:
            r4.A04 = r2
            if (r5 != 0) goto L_0x0594
            java.lang.String r0 = "cardNetwork"
        L_0x058c:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0594:
            X.RGo r1 = X.C11334SNo.A00(r5)
            r4.A01 = r1
            boolean r8 = r0.A05
            r7 = 0
            if (r8 != 0) goto L_0x05b7
            java.lang.String r2 = r0.A02
            X.0qQ.A07(r2)
            boolean r1 = X.C51966G9m.A1X(r2)
            if (r1 == 0) goto L_0x05b7
            X.S7C r1 = r4.A0E
            java.lang.String r1 = r1.A04()
            boolean r1 = r2.equals(r1)
            r6 = 1
            if (r1 == 0) goto L_0x05b8
        L_0x05b7:
            r6 = 0
        L_0x05b8:
            if (r8 == 0) goto L_0x05c7
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x05c7
            java.util.Set r1 = X.C7420QCj.A0J
            boolean r1 = X.00k.A0u(r1, r2)
            if (r1 != 0) goto L_0x05c7
            r7 = 1
        L_0x05c7:
            X.2Fj r5 = r4.A09
            if (r7 != 0) goto L_0x060c
            if (r8 == 0) goto L_0x05d9
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x060c
            java.util.Set r1 = X.C7420QCj.A0J
            boolean r1 = X.00k.A0u(r1, r2)
            if (r1 != 0) goto L_0x060c
        L_0x05d9:
            if (r6 != 0) goto L_0x060c
            X.RDR r1 = X.RDR.A04
        L_0x05dd:
            r5.A0B(r1)
            if (r6 == 0) goto L_0x0605
            java.lang.String r0 = r0.A02
        L_0x05e4:
            r4.A02 = r0
            X.REL r0 = X.REL.InvalidInput
            r3.A0B(r0)
            java.util.List r0 = X.C7420QCj.A00(r4)
            java.util.Iterator r2 = r0.iterator()
        L_0x05f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e26
            java.lang.Object r1 = r2.next()
            X.2Fk r1 = (X.2Fk) r1
            X.2gO r0 = r4.A0C
            r3.A0E(r1, r0)
            goto L_0x05f3
        L_0x0605:
            X.S7C r0 = r4.A0E
            java.lang.String r0 = r0.A04()
            goto L_0x05e4
        L_0x060c:
            X.RDR r1 = X.RDR.A02
            goto L_0x05dd
        L_0x060f:
            java.lang.String r3 = X.C41847B3o.A1E(r0)
            java.lang.Object r2 = r1.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r1.A01
            X.2HJ r0 = (X.2HJ) r0
            java.lang.String r0 = r0.A01(r3)
            r2.invoke(r0)
            r0 = 0
            return r0
        L_0x0624:
            X.5XH r0 = (X.AnonymousClass5XH) r0
            java.lang.Object r4 = A00(r0, r1)
            X.Q1z r4 = (X.C7275Q1z) r4
            java.lang.Object r5 = r1.A01
            X.0sL r5 = (X.0sL) r5
            java.lang.String r2 = "onViewTreeOwnersAvailable"
            r1 = -504537761(0xffffffffe1ed5d5f, float:-5.473258E20)
            X.0fg.A01(r2, r1)
            boolean r1 = r4.A02     // Catch:{ all -> 0x067a }
            if (r1 != 0) goto L_0x0672
            X.07Z r0 = r0.A00     // Catch:{ all -> 0x067a }
            X.07V r1 = r0.getLifecycle()     // Catch:{ all -> 0x067a }
            r4.A01 = r5     // Catch:{ all -> 0x067a }
            X.07V r0 = r4.A00     // Catch:{ all -> 0x067a }
            if (r0 != 0) goto L_0x064f
            r4.A00 = r1     // Catch:{ all -> 0x067a }
            r1.A09(r4)     // Catch:{ all -> 0x067a }
            goto L_0x0672
        L_0x064f:
            X.07U r1 = r1.A07()     // Catch:{ all -> 0x067a }
            X.07U r0 = X.07U.A01     // Catch:{ all -> 0x067a }
            int r1 = r1.compareTo(r0)     // Catch:{ all -> 0x067a }
            r0 = 0
            if (r1 < 0) goto L_0x065d
            r0 = 1
        L_0x065d:
            if (r0 == 0) goto L_0x0672
            X.5Pk r3 = r4.A03     // Catch:{ all -> 0x067a }
            r2 = 1488560705(0x58b9a241, float:1.63285221E15)
            r1 = 16
            X.JGF r0 = new X.JGF     // Catch:{ all -> 0x067a }
            r0.<init>(r1, r5, r4)     // Catch:{ all -> 0x067a }
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r2)     // Catch:{ all -> 0x067a }
            r3.ESi(r0)     // Catch:{ all -> 0x067a }
        L_0x0672:
            r0 = 652958710(0x26eb5bf6, float:1.6331327E-15)
            X.0fg.A00(r0)
            goto L_0x0e26
        L_0x067a:
            r1 = move-exception
            r0 = 735613346(0x2bd891a2, float:1.5388144E-12)
            X.0fg.A00(r0)
            throw r1
        L_0x0682:
            android.graphics.Canvas r0 = (android.graphics.Canvas) r0
            java.lang.Object r2 = A00(r0, r1)
            X.3OI r2 = (X.AnonymousClass3OI) r2
            java.lang.Object r1 = r1.A01
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r2.A00(r0, r1)
            goto L_0x0e26
        L_0x0693:
            X.HtL r0 = (X.C56133HtL) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A01
            X.HtO r2 = (X.C56136HtO) r2
            java.util.List r2 = r2.A03
            monitor-enter(r2)
            r2.add(r0)     // Catch:{ all -> 0x06c2 }
            monitor-exit(r2)
            boolean r2 = r0.A04
            if (r2 != 0) goto L_0x0e26
            boolean r0 = r0.A02
            java.lang.Object r1 = r1.A02
            X.2Wa r1 = (X.2Wa) r1
            if (r0 != 0) goto L_0x06b9
            java.lang.Object r0 = X.Pxe.A0p()
            r1.A02(r0)
            goto L_0x0e26
        L_0x06b9:
            java.lang.Object r0 = X.Pxe.A0p()
            r1.A01(r0)
            goto L_0x0e26
        L_0x06c2:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x06c5:
            X.I4V r0 = (X.I4V) r0
            long r3 = r0.A00
            X.Hhf r5 = new X.Hhf
            r5.<init>()
            java.lang.Object r2 = r1.A01
            X.I13 r2 = (X.I13) r2
            java.lang.Object r0 = r1.A02
            X.Gwp r0 = (X.C53945Gwp) r0
            X.0sP r1 = r0.A02
            X.GnR r0 = r5.A00
            r0.A00 = r3
            r1.invoke(r5)
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            X.JVf r0 = new X.JVf
            r0.<init>((X.I13) r2, (java.util.List) r1)
            return r0
        L_0x06e9:
            X.68F r0 = (X.AnonymousClass68F) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.692 r3 = r0.A00
            X.5wg r2 = r3.A01
            android.content.Context r2 = r2.A01
            com.facebook.advancedcryptotransport.PlatformStorageProvider.initialize(r2)
            com.facebook.msys.mci.AccountSession r7 = r3.A02
            r2 = 2022(0x7e6, float:2.833E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            monitor-enter(r7)
            java.lang.String r2 = r7.mInjectedMailboxType     // Catch:{ all -> 0x074e }
            monitor-exit(r7)
            java.lang.String r6 = X.002.A0R(r3, r2)
            boolean r3 = r7.isValid()
            java.lang.String r2 = "MultiInstanceSingleBackgroundAccountSyncHandler: invalid account session "
            java.lang.String r2 = X.002.A0R(r2, r6)
            X.02V.A07(r3, r2)
            int r2 = r7.getState()
            boolean r5 = X.C66581MXm.A1V(r2)
            java.lang.String r4 = "MultiInstanceSingleBackgroundAccountSyncHandler: invalid account session state "
            int r3 = r7.getState()
            r2 = 32
            java.lang.String r2 = X.002.A0W(r4, r6, r2, r3)
            X.02V.A07(r5, r2)
            r2 = 964(0x3c4, float:1.351E-42)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r7.setInjectedMailboxType_DO_NOT_USE(r2)
            java.lang.Object r5 = r1.A02
            X.Oan r5 = (X.C71068Oan) r5
            X.OMh r4 = new X.OMh
            r4.<init>(r0)
            r5.A03 = r4
            java.lang.Object r3 = r1.A01
            r2 = 13
            X.OoW r1 = new X.OoW
            r1.<init>(r2, r5, r3, r0)
            r4.A00(r1)
            goto L_0x0e26
        L_0x074e:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x0751:
            X.KgM r0 = (X.C62471KgM) r0
            r3 = -1
            if (r0 == 0) goto L_0x0e26
            int r2 = r0.ordinal()
            if (r2 == r3) goto L_0x0e26
            r4 = 0
            if (r2 == r4) goto L_0x0780
            r0 = 1
            if (r2 == r0) goto L_0x076a
            r0 = 2
            if (r2 == r0) goto L_0x076a
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x076a:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            java.lang.Object r3 = r1.A02
            X.QBy r3 = (X.C7414QBy) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.0eP[] r0 = new X.0eP[r4]
            X.C7414QBy.A00(r3, r2, r1, r0)
            goto L_0x0e26
        L_0x0780:
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            goto L_0x0811
        L_0x0786:
            X.2YQ r0 = (X.AnonymousClass2YQ) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.2Ws r2 = X.2Z7.A02
            java.lang.Object r3 = r0.A00(r2)
            if (r3 == 0) goto L_0x07a4
            android.app.Application r3 = (android.app.Application) r3
            java.lang.Object r2 = r1.A01
            X.RRG r2 = (X.RRG) r2
            java.lang.Object r1 = r1.A02
            X.Tfa r1 = (X.C13712Tfa) r1
            X.Jfk r0 = new X.Jfk
            r0.<init>(r3, r2, r1)
            return r0
        L_0x07a4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x07a9:
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            java.lang.Object r2 = A00(r0, r1)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Object r1 = r1.A01
            java.lang.Enum r1 = (java.lang.Enum) r1
            com.google.common.collect.ImmutableList r0 = r2.parseEnumList(r0, r1)
            return r0
        L_0x07ba:
            X.Tbs r0 = (X.C13523Tbs) r0
            java.lang.Object r2 = A00(r0, r1)
            X.SGo r2 = (X.C11230SGo) r2
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            r0.DZr(r2, r1)
            goto L_0x0e26
        L_0x07cb:
            X.Tbt r0 = (X.C13524Tbt) r0
            java.lang.Object r2 = A00(r0, r1)
            X.SGo r2 = (X.C11230SGo) r2
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            r0.Db1(r2, r1)
            goto L_0x0e26
        L_0x07dc:
            X.Tbu r0 = (X.C13525Tbu) r0
            java.lang.Object r2 = A00(r0, r1)
            X.SGo r2 = (X.C11230SGo) r2
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            r0.Db6(r2, r1)
            goto L_0x0e26
        L_0x07ed:
            X.Tbw r0 = (X.C13527Tbw) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A01
            X.SGo r2 = (X.C11230SGo) r2
            java.lang.Object r1 = r1.A02
            java.util.List r1 = (java.util.List) r1
            r0.DlO(r2, r1)
            goto L_0x0e26
        L_0x0800:
            java.lang.Object r2 = r1.A01
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r0 = r1.A02
            android.view.View r0 = (android.view.View) r0
            r2.removeView(r0)
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L_0x0e26
        L_0x0811:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x0e26
        L_0x0818:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x088b
            java.util.LinkedHashSet r15 = X.DbS.A0y()
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x082b
            r15.add(r0)
        L_0x082b:
            java.lang.Object r3 = r1.A02
            X.S6S r3 = (X.S6S) r3
            java.util.Map r2 = r3.A04
            java.lang.String r0 = "target_operation"
            java.lang.Object r8 = r2.get(r0)
            X.DbS.A1Y(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "ptt_payload"
            java.lang.Object r7 = r2.get(r0)
            if (r7 != 0) goto L_0x084a
            X.0sm r7 = X.0Yt.A0E()
        L_0x084a:
            java.lang.String r9 = r3.A03
            java.lang.Object r0 = r1.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.util.Map r14 = X.S9s.A01(r0)
            X.0qQ.A07(r14)
            X.5A3 r4 = X.AnonymousClass2E0.A06()
            X.0qQ.A07(r4)
            X.SOC r3 = X.AnonymousClass2E0.A04()
            X.0qQ.A07(r3)
            X.SSZ r2 = X.SOC.A01()
            r1 = 1
            X.0qQ.A0B(r8, r1)
            X.SvS r0 = new X.SvS
            r0.<init>(r2, r1)
            r10 = 0
            X.SvQ r6 = X.C11095S9w.A00(r0, r15)
            X.SFo r5 = new X.SFo
            r11 = r10
            r12 = r10
            r13 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.Qnb r0 = X.SQA.A03(r3, r4, r5)
            X.QCn r0 = X.SSC.A03(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x088b:
            r1 = 0
            X.SUj r1 = X.SUj.A06(r0, r1)
            X.2Fj r0 = new X.2Fj
            r0.<init>(r1)
            return r0
        L_0x0896:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A01
            X.0sP r2 = (X.0sP) r2
            r2.invoke(r0)
            java.lang.Object r1 = r1.A02
            goto L_0x08af
        L_0x08a4:
            java.lang.Object r2 = A00(r0, r1)
            X.0sP r2 = (X.0sP) r2
            r2.invoke(r0)
            java.lang.Object r1 = r1.A01
        L_0x08af:
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment"
            X.0qQ.A0C(r1, r0)
            X.Qxp r1 = (X.C8608Qxp) r1
            r1.D68()
            r0 = 0
            return r0
        L_0x08be:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0U(r0)
            if (r2 != 0) goto L_0x09bb
            r5 = 0
            if (r0 == 0) goto L_0x0a95
            java.lang.Object r2 = r0.A01
            X.QXI r2 = (X.QXI) r2
            if (r2 == 0) goto L_0x0a95
            X.QXk r3 = r2.A0E()
            if (r3 == 0) goto L_0x0a95
            X.QXG r2 = r3.A0G()
            if (r2 == 0) goto L_0x0a54
            X.QXW r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a54
            X.QUi r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a54
            X.QVG r4 = X.Pxj.A0S(r2)
            if (r4 == 0) goto L_0x0a54
        L_0x08ed:
            r3 = 0
            java.lang.String r2 = "error_code"
            int r4 = r4.getCoercedIntField(r3, r2)
        L_0x08f4:
            java.lang.Object r2 = r0.A01
            X.QXI r2 = (X.QXI) r2
            if (r2 == 0) goto L_0x0a9a
            X.QXk r6 = r2.A0E()
            if (r6 == 0) goto L_0x0a9a
            X.QXG r2 = r6.A0G()
            if (r2 == 0) goto L_0x0a14
            X.QXW r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a14
            X.QUi r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a14
            X.QVG r3 = X.Pxj.A0S(r2)
            if (r3 == 0) goto L_0x0a14
            java.lang.String r2 = "error_title"
            java.lang.String r8 = r3.A0B(r2)
            if (r8 == 0) goto L_0x0a14
        L_0x0920:
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0a11
            java.lang.Object r6 = r0.A01
            X.QXI r6 = (X.QXI) r6
            if (r6 == 0) goto L_0x0951
            X.QXk r9 = r6.A0E()
            if (r9 == 0) goto L_0x0951
            X.QXG r2 = r9.A0G()
            if (r2 == 0) goto L_0x09ce
            X.QXW r2 = r2.A0E()
            if (r2 == 0) goto L_0x09ce
            X.QUi r2 = r2.A0E()
            if (r2 == 0) goto L_0x09ce
            X.QVG r3 = X.Pxj.A0S(r2)
            if (r3 == 0) goto L_0x09ce
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r3.A0C(r2)
            if (r2 == 0) goto L_0x09ce
        L_0x0950:
            r7 = r2
        L_0x0951:
            if (r6 == 0) goto L_0x0a11
            X.QXk r3 = r6.A0E()
            if (r3 == 0) goto L_0x0a11
            X.QXG r2 = r3.A0G()
            if (r2 == 0) goto L_0x096b
            X.QXW r2 = r2.A0E()
            if (r2 == 0) goto L_0x096b
            java.lang.Enum r6 = X.Pxj.A0f(r2)
            if (r6 != 0) goto L_0x0991
        L_0x096b:
            X.QXF r2 = r3.A0F()
            if (r2 == 0) goto L_0x097f
            X.QXN r2 = r2.A0E()
            if (r2 == 0) goto L_0x097f
            java.lang.Enum r6 = X.Pxj.A0f(r2)
            X.HNF r6 = (X.HNF) r6
            if (r6 != 0) goto L_0x0991
        L_0x097f:
            X.QXH r2 = r3.A0H()
            if (r2 == 0) goto L_0x0a11
            X.QXb r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a11
            java.lang.Enum r6 = X.Pxj.A0f(r2)
            X.HNF r6 = (X.HNF) r6
        L_0x0991:
            if (r6 == 0) goto L_0x0998
            X.HNF r3 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 1
            if (r6 != r3) goto L_0x0999
        L_0x0998:
            r2 = 0
        L_0x0999:
            if (r2 == 0) goto L_0x09b1
            java.lang.Throwable r0 = r0.A02
            if (r0 != 0) goto L_0x09ad
            if (r8 == 0) goto L_0x09a7
            boolean r0 = X.00l.A0W(r8)
            if (r0 == 0) goto L_0x09a9
        L_0x09a7:
            java.lang.String r8 = "Unknown Server Error For Contact Info Mutation"
        L_0x09a9:
            X.TQk r0 = X.C9677Rev.A00(r8, r7, r4)
        L_0x09ad:
            X.SUj r0 = X.SUj.A0A(r5, r0)
        L_0x09b1:
            java.lang.Object r2 = r1.A02
            X.0sP r2 = (X.0sP) r2
            X.0qQ.A0A(r0)
            r2.invoke(r0)
        L_0x09bb:
            java.lang.Object r2 = r1.A01
            X.0sP r2 = (X.0sP) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A01
            java.lang.Object r1 = r2.invoke(r1)
            X.SUj r0 = X.SUj.A06(r0, r1)
            return r0
        L_0x09ce:
            X.QXF r2 = r9.A0F()
            if (r2 == 0) goto L_0x09ee
            X.QXN r2 = r2.A0E()
            if (r2 == 0) goto L_0x09ee
            X.QSH r2 = r2.A0E()
            if (r2 == 0) goto L_0x09ee
            X.QVG r3 = X.Pxj.A0S(r2)
            if (r3 == 0) goto L_0x09ee
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r3.A0C(r2)
            if (r2 != 0) goto L_0x0950
        L_0x09ee:
            X.QXH r2 = r9.A0H()
            if (r2 == 0) goto L_0x0a0e
            X.QXb r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a0e
            X.QVE r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a0e
            X.QVG r3 = X.Pxj.A0S(r2)
            if (r3 == 0) goto L_0x0a0e
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r3.A0C(r2)
            if (r2 != 0) goto L_0x0950
        L_0x0a0e:
            r2 = r7
            goto L_0x0950
        L_0x0a11:
            r6 = r5
            goto L_0x0991
        L_0x0a14:
            X.QXF r2 = r6.A0F()
            if (r2 == 0) goto L_0x0a34
            X.QXN r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a34
            X.QSH r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a34
            X.QVG r3 = X.Pxj.A0S(r2)
            if (r3 == 0) goto L_0x0a34
            java.lang.String r2 = "error_title"
            java.lang.String r8 = r3.A0B(r2)
            if (r8 != 0) goto L_0x0920
        L_0x0a34:
            X.QXH r2 = r6.A0H()
            if (r2 == 0) goto L_0x0a9a
            X.QXb r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a9a
            X.QVE r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a9a
            X.QVG r3 = X.Pxj.A0S(r2)
            if (r3 == 0) goto L_0x0a9a
            java.lang.String r2 = "error_title"
            java.lang.String r8 = r3.A0B(r2)
            goto L_0x0920
        L_0x0a54:
            X.QXF r2 = r3.A0F()
            if (r2 == 0) goto L_0x0a6e
            X.QXN r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a6e
            X.QSH r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a6e
            X.QVG r4 = X.Pxj.A0S(r2)
            if (r4 == 0) goto L_0x0a6e
            goto L_0x08ed
        L_0x0a6e:
            X.QXH r2 = r3.A0H()
            if (r2 == 0) goto L_0x0a95
            X.QXb r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a95
            X.QVE r2 = r2.A0E()
            if (r2 == 0) goto L_0x0a95
            X.QVG r4 = X.Pxj.A0S(r2)
            if (r4 == 0) goto L_0x0a95
            r3 = 0
            java.lang.String r2 = "error_code"
            int r4 = r4.getCoercedIntField(r3, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            if (r2 == 0) goto L_0x0a95
            goto L_0x08f4
        L_0x0a95:
            r4 = 0
            if (r0 == 0) goto L_0x0a9a
            goto L_0x08f4
        L_0x0a9a:
            r8 = r5
            goto L_0x0920
        L_0x0a9d:
            X.1Ln r0 = (X.1Ln) r0
            X.QHr r3 = new X.QHr
            r3.<init>()
            java.lang.Object r2 = r1.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r2 = "apm"
            X.Pxg.A1J(r0, r3, r2)
            java.lang.Object r1 = r1.A01
            X.C51969G9p.A1G(r0, r1)
            return r0
        L_0x0ab6:
            X.1Ln r0 = (X.1Ln) r0
            X.QHv r3 = new X.QHv
            r3.<init>()
            java.lang.Object r2 = r1.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.SQ1.A03(r3, r2)
            java.lang.String r2 = "event_payload"
            r0.A0N(r3, r2)
            java.lang.Object r1 = r1.A01
            X.C51969G9p.A1G(r0, r1)
            return r0
        L_0x0acf:
            X.SUj r4 = X.Pxf.A0P(r0)
            java.lang.Object r3 = r1.A02
            X.QDN r3 = (X.QDN) r3
            java.lang.Object r2 = r1.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r2 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r2
            X.2gB r1 = r3.A0r
            X.ScV r0 = X.C11570ScV.A00
            X.SUj.A0E(r0, r1, r4)
            java.lang.String r0 = "checkout"
            X.STa.A02(r2, r3, r4, r0)
            goto L_0x0e26
        L_0x0ae9:
            X.SUj r2 = X.Pxf.A0P(r0)
            java.lang.Object r6 = r1.A02
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            X.5tb r4 = X.C298525tb.INCENTIVES
            java.lang.Object r0 = r1.A01
            X.SJK r0 = (X.SJK) r0
            java.lang.String r7 = r0.A09
            com.facebookpay.otc.models.OtcInput r0 = r0.A04
            if (r0 == 0) goto L_0x0b20
            X.SEB r5 = X.C11300SKk.A01(r0)
        L_0x0b01:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r8 = 1
            X.IoE r3 = new X.IoE
            r3.<init>(r4, r5, r6, r7, r8)
            r13 = 20
            X.PqV r8 = new X.PqV
            r9 = r4
            r10 = r5
            r11 = r6
            r12 = r7
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r12, (int) r13)
            X.SUU.A0B(r2, r3, r8)
            X.Scd r0 = X.C11578Scd.A00
            X.SUj r0 = X.SUj.A03(r0, r2)
            return r0
        L_0x0b20:
            r5 = 0
            goto L_0x0b01
        L_0x0b22:
            X.3lr r0 = (X.C250663lr) r0
            java.lang.Object r4 = r1.A02
            X.QgP r4 = (X.C8071QgP) r4
            java.lang.String r3 = "client_fetch_payouthub_init"
            java.lang.String r2 = "BSC_PAYOUT_HUB_OVERVIEW"
            X.C8071QgP.A04(r4, r3, r2)
            java.lang.String r2 = "fetch_init"
            X.C8071QgP.A03(r4, r2)
            java.lang.Object r2 = r1.A01
            X.0r1 r2 = (X.0r1) r2
            r1 = 1
            r2.A00 = r1
            X.0eM r1 = r4.A06
            java.lang.Object r5 = r1.getValue()
            java.lang.String r6 = r4.A03
            java.lang.String r7 = X.Pxh.A0j(r0)
            if (r7 == 0) goto L_0x0b5e
            com.facebookpay.msc.logging.LoggingData r0 = r4.A0E()
            java.lang.String r8 = r0.A00
            X.5A3 r0 = X.AnonymousClass2E0.A06()
            r9 = 0
            X.Sc9 r4 = new X.Sc9
            r4.<init>(r5, r6, r7, r8, r9)
            X.QCn r0 = X.C8282QnO.A00(r4, r0)
            return r0
        L_0x0b5e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0b63:
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r6 = r1.A02
            X.QgP r6 = (X.C8071QgP) r6
            X.SUj.A0N(r6, r0)
            java.lang.Object r7 = r0.A01
            X.3lr r7 = (X.C250663lr) r7
            r18 = 0
            if (r7 == 0) goto L_0x0c5f
            java.lang.Class<X.QUM> r4 = X.QUM.class
            r5 = 0
            java.lang.String r3 = "xfb_business_payments_hub(interface_type:$interface_type,page_id:$page_id)"
            r2 = -1297366219(0xffffffffb2abc335, float:-1.999579E-8)
            X.3lr r4 = r7.getOptionalTreeField(r5, r3, r4, r2)
            if (r4 == 0) goto L_0x0c5f
            java.lang.Class<X.QUL> r3 = X.QUL.class
            r2 = -818158878(0xffffffffcf3be2e2, float:-3.15220838E9)
            X.3lr r7 = r4.reinterpretRequired(r5, r3, r2)
            X.QUL r7 = (X.QUL) r7
        L_0x0b8e:
            r6.A01 = r7
            boolean r2 = X.SUj.A0V(r0)
            r5 = 0
            if (r2 == 0) goto L_0x0da6
            if (r7 == 0) goto L_0x0c5b
            java.lang.Class<X.QUK> r4 = X.QUK.class
            java.lang.String r3 = "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)"
            r2 = 12954690(0xc5ac42, float:1.8153387E-38)
            X.3lr r7 = r7.getOptionalTreeField(r5, r3, r4, r2)
            if (r7 == 0) goto L_0x0c5b
            java.lang.Class<X.QUI> r4 = X.QUI.class
            java.lang.String r3 = "earnings_summary"
            r2 = -2099388650(0xffffffff82dddf16, float:-3.2601076E-37)
            X.3lr r4 = r7.getOptionalTreeField(r5, r3, r4, r2)
            if (r4 == 0) goto L_0x0c5b
            java.lang.Class<X.QSB> r3 = X.QSB.class
            r2 = 1460520019(0x570dc453, float:1.55874346E14)
            X.3lr r13 = r4.reinterpretRequired(r5, r3, r2)
        L_0x0bbd:
            X.QUL r7 = r6.A01
            if (r7 == 0) goto L_0x0c58
            java.lang.Class<X.QUK> r4 = X.QUK.class
            java.lang.String r3 = "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)"
            r2 = 12954690(0xc5ac42, float:1.8153387E-38)
            X.3lr r7 = r7.getOptionalTreeField(r5, r3, r4, r2)
            if (r7 == 0) goto L_0x0c58
            java.lang.Class<X.QUJ> r4 = X.QUJ.class
            java.lang.String r3 = "payouts_summary"
            r2 = -1386915079(0xffffffffad555af9, float:-1.2127848E-11)
            X.3lr r4 = r7.A02(r4, r3, r2)
            if (r4 == 0) goto L_0x0c58
            java.lang.Class<X.QVC> r3 = X.QVC.class
            r2 = -464193101(0xffffffffe454f9b3, float:-1.571481E22)
            X.3lr r12 = r4.reinterpretRequired(r5, r3, r2)
        L_0x0be6:
            r24 = 0
            if (r13 == 0) goto L_0x0cd0
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.lang.Class<X.QSA> r3 = X.QSA.class
            java.lang.String r4 = "last_total_earnings"
            r2 = -227400363(0xfffffffff2722555, float:-4.7961923E30)
            X.3lr r3 = r13.A03(r3, r4, r2)
            if (r3 == 0) goto L_0x0c06
            java.lang.String r2 = "formatted_amount"
            java.lang.String r2 = r3.getOptionalStringField(r5, r2)
            if (r2 == 0) goto L_0x0c06
            r11.put(r4, r2)
        L_0x0c06:
            java.lang.String r3 = "last_total_earnings_date_delta_text"
            java.lang.String r2 = r13.A08(r3)
            if (r2 == 0) goto L_0x0c11
            r11.put(r3, r2)
        L_0x0c11:
            java.lang.String r3 = "last_total_earnings_percentage_delta_text"
            java.lang.String r2 = r13.A09(r3)
            if (r2 == 0) goto L_0x0c1c
            r11.put(r3, r2)
        L_0x0c1c:
            r17 = 3
            java.lang.String r4 = "last_total_earnings_percentage_delta"
            r2 = r17
            double r2 = r13.getCoercedDoubleField(r2, r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r11.put(r4, r2)
            java.lang.Class<X.QS7> r4 = X.QS7.class
            r15 = 4
            java.lang.String r3 = "balance_info"
            r2 = 1803758097(0x6b832a11, float:3.1713587E26)
            com.google.common.collect.ImmutableList r2 = X.C41845B3m.A0X(r13, r4, r3, r15, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x0c41:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0c63
            X.3lr r4 = X.C41845B3m.A0V(r8)
            java.lang.Class<X.QRF> r3 = X.QRF.class
            r2 = -1030959618(0xffffffffc28ccdfe, float:-70.40233)
            X.3lr r2 = r4.reinterpretRequired(r5, r3, r2)
            r7.add(r2)
            goto L_0x0c41
        L_0x0c58:
            r12 = r18
            goto L_0x0be6
        L_0x0c5b:
            r13 = r18
            goto L_0x0bbd
        L_0x0c5f:
            r7 = r18
            goto L_0x0b8e
        L_0x0c63:
            java.util.Iterator r16 = r7.iterator()
        L_0x0c67:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0cd2
            X.3lr r10 = X.C41845B3m.A0V(r16)
            java.lang.Class<X.QRE> r3 = X.QRE.class
            r14 = 1
            java.lang.String r9 = "balance_amount"
            r2 = -1912732913(0xffffffff8dfe030f, float:-1.5654695E-30)
            X.3lr r3 = r10.getOptionalTreeField(r14, r9, r3, r2)
            if (r3 == 0) goto L_0x0ccd
            java.lang.String r2 = "formatted_amount"
            java.lang.String r8 = r3.getOptionalStringField(r5, r2)
        L_0x0c85:
            java.lang.String r7 = ""
            if (r8 != 0) goto L_0x0c8a
            r8 = r7
        L_0x0c8a:
            java.lang.String r4 = "balance_status_text"
            java.lang.String r2 = r10.getOptionalStringField(r5, r4)
            if (r2 == 0) goto L_0x0c93
            r7 = r2
        L_0x0c93:
            X.RGF r3 = X.RGF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "balance_type"
            java.lang.Enum r2 = r10.getOptionalEnumField(r15, r2, r3)
            X.RGF r2 = (X.RGF) r2
            if (r2 == 0) goto L_0x0c67
            int r3 = r2.ordinal()
            r2 = r17
            if (r3 == r2) goto L_0x0cc0
            if (r3 == r14) goto L_0x0cb9
            r2 = 2
            if (r3 != r2) goto L_0x0c67
            java.lang.String r2 = "next_payout_balance_amount"
            r11.put(r2, r8)
            java.lang.String r2 = "next_payout_balance_status_text"
            r11.put(r2, r7)
            goto L_0x0c67
        L_0x0cb9:
            r11.put(r9, r8)
            r11.put(r4, r7)
            goto L_0x0c67
        L_0x0cc0:
            java.lang.String r2 = "pending_balance_amount"
            r11.put(r2, r8)
            java.lang.String r2 = "pending_balance_status_text"
            r11.put(r2, r7)
            goto L_0x0c67
        L_0x0ccd:
            r8 = r18
            goto L_0x0c85
        L_0x0cd0:
            r11 = r18
        L_0x0cd2:
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            if (r13 == 0) goto L_0x0d3a
            java.lang.Class<X.QS9> r8 = X.QS9.class
            r7 = 5
            java.lang.String r3 = "earnings_breakdown_by_source"
            r2 = -344347840(0xffffffffeb79ab40, float:-3.0183123E26)
            com.google.common.collect.ImmutableList r2 = r13.getRequiredCompactedTreeListField(r7, r3, r8, r2)
            if (r2 == 0) goto L_0x0d3a
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x0cee:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0d05
            X.3lr r7 = X.C41845B3m.A0V(r8)
            java.lang.Class<X.QS2> r3 = X.QS2.class
            r2 = -984072569(0xffffffffc5583e87, float:-3459.908)
            X.3lr r2 = r7.reinterpretRequired(r5, r3, r2)
            r9.add(r2)
            goto L_0x0cee
        L_0x0d05:
            java.util.Iterator r14 = r9.iterator()
        L_0x0d09:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0d3a
            X.3lr r13 = X.C41845B3m.A0V(r14)
            java.lang.String r2 = "source_name"
            java.lang.String r8 = r13.getOptionalStringField(r5, r2)
            java.lang.String r7 = ""
            if (r8 != 0) goto L_0x0d1f
            r8 = r7
        L_0x0d1f:
            java.lang.Class<X.QS0> r10 = X.QS0.class
            r9 = 3
            java.lang.String r3 = "aggregated_payout_amount"
            r2 = 599306932(0x23b8b2b4, float:2.0025004E-17)
            X.3lr r3 = r13.getOptionalTreeField(r9, r3, r10, r2)
            if (r3 == 0) goto L_0x0d36
            java.lang.String r2 = "formatted_amount"
            java.lang.String r2 = r3.getOptionalStringField(r5, r2)
            if (r2 == 0) goto L_0x0d36
            r7 = r2
        L_0x0d36:
            r4.put(r8, r7)
            goto L_0x0d09
        L_0x0d3a:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0d42
            r24 = r4
        L_0x0d42:
            if (r12 == 0) goto L_0x0de8
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.Class<X.QVB> r3 = X.QVB.class
            java.lang.String r7 = "last_payout_total_amount"
            r2 = 154196798(0x930db3e, float:2.1288317E-33)
            X.3lr r3 = r12.getOptionalTreeField(r5, r7, r3, r2)
            if (r3 == 0) goto L_0x0d60
            java.lang.String r2 = "formatted_amount"
            java.lang.String r2 = r3.getOptionalStringField(r5, r2)
            if (r2 == 0) goto L_0x0d60
            r4.put(r7, r2)
        L_0x0d60:
            java.lang.String r3 = "last_total_payouts_percentage_delta_text"
            java.lang.String r2 = r12.A09(r3)
            if (r2 == 0) goto L_0x0d6b
            r4.put(r3, r2)
        L_0x0d6b:
            r2 = 3
            java.lang.String r7 = "last_total_payouts_percentage_delta"
            double r2 = r12.getCoercedDoubleField(r2, r7)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.put(r7, r2)
            java.lang.String r3 = "last_payout_paid_date"
            java.lang.String r2 = r12.A08(r3)
            if (r2 == 0) goto L_0x0d84
            r4.put(r3, r2)
        L_0x0d84:
            java.lang.String r17 = "client_fetch_payouthub_success"
            java.lang.String r19 = "BSC_PAYOUT_HUB_OVERVIEW"
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r11
            r25 = r4
            r16 = r6
            X.C8071QgP.A05(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r1.A01
            X.0r1 r3 = (X.0r1) r3
            boolean r2 = r3.A00
            if (r2 == 0) goto L_0x0da6
            java.lang.String r2 = "fetch_success"
            X.C8071QgP.A03(r6, r2)
            r3.A00 = r5
        L_0x0da6:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0de1
            X.QDP.A01(r6, r5)
            r8 = 0
            java.lang.Throwable r0 = r0.A02
            if (r0 == 0) goto L_0x0de5
            java.lang.String r10 = r0.getMessage()
            java.lang.String r11 = X.2Og.A00(r0)
            java.lang.Class r0 = r0.getClass()
            if (r0 == 0) goto L_0x0dc6
            java.lang.String r18 = r0.getSimpleName()
        L_0x0dc6:
            java.lang.String r7 = "client_fetch_payouthub_fail"
            java.lang.String r9 = "BSC_PAYOUT_HUB_OVERVIEW"
            r12 = r18
            r13 = r8
            r14 = r8
            r15 = r8
            X.C8071QgP.A05(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = r1.A01
            X.0r1 r1 = (X.0r1) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0de1
            java.lang.String r0 = "fetch_fail"
            X.C8071QgP.A03(r6, r0)
            r1.A00 = r5
        L_0x0de1:
            X.C8071QgP.A02(r6)
            goto L_0x0e26
        L_0x0de5:
            r10 = r8
            r11 = r8
            goto L_0x0dc6
        L_0x0de8:
            r4 = 0
            goto L_0x0d84
        L_0x0dea:
            java.lang.Object r5 = X.SR4.A00(r0)
            X.Tae r5 = (X.C13451Tae) r5
            if (r5 == 0) goto L_0x0e26
            java.lang.Object r2 = r1.A01
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r1.A02
            X.QDD r4 = (X.QDD) r4
            boolean r0 = r5 instanceof X.Su0
            if (r0 == 0) goto L_0x0e26
            X.Su0 r5 = (X.Su0) r5
            java.lang.String r0 = r5.A01
            java.lang.Object r1 = r2.get(r0)
            X.0eP r1 = (X.0eP) r1
            if (r1 == 0) goto L_0x0e29
            java.lang.Object r0 = r1.A00
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r2 = r1.A01
            X.Qh7 r2 = (X.C8115Qh7) r2
            if (r2 == 0) goto L_0x0e1d
            android.os.Bundle r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A0F(r1, r0)
        L_0x0e1d:
            X.2Fj r0 = r4.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x0e23:
            r0.A0B(r1)
        L_0x0e26:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0e29:
            int r0 = r2.size()
            int r3 = r0 + -1
            goto L_0x0e1d
        L_0x0e30:
            com.facebookpay.offsite.models.message.AvailabilityResponse r0 = (com.facebookpay.offsite.models.message.AvailabilityResponse) r0
            java.lang.Object r5 = r1.A02
            X.SuM r5 = (X.C12435SuM) r5
            java.lang.Object r8 = r1.A01
            com.facebookpay.offsite.models.message.PaymentRequest r8 = (com.facebookpay.offsite.models.message.PaymentRequest) r8
            X.0qQ.A0A(r0)
            r7 = r5
            X.QhG r7 = (X.C8124QhG) r7
            X.AnonymousClass7TG.A1N(r8, r0)
            X.Til r1 = r7.A00
            X.RRI r6 = r1.AZu()
            boolean r1 = r6 instanceof X.C8121QhD
            if (r1 == 0) goto L_0x0ebe
            com.facebookpay.offsite.models.message.AvailableMessageContent r1 = r0.content
            if (r1 == 0) goto L_0x0ebc
            java.lang.String r2 = r1.availability
        L_0x0e53:
            java.lang.String r1 = "AVAILABLE"
            boolean r9 = X.0qQ.A0K(r2, r1)
        L_0x0e59:
            if (r9 == 0) goto L_0x0eb8
            com.facebookpay.offsite.models.message.PaymentRequestContent r8 = r8.content
            X.Til r1 = r7.A00
            java.lang.String r9 = r1.getProductId()
            X.0eM r1 = r7.A07
            java.lang.Object r1 = r1.getValue()
            com.facebookpay.offsite.base.CheckoutHandler r1 = (com.facebookpay.offsite.base.CheckoutHandler) r1
            r4 = 0
            java.lang.String r2 = r1.A0C(r4)
            X.S6a r1 = r7.A00()
            if (r1 == 0) goto L_0x0e78
            java.lang.String r4 = r1.A01
        L_0x0e78:
            java.util.LinkedHashMap r3 = X.C51972G9s.A0t(r8)
            com.facebookpay.logging.LoggingContext r2 = X.C11418SSt.A00(r2, r9)
            java.lang.String r1 = "logging_context"
            r3.put(r1, r2)
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r8.paymentConfiguration
            java.lang.String r2 = r1.partnerId
            java.lang.String r1 = "PARTNER_ID"
            r3.put(r1, r2)
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r8.paymentConfiguration
            java.lang.String r2 = r1.partnerMerchantId
            java.lang.String r1 = "PARTNER_MERCHANT_ID"
            r3.put(r1, r2)
            if (r4 == 0) goto L_0x0e9e
            java.lang.String r1 = "AD_ID"
            r3.put(r1, r4)
        L_0x0e9e:
            java.lang.String r2 = "VIEW_NAME"
            java.lang.String r1 = "OFFSITE_FOOTER"
            r3.put(r2, r1)
            r6.A01 = r3
            r6.A02()
        L_0x0eaa:
            X.S3p r2 = r5.A05
            com.facebookpay.offsite.models.message.GsonUtils r1 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            java.lang.String r0 = r1.getToJson(r0)
            r2.A00(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0eb8:
            r6.A01()
            goto L_0x0eaa
        L_0x0ebc:
            r2 = 0
            goto L_0x0e53
        L_0x0ebe:
            r9 = 0
            com.facebookpay.offsite.models.message.AvailableMessageContent r1 = r0.content
            if (r1 == 0) goto L_0x0eea
            java.lang.String r2 = r1.availability
        L_0x0ec5:
            java.lang.String r1 = "AVAILABLE"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0e59
            com.instagram.common.session.UserSession r2 = X.C11431STx.A00()
            X.0Tu r1 = X.0Tu.A05
            r3 = 36314498246642323(0x8103d800300a93, double:3.0287731456995134E-306)
            X.182.A06(r1, r2, r3)
            com.instagram.common.session.UserSession r2 = X.C11431STx.A00()
            X.0Tu r1 = X.0Tu.A06
            boolean r1 = X.182.A06(r1, r2, r3)
            if (r1 == 0) goto L_0x0e59
            r9 = 1
            goto L_0x0e59
        L_0x0eea:
            r2 = 0
            goto L_0x0ec5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TYA.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TYA(Fragment fragment, 0sP r3, int i) {
        super(1);
        this.A00 = i;
        if (37 - i != 0) {
            this.A02 = r3;
            this.A01 = fragment;
        } else {
            this.A01 = r3;
            this.A02 = fragment;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TYA(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
