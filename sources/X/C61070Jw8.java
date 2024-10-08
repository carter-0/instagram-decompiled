package X;

import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jw8  reason: case insensitive filesystem */
public final class C61070Jw8 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61070Jw8) || ((C61070Jw8) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bd, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bf, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c7, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c9, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d1, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0114, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0137, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0139, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015d, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0167, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016b, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0198, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019a, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x002d;
                case 2: goto L_0x0063;
                case 3: goto L_0x007a;
                case 4: goto L_0x009f;
                case 5: goto L_0x00bc;
                case 6: goto L_0x00ed;
                case 7: goto L_0x011a;
                case 8: goto L_0x013f;
                case 9: goto L_0x0170;
                case 10: goto L_0x019f;
                case 11: goto L_0x01d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x01fb
            r0 = 12
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x0025:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0114
        L_0x002b:
            r0 = 0
            return r0
        L_0x002d:
            if (r2 == r3) goto L_0x01fb
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0133
        L_0x0048:
            if (r2 == r3) goto L_0x01fb
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0159
        L_0x0063:
            if (r2 == r3) goto L_0x01fb
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x01b9
        L_0x007a:
            if (r2 == r3) goto L_0x01fb
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0194
        L_0x009f:
            if (r2 == r3) goto L_0x01fb
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x016b
            goto L_0x002b
        L_0x00bc:
            if (r2 == r3) goto L_0x01fb
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x01fb
            goto L_0x002b
        L_0x00ed:
            if (r2 == r3) goto L_0x01fb
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0114
            goto L_0x002b
        L_0x0114:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x01cd
        L_0x011a:
            if (r2 == r3) goto L_0x01fb
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x0133:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x01c3
        L_0x013f:
            if (r2 == r3) goto L_0x01fb
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x0159:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x016b
            goto L_0x002b
        L_0x016b:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x01cd
        L_0x0170:
            if (r2 == r3) goto L_0x01fb
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0194:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x01cd
        L_0x019f:
            if (r2 == r3) goto L_0x01fb
            r0 = 10
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x01b9:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x01c3:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x01cd:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01fb
            goto L_0x002b
        L_0x01d5:
            if (r2 == r3) goto L_0x01fb
            r0 = 11
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.Jw8 r3 = (X.C61070Jw8) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0025
        L_0x01fb:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61070Jw8.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b4, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b9, code lost:
        r2 = X.AnonymousClass7TE.A0L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r1 = (r1 + X.AnonymousClass7TG.A0C(r0)) * 31;
        r2 = X.C41845B3m.A00(r3.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0175;
                case 1: goto L_0x0153;
                case 2: goto L_0x0127;
                case 3: goto L_0x010a;
                case 4: goto L_0x018f;
                case 5: goto L_0x00de;
                case 6: goto L_0x00c1;
                case 7: goto L_0x009b;
                case 8: goto L_0x007d;
                case 9: goto L_0x0060;
                case 10: goto L_0x0046;
                case 11: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x002e;
                case 2: goto L_0x0031;
                case 3: goto L_0x0034;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.String r0 = "MEDIA_SOCIAL_CONTEXT"
        L_0x0010:
            int r1 = X.C51968G9o.A0F(r0, r1)
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
        L_0x001f:
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r2 = X.C41845B3m.A00(r0)
        L_0x002c:
            int r1 = r1 + r2
            return r1
        L_0x002e:
            java.lang.String r0 = "CREATOR_VIEWER_INSIGHT"
            goto L_0x0010
        L_0x0031:
            java.lang.String r0 = "RECIPE_SHEET_INSIGHT"
            goto L_0x0010
        L_0x0034:
            java.lang.String r0 = "RECIPE_SHEET_NUX"
            goto L_0x0010
        L_0x0037:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A00
            goto L_0x001f
        L_0x0046:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.hashCode()
            goto L_0x00b4
        L_0x0060:
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            goto L_0x00b9
        L_0x007d:
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x002c
        L_0x009b:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.hashCode()
        L_0x00b4:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
        L_0x00b9:
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x002c
        L_0x00bf:
            r0 = 0
            goto L_0x00b4
        L_0x00c1:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = r0.hashCode()
            goto L_0x002c
        L_0x00de:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A03
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0101;
                case 2: goto L_0x0104;
                case 3: goto L_0x0107;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            java.lang.String r0 = "Uninitialized"
        L_0x00fb:
            int r1 = X.C51966G9m.A04(r0, r1)
            goto L_0x002c
        L_0x0101:
            java.lang.String r0 = "Loading"
            goto L_0x00fb
        L_0x0104:
            java.lang.String r0 = "Loaded"
            goto L_0x00fb
        L_0x0107:
            java.lang.String r0 = "Error"
            goto L_0x00fb
        L_0x010a:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x002c
        L_0x0127:
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x014a
            r1 = 0
        L_0x012e:
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x002c
        L_0x014a:
            r1 = -90105677(0xfffffffffaa118b3, float:-4.1823038E35)
            int r0 = r0.intValue()
            int r1 = r1 + r0
            goto L_0x012e
        L_0x0153:
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x002c
        L_0x0175:
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = r0.hashCode()
            goto L_0x002c
        L_0x018f:
            java.lang.String r0 = r3.A03
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x01ae;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01b4;
                case 4: goto L_0x01b7;
                default: goto L_0x019e;
            }
        L_0x019e:
            java.lang.String r0 = "USER_ENTERED_FULL_PROMPT"
        L_0x01a0:
            int r1 = X.C51971G9r.A0F(r0, r1, r2)
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
        L_0x01ae:
            java.lang.String r0 = "SUGGESTION"
            goto L_0x01a0
        L_0x01b1:
            java.lang.String r0 = "USER_ENTERED_FLASH_PROMPT"
            goto L_0x01a0
        L_0x01b4:
            java.lang.String r0 = "MIMICRY"
            goto L_0x01a0
        L_0x01b7:
            java.lang.String r0 = "CONTEXTUAL_BACKGROUND"
            goto L_0x01a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61070Jw8.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A04) {
            case 8:
                sb = AnonymousClass7TE.A1A();
                sb.append("MediaSyncStateHolder(state=");
                sb.append(this.A02);
                sb.append(AnonymousClass000.A00(2055));
                sb.append(this.A03);
                sb.append(C66579MXk.A00(424));
                sb.append(this.A00);
                sb.append(", mediaSyncState=");
                sb.append(this.A01);
                break;
            case 11:
                sb = AnonymousClass7TE.A1A();
                sb.append("IgLiveUserPaySupportersInfo(supportersInComments=");
                sb.append(this.A01);
                sb.append(", supportersInCommentsV2=");
                sb.append(this.A02);
                sb.append(", newSupporterComments=");
                sb.append(this.A00);
                sb.append(", nextSupportersNextMinId=");
                sb.append(this.A03);
                break;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0p(sb);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61070Jw8(JVM jvm, C234502xy r2, User user, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, (Object) null, (Object) null, (String) null, 7);
        this.A04 = 7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61070Jw8(Boolean bool, Boolean bool2, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, (Object) null, (Object) null, (String) null, 10);
        this.A04 = 10;
    }

    public C61070Jw8(C46275DTe dTe, C46307DUk dUk, Integer num, String str, int i) {
        this.A04 = 12;
        dTe = (i & 2) != 0 ? null : dTe;
        dUk = (i & 4) != 0 ? null : dUk;
        str = (i & 8) != 0 ? null : str;
        this.A04 = 12;
        this.A00 = num;
        this.A01 = dTe;
        this.A02 = dUk;
        this.A03 = str;
    }

    public C61070Jw8(C61079JwH jwH, C59640JRi jRi, String str, C62320sa r7, int i) {
        this.A04 = 3;
        r7 = (i & 4) != 0 ? null : r7;
        jwH = (i & 8) != 0 ? null : jwH;
        this.A04 = 3;
        this.A01 = jRi;
        this.A03 = str;
        this.A02 = r7;
        this.A00 = jwH;
    }

    public C61070Jw8(Integer num, String str, List list, List list2) {
        this.A04 = 5;
        this.A01 = list;
        this.A00 = list2;
        this.A03 = str;
        this.A02 = num;
    }

    public C61070Jw8(MediaSyncState mediaSyncState, N36 n36, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        this.A04 = 8;
        0qQ.A0B(str, 2);
        this.A02 = mediaSyncState;
        this.A03 = str;
        this.A00 = rtcStartCoWatchPlaybackArguments;
        this.A01 = n36;
    }

    public C61070Jw8(C266444Yx r2, C266444Yx r3, ImageUrl imageUrl, String str) {
        this.A04 = 0;
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = imageUrl;
    }

    public C61070Jw8(EVM evm, User user, String str, List list) {
        this.A04 = 6;
        AnonymousClass7TG.A0w(1, list, evm, str);
        this.A02 = list;
        this.A01 = user;
        this.A00 = evm;
        this.A03 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61070Jw8(MediaSyncState mediaSyncState, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str, int i) {
        this((i & 1) != 0 ? null : mediaSyncState, (N36) null, (i & 4) != 0 ? null : rtcStartCoWatchPlaybackArguments, (i & 2) != 0 ? "" : str);
        this.A04 = 8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61070Jw8(Integer num, List list) {
        this(num, "", (List) 0sn.A00, list);
        this.A04 = 5;
    }

    public C61070Jw8(Integer num) {
        this.A04 = 4;
        this.A03 = "";
        this.A02 = num;
        this.A01 = null;
        this.A00 = null;
    }

    public C61070Jw8(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public C61070Jw8() {
        this.A04 = 11;
        this.A04 = 11;
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        this.A04 = 11;
        this.A01 = A1E;
        this.A02 = A1E2;
        this.A00 = null;
        this.A03 = null;
    }
}
