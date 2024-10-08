package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GnR  reason: case insensitive filesystem */
public final class C53394GnR extends AnonymousClass0T0 {
    public long A00;
    public Object A01;
    public final int A02;

    public C53394GnR(Bitmap bitmap, long j) {
        this.A02 = 4;
        0qQ.A0B(bitmap, 2);
        this.A00 = j;
        this.A01 = bitmap;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53394GnR) || ((C53394GnR) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (A00(r0, r6) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r6 = (X.C53394GnR) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r5.A00 != r6.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (X.0qQ.A0K(r5.A01, r6.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A00(r0, r6) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r6 = (X.C53394GnR) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (X.0qQ.A0K(r5.A01, r6.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r5.A00 == r6.A00) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0024;
                case 2: goto L_0x0028;
                case 3: goto L_0x002c;
                case 4: goto L_0x0030;
                case 5: goto L_0x0034;
                case 6: goto L_0x0052;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r5 == r6) goto L_0x0073
            r0 = 7
        L_0x0008:
            boolean r0 = A00(r0, r6)
            if (r0 == 0) goto L_0x0022
            X.GnR r6 = (X.C53394GnR) r6
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0073
        L_0x0022:
            r0 = 0
            return r0
        L_0x0024:
            if (r5 == r6) goto L_0x0073
            r0 = 1
            goto L_0x0008
        L_0x0028:
            if (r5 == r6) goto L_0x0073
            r0 = 2
            goto L_0x0008
        L_0x002c:
            if (r5 == r6) goto L_0x0073
            r0 = 3
            goto L_0x0037
        L_0x0030:
            if (r5 == r6) goto L_0x0073
            r0 = 4
            goto L_0x0037
        L_0x0034:
            if (r5 == r6) goto L_0x0073
            r0 = 5
        L_0x0037:
            boolean r0 = A00(r0, r6)
            if (r0 == 0) goto L_0x0022
            X.GnR r6 = (X.C53394GnR) r6
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0073
            goto L_0x0022
        L_0x0052:
            if (r5 == r6) goto L_0x0073
            r0 = 6
            goto L_0x0008
        L_0x0056:
            if (r5 == r6) goto L_0x0073
            r0 = 0
            boolean r0 = A00(r0, r6)
            if (r0 == 0) goto L_0x0022
            X.GnR r6 = (X.C53394GnR) r6
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
        L_0x0073:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53394GnR.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r2 = r0 * 31;
        r0 = X.C51968G9o.A03(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        return r2 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = r0.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x001b;
                case 4: goto L_0x0027;
                case 5: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0016
            r0 = 0
        L_0x000a:
            int r2 = r0 * 31
            long r0 = r3.A00
            int r0 = X.C51968G9o.A03(r0)
        L_0x0012:
            int r2 = r2 + r0
            return r2
        L_0x0014:
            java.lang.Object r0 = r3.A01
        L_0x0016:
            int r0 = r0.hashCode()
            goto L_0x000a
        L_0x001b:
            long r0 = r3.A00
            int r2 = X.C51975G9x.A03(r0)
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x002f
            r0 = 0
            goto L_0x0012
        L_0x0027:
            long r0 = r3.A00
            int r2 = X.C51975G9x.A03(r0)
            java.lang.Object r0 = r3.A01
        L_0x002f:
            int r0 = r0.hashCode()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53394GnR.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A02) {
            case 3:
                sb = AnonymousClass7TE.A1A();
                sb.append("GridItemAnimationOption(duration=");
                sb.append(this.A00);
                str = Pxd.A00(323);
                break;
            case 4:
                sb = AnonymousClass7TE.A1A();
                sb.append("ScreenshotEffectBurnerParam(timestampUs=");
                sb.append(this.A00);
                str = ", image=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        return AnonymousClass7TG.A0n(this.A01, sb);
    }

    public C53394GnR(long j, Object obj, int i) {
        this.A02 = i;
        this.A00 = j;
        this.A01 = obj;
    }

    public C53394GnR(List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, long j) {
        this.A02 = 0;
        ArrayList A1C = AnonymousClass7TE.A1C();
        long A002 = HSV.A00(0.0f, 0.0f);
        this.A02 = 0;
        this.A01 = A1C;
        this.A00 = A002;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53394GnR() {
        this(0, (Object) null, 7);
        this.A02 = 7;
    }
}
