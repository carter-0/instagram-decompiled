package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Ske  reason: case insensitive filesystem */
public final class C12017Ske implements C13546TcI {
    public final /* synthetic */ C7902QcU A00;
    public final /* synthetic */ Q93 A01;

    public C12017Ske(C7902QcU qcU, Q93 q93) {
        this.A01 = q93;
        this.A00 = qcU;
    }

    public final void onLog(String str) {
        if (!TextUtils.isEmpty(str)) {
            Q93 q93 = this.A01;
            List<C13546TcI> list = q93.A02;
            synchronized (list) {
                for (C13546TcI onLog : list) {
                    onLog.onLog(str);
                }
            }
            if (str.startsWith("FB_IX_PAGE_READY")) {
                List<C13548TcK> list2 = q93.A04;
                synchronized (list2) {
                    for (C13548TcK DW6 : list2) {
                        DW6.DW6(this.A00);
                    }
                }
            }
        }
    }
}
