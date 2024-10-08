package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.3fe  reason: invalid class name and case insensitive filesystem */
public abstract class C247023fe {
    public static final void A00(UserSession userSession, 1Xj r12, AnonymousClass3W1 r13) {
        1OC r1;
        1P0 r0;
        String A2n;
        Integer CDI;
        synchronized (r13) {
            if (!r13.A2W) {
                C45454Cwl cwl = new C45454Cwl(userSession, new C18487Vsi(userSession, r12, r13), r12, r13);
                if (r12.CcK()) {
                    String C9L = r12.C9L();
                    String A2n2 = r12.A2n();
                    int i = r13.A0X;
                    if (i == 0) {
                        C250513lZ injected = r12.A0C.getInjected();
                        if (injected == null || (CDI = injected.CDI()) == null) {
                            i = 0;
                        } else {
                            i = CDI.intValue();
                        }
                        r13.A0X = i;
                    }
                    if (!(C9L == null || A2n2 == null)) {
                        int A0o = r12.A0o();
                        Integer valueOf = Integer.valueOf(i);
                        int i2 = 0;
                        1NY r4 = new 1NY(userSession, -2);
                        r4.A08(AnonymousClass05K.A01);
                        r4.A0A("ads/async_get_ondemand_carousel_cards/");
                        r4.A0P(new 1NT(new 0bH(userSession), new 1NX((File) null), C45518Cxs.class, false));
                        r4.A9m("ad_client_token", C9L);
                        r4.A0C("start_index", A0o);
                        r4.A9m("media_id", A2n2);
                        if (valueOf != null) {
                            i2 = valueOf.intValue();
                        }
                        r4.A0C("validated_product_cursor", i2);
                        r1 = r4.A0M();
                        r0 = new CHD(cwl);
                    }
                } else {
                    0Tu r2 = 0Tu.A05;
                    if ((182.A06(r2, userSession, 36316650022375979L) || 182.A06(r2, userSession, 36316650022441516L)) && (A2n = r12.A2n()) != null) {
                        int A0o2 = r12.A0o();
                        1NY r22 = new 1NY(userSession, -2);
                        r22.A08(AnonymousClass05K.A0N);
                        r22.A0A("feed/async_get_carousel_children_for_parent/");
                        r22.A9m(AnonymousClass000.A00(345), A2n);
                        r22.A0C("start_index", A0o2);
                        r22.A0O((15p) null, C43789CDh.class, C45520Cxu.class, false);
                        r1 = r22.A0M();
                        r0 = new CHC(cwl);
                    }
                }
                r1.A00 = r0;
                1ES.A03(r1);
            }
        }
    }

    public static final boolean A01(UserSession userSession, int i, int i2, boolean z, boolean z2) {
        0qQ.A0B(userSession, 4);
        if (!z || i >= i2) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        if (z2) {
            boolean A06 = 182.A06(r3, userSession, 36316650022113831L);
            0qQ.A0A(Boolean.valueOf(A06));
            return A06;
        } else if (182.A06(r3, userSession, 36316650022375979L) || 182.A06(r3, userSession, 36316650022441516L)) {
            return true;
        } else {
            return false;
        }
    }
}
