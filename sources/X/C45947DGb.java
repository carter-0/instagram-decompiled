package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.DGb  reason: case insensitive filesystem */
public final class C45947DGb implements 2IR {
    public final /* synthetic */ DQV A00;
    public final /* synthetic */ C312926fP A01;
    public final /* synthetic */ List A02;

    public C45947DGb(DQV dqv, C312926fP r2, List list) {
        this.A01 = r2;
        this.A00 = dqv;
        this.A02 = list;
    }

    public final void onFailure(Throwable th) {
        this.A00.D5B((Exception) th, this.A02, (Map) null);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.D5B((Exception) null, this.A02, (Map) obj);
    }
}
