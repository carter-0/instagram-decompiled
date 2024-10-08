package X;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.SfT  reason: case insensitive filesystem */
public final class C11732SfT implements C13684Tf1 {
    public final int A00;
    public final int A01;
    public final float A02;
    public final int A03;
    public final C11389SRd A04 = new C11389SRd();
    public final String A05;
    public final boolean A06;

    public final /* synthetic */ void reset() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.text.SpannableStringBuilder r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            if (r7 == r8) goto L_0x002b
            r5 = r11 | 33
            r0 = r7 & 1
            r4 = 0
            r1 = 1
            boolean r3 = X.AnonymousClass7TF.A1P(r0)
            r0 = r7 & 2
            boolean r2 = X.AnonymousClass7TF.A1P(r0)
            if (r3 == 0) goto L_0x0036
            if (r2 == 0) goto L_0x0017
            r1 = 3
        L_0x0017:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r6.setSpan(r0, r9, r10, r5)
        L_0x001f:
            r0 = r7 & 4
            if (r0 == 0) goto L_0x002c
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x0028:
            r6.setSpan(r0, r9, r10, r5)
        L_0x002b:
            return
        L_0x002c:
            if (r3 != 0) goto L_0x002b
            if (r2 != 0) goto L_0x002b
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L_0x0028
        L_0x0036:
            if (r2 == 0) goto L_0x001f
            r1 = 2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11732SfT.A00(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public final void E1l(C13507TbY tbY, C11115SAs sAs, byte[] bArr, int i, int i2) {
        String A0I;
        ImmutableList of;
        C11389SRd sRd = this.A04;
        sRd.A0Q(bArr, i + i2);
        sRd.A0O(i);
        C11366SPh.A01(JTQ.A1P(Pxe.A06(sRd), 2));
        int A08 = sRd.A08();
        if (A08 == 0) {
            A0I = "";
        } else {
            int i3 = sRd.A01;
            Charset A0J = sRd.A0J();
            int i4 = A08 - (sRd.A01 - i3);
            if (A0J == null) {
                A0J = AnonymousClass2RN.A05;
            }
            A0I = sRd.A0I(A0J, i4);
        }
        if (A0I.isEmpty()) {
            of = ImmutableList.of();
        } else {
            SpannableStringBuilder A0C = DbS.A0C(A0I);
            int i5 = this.A01;
            A00(A0C, i5, 0, 0, A0C.length(), 16711680);
            int i6 = this.A00;
            int length = A0C.length();
            if (i6 != -1) {
                A0C.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.A05;
            int length2 = A0C.length();
            if (str != "sans-serif") {
                A0C.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f = this.A02;
            while (true) {
                int i7 = sRd.A00;
                int i8 = sRd.A01;
                if (i7 - i8 < 8) {
                    break;
                }
                int A012 = sRd.A01();
                int A013 = sRd.A01();
                boolean z = true;
                if (A013 == 1937013100) {
                    if (i7 - sRd.A01 < 2) {
                        z = false;
                    }
                    C11366SPh.A01(z);
                    int A082 = sRd.A08();
                    for (int i9 = 0; i9 < A082; i9++) {
                        C11366SPh.A01(JTQ.A1P(Pxe.A06(sRd), 12));
                        int A083 = sRd.A08();
                        int A084 = sRd.A08();
                        int A07 = Pxf.A07(sRd, 2);
                        sRd.A0P(1);
                        int A014 = sRd.A01();
                        if (A084 > A0C.length()) {
                            STH.A03("Tx3gParser", 002.A0n("Truncating styl end (", ") to cueText.length() (", ").", A084, A0C.length()));
                            A084 = A0C.length();
                        }
                        if (A083 >= A084) {
                            STH.A03("Tx3gParser", 002.A0n("Ignoring styl with start (", ") >= end (", ").", A083, A084));
                        } else {
                            A00(A0C, A07, i5, A083, A084, 0);
                            if (A014 != i6) {
                                A0C.setSpan(new ForegroundColorSpan((A014 >>> 8) | ((A014 & 255) << 24)), A083, A084, 33);
                            }
                        }
                    }
                } else if (A013 == 1952608120 && this.A06) {
                    if (i7 - sRd.A01 < 2) {
                        z = false;
                    }
                    C11366SPh.A01(z);
                    f = Pxi.A01(((float) sRd.A08()) / ((float) this.A03), 0.95f, 0.0f);
                }
                sRd.A0O(i8 + A012);
            }
            of = ImmutableList.of(new C11270SIh((Bitmap) null, (Layout.Alignment) null, (Layout.Alignment) null, A0C, f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, 0, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK));
        }
        tbY.accept(new C10513RtS(of, -9223372036854775807L, -9223372036854775807L));
    }

    public C11732SfT(List list) {
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.A01 = bArr[24];
            this.A00 = Pxf.A0D(bArr, 28, ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16)) | (bArr[29] & 255);
            this.A05 = "Serif".equals(Pxe.A11(AnonymousClass2RN.A05, bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.A03 = i;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.A06 = z;
            if (z) {
                this.A02 = Pxi.A01(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.95f, 0.0f);
            } else {
                this.A02 = 0.85f;
            }
        } else {
            this.A00 = -1;
            this.A05 = str;
            this.A02 = 0.85f;
            this.A03 = -1;
        }
    }
}
