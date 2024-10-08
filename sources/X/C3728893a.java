package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.93a  reason: invalid class name and case insensitive filesystem */
public final class C3728893a implements AnonymousClass2vG, C61110lV, AnonymousClass0lh {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LH(this, 8));

    public C3728893a(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A03(C267324bN r13, String str, int i, boolean z) {
        String str2;
        0qQ.A0B(str, 0);
        if (!this.A00) {
            0XK r7 = new 0XK();
            r7.A00("analytics_module", str, 1);
            r7.A00("client_position", String.valueOf(i), 2);
            r7.A00("delivery_flags", AnonymousClass9OK.A00(r13.A03), 1);
            r7.A00("clips_item_type", r13.A01.toString(), 1);
            1Xj r0 = r13.A02;
            if (r0 != null) {
                str2 = r0.getId();
            } else {
                str2 = null;
            }
            r7.A00("media_id", String.valueOf(str2), 1);
            r7.A00("is_sub_imp", String.valueOf(z), 8);
            A00(this).markerPoint(976032351, 0, 7, "organic_impressed", r7, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final void A04(C267324bN r13, String str, String str2, int i, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        if (!this.A00) {
            0XK r7 = new 0XK();
            r7.A00("analytics_module", str, 1);
            r7.A00("client_position", String.valueOf(i), 2);
            r7.A00("global_position", String.valueOf(AnonymousClass93Z.A00(r13)), 2);
            r7.A00("delivery_flags", AnonymousClass9OK.A00(r13.A03), 1);
            r7.A00("clips_item_type", r13.A01.toString(), 1);
            r7.A00("ad_id", r13.getId(), 1);
            r7.A00("is_sub_imp", String.valueOf(z), 8);
            r7.A00("is_sync", String.valueOf(z2), 8);
            r7.A00("delivery_context", str2, 1);
            A00(this).markerPoint(976032351, 0, 7, "ad_impressed", r7, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final void Cgs(String str, String str2, String str3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cgx(Iterable iterable, String str, String str2) {
    }

    public final void Cgy(1Xj r2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        0qQ.A0B(list, 0);
        0qQ.A0B(list2, 1);
        0qQ.A0B(list3, 2);
        0qQ.A0B(str, 3);
        0qQ.A0B(str2, 5);
        0qQ.A0B(str3, 7);
        0qQ.A0B(hashMap, 8);
    }

    public final void Cgz(int i, boolean z, long j) {
    }

    public final void Ch0(String str, int i, long j, boolean z) {
    }

    public final void Ch1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
    }

    public final void Ch2(AnonymousClass4LN r21, List list, int i, long j, boolean z) {
        String str;
        int i2;
        List<C376489Ie> list2 = list;
        0qQ.A0B(list2, 0);
        AnonymousClass4LN r6 = r21;
        0qQ.A0B(r6, 4);
        if (!this.A00) {
            0XK r15 = new 0XK();
            r15.A00("is_sync", String.valueOf(r6.A0B), 8);
            r15.A00("analytics_module", r6.A03, 1);
            Integer num = r6.A00;
            String str2 = null;
            if (num != null) {
                str = AnonymousClass93b.A01(num);
            } else {
                str = null;
            }
            r15.A00("delivery_context", str, 1);
            r15.A00("ad_count", String.valueOf(list2.size()), 2);
            r15.A00("existing_post_count", String.valueOf(r6.A01), 2);
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C376489Ie r0 : list2) {
                C267324bN r02 = (C267324bN) r0.A03;
                0qQ.A0B(r02, 0);
                arrayList.add(r02.getId());
            }
            r15.A00("ad_ids", arrayList.toString(), 4);
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
            for (C376489Ie r03 : list2) {
                C233472vm r04 = (C233472vm) r03.A04;
                if (r04 != null) {
                    i2 = r04.A09();
                } else {
                    i2 = -1;
                }
                arrayList2.add(Integer.valueOf(i2));
            }
            r15.A00("ad_target_positions", arrayList2.toString(), 4);
            r15.A00("target_position_offset", String.valueOf(r6.A02), 2);
            r15.A00("organic_ids", r6.A08.toString(), 4);
            String str3 = r6.A07;
            if (str3 != null) {
                str2 = str3;
            }
            r15.A00("response_module", str2, 1);
            r15.A00("is_cached_response", String.valueOf(r6.A09), 8);
            A00(this).markerPoint(976032351, 0, 7, "received_ad", r15, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final void Ch3(AnonymousClass4LN r14, Iterable iterable) {
        String str;
        0qQ.A0B(r14, 0);
        if (!this.A00) {
            0XK r8 = new 0XK();
            String str2 = r14.A06;
            String str3 = null;
            if (str2 != null) {
                str = new 11S("[{}\"\\s]").A00(str2, "");
            } else {
                str = null;
            }
            r8.A00("page_token", str, 1);
            r8.A00("is_sync", String.valueOf(r14.A0B), 8);
            r8.A00("analytics_module", r14.A03, 1);
            Integer num = r14.A00;
            if (num != null) {
                str3 = AnonymousClass93b.A01(num);
            }
            r8.A00("delivery_context", str3, 1);
            r8.A00("existing_post_count", String.valueOf(r14.A01), 2);
            r8.A00("organic_ids", r14.A08.toString(), 4);
            r8.A00("use_network_cache", String.valueOf(r14.A0A), 8);
            r8.A00("cache_key_used", r14.A04, 1);
            r8.A00("cache_policy", r14.A05, 1);
            A00(this).markerPoint(976032351, 0, 7, "ad_request_start", r8, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final void Cj5(C251373n0 r1) {
    }

    public final void Cj9(String str, String str2) {
    }

    public final void CjA(C251373n0 r1, Iterable iterable) {
    }

    public final void Cjk(AnonymousClass9I2 r1, String str, long j, long j2, long j3) {
    }

    public final void Ckm(AnonymousClass3VZ r12) {
        0qQ.A0B(r12, 0);
        if (!this.A00) {
            0XK r6 = new 0XK();
            r6.A00("poolz_size", String.valueOf(r12.A00), 2);
            A00(this).markerPoint(976032351, 0, 7, "on_surface_destroyed", r6, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final /* synthetic */ void Dpj(AnonymousClass3VZ r1) {
    }

    public final void ERc(String str) {
    }

    public final void EVW(int i) {
    }

    public static final 02m A00(C3728893a r0) {
        Object value = r0.A03.getValue();
        0qQ.A07(value);
        return (02m) value;
    }

    private final void A01(C376489Ie r14, Integer num, String str, String str2) {
        int i;
        String str3;
        if (!this.A00) {
            0XK r8 = new 0XK();
            r8.A00("analytics_module", str, 1);
            C233472vm r0 = (C233472vm) r14.A04;
            if (r0 != null) {
                i = r0.A09();
            } else {
                i = -1;
            }
            r8.A00("client_position", String.valueOf(i), 2);
            C267324bN r4 = (C267324bN) r14.A03;
            r8.A00("global_position", String.valueOf(AnonymousClass93Z.A00(r4)), 2);
            r8.A00(TraceFieldType.FailureReason, str2, 1);
            String str4 = null;
            if (num != null) {
                str3 = num.toString();
            } else {
                str3 = null;
            }
            r8.A00("max_seen_index", str3, 2);
            0qQ.A0B(r4, 0);
            r8.A00("ad_id", r4.getId(), 1);
            Integer num2 = (Integer) r14.A00;
            if (num2 != null) {
                str4 = AnonymousClass93b.A01(num2);
            }
            r8.A00("delivery_context", str4, 1);
            r8.A00("is_sync", String.valueOf(r14.A01), 8);
            A00(this).markerPoint(976032351, 0, 7, "ad_insertion_fail", r8, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public static final void A02(C3728893a r6) {
        if (!r6.A01 && !r6.A00) {
            A00(r6).markerStart(976032351, 0, System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            r6.A01 = true;
            14i.A03(15Y.A03, r6);
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj, boolean z) {
        String str;
        C267324bN r11 = (C267324bN) obj;
        if (!this.A00) {
            A02(this);
            0XK r5 = new 0XK();
            r5.A00("cache_seen_state", String.valueOf(z), 8);
            if (r11 != null) {
                str = r11.getId();
            } else {
                str = null;
            }
            r5.A00("item_id", String.valueOf(str), 1);
            A00(this).markerPoint(976032351, 0, 7, "mark_cache_as_seen", r5, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final /* bridge */ /* synthetic */ void Cgu(C251373n0 r5, Object obj) {
        1PW r6 = (1PW) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        String str = r6.A0E;
        String str2 = r6.A0F;
        A01((C376489Ie) r5.BTb(), Integer.valueOf(r6.A02), str, str2);
    }

    public final /* bridge */ /* synthetic */ void Cgv(C251373n0 r15, Object obj) {
        int i;
        String str;
        1PW r1 = (1PW) obj;
        0qQ.A0B(r15, 0);
        0qQ.A0B(r1, 1);
        if (!this.A00) {
            0XK r9 = new 0XK();
            r9.A00("analytics_module", r1.A0E, 1);
            C376489Ie r5 = (C376489Ie) r15.BTb();
            C233472vm r0 = (C233472vm) r5.A04;
            if (r0 != null) {
                i = r0.A09();
            } else {
                i = -1;
            }
            r9.A00("client_position", String.valueOf(i), 2);
            C267324bN r2 = (C267324bN) r5.A03;
            r9.A00("global_position", String.valueOf(AnonymousClass93Z.A00(r2)), 2);
            0qQ.A0B(r2, 0);
            r9.A00("ad_id", r2.getId(), 1);
            Integer num = (Integer) r5.A00;
            if (num != null) {
                str = AnonymousClass93b.A01(num);
            } else {
                str = null;
            }
            r9.A00("delivery_context", str, 1);
            r9.A00("is_sync", String.valueOf(r5.A01), 8);
            A00(this).markerPoint(976032351, 0, 7, "ad_insertion_success", r9, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }

    public final /* bridge */ /* synthetic */ void Cgw(1PW r3, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        C376489Ie r5 = (C376489Ie) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(str, 2);
        0qQ.A0B(r3, 11);
        A01(r5, Integer.valueOf(r3.A02), r3.A0E, str);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1915858380);
        if (!this.A00) {
            A00(this).markerEnd(976032351, 0, 2);
            this.A00 = true;
            14i.A06(this);
        }
        AnonymousClass0fD.A0A(1607902724, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(58549009, AnonymousClass0fD.A03(-1498508335));
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
        this.A01 = false;
        this.A00 = false;
    }

    public final /* bridge */ /* synthetic */ void CjQ(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void Cgt(Integer num, Object obj) {
    }

    public final /* bridge */ /* synthetic */ void CjR(C251373n0 r1, Object obj) {
    }

    public final /* bridge */ /* synthetic */ void CjS(C251373n0 r1, Object obj) {
    }

    public final /* bridge */ /* synthetic */ void Chf(C251373n0 r1, Object obj, String str) {
    }

    public final /* bridge */ /* synthetic */ void CjT(Object obj, String str, Collection collection) {
    }

    public final /* bridge */ /* synthetic */ void Cjj(Integer num, Object obj, String str, List list) {
    }
}
