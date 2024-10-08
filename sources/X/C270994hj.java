package X;

import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4hj  reason: invalid class name and case insensitive filesystem */
public final class C270994hj extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass3OV A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C270994hj(Context context, AnonymousClass3OV r5, AnonymousClass0iw r6, boolean z) {
        super(7, 5, false, false);
        this.A01 = r5;
        this.A00 = context;
        this.A02 = r6;
        this.A03 = z;
    }

    public final void run() {
        long j;
        long j2;
        Location location;
        String str;
        Double d;
        Double d2;
        Double d3;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        AnonymousClass3OV r8 = this.A01;
        Context context = this.A00;
        AnonymousClass0iw r15 = this.A02;
        boolean z = false;
        boolean z2 = this.A03;
        Random random = new Random();
        int i = r8.A0L;
        if (random.nextInt(i) == 0 && !14i.A08() && 1Wr.isLocationEnabled(context)) {
            UserSession userSession = r8.A0S;
            if (1Wr.isLocationPermitted(context, userSession, "PHOTOS_RENDER")) {
                Integer num = r8.A0B;
                Integer num2 = AnonymousClass05K.A0N;
                boolean z3 = false;
                if (num == num2) {
                    z3 = true;
                }
                boolean z4 = false;
                if (num == AnonymousClass05K.A0Y) {
                    z4 = true;
                }
                1Bh A002 = 1Bh.A00();
                double A012 = A002.A01();
                synchronized (A002) {
                    j = A002.A02;
                }
                synchronized (A002) {
                    j2 = A002.A03;
                }
                Pair A022 = C61970qY.A02(context);
                HashMap hashMap = new HashMap();
                AnonymousClass1D8.A00().A0f(hashMap);
                String A032 = C276174sn.A00(C60960kU.A00).A03();
                1Wr r1 = 1Wr.A00;
                if (r1 != null) {
                    location = r1.getLastLocation(userSession, "PhotosRenderedListener");
                } else {
                    location = null;
                }
                0wc A013 = AnonymousClass0kN.A01(r15, userSession);
                0Aj A003 = A013.A00(A013.A00, "fbc_ig_image_render");
                if (A003.isSampled()) {
                    if (z3 || z4) {
                        str = "SUCCESS";
                    } else {
                        str = "ABANDONED";
                    }
                    A003.AAJ("action", str);
                    A003.A9F("client_sample_rate", new Long((long) i));
                    if (location != null) {
                        d = Double.valueOf(location.getLatitude());
                    } else {
                        d = null;
                    }
                    A003.A8D("device_lat", d);
                    if (location != null) {
                        d2 = Double.valueOf(location.getLongitude());
                    } else {
                        d2 = null;
                    }
                    A003.A8D("device_long", d2);
                    if (A012 != -1.0d) {
                        d3 = Double.valueOf(A012);
                    } else {
                        d3 = null;
                    }
                    A003.A8D("estimated_bandwidth", d3);
                    if (A012 != -1.0d) {
                        l = Long.valueOf(j);
                    } else {
                        l = null;
                    }
                    A003.A9F("estimated_bandwidth_totalBytes_b", l);
                    if (A012 != -1.0d) {
                        l2 = Long.valueOf(j2);
                    } else {
                        l2 = null;
                    }
                    A003.A9F("estimated_bandwidth_totalTime_ms", l2);
                    if (A032 == null || A032.isEmpty()) {
                        A032 = null;
                    }
                    A003.AAJ("hardware_address", A032);
                    A003.A9F("image_attempted_height", new Long((long) r8.A01));
                    A003.A9F("image_attempted_width", new Long((long) r8.A02));
                    int i2 = r8.A03;
                    if (i2 > 0) {
                        l3 = new Long((long) i2);
                    } else {
                        l3 = null;
                    }
                    A003.A9F("image_size_kb", l3);
                    A003.A7p("is_ad", Boolean.valueOf(r8.A0Y));
                    A003.A7p("is_carousel", Boolean.valueOf(z2));
                    A003.A7p("is_grid_view", false);
                    A003.AAJ("load_source", r8.A0E);
                    A003.AAJ("network_params", (String) hashMap.get("network_params"));
                    A003.AAJ("network_subtype", (String) A022.second);
                    A003.AAJ(TraceFieldType.NetworkType, (String) A022.first);
                    A003.A9F("on_screen_duration", Long.valueOf(r8.A06));
                    if (r8.A0B == num2) {
                        z = true;
                    }
                    A003.A7p("rendered", Boolean.valueOf(z));
                    if (z3) {
                        l4 = Long.valueOf(r8.A07);
                    } else {
                        l4 = null;
                    }
                    A003.A9F("render_latency", l4);
                    AtomicInteger atomicInteger = r8.A0F;
                    if (atomicInteger != null) {
                        l5 = new Long((long) atomicInteger.get());
                    } else {
                        l5 = null;
                    }
                    A003.A9F("scan_number", l5);
                    A003.Cgf();
                }
            }
        }
    }
}
