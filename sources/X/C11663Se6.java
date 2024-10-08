package X;

import android.content.Context;

/* renamed from: X.Se6  reason: case insensitive filesystem */
public final class C11663Se6 implements 2YM {
    public final Context A00;
    public final SSL A01;
    public final SSL A02;
    public final SIS A03;
    public final SOC A04;
    public final AnonymousClass5A3 A05;
    public final C10634RvT A06;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public final 2YL create(Class cls) {
        if (cls.equals(QDA.class)) {
            SIS sis = this.A03;
            return new QDA(new QDE(this.A00, this.A02, sis, this.A04, this.A05), sis);
        } else if (cls.equals(QDF.class)) {
            return new QDF(this.A00, this.A03);
        } else {
            if (cls.equals(QMA.class)) {
                return new QMA(this.A02);
            }
            if (cls.equals(QM9.class)) {
                return new C7432QCx(this.A02);
            }
            if (cls.equals(C7432QCx.class)) {
                return new C7432QCx(this.A02);
            }
            if (cls.equals(C7430QCv.class)) {
                SSL ssl = this.A01;
                C10634RvT rvT = this.A06;
                AnonymousClass5A3 r0 = this.A05;
                2YL r4 = new 2YL();
                r4.A01 = r0;
                r4.A00 = ssl;
                r4.A02 = rvT;
                return r4;
            } else if (cls.equals(QD2.class)) {
                return new QD2(this.A03);
            } else {
                if (cls.equals(QDI.class)) {
                    return new QDI(this.A00, this.A03);
                }
                if (cls.equals(QDE.class)) {
                    Context context = this.A00;
                    AnonymousClass5A3 r9 = this.A05;
                    return new QDE(context, this.A02, this.A03, this.A04, r9);
                }
                throw C51973G9u.A0g(cls, "Not aware about view model :", AnonymousClass7TE.A1A());
            }
        }
    }

    public C11663Se6(Context context, SSL ssl, SSL ssl2, SIS sis, SOC soc, AnonymousClass5A3 r6, C10634RvT rvT) {
        this.A00 = context;
        this.A03 = sis;
        this.A02 = ssl;
        this.A01 = ssl2;
        this.A06 = rvT;
        this.A05 = r6;
        this.A04 = soc;
    }
}
