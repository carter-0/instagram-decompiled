package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.OrC  reason: case insensitive filesystem */
public final class C71810OrC implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;

    public C71810OrC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ListenableFuture listenableFuture, Object obj, Executor executor, int i) {
        C303646Ae.A02(new C71810OrC(obj, i), listenableFuture, executor);
    }

    public final /* synthetic */ Object apply(Object obj) {
        switch (this.A00) {
            case 2:
            case 6:
                return ((0sP) this.A01).invoke(obj);
            case 8:
                Context context = (Context) this.A01;
                0nC.A00(context, (String) obj);
                C59689JTv.A07(context, 2131965058);
                return null;
            default:
                return ((0sP) this.A01).invoke(obj);
        }
    }
}
