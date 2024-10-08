package X;

import com.instagram.common.session.UserSession;

public final class QAH extends 00I {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QAH(C270284gU r2, boolean z) {
        super(z);
        this.A00 = 0;
        this.A01 = r2;
    }

    public final void A01() {
        boolean z;
        switch (this.A00) {
            case 0:
                DbS.A1U(((C270284gU) this.A01).getValue());
                return;
            case 1:
                C7912Qci qci = (C7912Qci) this.A01;
                UserSession userSession = qci.A00;
                if (userSession != null) {
                    z = false;
                    Pxi.A1F(AnonymousClass1Nd.A00(userSession), C9757RgF.A00(qci.A03), "fbap", false);
                    UserSession userSession2 = qci.A00;
                    if (userSession2 != null) {
                        STD.A03(qci, userSession2, qci.A01, "av_fbap", "camera_permission_granting", qci.A02);
                        break;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            case 2:
                C7929Qd0 qd0 = (C7929Qd0) this.A01;
                UserSession userSession3 = qd0.A06;
                if (userSession3 != null) {
                    STD.A03(qd0, userSession3, qd0.A09, "av_fbap", "submit_video_selfie", qd0.A0D);
                    z = false;
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 3:
                A04(false);
                C65227LpX lpX = (C65227LpX) this.A01;
                lpX.A03.CkC();
                DbT.A1J(lpX.A01);
                return;
            default:
                C47442E2o e2o = (C47442E2o) this.A01;
                02m A002 = C47442E2o.A00(e2o);
                int i = e2o.A00;
                A002.markerPoint(i, "nux_cancel_click");
                C47442E2o.A00(e2o).markerEnd(i, 2);
                A04(false);
                e2o.requireActivity().getOnBackPressedDispatcher().A04();
                return;
        }
        A04(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QAH(Object obj, int i) {
        super(true);
        this.A00 = i;
        this.A01 = obj;
    }
}
