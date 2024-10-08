package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.FlI  reason: case insensitive filesystem */
public final class C50929FlI implements 0Jv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C47410E1c A01;
    public final /* synthetic */ String A02;

    public C50929FlI(Context context, C47410E1c e1c, String str) {
        this.A01 = e1c;
        this.A02 = str;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void AId(Object obj) {
        C48223Eb4 eb4 = (C48223Eb4) obj;
        if (eb4 != null) {
            this.A01.A0A.put(this.A02, eb4.A00);
        }
        C47410E1c e1c = this.A01;
        Map map = e1c.A0A;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            if (A0v.next() == EVQ.PENDING) {
                return;
            }
        }
        AnonymousClass1Nd.A00(e1c.A00).A00(new C323996yR(e1c.A02.A0C(), map));
        DbX.A14(this.A00, AnonymousClass37D.A00);
    }
}
