package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Sgc  reason: case insensitive filesystem */
public final class C11790Sgc implements C13913TlF, C13518Tbn, C13688Tf5, C13912TlE {
    public S7O A00;
    public List A01;
    public final Matrix A02;
    public final String A03;
    public final List A04;
    public final Paint A05;
    public final Path A06;
    public final RectF A07;
    public final RectF A08;
    public final Q6Y A09;
    public final boolean A0A;

    public final List A00() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass7TE.A1C();
            int i = 0;
            while (true) {
                List list = this.A04;
                if (i >= list.size()) {
                    break;
                }
                Object obj = list.get(i);
                if (obj instanceof C13913TlF) {
                    this.A01.add(obj);
                }
                i++;
            }
        }
        return this.A01;
    }

    public final void AAd(SIR sir, Object obj) {
        S7O s7o = this.A00;
        if (s7o != null) {
            s7o.A04(sir, obj);
        }
    }

    public final void AQI(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int A0M;
        if (!this.A0A) {
            Matrix matrix2 = this.A02;
            matrix2.set(matrix);
            S7O s7o = this.A00;
            if (s7o != null) {
                matrix2.preConcat(s7o.A00());
                C11388SRb sRb = s7o.A02;
                if (sRb == null) {
                    A0M = 100;
                } else {
                    A0M = AnonymousClass7TE.A0M(sRb.A06());
                }
                i = (int) ((((((float) A0M) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (this.A09.A0U) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    List list = this.A04;
                    if (i2 >= list.size()) {
                        break;
                    } else if (!(list.get(i2) instanceof C13912TlE) || (i3 = i3 + 1) < 2) {
                        i2++;
                    } else if (i != 255) {
                        z = true;
                        RectF rectF = this.A07;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        Aha(matrix2, rectF, true);
                        Paint paint = this.A05;
                        paint.setAlpha(i);
                        canvas.saveLayer(rectF, paint);
                        i = 255;
                    }
                }
            }
            z = false;
            List list2 = this.A04;
            for (int A022 = DbT.A02(list2, 1); A022 >= 0; A022--) {
                Object obj = list2.get(A022);
                if (obj instanceof C13912TlE) {
                    ((C13912TlE) obj).AQI(canvas, matrix2, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        Matrix matrix2 = this.A02;
        matrix2.set(matrix);
        S7O s7o = this.A00;
        if (s7o != null) {
            matrix2.preConcat(s7o.A00());
        }
        RectF rectF2 = this.A08;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C13687Tf4 tf4 = (C13687Tf4) list.get(size);
                if (tf4 instanceof C13912TlE) {
                    ((C13912TlE) tf4).Aha(matrix2, rectF2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final Path Bar() {
        Matrix matrix = this.A02;
        matrix.reset();
        S7O s7o = this.A00;
        if (s7o != null) {
            matrix.set(s7o.A00());
        }
        Path path = this.A06;
        path.reset();
        if (!this.A0A) {
            List list = this.A04;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C13687Tf4 tf4 = (C13687Tf4) list.get(size);
                if (tf4 instanceof C13913TlF) {
                    path.addPath(((C13913TlF) tf4).Bar(), matrix);
                }
            }
        }
        return path;
    }

    public final void Dwx() {
        this.A09.invalidateSelf();
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        String str = this.A03;
        if (spm.A02(str, i) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                SPM spm3 = new SPM(spm2);
                spm3.A01.add(str);
                spm2 = spm3;
                if (spm.A01(str, i)) {
                    SPM spm4 = new SPM(spm3);
                    spm4.A00 = this;
                    list.add(spm4);
                }
            }
            if (spm.A03(str, i)) {
                int A002 = i + spm.A00(str, i);
                int i2 = 0;
                while (true) {
                    List list2 = this.A04;
                    if (i2 < list2.size()) {
                        C13687Tf4 tf4 = (C13687Tf4) list2.get(i2);
                        if (tf4 instanceof C13688Tf5) {
                            ((C13688Tf5) tf4).EIb(spm, spm2, list, A002);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final String getName() {
        return this.A03;
    }

    public C11790Sgc(Q6Y q6y, C11816Sh2 sh2, C11796Sgi sgi, String str, List list, boolean z) {
        this.A05 = new Paint();
        this.A07 = AnonymousClass7TE.A0Y();
        this.A02 = AnonymousClass7TE.A0U();
        this.A06 = C51965G9l.A0C();
        this.A08 = AnonymousClass7TE.A0Y();
        this.A03 = str;
        this.A09 = q6y;
        this.A0A = z;
        this.A04 = list;
        if (sh2 != null) {
            S7O s7o = new S7O(sh2);
            this.A00 = s7o;
            s7o.A03(sgi);
            this.A00.A02(this);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof C13517Tbm) {
                A1C.add(obj);
            }
        }
        int size2 = A1C.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((C13517Tbm) A1C.get(size2)).A6y(C51968G9o.A18(list));
            } else {
                return;
            }
        }
    }

    public final void ESm(List list, List list2) {
        int size = list.size();
        List list3 = this.A04;
        ArrayList A0v = DbS.A0v(size + list3.size());
        A0v.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                C13687Tf4 tf4 = (C13687Tf4) list3.get(size2);
                tf4.ESm(A0v, list3.subList(0, size2));
                A0v.add(tf4);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11790Sgc(X.S7N r10, X.Q6Y r11, X.C11811Sgx r12, X.C11796Sgi r13) {
        /*
            r9 = this;
            java.lang.String r6 = r12.A00
            boolean r8 = r12.A02
            java.util.List r2 = r12.A01
            java.util.ArrayList r7 = X.C51970G9q.A0m(r2)
            r1 = 0
        L_0x000b:
            int r0 = r2.size()
            r3 = r11
            r5 = r13
            if (r1 >= r0) goto L_0x0025
            java.lang.Object r0 = r2.get(r1)
            X.Tbo r0 = (X.C13519Tbo) r0
            X.Tf4 r0 = r0.Ezs(r10, r11, r13)
            if (r0 == 0) goto L_0x0022
            r7.add(r0)
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0040
            java.lang.Object r4 = r2.get(r1)
            X.Tbo r4 = (X.C13519Tbo) r4
            boolean r0 = r4 instanceof X.C11816Sh2
            if (r0 == 0) goto L_0x003d
            X.Sh2 r4 = (X.C11816Sh2) r4
        L_0x0038:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0040:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11790Sgc.<init>(X.S7N, X.Q6Y, X.Sgx, X.Sgi):void");
    }
}
