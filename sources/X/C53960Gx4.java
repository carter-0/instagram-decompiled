package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gx4  reason: case insensitive filesystem */
public final class C53960Gx4 extends C243963aQ {
    public final AnonymousClass6Q8 A00;
    public final AnonymousClass6LP A01;
    public final JQA A02;
    public final UserSession A03;
    public final IZD A04;
    public final C59659JSd A05;
    public final String A06;
    public final String A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C229382nI A0C;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0r1, java.lang.Object] */
    public final C244523bK A0X(C244463bE r14) {
        AnonymousClass6SE r0;
        AnonymousClass6S6 r02;
        C244463bE r11 = r14;
        0qQ.A0B(r14, 0);
        AnonymousClass6LP r7 = this.A01;
        AnonymousClass3Zw.A00(r14, new C58676Ivl(this, 36), new Object[]{r7});
        ? obj = new Object();
        obj.A00 = true;
        AnonymousClass3Zw.A00(r14, new C58676Ivl(this, 37), new Object[]{r7});
        C3034368u r3 = (C3034368u) AnonymousClass3Zw.A00(r14, new C58693Iw2(11, this, obj), new Object[]{this.A07});
        AnonymousClass3Zw.A00(r14, new C58693Iw2(10, this, obj), new Object[]{r7});
        Object A002 = AnonymousClass3Zw.A00(r14, new C58676Ivl(this, 45), new Object[0]);
        C229382nI r2 = this.A0C;
        0qQ.A0A(r3);
        AnonymousClass7TF.A1B(r2, 1, r3);
        2Wa A003 = C243643Zq.A00(r14, C58587IuK.A00);
        C307786Rm r12 = (C307786Rm) AnonymousClass3Zw.A00(r14, C58699Iw8.A00(r2, r3, r14, A002, 42), new Object[]{r3});
        C243773a4.A00(r14, new C58676Ivl(r12, 47), new Object[]{r12});
        AtomicReference atomicReference = (AtomicReference) AnonymousClass3Zw.A00(r14, C58586IuJ.A00, new Object[0]);
        GY7 gy7 = (GY7) AnonymousClass3Zw.A00(r14, C58585IuI.A00, new Object[0]);
        AtomicReference atomicReference2 = (AtomicReference) AnonymousClass3Zw.A00(r14, C58584IuH.A00, new Object[0]);
        C307446Qd A022 = C307476Qg.A02(r12);
        0qQ.A07(A022);
        AnonymousClass3Zw.A00(r14, C58699Iw8.A00(r12, atomicReference, A003, A022, 43), new Object[]{A022});
        Object A004 = AnonymousClass3Zw.A00(r14, C58697Iw6.A00(r12, atomicReference2, gy7, 34), new Object[0]);
        AnonymousClass6S4 r6 = new AnonymousClass6S4(new C56954IIy(A003, gy7), r12);
        HashMap A052 = C3034368u.A05(r3.A01.A02, Collections.emptyMap());
        AnonymousClass6S3 r32 = (AnonymousClass6S3) atomicReference.get();
        C307996Sh r03 = (C307996Sh) atomicReference2.get();
        AnonymousClass6S6 r1 = null;
        if (r03 == null || (r02 = (AnonymousClass6S6) r03.A02) == null) {
            r0 = null;
        } else {
            r0 = r02.A01;
        }
        AnonymousClass6QY r22 = new AnonymousClass6QY(r12, r32, r0, A052);
        C307996Sh r04 = (C307996Sh) atomicReference2.get();
        if (r04 != null) {
            r1 = (AnonymousClass6S6) r04.A02;
        }
        AnonymousClass6SH A005 = C307416Qa.A00(r6, r1, r22, gy7.A00());
        AnonymousClass2WG A0f = C51969G9p.A0f(r14, C51971G9r.A0e(C52684Gaw.A00, false), C58583IuG.A00, new C58768IxF(32, A004, this, r11, r12));
        IKF ikf = new IKF(A005, r12);
        AnonymousClass3XV r05 = 2WX.A02;
        return C51965G9l.A0W(C51971G9r.A0Y(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0B, Integer.valueOf(R.id.clips_showreel_bloks_v2_component_id), 4), AnonymousClass05K.A0D, "reels_server_rendered_new_bloks_integration", 4), ikf, A0f);
    }

    public C53960Gx4(AnonymousClass6Q8 r2, AnonymousClass6LP r3, JQA jqa, C229382nI r5, UserSession userSession, IZD izd, C59659JSd jSd, String str, String str2, Map map, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1U(str, r5, userSession);
        C51974G9v.A1Q(r3, r2, izd, str2);
        DbW.A1P(map, 11, jSd);
        this.A07 = str;
        this.A0C = r5;
        this.A03 = userSession;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = izd;
        this.A06 = str2;
        this.A08 = map;
        this.A05 = jSd;
        this.A02 = jqa;
    }
}
