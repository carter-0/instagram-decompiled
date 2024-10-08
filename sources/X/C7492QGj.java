package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.QGj  reason: case insensitive filesystem */
public final class C7492QGj extends C11796Sgi {
    public float A00;
    public boolean A01 = true;
    public C11388SRb A02;
    public final Paint A03 = new Paint();
    public final RectF A04 = AnonymousClass7TE.A0Y();
    public final List A05 = AnonymousClass7TE.A1C();
    public final RectF A06 = AnonymousClass7TE.A0Y();

    public final void A0A(float f) {
        this.A00 = f;
        super.A0A(f);
        C11388SRb sRb = this.A02;
        if (sRb != null) {
            S7N s7n = this.A0J.A0G;
            S7N s7n2 = this.A0L.A09;
            f = ((C11388SRb.A01(sRb) * s7n2.A01) - s7n2.A03) / ((s7n.A00 - s7n.A03) + 0.01f);
        }
        if (this.A02 == null) {
            S56 s56 = this.A0L;
            float f2 = s56.A02;
            S7N s7n3 = s56.A09;
            f -= f2 / (s7n3.A00 - s7n3.A03);
        }
        S56 s562 = this.A0L;
        float f3 = s562.A03;
        if (f3 != 0.0f && !"__container".equals(s562.A0J)) {
            f /= f3;
        }
        List list = this.A05;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C11796Sgi) list.get(size)).A0A(f);
            } else {
                return;
            }
        }
    }

    public C7492QGj(S7N s7n, Q6Y q6y, S56 s56, List list) {
        super(q6y, s56);
        C11796Sgi sgi;
        C11796Sgi sgi2;
        String str;
        QGY qgy = s56.A0A;
        if (qgy != null) {
            QGR A002 = C11802Sgo.A00(qgy);
            this.A02 = A002;
            A0C(A002);
            this.A02.A09(this);
        } else {
            this.A02 = null;
        }
        01c r3 = new 01c(s7n.A08.size());
        int A022 = DbT.A02(list, 1);
        C11796Sgi sgi3 = null;
        while (true) {
            if (A022 >= 0) {
                S56 s562 = (S56) list.get(A022);
                int intValue = s562.A0H.intValue();
                switch (intValue) {
                    case 0:
                        sgi2 = new C7492QGj(s7n, q6y, s562, C66580MXl.A13(s562.A0K, s7n.A0C));
                        break;
                    case 1:
                        sgi2 = new QGi(q6y, s562);
                        break;
                    case 2:
                        sgi2 = new C7491QGh(q6y, s562);
                        break;
                    case 3:
                        sgi2 = new C11796Sgi(q6y, s562);
                        break;
                    case 4:
                        sgi2 = new QGg(s7n, q6y, this, s562);
                        break;
                    case 5:
                        sgi2 = new C7493QGk(q6y, s562);
                        break;
                    default:
                        switch (intValue) {
                            case 1:
                                str = "SOLID";
                                break;
                            case 2:
                                str = "IMAGE";
                                break;
                            case 3:
                                str = "NULL";
                                break;
                            case 4:
                                str = "SHAPE";
                                break;
                            case 5:
                                str = "TEXT";
                                break;
                            case 6:
                                str = "UNKNOWN";
                                break;
                            default:
                                str = "PRE_COMP";
                                break;
                        }
                        S85.A00(002.A0R("Unknown layer type ", str));
                        continue;
                }
                r3.A09(sgi2.A0L.A07, sgi2);
                if (sgi3 != null) {
                    sgi3.A04 = sgi2;
                    sgi3 = null;
                } else {
                    this.A05.add(0, sgi2);
                    int intValue2 = s562.A0I.intValue();
                    if (intValue2 == 1 || intValue2 == 2) {
                        sgi3 = sgi2;
                    }
                }
                A022--;
            } else {
                for (int i = 0; i < r3.A00(); i++) {
                    C11796Sgi sgi4 = (C11796Sgi) r3.A05(r3.A02(i));
                    if (!(sgi4 == null || (sgi = (C11796Sgi) r3.A05(sgi4.A0L.A08)) == null)) {
                        sgi4.A05 = sgi;
                    }
                }
                return;
            }
        }
    }

    public final void A0E(boolean z) {
        super.A0E(z);
        for (C11796Sgi A0E : this.A05) {
            A0E.A0E(z);
        }
    }

    public final void AAd(SIR sir, Object obj) {
        super.AAd(sir, obj);
        if (obj != C13881Tj4.A0S) {
            return;
        }
        if (sir == null) {
            C11388SRb sRb = this.A02;
            if (sRb != null) {
                sRb.A0A((SIR) null);
                return;
            }
            return;
        }
        QGN A002 = QGN.A00(sir);
        this.A02 = A002;
        A002.A09(this);
        A0C(this.A02);
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        super.Aha(matrix, rectF, z);
        List list = this.A05;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A06;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C11796Sgi) list.get(size)).Aha(this.A0A, rectF2, true);
            rectF.union(rectF2);
        }
    }
}
