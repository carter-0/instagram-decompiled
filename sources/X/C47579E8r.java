package X;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.E8r  reason: case insensitive filesystem */
public final class C47579E8r extends C331047Ph {
    public Context A00;
    public AnonymousClass3EO A01;
    public 0BQ A02;
    public Set A03 = AnonymousClass7TE.A1F();
    public final E9V A04;
    public final EA1 A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final List A07 = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.E9V, X.2rz, java.lang.Object] */
    public C47579E8r(Context context, AnonymousClass0iw r7, AnonymousClass0aP r8, E36 e36) {
        0BQ A002 = AnonymousClass0BO.A00(r8);
        AnonymousClass3EO A003 = AnonymousClass3EO.A00(r8);
        EA1 ea1 = new EA1(r7, e36);
        ? obj = new Object();
        this.A00 = context;
        this.A02 = A002;
        this.A01 = A003;
        this.A05 = ea1;
        this.A04 = obj;
        A0A(AnonymousClass7TE.A1D(Arrays.asList(new C231632rz[]{ea1, obj})));
    }

    public static void A00(C47579E8r e8r) {
        EVD evd;
        e8r.A06();
        for (Object next : e8r.A07) {
            if (e8r.A03.contains(next)) {
                evd = EVD.SELECTED;
            } else {
                evd = EVD.NOT_SELECTED;
            }
            e8r.A09(e8r.A05, next, evd);
        }
        List<Object> list = e8r.A06;
        if (!list.isEmpty()) {
            e8r.A08(e8r.A04, e8r.A00.getString(2131967732));
        }
        for (Object A09 : list) {
            e8r.A09(e8r.A05, A09, EVD.ALREADY_LOGGED_IN);
        }
        e8r.A07();
    }
}
