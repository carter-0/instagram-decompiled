package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WVw  reason: case insensitive filesystem */
public final class C19355WVw implements C20907X3y {
    public final int A00;
    public final Object A01;

    public C19355WVw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Day() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C15381Ube ube = (C15381Ube) this.A01;
                C18575VuR vuR = ube.A0I;
                String str = "feedRequestController";
                if (vuR != null) {
                    if (!C51973G9u.A1X(C18459Vs8.A00(vuR))) {
                        C18575VuR vuR2 = ube.A0I;
                        if (vuR2 != null) {
                            if (C18459Vs8.A00(vuR2).A03.A03 == AnonymousClass05K.A01) {
                                Context requireContext = ube.requireContext();
                                UserSession A0l = AnonymousClass7TE.A0l(ube.A0i);
                                0xI A002 = 0xI.A00(ube, AnonymousClass000.A00(4427));
                                AnonymousClass6WL.A03(requireContext, A002);
                                C18766W0k.A01(A002, A0l);
                                DbU.A1R(A002, A0l);
                            }
                            C18806W2y w2y = ube.A0c;
                            HAI hai = ube.A08;
                            if (hai == null) {
                                str = "dataSource";
                            } else {
                                String obj = hai.A00.toString();
                                0qQ.A0B(obj, 0);
                                C18806W2y.A03(w2y, obj, 20643842);
                                C15381Ube.A08(ube, ube.A0O, 20643842, true, true);
                                C15381Ube.A06(ube, -1);
                                C231002qi r0 = ube.A0L;
                                if (r0 == null) {
                                    str = "quickPromotionDelegate";
                                } else {
                                    r0.Dh3();
                                    C17586Vae vae = ube.A0J;
                                    if (vae == null) {
                                        str = "viewpointHelper";
                                    } else {
                                        vae.A03.A01.clear();
                                        vae.A04.A00.clear();
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 2:
                C15357Ub9 ub9 = (C15357Ub9) this.A01;
                ub9.A0E.A01(ub9.A08.A00, true, true);
                return;
            case 3:
                ((C52770GcN) this.A01).A0B();
                return;
            default:
                C15358UbA ubA = (C15358UbA) this.A01;
                if (!ubA.A0L.isLoading()) {
                    C15358UbA.A04(ubA, true);
                    return;
                }
                return;
        }
    }
}
