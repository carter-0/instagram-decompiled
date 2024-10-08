package X;

import com.facebook.common.callercontext.CallerContext;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.client.HttpResponseException;

/* renamed from: X.2gw  reason: invalid class name and case insensitive filesystem */
public abstract class C226512gw extends C226522gx {
    public CallerContext A00;
    public String A01;
    public final int A02;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public final Queue A04 = new ConcurrentLinkedQueue();
    public final Executor A05;
    public final AtomicInteger A06 = new AtomicInteger();
    public final AtomicReference A07 = new AtomicReference();
    public volatile Object A08;

    public static final void A01(C226512gw r2) {
        if (r2.A06.get() <= 0 && r2.A08 != null) {
            synchronized (r2.A07) {
                if (r2.A08 != null) {
                    r2.A08 = null;
                }
            }
        }
    }

    public final void A03(1TY r5) {
        boolean A002 = 1FH.A00(r5, (Object) null, this.A07);
        HttpResponseException A032 = r5.A03();
        if (A032 instanceof HttpResponseException) {
            A032.getStatusCode();
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                C226482gt r0 = (C226482gt) ((Reference) it.next()).get();
                if (r0 == null) {
                    it.remove();
                } else {
                    C226482gt.A00(r0);
                    if (A002) {
                        Map map = C67302Mlc.A00;
                        synchronized (map) {
                            map.remove(r0);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public C226512gw(Executor executor, int i) {
        this.A02 = i;
        this.A05 = executor;
    }
}
