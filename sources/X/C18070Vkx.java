package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vkx  reason: case insensitive filesystem */
public abstract class C18070Vkx {
    public final Context A00;
    public final 0hq A01;
    public final UserSession A02;
    public final 1Xj A03;

    public abstract int A00();

    public abstract Integer A01();

    public abstract String A02();

    public abstract void A03();

    public final void A04(DialogInterface.OnDismissListener onDismissListener) {
        1NY A0a = AnonymousClass7TG.A0a(this.A02);
        A0a.A0A(A02());
        DbX.A1M(A0a, "media_id", this.A03.getId());
        1OC A0K = DbW.A0K(A0a);
        C15619Ufl.A00(A0K, new F3H(onDismissListener, this.A01, A01()), this, 16);
        1ES.A03(A0K);
    }

    public C18070Vkx(Context context, 0hq r2, UserSession userSession, 1Xj r4) {
        this.A00 = context;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = userSession;
    }
}
