package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;

public final class AD1 {
    public static AD1 A02;
    public static final SimpleDateFormat A03 = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences A00;
    public final SharedPreferences A01;

    public AD1(Context context) {
        this.A01 = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.A00 = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }
}
