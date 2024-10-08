package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9IV  reason: invalid class name */
public final class AnonymousClass9IV extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public final int A02;

    public static final AnonymousClass9IV A00(C376459Ib r1, C335907dj r2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r1, 1);
        return new AnonymousClass9IV(r1, r2);
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IV) || ((AnonymousClass9IV) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0136, code lost:
        if (A01(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0138, code lost:
        r3 = (X.AnonymousClass9IV) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0142, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0146, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014b, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0153, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c7, code lost:
        if (A01(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c9, code lost:
        r3 = (X.AnonymousClass9IV) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00cf, code lost:
        if (r2.A01 == r3.A01) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00da, code lost:
        if (A01(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00dc, code lost:
        r3 = (X.AnonymousClass9IV) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e6, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ed, code lost:
        if (r2.A01 == r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0102, code lost:
        if (A01(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0104, code lost:
        r3 = (X.AnonymousClass9IV) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x010e, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011e, code lost:
        if (A01(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0120, code lost:
        r3 = (X.AnonymousClass9IV) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0126, code lost:
        if (r2.A00 == r3.A00) goto L_0x0146;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x000a;
                case 2: goto L_0x000f;
                case 3: goto L_0x0014;
                case 4: goto L_0x0019;
                case 5: goto L_0x001e;
                case 6: goto L_0x0023;
                case 7: goto L_0x0028;
                case 8: goto L_0x002d;
                case 9: goto L_0x0033;
                case 10: goto L_0x0039;
                case 11: goto L_0x003f;
                case 12: goto L_0x0045;
                case 13: goto L_0x004b;
                case 14: goto L_0x0051;
                case 15: goto L_0x0057;
                case 16: goto L_0x005c;
                case 17: goto L_0x0062;
                case 18: goto L_0x0068;
                case 19: goto L_0x006e;
                case 20: goto L_0x0073;
                case 21: goto L_0x0079;
                case 22: goto L_0x007f;
                case 23: goto L_0x0084;
                case 24: goto L_0x008a;
                case 25: goto L_0x008f;
                case 26: goto L_0x0095;
                case 27: goto L_0x009b;
                case 28: goto L_0x00a0;
                case 29: goto L_0x00a5;
                case 30: goto L_0x00ab;
                case 31: goto L_0x00bf;
                case 32: goto L_0x00d2;
                case 33: goto L_0x00f0;
                case 34: goto L_0x00f5;
                case 35: goto L_0x0005;
                case 36: goto L_0x00fa;
                case 37: goto L_0x0111;
                case 38: goto L_0x0116;
                case 39: goto L_0x0129;
                case 40: goto L_0x012e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0156
            r0 = 1
            goto L_0x0132
        L_0x000f:
            if (r2 == r3) goto L_0x0156
            r0 = 2
            goto L_0x00fe
        L_0x0014:
            if (r2 == r3) goto L_0x0156
            r0 = 3
            goto L_0x0132
        L_0x0019:
            if (r2 == r3) goto L_0x0156
            r0 = 4
            goto L_0x00fe
        L_0x001e:
            if (r2 == r3) goto L_0x0156
            r0 = 5
            goto L_0x00d6
        L_0x0023:
            if (r2 == r3) goto L_0x0156
            r0 = 6
            goto L_0x0132
        L_0x0028:
            if (r2 == r3) goto L_0x0156
            r0 = 7
            goto L_0x00fe
        L_0x002d:
            if (r2 == r3) goto L_0x0156
            r0 = 8
            goto L_0x0132
        L_0x0033:
            if (r2 == r3) goto L_0x0156
            r0 = 9
            goto L_0x00fe
        L_0x0039:
            if (r2 == r3) goto L_0x0156
            r0 = 10
            goto L_0x00c3
        L_0x003f:
            if (r2 == r3) goto L_0x0156
            r0 = 11
            goto L_0x011a
        L_0x0045:
            if (r2 == r3) goto L_0x0156
            r0 = 12
            goto L_0x00fe
        L_0x004b:
            if (r2 == r3) goto L_0x0156
            r0 = 13
            goto L_0x0132
        L_0x0051:
            if (r2 == r3) goto L_0x0156
            r0 = 14
            goto L_0x00fe
        L_0x0057:
            if (r2 == r3) goto L_0x0156
            r0 = 15
            goto L_0x00d6
        L_0x005c:
            if (r2 == r3) goto L_0x0156
            r0 = 16
            goto L_0x00fe
        L_0x0062:
            if (r2 == r3) goto L_0x0156
            r0 = 17
            goto L_0x0132
        L_0x0068:
            if (r2 == r3) goto L_0x0156
            r0 = 18
            goto L_0x0132
        L_0x006e:
            if (r2 == r3) goto L_0x0156
            r0 = 19
            goto L_0x00c3
        L_0x0073:
            if (r2 == r3) goto L_0x0156
            r0 = 20
            goto L_0x0132
        L_0x0079:
            if (r2 == r3) goto L_0x0156
            r0 = 21
            goto L_0x00fe
        L_0x007f:
            if (r2 == r3) goto L_0x0156
            r0 = 22
            goto L_0x00fe
        L_0x0084:
            if (r2 == r3) goto L_0x0156
            r0 = 23
            goto L_0x0132
        L_0x008a:
            if (r2 == r3) goto L_0x0156
            r0 = 24
            goto L_0x00fe
        L_0x008f:
            if (r2 == r3) goto L_0x0156
            r0 = 25
            goto L_0x011a
        L_0x0095:
            if (r2 == r3) goto L_0x0156
            r0 = 26
            goto L_0x0132
        L_0x009b:
            if (r2 == r3) goto L_0x0156
            r0 = 27
            goto L_0x00fe
        L_0x00a0:
            if (r2 == r3) goto L_0x0156
            r0 = 28
            goto L_0x00fe
        L_0x00a5:
            if (r2 == r3) goto L_0x0156
            r0 = 29
            goto L_0x0132
        L_0x00ab:
            if (r2 == r3) goto L_0x0156
            r0 = 30
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0144
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00e9
            goto L_0x0144
        L_0x00bf:
            if (r2 == r3) goto L_0x0156
            r0 = 31
        L_0x00c3:
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0144
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x014b
            goto L_0x0144
        L_0x00d2:
            if (r2 == r3) goto L_0x0156
            r0 = 32
        L_0x00d6:
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0144
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0144
        L_0x00e9:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0156
            goto L_0x0144
        L_0x00f0:
            if (r2 == r3) goto L_0x0156
            r0 = 33
            goto L_0x00fe
        L_0x00f5:
            if (r2 == r3) goto L_0x0156
            r0 = 34
            goto L_0x0132
        L_0x00fa:
            if (r2 == r3) goto L_0x0156
            r0 = 36
        L_0x00fe:
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0144
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x014b
            goto L_0x0144
        L_0x0111:
            if (r2 == r3) goto L_0x0156
            r0 = 37
            goto L_0x0132
        L_0x0116:
            if (r2 == r3) goto L_0x0156
            r0 = 38
        L_0x011a:
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0144
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0146
            goto L_0x0144
        L_0x0129:
            if (r2 == r3) goto L_0x0156
            r0 = 39
            goto L_0x0132
        L_0x012e:
            if (r2 == r3) goto L_0x0156
            r0 = 40
        L_0x0132:
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0144
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0146
        L_0x0144:
            r0 = 0
            return r0
        L_0x0146:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x014f
        L_0x014b:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x014f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0156
            goto L_0x0144
        L_0x0156:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IV.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r1 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        r3 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        r3 = r1 * 31;
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
        r1 = r1.hashCode() + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        r3 = r1 * 31;
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r3 = r2 * 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        if (r1 != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f6, code lost:
        r3 = r1 * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        return r3 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A02
            switch(r1) {
                case 1: goto L_0x00d9;
                case 2: goto L_0x0021;
                case 3: goto L_0x00e0;
                case 4: goto L_0x0021;
                case 5: goto L_0x00ee;
                case 6: goto L_0x00d3;
                case 7: goto L_0x001a;
                case 8: goto L_0x00e0;
                case 9: goto L_0x0021;
                case 10: goto L_0x00b9;
                case 11: goto L_0x00a3;
                case 12: goto L_0x005e;
                case 13: goto L_0x000a;
                case 14: goto L_0x0021;
                case 15: goto L_0x0092;
                case 16: goto L_0x005e;
                case 17: goto L_0x000a;
                case 18: goto L_0x000a;
                case 19: goto L_0x0075;
                case 20: goto L_0x000a;
                case 21: goto L_0x001a;
                case 22: goto L_0x005e;
                case 23: goto L_0x00d9;
                case 24: goto L_0x0021;
                case 25: goto L_0x00d9;
                case 26: goto L_0x00d9;
                case 27: goto L_0x0021;
                case 28: goto L_0x0021;
                case 29: goto L_0x00d9;
                case 30: goto L_0x004d;
                case 31: goto L_0x001a;
                case 32: goto L_0x00d9;
                case 33: goto L_0x0046;
                case 34: goto L_0x00d9;
                case 35: goto L_0x0005;
                case 36: goto L_0x005e;
                case 37: goto L_0x003c;
                case 38: goto L_0x0029;
                case 39: goto L_0x00e0;
                case 40: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r3 = super.hashCode()
            return r3
        L_0x000a:
            java.lang.Object r1 = r4.A00
            r3 = 0
            if (r1 != 0) goto L_0x0015
            r1 = 0
        L_0x0010:
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            goto L_0x0068
        L_0x0015:
            int r1 = r1.hashCode()
            goto L_0x0010
        L_0x001a:
            java.lang.Object r1 = r4.A01
            if (r1 != 0) goto L_0x0023
            r1 = 0
            goto L_0x00cb
        L_0x0021:
            java.lang.Object r1 = r4.A01
        L_0x0023:
            int r1 = r1.hashCode()
            goto L_0x00cb
        L_0x0029:
            java.lang.Object r3 = r4.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r1 = X.2Yy.A00(r3)
            int r2 = r1.hashCode()
            int r1 = r3.intValue()
            int r2 = r2 + r1
            goto L_0x00e6
        L_0x003c:
            java.lang.Object r1 = r4.A00
            int r1 = r1.hashCode()
            int r3 = r1 * 31
            goto L_0x00e8
        L_0x0046:
            java.lang.Object r1 = r4.A01
            int r1 = r1.hashCode()
            goto L_0x0087
        L_0x004d:
            java.lang.Object r1 = r4.A00
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x005b
            java.lang.String r1 = "NETWORK_REST"
            goto L_0x00b0
        L_0x005b:
            java.lang.String r1 = "LOCAL_CACHE"
            goto L_0x00b0
        L_0x005e:
            java.lang.Object r1 = r4.A01
            r3 = 0
            if (r1 != 0) goto L_0x0070
            r1 = 0
        L_0x0064:
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
        L_0x0068:
            if (r1 == 0) goto L_0x00fe
            int r3 = r1.hashCode()
            goto L_0x00fe
        L_0x0070:
            int r1 = r1.hashCode()
            goto L_0x0064
        L_0x0075:
            java.lang.Object r1 = r4.A01
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            switch(r2) {
                case 1: goto L_0x008c;
                case 2: goto L_0x008f;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r1 = "NONE"
        L_0x0082:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
        L_0x0087:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x00ea
        L_0x008c:
            java.lang.String r1 = "AWAITING_DELTAS"
            goto L_0x0082
        L_0x008f:
            java.lang.String r1 = "UP_TO_DATE"
            goto L_0x0082
        L_0x0092:
            java.lang.Object r1 = r4.A00
            int r1 = r1.hashCode()
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = X.C395079zB.A00(r1)
            goto L_0x00fe
        L_0x00a3:
            java.lang.Object r1 = r4.A00
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x00b6
            java.lang.String r1 = "IDLE"
        L_0x00b0:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            goto L_0x00f6
        L_0x00b6:
            java.lang.String r1 = "IN_PROGRESS"
            goto L_0x00b0
        L_0x00b9:
            java.lang.Object r1 = r4.A01
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x00d0
            java.lang.String r1 = "PREVIOUSLY_USED"
        L_0x00c6:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
        L_0x00cb:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x00fa
        L_0x00d0:
            java.lang.String r1 = "CONTENT_BASED"
            goto L_0x00c6
        L_0x00d3:
            java.lang.Object r1 = r4.A00
            if (r1 != 0) goto L_0x00db
            r1 = 0
            goto L_0x00f6
        L_0x00d9:
            java.lang.Object r1 = r4.A00
        L_0x00db:
            int r1 = r1.hashCode()
            goto L_0x00f6
        L_0x00e0:
            java.lang.Object r1 = r4.A00
            int r2 = r1.hashCode()
        L_0x00e6:
            int r3 = r2 * 31
        L_0x00e8:
            java.lang.Object r1 = r4.A01
        L_0x00ea:
            if (r1 != 0) goto L_0x00fa
            r2 = 0
            goto L_0x00fe
        L_0x00ee:
            java.lang.Object r1 = r4.A00
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
        L_0x00f6:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A01
        L_0x00fa:
            int r2 = r1.hashCode()
        L_0x00fe:
            int r3 = r3 + r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IV.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A02) {
            case 19:
                sb = new StringBuilder();
                sb.append("IrisInboxNavigationStatus(status=");
                Number number = (Number) this.A01;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str2 = "AWAITING_DELTAS";
                            break;
                        case 2:
                            str2 = "UP_TO_DATE";
                            break;
                        default:
                            str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                            break;
                    }
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                str = ", prefetchTimeMs=";
                break;
            case 22:
                sb = new StringBuilder();
                sb.append("MediaDeserializerResultOrException(media=");
                sb.append(this.A01);
                str = C273654mx.A00(98);
                break;
            case 31:
                sb = new StringBuilder();
                sb.append("Metadata(voiceEffect=");
                sb.append(this.A01);
                str = ", soundEffects=";
                break;
            case 35:
                sb = new StringBuilder();
                sb.append("SignalBundle(signalMetadata=");
                sb.append(this.A01);
                str = ", signalData=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9IV() {
        this.A02 = 31;
        0sn r1 = 0sn.A00;
        this.A02 = 31;
        0qQ.A0B(r1, 2);
        this.A01 = null;
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r3.A02 = r0;
        this(r1, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r3.A02 = r0;
        this(r0, r1, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9IV(int r4) {
        /*
            r3 = this;
            r3.A02 = r4
            switch(r4) {
                case 9: goto L_0x003e;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0035;
                case 13: goto L_0x0031;
                case 14: goto L_0x0005;
                case 15: goto L_0x0023;
                case 16: goto L_0x001a;
                case 17: goto L_0x0016;
                case 18: goto L_0x000d;
                case 19: goto L_0x0005;
                case 20: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3.<init>()
            return
        L_0x0009:
            r1 = 0
            r0 = 20
            goto L_0x001d
        L_0x000d:
            r1 = 0
            r0 = 18
            r3.A02 = r0
            r3.<init>((java.util.List) r1, (java.util.List) r1, (int) r0)
            return
        L_0x0016:
            r1 = 0
            r0 = 17
            goto L_0x0038
        L_0x001a:
            r1 = 0
            r0 = 16
        L_0x001d:
            r3.A02 = r0
            r3.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r1)
            return
        L_0x0023:
            java.lang.String r2 = ""
            r0 = 0
            com.instagram.model.direct.messageid.MessageIdentifier r1 = new com.instagram.model.direct.messageid.MessageIdentifier
            r1.<init>(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.<init>((com.instagram.model.direct.messageid.MessageIdentifier) r1, (java.lang.Integer) r0)
            return
        L_0x0031:
            r1 = 0
            r0 = 13
            goto L_0x0038
        L_0x0035:
            r1 = 0
            r0 = 12
        L_0x0038:
            r3.A02 = r0
            r3.<init>((java.lang.Integer) r1, (java.lang.Integer) r1, (int) r0)
            return
        L_0x003e:
            r2 = 9
            r3.A02 = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0sn r0 = X.0sn.A00
            r3.<init>((java.util.List) r1, (java.util.List) r0, (int) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IV.<init>(int):void");
    }

    public AnonymousClass9IV(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public AnonymousClass9IV(AnonymousClass3PG r2, Integer num) {
        this.A02 = 30;
        0qQ.A0B(r2, 2);
        this.A00 = num;
        this.A01 = r2;
    }

    public AnonymousClass9IV(AnonymousClass3WR r2, WeakReference weakReference) {
        this.A02 = 39;
        this.A00 = r2;
        this.A01 = weakReference;
    }

    public AnonymousClass9IV(AnonymousClass3WV r2, C231592rv r3) {
        this.A02 = 25;
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public AnonymousClass9IV(C274594oe r2, AnonymousClass5O4 r3) {
        this.A02 = 23;
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public AnonymousClass9IV(AnonymousClass7GW r2, Integer num) {
        this.A02 = 11;
        this.A00 = num;
        this.A01 = r2;
    }

    public AnonymousClass9IV(AnonymousClass7M2 r2, C332187Tz r3) {
        this.A02 = 14;
        this.A01 = r3;
        this.A00 = r2;
    }

    public AnonymousClass9IV(C351988Bf r2, C351988Bf[] r3) {
        this.A02 = 5;
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public AnonymousClass9IV(C376459Ib r2, C335907dj r3) {
        this.A02 = 2;
        this.A01 = r3;
        this.A00 = r2;
    }

    public AnonymousClass9IV(AnonymousClass9J4 r2, C253513qu r3) {
        this.A02 = 35;
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public AnonymousClass9IV(Intent intent, Integer num) {
        this.A02 = 38;
        this.A00 = num;
        this.A01 = intent;
    }

    public AnonymousClass9IV(Bitmap bitmap, C293505kq r3) {
        this.A02 = 8;
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = bitmap;
    }

    public AnonymousClass9IV(Bundle bundle, C67665Mrv mrv) {
        this.A02 = 33;
        this.A01 = bundle;
        this.A00 = mrv;
    }

    public AnonymousClass9IV(UserSession userSession, QuickPromotionSlot quickPromotionSlot) {
        this.A02 = 32;
        this.A00 = userSession;
        this.A01 = quickPromotionSlot;
    }

    public AnonymousClass9IV(MessageIdentifier messageIdentifier, Integer num) {
        this.A02 = 15;
        0qQ.A0B(messageIdentifier, 1);
        0qQ.A0B(num, 2);
        this.A00 = messageIdentifier;
        this.A01 = num;
    }

    public AnonymousClass9IV(Hashtag hashtag, Integer num) {
        this.A02 = 10;
        this.A01 = num;
        this.A00 = hashtag;
    }

    public AnonymousClass9IV(Integer num) {
        this.A02 = 19;
        this.A01 = num;
        this.A00 = null;
    }

    public AnonymousClass9IV(Integer num, Integer num2, int i) {
        this.A02 = i;
        if (12 - i != 0) {
            this.A00 = num;
            this.A01 = num2;
            return;
        }
        this.A01 = num;
        this.A00 = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IV(Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(num, (Integer) null, 13);
        this.A02 = 13;
    }

    public AnonymousClass9IV(Object obj, WeakReference weakReference) {
        this.A02 = 6;
        this.A00 = obj;
        this.A01 = weakReference;
    }

    public AnonymousClass9IV(WeakReference weakReference, Set set) {
        this.A02 = 3;
        this.A00 = set;
        this.A01 = weakReference;
    }

    public AnonymousClass9IV(List list, List list2, int i) {
        this.A02 = i;
        if (9 - i != 0) {
            this.A00 = list;
            this.A01 = list2;
            return;
        }
        0qQ.A0B(list, 1);
        0qQ.A0B(list2, 2);
        this.A01 = list;
        this.A00 = list2;
    }
}
