package X;

import java.net.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.RwF  reason: case insensitive filesystem */
public final class C10676RwF {
    public Proxy A00;
    public final C10229Rop A01 = new C10229Rop(new Object());
    public final ExecutorService A02 = Executors.newFixedThreadPool(2);
    public final SSLSocketFactory A03 = ((SSLSocketFactory) SSLSocketFactory.getDefault());
}
