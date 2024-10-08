package X;

import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.8nq  reason: invalid class name and case insensitive filesystem */
public final class C365888nq implements Callable {
    public final /* synthetic */ C340597lW A00;
    public final /* synthetic */ UUID A01;

    public final /* bridge */ /* synthetic */ Object call() {
        int i = 0;
        try {
            UUID uuid = this.A01;
            C340597lW r5 = this.A00;
            C340767ln r4 = r5.A0Y;
            int i2 = 0;
            if (!2Ob.A00(uuid, r4.A03)) {
                i2 = 1;
            }
            C340577lU.A00(24, i2, (Object) null);
            C340597lW.A00(r5);
            if (r5.A0m != null) {
                r5.A0m.ECm(r5.A0m.C3J());
                r5.A0m = null;
                r5.A0C = null;
            }
            r5.A0F = null;
            r5.A0A = null;
            r5.A0n = false;
            C340577lU.A00(25, 2Ob.A00(uuid, r4.A03) ^ true ? 1 : 0, (Object) null);
            return null;
        } catch (Exception e) {
            if (!2Ob.A00(this.A01, this.A00.A0Y.A03)) {
                i = 1;
            }
            C340577lU.A00(26, i, e);
            throw e;
        } catch (Throwable th) {
            C340577lU.A00(25, 2Ob.A00(this.A01, this.A00.A0Y.A03) ^ true ? 1 : 0, (Object) null);
            throw th;
        }
    }

    public C365888nq(C340597lW r1, UUID uuid) {
        this.A00 = r1;
        this.A01 = uuid;
    }
}
