package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.Rus  reason: case insensitive filesystem */
public final class C10598Rus {
    public final Executor A00;
    public volatile S41 A01;
    public volatile Object A02;

    public C10598Rus(Looper looper, Object obj) {
        this.A00 = new C13164TNw(looper);
        AnonymousClass3Qk.A03(obj, "Listener must not be null");
        this.A02 = obj;
        AnonymousClass3Qk.A04("LocationCallback");
        this.A01 = new S41(obj);
    }
}
