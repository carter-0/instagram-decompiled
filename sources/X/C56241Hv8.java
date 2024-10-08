package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hv8  reason: case insensitive filesystem */
public abstract class C56241Hv8 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.IoE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.IoE} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r0 == r10) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r17 = new X.C58210IoE(r4, r3, r12, r14, 5);
        r8.FLL(r17);
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r20 = X.C51965G9l.A0y(r1, r0, false);
        r0 = X.C51967G9n.A0m(r8, -1651479879);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        if (r0 != r10) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        r0 = new X.C58707IwG((java.lang.Object) r2, 32);
        r8.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        X.C54848HVf.A00(r8, r9, r12.A03, r20, X.C51965G9l.A0y(r1, r0, false), 384);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r19, X.C55932Hpu r20, X.C63596Kzj r21, int r22) {
        /*
            r11 = 0
            r6 = r21
            X.0qQ.A0B(r6, r11)
            r0 = 1
            r15 = 2
            r7 = r20
            X.0qQ.A0B(r7, r0)
            r0 = -1869171000(0xffffffff9096b6c8, float:-5.944619E-29)
            r8 = r19
            r8.ExV(r0)
            r5 = r22
            r0 = r22 & 6
            r14 = 3
            if (r0 != 0) goto L_0x014c
            int r16 = X.G9t.A0O(r8, r6)
            r16 = r16 | r22
        L_0x0022:
            r0 = r22 & 48
            r13 = 32
            if (r0 != 0) goto L_0x002e
            int r0 = X.G9t.A0P(r8, r7)
            r16 = r16 | r0
        L_0x002e:
            r1 = r16 & 19
            r0 = 18
            if (r1 != r0) goto L_0x0049
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x0049
            r8.Evl()
        L_0x003d:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x0048
            r0 = 23
        L_0x0045:
            X.JGL.A01(r1, r7, r6, r5, r0)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0057
            r1 = 359870795(0x1573314b, float:4.9112344E-26)
            java.lang.String r0 = "com.instagram.barcelona.weblink.WebLinkNavigator (WebLinkNavigator.kt:47)"
            X.0fL.A01(r1, r0)
        L_0x0057:
            java.lang.Object r4 = X.C51966G9m.A16(r8)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r4, r0)
            java.lang.Object r3 = X.C51965G9l.A0r(r8)
            r0 = -1273891626(0xffffffffb411f4d6, float:-1.3593248E-7)
            java.lang.Object r2 = X.C51967G9n.A0m(r8, r0)
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r2 != r10) goto L_0x0074
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = X.G9t.A0o(r8, r0)
        L_0x0074:
            X.5Oz r2 = (X.C284945Oz) r2
            X.5Wx r1 = X.C51965G9l.A0H(r8, r11)
            java.lang.Object r12 = r2.getValue()
            X.GpO r12 = (X.C53492GpO) r12
            r0 = -1273887600(0xffffffffb4120490, float:-1.359897E-7)
            r8.ExS(r0)
            if (r12 == 0) goto L_0x00e1
            com.instagram.api.schemas.IntegrityInterstitialType r9 = r12.A01
            int r0 = r9.ordinal()
            if (r0 == r15) goto L_0x0109
            if (r0 == r14) goto L_0x0102
            java.lang.String r14 = r12.A05
        L_0x0094:
            r0 = -1651490485(0xffffffff9d90414b, float:-3.8183994E-21)
            boolean r0 = X.C51973G9u.A1S(r8, r4, r3, r0)
            boolean r15 = X.C51972G9s.A1X(r8, r14, r12, r0)
            java.lang.Object r0 = r8.ECw()
            if (r15 != 0) goto L_0x00a7
            if (r0 != r10) goto L_0x00bb
        L_0x00a7:
            r22 = 5
            X.IoE r0 = new X.IoE
            r18 = r4
            r19 = r3
            r20 = r12
            r21 = r14
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r8.FLL(r0)
        L_0x00bb:
            X.0sa r20 = X.C51965G9l.A0y(r1, r0, r11)
            r0 = -1651479879(0xffffffff9d906ab9, float:-3.822683E-21)
            java.lang.Object r0 = X.C51967G9n.A0m(r8, r0)
            if (r0 != r10) goto L_0x00d0
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r2, (int) r13)
            r8.FLL(r0)
        L_0x00d0:
            X.0sa r21 = X.C51965G9l.A0y(r1, r0, r11)
            java.lang.String r0 = r12.A03
            r22 = 384(0x180, float:5.38E-43)
            r17 = r8
            r18 = r9
            r19 = r0
            X.C54848HVf.A00(r17, r18, r19, r20, r21, r22)
        L_0x00e1:
            X.C286565Wx.A0L(r1, r11)
            X.5Oz r0 = r6.A00
            java.lang.Object r11 = r0.getValue()
            if (r11 != 0) goto L_0x010c
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f8
            r0 = -1735077631(0xffffffff9894d101, float:-3.8468143E-24)
            X.0fL.A00(r0)
        L_0x00f8:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x0048
            r0 = 24
            goto L_0x0045
        L_0x0102:
            r0 = 3248(0xcb0, float:4.551E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            goto L_0x0094
        L_0x0109:
            java.lang.String r14 = "https://transparency.fb.com/data/content-restrictions/content-violating-local-law/"
            goto L_0x0094
        L_0x010c:
            r0 = -1273851002(0xffffffffb4129386, float:-1.3650978E-7)
            boolean r0 = X.G9t.A1Y(r8, r11, r4, r0)
            boolean r9 = X.C51966G9m.A1U(r8, r3, r0)
            boolean r0 = X.C51972G9s.A1L(r16)
            r9 = r9 | r0
            boolean r0 = X.C51968G9o.A1Q(r16)
            r9 = r9 | r0
            java.lang.Object r12 = r8.ECw()
            if (r9 != 0) goto L_0x0129
            if (r12 != r10) goto L_0x013e
        L_0x0129:
            r19 = 0
            r20 = 8
            X.JTw r12 = new X.JTw
            r17 = r11
            r18 = r7
            r16 = r6
            r15 = r4
            r14 = r2
            r13 = r3
            r12.<init>((java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (X.AnonymousClass4D7) r19, (int) r20)
            r8.FLL(r12)
        L_0x013e:
            boolean r0 = X.C51972G9s.A1S(r8, r1, r12, r11)
            if (r0 == 0) goto L_0x003d
            r0 = -403320979(0xffffffffe7f5cf6d, float:-2.3216122E24)
            X.0fL.A00(r0)
            goto L_0x003d
        L_0x014c:
            r16 = r5
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56241Hv8.A01(X.5Wy, X.Hpu, X.Kzj, int):void");
    }

    public static final void A00(Activity activity, UserSession userSession, 2EG r2, Long l, String str, String str2) {
        SUL A0J = Dba.A0J(activity, userSession, r2, str);
        A0J.A0S = str2;
        A0J.A0C(String.valueOf(l));
        A0J.A0A();
    }
}
