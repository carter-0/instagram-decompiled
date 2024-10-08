package X;

import com.facebook.fbwebrtc.multiway.RtcMessageBody;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JwL  reason: case insensitive filesystem */
public final class C61083JwL extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public final int A02;

    public static C61083JwL A01(String str) {
        return new C61083JwL((MR0) new C61238JzW(str));
    }

    public static KY2 A02(int i) {
        return new KY2(new C61083JwL((MR0) new C61237JzV(i)));
    }

    public static boolean A04(int i, Object obj) {
        if (!(obj instanceof C61083JwL) || ((C61083JwL) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a6, code lost:
        if (A04(r0, r5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a8, code lost:
        r5 = (X.C61083JwL) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (A04(r0, r5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if (X.0qQ.A0K(r4.A00, r5.A00) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b6, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c3, code lost:
        if (A04(r0, r5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c5, code lost:
        r5 = (X.C61083JwL) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cf, code lost:
        if (X.0qQ.A0K(r4.A01, r5.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d1, code lost:
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d5, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r5 = (X.C61083JwL) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e1, code lost:
        if (A04(r0, r5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e3, code lost:
        r5 = (X.C61083JwL) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e9, code lost:
        if (r4.A01 == r5.A01) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (X.0qQ.A0K(r4.A00, r5.A00) != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0109, code lost:
        if (A04(r0, r5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010b, code lost:
        r5 = (X.C61083JwL) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0115, code lost:
        if (X.0qQ.A0K(r4.A01, r5.A01) != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0119, code lost:
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011e, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0126, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0022;
                case 2: goto L_0x0027;
                case 3: goto L_0x002b;
                case 4: goto L_0x002f;
                case 5: goto L_0x0034;
                case 6: goto L_0x0038;
                case 7: goto L_0x003c;
                case 8: goto L_0x006c;
                case 9: goto L_0x0071;
                case 10: goto L_0x0077;
                case 11: goto L_0x007c;
                case 12: goto L_0x0081;
                case 13: goto L_0x00bb;
                case 14: goto L_0x0086;
                case 15: goto L_0x0099;
                case 16: goto L_0x009e;
                case 17: goto L_0x00d9;
                case 18: goto L_0x00ed;
                case 19: goto L_0x0101;
                case 20: goto L_0x012a;
                case 21: goto L_0x0130;
                case 22: goto L_0x0136;
                case 23: goto L_0x013c;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r4 == r5) goto L_0x0142
            r0 = 24
        L_0x0009:
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x011e
        L_0x001b:
            r2 = 0
            return r2
        L_0x001d:
            if (r4 == r5) goto L_0x0142
            r0 = 0
            goto L_0x0105
        L_0x0022:
            if (r4 == r5) goto L_0x0142
            r0 = 1
            goto L_0x00bf
        L_0x0027:
            if (r4 == r5) goto L_0x0142
            r0 = 2
            goto L_0x00a2
        L_0x002b:
            if (r4 == r5) goto L_0x0142
            r0 = 3
            goto L_0x0009
        L_0x002f:
            if (r4 == r5) goto L_0x0142
            r0 = 4
            goto L_0x0105
        L_0x0034:
            if (r4 == r5) goto L_0x0142
            r0 = 5
            goto L_0x0009
        L_0x0038:
            if (r4 == r5) goto L_0x0142
            r0 = 6
            goto L_0x0009
        L_0x003c:
            r0 = 7
            boolean r0 = A04(r0, r5)
            r3 = 0
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            r2 = 1
            if (r5 == 0) goto L_0x001b
            java.lang.Object r0 = r4.A00
            X.4gL r0 = (X.C270194gL) r0
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = r0.getId()
        L_0x0053:
            java.lang.Object r0 = r5.A00
            X.4gL r0 = (X.C270194gL) r0
            if (r0 == 0) goto L_0x005d
            java.lang.String r3 = r0.getId()
        L_0x005d:
            boolean r0 = X.0qQ.A0K(r1, r3)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            if (r1 != r0) goto L_0x001b
            return r2
        L_0x006a:
            r1 = r3
            goto L_0x0053
        L_0x006c:
            if (r4 == r5) goto L_0x0142
            r0 = 8
            goto L_0x00dd
        L_0x0071:
            if (r4 == r5) goto L_0x0142
            r0 = 9
            goto L_0x0105
        L_0x0077:
            if (r4 == r5) goto L_0x0142
            r0 = 10
            goto L_0x00dd
        L_0x007c:
            if (r4 == r5) goto L_0x0142
            r0 = 11
            goto L_0x0009
        L_0x0081:
            if (r4 == r5) goto L_0x0142
            r0 = 12
            goto L_0x0009
        L_0x0086:
            if (r4 == r5) goto L_0x0142
            r0 = 14
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r5.A00
            if (r1 == r0) goto L_0x00b6
            goto L_0x001b
        L_0x0099:
            if (r4 == r5) goto L_0x0142
            r0 = 15
            goto L_0x00dd
        L_0x009e:
            if (r4 == r5) goto L_0x0142
            r0 = 16
        L_0x00a2:
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00b6
            goto L_0x001b
        L_0x00b6:
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            goto L_0x00d5
        L_0x00bb:
            if (r4 == r5) goto L_0x0142
            r0 = 13
        L_0x00bf:
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r5.A00
        L_0x00d5:
            if (r1 == r0) goto L_0x0142
            goto L_0x001b
        L_0x00d9:
            if (r4 == r5) goto L_0x0142
            r0 = 17
        L_0x00dd:
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            if (r1 == r0) goto L_0x0119
            goto L_0x001b
        L_0x00ed:
            if (r4 == r5) goto L_0x0142
            r0 = 18
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r5.A00
            if (r1 == r0) goto L_0x011e
            goto L_0x001b
        L_0x0101:
            if (r4 == r5) goto L_0x0142
            r0 = 19
        L_0x0105:
            boolean r0 = A04(r0, r5)
            if (r0 == 0) goto L_0x001b
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0119
            goto L_0x001b
        L_0x0119:
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r5.A00
            goto L_0x0122
        L_0x011e:
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
        L_0x0122:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0142
            goto L_0x001b
        L_0x012a:
            if (r4 == r5) goto L_0x0142
            r0 = 20
            goto L_0x0009
        L_0x0130:
            if (r4 == r5) goto L_0x0142
            r0 = 21
            goto L_0x0009
        L_0x0136:
            if (r4 == r5) goto L_0x0142
            r0 = 22
            goto L_0x0009
        L_0x013c:
            if (r4 == r5) goto L_0x0142
            r0 = 23
            goto L_0x0009
        L_0x0142:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61083JwL.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3 = r1 * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        r3 = r1 * 31;
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0125, code lost:
        r1 = X.C51966G9m.A04(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        return r3 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A02
            switch(r1) {
                case 0: goto L_0x0134;
                case 1: goto L_0x0112;
                case 2: goto L_0x00f7;
                case 3: goto L_0x0015;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00e4;
                case 6: goto L_0x00e4;
                case 7: goto L_0x013e;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00b7;
                case 10: goto L_0x00ad;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0098;
                case 14: goto L_0x007f;
                case 15: goto L_0x005e;
                case 16: goto L_0x0057;
                case 17: goto L_0x003c;
                case 18: goto L_0x0027;
                case 19: goto L_0x00eb;
                case 20: goto L_0x001e;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x00e4;
                case 24: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A00
        L_0x0007:
            int r1 = r1.hashCode()
        L_0x000b:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A01
        L_0x000f:
            int r1 = r1.hashCode()
        L_0x0013:
            int r3 = r3 + r1
            return r3
        L_0x0015:
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            goto L_0x004d
        L_0x001e:
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            goto L_0x000f
        L_0x0027:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x0039
            java.lang.String r1 = "ADD"
        L_0x0032:
            int r3 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A01
            goto L_0x000f
        L_0x0039:
            java.lang.String r1 = "REMOVE"
            goto L_0x0032
        L_0x003c:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0051;
                case 2: goto L_0x0054;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r1 = "SUCCESS"
        L_0x0047:
            int r3 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A00
        L_0x004d:
            if (r1 != 0) goto L_0x000f
            r1 = 0
            goto L_0x0013
        L_0x0051:
            java.lang.String r1 = "DOWNLOADING"
            goto L_0x0047
        L_0x0054:
            java.lang.String r1 = "FAIL"
            goto L_0x0047
        L_0x0057:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            goto L_0x000b
        L_0x005e:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0073;
                case 3: goto L_0x0076;
                case 4: goto L_0x0079;
                case 5: goto L_0x007c;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.String r1 = "LOADING"
        L_0x0069:
            int r3 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A00
            goto L_0x000f
        L_0x0070:
            java.lang.String r1 = "COMMENTING"
            goto L_0x0069
        L_0x0073:
            java.lang.String r1 = "STORY_REPLY"
            goto L_0x0069
        L_0x0076:
            java.lang.String r1 = "STORY_CREATION"
            goto L_0x0069
        L_0x0079:
            java.lang.String r1 = "MEDIA_CREATION"
            goto L_0x0069
        L_0x007c:
            java.lang.String r1 = "STORY_REPLY_TAP"
            goto L_0x0069
        L_0x007f:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0092;
                case 2: goto L_0x0095;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.String r1 = "NAVIGATE_TO_COMMUNITY_GUIDELINES"
        L_0x008a:
            int r3 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A01
            goto L_0x000f
        L_0x0092:
            java.lang.String r1 = "DISMISS"
            goto L_0x008a
        L_0x0095:
            java.lang.String r1 = "NONE"
            goto L_0x008a
        L_0x0098:
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00aa
            java.lang.String r1 = "WAVE"
            goto L_0x0125
        L_0x00aa:
            java.lang.String r1 = "WAVE_BACK"
            goto L_0x0125
        L_0x00ad:
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x000f
        L_0x00b7:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r1 = r1 * 31
            java.lang.Object r2 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r2)
            goto L_0x0013
        L_0x00c7:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00da;
                case 3: goto L_0x00e1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.String r1 = "Memory"
        L_0x00d2:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x00f1
        L_0x00d7:
            java.lang.String r1 = "Disk"
            goto L_0x00d2
        L_0x00da:
            r1 = 2382(0x94e, float:3.338E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x00d2
        L_0x00e1:
            java.lang.String r1 = "FromPrefetch"
            goto L_0x00d2
        L_0x00e4:
            java.lang.Object r1 = r4.A00
            if (r1 != 0) goto L_0x0007
            r1 = 0
            goto L_0x000b
        L_0x00eb:
            java.lang.Object r1 = r4.A01
            int r1 = r1.hashCode()
        L_0x00f1:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x000f
        L_0x00f7:
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0109;
                case 2: goto L_0x010c;
                case 3: goto L_0x010f;
                default: goto L_0x0106;
            }
        L_0x0106:
            java.lang.String r1 = "Initial"
            goto L_0x0125
        L_0x0109:
            java.lang.String r1 = "Loading"
            goto L_0x0125
        L_0x010c:
            java.lang.String r1 = "Failed"
            goto L_0x0125
        L_0x010f:
            java.lang.String r1 = "Success"
            goto L_0x0125
        L_0x0112:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x012b;
                case 2: goto L_0x012e;
                case 3: goto L_0x0131;
                default: goto L_0x0123;
            }
        L_0x0123:
            java.lang.String r1 = "INITIAL"
        L_0x0125:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x0013
        L_0x012b:
            java.lang.String r1 = "LOADING"
            goto L_0x0125
        L_0x012e:
            java.lang.String r1 = "SUCCESS"
            goto L_0x0125
        L_0x0131:
            java.lang.String r1 = "ERROR"
            goto L_0x0125
        L_0x0134:
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x000f
        L_0x013e:
            java.lang.Object r1 = r4.A00
            X.4gL r1 = (X.C270194gL) r1
            if (r1 == 0) goto L_0x0153
            java.lang.String r2 = r1.getId()
        L_0x0148:
            java.lang.Object r1 = r4.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            int r3 = java.util.Arrays.hashCode(r1)
            return r3
        L_0x0153:
            r2 = 0
            goto L_0x0148
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61083JwL.hashCode():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r1.append(r0);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        r1.append(r0);
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        return X.AnonymousClass7TG.A0n(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 5: goto L_0x0058;
                case 9: goto L_0x0042;
                case 12: goto L_0x0031;
                case 17: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "DownloadState(status="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002e
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x002b;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r0 = "SUCCESS"
        L_0x0022:
            r1.append(r0)
            java.lang.String r0 = ", file="
            goto L_0x0052
        L_0x0028:
            java.lang.String r0 = "DOWNLOADING"
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = "FAIL"
            goto L_0x0022
        L_0x002e:
            java.lang.String r0 = "null"
            goto L_0x0022
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Data(fullWidthProductTileHeaderViewModel="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", productThumbnails="
            goto L_0x0068
        L_0x0042:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "CommerceItem(product="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", collection="
        L_0x0052:
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            goto L_0x006d
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "NoticeEligibilityServerResult(noticeEligibility="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", noticeEligibilityMap="
        L_0x0068:
            r1.append(r0)
            java.lang.Object r0 = r2.A01
        L_0x006d:
            java.lang.String r0 = X.AnonymousClass7TG.A0n(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61083JwL.toString():java.lang.String");
    }

    public static final C61083JwL A00(C53393GnQ gnQ, Integer num) {
        AnonymousClass7TG.A1N(gnQ, num);
        return new C61083JwL(gnQ, num);
    }

    public static C61245Jzd A03() {
        return new C61245Jzd(new C61083JwL((MR0) new C61237JzV(2131965492)), "settings_failed_to_load");
    }

    public C61083JwL(1Xj r2, Integer num) {
        this.A02 = 15;
        0qQ.A0B(r2, 2);
        this.A01 = num;
        this.A00 = r2;
    }

    public C61083JwL(C274544oX r2, AnonymousClass62P r3) {
        this.A02 = 24;
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    public C61083JwL(C53393GnQ gnQ, Integer num) {
        this.A02 = 2;
        0qQ.A0B(gnQ, 1);
        this.A00 = gnQ;
        this.A01 = num;
    }

    public C61083JwL(WSP wsp, List list) {
        this.A02 = 12;
        0qQ.A0B(list, 2);
        this.A00 = wsp;
        this.A01 = list;
    }

    public C61083JwL(C61069Jw7 jw7, List list) {
        this.A02 = 6;
        0qQ.A0B(list, 2);
        this.A00 = jw7;
        this.A01 = list;
    }

    public C61083JwL(1Xj r2, AnonymousClass3W1 r3) {
        this.A02 = 21;
        this.A00 = r2;
        this.A01 = r3;
    }

    public C61083JwL(C266444Yx r2, C62320sa r3) {
        this.A02 = 23;
        this.A00 = r2;
        this.A01 = r3;
    }

    public C61083JwL(C267324bN r2, C52058GDe gDe) {
        this.A02 = 20;
        this.A00 = r2;
        this.A01 = gDe;
    }

    public C61083JwL(User user, C69328NjT njT) {
        this.A02 = 16;
        this.A00 = user;
        this.A01 = njT;
    }

    public C61083JwL(C267324bN r2, Integer num) {
        this.A02 = 18;
        this.A00 = num;
        this.A01 = r2;
    }

    public C61083JwL(C335737dS r2, Integer num) {
        this.A02 = 14;
        this.A00 = num;
        this.A01 = r2;
    }

    public C61083JwL(User user, Integer num) {
        this.A02 = 13;
        this.A01 = user;
        this.A00 = num;
    }

    public C61083JwL(0sP r2, UserSession userSession) {
        this.A02 = 19;
        this.A01 = userSession;
        this.A00 = r2;
    }

    public C61083JwL(File file, Integer num) {
        this.A02 = 17;
        this.A01 = num;
        this.A00 = file;
    }

    public C61083JwL(C61083JwL jwL, L2R l2r) {
        this.A02 = 4;
        AnonymousClass7TG.A1O(jwL, l2r);
        this.A01 = jwL;
        this.A00 = l2r;
    }

    public C61083JwL(CGL cgl, Integer num) {
        this.A02 = 8;
        AnonymousClass7TG.A1O(num, cgl);
        this.A01 = num;
        this.A00 = cgl;
    }

    public C61083JwL(RtcMessageBody rtcMessageBody, RtcMessageHeader rtcMessageHeader) {
        this.A02 = 0;
        AnonymousClass7TG.A1O(rtcMessageHeader, rtcMessageBody);
        this.A01 = rtcMessageHeader;
        this.A00 = rtcMessageBody;
    }

    public C61083JwL(C53314Gm0 gm0, Integer num) {
        this.A02 = 1;
        this.A01 = gm0;
        this.A00 = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(C53314Gm0 gm0, Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((C53314Gm0) null, AnonymousClass05K.A00);
        this.A02 = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(C62320sa r2, int i) {
        this((C266444Yx) JTP.A0Q(i), r2);
        this.A02 = 23;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(String str, C62320sa r3) {
        this((C266444Yx) new C52255GKw(str), r3);
        this.A02 = 23;
        0qQ.A0B(str, 1);
    }

    public C61083JwL() {
        this.A02 = 10;
        C16574UxR uxR = C16574UxR.UNKNOWN;
        C61076JwE jwE = new C61076JwE();
        this.A02 = 10;
        this.A01 = uxR;
        this.A00 = jwE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(MR0 mr0) {
        this(3, mr0, (Object) null);
        this.A02 = 3;
    }

    public C61083JwL(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(C53393GnQ gnQ) {
        this(gnQ, AnonymousClass05K.A00);
        this.A02 = 2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(Integer num) {
        this((File) null, num);
        this.A02 = 17;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61083JwL(int i) {
        this();
        this.A02 = i;
        switch (i) {
            case 7:
                this.A02 = 7;
                C62559Khp khp = C62559Khp.UNKNOWN;
                this.A02 = 7;
                this.A00 = null;
                this.A01 = khp;
                return;
            case 9:
                this.A02 = 9;
                this(9, (Object) null, (Object) null);
                return;
            default:
                return;
        }
    }
}
