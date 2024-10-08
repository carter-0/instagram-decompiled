package X;

import java.util.concurrent.Callable;

/* renamed from: X.5O8  reason: invalid class name */
public final class AnonymousClass5O8 implements Callable {
    public final /* synthetic */ C279014xw A00;
    public final /* synthetic */ C283685Iu A01;

    public AnonymousClass5O8(C279014xw r1, C283685Iu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C279014xw r0 = this.A00;
        C251983oI r2 = r0.A01;
        r2.beginTransaction();
        try {
            r0.A00.insert(this.A01);
            r2.setTransactionSuccessful();
            return C60340gF.A00;
        } finally {
            r2.endTransaction();
        }
    }
}
