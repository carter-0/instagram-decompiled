package X;

import java.util.concurrent.Callable;

/* renamed from: X.503  reason: invalid class name */
public final class AnonymousClass503 implements Callable {
    public final /* synthetic */ AnonymousClass502 A00;
    public final /* synthetic */ AnonymousClass2Or A01;

    public AnonymousClass503(AnonymousClass502 r1, AnonymousClass2Or r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass502 r2 = this.A00;
        AnonymousClass502.A00(r2);
        String str = r2.A00;
        r2.A00 = null;
        return str;
    }
}
