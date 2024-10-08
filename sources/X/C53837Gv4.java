package X;

import android.view.animation.LinearInterpolator;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Gv4  reason: case insensitive filesystem */
public final class C53837Gv4 extends C251343mx {
    public final 2WX A00;
    public final C55791HnQ A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sL A04;
    public final 0sK A05;
    public final boolean A06;
    public final boolean A07;

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        C226662he r14;
        2Tp A0L;
        Integer num;
        JMT jmt;
        AnonymousClass3Y5 r8 = r27;
        0qQ.A0B(r8, 0);
        C243533Zd r6 = 2Vi.A04;
        AnonymousClass4Ey A002 = 2Vi.A00(r6, "overlay-appear-transition-key");
        C246053du r5 = C246033ds.A00;
        float A032 = C51970G9q.A03(A002, r5);
        A002.A02(A032);
        A002.A02 = new AnonymousClass4Ex(new LinearInterpolator(), 200);
        AnonymousClass4F7.A00(r8, A002);
        AnonymousClass4Ey A003 = 2Vi.A00(r6, "scrim-disappear-transition-key");
        C51970G9q.A1H(A003, r5, A032);
        A003.A02 = new AnonymousClass4Ex(new LinearInterpolator(), 200);
        AnonymousClass4F7.A00(r8, A003);
        2Wa A004 = C243643Zq.A00(r8, C58549Iti.A00);
        C55791HnQ hnQ = this.A01;
        String str = hnQ.A02;
        if (str != null) {
            r14 = AnonymousClass6QK.A01(str);
        } else {
            r14 = null;
        }
        long A022 = I61.A02(r8, AnonymousClass05K.A0X);
        if (!this.A07) {
            C251263mp r10 = hnQ.A01;
            if (r10 != null) {
                AnonymousClass3XV r2 = 2WX.A02;
                2WX A005 = AnonymousClass9JR.A00(C51974G9v.A0B((2WX) null), AnonymousClass05K.A01, 1, C51969G9p.A0D());
                2V1 r9 = r8.A05;
                A0L = C243563Zg.A0B(G9t.A0v(r10, r9), r8, C51971G9r.A0V(r9, A005, C243533Zd.LOCAL, "overlay-appear-transition-key"));
            } else {
                A0L = null;
            }
        } else {
            AnonymousClass3XV r22 = 2WX.A02;
            2WX A006 = AnonymousClass9JR.A00(C51974G9v.A0B((2WX) null), AnonymousClass05K.A01, 1, C51969G9p.A0D());
            int i = 4;
            if (C51969G9p.A1V(A004)) {
                i = 0;
            }
            A0L = C243563Zg.A0L(r8, C51971G9r.A0Y(C51973G9u.A0Y(C51971G9r.A0V(r8.A05, C51971G9r.A0Y(C51971G9r.A0Z(A006, AnonymousClass05K.A0u, new C56055Hs4(i), (String) null), AnonymousClass05K.A15, C51965G9l.A0Y(I61.A00(r8, HNO.A0j)), 4), C243533Zd.LOCAL, "scrim-disappear-transition-key"), AnonymousClass05K.A0N, true), AnonymousClass05K.A05, new C52863Gdw(C51969G9p.A07(r8, A022)), 4));
        }
        C56920IHp iHp = new C56920IHp(new J6T(43, (Object) A004, (Object) this));
        C56091Hse hse = (C56091Hse) AnonymousClass3Zw.A00(r8, C58677Ivm.A00(this, 35), new Object[]{hnQ});
        int A0M = AnonymousClass7TE.A0M(AnonymousClass3Zw.A00(r8, C58677Ivm.A00(this, 34), new Object[]{hnQ}));
        AnonymousClass2VW r62 = hse.A00;
        if (this.A06) {
            num = Integer.valueOf(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
        } else {
            num = null;
        }
        AnonymousClass3XV r23 = 2WX.A02;
        2WX A007 = G9t.A10((2WX) null, AnonymousClass05K.A0D, hse.A01).A00(this.A00);
        C58677Ivm A008 = C58677Ivm.A00(this, 32);
        GL8 gl8 = new GL8(A0M, 39, this, hse);
        C58677Ivm A009 = C58677Ivm.A00(this, 33);
        C59098J6g A012 = C59098J6g.A01(this, 47);
        if (r14 != null) {
            jmt = C57577Id4.A00;
        } else {
            jmt = C57576Id3.A00;
        }
        C298535tc r13 = new C298535tc(r14, A0L, A007, jmt, iHp, num, A008, gl8, A009, A012, A022);
        AnonymousClass56V.A00(r13, r62);
        return r13;
    }

    public C53837Gv4(2WX r1, C55791HnQ hnQ, 0sP r3, 0sP r4, 0sL r5, 0sK r6, boolean z, boolean z2) {
        this.A01 = hnQ;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A07 = z;
        this.A06 = z2;
    }
}
