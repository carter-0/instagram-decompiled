package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.5Kf  reason: invalid class name */
public abstract class AnonymousClass5Kf {
    public static final File A00(Context context, String str) {
        0qQ.A0B(context, 0);
        0qQ.A0B(str, 1);
        String A03 = 0qQ.A03(str, ".preferences_pb");
        0qQ.A0B(A03, 1);
        return new File(context.getApplicationContext().getFilesDir(), 0qQ.A03("datastore/", A03));
    }
}
