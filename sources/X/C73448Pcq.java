package X;

import com.facebook.msys.mca.Mailbox;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

/* renamed from: X.Pcq  reason: case insensitive filesystem */
public final class C73448Pcq implements Consumer {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ 0rm A01;

    public C73448Pcq(CountDownLatch countDownLatch, 0rm r2) {
        this.A01 = r2;
        this.A00 = countDownLatch;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C269794fh A002 = AnonymousClass6F9.A00("IgMailbox.get");
        A002.A00.A01(new C73318Pad((Mailbox) obj, this.A00, this.A01));
    }
}
