package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

public final class SHF {
    public static SHF A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final SPD A02;

    /* JADX INFO: finally extract failed */
    public final synchronized void A01() {
        SPD spd = this.A02;
        Lock lock = spd.A01;
        lock.lock();
        try {
            Pxg.A1C(spd.A00);
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized SHF A00(Context context) {
        SHF shf;
        synchronized (SHF.class) {
            Context applicationContext = context.getApplicationContext();
            shf = A03;
            if (shf == null) {
                shf = new SHF(applicationContext);
                A03 = shf;
            }
        }
        return shf;
    }

    public SHF(Context context) {
        SPD A002 = SPD.A00(context);
        this.A02 = A002;
        this.A00 = A002.A01();
        this.A01 = A002.A02();
    }
}
