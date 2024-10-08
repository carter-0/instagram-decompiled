package X;

import android.text.TextUtils;

public final class TL3 implements Runnable {
    public final /* synthetic */ C10699Rwd A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Throwable A03;

    public TL3(C10699Rwd rwd, Object obj, String str, Throwable th) {
        this.A00 = rwd;
        this.A03 = th;
        this.A02 = str;
        this.A01 = obj;
    }

    public static void A00(TL3 tl3, String str, Throwable th) {
        C10699Rwd rwd = tl3.A00;
        C11246SHg sHg = rwd.A01;
        Object obj = tl3.A01;
        rwd.A03.execute(new TKG(rwd.A00, sHg, obj, str, th));
    }

    public final void run() {
        IllegalArgumentException e = this.A03;
        String str = null;
        try {
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2)) {
                str = this.A00.A02.decodeResponse(str2);
            }
        } catch (IllegalArgumentException e2) {
        } finally {
            A00(this, str, e2);
        }
    }
}
