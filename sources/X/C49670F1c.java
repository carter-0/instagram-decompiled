package X;

import android.content.Context;

/* renamed from: X.F1c  reason: case insensitive filesystem */
public abstract class C49670F1c {
    public static C49670F1c A00;

    public abstract void startDeviceValidation(Context context, String str);

    public static C49670F1c getInstance() {
        C49670F1c f1c = A00;
        if (f1c != null) {
            return f1c;
        }
        C47935ENm eNm = new C47935ENm();
        A00 = eNm;
        return eNm;
    }
}
