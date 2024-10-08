package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

public final class SF4 {
    public int A00;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public SF4(Context context) {
        this.A00 = 0;
        this.A03 = context.getApplicationContext();
    }

    public SF4() {
    }
}
