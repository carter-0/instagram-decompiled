package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.TNa  reason: case insensitive filesystem */
public final class C13142TNa implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 1rR A02;
    public final /* synthetic */ String A03;

    public C13142TNa(Context context, 1rR r2, String str, int i) {
        this.A03 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            return C11163SCx.A00(this.A01, this.A02, this.A03, this.A00);
        } catch (Throwable unused) {
            return new SE3(-3);
        }
    }
}
