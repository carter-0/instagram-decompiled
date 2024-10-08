package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.6NP  reason: invalid class name */
public final class AnonymousClass6NP implements AnonymousClass6NN {
    public final /* synthetic */ AnonymousClass6LP A00;
    public final /* synthetic */ AnonymousClass6NN A01;
    public final /* synthetic */ C52367GPo A02;

    public AnonymousClass6NP(AnonymousClass6LP r1, AnonymousClass6NN r2, C52367GPo gPo) {
        this.A02 = gPo;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            this.A00.A07();
            return;
        }
        this.A02.A08.DOf(3);
        AnonymousClass6LP r1 = this.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        r1.A0F(message);
        this.A01.onFailure(th);
    }

    public final void onSuccess() {
        this.A02.A08.DOf(2);
        this.A01.onSuccess();
    }
}
