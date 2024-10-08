package X;

import android.text.TextUtils;
import android.text.method.MovementMethod;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gsh  reason: case insensitive filesystem */
public final class C53690Gsh extends C251343mx {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C62320sa A02;

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        String A0E;
        AnonymousClass3Y5 r15 = r34;
        0qQ.A0B(r15, 0);
        AnonymousClass3XV r29 = 2WX.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(450.0d);
        Integer num = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num, 0, doubleToRawLongBits);
        2Wb A0Q = C51972G9s.A0Q(r15);
        C274594oe r5 = (C274594oe) this.A02.invoke();
        2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0Y, 0, Double.doubleToRawLongBits(56.0d));
        long A0F = C51969G9p.A0F();
        Integer num2 = AnonymousClass05K.A04;
        2WX A004 = AnonymousClass9JR.A00(A003, num2, 0, A0F);
        2Wb A0w = G9t.A0w(A0Q);
        C247393gG A0a = C51971G9r.A0a(C244013aV.A0D(A0w, R.drawable.instagram_app_threads_pano_outline_24), A0w.A00);
        A0a.A0C();
        A0w.A00(A0a.A0A());
        String str = r5.A08;
        Integer valueOf = Integer.valueOf(A0w.Bnf().A01(R.attr.igds_color_primary_text));
        2Wd A0e = C51965G9l.A0e(C244013aV.A0C(A0w, R.dimen.auth_title_text_size));
        2WX A0X = C51971G9r.A0X((2WX) null, num, 1.0f, 1);
        long A0D = C51970G9q.A0D();
        A0w.A00(new C244473bF((TextUtils.TruncateAt) null, (MovementMethod) null, AnonymousClass9JR.A00(A0X, num2, 0, A0D), A0e, C244473bF.A0C, true, str, (Float) null, valueOf, (Integer) null, (Integer) null, (Integer) null));
        C273014lo r31 = C273014lo.SECONDARY_LINK;
        C273024lp r30 = C273024lp.MEDIUM;
        if (r5.A04.intValue() != 0) {
            A0E = C244013aV.A0E(A0w, 2131975370);
        } else {
            A0E = C244013aV.A0E(A0w, 2131975368);
        }
        C51971G9r.A1E(new C53974GxI(C56802ICz.A00(this, 7), r29, r30, r31, A0E), A0w, A0Q, A004);
        A0Q.A00(C243563Zg.A0L(A0Q, G9t.A10(C51971G9r.A0X((2WX) null, num, 1.0f, 1), AnonymousClass05K.A00, C51965G9l.A0Y(C244013aV.A01(A0Q, R.attr.igds_color_secondary_background)))));
        return C51967G9n.A0N(C243563Zg.A0L(A0Q, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, 0, A0D)), A0Q, r15, A002);
    }

    public C53690Gsh(FragmentActivity fragmentActivity, UserSession userSession, C62320sa r3) {
        AnonymousClass7TG.A1Q(userSession, fragmentActivity);
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
