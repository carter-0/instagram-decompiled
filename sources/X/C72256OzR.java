package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.OzR  reason: case insensitive filesystem */
public final class C72256OzR implements C61370mm {
    public boolean A00 = false;
    public final Context A01;
    public final UserSession A02;
    public final C70618ODp A03;
    public final C70449O7a A04;
    public final 17i A05;
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eK A07;
    public final AnonymousClass0eK A08;
    public final A46 A09;

    public final void Cxw() {
        this.A00 = true;
    }

    public final void DC7() {
        this.A00 = false;
        A01();
    }

    private C232262tL A00(int i) {
        C232262tL r3;
        C331837So A0S = this.A09.A00.A0S(i);
        if (A0S instanceof AnonymousClass7LQ) {
            try {
                C70618ODp oDp = this.A03;
                Context context = this.A01;
                UserSession userSession = this.A02;
                17i r12 = this.A05;
                AnonymousClass7L2 r11 = (AnonymousClass7L2) this.A07.get();
                AnonymousClass9HC r9 = (AnonymousClass9HC) this.A08.get();
                AnonymousClass7LQ r10 = (AnonymousClass7LQ) A0S;
                C51974G9v.A1M(r12, r11, r9);
                0qQ.A0B(r10, 5);
                C328347El r6 = (C328347El) C51968G9o.A10((Map) oDp.A01.getValue(), r10.getType());
                if (r6 == null) {
                    r6 = oDp.A00;
                }
                r3 = r6.AWb(context, userSession, r9, r10, r11, r12, oDp.A02);
            } catch (IllegalArgumentException e) {
                int type = A0S.getType();
                0f9 AEf = 0wj.A01.AEf(002.A0O("IllegalArgumentException is thrown for viewType ", type), 20134884);
                AEf.ERJ(e);
                AEf.ABO("view_type", type);
                AEf.report();
                throw e;
            }
        } else if (A0S instanceof C232262tL) {
            r3 = (C232262tL) A0S;
        } else if (A0S instanceof C66672Maf) {
            C70449O7a o7a = this.A04;
            C66672Maf maf = (C66672Maf) A0S;
            0qQ.A0B(maf, 0);
            r3 = new C66678Mal(maf.A00, o7a.A00.A00);
        } else {
            String A0y = C66581MXm.A0y(A0S);
            IllegalStateException A0c = DbW.A0c("Unsupported ThreadRowData: ", A0y);
            0f9 AEf2 = 0wj.A01.AEf(002.A0R("Unsupported ThreadRowData: ", A0y), 20134884);
            AEf2.ERJ(A0c);
            AEf2.ABO("view_type", A0S.getType());
            AEf2.report();
            throw A0c;
        }
        if (((AnonymousClass2t9) this.A06.get()).A06 && r3.getKey() == null) {
            0wj r62 = 0wj.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("setModel search find model with null key for model: ");
            A1A.append(C66581MXm.A0y(r3));
            A1A.append(", with viewType ");
            A1A.append(A0S.getType());
            A1A.append(", with timestampMicro ");
            A1A.append(A0S.C7Z());
            A1A.append(", at index ");
            A1A.append(i);
            DbT.A1Q(r62, A1A.toString(), 20134884);
        }
        return r3;
    }

    public final void D1N(int i, int i2) {
        if (this.A00) {
            return;
        }
        if (i2 == 1) {
            ((AnonymousClass2t9) this.A06.get()).A07(AnonymousClass2t9.A0D, A00(i), i);
            return;
        }
        A01();
    }

    public final void DKr(int i, int i2) {
        if (this.A00) {
            return;
        }
        if (i2 == 1) {
            AnonymousClass2t9 r2 = (AnonymousClass2t9) this.A06.get();
            C232262tL A002 = A00(i);
            ArrayList A1D = AnonymousClass7TE.A1D(r2.A04.Au8());
            A1D.add(i, A002);
            ViewModelListUpdate A0R = DbS.A0R();
            A0R.A01(A1D);
            r2.A06(A0R, AnonymousClass2t9.A0D);
            return;
        }
        A01();
    }

    public final void DSU(int i, int i2) {
        if (!this.A00) {
            AnonymousClass2t9 r3 = (AnonymousClass2t9) this.A06.get();
            ArrayList A1D = AnonymousClass7TE.A1D(r3.A04.Au8());
            A1D.add(i2, A1D.remove(i));
            ViewModelListUpdate A0R = DbS.A0R();
            A0R.A01(A1D);
            r3.A06(A0R, AnonymousClass2t9.A0D);
        }
    }

    public final void Ddf(int i, int i2) {
        if (this.A00) {
            return;
        }
        if (i2 == 1) {
            AnonymousClass2t9 r2 = (AnonymousClass2t9) this.A06.get();
            ArrayList A1D = AnonymousClass7TE.A1D(r2.A04.Au8());
            A1D.remove(i);
            ViewModelListUpdate A0R = DbS.A0R();
            A0R.A01(A1D);
            r2.A06(A0R, AnonymousClass2t9.A0D);
            return;
        }
        A01();
    }

    public C72256OzR(Context context, UserSession userSession, A46 a46, C70618ODp oDp, C70449O7a o7a, AnonymousClass0eK r7, AnonymousClass0eK r8, AnonymousClass0eK r9) {
        this.A02 = userSession;
        this.A01 = context;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = 17h.A00(userSession);
        this.A03 = oDp;
        this.A04 = o7a;
        this.A09 = a46;
    }

    public final void A01() {
        ViewModelListUpdate A0R = DbS.A0R();
        AnonymousClass7ZX r3 = this.A09.A00;
        int i = r3.A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            A0R.A00(A00(i2));
        }
        try {
            ((AnonymousClass2t9) this.A06.get()).A05(A0R);
        } catch (C73546Ped e) {
            int type = ((C331837So) r3.A0R().A05(e.A00)).getType();
            0f9 AEf = 0wj.A01.AEf(002.A07(type, "Seen duplicate model key for class ", e.A01, " with viewType "), 20134884);
            AEf.ERJ(e);
            AEf.ABO("view_type", type);
            AEf.report();
        }
    }
}
