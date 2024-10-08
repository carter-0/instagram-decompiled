package X;

import android.content.Context;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.ShW  reason: case insensitive filesystem */
public final class C11844ShW implements C13811The {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;

    public final void A02(Context context, C13690Tf8 tf8, C307506Qj r4) {
        0qQ.A0B(r4, 1);
        A00(context, tf8, r4, true);
    }

    public final void E0s(Context context, C13690Tf8 tf8, C307506Qj r4) {
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1O(r4, tf8);
        A00(context, tf8, r4, false);
    }

    private final void A00(Context context, C13690Tf8 tf8, C307506Qj r25, boolean z) {
        C13690Tf8 tf82 = tf8;
        int Bpr = tf82.Bpr();
        1KZ.A01("BloksScreenQuery.parallelFetch");
        String str = this.A02;
        Map map = this.A06;
        long j = this.A01;
        boolean z2 = this.A07;
        Integer valueOf = Integer.valueOf(Bpr);
        LinkedHashMap A042 = 0Yt.A04(map, AnonymousClass7TF.A0w("__infra__container_config_id", valueOf));
        C307506Qj r2 = r25;
        C307516Qk.A00(r2).A03(Q3K.PARALLEL_FETCH, (JPG) null, str, A042, JTP.A0y("__infra__container_config_id"), j, z2, true);
        1KZ.A00();
        1KZ.A01("BloksScreenQuery.loadPrebundledRoot");
        Context context2 = context;
        C3034368u A002 = C11117SAw.A00(context2, tf82.BeT());
        1KZ.A00();
        C18972WEz wEz = new C18972WEz(tf82, A002, (Boolean) null, this.A03, 0Yt.A04(0Yt.A04(this.A05, A01()), AnonymousClass7TF.A0w("__infra__container_config_id", valueOf)), (Map) null);
        1KZ.A01("BloksScreenQuery.openScreen");
        C250563lf.A0O(context2, wEz, r2, Bpr, z);
        1KZ.A00();
    }

    public final Map A01() {
        0Ym r2 = new 0Ym();
        r2.put("__infra__app_id", this.A02);
        String str = this.A04;
        if (str == null) {
            str = String.valueOf(new SecureRandom().nextInt());
        }
        r2.put("__infra__screen_id", str);
        r2.put("__infra__cache_ttl", Long.valueOf(this.A01));
        r2.put("__infra__enable_disk_cache", Boolean.valueOf(this.A07));
        r2.put("__infra__preloaded_params", this.A06);
        r2.put("__infra__ttrc_marker_id", Integer.valueOf(this.A00));
        return 0se.A0N(r2);
    }

    public final String Bpq() {
        return this.A04;
    }

    public C11844ShW(String str, String str2, String str3, Map map, Map map2, int i, long j, boolean z) {
        AnonymousClass7TG.A1Q(map, map2);
        this.A02 = str;
        this.A05 = map;
        this.A06 = map2;
        this.A01 = j;
        this.A07 = z;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = str3;
    }

    public final Set AjL(C13690Tf8 tf8, C307506Qj r13) {
        AnonymousClass7TG.A1N(tf8, r13);
        String str = this.A02;
        int Bpr = tf8.Bpr();
        long j = this.A01;
        AnonymousClass6RB A002 = C307516Qk.A00(r13);
        Map A0w = AnonymousClass7TF.A0w("__infra__container_config_id", Integer.valueOf(Bpr));
        REH reh = REH.MEMORY;
        boolean A052 = A002.A05(str, A0w, JTP.A0y(reh), j);
        REH reh2 = REH.DISK;
        boolean A053 = A002.A05(str, A0w, JTP.A0y(reh2), j);
        LinkedHashSet A0y = DbS.A0y();
        if (A052) {
            A0y.add(reh);
        }
        if (A053) {
            A0y.add(reh2);
        }
        return A0y;
    }

    public final void CNo(C13690Tf8 tf8, C307506Qj r6) {
        AnonymousClass7TG.A1N(tf8, r6);
        C307516Qk.A00(r6).A04(this.A02, AnonymousClass7TF.A0w("__infra__container_config_id", Integer.valueOf(tf8.Bpr())), REH.A00);
    }

    public final void E3a(C13690Tf8 tf8, C307506Qj r12, JPG jpg, boolean z) {
        DbY.A1S(tf8, r12);
        String str = this.A02;
        int Bpr = tf8.Bpr();
        Map map = this.A06;
        long j = this.A01;
        boolean z2 = this.A07;
        LinkedHashMap A042 = 0Yt.A04(map, AnonymousClass7TF.A0w("__infra__container_config_id", Integer.valueOf(Bpr)));
        C307516Qk.A00(r12).A03(Q3K.PREFETCH, jpg, str, A042, JTP.A0y("__infra__container_config_id"), j, z2, z);
    }
}
