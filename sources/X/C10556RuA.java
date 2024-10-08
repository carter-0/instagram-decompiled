package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.RuA  reason: case insensitive filesystem */
public final class C10556RuA {
    public final C10935S1o A00;
    public final SHT A01;
    public final File A02;

    public C10556RuA(Context context, SHT sht, C13575Td0 td0, String str, String str2) {
        this.A00 = new C10935S1o(new C10227Ron(td0), 002.A0g("725056107548211", "|", "0e20c3123a90c76c02c901b7415ff67f"), str2);
        File A002 = AnonymousClass0eX.A00(context, 343672752);
        A002.mkdirs();
        File A0s = JTO.A0s(A002, str);
        Pxf.A0U("mqtt_analytics.", str, context.getFilesDir()).renameTo(A0s);
        this.A02 = A0s;
        this.A01 = sht;
    }
}
