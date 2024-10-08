package X;

import android.content.Context;

public final class S0N {
    public Integer A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.3Ri, java.lang.Object] */
    public final C241823Ri A00(Context context, AnonymousClass3RV r7) {
        AnonymousClass45J A0N = Pxf.A0N(context, r7, C66579MXk.A00(160));
        if (A0N.contains("DELIVERY_RETRY_INTERVAL")) {
            this.A00 = Integer.valueOf(A0N.getInt("DELIVERY_RETRY_INTERVAL", 300));
        }
        Integer num = this.A00;
        ? obj = new Object();
        obj.A03 = null;
        obj.A00 = 0;
        obj.A01 = null;
        obj.A02 = num;
        return obj;
    }
}
