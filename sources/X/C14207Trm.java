package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Trm  reason: case insensitive filesystem */
public final class C14207Trm extends C14199Tre {
    public final boolean A00;
    public final boolean A01;

    public final void A07(List list, String str) {
        0qQ.A0B(list, 0);
        if (!this.A00) {
            for (Object next : list) {
                C66966Mfz mfz = new C66966Mfz();
                mfz.A09 = "client_side_matching";
                mfz.A06 = str;
                mfz.A05 = "server_results";
                A03(mfz, next);
            }
        }
    }

    public final void A08(List list, String str) {
        String str2;
        0qQ.A0B(list, 0);
        for (Object next : list) {
            C66966Mfz mfz = new C66966Mfz();
            if (this.A01) {
                str2 = "server";
            } else {
                str2 = "query_cache";
            }
            mfz.A09 = str2;
            mfz.A06 = str;
            mfz.A05 = "server_results";
            A03(mfz, next);
        }
    }

    public final void A0A(List list, boolean z, String str, String str2) {
        String str3;
        0qQ.A0B(list, 0);
        if (!this.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C66942Mfb mfb = (C66942Mfb) it.next();
                if ((mfb instanceof C67387Mn4) && (z || !0qQ.A0K(((C67387Mn4) mfb).A01.A07, "meta_ai_suggestion"))) {
                    C67387Mn4 mn4 = (C67387Mn4) mfb;
                    if (0qQ.A0K(mn4.A01.A07, "meta_ai_suggestion")) {
                        mn4.A06(str2, true);
                    } else {
                        mn4.A06(str2, false);
                    }
                    C66966Mfz mfz = new C66966Mfz();
                    if (this.A01) {
                        str3 = "server";
                    } else {
                        str3 = "query_cache";
                    }
                    mfz.A09 = str3;
                    mfz.A06 = str;
                    mfz.A05 = "server_results";
                    A03(mfz, mfb);
                }
            }
        }
    }

    public final void A06(List list, String str) {
        if (!this.A00) {
            for (Object next : list) {
                C66966Mfz mfz = new C66966Mfz();
                mfz.A09 = "bootstrap";
                mfz.A06 = str;
                mfz.A05 = "server_results";
                A03(mfz, next);
            }
        }
    }

    public C14207Trm(boolean z, boolean z2, boolean z3) {
        super(z3);
        this.A00 = z;
        this.A01 = z2;
    }

    public final void A09(List list, String str) {
        for (Object next : list) {
            C66966Mfz mfz = new C66966Mfz();
            mfz.A09 = C66579MXk.A00(339);
            mfz.A06 = str;
            mfz.A05 = "server_results";
            A03(mfz, next);
        }
    }

    public C14207Trm() {
        this(false, false, false);
    }
}
