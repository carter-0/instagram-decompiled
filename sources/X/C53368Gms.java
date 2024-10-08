package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Gms  reason: case insensitive filesystem */
public final class C53368Gms extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public final int A02;

    public C53368Gms(int i, int i2, int i3) {
        this.A02 = i3;
        switch (i3) {
            case 0:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                this.A01 = i;
                this.A00 = i2;
                return;
            default:
                this.A00 = i;
                this.A01 = i2;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0059, code lost:
        if ((r3 instanceof X.C53368Gms) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005b, code lost:
        r3 = (X.C53368Gms) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005f, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0065, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0067, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x008b, code lost:
        if ((r3 instanceof X.C53368Gms) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x008d, code lost:
        r3 = (X.C53368Gms) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0091, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0097, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0099, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009d, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x000e;
                case 2: goto L_0x0012;
                case 3: goto L_0x0016;
                case 4: goto L_0x001a;
                case 5: goto L_0x001e;
                case 6: goto L_0x0005;
                case 7: goto L_0x0022;
                case 8: goto L_0x0026;
                case 9: goto L_0x002b;
                case 10: goto L_0x0030;
                case 11: goto L_0x0035;
                case 12: goto L_0x003a;
                case 13: goto L_0x003f;
                case 14: goto L_0x0044;
                case 15: goto L_0x0049;
                case 16: goto L_0x004e;
                case 17: goto L_0x0053;
                case 18: goto L_0x006c;
                case 19: goto L_0x0071;
                case 20: goto L_0x0076;
                case 21: goto L_0x007b;
                case 22: goto L_0x0080;
                case 23: goto L_0x0085;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x00a1
            r1 = 0
            goto L_0x0089
        L_0x000e:
            if (r2 == r3) goto L_0x00a1
            r1 = 1
            goto L_0x0057
        L_0x0012:
            if (r2 == r3) goto L_0x00a1
            r1 = 2
            goto L_0x0057
        L_0x0016:
            if (r2 == r3) goto L_0x00a1
            r1 = 3
            goto L_0x0089
        L_0x001a:
            if (r2 == r3) goto L_0x00a1
            r1 = 4
            goto L_0x0057
        L_0x001e:
            if (r2 == r3) goto L_0x00a1
            r1 = 5
            goto L_0x0057
        L_0x0022:
            if (r2 == r3) goto L_0x00a1
            r1 = 7
            goto L_0x0089
        L_0x0026:
            if (r2 == r3) goto L_0x00a1
            r1 = 8
            goto L_0x0089
        L_0x002b:
            if (r2 == r3) goto L_0x00a1
            r1 = 9
            goto L_0x0089
        L_0x0030:
            if (r2 == r3) goto L_0x00a1
            r1 = 10
            goto L_0x0089
        L_0x0035:
            if (r2 == r3) goto L_0x00a1
            r1 = 11
            goto L_0x0089
        L_0x003a:
            if (r2 == r3) goto L_0x00a1
            r1 = 12
            goto L_0x0057
        L_0x003f:
            if (r2 == r3) goto L_0x00a1
            r1 = 13
            goto L_0x0089
        L_0x0044:
            if (r2 == r3) goto L_0x00a1
            r1 = 14
            goto L_0x0089
        L_0x0049:
            if (r2 == r3) goto L_0x00a1
            r1 = 15
            goto L_0x0057
        L_0x004e:
            if (r2 == r3) goto L_0x00a1
            r1 = 16
            goto L_0x0057
        L_0x0053:
            if (r2 == r3) goto L_0x00a1
            r1 = 17
        L_0x0057:
            boolean r0 = r3 instanceof X.C53368Gms
            if (r0 == 0) goto L_0x009f
            X.Gms r3 = (X.C53368Gms) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x009f
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x009f
            int r1 = r2.A01
            int r0 = r3.A01
            goto L_0x009d
        L_0x006c:
            if (r2 == r3) goto L_0x00a1
            r1 = 18
            goto L_0x0089
        L_0x0071:
            if (r2 == r3) goto L_0x00a1
            r1 = 19
            goto L_0x0089
        L_0x0076:
            if (r2 == r3) goto L_0x00a1
            r1 = 20
            goto L_0x0089
        L_0x007b:
            if (r2 == r3) goto L_0x00a1
            r1 = 21
            goto L_0x0089
        L_0x0080:
            if (r2 == r3) goto L_0x00a1
            r1 = 22
            goto L_0x0089
        L_0x0085:
            if (r2 == r3) goto L_0x00a1
            r1 = 23
        L_0x0089:
            boolean r0 = r3 instanceof X.C53368Gms
            if (r0 == 0) goto L_0x009f
            X.Gms r3 = (X.C53368Gms) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x009f
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x009f
            int r1 = r2.A00
            int r0 = r3.A00
        L_0x009d:
            if (r1 == r0) goto L_0x00a1
        L_0x009f:
            r0 = 0
            return r0
        L_0x00a1:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53368Gms.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A02) {
            case 0:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i = this.A01 * 31;
                i2 = this.A00;
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 15:
            case 16:
            case 17:
                i = this.A00 * 31;
                i2 = this.A01;
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb;
        int i;
        String str;
        switch (this.A02) {
            case 10:
                sb = AnonymousClass7TE.A1A();
                sb.append("Coordinate(row=");
                sb.append(this.A01);
                str = ", index=";
                break;
            case 11:
                sb = AnonymousClass7TE.A1A();
                sb.append("CaptionAudioBleep(startTimeMs=");
                sb.append(this.A01);
                str = AnonymousClass000.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
                break;
            case 17:
                sb = AnonymousClass7TE.A1A();
                sb.append("FilterInfo(filterId=");
                sb.append(this.A00);
                sb.append(AnonymousClass000.A00(2016));
                i = this.A01;
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        i = this.A00;
        return C51975G9x.A0j(sb, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53368Gms(int r4) {
        /*
            r3 = this;
            r3.A02 = r4
            switch(r4) {
                case 6: goto L_0x0020;
                case 13: goto L_0x0017;
                case 15: goto L_0x0012;
                case 19: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 0
            r1 = 0
            r0 = 22
        L_0x0009:
            r3.<init>(r2, r1, r0)
            return
        L_0x000d:
            r2 = 0
            r1 = 0
            r0 = 19
            goto L_0x0009
        L_0x0012:
            r2 = -1
            r1 = -1
            r0 = 15
            goto L_0x0009
        L_0x0017:
            r2 = 2131955633(0x7f130fb1, float:1.9547799E38)
            r1 = 2131955631(0x7f130faf, float:1.9547795E38)
            r0 = 13
            goto L_0x0009
        L_0x0020:
            r2 = -1
            r1 = -1
            r0 = 6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53368Gms.<init>(int):void");
    }
}
