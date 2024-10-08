package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.E8s  reason: case insensitive filesystem */
public final class C47580E8s extends C331047Ph {
    public final ArrayList A00 = AnonymousClass7TE.A1C();
    public final Context A01;
    public final C47605E9r A02;
    public final E9S A03;

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2s0, X.E9S, java.lang.Object] */
    public C47580E8s(Context context, E7A e7a, AnonymousClass0iw r5) {
        this.A01 = context;
        C47605E9r e9r = new C47605E9r(e7a, r5);
        this.A02 = e9r;
        ? obj = new Object();
        this.A03 = obj;
        A0B(obj, e9r);
    }

    public static void A00(C47580E8s e8s) {
        e8s.A06();
        e8s.A08(e8s.A03, e8s.A01.getString(2131952059));
        Iterator it = e8s.A00.iterator();
        while (it.hasNext()) {
            e8s.A08(e8s.A02, it.next());
        }
        e8s.A07();
    }
}
