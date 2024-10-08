package X;

import android.os.Bundle;

public abstract class QDP extends 2YL implements AnonymousClass07Y {
    public Boolean A00;
    public boolean A01;
    public Bundle A02;
    public final AnonymousClass2gB A03 = Pxh.A0M();
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final AnonymousClass2Fj A06 = JTO.A0K();
    public final AnonymousClass2Fj A07 = JTO.A0K();
    public final AnonymousClass2Fj A08 = JTO.A0K();

    /* JADX WARNING: type inference failed for: r0v1, types: [X.RwX, X.QgY] */
    public static C8080QgY A00(C8078QgW qgW, C8092Qgk qgk) {
        qgW.A03 = false;
        qgk.A04 = new C8082Qga(qgW);
        qgk.A01 = 0;
        qgk.A00 = 1.0f;
        return new C10693RwX();
    }

    public final String A0B() {
        if ((this instanceof C8119QhB) || (this instanceof C8113Qh5)) {
            return "payout_details";
        }
        if (this instanceof C8111Qh3) {
            return "";
        }
        if (this instanceof C8117Qh9) {
            return "transactions";
        }
        if (this instanceof C8116Qh8) {
            String str = ((C8116Qh8) this).A03;
            if (str != null) {
                return str;
            }
            0qQ.A0F("_viewName");
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C8073QgR) {
            return "transactions";
        } else {
            if (this instanceof C8072QgQ) {
                return "settings";
            }
            if (this instanceof C8069QgN) {
                return "payouthub_payouts";
            }
            if (this instanceof C8071QgP) {
                return "overview";
            }
            if (this instanceof C8070QgO) {
                return "payouthub_earnings";
            }
            if ((this instanceof C8118QhA) || (this instanceof C8114Qh6)) {
                return "earning_details";
            }
            return "app_level_dialogue_update";
        }
    }

    public void A0C(Bundle bundle) {
        this.A02 = bundle;
        this.A01 = true;
    }

    public static void A01(QDP qdp, boolean z) {
        qdp.A00 = Boolean.valueOf(z);
    }
}
