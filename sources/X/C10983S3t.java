package X;

import android.text.TextUtils;
import java.util.LinkedList;

/* renamed from: X.S3t  reason: case insensitive filesystem */
public final class C10983S3t {
    public final SHT A00;

    public C10983S3t(SHT sht) {
        this.A00 = sht;
    }

    public final void A00(String str, String str2) {
        A01("failures", new String[]{str, str2}, 1);
    }

    public final void A01(String str, String[] strArr, long j) {
        LinkedList A1A = Pxe.A1A();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                A1A.add(str2);
            }
        }
        SHT sht = this.A00;
        S6G s6g = new S6G(str, j);
        s6g.A01 = A1A;
        sht.A00(s6g);
    }
}
