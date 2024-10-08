package X;

import android.text.TextUtils;
import android.text.method.MovementMethod;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gsg  reason: case insensitive filesystem */
public final class C53689Gsg extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C62320sa A02;

    public C53689Gsg(UserSession userSession, AnonymousClass4DU r3, C62320sa r4) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, X.3Wa] */
    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        AnonymousClass3Y5 r2 = r20;
        0qQ.A0B(r2, 0);
        Object invoke = this.A02.invoke();
        if (C61078JwG.A00(20, invoke)) {
            2Wb A0Q = C51972G9s.A0Q(r2);
            AnonymousClass3XV r9 = 2WX.A02;
            A0Q.A00(new C244473bF((TextUtils.TruncateAt) null, (MovementMethod) null, r9, (2Wd) null, C244473bF.A0C, (Boolean) null, "[Internal] AI Consumption unit native carousel", (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null));
            ? obj = new Object();
            A0Q.A00(new C243553Zf(r9, this.A00, (AnonymousClass3WV) null, this.A01, obj, (String) null, "", new C58684Ivt(invoke, 41), new C58195Inz(34, obj, this, A0Q), false));
            return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0Q.A01, false);
        }
        throw AnonymousClass7TE.A1K();
    }
}
