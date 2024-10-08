package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GXx  reason: case insensitive filesystem */
public final class C52572GXx implements C299435v9 {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final boolean A02;
    public final UserSession A03;

    public C52572GXx(AnonymousClass0iw r2, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = r2;
        this.A02 = z;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static String A02(0Ak r3, C52572GXx gXx, String str) {
        r3.A0R("container_module", gXx.A00.getModuleName());
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        return A06;
    }

    public final C60340gF CjP(String str, String str2, String str3) {
        return null;
    }

    public final C60340gF Cl6(String str, String str2, String str3, String str4, int i, int i2) {
        return A08(str, str2, str3, str4, (String) null, i, i2);
    }

    public final /* bridge */ /* synthetic */ C60340gF Cl7(String str, String str2, String str3, String str4, String str5, double d, int i, int i2, boolean z) {
        0qQ.A0B(str, 0);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_vpvd_impression"), 270);
        Long l = null;
        if (DbT.A1Y(A0U)) {
            A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
            A0U.A0Q("quick_promotion_id", C51970G9q.A0i(str3));
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            }
            A0U.A0Q("netego_id", l);
            A0U.A0P("sum_duration_ms", Double.valueOf(d));
            A0U.A0O("is_sub_impression", Boolean.valueOf(z));
            A05(A0U, str5, this.A02);
        }
        return C60340gF.A00;
    }

    public final C60340gF EGh(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        0qQ.A0B(str, 0);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_like_tap"), 259);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0R("search_query_text", str5);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGi(String str, String str2, String str3, String str4, int i, int i2) {
        0qQ.A0B(str, 0);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_not_interested"), 262);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGj(String str, String str2, String str3, String str4, int i, int i2) {
        0qQ.A0B(str, 0);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_undo_not_interested"), 269);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGl(String str, String str2, String str3, String str4, int i, int i2) {
        0qQ.A0B(str, 0);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_report"), 265);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.Cgf();
        return C60340gF.A00;
    }

    public static Long A00(0Ak r3, Long l, String str) {
        r3.A0Q("quick_promotion_id", l);
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static void A03(0Ak r2, C52572GXx gXx) {
        r2.A0R("container_module", gXx.A00.getModuleName());
    }

    public static void A04(0Ak r2, C52572GXx gXx, Long l) {
        r2.A0Q("netego_id", l);
        r2.A0O("is_barcelona_installed", Boolean.valueOf(gXx.A02));
    }

    public static void A06(1Ln r1, Integer num, String str, String str2, int i) {
        r1.A0R("nav_chain", str);
        r1.A0g(Integer.valueOf(i));
        r1.A0f(num);
        r1.A0R("tifu_type", str2);
    }

    public static void A07(1Ln r1, String str, String str2, int i, int i2) {
        r1.A0R("nav_chain", str);
        r1.A0g(Integer.valueOf(i));
        r1.A0f(Integer.valueOf(i2));
        r1.A0R("tifu_type", str2);
    }

    public final C60340gF A08(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_non_ufi_tap"), 261);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A03(A0U, this);
        String A0u = C51965G9l.A0u(str);
        0qQ.A0B(A0u, 0);
        A07(A0U, A01(A0U, DbZ.A07(A0u)), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0R("search_query_text", str5);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF CjL(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_media_tap"), 260);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A0U.A0Q("netego_id", A00(A0U, C51970G9q.A0i(str3), str2));
        A05(A0U, str5, z);
        return C60340gF.A00;
    }

    public final C60340gF Cjb(Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        long j;
        Long A0n;
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_open_app_tap"), 263);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A03(A0U, this);
        if (str == null || (A0n = C51971G9r.A0n(0, C51965G9l.A0u(str))) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        A06(A0U, num, A01(A0U, j), str4, i);
        A0U.A0Q("quick_promotion_id", C51972G9s.A0j(str3));
        A0U.A0Q("netego_id", C51972G9s.A0j(str2));
        A05(A0U, str5, z);
        return C60340gF.A00;
    }

    public final C60340gF Cl3(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        long j;
        Long A0n;
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_dismiss"), 257);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A03(A0U, this);
        if (str == null || (A0n = C51971G9r.A0n(0, C51965G9l.A0u(str))) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        A06(A0U, num, A01(A0U, j), str5, i);
        A0U.A0Q("quick_promotion_id", C51972G9s.A0j(str4));
        A04(A0U, this, C51972G9s.A0j(str2));
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF Cl4(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        long j;
        Long A0n;
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_undo_dismiss"), 268);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A03(A0U, this);
        if (str == null || (A0n = C51971G9r.A0n(0, C51965G9l.A0u(str))) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        A06(A0U, num, A01(A0U, j), str5, i);
        A0U.A0Q("quick_promotion_id", C51972G9s.A0j(str4));
        A04(A0U, this, C51972G9s.A0j(str2));
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF Cl5(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_container_impression"), 256);
        Long l = null;
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A03(A0U, this);
        A0U.A0R("nav_chain", DbY.A0a());
        A0U.A0g(Integer.valueOf(i));
        A0U.A0R("tifu_type", str5);
        A0U.A0Q("quick_promotion_id", C51972G9s.A0j(str3));
        A0U.A0Q("netego_id", C51972G9s.A0j(str2));
        A0U.A0P("sum_duration_ms", (Double) null);
        A0U.A0O("is_sub_impression", (Boolean) null);
        A0U.A0O("is_barcelona_installed", Boolean.valueOf(this.A02));
        if (num2 != null) {
            l = C51969G9p.A0r(num2);
        }
        A0U.A0Q("global_position", l);
        A0U.A0R("search_query_text", str6);
        A0U.A0R("search_session_id", str7);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGg(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, boolean z) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_1px_impression"), 255);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A0U.A0R("nav_chain", A01(A0U, DbZ.A07(A02(A0U, this, str))));
        A0U.A0g(num2);
        A0U.A0f(num);
        A0U.A0R("tifu_type", str4);
        A0U.A0Q("netego_id", A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0O("is_sub_impression", Boolean.valueOf(z));
        A05(A0U, str5, this.A02);
        return C60340gF.A00;
    }

    public final C60340gF EGk(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_reply_tap"), 264);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0R("search_query_text", str5);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGm(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_repost_tap"), 266);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0R("search_query_text", str5);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGn(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_reshare_tap"), 267);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0R("search_query_text", str5);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGo(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(this.A01, "ig_threads_unit_expand_post_tap"), 258);
        if (!DbT.A1Y(A0U)) {
            return null;
        }
        A07(A0U, A01(A0U, DbZ.A07(A02(A0U, this, str))), str4, i2, i);
        A04(A0U, this, A00(A0U, C51970G9q.A0i(str3), str2));
        A0U.A0R("search_query_text", str5);
        A0U.Cgf();
        return C60340gF.A00;
    }

    public static String A01(0Ak r2, long j) {
        r2.A0Q("media_id", Long.valueOf(j));
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void A05(0Ak r2, String str, boolean z) {
        r2.A0O("is_barcelona_installed", Boolean.valueOf(z));
        r2.A0R("search_query_text", str);
        r2.Cgf();
    }
}
