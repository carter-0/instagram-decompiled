package X;

import java.util.concurrent.Callable;

/* renamed from: X.7z1  reason: invalid class name and case insensitive filesystem */
public final class C348787z1 implements Callable {
    public final /* synthetic */ C311976dc A00;
    public final /* synthetic */ C346117ud A01;

    public C348787z1(C311976dc r1, C346117ud r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C311976dc r0 = this.A00;
        C251983oI r2 = r0.A07;
        r2.beginTransaction();
        try {
            r0.A01.A00(this.A01);
            r2.setTransactionSuccessful();
            return C60340gF.A00;
        } finally {
            r2.endTransaction();
        }
    }
}
