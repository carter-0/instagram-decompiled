package X;

import java.util.concurrent.Executor;

/* renamed from: X.IwR  reason: case insensitive filesystem */
public final class C58718IwR extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58718IwR(AnonymousClass07V r2, AnonymousClass0hF r3, int i) {
        super(0);
        this.A00 = i;
        if (21 - i != 0) {
            this.A02 = r2;
            this.A01 = r3;
        } else {
            this.A01 = r2;
            this.A02 = r3;
        }
    }

    public static C55841HoO A00(WGX wgx, C19005WGg wGg) {
        C17995VjX vjX = wGg.A05;
        C17308VQn A012 = vjX.A01();
        0qQ.A07(A012);
        VLN A002 = vjX.A00();
        Executor executor = ((C64731Tf) wGg.A04).A01;
        return new C55841HoO(wgx, A002, wGg.A02, A012, executor, executor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.5Tl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.5Tl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.5Tl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.GeN} */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.Rhq] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0368, code lost:
        r1.A0A((X.AnonymousClass07Y) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x049a, code lost:
        r6 = X.C52887GeN.A00;
        r3 = ((X.I1S) r14.A01).A00;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04c1, code lost:
        if (r0 == false) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04c3, code lost:
        r3.Epw(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0535, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        X.AnonymousClass7TE.A1Z(new X.C59676JTh((java.lang.Object) r4, r2, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0209, code lost:
        r3.A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02c0, code lost:
        X.C307886Rw.A03(r2, r3, r1, r3.A0A(r0));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x052a;
                case 1: goto L_0x0509;
                case 2: goto L_0x04e8;
                case 3: goto L_0x04c7;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0005;
                case 6: goto L_0x00a1;
                case 7: goto L_0x0005;
                case 8: goto L_0x0083;
                case 9: goto L_0x04a3;
                case 10: goto L_0x0048;
                case 11: goto L_0x0033;
                case 12: goto L_0x0493;
                case 13: goto L_0x048a;
                case 14: goto L_0x0482;
                case 15: goto L_0x047a;
                case 16: goto L_0x03a6;
                case 17: goto L_0x0396;
                case 18: goto L_0x037c;
                case 19: goto L_0x0026;
                case 20: goto L_0x036f;
                case 21: goto L_0x0362;
                case 22: goto L_0x034c;
                case 23: goto L_0x0345;
                case 24: goto L_0x0328;
                case 25: goto L_0x0319;
                case 26: goto L_0x02f3;
                case 27: goto L_0x0536;
                case 28: goto L_0x02de;
                case 29: goto L_0x02c9;
                case 30: goto L_0x02a7;
                case 31: goto L_0x028d;
                case 32: goto L_0x0273;
                case 33: goto L_0x024a;
                case 34: goto L_0x023b;
                case 35: goto L_0x022d;
                case 36: goto L_0x020e;
                case 37: goto L_0x01f8;
                case 38: goto L_0x01e5;
                case 39: goto L_0x01a9;
                case 40: goto L_0x0186;
                case 41: goto L_0x0178;
                case 42: goto L_0x013e;
                case 43: goto L_0x00b9;
                case 44: goto L_0x0129;
                case 45: goto L_0x0114;
                case 46: goto L_0x00ea;
                case 47: goto L_0x00d9;
                case 48: goto L_0x0548;
                case 49: goto L_0x00be;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r14.A02
            X.GZF r4 = (X.GZF) r4
            java.lang.Object r3 = r14.A01
            X.4Cq r3 = (X.C262224Cq) r3
            X.5Oz r0 = r4.A0R
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x00b6
            r2 = 0
            r1 = 15
        L_0x0018:
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x0020:
            r0 = 1
        L_0x0021:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0025:
            return r4
        L_0x0026:
            java.lang.Object r1 = r14.A02
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            java.lang.Object r0 = r14.A01
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            boolean r0 = X.C58718IwR.super.dispatchKeyEvent(r0)
            goto L_0x0021
        L_0x0033:
            java.lang.Object r0 = r14.A02
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.0sP r2 = r0.A0N
            java.lang.Object r0 = r14.A01
            X.5Uc r0 = (X.C286145Uc) r0
            int r1 = r0.A01
            androidx.compose.ui.text.input.ImeAction r0 = new androidx.compose.ui.text.input.ImeAction
            r0.<init>(r1)
            r2.invoke(r0)
            goto L_0x0020
        L_0x0048:
            java.lang.Object r6 = r14.A02
            X.I0h r6 = (X.I0h) r6
            if (r6 == 0) goto L_0x005c
            X.6HD r5 = r6.A02
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x005f
            X.5Tq r4 = r6.A00
        L_0x0058:
            r6.A00 = r4
            if (r4 != 0) goto L_0x0025
        L_0x005c:
            java.lang.Object r4 = r14.A01
            return r4
        L_0x005f:
            r4 = 0
            X.6Bd r3 = X.C51969G9p.A0b()
            X.5Tq r0 = r6.A03
            r3.A05(r0)
            X.HhX r2 = new X.HhX
            r2.<init>(r3)
            int r1 = r5.size()
        L_0x0072:
            if (r4 >= r1) goto L_0x007e
            java.lang.Object r0 = r5.get(r4)
            X.C51965G9l.A1W(r0, r2)
            int r4 = r4 + 1
            goto L_0x0072
        L_0x007e:
            X.5Tq r4 = r3.A02()
            goto L_0x0058
        L_0x0083:
            java.lang.Object r4 = r14.A02
            r2 = 0
            if (r4 != 0) goto L_0x0025
            java.lang.Object r1 = r14.A01
            X.4ch r1 = (X.C268064ch) r1
            boolean r0 = r1.COx()
            if (r0 == 0) goto L_0x054f
            long r0 = r1.Bwh()
            long r2 = X.C289155d7.A01(r0)
            r0 = 0
            X.5VN r4 = X.C289285dL.A01(r0, r2)
            return r4
        L_0x00a1:
            java.lang.Object r4 = r14.A02
            X.GZF r4 = (X.GZF) r4
            java.lang.Object r3 = r14.A01
            X.4Cq r3 = (X.C262224Cq) r3
            X.5Oz r0 = r4.A0Q
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x00b6
            r2 = 0
            r1 = 14
            goto L_0x0018
        L_0x00b6:
            r0 = 0
            goto L_0x0021
        L_0x00b9:
            X.0sm r4 = X.0Yt.A0E()
            return r4
        L_0x00be:
            java.lang.Object r3 = r14.A01
            X.Hql r3 = (X.C55980Hql) r3
            java.lang.Object r2 = r14.A02
            r1 = 21
            X.TY5 r0 = new X.TY5
            r0.<init>(r2, r1)
            r3.A02 = r0
            r1 = 23
            X.TTN r0 = new X.TTN
            r0.<init>(r3, r1)
            X.3dj r4 = X.C51965G9l.A0V(r0)
            return r4
        L_0x00d9:
            java.lang.Object r1 = r14.A02
            X.4Cc r1 = (X.C262094Cc) r1
            java.lang.Object r0 = r14.A01
            X.4Cc r0 = (X.C262094Cc) r0
            X.4Cc r0 = r1.plus(r0)
            X.19S r4 = X.19E.A02(r0)
            return r4
        L_0x00ea:
            java.lang.Object r0 = r14.A02
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r0 = r0.A05
            X.3XH r0 = r0.A03
            r2 = 0
            if (r0 == 0) goto L_0x0108
            X.4Cq r5 = X.C247553gX.A00(r0)
            java.lang.Object r4 = r14.A01
            r3 = 48
            r1 = 42
            X.MH2 r0 = new X.MH2
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r3, (int) r1)
            X.1Er r2 = X.C51966G9m.A1L(r0, r5)
        L_0x0108:
            r1 = 15
            X.TTN r0 = new X.TTN
            r0.<init>(r2, r1)
            X.3dj r4 = X.C51965G9l.A0V(r0)
            return r4
        L_0x0114:
            java.lang.Object r0 = r14.A01
            X.Ho8 r0 = (X.C55825Ho8) r0
            X.0eM r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.WGX r1 = (X.WGX) r1
            java.lang.Object r0 = r14.A02
            X.WGg r0 = (X.C19005WGg) r0
            X.HoO r4 = A00(r1, r0)
            return r4
        L_0x0129:
            java.lang.Object r0 = r14.A01
            X.Ho8 r0 = (X.C55825Ho8) r0
            X.0eM r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            X.WGX r1 = (X.WGX) r1
            java.lang.Object r0 = r14.A02
            X.WGg r0 = (X.C19005WGg) r0
            X.HoO r4 = A00(r1, r0)
            return r4
        L_0x013e:
            java.lang.Object r0 = r14.A01
            X.Ho8 r0 = (X.C55825Ho8) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r14.A02
            X.WGg r4 = (X.C19005WGg) r4
            java.util.LinkedHashMap r3 = X.C51975G9x.A0o(r0)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x0156:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0172
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.WGX r0 = (X.WGX) r0
            X.HoO r0 = A00(r0, r4)
            r3.put(r1, r0)
            goto L_0x0156
        L_0x0172:
            X.TSP r4 = new X.TSP
            r4.<init>(r3)
            return r4
        L_0x0178:
            java.lang.Object r1 = r14.A02
            X.I4c r1 = (X.C56603I4c) r1
            r0 = 1
            r1.A08 = r0
            java.lang.Object r0 = r14.A01
            X.DbS.A1U(r0)
            goto L_0x0533
        L_0x0186:
            java.lang.Object r2 = r14.A02
            X.I4c r2 = (X.C56603I4c) r2
            java.lang.Object r1 = r14.A01
            android.content.Context r1 = (android.content.Context) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.String r0 = "AEv2 - fetch launch data failure"
            r2.A02(r1, r0)
            X.GkW r0 = r2.A0A
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A00
            r1 = 231933580(0xdd3068c, float:1.3005455E-30)
            java.lang.String r0 = "editor_native_launch_data_fetch_end"
            r2.markerPoint(r1, r3, r0)
            r0 = 3
            r2.markerEnd(r1, r3, r0)
            goto L_0x0533
        L_0x01a9:
            java.lang.Object r2 = r14.A01
            X.7ka r2 = (X.C340027ka) r2
            r5 = r2
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.0qQ.A0A(r5)
            androidx.fragment.app.FragmentActivity r6 = r2.getActivity()
            android.content.Intent r1 = r2.getIntent()
            r9 = 1
            if (r1 == 0) goto L_0x01c8
            r0 = 132(0x84, float:1.85E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r9 = r1.getBooleanExtra(r0, r9)
        L_0x01c8:
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r14.A02
            X.QL1 r0 = (X.QL1) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.S51 r7 = new X.S51
            r7.<init>(r1, r0)
            X.Rhq r8 = new X.Rhq
            r8.<init>()
            X.QhE r4 = new X.QhE
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x01e5:
            java.lang.Object r2 = r14.A02
            X.OdW r2 = (X.C71133OdW) r2
            java.lang.String r0 = "OMNISTORE"
            r1 = 1
            X.ObS r3 = r2.A06(r0, r1, r1)
            java.lang.Object r0 = r14.A01
            X.IHh r2 = new X.IHh
            r2.<init>(r0, r1)
            goto L_0x0209
        L_0x01f8:
            java.lang.Object r1 = r14.A02
            X.OZI r1 = (X.OZI) r1
            r0 = 0
            X.ObS r3 = r1.A02(r0)
            java.lang.Object r1 = r14.A01
            r0 = 0
            X.IHh r2 = new X.IHh
            r2.<init>(r1, r0)
        L_0x0209:
            r3.A04(r2)
            goto L_0x0533
        L_0x020e:
            java.lang.Object r0 = r14.A02
            X.Hzt r0 = (X.C56522Hzt) r0
            X.6Rm r2 = r0.A01
            java.lang.Object r1 = r14.A01
            X.4tV r1 = (X.C276544tV) r1
            r0 = 43
            X.4tV r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0228
            java.lang.Object r4 = X.C307476Qg.A06(r2, r0)
            r4.getClass()
            return r4
        L_0x0228:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x022d:
            java.lang.Object r2 = r14.A02
            X.Hzt r2 = (X.C56522Hzt) r2
            java.lang.Object r1 = r14.A01
            X.4tV r1 = (X.C276544tV) r1
            r0 = 0
            X.C56522Hzt.A00(r2, r1, r0, r0)
            goto L_0x0533
        L_0x023b:
            java.lang.Object r3 = r14.A02
            X.Hzt r3 = (X.C56522Hzt) r3
            java.lang.Object r2 = r14.A01
            X.4tV r2 = (X.C276544tV) r2
            r1 = 0
            r0 = 1
            X.C56522Hzt.A00(r3, r2, r1, r0)
            goto L_0x0533
        L_0x024a:
            java.lang.Object r4 = r14.A02
            X.Hzt r4 = (X.C56522Hzt) r4
            java.lang.Object r3 = r14.A01
            X.4tV r3 = (X.C276544tV) r3
            X.0eM r1 = r4.A02
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0533
            java.lang.Object r2 = r1.getValue()
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A01(r3)
            X.6Tm r1 = r0.A00()
            X.6Rm r0 = r4.A01
            X.C307886Rw.A03(r0, r3, r1, r2)
            goto L_0x0533
        L_0x0273:
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            java.lang.Object r3 = r14.A02
            X.4tV r3 = (X.C276544tV) r3
            r0.A01(r3)
            java.lang.Object r2 = r14.A01
            X.6Rm r2 = (X.C307786Rm) r2
            r0.A02(r2)
            X.6Tm r1 = r0.A00()
            r0 = 48
            goto L_0x02c0
        L_0x028d:
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            java.lang.Object r3 = r14.A02
            X.4tV r3 = (X.C276544tV) r3
            r0.A01(r3)
            java.lang.Object r2 = r14.A01
            X.6Rm r2 = (X.C307786Rm) r2
            r0.A02(r2)
            X.6Tm r1 = r0.A00()
            r0 = 45
            goto L_0x02c0
        L_0x02a7:
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            java.lang.Object r3 = r14.A02
            X.4tV r3 = (X.C276544tV) r3
            r0.A01(r3)
            java.lang.Object r2 = r14.A01
            X.6Rm r2 = (X.C307786Rm) r2
            r0.A02(r2)
            X.6Tm r1 = r0.A00()
            r0 = 42
        L_0x02c0:
            X.4uI r0 = r3.A0A(r0)
            X.C307886Rw.A03(r2, r3, r1, r0)
            goto L_0x0533
        L_0x02c9:
            java.lang.Object r1 = r14.A02
            X.4tV r1 = (X.C276544tV) r1
            r0 = 41
            X.4uI r2 = r1.A0A(r0)
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r14.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r1, r2)
            r4 = 0
            return r4
        L_0x02de:
            java.lang.Object r1 = r14.A02
            X.4tV r1 = (X.C276544tV) r1
            r0 = 40
            X.4uI r2 = r1.A0A(r0)
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r14.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r1, r2)
            r4 = 0
            return r4
        L_0x02f3:
            java.lang.Object r0 = r14.A02
            X.39i r0 = (X.C2378139i) r0
            X.39B r4 = r0.A00
            java.lang.Object r3 = r14.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r2 = r4.A02
            monitor-enter(r2)
            java.util.LinkedHashSet r1 = r4.A03     // Catch:{ all -> 0x0316 }
            boolean r0 = r1.remove(r3)     // Catch:{ all -> 0x0316 }
            if (r0 == 0) goto L_0x0313
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0316 }
            if (r0 == 0) goto L_0x0313
            r4.A02()     // Catch:{ all -> 0x0316 }
        L_0x0313:
            monitor-exit(r2)
            goto L_0x0533
        L_0x0316:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0319:
            java.lang.Object r0 = r14.A02
            X.4Vo r0 = (X.C265634Vo) r0
            X.4Vl r1 = r0.A00
            java.lang.Object r0 = r14.A01
            X.02R r0 = (X.02R) r0
            r1.FIw(r0)
            goto L_0x0533
        L_0x0328:
            java.lang.Object r5 = r14.A01
            X.4Ca r5 = (X.C262074Ca) r5
            java.lang.Object r1 = r14.A02
            X.Hzo r1 = (X.C56517Hzo) r1
            X.Hli r0 = r1.A00
            com.instagram.common.session.UserSession r4 = r0.A00
            java.lang.String r3 = r0.A01
            X.4Cq r2 = r1.A02
            X.Gh0 r1 = r1.A01
            X.Ghp r0 = new X.Ghp
            r0.<init>(r4, r1, r3, r2)
            X.Jjt r4 = new X.Jjt
            r4.<init>(r0, r5)
            return r4
        L_0x0345:
            java.lang.Object r1 = r14.A02
            X.07V r1 = (X.AnonymousClass07V) r1
            java.lang.Object r0 = r14.A01
            goto L_0x0368
        L_0x034c:
            java.lang.Object r1 = r14.A02
            X.5Oz r1 = (X.C284945Oz) r1
            boolean r0 = X.C51971G9r.A1W(r1)
            r0 = r0 ^ 1
            X.C51967G9n.A16(r1, r0)
            java.lang.Object r1 = r14.A01
            X.IFl r1 = (X.C56864IFl) r1
            r0 = 1
            r1.A01 = r0
            goto L_0x0533
        L_0x0362:
            java.lang.Object r1 = r14.A01
            X.07V r1 = (X.AnonymousClass07V) r1
            java.lang.Object r0 = r14.A02
        L_0x0368:
            X.07Y r0 = (X.AnonymousClass07Y) r0
            r1.A0A(r0)
            goto L_0x0533
        L_0x036f:
            java.lang.Object r1 = r14.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r14.A01
            X.GW4 r0 = (X.GW4) r0
            r1.removeOnAttachStateChangeListener(r0)
            goto L_0x0533
        L_0x037c:
            java.lang.Object r0 = r14.A01
            X.5d9 r0 = (X.C289175d9) r0
            X.5d6 r0 = r0.A00
            X.0sP r2 = r0.Bov()
            if (r2 == 0) goto L_0x0533
            java.lang.Object r1 = r14.A02
            X.4cX r1 = (X.C267964cX) r1
            X.Xue r0 = new X.Xue
            r0.<init>(r1)
            r2.invoke(r0)
            goto L_0x0533
        L_0x0396:
            java.lang.Object r1 = r14.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r0 = r14.A02
            X.4e0 r0 = (X.C268794e0) r0
            X.IFx r0 = r0.A0H()
            r1.A00 = r0
            goto L_0x0533
        L_0x03a6:
            java.lang.Object r9 = r14.A02
            X.Gb5 r9 = (X.C52693Gb5) r9
            java.lang.Object r0 = r14.A01
            X.5Oz r0 = (X.C284945Oz) r0
            long r12 = X.G9w.A06(r0)
            X.5Oz r0 = r9.A0G
            java.lang.Object r0 = r0.getValue()
            X.5dM r0 = (X.C289295dM) r0
            if (r0 == 0) goto L_0x044f
            long r3 = r0.A00
            X.Gc7 r0 = r9.A03
            if (r0 == 0) goto L_0x044f
            X.Hr4 r0 = r0.A01
            X.5Tq r0 = r0.A02
            r6 = 0
            if (r0 == 0) goto L_0x044f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x044f
            X.5Oz r0 = r9.A0H
            java.lang.Object r1 = r0.getValue()
            X.HL1 r1 = (X.HL1) r1
            r0 = -1
            if (r1 == 0) goto L_0x044f
            int r1 = r1.ordinal()
            if (r1 == r0) goto L_0x044f
            r7 = 2
            r0 = 1
            if (r1 == r6) goto L_0x046b
            if (r1 == r0) goto L_0x046b
            if (r1 != r7) goto L_0x0475
            X.5Oz r0 = r9.A0K
            long r1 = X.C51968G9o.A0G(r0)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r10
        L_0x03f4:
            int r8 = (int) r1
            X.Gc7 r0 = r9.A03
            if (r0 == 0) goto L_0x044f
            X.I1h r5 = X.C52754Gc7.A00(r0)
            if (r5 == 0) goto L_0x044f
            X.Gc7 r0 = r9.A03
            if (r0 == 0) goto L_0x044f
            X.Hr4 r0 = r0.A01
            X.5Tq r2 = r0.A02
            if (r2 == 0) goto L_0x044f
            X.JS3 r0 = r9.A08
            int r1 = r0.E1S(r8)
            int r0 = r2.length()
            int r2 = X.C229632nm.A03(r1, r6, r0)
            long r0 = r5.A02(r3)
            float r6 = X.C289295dM.A01(r0)
            X.62f r0 = r5.A02
            X.62d r5 = r0.A03
            int r4 = r5.A06(r2)
            float r2 = r0.A00(r4)
            float r0 = r0.A01(r4)
            float r1 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r2, r0)
            float r3 = X.C229632nm.A02(r6, r1, r0)
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0459
            float r1 = X.AnonymousClass7TE.A00(r6, r3)
            int r0 = X.C51965G9l.A04(r12)
            int r0 = r0 / r7
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0459
        L_0x044f:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L_0x0454:
            X.5dM r4 = X.C51965G9l.A0M(r0)
            return r4
        L_0x0459:
            float r1 = r5.A04(r4)
            float r0 = r5.A03(r4)
            float r0 = X.C51967G9n.A00(r0, r1)
            float r0 = r0 + r1
            long r0 = X.C289325dP.A00(r3, r0)
            goto L_0x0454
        L_0x046b:
            X.5Oz r0 = r9.A0K
            long r1 = X.C51968G9o.A0G(r0)
            r0 = 32
            long r1 = r1 >> r0
            goto L_0x03f4
        L_0x0475:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x047a:
            java.lang.Object r0 = r14.A02
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A0A()
            goto L_0x049a
        L_0x0482:
            java.lang.Object r0 = r14.A02
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A09()
            goto L_0x049a
        L_0x048a:
            java.lang.Object r1 = r14.A02
            X.Gb5 r1 = (X.C52693Gb5) r1
            r0 = 0
            r1.A0D(r0)
            goto L_0x049a
        L_0x0493:
            java.lang.Object r0 = r14.A02
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A07()
        L_0x049a:
            java.lang.Object r0 = r14.A01
            X.I1S r0 = (X.I1S) r0
            X.GeN r6 = X.C52887GeN.A00
            X.5Oz r3 = r0.A00
            goto L_0x04c3
        L_0x04a3:
            java.lang.Object r6 = r14.A01
            X.5Tl r6 = (X.C285975Tl) r6
            long r4 = r6.A00
            java.lang.Object r3 = r14.A02
            X.5Oz r3 = (X.C284945Oz) r3
            long r1 = X.C51968G9o.A0G(r3)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04c3
            X.5Tk r1 = r6.A02
            X.5Tl r0 = X.C51966G9m.A0i(r3)
            X.5Tk r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0533
        L_0x04c3:
            r3.Epw(r6)
            goto L_0x0533
        L_0x04c7:
            java.lang.Object r0 = r14.A01
            java.lang.Object r3 = X.C51966G9m.A18(r0)
            X.69H r3 = (X.AnonymousClass69H) r3
            java.lang.Object r2 = r14.A02
            X.GZF r2 = (X.GZF) r2
            X.GZm r0 = r2.A0N
            X.6Gv r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.2HY r1 = (X.2HY) r1
            X.6Iw r0 = new X.6Iw
            r0.<init>(r3, r1)
            X.GZg r4 = new X.GZg
            r4.<init>(r3, r0, r2)
            return r4
        L_0x04e8:
            java.lang.Object r0 = r14.A01
            java.lang.Object r3 = X.C51966G9m.A18(r0)
            X.GeU r3 = (X.C52894GeU) r3
            java.lang.Object r2 = r14.A02
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
            X.I48 r0 = r2.A0D
            X.6Gv r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.2HY r1 = (X.2HY) r1
            X.6Iw r0 = new X.6Iw
            r0.<init>(r3, r1)
            X.IFP r4 = new X.IFP
            r4.<init>(r0, r3, r2)
            return r4
        L_0x0509:
            java.lang.Object r0 = r14.A01
            java.lang.Object r3 = X.C51966G9m.A18(r0)
            X.GeT r3 = (X.C52893GeT) r3
            java.lang.Object r2 = r14.A02
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            X.I46 r0 = r2.A09
            X.6Gv r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.2HY r1 = (X.2HY) r1
            X.6Iw r0 = new X.6Iw
            r0.<init>(r3, r1)
            X.IF5 r4 = new X.IF5
            r4.<init>(r3, r2, r0)
            return r4
        L_0x052a:
            java.lang.Object r1 = r14.A01
            X.3jv r1 = (X.C249523jv) r1
            java.lang.Object r0 = r14.A02
            r1.FIG(r0)
        L_0x0533:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0536:
            java.lang.Object r2 = r14.A02
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor r2 = (com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor) r2
            java.lang.Object r0 = r14.A01
            X.S5r r0 = (X.C11020S5r) r0
            java.util.List r1 = r0.A01
            boolean r0 = r0.A02
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor.A02(r2, r1, r0)
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0548:
            java.lang.String r0 = "initialScrollPosition"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x054f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58718IwR.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58718IwR(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
