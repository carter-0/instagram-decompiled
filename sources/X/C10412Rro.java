package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Rro  reason: case insensitive filesystem */
public final class C10412Rro {
    public final SHT A00;
    public final File A01;

    public C10412Rro(Context context, SHT sht, String str) {
        File A002 = AnonymousClass0eX.A00(context, 343672752);
        A002.mkdirs();
        File A0s = JTO.A0s(A002, str);
        Pxf.A0U("mqtt_analytics.", str, context.getFilesDir()).renameTo(A0s);
        this.A01 = A0s;
        this.A00 = sht;
    }
}
