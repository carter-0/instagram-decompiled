package X;

import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import org.chromium.IsReadyToPayServiceCallback;

public final class TH0 implements Runnable {
    public final /* synthetic */ IsReadyToPayServiceImpl A00;
    public final /* synthetic */ IsReadyToPayServiceCallback A01;

    public TH0(IsReadyToPayServiceImpl isReadyToPayServiceImpl, IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        this.A00 = isReadyToPayServiceImpl;
        this.A01 = isReadyToPayServiceCallback;
    }

    public final void run() {
        IsReadyToPayServiceImpl isReadyToPayServiceImpl = this.A00;
        IsReadyToPayServiceCallback isReadyToPayServiceCallback = this.A01;
        AnonymousClass2gB A002 = AnonymousClass2IK.A04.A02().A00();
        A002.A06(isReadyToPayServiceImpl, new C11648Sdq(32, (Object) A002, (Object) isReadyToPayServiceCallback));
    }
}
