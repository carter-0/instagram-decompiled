package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.cryptocontextfactory.gen.CryptoContextFactory;

/* renamed from: X.6E0  reason: invalid class name */
public final class AnonymousClass6E0 {
    public static final AnonymousClass6E1 A01 = new Object();
    public final CryptoContextHolder A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6E1, java.lang.Object] */
    static {
        0dV.A0C("cryptocontextholder");
    }

    public AnonymousClass6E0(Mailbox mailbox, long j) {
        CryptoContextHolder createContextHolder = CryptoContextFactory.CProxy.createContextHolder(j, mailbox);
        0qQ.A07(createContextHolder);
        this.A00 = createContextHolder;
    }
}
