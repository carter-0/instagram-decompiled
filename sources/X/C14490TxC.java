package X;

import java.util.UUID;

/* renamed from: X.TxC  reason: case insensitive filesystem */
public final class C14490TxC extends C66972Mg5 {
    public final Integer A00;
    public final String A01;

    public C14490TxC(Integer num) {
        super("shimmer");
        this.A00 = num;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A01 = obj;
    }

    public final long A00() {
        return 30;
    }

    public final String A02() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public C14490TxC() {
        this(AnonymousClass05K.A00);
    }
}
