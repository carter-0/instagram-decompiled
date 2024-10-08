package X;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class T8A implements C13967TmU {
    public int A00;
    public Integer A01;
    public Bundle A02;
    public 0lg A03;
    public String A04;
    public final AtomicInteger A05 = new AtomicInteger(-1);
    public final AtomicInteger A06 = new AtomicInteger(-1);
    public final AtomicLong A07 = Pxe.A1D(-1);
    public final AtomicLong A08 = Pxe.A1D(-1);
    public final AtomicLong A09 = Pxe.A1D(-1);
    public final AtomicLong A0A = Pxe.A1D(-1);
    public final AtomicLong A0B = Pxe.A1D(-1);
    public final AtomicLong A0C = Pxe.A1D(-1);
    public final AtomicLong A0D = Pxe.A1D(-1);
    public final AtomicLong A0E = Pxe.A1D(-1);
    public final AtomicLong A0F = Pxe.A1D(-1);
    public final AtomicLong A0G = Pxe.A1D(-1);
    public final AtomicLong A0H = Pxe.A1D(-1);
    public final AtomicLong A0I = Pxe.A1D(-1);
    public final AtomicLong A0J = Pxe.A1D(-1);
    public final AtomicLong A0K = Pxe.A1D(-1);
    public final AtomicLong A0L = Pxe.A1D(-1);
    public final AtomicLong A0M = Pxe.A1D(-1);
    public final AtomicLong A0N = Pxe.A1D(-1);
    public final AtomicLong A0O = Pxe.A1D(-1);
    public final AtomicLong A0P = Pxe.A1D(-1);
    public final AtomicLong A0Q = Pxe.A1D(-1);
    public final AtomicLong A0R = Pxe.A1D(-1);
    public volatile String A0S;

    private void A00() {
        this.A01 = null;
        this.A00 = 0;
        this.A0R.set(-1);
        this.A0Q.set(-1);
        this.A0P.set(-1);
        this.A08.set(-1);
        this.A07.set(-1);
        this.A0K.set(-1);
        this.A0D.set(-1);
        this.A0L.set(-1);
        this.A0E.set(-1);
        this.A0C.set(-1);
        this.A0N.set(-1);
        this.A0M.set(-1);
        this.A0O.set(-1);
        this.A0J.set(-1);
        this.A0I.set(-1);
        this.A0A.set(-1);
        this.A09.set(-1);
        this.A0F.set(-1);
        this.A0G.set(-1);
        this.A0H.set(-1);
        this.A0B.set(-1);
        this.A05.set(-1);
        this.A06.set(-1);
    }

    public final synchronized void Cje() {
        long j;
        String str;
        synchronized (this) {
            Integer num = this.A01;
            if (num != null) {
                Integer num2 = AnonymousClass05K.A01;
                boolean equals = num.equals(num2);
                AtomicLong atomicLong = this.A0K;
                AtomicLong atomicLong2 = atomicLong;
                if (equals) {
                    if (atomicLong.get() > -1 && this.A0E.get() > -1) {
                        atomicLong = this.A0C;
                    }
                }
                if (atomicLong.get() > -1) {
                    String str2 = "";
                    String str3 = str2;
                    AtomicLong atomicLong3 = this.A08;
                    AtomicLong atomicLong4 = this.A07;
                    if (atomicLong3.get() == -1 || atomicLong4.get() == -1) {
                        j = 0;
                    } else {
                        j = atomicLong4.get() - atomicLong3.get();
                    }
                    if (this.A01 == num2) {
                        if (j == 0) {
                            str2 = "warm";
                        } else {
                            str2 = "cold";
                        }
                    }
                    "ig_react_native_view".getClass();
                    0xI A012 = 0xI.A01("ig_react_native_view", (String) null);
                    A012.A0C("view", this.A04);
                    if (1 - this.A01.intValue() != 0) {
                        str = "native";
                    } else {
                        str = "react_native";
                    }
                    A012.A0C("tag", str);
                    A012.A0C("config", str3);
                    A02(A012, "plugin_init_time", this.A0Q, this.A0P);
                    A012.A0B("bridge_init_time", Long.valueOf(j));
                    A012.A0C("bridge_init_state", str2);
                    AtomicLong atomicLong5 = this.A0R;
                    A02(A012, "time_to_js", atomicLong5, this.A0L);
                    A01(A012, "js_app_require_time", this.A0D);
                    A01(A012, "js_time", this.A0E);
                    A01(A012, "idle_time", this.A0C);
                    A02(A012, "tti_time", atomicLong5, atomicLong2);
                    AtomicLong atomicLong6 = this.A0N;
                    A02(A012, "time_to_unpacker_check", atomicLong5, atomicLong6);
                    A02(A012, "unpacker_check_time", atomicLong6, this.A0M);
                    A02(A012, "unpacking_time", atomicLong6, this.A0O);
                    A02(A012, "run_js_bundle_time", this.A0J, this.A0I);
                    A02(A012, "create_ui_manager_module_time", this.A0A, this.A09);
                    A01(A012, "jsc_block_size", this.A0F);
                    A01(A012, "jsc_malloc_size", this.A0G);
                    A01(A012, "jsc_object_size", this.A0H);
                    A01(A012, "fetch_relay_query", this.A0B);
                    AtomicInteger atomicInteger = this.A05;
                    if (atomicInteger.get() != -1) {
                        A012.A08(Integer.valueOf(atomicInteger.get()), "used_relay_modern");
                    }
                    AtomicInteger atomicInteger2 = this.A06;
                    if (atomicInteger2.get() != -1) {
                        A012.A08(Integer.valueOf(atomicInteger2.get()), "used_relay_prefetcher");
                    }
                    String str4 = this.A0S;
                    if (str4 != null) {
                        A012.A0C("tti_event_tag", str4);
                    }
                    if (this.A01 == num2) {
                        A012.A08(C51967G9n.A0k(), "ota");
                    }
                    if (0KC.A01.isLoggable(3)) {
                        0KC.A0D("AnalyticsEvent", A012.A03());
                    }
                    DbU.A1R(A012, this.A03);
                    int i = this.A00;
                    if (i != 0) {
                        02m r4 = 02m.A0p;
                        r4.markerAnnotate(i, "bridge_state", str2);
                        Bundle bundle = this.A02;
                        if (bundle != null && bundle.containsKey("prefetch_checkout_info")) {
                            r4.markerAnnotate(this.A00, "prefetch_checkout_info", bundle.getBoolean("prefetch_checkout_info"));
                        }
                        r4.markerEnd(this.A00, 2);
                    }
                    A00();
                }
            }
        }
    }

    public final synchronized void Dq8() {
        int i = this.A00;
        if (i != 0) {
            02m.A0p.markerEnd(i, 4);
            this.A00 = 0;
        }
    }

    public final synchronized void EwT(Integer num, Integer num2, String str) {
        synchronized (this) {
            EwU((Bundle) null, num, (Integer) null, str, 0);
        }
    }

    public final synchronized void EwU(Bundle bundle, Integer num, Integer num2, String str, int i) {
        A00();
        this.A01 = num;
        this.A04 = str;
        this.A00 = i;
        this.A02 = bundle;
        Pxh.A1S(this.A0R);
        int i2 = this.A00;
        if (i2 != 0) {
            02m.A0p.markerStart(i2);
        }
    }

    public static void A01(0xI r4, String str, AtomicLong atomicLong) {
        r4.A0B(str, Long.valueOf(Math.max(atomicLong.get(), 0)));
    }

    public T8A(0lg r4) {
        this.A03 = r4;
    }

    public static void A02(0xI r5, String str, AtomicLong atomicLong, AtomicLong atomicLong2) {
        long j;
        if (atomicLong.get() == -1 || atomicLong2.get() == -1) {
            j = 0;
        } else {
            j = atomicLong2.get() - atomicLong.get();
        }
        r5.A0B(str, Long.valueOf(j));
    }
}
