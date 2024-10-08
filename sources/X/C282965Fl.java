package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5Fl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C282965Fl implements Runnable {
    public final /* synthetic */ AnonymousClass39K A00;
    public final /* synthetic */ C282905Ff A01;
    public final /* synthetic */ ListenableFuture A02;

    public /* synthetic */ C282965Fl(AnonymousClass39K r1, C282905Ff r2, ListenableFuture listenableFuture) {
        this.A00 = r1;
        this.A02 = listenableFuture;
        this.A01 = r2;
    }

    public final void run() {
        boolean z;
        AnonymousClass39K r6 = this.A00;
        ListenableFuture listenableFuture = this.A02;
        C282905Ff r5 = this.A01;
        try {
            z = ((Boolean) listenableFuture.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        synchronized (r6.A09) {
            C255373u1 A002 = C255363u0.A00(r5.A08);
            String str = A002.A01;
            C282905Ff r0 = (C282905Ff) r6.A05.get(str);
            if (r0 == null) {
                r0 = (C282905Ff) r6.A04.get(str);
            }
            if (r0 == r5) {
                AnonymousClass39K.A00(r6, str);
            }
            AnonymousClass389.A00();
            for (AnonymousClass39S DDI : r6.A0A) {
                DDI.DDI(A002, z);
            }
        }
    }
}
