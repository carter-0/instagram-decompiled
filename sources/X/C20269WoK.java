package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;

/* renamed from: X.WoK  reason: case insensitive filesystem */
public final class C20269WoK implements Runnable {
    public final /* synthetic */ W2z A00;
    public final /* synthetic */ C20365Wq5 A01;
    public final /* synthetic */ C17304VQf[] A02;

    public C20269WoK(W2z w2z, C20365Wq5 wq5, C17304VQf[] vQfArr) {
        this.A00 = w2z;
        this.A02 = vQfArr;
        this.A01 = wq5;
    }

    public final void run() {
        W2z w2z = this.A00;
        W2z.A04(w2z);
        C17304VQf[] vQfArr = this.A02;
        Object[] objArr = new Object[210];
        int i = 0;
        do {
            int i2 = vQfArr[i].A00;
            Object obj = w2z.A04.get();
            obj.getClass();
            PackageManager packageManager = w2z.A01;
            SharedPreferences sharedPreferences = w2z.A00;
            sharedPreferences.getClass();
            objArr[i] = W2z.A03((Context) obj, sharedPreferences, packageManager, i2);
            i++;
        } while (i < 210);
        C20365Wq5 wq5 = this.A01;
        wq5.A00 = objArr;
        w2z.A02.post(wq5);
    }
}
