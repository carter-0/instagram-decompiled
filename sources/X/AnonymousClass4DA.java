package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.4DA  reason: invalid class name */
public final class AnonymousClass4DA implements ThreadFactory {
    public final /* synthetic */ int A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass4DA(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public final Thread newThread(Runnable runnable) {
        if (this.A01) {
            0ST.A00(runnable, "Fury", 2);
        }
        return new 0nq(runnable, "Image Decoding", this.A00);
    }
}
