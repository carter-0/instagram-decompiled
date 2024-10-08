package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.Sql  reason: case insensitive filesystem */
public final class C12287Sql implements C13723Tfp {
    public final Context A00;

    public C12287Sql(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final String CfJ() {
        return "fs";
    }

    public final HashMap E4i() {
        HashMap A1E = AnonymousClass7TE.A1E();
        C9585RdP.A00(Environment.getDataDirectory(), "device", A1E);
        try {
            synchronized (0eY.class) {
            }
            0qQ.A07(Environment.getExternalStorageDirectory());
            Environment.getExternalStorageState();
            String A002 = AnonymousClass000.A00(707);
            0sC A003 = 0pe.A00(this.A00.getExternalFilesDirs((String) null));
            while (A003.hasNext()) {
                File file = (File) A003.next();
                if (file != null) {
                    String externalStorageState = Environment.getExternalStorageState(file);
                    if (A002.equals(externalStorageState) || C66579MXk.A00(360).equals(externalStorageState)) {
                        String str = "external";
                        if (Environment.isExternalStorageRemovable()) {
                            str = "sd";
                        }
                        C9585RdP.A00(file, str, A1E);
                    }
                }
            }
        } catch (Exception e) {
            0I1.A07("FsInfoDataProvider", "Failed to measure external fs information", e);
        }
        return A1E;
    }
}
