package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class E9B extends 2Ru {
    public C49521Ex0 A00;
    public final C47594E9g A01;
    public final E9Y A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.E9Y, X.2s0, java.lang.Object] */
    public E9B(UserSession userSession) {
        super(false);
        ? obj = new Object();
        this.A02 = obj;
        C47594E9g e9g = new C47594E9g(userSession);
        this.A01 = e9g;
        init(new C231642s0[]{obj, e9g});
    }

    public final void A00(C49521Ex0 ex0) {
        this.A00 = ex0;
        clear();
        C49521Ex0 ex02 = this.A00;
        if (ex02 != null) {
            Iterator A0o = DbY.A0o(ex02.A01);
            while (A0o.hasNext()) {
                addModel(A0o.next(), this.A02);
            }
            addModel(ex02.A00, this.A01);
        }
        notifyDataSetChanged();
    }
}
