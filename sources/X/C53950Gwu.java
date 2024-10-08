package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gwu  reason: case insensitive filesystem */
public final class C53950Gwu extends C243963aQ {
    public final Activity A00;
    public final UserSession A01;
    public final C55679Hlc A02;
    public final C53604GrJ A03;
    public final 2WX A04;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.0rD, java.lang.Object] */
    public final C244523bK A0X(C244463bE r14) {
        0qQ.A0B(r14, 0);
        ? obj = new Object();
        obj.A00 = -1.0d;
        2Wa A002 = C243643Zq.A00(r14, C58667Ivc.A00);
        0xG A0O = DbS.A0O("ig_threads_in_reels_unit");
        C56986IKe iKe = C56986IKe.A00;
        AnonymousClass2WG A0f = C51969G9p.A0f(r14, C51971G9r.A0e(GZK.A00, false), C58666Ivb.A00, J6Q.A00(A0O, this, 32));
        2WX r3 = this.A04;
        AnonymousClass3XV r0 = 2WX.A02;
        return C51965G9l.A0W(r3.A00(C51971G9r.A0Z(C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A01, new C58768IxF(48, A002, this, obj, A0O), (String) null)), AnonymousClass05K.A0Y, new J6L(obj, 4), (String) null)), iKe, A0f);
    }

    public C53950Gwu(Activity activity, 2WX r3, UserSession userSession, C55679Hlc hlc, C53604GrJ grJ) {
        C51974G9v.A1P(activity, userSession, grJ, r3);
        0qQ.A0B(hlc, 5);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = grJ;
        this.A04 = r3;
        this.A02 = hlc;
    }
}
