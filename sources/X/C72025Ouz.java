package X;

import java.util.List;

/* renamed from: X.Ouz  reason: case insensitive filesystem */
public final class C72025Ouz implements AnonymousClass68Z {
    public final int A00;
    public final long A01;
    public final Object A02;

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            long j = this.A01;
            return 1aU.A07(new C72140Owz((AnonymousClass67N) this.A02, (List) obj2, 1, j), AnonymousClass6F9.A00("instagram_secure_participants_add"));
        }
        long j2 = this.A01;
        AnonymousClass67N r3 = (AnonymousClass67N) obj2;
        return 1aU.A07(new C72140Owz(r3, (List) this.A02, 0, j2), AnonymousClass6F9.A00("tam_client_request_participants_remove"));
    }

    public C72025Ouz(long j, Object obj, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
