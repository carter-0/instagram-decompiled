package X;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.shopping.model.taggingfeed.SourceType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JwE  reason: case insensitive filesystem */
public final class C61076JwE extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public final int A02;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61076JwE) || ((C61076JwE) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a5, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a7, code lost:
        r3 = (X.C61076JwE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b1, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bd, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bf, code lost:
        r3 = (X.C61076JwE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c9, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cf, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r3 = (X.C61076JwE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f1, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00f3, code lost:
        r3 = (X.C61076JwE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f9, code lost:
        if (r2.A00 == r3.A00) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00fd, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x002b;
                case 2: goto L_0x0030;
                case 3: goto L_0x0034;
                case 4: goto L_0x0038;
                case 5: goto L_0x003c;
                case 6: goto L_0x0040;
                case 7: goto L_0x0044;
                case 8: goto L_0x0048;
                case 9: goto L_0x004d;
                case 10: goto L_0x0053;
                case 11: goto L_0x0058;
                case 12: goto L_0x005e;
                case 13: goto L_0x0063;
                case 14: goto L_0x0078;
                case 15: goto L_0x007d;
                case 16: goto L_0x0082;
                case 17: goto L_0x0087;
                case 18: goto L_0x008d;
                case 19: goto L_0x0092;
                case 20: goto L_0x0098;
                case 21: goto L_0x009d;
                case 22: goto L_0x00b5;
                case 23: goto L_0x00d3;
                case 24: goto L_0x00d9;
                case 25: goto L_0x00df;
                case 26: goto L_0x00e4;
                case 27: goto L_0x00e9;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0103
            r0 = 28
        L_0x0009:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.JwE r3 = (X.C61076JwE) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x001f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0103
        L_0x0025:
            r0 = 0
            return r0
        L_0x0027:
            if (r2 == r3) goto L_0x0103
            r0 = 0
            goto L_0x0009
        L_0x002b:
            if (r2 == r3) goto L_0x0103
            r0 = 1
            goto L_0x00b9
        L_0x0030:
            if (r2 == r3) goto L_0x0103
            r0 = 2
            goto L_0x0009
        L_0x0034:
            if (r2 == r3) goto L_0x0103
            r0 = 3
            goto L_0x0009
        L_0x0038:
            if (r2 == r3) goto L_0x0103
            r0 = 4
            goto L_0x0009
        L_0x003c:
            if (r2 == r3) goto L_0x0103
            r0 = 5
            goto L_0x00a1
        L_0x0040:
            if (r2 == r3) goto L_0x0103
            r0 = 6
            goto L_0x0009
        L_0x0044:
            if (r2 == r3) goto L_0x0103
            r0 = 7
            goto L_0x00a1
        L_0x0048:
            if (r2 == r3) goto L_0x0103
            r0 = 8
            goto L_0x00a1
        L_0x004d:
            if (r2 == r3) goto L_0x0103
            r0 = 9
            goto L_0x00ed
        L_0x0053:
            if (r2 == r3) goto L_0x0103
            r0 = 10
            goto L_0x00a1
        L_0x0058:
            if (r2 == r3) goto L_0x0103
            r0 = 11
            goto L_0x00ed
        L_0x005e:
            if (r2 == r3) goto L_0x0103
            r0 = 12
            goto L_0x00a1
        L_0x0063:
            if (r2 == r3) goto L_0x0103
            r0 = 13
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A01
            X.JwE r3 = (X.C61076JwE) r3
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            return r0
        L_0x0078:
            if (r2 == r3) goto L_0x0103
            r0 = 14
            goto L_0x00a1
        L_0x007d:
            if (r2 == r3) goto L_0x0103
            r0 = 15
            goto L_0x0009
        L_0x0082:
            if (r2 == r3) goto L_0x0103
            r0 = 16
            goto L_0x00a1
        L_0x0087:
            if (r2 == r3) goto L_0x0103
            r0 = 17
            goto L_0x0009
        L_0x008d:
            if (r2 == r3) goto L_0x0103
            r0 = 18
            goto L_0x00b9
        L_0x0092:
            if (r2 == r3) goto L_0x0103
            r0 = 19
            goto L_0x0009
        L_0x0098:
            if (r2 == r3) goto L_0x0103
            r0 = 20
            goto L_0x00b9
        L_0x009d:
            if (r2 == r3) goto L_0x0103
            r0 = 21
        L_0x00a1:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.JwE r3 = (X.C61076JwE) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00fd
            goto L_0x0025
        L_0x00b5:
            if (r2 == r3) goto L_0x0103
            r0 = 22
        L_0x00b9:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.JwE r3 = (X.C61076JwE) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0103
            goto L_0x0025
        L_0x00d3:
            if (r2 == r3) goto L_0x0103
            r0 = 23
            goto L_0x0009
        L_0x00d9:
            if (r2 == r3) goto L_0x0103
            r0 = 24
            goto L_0x0009
        L_0x00df:
            if (r2 == r3) goto L_0x0103
            r0 = 25
            goto L_0x00ed
        L_0x00e4:
            if (r2 == r3) goto L_0x0103
            r0 = 26
            goto L_0x00ed
        L_0x00e9:
            if (r2 == r3) goto L_0x0103
            r0 = 27
        L_0x00ed:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.JwE r3 = (X.C61076JwE) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00fd
            goto L_0x0025
        L_0x00fd:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x001f
        L_0x0103:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61076JwE.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r0 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r0 = X.C51966G9m.A04(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        r2 = r0 * 31;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001c;
                case 2: goto L_0x0013;
                case 3: goto L_0x003e;
                case 4: goto L_0x0005;
                case 5: goto L_0x004d;
                case 6: goto L_0x005c;
                case 7: goto L_0x007d;
                case 8: goto L_0x007d;
                case 9: goto L_0x004d;
                case 10: goto L_0x007d;
                case 11: goto L_0x00a2;
                case 12: goto L_0x007d;
                case 13: goto L_0x00fa;
                case 14: goto L_0x004d;
                case 15: goto L_0x0084;
                case 16: goto L_0x007d;
                case 17: goto L_0x0005;
                case 18: goto L_0x008d;
                case 19: goto L_0x00d7;
                case 20: goto L_0x00e4;
                case 21: goto L_0x007d;
                case 22: goto L_0x00f0;
                case 23: goto L_0x0005;
                case 24: goto L_0x00ce;
                case 25: goto L_0x006b;
                case 26: goto L_0x007d;
                case 27: goto L_0x0097;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
        L_0x000d:
            int r1 = r0.hashCode()
        L_0x0011:
            int r1 = r1 + r2
            return r1
        L_0x0013:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            goto L_0x000d
        L_0x001c:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0032;
                case 2: goto L_0x0035;
                case 3: goto L_0x0038;
                case 4: goto L_0x003b;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.String r0 = "FEATURE"
        L_0x002d:
            int r1 = X.C51966G9m.A04(r0, r1)
            goto L_0x0011
        L_0x0032:
            java.lang.String r0 = "LOCALITY"
            goto L_0x002d
        L_0x0035:
            java.lang.String r0 = "SUB_ADMIN"
            goto L_0x002d
        L_0x0038:
            java.lang.String r0 = "ADMIN"
            goto L_0x002d
        L_0x003b:
            java.lang.String r0 = "COUNTRY"
            goto L_0x002d
        L_0x003e:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0011
        L_0x004d:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
            int r2 = X.C41845B3m.A00(r0)
            goto L_0x0011
        L_0x005c:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0011
        L_0x006b:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0077;
                case 2: goto L_0x007a;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r0 = "OFFSITE_LINK"
            goto L_0x00ad
        L_0x0077:
            java.lang.String r0 = "SHARE_TO_STORY"
            goto L_0x00ad
        L_0x007a:
            java.lang.String r0 = "NONE"
            goto L_0x00ad
        L_0x007d:
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            goto L_0x00b1
        L_0x0084:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            goto L_0x000d
        L_0x008d:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            goto L_0x000d
        L_0x0097:
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x00b5
            goto L_0x00e1
        L_0x00a2:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00be;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00cb;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            java.lang.String r0 = "LIKED_POSTS"
        L_0x00ad:
            int r0 = X.C51966G9m.A04(r0, r1)
        L_0x00b1:
            int r2 = r0 * 31
            java.lang.String r0 = r3.A01
        L_0x00b5:
            int r1 = r0.hashCode()
            goto L_0x0011
        L_0x00bb:
            java.lang.String r0 = "SAVED_POSTS"
            goto L_0x00ad
        L_0x00be:
            java.lang.String r0 = "SUGGESTED_POSTS"
            goto L_0x00ad
        L_0x00c1:
            java.lang.String r0 = "IGTV"
            goto L_0x00ad
        L_0x00c4:
            r0 = 560(0x230, float:7.85E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x00ad
        L_0x00cb:
            java.lang.String r0 = "REELS"
            goto L_0x00ad
        L_0x00ce:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            goto L_0x00df
        L_0x00d7:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
        L_0x00df:
            if (r0 != 0) goto L_0x000d
        L_0x00e1:
            r1 = 0
            goto L_0x0011
        L_0x00e4:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
            goto L_0x000d
        L_0x00f0:
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            goto L_0x000d
        L_0x00fa:
            java.lang.String r0 = r3.A01
            int r1 = r0.hashCode()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61076JwE.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A02) {
            case 5:
                sb = AnonymousClass7TE.A1A();
                sb.append("BloksDataModel(bloksDataAdapter=");
                sb.append(this.A00);
                str = Pxd.A00(26);
                break;
            case 10:
                sb = AnonymousClass7TE.A1A();
                sb.append("RtcCallRemoteParticipant(participant=");
                sb.append(this.A00);
                str = ", rendererId=";
                break;
            case 21:
                sb = AnonymousClass7TE.A1A();
                sb.append("SurfaceRegistration(surfaceToken=");
                sb.append(this.A00);
                sb.append("\n, rankingSessionId='");
                sb.append(this.A01);
                sb.append("\n')");
                break;
            case 26:
                sb = AnonymousClass7TE.A1A();
                sb.append("FollowListEarlyFetcherData(type=");
                sb.append(this.A00);
                str = ", profileId=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C61076JwE(L2Q l2q, String str) {
        this.A02 = 13;
        this.A01 = str;
        this.A00 = l2q;
    }

    public C61076JwE(MotionEvent motionEvent, String str) {
        this.A02 = 28;
        this.A01 = str;
        this.A00 = motionEvent;
    }

    public C61076JwE(C387339m3 r2, String str) {
        this.A02 = 7;
        this.A00 = r2;
        this.A01 = str;
    }

    public C61076JwE(String str, View.OnClickListener onClickListener) {
        this.A02 = 0;
        this.A01 = str;
        this.A00 = onClickListener;
    }

    public C61076JwE(AnonymousClass1PB r2, String str) {
        this.A02 = 21;
        this.A00 = r2;
        this.A01 = str;
    }

    public C61076JwE(MoreInfoType moreInfoType, String str) {
        this.A02 = 27;
        this.A00 = moreInfoType;
        this.A01 = str;
    }

    public C61076JwE(C46443Df5 df5, String str) {
        this.A02 = 26;
        AnonymousClass7TG.A1O(df5, str);
        this.A00 = df5;
        this.A01 = str;
    }

    public C61076JwE(Bitmap bitmap, String str) {
        this.A02 = 2;
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = bitmap;
    }

    public C61076JwE(C317846nw r2, String str) {
        this.A02 = 22;
        AnonymousClass7TG.A1O(str, r2);
        this.A01 = str;
        this.A00 = r2;
    }

    public C61076JwE(SourceType sourceType, String str) {
        this.A02 = 18;
        AnonymousClass7TG.A1O(str, sourceType);
        this.A01 = str;
        this.A00 = sourceType;
    }

    public C61076JwE(List list, String str, int i) {
        this.A02 = 12;
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
    }

    public C61076JwE(N9E n9e, String str) {
        this.A02 = 10;
        0qQ.A0B(str, 2);
        this.A00 = n9e;
        this.A01 = str;
    }

    public C61076JwE(String str, Bitmap bitmap) {
        this.A02 = 8;
        0qQ.A0B(str, 2);
        this.A00 = bitmap;
        this.A01 = str;
    }

    public C61076JwE(String str, Integer num, int i) {
        this.A02 = i;
        if (1 - i == 0) {
            0qQ.A0B(num, 2);
        }
        this.A01 = str;
        this.A00 = num;
    }

    public C61076JwE(List list, int i, String str) {
        this.A02 = i;
        switch (i) {
            case 4:
            case 17:
            case 23:
                AnonymousClass7TG.A1O(str, list);
                break;
        }
        this.A01 = str;
        this.A00 = list;
    }

    public C61076JwE(String str, int i, Integer num) {
        this.A02 = i;
        AnonymousClass7TG.A1O(num, str);
        this.A00 = num;
        this.A01 = str;
    }

    public C61076JwE() {
        this.A02 = 20;
        C16552Uwz uwz = C16552Uwz.UNKNOWN;
        this.A02 = 20;
        this.A01 = null;
        this.A00 = uwz;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this("", (Integer) null, 24);
        this.A02 = 24;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(Integer num) {
        this("", 11, num);
        this.A02 = 11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(R9S r9s) {
        this((String) null, (Object) r9s, 5);
        this.A02 = 5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(C48117EWj eWj) {
        this((String) null, (Object) eWj, 9);
        this.A02 = 9;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(Object obj) {
        this((String) null, obj, 14);
        this.A02 = 14;
    }

    public C61076JwE(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(MoreInfoType moreInfoType) {
        this(moreInfoType, (String) null);
        this.A02 = 27;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61076JwE(int i) {
        this((Integer) null, (String) null, (DefaultConstructorMarker) null, 3, 24);
        this.A02 = i;
        switch (i) {
            case 16:
                this.A02 = 16;
                Object obj = new Object();
                this.A02 = 16;
                this.A00 = obj;
                this.A01 = "";
                return;
            case 17:
                this.A02 = 17;
                this((List) 0sn.A00, 17, "");
                return;
            case 19:
                this.A02 = 19;
                this.A02 = 19;
                this.A01 = "";
                this.A00 = null;
                return;
            case 20:
                this();
                return;
            default:
                return;
        }
    }
}
