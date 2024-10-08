package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

public final class M97 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ G64 A02;

    public M97(Context context, FragmentActivity fragmentActivity, G64 g64) {
        this.A00 = context;
        this.A02 = g64;
        this.A01 = fragmentActivity;
    }

    public final void run() {
        DbX.A14(this.A00, AnonymousClass37D.A00);
        this.A02.CHr(this.A01);
    }
}
