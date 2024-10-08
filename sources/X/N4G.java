package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.StringWriter;
import org.webrtc.EglBase14Impl;

public final class N4G extends AnonymousClass0T0 {
    public int A00;
    public String A01;
    public final int A02;

    public N4G(int i, String str, int i2) {
        this.A02 = i2;
        switch (i2) {
            case 1:
            case 3:
            case 8:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
                0qQ.A0B(str, 2);
                break;
        }
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0078, code lost:
        if ((r3 instanceof X.N4G) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007a, code lost:
        r3 = (X.N4G) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008e, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if ((r3 instanceof X.N4G) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r3 = (X.N4G) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0029;
                case 2: goto L_0x002d;
                case 3: goto L_0x0031;
                case 4: goto L_0x0035;
                case 5: goto L_0x0039;
                case 6: goto L_0x003d;
                case 7: goto L_0x0041;
                case 8: goto L_0x0045;
                case 9: goto L_0x004a;
                case 10: goto L_0x004f;
                case 11: goto L_0x0054;
                case 12: goto L_0x0059;
                case 13: goto L_0x005e;
                case 14: goto L_0x0063;
                case 15: goto L_0x0068;
                case 16: goto L_0x006d;
                case 17: goto L_0x0072;
                case 18: goto L_0x0091;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0097
            r1 = 19
        L_0x0009:
            boolean r0 = r3 instanceof X.N4G
            if (r0 == 0) goto L_0x0023
            X.N4G r3 = (X.N4G) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x0023
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0023
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0097
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            if (r2 == r3) goto L_0x0097
            r1 = 0
            goto L_0x0076
        L_0x0029:
            if (r2 == r3) goto L_0x0097
            r1 = 1
            goto L_0x0009
        L_0x002d:
            if (r2 == r3) goto L_0x0097
            r1 = 2
            goto L_0x0076
        L_0x0031:
            if (r2 == r3) goto L_0x0097
            r1 = 3
            goto L_0x0009
        L_0x0035:
            if (r2 == r3) goto L_0x0097
            r1 = 4
            goto L_0x0076
        L_0x0039:
            if (r2 == r3) goto L_0x0097
            r1 = 5
            goto L_0x0076
        L_0x003d:
            if (r2 == r3) goto L_0x0097
            r1 = 6
            goto L_0x0009
        L_0x0041:
            if (r2 == r3) goto L_0x0097
            r1 = 7
            goto L_0x0009
        L_0x0045:
            if (r2 == r3) goto L_0x0097
            r1 = 8
            goto L_0x0009
        L_0x004a:
            if (r2 == r3) goto L_0x0097
            r1 = 9
            goto L_0x0076
        L_0x004f:
            if (r2 == r3) goto L_0x0097
            r1 = 10
            goto L_0x0076
        L_0x0054:
            if (r2 == r3) goto L_0x0097
            r1 = 11
            goto L_0x0076
        L_0x0059:
            if (r2 == r3) goto L_0x0097
            r1 = 12
            goto L_0x0076
        L_0x005e:
            if (r2 == r3) goto L_0x0097
            r1 = 13
            goto L_0x0076
        L_0x0063:
            if (r2 == r3) goto L_0x0097
            r1 = 14
            goto L_0x0076
        L_0x0068:
            if (r2 == r3) goto L_0x0097
            r1 = 15
            goto L_0x0009
        L_0x006d:
            if (r2 == r3) goto L_0x0097
            r1 = 16
            goto L_0x0076
        L_0x0072:
            if (r2 == r3) goto L_0x0097
            r1 = 17
        L_0x0076:
            boolean r0 = r3 instanceof X.N4G
            if (r0 == 0) goto L_0x0023
            X.N4G r3 = (X.N4G) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x0023
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0097
            goto L_0x0023
        L_0x0091:
            if (r2 == r3) goto L_0x0097
            r1 = 18
            goto L_0x0009
        L_0x0097:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4G.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = r0 * 31;
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return r1 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x001b;
                case 2: goto L_0x0005;
                case 3: goto L_0x001b;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x001b;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0026;
                case 14: goto L_0x0005;
                case 15: goto L_0x0011;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x001b;
                case 19: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r2.A01
        L_0x0007:
            int r0 = r0.hashCode()
        L_0x000b:
            int r1 = r0 * 31
            int r0 = r2.A00
        L_0x000f:
            int r1 = r1 + r0
            return r1
        L_0x0011:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x0021
            r0 = 0
            goto L_0x000f
        L_0x001b:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.String r0 = r2.A01
        L_0x0021:
            int r0 = r0.hashCode()
            goto L_0x000f
        L_0x0026:
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4G.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A02) {
            case 0:
                sb = AnonymousClass7TE.A1A();
                sb.append("ParsedBillingPeriod(period=");
                sb.append(this.A01);
                sb.append(", periodValue=");
                sb.append(this.A00);
                break;
            case 1:
                sb = AnonymousClass7TE.A1A();
                sb.append("PurchasePriceCurrencyAmount(amountInHundredths=");
                sb.append(this.A00);
                sb.append(", currency=");
                sb.append(this.A01);
                break;
            case 17:
                StringWriter A0v = JTO.A0v();
                17W A0K = AnonymousClass7TF.A0K(A0v);
                String str = this.A01;
                if (str != null) {
                    A0K.A0R("channel_name", str);
                }
                A0K.A0P("product_type", this.A00);
                String A0k = AnonymousClass7TG.A0k(A0K, A0v);
                0qQ.A07(A0k);
                return A0k;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0p(sb);
    }

    public N4G(String str, int i, int i2) {
        this.A02 = i2;
        switch (i2) {
            case 4:
            case 5:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
            case 16:
            case 17:
                0qQ.A0B(str, 1);
                break;
        }
        this.A01 = str;
        this.A00 = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4G(int i) {
        this(i, (String) null, 15);
        this.A02 = 15;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4G() {
        this("", 0, 9);
        this.A02 = 9;
        this.A02 = 9;
    }
}
