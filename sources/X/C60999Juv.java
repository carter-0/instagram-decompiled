package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.Juv  reason: case insensitive filesystem */
public final class C60999Juv extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final double[] A03;
    public final int A04;
    public final boolean A05;
    public final Bitmap[] A06;
    public final WeakReference[] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60999Juv) {
                C60999Juv juv = (C60999Juv) obj;
                if (!(this.A04 == juv.A04 && this.A01 == juv.A01 && this.A00 == juv.A00 && 0qQ.A0K(this.A03, juv.A03) && this.A05 == juv.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void A00(int i, Bitmap bitmap) {
        WeakReference[] weakReferenceArr = this.A07;
        if (weakReferenceArr != null && weakReferenceArr.length > i) {
            weakReferenceArr[i] = C51965G9l.A0v(bitmap);
        } else if (A01().length > i) {
            A01()[i] = bitmap;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.Bitmap[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap[] A01() {
        /*
            r5 = this;
            java.lang.ref.WeakReference[] r4 = r5.A07
            if (r4 == 0) goto L_0x0015
            int r3 = r4.length
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r3]
            r1 = 0
        L_0x0008:
            if (r1 >= r3) goto L_0x0017
            r0 = r4[r1]
            java.lang.Object r0 = r0.get()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0015:
            android.graphics.Bitmap[] r2 = r5.A06
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60999Juv.A01():android.graphics.Bitmap[]");
    }

    public final int hashCode() {
        int hashCode;
        int i = ((((this.A04 * 31) + this.A01) * 31) + this.A00) * 31;
        double[] dArr = this.A03;
        if (dArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(dArr);
        }
        return DbS.A06(this.A05, (i + hashCode) * 31);
    }

    public C60999Juv(double[] dArr, int i, int i2, int i3, boolean z) {
        WeakReference[] weakReferenceArr;
        this.A04 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = dArr;
        this.A05 = z;
        Bitmap[] bitmapArr = new Bitmap[i];
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            weakReferenceArr = null;
            if (i4 >= i) {
                break;
            }
            bitmapArr[i4] = null;
            i4++;
        }
        this.A06 = bitmapArr;
        if (z) {
            WeakReference[] weakReferenceArr2 = new WeakReference[i];
            for (int i5 = 0; i5 < i; i5++) {
                weakReferenceArr2[i5] = C51965G9l.A0v((Object) null);
            }
            weakReferenceArr = weakReferenceArr2;
        }
        this.A07 = weakReferenceArr;
        this.A02 = this.A03 != null ? true : z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GeneratedVideoTimelineBitmaps(numOfThumbnails=");
        A1A.append(this.A04);
        A1A.append(Pxd.A00(333));
        A1A.append(this.A01);
        A1A.append(Pxd.A00(122));
        A1A.append(this.A00);
        A1A.append(", thumbnailFrameScales=");
        A1A.append(Arrays.toString(this.A03));
        A1A.append(", isWeakRef=");
        return G9t.A1C(A1A, this.A05);
    }
}
