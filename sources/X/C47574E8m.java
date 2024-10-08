package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.E8m  reason: case insensitive filesystem */
public final class C47574E8m extends C331047Ph {
    public final C47623EAj A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final Context A02;
    public final E9O A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2s0, java.lang.Object, X.E9O] */
    public C47574E8m(Context context, AnonymousClass0iw r9, UserSession userSession, G8F g8f) {
        this.A02 = context;
        ? obj = new Object();
        obj.A00 = context;
        this.A03 = obj;
        C47623EAj eAj = new C47623EAj(context, r9, userSession, g8f, false);
        this.A00 = eAj;
        A0B(obj, eAj);
    }

    public final void A0C() {
        A06();
        List list = this.A01;
        if (!list.isEmpty()) {
            A08(this.A03, this.A02.getString(2131974699));
        }
        for (int i = 0; i < list.size(); i++) {
            A09(this.A00, list.get(i), Integer.valueOf(i));
        }
        A07();
    }
}
