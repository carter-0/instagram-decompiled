package X;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.WEz  reason: case insensitive filesystem */
public final class C18972WEz implements C51946G8p {
    public static final C18523VtN A0A = new Object();
    public final SparseArray A00;
    public final C13690Tf8 A01;
    public final C3034368u A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;
    public final Map A09;

    public final void A00(Bundle bundle, boolean z) {
        boolean z2;
        bundle.putString(AnonymousClass000.A00(1063), "screen_query");
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("key_from_config_change", z);
        bundle2.putString("key_app_id", this.A05);
        bundle2.putInt("key_content_parse_result", C14615TzM.A00(this.A02));
        bundle2.putInt("key_tree_params", C14615TzM.A00(this.A09));
        bundle2.putInt("key_analytics_extras", C14615TzM.A00(this.A08));
        bundle2.putString("key_analytics_module", this.A04);
        Boolean bool = this.A03;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        bundle2.putBoolean("key_animate_on_navigation", z2);
        bundle2.putInt("key_container_config", C14615TzM.A00(this.A01));
        bundle.putBundle("key_screen_container_props_bundle", bundle2);
    }

    public final String Ac5() {
        return this.A05;
    }

    public final String BVX() {
        return "screen_query";
    }

    public C18972WEz(C13690Tf8 tf8, C3034368u r6, Boolean bool, String str, List list, Map map, Map map2, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap;
        this.A02 = r6;
        this.A08 = map2;
        this.A03 = bool;
        this.A01 = tf8;
        this.A07 = list;
        String A002 = Pxd.A00(616);
        map.get(A002);
        if (!z || z2) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("__infra__ttrc_instance_id", String.valueOf(new SecureRandom().nextInt()));
            linkedHashMap.put("__infra__ttrc_timestamp", Long.valueOf(AwakeTimeSinceBootClock.INSTANCE.now()));
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        this.A09 = linkedHashMap;
        Object obj = linkedHashMap.get(A002);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        this.A05 = str2;
        this.A04 = str == null ? str2 : str;
        Object obj2 = linkedHashMap.get(Pxd.A00(619));
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A06 = (String) obj2;
        0qQ.A0C(linkedHashMap.get(Pxd.A00(620)), "null cannot be cast to non-null type kotlin.Int");
        0qQ.A0C(linkedHashMap.get(Pxd.A00(617)), AnonymousClass000.A00(17));
        this.A00 = (SparseArray) linkedHashMap.get("__key_additional_object_set");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18972WEz(X.C13690Tf8 r11, X.C3034368u r12, java.lang.Boolean r13, java.lang.String r14, java.util.Map r15, java.util.Map r16) {
        /*
            r10 = this;
            r2 = r12
            r6 = r15
            X.AnonymousClass7TG.A1O(r12, r15)
            X.0sn r5 = X.0sn.A00
            r8 = 0
            r0 = r10
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r16
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18972WEz.<init>(X.Tf8, X.68u, java.lang.Boolean, java.lang.String, java.util.Map, java.util.Map):void");
    }
}
