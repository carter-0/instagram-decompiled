package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.BlockingQueue;

public final class THH implements Runnable {
    public final /* synthetic */ ListenableFuture A00;
    public final /* synthetic */ BlockingQueue A01;

    public THH(ListenableFuture listenableFuture, BlockingQueue blockingQueue) {
        this.A01 = blockingQueue;
        this.A00 = listenableFuture;
    }

    public final void run() {
        this.A01.add(this.A00);
    }
}
