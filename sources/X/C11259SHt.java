package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.SHt  reason: case insensitive filesystem */
public final class C11259SHt {
    public final double A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final Exception A09;
    public final Integer A0A;
    public final byte[] A0B;

    public static C11259SHt A00(Exception exc) {
        return new C11259SHt(exc, AnonymousClass05K.A01, new byte[0], -1.0d, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final String toString() {
        String str;
        C66726MbX mbX = new C66726MbX(C11259SHt.class.getSimpleName());
        Integer num = this.A0A;
        switch (num.intValue()) {
            case 0:
                str = "Success";
                break;
            case 1:
                str = "Failed";
                break;
            default:
                str = "Skipped";
                break;
        }
        mbX.A01(str, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        if (num == AnonymousClass05K.A00) {
            mbX.A02("sourceWidth", this.A03);
            mbX.A02("sourceHeight", this.A01);
            mbX.A02("sourceOrientation", this.A02);
            mbX.A03("sourceFileSize", this.A07);
            mbX.A02("targetWidth", this.A06);
            mbX.A02("targetHeight", this.A04);
        } else if (num == AnonymousClass05K.A0C) {
            mbX.A02("sourceWidth", this.A03);
            mbX.A02("sourceHeight", this.A01);
            mbX.A02("sourceOrientation", this.A02);
            mbX.A03("sourceFileSize", this.A07);
        } else {
            if (num == AnonymousClass05K.A01) {
                mbX.A04("retriable", false);
                mbX.A01(this.A09, "exception");
            }
            return mbX.toString();
        }
        mbX.A02("targetOrientation", 0);
        mbX.A03("targetFileSize", this.A08);
        mbX.A02("targetQuality", this.A05);
        C66726MbX.A00(mbX, String.valueOf(this.A00), "psnr");
        return mbX.toString();
    }

    public C11259SHt(Exception exc, Integer num, byte[] bArr, double d, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        this.A0A = num;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A07 = j;
        this.A06 = i4;
        this.A04 = i5;
        this.A08 = j2;
        this.A05 = i6;
        this.A0B = bArr;
        this.A09 = exc;
        this.A00 = d;
    }
}
