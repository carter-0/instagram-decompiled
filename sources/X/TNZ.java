package X;

import android.content.Context;
import java.util.concurrent.Callable;

public final class TNZ implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 1rR A02;
    public final /* synthetic */ String A03;

    public TNZ(Context context, 1rR r2, String str, int i) {
        this.A03 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return C11163SCx.A00(this.A01, this.A02, this.A03, this.A00);
    }
}
