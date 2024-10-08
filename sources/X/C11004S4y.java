package X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.S4y  reason: case insensitive filesystem */
public final class C11004S4y {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C2596542n A01;
    public final AnonymousClass45J A02;
    public final SHM A03;
    public final SJJ A04;
    public final String A05;
    public final RealtimeSinceBootClock A06;
    public final C9566Rd6 A07;

    public final void A00(Integer num, String str) {
        String str2;
        if (num.intValue() != 0) {
            str2 = "UNEXPECTED_TOPIC";
        } else {
            str2 = "JSON_PARSE_ERROR";
        }
        HashMap A012 = S9J.A01("event_type", str2);
        if (!TextUtils.isEmpty(str)) {
            A012.put("event_extra_info", str);
        }
        SRO sro = new SRO("fbns_service_event", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        sro.A03(A012);
        this.A01.reportEvent(sro);
    }

    /* JADX WARNING: type inference failed for: r14v4, types: [X.SRO, java.lang.Object, X.Qbh] */
    public final void A01(String str, String str2, String str3, Map map, long j, long j2, boolean z, boolean z2) {
        Map map2 = map;
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0D;
        AnonymousClass45J r2 = this.A02;
        AnonymousClass3RY[] r0 = AnonymousClass3RY.A02;
        boolean z3 = ((AnonymousClass45I) r2).getBoolean("is_employee", false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.A00;
        long j4 = elapsedRealtime - j;
        AtomicLong atomicLong = this.A04.A06;
        long j5 = elapsedRealtime - atomicLong.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        if (map == null) {
            map2 = AnonymousClass7TE.A1E();
        }
        map2.put("prev_running", String.valueOf(z));
        map2.put("nsid", Long.toString(atomicLong.get()));
        ? sro = new SRO("fbns_push_service_lifecycle", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        sro.A07 = str;
        sro.A06 = str2;
        sro.A05 = str3;
        sro.A00 = elapsedRealtime;
        sro.A04 = j3;
        sro.A01 = j4;
        sro.A02 = j5;
        sro.A03 = j6;
        sro.A09 = z2;
        sro.A08 = z3;
        sro.A03(map2);
        sro.toString();
        this.A01.reportEvent(sro);
    }

    public C11004S4y(Context context, C2596542n r4, AnonymousClass45J r5, RealtimeSinceBootClock realtimeSinceBootClock, SHM shm, SJJ sjj, C9566Rd6 rd6) {
        this.A05 = context.getPackageName();
        this.A04 = sjj;
        this.A06 = realtimeSinceBootClock;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = shm;
        this.A07 = rd6;
    }
}
