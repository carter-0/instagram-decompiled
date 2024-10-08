package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SQk  reason: case insensitive filesystem */
public final class C11375SQk {
    public static final long A05 = TimeUnit.HOURS.toMillis(24);
    public static final long A06 = TimeUnit.MINUTES.toMillis(5);
    public static final TO6 A07 = TO6.A00();
    public AtomicLong A00 = Pxe.A1D(A05);
    public AtomicLong A01 = Pxe.A1D(A06);
    public final AnonymousClass45J A02;
    public final LinkedHashSet A03 = DbS.A0y();
    public final AnonymousClass458 A04;

    public static T9D A00(C11375SQk sQk, String str) {
        String str2;
        String str3;
        T9D t9d;
        T9D t9d2;
        long j;
        String str4 = "";
        T9D t9d3 = C7860Qbk.A00;
        try {
            String string = sQk.A02.getString(str, str4);
            if (!TextUtils.isEmpty(string)) {
                C11258SHs A002 = C11258SHs.A00(string);
                if (A002 != null) {
                    j = System.currentTimeMillis() - A002.A02;
                    t9d = A002.A05;
                    t9d3 = A002.A04;
                    str2 = A002.A0A;
                    t9d2 = A002.A06;
                    str3 = A002.A09;
                    Intent intent = A002.A03;
                    if (intent.getPackage() != null) {
                        str4 = intent.getPackage();
                    }
                } else {
                    str2 = str4;
                    str3 = str4;
                    t9d = t9d3;
                    t9d2 = t9d3;
                    j = -1;
                }
                return new C7861Qbl(new C10793RyF(t9d, t9d3, t9d2, str2, str3, str4, j));
            }
        } catch (ClassCastException e) {
            0KC.A0L("NotificationDeliveryStorePreferences", "fail to read notif storeKey %s", e, new Object[]{str});
        }
        return t9d3;
    }

    public C11375SQk(Context context, AnonymousClass3RV r10, AnonymousClass458 r11, String str) {
        AnonymousClass45J A002 = r10.A00(context, 002.A0u("rti.mqtt.", "fbns_notification_store", "_", str));
        this.A02 = A002;
        this.A04 = r11;
        boolean z = false;
        if (A002.getBoolean("key_storage_size_limited_flag", false)) {
            Map all = A002.getAll();
            ArrayList A1C = AnonymousClass7TE.A1C();
            C13849TiS AR1 = A002.AR1();
            Iterator A0u = AnonymousClass7TF.A0u(all);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (!DbT.A13(A1J).equals("key_next_min_retry_ts") && !DbT.A13(A1J).equals("key_storage_size_limited_flag")) {
                    C11258SHs A003 = C11258SHs.A00(A1J.getValue());
                    if (A003 == null) {
                        AR1.ED1(DbT.A13(A1J));
                        z = true;
                    } else {
                        A1C.add(new AbstractMap.SimpleEntry(A1J.getKey(), Long.valueOf(A003.A02)));
                    }
                }
            }
            if (z) {
                AR1.AIO();
            }
            C13113TLw.A00(6, A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                this.A03.add(AnonymousClass7TE.A1J(it).getKey());
            }
            return;
        }
        C13849TiS AR12 = A002.AR1();
        AR12.AHK();
        AR12.AIO();
        C13849TiS AR13 = A002.AR1();
        AR13.E5R("key_storage_size_limited_flag", true);
        AR13.AIO();
    }

    public static void A01(C13849TiS tiS) {
        tiS.AIO();
    }
}
