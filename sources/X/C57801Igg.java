package X;

import java.util.function.IntConsumer;

/* renamed from: X.Igg  reason: case insensitive filesystem */
public final /* synthetic */ class C57801Igg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntConsumer A01;

    public /* synthetic */ C57801Igg(IntConsumer intConsumer, int i) {
        this.A01 = intConsumer;
        this.A00 = i;
    }

    public final void run() {
        this.A01.accept(this.A00);
    }
}
