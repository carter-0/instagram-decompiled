package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Sq4  reason: case insensitive filesystem */
public abstract class C12250Sq4 implements C13440TaT {
    public int A00 = ((int) (System.currentTimeMillis() / 86400000));
    public long A01 = SystemClock.elapsedRealtime();
    public AnonymousClass45J A02;
    public final String A03;
    public final Context A04;
    public final RealtimeSinceBootClock A05;
    public final AnonymousClass458 A06;
    public final String A07;
    public final HashMap A08 = AnonymousClass7TE.A1E();
    public final boolean A09;

    private synchronized void A01() {
        if (this.A02 == null) {
            Context context = this.A04;
            context.getApplicationContext();
            this.A02 = ((AnonymousClass3RX) AnonymousClass3RD.A00).A02().A00(context.getApplicationContext(), 002.A0u("rti.mqtt.counter.", this.A07, ".", this.A03));
        }
    }

    private void A00() {
        HashMap A19;
        if (this.A09) {
            HashMap hashMap = this.A08;
            synchronized (hashMap) {
                A19 = Pxe.A19(hashMap);
                hashMap.clear();
            }
            if (!A19.isEmpty()) {
                A01();
                C13849TiS AR1 = this.A02.AR1();
                Iterator A0s = AnonymousClass7TF.A0s(A19);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    AR1.E5a(DbT.A13(A1J), this.A02.getLong(DbT.A13(A1J), 0) + AnonymousClass7TE.A0R(A1J.getValue()));
                }
                AR1.AIO();
                this.A01 = SystemClock.elapsedRealtime();
            }
        }
    }

    public C12250Sq4(Context context, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass458 r7, String str, String str2, boolean z) {
        this.A04 = context;
        this.A07 = str;
        this.A06 = r7;
        this.A05 = realtimeSinceBootClock;
        this.A03 = str2;
        this.A09 = z;
    }

    public final JSONObject A02(boolean z) {
        int indexOf;
        A01();
        JSONObject A11 = DbS.A11();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        Map all = this.A02.getAll();
        C13849TiS AR1 = this.A02.AR1();
        Iterator A0u = AnonymousClass7TF.A0u(all);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            int i = 0;
            if (A13 != null && (indexOf = A13.indexOf(".")) > 0) {
                try {
                    i = Integer.parseInt(A13.substring(0, indexOf));
                } catch (NumberFormatException unused) {
                }
            }
            if (i <= currentTimeMillis && i + 3 >= currentTimeMillis) {
                if (z) {
                    A11.putOpt(DbT.A13(A1J), A1J.getValue());
                } else if (i != currentTimeMillis) {
                    A11.putOpt(DbT.A13(A1J), A1J.getValue());
                }
            }
            AR1.ED1(DbT.A13(A1J));
        }
        AR1.AIO();
        if (A11.length() == 0) {
            return null;
        }
        if (!z) {
            return A11;
        }
        JSONObject A112 = DbS.A11();
        A112.put("period_ms", System.currentTimeMillis() % 86400000);
        A112.put("data", A11);
        return A112;
    }

    public final void A03(String[] strArr, long j) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        if (this.A00 != currentTimeMillis) {
            this.A00 = currentTimeMillis;
            A00();
        }
        StringBuilder A0n = AnonymousClass7TF.A0n(String.valueOf(currentTimeMillis));
        for (String append : strArr) {
            A0n.append(".");
            A0n.append(append);
        }
        String obj = A0n.toString();
        HashMap hashMap = this.A08;
        synchronized (hashMap) {
            Long l = (Long) hashMap.get(obj);
            if (l == null) {
                l = C51971G9r.A0m();
            }
            Pxe.A1X(obj, hashMap, l.longValue() + j);
        }
        if (SystemClock.elapsedRealtime() - this.A01 > 3600000) {
            A00();
        }
    }
}
