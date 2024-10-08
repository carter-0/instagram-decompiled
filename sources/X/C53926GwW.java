package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.GwW  reason: case insensitive filesystem */
public final class C53926GwW extends C251343mx {
    public static final AnonymousClass4Ew A0B = new AnonymousClass4Ex(CameraCapturer.OPEN_CAMERA_DELAY_MS);
    public final int A00 = 3;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final GHN A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final AnonymousClass4DU A07;
    public final AnonymousClass3W1 A08;
    public final JTB A09;
    public final List A0A;

    public C53926GwW(ClipsViewerConfig clipsViewerConfig, C267324bN r4, GHN ghn, C52058GDe gDe, UserSession userSession, 1Xj r8, AnonymousClass4DU r9, AnonymousClass3W1 r10, JTB jtb, List list) {
        C51969G9p.A1N(gDe, 8, jtb);
        this.A03 = ghn;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = userSession;
        this.A07 = r9;
        this.A01 = clipsViewerConfig;
        this.A02 = r4;
        this.A04 = gDe;
        this.A0A = list;
        this.A09 = jtb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r24) {
        /*
            r23 = this;
            r8 = 0
            r9 = r24
            X.0qQ.A0B(r9, r8)
            r15 = r23
            java.util.List r13 = r15.A0A
            boolean r1 = r13.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r13.size()
            r2 = 1
            if (r1 != r2) goto L_0x003f
            java.lang.Object r5 = X.00k.A0O(r13, r8)
            X.Jw8 r5 = (X.C61070Jw8) r5
            if (r5 == 0) goto L_0x003e
            java.lang.Object r4 = r5.A00
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r5.A01
            X.DTe r3 = (X.C46275DTe) r3
            java.lang.Object r1 = r5.A02
            X.DUk r1 = (X.C46307DUk) r1
            java.lang.String r0 = r5.A03
            java.lang.String r19 = ""
            r20 = r0
            r21 = r2
            r16 = r3
            r17 = r1
            r18 = r4
            X.3mx r0 = r15.A00(r16, r17, r18, r19, r20, r21)
        L_0x003e:
            return r0
        L_0x003f:
            X.Iv2 r1 = X.C58631Iv2.A00
            X.2Wa r11 = X.C243643Zq.A00(r9, r1)
            X.Iv3 r1 = X.C58632Iv3.A00
            X.3Zt r10 = X.C243633Zp.A00(r9, r1)
            java.lang.String r7 = "CONTEXT_LINE_TRANSITION_KEY"
            java.lang.Object r6 = r11.A03
            java.lang.Number r6 = (java.lang.Number) r6
            int r1 = r6.intValue()
            java.lang.String r5 = X.002.A0O(r7, r1)
            r17 = 4000(0xfa0, double:1.9763E-320)
            X.3XV r1 = X.2WX.A02
            X.3Zh r1 = X.C243573Zh.STRETCH
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.2WX r12 = X.G9t.A0z(r0, r4, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.2WX r2 = X.C51971G9r.A0X(r12, r3, r1, r2)
            r22 = 4
            X.IxC r1 = new X.IxC
            r19 = r11
            r20 = r10
            r21 = r15
            r16 = r1
            r16.<init>(r17, r19, r20, r21, r22)
            X.2WX r2 = X.C51971G9r.A0Z(r2, r4, r1, r0)
            r4 = 5
            X.J6J r1 = X.J6J.A00(r10, r4)
            X.2WX r11 = X.C51971G9r.A0Z(r2, r3, r1, r0)
            X.2Wb r10 = X.C51972G9s.A0Q(r9)
            int r1 = r6.intValue()
            r3 = -1
            if (r1 != r3) goto L_0x0139
            java.lang.String r7 = "CONTEXT_LINE_TRANSITION_KEY1"
        L_0x0096:
            int r1 = r6.intValue()
            if (r1 != r3) goto L_0x0105
            com.instagram.common.session.UserSession r14 = r15.A05
            X.0Tu r12 = X.0Tu.A05
            r1 = 36327082497751197(0x810f4a0001389d, double:3.036731476773477E-306)
            boolean r1 = X.182.A06(r12, r14, r1)
            if (r1 != 0) goto L_0x0105
            r1 = 0
        L_0x00ac:
            X.AnonymousClass4F7.A00(r9, r0)
            java.util.Iterator r14 = r13.iterator()
        L_0x00b3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r12 = r14.next()
            int r13 = r1 + 1
            if (r1 >= 0) goto L_0x00c9
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c9:
            X.Jw8 r12 = (X.C61070Jw8) r12
            int r0 = r6.intValue()
            if (r1 == r0) goto L_0x00d9
            int r0 = r6.intValue()
            if (r0 != r3) goto L_0x0103
            if (r1 != 0) goto L_0x0103
        L_0x00d9:
            java.lang.String r0 = "context_line_component_key_"
            java.lang.String r7 = X.002.A0O(r0, r1)
            java.lang.Object r4 = r12.A00
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r12.A01
            X.DTe r2 = (X.C46275DTe) r2
            java.lang.Object r1 = r12.A02
            X.DUk r1 = (X.C46307DUk) r1
            java.lang.String r0 = r12.A03
            r19 = r5
            r20 = r0
            r21 = r8
            r16 = r2
            r17 = r1
            r18 = r4
            X.3mx r0 = r15.A00(r16, r17, r18, r19, r20, r21)
            X.AnonymousClass56V.A01(r0, r7)
            r10.A00(r0)
        L_0x0103:
            r1 = r13
            goto L_0x00b3
        L_0x0105:
            X.3Zd r2 = X.C243533Zd.GLOBAL
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[]{r5, r7}
            X.4Ey r0 = X.2Vi.A01(r2, r0)
            X.3du r2 = X.C246033ds.A05
            r0.A03(r2)
            X.2V1 r2 = r10.A00
            android.content.Context r7 = r2.A0C
            X.4F6 r2 = X.AnonymousClass4F6.A00(r7, r4)
            r0.A04(r2)
            r2 = -5
            X.4F6 r2 = X.AnonymousClass4F6.A00(r7, r2)
            r0.A05(r2)
            X.4Ew r4 = A0B
            r0.A02 = r4
            X.3du r2 = X.C246033ds.A00
            float r2 = X.C51970G9q.A03(r0, r2)
            r0.A02(r2)
            r0.A02 = r4
            goto L_0x00ac
        L_0x0139:
            int r1 = r6.intValue()
            int r2 = r1 + 1
            int r1 = r13.size()
            int r2 = r2 % r1
            java.lang.String r7 = X.002.A0O(r7, r2)
            goto L_0x0096
        L_0x014a:
            X.2Tl r0 = X.C243563Zg.A03(r10, r9, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53926GwW.A0X(X.3Y5):X.3mp");
    }

    static {
        C243533Zd r0 = 2Vi.A04;
    }

    private final C53922GwS A04(C46275DTe dTe, C46307DUk dUk, String str, String str2, boolean z, boolean z2) {
        UserSession userSession = this.A05;
        1Xj r7 = this.A06;
        return new C53922GwS(dTe, dUk, this.A01, this.A02, this.A04, userSession, r7, this.A07, this.A09, str, str2, z, z2);
    }

    private final C251343mx A00(C46275DTe dTe, C46307DUk dUk, Integer num, String str, String str2, boolean z) {
        String str3;
        String str4;
        C46307DUk dUk2;
        C46275DTe dTe2;
        boolean z2;
        int intValue = num.intValue();
        String str5 = str;
        if (intValue != 0) {
            boolean z3 = z;
            if (intValue != 1) {
                dUk2 = dUk;
                if (intValue == 2) {
                    dTe2 = null;
                    if (dUk != null) {
                        str3 = str2;
                        str4 = str5;
                        z2 = false;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (intValue == 3) {
                    dTe2 = null;
                    if (dUk != null) {
                        str4 = str5;
                        str3 = null;
                        z2 = true;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            } else {
                dTe2 = dTe;
                if (dTe != null) {
                    dUk2 = null;
                    str4 = str5;
                    str3 = null;
                    z2 = false;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return A04(dTe2, dUk2, str4, str3, z3, z2);
        }
        return new GKW(this.A01, this.A02, this.A03, this.A04, this.A05, this.A06, this.A08, this.A09, this.A07.getModuleName(), str5, this.A00);
    }
}
