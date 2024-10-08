package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JwA  reason: case insensitive filesystem */
public final class C61072JwA extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61072JwA) || ((C61072JwA) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0063, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0065, code lost:
        r3 = (X.C61072JwA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0071, code lost:
        if (r2.A02 == r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0086, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0088, code lost:
        r3 = (X.C61072JwA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008e, code lost:
        if (r2.A02 == r3.A02) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009e, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
        r3 = (X.C61072JwA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00aa, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b1, code lost:
        if (r2.A01 == r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00bc, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00be, code lost:
        r3 = (X.C61072JwA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c4, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ce, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0005;
                case 2: goto L_0x000f;
                case 3: goto L_0x0013;
                case 4: goto L_0x0018;
                case 5: goto L_0x001d;
                case 6: goto L_0x0005;
                case 7: goto L_0x0022;
                case 8: goto L_0x0027;
                case 9: goto L_0x002d;
                case 10: goto L_0x0033;
                case 11: goto L_0x0038;
                case 12: goto L_0x003d;
                case 13: goto L_0x0042;
                case 14: goto L_0x0047;
                case 15: goto L_0x004c;
                case 16: goto L_0x0051;
                case 17: goto L_0x0056;
                case 18: goto L_0x005b;
                case 19: goto L_0x0074;
                case 20: goto L_0x0079;
                case 21: goto L_0x007e;
                case 22: goto L_0x0091;
                case 23: goto L_0x0096;
                case 24: goto L_0x00b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x00d2
            r0 = 0
            goto L_0x00b8
        L_0x000f:
            if (r2 == r3) goto L_0x00d2
            r0 = 2
            goto L_0x005f
        L_0x0013:
            if (r2 == r3) goto L_0x00d2
            r0 = 3
            goto L_0x009a
        L_0x0018:
            if (r2 == r3) goto L_0x00d2
            r0 = 4
            goto L_0x00b8
        L_0x001d:
            if (r2 == r3) goto L_0x00d2
            r0 = 5
            goto L_0x00b8
        L_0x0022:
            if (r2 == r3) goto L_0x00d2
            r0 = 7
            goto L_0x00b8
        L_0x0027:
            if (r2 == r3) goto L_0x00d2
            r0 = 8
            goto L_0x00b8
        L_0x002d:
            if (r2 == r3) goto L_0x00d2
            r0 = 9
            goto L_0x00b8
        L_0x0033:
            if (r2 == r3) goto L_0x00d2
            r0 = 10
            goto L_0x009a
        L_0x0038:
            if (r2 == r3) goto L_0x00d2
            r0 = 11
            goto L_0x00b8
        L_0x003d:
            if (r2 == r3) goto L_0x00d2
            r0 = 12
            goto L_0x009a
        L_0x0042:
            if (r2 == r3) goto L_0x00d2
            r0 = 13
            goto L_0x0082
        L_0x0047:
            if (r2 == r3) goto L_0x00d2
            r0 = 14
            goto L_0x00b8
        L_0x004c:
            if (r2 == r3) goto L_0x00d2
            r0 = 15
            goto L_0x00b8
        L_0x0051:
            if (r2 == r3) goto L_0x00d2
            r0 = 16
            goto L_0x00b8
        L_0x0056:
            if (r2 == r3) goto L_0x00d2
            r0 = 17
            goto L_0x009a
        L_0x005b:
            if (r2 == r3) goto L_0x00d2
            r0 = 18
        L_0x005f:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00d0
            X.JwA r3 = (X.C61072JwA) r3
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x00d0
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x00d2
            goto L_0x00d0
        L_0x0074:
            if (r2 == r3) goto L_0x00d2
            r0 = 19
            goto L_0x00b8
        L_0x0079:
            if (r2 == r3) goto L_0x00d2
            r0 = 20
            goto L_0x0082
        L_0x007e:
            if (r2 == r3) goto L_0x00d2
            r0 = 21
        L_0x0082:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00d0
            X.JwA r3 = (X.C61072JwA) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x00ad
            goto L_0x00d0
        L_0x0091:
            if (r2 == r3) goto L_0x00d2
            r0 = 22
            goto L_0x009a
        L_0x0096:
            if (r2 == r3) goto L_0x00d2
            r0 = 23
        L_0x009a:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00d0
            X.JwA r3 = (X.C61072JwA) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ad
            goto L_0x00d0
        L_0x00ad:
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 == r0) goto L_0x00d2
            goto L_0x00d0
        L_0x00b4:
            if (r2 == r3) goto L_0x00d2
            r0 = 24
        L_0x00b8:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00d0
            X.JwA r3 = (X.C61072JwA) r3
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x00d0
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d2
        L_0x00d0:
            r0 = 0
            return r0
        L_0x00d2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61072JwA.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
                i = this.A01 * 31;
                i2 = this.A02.hashCode();
                break;
            case 2:
            case 7:
            case 16:
            case 19:
            case 24:
                i = this.A01 * 31;
                i2 = AnonymousClass7TG.A0C(this.A02);
                break;
            case 3:
                i = AnonymousClass7TG.A0C(this.A02) * 31;
                break;
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 17:
            case 22:
            case 23:
                i = AnonymousClass7TE.A0K(this.A02);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = this.A01 * 31;
                int A0M = AnonymousClass7TE.A0M(this.A02);
                if (1 != A0M) {
                    str = "VISIBLE";
                } else {
                    str = "GONE";
                }
                i2 = C51966G9m.A04(str, A0M);
                break;
            case 20:
                int A0M2 = AnonymousClass7TE.A0M(this.A02);
                switch (A0M2) {
                    case 1:
                        str2 = "CONFIRMED";
                        break;
                    case 2:
                        str2 = "ERROR";
                        break;
                    default:
                        str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                }
                i = C51968G9o.A0F(str2, A0M2);
                break;
            case 21:
                int A0M3 = AnonymousClass7TE.A0M(this.A02);
                switch (A0M3) {
                    case 1:
                        str3 = "CONFIRMED";
                        break;
                    case 2:
                        str3 = "ERROR";
                        break;
                    default:
                        str3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                }
                i = C51968G9o.A0F(str3, A0M3);
                break;
            default:
                return super.hashCode();
        }
        i2 = this.A01;
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 2:
                sb = AnonymousClass7TE.A1A();
                sb.append("VersionResult(version=");
                sb.append(this.A01);
                str = ", reason=";
                break;
            case 3:
                JSONObject A11 = DbS.A11();
                try {
                    A11.put("duration_ms", this.A02);
                    A11.put("media_type", this.A01);
                } catch (JSONException unused) {
                }
                return DbT.A10(A11);
            case 5:
                sb = AnonymousClass7TE.A1A();
                sb.append("UiGraphState(overallRowsCount=");
                sb.append(this.A01);
                str = ", currentSurfaceState=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        return AnonymousClass7TG.A0n(this.A02, sb);
    }

    public C61072JwA(List list, int i, int i2) {
        this.A00 = i2;
        switch (i2) {
            case 6:
            case 10:
                0qQ.A0B(list, 1);
                break;
        }
        this.A02 = list;
        this.A01 = i;
    }

    public C61072JwA(int i, Integer num, int i2) {
        this.A00 = i2;
        switch (i2) {
            case 1:
            case 19:
            case 24:
                break;
            default:
                0qQ.A0B(num, 2);
                break;
        }
        this.A01 = i;
        this.A02 = num;
    }

    public C61072JwA(int i, List list, int i2) {
        this.A00 = i2;
        0qQ.A0B(list, 2);
        this.A01 = i;
        this.A02 = list;
    }

    public C61072JwA(ImageUrl imageUrl, int i) {
        this.A00 = 14;
        this.A01 = i;
        this.A02 = imageUrl;
    }

    public C61072JwA(AnonymousClass5VN r2, int i) {
        this.A00 = 4;
        this.A01 = i;
        this.A02 = r2;
    }

    public C61072JwA(View.OnClickListener onClickListener, int i) {
        this.A00 = 15;
        this.A01 = i;
        this.A02 = onClickListener;
    }

    public C61072JwA(C3260875i r2, int i) {
        this.A00 = 17;
        this.A02 = r2;
        this.A01 = i;
    }

    public C61072JwA(C61083JwL jwL, int i) {
        this.A00 = 22;
        this.A02 = jwL;
        this.A01 = i;
    }

    public C61072JwA(C62519KhA khA, int i) {
        this.A00 = 13;
        this.A02 = khA;
        this.A01 = i;
    }

    public C61072JwA(C61082JwK jwK, int i) {
        this.A00 = 23;
        0qQ.A0B(jwK, 1);
        this.A02 = jwK;
        this.A01 = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61072JwA(int r3, int r4, int r5) {
        /*
            r2 = this;
            r1 = 0
            r2.A00 = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L_0x0014
            r0 = r4 & 1
            if (r0 == 0) goto L_0x000e
            r3 = 2130970231(0x7f040677, float:1.7549166E38)
        L_0x000e:
            r0 = 19
        L_0x0010:
            r2.<init>((int) r3, (java.lang.Integer) r1, (int) r0)
            return
        L_0x0014:
            r0 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61072JwA.<init>(int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61072JwA(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            r2.A00 = r3
            r1 = 0
            int r3 = 20 - r3
            if (r3 == 0) goto L_0x000d
            r0 = 21
        L_0x0009:
            r2.<init>((java.lang.Integer) r4, (int) r1, (int) r0)
            return
        L_0x000d:
            r0 = 20
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61072JwA.<init>(int, java.lang.Integer):void");
    }

    public C61072JwA(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public C61072JwA(Integer num, int i, int i2) {
        this.A00 = i2;
        this.A02 = num;
        this.A01 = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61072JwA() {
        this(new C61083JwL((C53314Gm0) null, (Integer) null, (DefaultConstructorMarker) null, 3, 1), 0);
        this.A00 = 22;
    }
}
