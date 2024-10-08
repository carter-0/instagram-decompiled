package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class ULY extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Integer A06;

    public ULY(Integer num, int i, int i2, int i3, int i4, int i5, int i6) {
        0qQ.A0B(num, 1);
        this.A06 = num;
        this.A05 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A01 = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULY) {
                ULY uly = (ULY) obj;
                if (!(this.A06 == uly.A06 && this.A05 == uly.A05 && this.A03 == uly.A03 && this.A02 == uly.A02 && this.A04 == uly.A04 && this.A00 == uly.A00 && this.A01 == uly.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(0bb r2, ULY uly) {
        r2.A06("codec", C18106Vla.A01(uly.A06));
        r2.A05(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf((long) uly.A05));
        r2.A05(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf((long) uly.A03));
        r2.A05("frame_rate", Long.valueOf((long) uly.A02));
        r2.A05("i_frame_interval", Long.valueOf((long) uly.A04));
    }

    public final int hashCode() {
        Integer num = this.A06;
        return (((((((((((C51971G9r.A0D(num, C18106Vla.A01(num)) * 31) + this.A05) * 31) + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("VideoFormat(codec=");
        Integer num = this.A06;
        if (num != null) {
            str = C18106Vla.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", width=");
        sb.append(this.A05);
        sb.append(", height=");
        sb.append(this.A03);
        sb.append(Pxd.A00(46));
        sb.append(this.A02);
        sb.append(Pxd.A00(320));
        sb.append(this.A04);
        sb.append(", bitRate=");
        sb.append(this.A00);
        sb.append(Pxd.A00(310));
        return C51975G9x.A0j(sb, this.A01);
    }
}
