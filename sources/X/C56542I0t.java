package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.I0t  reason: case insensitive filesystem */
public final class C56542I0t {
    public static final C56542I0t A00 = new Object();

    public final void A00(AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, double d, int i, int i2, boolean z) {
        long j;
        Long l;
        Long A0n;
        0qQ.A0B(str, 2);
        String A0u = C51965G9l.A0u(str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_threads_in_reels_unit_post_vpvd_imp");
        if (A0e.isSampled()) {
            0qQ.A0B(A0u, 0);
            Long A0n2 = 00y.A0n(10, A0u);
            if (A0n2 != null) {
                C51969G9p.A1A(A0e, r6);
                C51965G9l.A1E(A0e, A0n2);
                C51969G9p.A17(A0e, i);
                C51969G9p.A16(A0e, i2);
                C51965G9l.A1K(A0e, DbY.A0a());
                if (str2 == null || (A0n = 00y.A0n(10, str2)) == null) {
                    j = 0;
                } else {
                    j = A0n.longValue();
                }
                A0e.A9F("netego_id", Long.valueOf(j));
                C51970G9q.A16(A0e, d);
                A0e.A7p("is_sub_impression", Boolean.valueOf(z));
                if (str3 != null) {
                    l = 00y.A0n(10, str3);
                } else {
                    l = null;
                }
                A0e.A9F("quick_promotion_id", l);
                A0e.Cgf();
            }
        }
    }

    public final void A01(AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, String str4, double d, int i, int i2) {
        long j;
        Long l;
        Long A0n;
        AnonymousClass7TG.A1T(userSession, r6, str);
        String A0u = C51965G9l.A0u(str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_threads_in_reels_unit_gesture");
        if (A0e.isSampled()) {
            0qQ.A0B(A0u, 0);
            Long A0n2 = 00y.A0n(10, A0u);
            if (A0n2 != null) {
                C51969G9p.A1A(A0e, r6);
                C51965G9l.A1E(A0e, A0n2);
                C51969G9p.A17(A0e, i);
                C51969G9p.A16(A0e, i2);
                C51965G9l.A1K(A0e, DbY.A0a());
                A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                A0e.A8D(TraceFieldType.Duration, Double.valueOf(d));
                if (str3 == null || (A0n = 00y.A0n(10, str3)) == null) {
                    j = 0;
                } else {
                    j = A0n.longValue();
                }
                A0e.A9F("netego_id", Long.valueOf(j));
                if (str4 != null) {
                    l = 00y.A0n(10, str4);
                } else {
                    l = null;
                }
                A0e.A9F("quick_promotion_id", l);
                A0e.Cgf();
            }
        }
    }
}
