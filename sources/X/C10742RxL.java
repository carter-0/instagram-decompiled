package X;

import android.content.Context;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.RxL  reason: case insensitive filesystem */
public final class C10742RxL {
    public final C10950S2i A00;
    public final C12175SoQ A01;
    public final QY4 A02;
    public final Executor A03 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new TOO("com.facebook.papaya.api_run_thread", 1)));
    public final Executor A04 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new TOO("com.facebook.papaya.api_stop_thread", 1)));

    /* JADX WARNING: type inference failed for: r4v0, types: [X.SoQ, com.facebook.papaya.client.ICallback, java.lang.Object] */
    public C10742RxL(Context context, C10792RyE ryE) {
        ? obj = new Object();
        this.A01 = obj;
        QY4 qy4 = new QY4();
        this.A02 = qy4;
        this.A00 = new C10950S2i(context, obj, ryE, qy4);
    }
}
