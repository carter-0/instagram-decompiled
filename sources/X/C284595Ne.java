package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.List;

/* renamed from: X.5Ne  reason: invalid class name and case insensitive filesystem */
public final class C284595Ne implements AnonymousClass4P9, AnonymousClass4RT {
    public final AnonymousClass5NQ A00;
    public final /* synthetic */ AnonymousClass5NF A01;

    private Pair A00(C264874Rq r9, int i) {
        C264874Rq r1 = null;
        if (r9 != null) {
            AnonymousClass5NQ r7 = this.A00;
            int i2 = 0;
            while (true) {
                List list = r7.A04;
                if (i2 >= list.size()) {
                    return null;
                }
                if (((C264884Rr) list.get(i2)).A03 == r9.A03) {
                    Object obj = r9.A04;
                    Object obj2 = r7.A03;
                    Timeline timeline = Timeline.A00;
                    r1 = r9.A00(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i + this.A00.A00), r1);
    }

    public final void DOB(AnonymousClass4Y0 r9, AnonymousClass4Y4 r10, C264874Rq r11, Object obj, Object obj2, int i) {
        Pair A002 = A00(r11, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C289915eS(A002, this, r9, r10, obj, obj2));
        }
    }

    public final void DOD(AnonymousClass4Y0 r9, AnonymousClass4Y4 r10, C264874Rq r11, IOException iOException, int i, boolean z) {
        Pair A002 = A00(r11, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C22419Y3b(A002, this, r9, r10, iOException, z));
        }
    }

    public final /* synthetic */ void DOU(AnonymousClass4Y0 r1, AnonymousClass4Y4 r2, C264874Rq r3, int i, int i2) {
    }

    public C284595Ne(AnonymousClass5NQ r1, AnonymousClass5NF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DAO(AnonymousClass4Y4 r4, C264874Rq r5, int i) {
        Pair A002 = A00(r5, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C289925eT(A002, this, r4));
        }
    }

    public final void DB1(C264874Rq r4, int i) {
        Pair A002 = A00(r4, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C22395Y2b(A002, this));
        }
    }

    public final void DB2(C264874Rq r4, int i) {
        Pair A002 = A00(r4, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C22396Y2c(A002, this));
        }
    }

    public final void DB3(C264874Rq r4, int i, int i2) {
        Pair A002 = A00(r4, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new Y3J(A002, this, i2));
        }
    }

    public final void DB4(C264874Rq r4, Exception exc, int i) {
        Pair A002 = A00(r4, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new Y3L(A002, this, exc));
        }
    }

    public final void DB5(C264874Rq r4, int i) {
        Pair A002 = A00(r4, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C22397Y2d(A002, this));
        }
    }

    public final void DO7(AnonymousClass4Y0 r4, AnonymousClass4Y4 r5, C264874Rq r6, int i) {
        Pair A002 = A00(r6, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C21063XDb(A002, this, r4, r5));
        }
    }

    public final void DOT(AnonymousClass4Y0 r4, AnonymousClass4Y4 r5, C264874Rq r6, int i) {
        Pair A002 = A00(r6, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new C289905eR(A002, this, r4, r5));
        }
    }

    public final void Dvs(AnonymousClass4Y4 r4, C264874Rq r5, int i) {
        Pair A002 = A00(r5, i);
        if (A002 != null) {
            AnonymousClass4S6 r0 = this.A01.A05;
            ((AnonymousClass4S5) r0).A00.post(new Y3K(A002, this, r4));
        }
    }
}
