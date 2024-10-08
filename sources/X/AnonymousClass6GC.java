package X;

import android.graphics.Bitmap;

/* renamed from: X.6GC  reason: invalid class name */
public final class AnonymousClass6GC extends AnonymousClass2DO {
    public int A00;
    public float A01;
    public C288195bW A02;
    public final C3018260f A03;
    public final long A04;
    public final long A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass6GC(X.C3018260f r3) {
        /*
            r2 = this;
            r0 = r3
            X.60g r0 = (X.C3018360g) r0
            android.graphics.Bitmap r0 = r0.A00
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            long r0 = X.C289155d7.A00(r1, r0)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GC.<init>(X.60f):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6GC) {
                AnonymousClass6GC r8 = (AnonymousClass6GC) obj;
                if (!(0qQ.A0K(this.A03, r8.A03) && this.A05 == r8.A05 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long A03() {
        return C289155d7.A01(this.A04);
    }

    public final void A04(AnonymousClass5Q3 r21) {
        C3018260f r7 = this.A03;
        long j = this.A05;
        AnonymousClass5Q3 r5 = r21;
        long Bwg = r5.Bwg();
        long A002 = C289155d7.A00(Math.round(C288025bF.A02(Bwg)), Math.round(C288025bF.A00(Bwg)));
        float f = this.A01;
        r5.AQb(this.A02, r7, C289635dw.A00, f, 3, this.A00, 0, j, 0, A002);
    }

    public final boolean A05(float f) {
        this.A01 = f;
        return true;
    }

    public final boolean A06(C288195bW r2) {
        this.A02 = r2;
        return true;
    }

    public final int hashCode() {
        long j = this.A05;
        return (((((this.A03.hashCode() * 31) + ((int) (0 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapPainter(image=");
        sb.append(this.A03);
        sb.append(", srcOffset=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append((int) (0 >> 32));
        sb2.append(", ");
        sb2.append(0);
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(", srcSize=");
        long j = this.A05;
        sb.append(002.A0P(" x ", (int) (j >> 32), C289005cr.A00(j)));
        sb.append(", filterQuality=");
        if (this.A00 == 0) {
            str = "None";
        } else {
            str = "Low";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass6GC(C3018260f r5, long j) {
        int i;
        int A002;
        this.A03 = r5;
        this.A05 = j;
        this.A00 = 1;
        if (((int) (0 >> 32)) >= 0 && (i = (int) (j >> 32)) >= 0 && (A002 = C289005cr.A00(j)) >= 0) {
            Bitmap bitmap = ((C3018360g) r5).A00;
            if (i <= bitmap.getWidth() && A002 <= bitmap.getHeight()) {
                this.A04 = j;
                this.A01 = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
