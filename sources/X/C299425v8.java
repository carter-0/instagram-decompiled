package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.5v8  reason: invalid class name and case insensitive filesystem */
public final class C299425v8 implements C299435v9 {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;

    public final C60340gF Cl6(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_tap"), 247);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.A0R("interaction_source", "main_card_tap");
        r3.Cgf();
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ C60340gF Cl7(String str, String str2, String str3, String str4, String str5, double d, int i, int i2, boolean z) {
        long j;
        Long l;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_vpvd_imp"), 254);
        Long l2 = null;
        if (r3.A00.isSampled()) {
            r3.A0R("container_module", this.A00.getModuleName());
            1Xv r0 = 1Xj.A0h;
            String A06 = 1Xv.A06(str);
            0qQ.A0B(A06, 0);
            Long A0n = 00y.A0n(10, A06);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                j = 0;
            }
            r3.A0Q("media_id", Long.valueOf(j));
            String A04 = 1Xv.A04(str);
            0qQ.A0B(A04, 0);
            r3.A0Q("media_author_id", 00y.A0n(10, A04));
            r3.A0g(Integer.valueOf(i2));
            r3.A0f(Integer.valueOf(i));
            r3.A0u(AnonymousClass1QI.A00.A02.A00);
            if (str3 != null) {
                l = 00y.A0n(10, str3);
            } else {
                l = null;
            }
            r3.A0Q("quick_promotion_id", l);
            if (str2 != null) {
                l2 = 00y.A0n(10, str2);
            }
            r3.A0Q("netego_id", l2);
            r3.A0P("sum_duration_ms", Double.valueOf(d));
            r3.A0O("is_sub_impression", Boolean.valueOf(z));
            r3.Cgf();
        }
        return C60340gF.A00;
    }

    public final C60340gF EGg(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, boolean z) {
        long j;
        0wc r2 = this.A01;
        1Ln r22 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_card_1px"), 241);
        if (!r22.A00.isSampled()) {
            return null;
        }
        r22.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r22.A0Q("media_id", Long.valueOf(j));
        r22.A0O("is_sub_impression", Boolean.valueOf(z));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r22.A0Q("media_author_id", 00y.A0n(10, A04));
        r22.A0g(num2);
        r22.A0f(num);
        r22.A0u(AnonymousClass1QI.A00.A02.A00);
        r22.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGh(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_ufi_like_tap"), 248);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGi(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_not_interested"), 245);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGj(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_undo_not_interested"), 253);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGk(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_ufi_reply_tap"), 249);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGl(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_report"), 246);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGm(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_ufi_repost_tap"), C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGn(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_ufi_reshare_tap"), 251);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF EGo(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        0wc r2 = this.A01;
        1Ln r3 = new 1Ln(r2.A00(r2.A00, "ig_threads_in_feed_unit_expand_post_tap"), 243);
        Long l2 = null;
        if (!r3.A00.isSampled()) {
            return null;
        }
        r3.A0R("container_module", this.A00.getModuleName());
        1Xv r0 = 1Xj.A0h;
        String A06 = 1Xv.A06(str);
        0qQ.A0B(A06, 0);
        Long A0n = 00y.A0n(10, A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        r3.A0Q("media_id", Long.valueOf(j));
        String A04 = 1Xv.A04(str);
        0qQ.A0B(A04, 0);
        r3.A0Q("media_author_id", 00y.A0n(10, A04));
        r3.A0g(Integer.valueOf(i2));
        r3.A0f(Integer.valueOf(i));
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        } else {
            l = null;
        }
        r3.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = 00y.A0n(10, str2);
        }
        r3.A0Q("netego_id", l2);
        r3.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF CjL(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        UserSession userSession = this.A02;
        C321406u6.A03(this.A00, userSession, Integer.valueOf(i), Integer.valueOf(i2), (Integer) null, "threads_in_feed_unit_card", userSession.A06, str, str3, str2, z);
        return C60340gF.A00;
    }

    public final C60340gF CjP(String str, String str2, String str3) {
        0wc r2 = this.A01;
        1Ln r22 = new 1Ln(r2.A00(r2.A00, "instagram_netego_click"), 296);
        Long l = null;
        if (!r22.A00.isSampled()) {
            return null;
        }
        r22.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "threads_in_feed_unit");
        AnonymousClass0iw r4 = this.A00;
        r22.A0R("container_module", r4.getModuleName());
        r22.A0R("source_of_action", r4.getModuleName());
        r22.A0Q("ig_userid", C263944Ny.A00(this.A02.A06).A00);
        r22.A0R("netego_id", str);
        r22.A0R("tracking_token", str2);
        if (str3 != null) {
            1Xv r0 = 1Xj.A0h;
            String A06 = 1Xv.A06(str3);
            0qQ.A0B(A06, 0);
            l = 00y.A0n(10, A06);
        }
        r22.A0Q("media_id", l);
        r22.A0u(AnonymousClass1QI.A00.A02.A00);
        r22.Cgf();
        return C60340gF.A00;
    }

    public final C60340gF Cjb(Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        UserSession userSession = this.A02;
        Integer num2 = num;
        C321406u6.A03(this.A00, userSession, num2, Integer.valueOf(i), (Integer) null, "threads_in_feed_unit_header", userSession.A06, str, str3, str2, z);
        return C60340gF.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C60340gF Cl3(java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            X.0wc r2 = r6.A01
            java.lang.String r1 = "ig_threads_in_feed_unit_dismiss"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 242(0xf2, float:3.39E-43)
            X.1Ln r3 = new X.1Ln
            r3.<init>(r1, r0)
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            r1 = 0
            if (r0 == 0) goto L_0x0092
            X.0iw r0 = r6.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            r3.A0R(r0, r2)
            if (r8 == 0) goto L_0x0099
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r2 = X.1Xv.A06(r8)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r2)
            if (r0 == 0) goto L_0x0099
            long r4 = r0.longValue()
        L_0x003d:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "media_id"
            r3.A0Q(r0, r2)
            java.lang.String r0 = "ranking_info_token"
            r3.A0R(r0, r10)
            if (r8 == 0) goto L_0x0097
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r2 = X.1Xv.A04(r8)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r2)
        L_0x005d:
            java.lang.String r0 = "media_author_id"
            r3.A0Q(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A0g(r0)
            r3.A0f(r7)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r3.A0u(r0)
            if (r11 == 0) goto L_0x0095
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r11)
        L_0x007d:
            java.lang.String r0 = "quick_promotion_id"
            r3.A0Q(r0, r2)
            if (r9 == 0) goto L_0x008a
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r9)
        L_0x008a:
            java.lang.String r0 = "netego_id"
            r3.A0Q(r0, r1)
            r3.Cgf()
        L_0x0092:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0095:
            r2 = r1
            goto L_0x007d
        L_0x0097:
            r2 = r1
            goto L_0x005d
        L_0x0099:
            r4 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299425v8.Cl3(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.0gF");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C60340gF Cl4(java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            X.0wc r2 = r6.A01
            java.lang.String r1 = "ig_threads_in_feed_unit_undo_dismiss"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 252(0xfc, float:3.53E-43)
            X.1Ln r3 = new X.1Ln
            r3.<init>(r1, r0)
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            r1 = 0
            if (r0 == 0) goto L_0x0085
            X.0iw r0 = r6.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            r3.A0R(r0, r2)
            if (r8 == 0) goto L_0x008a
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r2 = X.1Xv.A06(r8)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r2)
            if (r0 == 0) goto L_0x008a
            long r4 = r0.longValue()
        L_0x003d:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "media_id"
            r3.A0Q(r0, r2)
            java.lang.String r0 = "ranking_info_token"
            r3.A0R(r0, r10)
            if (r8 == 0) goto L_0x0088
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r2 = X.1Xv.A04(r8)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r2)
        L_0x005d:
            java.lang.String r0 = "media_author_id"
            r3.A0Q(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A0g(r0)
            r3.A0f(r7)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r3.A0u(r0)
            if (r11 == 0) goto L_0x007d
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r11)
        L_0x007d:
            java.lang.String r0 = "quick_promotion_id"
            r3.A0Q(r0, r1)
            r3.Cgf()
        L_0x0085:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0088:
            r2 = r1
            goto L_0x005d
        L_0x008a:
            r4 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299425v8.Cl4(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.0gF");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60340gF Cl5(java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r4 = this;
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ig_threads_in_feed_unit_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 244(0xf4, float:3.42E-43)
            X.1Ln r2 = new X.1Ln
            r2.<init>(r1, r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            r3 = 0
            if (r0 == 0) goto L_0x0099
            X.0iw r0 = r4.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            r2.A0R(r0, r1)
            if (r7 == 0) goto L_0x00a0
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r1 = X.1Xv.A06(r7)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x00a0
            long r0 = r0.longValue()
        L_0x003d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_id"
            r2.A0Q(r0, r1)
            if (r7 == 0) goto L_0x009e
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r1 = X.1Xv.A04(r7)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
        L_0x0058:
            java.lang.String r0 = "media_author_id"
            r2.A0Q(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A0g(r0)
            r2.A0f(r5)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r2.A0u(r0)
            if (r9 == 0) goto L_0x009c
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r9)
        L_0x0078:
            java.lang.String r0 = "quick_promotion_id"
            r2.A0Q(r0, r1)
            if (r8 == 0) goto L_0x009a
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r8)
        L_0x0085:
            java.lang.String r0 = "netego_id"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "sum_duration_ms"
            r2.A0P(r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r2.A0R(r0, r10)
            r2.Cgf()
            X.0gF r3 = X.C60340gF.A00
        L_0x0099:
            return r3
        L_0x009a:
            r1 = r3
            goto L_0x0085
        L_0x009c:
            r1 = r3
            goto L_0x0078
        L_0x009e:
            r1 = r3
            goto L_0x0058
        L_0x00a0:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299425v8.Cl5(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.0gF");
    }

    public C299425v8(AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }
}
