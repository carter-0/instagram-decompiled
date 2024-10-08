package X;

import android.content.SharedPreferences;

public final class SEI {
    public final long A00;
    public final /* synthetic */ C8486QvY A01;

    public static final void A00(SEI sei) {
        C8486QvY qvY = sei.A01;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = qvY.A00.edit();
        edit.remove(String.valueOf("monitoring").concat(":count"));
        edit.remove(String.valueOf("monitoring").concat(":value"));
        edit.putLong(String.valueOf("monitoring").concat(":start"), currentTimeMillis);
        edit.commit();
    }

    public SEI(C8486QvY qvY, long j) {
        this.A01 = qvY;
        AnonymousClass3Qk.A04("monitoring");
        AnonymousClass3Qk.A07(AnonymousClass7TF.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        this.A00 = j;
    }
}
