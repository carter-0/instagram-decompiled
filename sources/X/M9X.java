package X;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class M9X implements Runnable {
    public final /* synthetic */ C65265LqK A00;
    public final /* synthetic */ AnonymousClass7LQ A01;
    public final /* synthetic */ C254703su A02;
    public final /* synthetic */ WeakReference A03;

    public M9X(C65265LqK lqK, AnonymousClass7LQ r2, C254703su r3, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A01 = r2;
        this.A00 = lqK;
        this.A02 = r3;
    }

    public final void run() {
        Context context = (Context) this.A03.get();
        if (context != null) {
            C310336ap A0X = DbV.A0X();
            A0X.A0H = "translate_message_error";
            DbS.A19(context, A0X, 2131959804);
            A0X.A0I = context.getString(2131959806);
            DbY.A1N(A0X);
        }
        this.A01.A0b = false;
        this.A00.A00.BSN().EdR(AnonymousClass05K.A00, this.A02.A0h(), false);
    }
}
