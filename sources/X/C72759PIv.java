package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.PIv  reason: case insensitive filesystem */
public final class C72759PIv implements C230902qW {
    public final int A00;
    public final Object A01;

    public C72759PIv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DR0(AnonymousClass4UE r9) {
        View CrT;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r9, 0);
                AnonymousClass4UC r92 = (AnonymousClass4UC) r9;
                AnonymousClass7VP r6 = (AnonymousClass7VP) this.A01;
                AnonymousClass7FA r5 = (AnonymousClass7FA) r6.A0C.invoke();
                2cX r7 = r6.A00;
                if (r5 != null && r7 != null) {
                    if ("condensed_megaphone".equals(r92.A09.A00)) {
                        C231942sf r2 = new C231942sf(r6.A03);
                        LayoutInflater A0E = DbV.A0E(r6.A01);
                        0qQ.A07(A0E);
                        CrT = r2.CrT(A0E, (ViewGroup) null);
                        r2.ADo((2bu) r6.A0A.getValue(), r92, new C254103rw(CrT));
                    } else {
                        C231922sd r4 = new C231922sd(r6.A03, r6.A04);
                        LayoutInflater A0E2 = DbV.A0E(r6.A01);
                        0qQ.A07(A0E2);
                        CrT = r4.CrT(A0E2, (ViewGroup) null);
                        r4.ADr((2bu) r6.A0A.getValue(), r92, new C254123ry(CrT), r7.A00);
                    }
                    r5.A03(CrT);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r9, 0);
                C66736Mbh A0U = C66581MXm.A0U((C66633Ma2) this.A01);
                C67141Miz miz = A0U.A0E;
                AnonymousClass2bO.A00();
                miz.A02 = MhW.A00(r9);
                C66736Mbh.A03(A0U);
                return;
            default:
                0qQ.A0B(r9, 0);
                C71874OsH A02 = ((DirectSearchInboxFragment) this.A01).A02();
                if (A02 != null) {
                    C72918PPc pPc = A02.A02;
                    AnonymousClass2bO.A00();
                    pPc.A00 = MhW.A00(r9);
                    C337257fy r0 = A02.A04;
                    if (r0 != null) {
                        pPc.Dam(r0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
