package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* renamed from: X.5EM  reason: invalid class name */
public final class AnonymousClass5EM implements AnonymousClass4P9, AnonymousClass4RT {
    public C265184Sw A00;
    public C265174Sv A01;
    public final Object A02;
    public final /* synthetic */ AnonymousClass5EJ A03;

    private boolean A01(C264874Rq r10, int i) {
        C264874Rq r4 = r10;
        if (r10 != null) {
            AnonymousClass5EJ r3 = this.A03;
            Object obj = this.A02;
            if (!(r3 instanceof C295965pC)) {
                AnonymousClass5EI r32 = (AnonymousClass5EI) r3;
                if (r32 instanceof AnonymousClass5EK) {
                    Object obj2 = r10.A04;
                    AnonymousClass5EQ r1 = ((AnonymousClass5EK) r32).A01;
                    Object obj3 = AnonymousClass5EQ.A02;
                    Object obj4 = r1.A00;
                    if (obj4 != null && obj4.equals(obj2)) {
                        obj2 = AnonymousClass5EQ.A02;
                    }
                    r4 = r10.A00(obj2);
                }
            } else if (((Number) obj).intValue() != 0) {
                return false;
            }
        } else {
            r4 = null;
        }
        AnonymousClass5EJ r2 = this.A03;
        C265174Sv r12 = this.A01;
        int i2 = i;
        if (r12.A00 != i || !Util.A0I(r12.A01, r4)) {
            this.A01 = new C265174Sv(r4, r2.A04.A02, i2, 0);
        }
        C265184Sw r13 = this.A00;
        if (r13.A00 == i && Util.A0I(r13.A01, r4)) {
            return true;
        }
        this.A00 = new C265184Sw(r4, r2.A03.A02, i);
        return true;
    }

    public final /* synthetic */ void DOU(AnonymousClass4Y0 r1, AnonymousClass4Y4 r2, C264874Rq r3, int i, int i2) {
    }

    public AnonymousClass5EM(AnonymousClass5EJ r5, Object obj) {
        this.A03 = r5;
        this.A01 = r5.A09((C264874Rq) null);
        this.A00 = new C265184Sw((C264874Rq) null, r5.A03.A02, 0);
        this.A02 = obj;
    }

    private AnonymousClass4Y4 A00(AnonymousClass4Y4 r11) {
        long j = r11.A04;
        long j2 = r11.A03;
        if (j == j && j2 == j2) {
            return r11;
        }
        int i = r11.A00;
        int i2 = r11.A02;
        return new AnonymousClass4Y4(r11.A05, r11.A06, i, i2, r11.A01, j, j2);
    }

    public final void DAO(AnonymousClass4Y4 r3, C264874Rq r4, int i) {
        if (A01(r4, i)) {
            this.A01.A0B(A00(r3));
        }
    }

    public final void DB1(C264874Rq r2, int i) {
        if (A01(r2, i)) {
            this.A00.A00();
        }
    }

    public final void DB2(C264874Rq r2, int i) {
        if (A01(r2, i)) {
            this.A00.A01();
        }
    }

    public final void DB3(C264874Rq r2, int i, int i2) {
        if (A01(r2, i)) {
            this.A00.A03(i2);
        }
    }

    public final void DB4(C264874Rq r2, Exception exc, int i) {
        if (A01(r2, i)) {
            this.A00.A04(exc);
        }
    }

    public final void DB5(C264874Rq r2, int i) {
        if (A01(r2, i)) {
            this.A00.A02();
        }
    }

    public final void DO7(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, int i) {
        if (A01(r5, i)) {
            this.A01.A07(r3, A00(r4));
        }
    }

    public final void DOB(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, Object obj, Object obj2, int i) {
        if (A01(r5, i)) {
            this.A01.A0A(r3, A00(r4), obj, obj2);
        }
    }

    public final void DOD(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, IOException iOException, int i, boolean z) {
        if (A01(r5, i)) {
            this.A01.A09(r3, A00(r4), iOException, z);
        }
    }

    public final void DOT(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, int i) {
        if (A01(r5, i)) {
            this.A01.A08(r3, A00(r4));
        }
    }

    public final void Dvs(AnonymousClass4Y4 r3, C264874Rq r4, int i) {
        if (A01(r4, i)) {
            this.A01.A0C(A00(r3));
        }
    }
}
