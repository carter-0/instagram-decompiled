package X;

import android.content.Context;

public final /* synthetic */ class AX7 implements C3734495k {
    public final Context A00;

    public AX7(Context context) {
        this.A00 = context;
    }

    public final Object get() {
        AD1 ad1;
        Context context = this.A00;
        synchronized (AD1.class) {
            ad1 = AD1.A02;
            if (ad1 == null) {
                ad1 = new AD1(context);
                AD1.A02 = ad1;
            }
        }
        return ad1;
    }
}
