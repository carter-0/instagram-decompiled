package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class SP2 {
    public BroadcastReceiver A00;
    public C11375SQk A01;
    public final Context A02;
    public final C241903Rv A03;
    public final AnonymousClass458 A04;
    public final FbnsServiceDelegate A05;
    public final String A06;

    public SP2(C241903Rv r3, AnonymousClass458 r4, FbnsServiceDelegate fbnsServiceDelegate) {
        Context A052 = DbT.A05(fbnsServiceDelegate.A01);
        String A002 = C9560Rcx.A00(AnonymousClass05K.A01);
        this.A02 = A052;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = A002;
        this.A05 = fbnsServiceDelegate;
    }

    public final C11375SQk A03() {
        C11375SQk sQk = this.A01;
        if (sQk != null) {
            return sQk;
        }
        Context context = this.A02;
        AnonymousClass3RV A022 = ((AnonymousClass3RX) AnonymousClass3RD.A00).A02();
        TO6 to6 = C11375SQk.A07;
        C11375SQk sQk2 = new C11375SQk(context, A022, this.A04, 002.A0T(this.A06, "FBNS_LITE", '_'));
        this.A01 = sQk2;
        return sQk2;
    }

    public final void A04(C10413Rrp rrp, String str, String str2) {
        FbnsServiceDelegate fbnsServiceDelegate = this.A05;
        String str3 = str;
        if (str2 != null) {
            str3 = 002.A0T(str, str2, '_');
        }
        T9D A0U = fbnsServiceDelegate.A0U(str3);
        if (A0U instanceof C7860Qbk) {
            C11375SQk A032 = A03();
            synchronized (A032) {
                A0U = C11375SQk.A00(A032, str);
                A032.A03.remove(str);
                C13849TiS AR1 = A032.A02.AR1();
                AR1.ED1(str);
                AR1.AIO();
            }
        }
        if (!(A0U instanceof C7860Qbk)) {
            fbnsServiceDelegate.A0X(rrp, (C10793RyF) A0U.A01(), str, str2);
        }
    }

    public static C10413Rrp A00(Intent intent, T9D t9d, SP2 sp2, String str) {
        Integer num;
        String str2 = intent.getPackage();
        if (str2 == null) {
            str2 = "";
        }
        if (C66579MXk.A00(724).equals(intent.getAction()) || "com.facebook.rti.fbns.intent.RECEIVE_RTC".equals(intent.getAction()) || "com.facebook.rti.fbns.intent.RECEIVE_VR".equals(intent.getAction())) {
            FbnsServiceDelegate fbnsServiceDelegate = sp2.A05;
            FbnsServiceDelegate fbnsServiceDelegate2 = FbnsServiceDelegate.A0D;
            C241903Rv r2 = sp2.A03;
            r2.A02(intent);
            intent.setPackage(str2);
            if (!((AnonymousClass3RX) AnonymousClass3RD.A00).A01(intent, r2).CeN()) {
                num = AnonymousClass05K.A15;
            } else if (r2.A01.A08(r2.A00, intent)) {
                num = AnonymousClass05K.A0Y;
            } else {
                num = AnonymousClass05K.A0j;
            }
            C10413Rrp rrp = new C10413Rrp(C7860Qbk.A00, num);
            if (S9K.A01(rrp.A01)) {
                return rrp;
            }
            fbnsServiceDelegate.A0Y(t9d, str2, "secure broadcast failed", (String) null, "Error: secure-broadcast failed", str);
            return rrp;
        }
        return new C10413Rrp(C7861Qbl.A00(002.A0R("Invalid action ", intent.getAction())), AnonymousClass05K.A00);
    }

    public static void A01(Context context, T9D t9d, T9D t9d2, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            Intent A0G = Pxe.A0G("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
            A0G.setPackage(str);
            A0G.putExtra(C66579MXk.A00(34), str2);
            A0G.putExtra("extra_processor_completed", z);
            if (!(t9d instanceof C7860Qbk)) {
                A0G.putExtra("processor_failed_reason", (String) t9d.A01());
            }
            if (!(t9d2 instanceof C7860Qbk)) {
                A0G.putExtra("job_id", (String) t9d2.A01());
            }
            C241903Rv r5 = new C241903Rv(context, (Boolean) null);
            r5.A02(A0G);
            if (str != null) {
                A0G.setPackage(str);
                if (((AnonymousClass3RX) AnonymousClass3RD.A00).A01(A0G, r5).CeN()) {
                    r5.A01.A08(r5.A00, A0G);
                    return;
                }
                return;
            }
            AnonymousClass3RX r3 = (AnonymousClass3RX) AnonymousClass3RD.A00;
            Iterator A16 = Pxg.A16(r3.A08);
            while (A16.hasNext()) {
                A0G.setPackage(AnonymousClass7TE.A18(A16));
                if (r3.A01(A0G, r5).CeN()) {
                    r5.A01.A08(r5.A00, A0G);
                }
            }
        }
    }

    public final int A02() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        C11375SQk A032 = A03();
        synchronized (A032) {
            A1C.clear();
            A1C2.clear();
            AnonymousClass45J r2 = A032.A02;
            Map all = r2.getAll();
            C13849TiS AR1 = r2.AR1();
            if (System.currentTimeMillis() >= r2.getLong("key_next_min_retry_ts", 0)) {
                boolean z = false;
                Long l = null;
                Iterator A0u = AnonymousClass7TF.A0u(all);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    if (!DbT.A13(A1J).equals("key_next_min_retry_ts") && !DbT.A13(A1J).equals("key_storage_size_limited_flag")) {
                        C11258SHs A002 = C11258SHs.A00(A1J.getValue());
                        if (A002 != null) {
                            long j = A002.A02;
                            if (j + A032.A00.get() < System.currentTimeMillis() || j > System.currentTimeMillis()) {
                                String A13 = DbT.A13(A1J);
                                String str = A002.A09;
                                A002.A03.getPackage();
                                if (A13.equals(str)) {
                                    A1C2.add(A002);
                                }
                            } else {
                                long j2 = A002.A00;
                                AtomicLong atomicLong = A032.A01;
                                long j3 = j2 + atomicLong.get();
                                if (j3 <= System.currentTimeMillis()) {
                                    T9D t9d = A002.A01;
                                    if ((t9d instanceof C7860Qbk) || !AnonymousClass7TE.A1a(t9d.A01())) {
                                        String str2 = A002.A09;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        A002.A00 = currentTimeMillis;
                                        j3 = currentTimeMillis + atomicLong.get();
                                        A1C.add(A002);
                                        A002.A03.getPackage();
                                        String A012 = A002.A01();
                                        if (!TextUtils.isEmpty(A012)) {
                                            AR1.E5e(str2, A012);
                                            z = true;
                                        }
                                    }
                                }
                                if (l == null) {
                                    l = Long.valueOf(j3);
                                } else {
                                    l = Long.valueOf(Math.min(l.longValue(), j3));
                                }
                            }
                        }
                        A032.A03.remove(A1J.getKey());
                        AR1.ED1(DbT.A13(A1J));
                        z = true;
                    }
                }
                if (l != null) {
                    AR1.E5a("key_next_min_retry_ts", l.longValue());
                } else if (z) {
                }
                AR1.AIO();
            }
        }
        Iterator it = A1C2.iterator();
        while (it.hasNext()) {
            C11258SHs sHs = (C11258SHs) it.next();
            if (sHs != null) {
                String str3 = sHs.A09;
                Intent intent = sHs.A03;
                if (intent != null) {
                    A04(new C10413Rrp(C7860Qbk.A00, AnonymousClass05K.A01), str3, intent.getPackage());
                }
            }
        }
        int i = 0;
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            C11258SHs sHs2 = (C11258SHs) it2.next();
            String str4 = sHs2.A09;
            Intent intent2 = sHs2.A03;
            T9D t9d2 = sHs2.A05;
            String str5 = sHs2.A0A;
            FbnsServiceDelegate fbnsServiceDelegate = this.A05;
            String str6 = intent2.getPackage();
            fbnsServiceDelegate.A03.Cgi(002.A0u("Redeliver Notif: notifId = ", str4, "; target = ", str6));
            HashMap A1E = AnonymousClass7TE.A1E();
            if (!(t9d2 instanceof C7860Qbk)) {
                A1E.put("l", String.valueOf(t9d2.A01()));
            }
            A1E.put("src", str5);
            FbnsServiceDelegate.A03(fbnsServiceDelegate, "redeliver", str4, str6, (String) null, A1E, 0);
            C10413Rrp A003 = A00(intent2, t9d2, this, str5);
            Integer num = A003.A01;
            if (S9K.A00(num)) {
                A04(A003, str4, intent2.getPackage());
            } else if (!S9K.A01(num)) {
                String str7 = intent2.getPackage();
                C10983S3t s3t = fbnsServiceDelegate.A09;
                if (s3t != null) {
                    s3t.A01(AnonymousClass000.A00(3641), new String[]{"intermittent_fail", str7}, 1);
                }
            }
            if (S9K.A01(num)) {
                i++;
            }
        }
        return i;
    }
}
