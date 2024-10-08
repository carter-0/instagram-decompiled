package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.Sww  reason: case insensitive filesystem */
public final class C12545Sww implements C13740TgC {
    public static final Uri A01;
    public final LogPrinter A00 = new LogPrinter(4, "GA/LogCatTransport");

    public final Uri FPA() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    public final void FPI(C11350SOj sOj) {
        ArrayList A0e = Dba.A0e(sOj.A09);
        Collections.sort(A0e, new Object());
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int size = A0e.size();
        int i = 0;
        while (i < size) {
            Object obj = A0e.get(i);
            i++;
            String obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (A1A.length() != 0) {
                    Pxe.A1Y(A1A);
                }
                A1A.append(obj2);
            }
        }
        this.A00.println(A1A.toString());
    }

    static {
        Uri.Builder A0I = Pxe.A0I();
        A0I.scheme("uri");
        A0I.authority("local");
        A01 = A0I.build();
    }
}
