package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.FollowStatus;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9IE  reason: invalid class name */
public final class AnonymousClass9IE extends AnonymousClass0T0 {
    public Object A00;
    public final int A01;

    public final AnonymousClass61R A00(C69357Njw njw) {
        return (AnonymousClass61R) ((Map) this.A00).get(njw);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009c, code lost:
        if ((r3 instanceof X.AnonymousClass9IE) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009e, code lost:
        r3 = (X.AnonymousClass9IE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a2, code lost:
        if (r3.A01 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a8, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b6, code lost:
        if ((r3 instanceof X.AnonymousClass9IE) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b8, code lost:
        r3 = (X.AnonymousClass9IE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00bc, code lost:
        if (r3.A01 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c6, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_?;
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
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x000f;
                case 2: goto L_0x0014;
                case 3: goto L_0x0019;
                case 4: goto L_0x001e;
                case 5: goto L_0x0005;
                case 6: goto L_0x0022;
                case 7: goto L_0x0027;
                case 8: goto L_0x002c;
                case 9: goto L_0x0032;
                case 10: goto L_0x0037;
                case 11: goto L_0x003c;
                case 12: goto L_0x0041;
                case 13: goto L_0x0046;
                case 14: goto L_0x004b;
                case 15: goto L_0x0050;
                case 16: goto L_0x0055;
                case 17: goto L_0x005a;
                case 18: goto L_0x005f;
                case 19: goto L_0x0064;
                case 20: goto L_0x0069;
                case 21: goto L_0x006e;
                case 22: goto L_0x0073;
                case 23: goto L_0x0078;
                case 24: goto L_0x007d;
                case 25: goto L_0x0082;
                case 26: goto L_0x0087;
                case 27: goto L_0x008c;
                case 28: goto L_0x0091;
                case 29: goto L_0x0096;
                case 30: goto L_0x00ab;
                case 31: goto L_0x00b0;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x00ca
            r1 = 0
            goto L_0x00b4
        L_0x000f:
            if (r2 == r3) goto L_0x00ca
            r1 = 1
            goto L_0x00b4
        L_0x0014:
            if (r2 == r3) goto L_0x00ca
            r1 = 2
            goto L_0x009a
        L_0x0019:
            if (r2 == r3) goto L_0x00ca
            r1 = 3
            goto L_0x00b4
        L_0x001e:
            if (r2 == r3) goto L_0x00ca
            r1 = 4
            goto L_0x009a
        L_0x0022:
            if (r2 == r3) goto L_0x00ca
            r1 = 6
            goto L_0x00b4
        L_0x0027:
            if (r2 == r3) goto L_0x00ca
            r1 = 7
            goto L_0x00b4
        L_0x002c:
            if (r2 == r3) goto L_0x00ca
            r1 = 8
            goto L_0x00b4
        L_0x0032:
            if (r2 == r3) goto L_0x00ca
            r1 = 9
            goto L_0x00b4
        L_0x0037:
            if (r2 == r3) goto L_0x00ca
            r1 = 10
            goto L_0x00b4
        L_0x003c:
            if (r2 == r3) goto L_0x00ca
            r1 = 11
            goto L_0x00b4
        L_0x0041:
            if (r2 == r3) goto L_0x00ca
            r1 = 12
            goto L_0x00b4
        L_0x0046:
            if (r2 == r3) goto L_0x00ca
            r1 = 13
            goto L_0x00b4
        L_0x004b:
            if (r2 == r3) goto L_0x00ca
            r1 = 14
            goto L_0x00b4
        L_0x0050:
            if (r2 == r3) goto L_0x00ca
            r1 = 15
            goto L_0x00b4
        L_0x0055:
            if (r2 == r3) goto L_0x00ca
            r1 = 16
            goto L_0x00b4
        L_0x005a:
            if (r2 == r3) goto L_0x00ca
            r1 = 17
            goto L_0x00b4
        L_0x005f:
            if (r2 == r3) goto L_0x00ca
            r1 = 18
            goto L_0x00b4
        L_0x0064:
            if (r2 == r3) goto L_0x00ca
            r1 = 19
            goto L_0x00b4
        L_0x0069:
            if (r2 == r3) goto L_0x00ca
            r1 = 20
            goto L_0x00b4
        L_0x006e:
            if (r2 == r3) goto L_0x00ca
            r1 = 21
            goto L_0x00b4
        L_0x0073:
            if (r2 == r3) goto L_0x00ca
            r1 = 22
            goto L_0x00b4
        L_0x0078:
            if (r2 == r3) goto L_0x00ca
            r1 = 23
            goto L_0x00b4
        L_0x007d:
            if (r2 == r3) goto L_0x00ca
            r1 = 24
            goto L_0x00b4
        L_0x0082:
            if (r2 == r3) goto L_0x00ca
            r1 = 25
            goto L_0x00b4
        L_0x0087:
            if (r2 == r3) goto L_0x00ca
            r1 = 26
            goto L_0x00b4
        L_0x008c:
            if (r2 == r3) goto L_0x00ca
            r1 = 27
            goto L_0x00b4
        L_0x0091:
            if (r2 == r3) goto L_0x00ca
            r1 = 28
            goto L_0x00b4
        L_0x0096:
            if (r2 == r3) goto L_0x00ca
            r1 = 29
        L_0x009a:
            boolean r0 = r3 instanceof X.AnonymousClass9IE
            if (r0 == 0) goto L_0x00c8
            X.9IE r3 = (X.AnonymousClass9IE) r3
            int r0 = r3.A01
            if (r0 != r1) goto L_0x00c8
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00ca
            goto L_0x00c8
        L_0x00ab:
            if (r2 == r3) goto L_0x00ca
            r1 = 30
            goto L_0x00b4
        L_0x00b0:
            if (r2 == r3) goto L_0x00ca
            r1 = 31
        L_0x00b4:
            boolean r0 = r3 instanceof X.AnonymousClass9IE
            if (r0 == 0) goto L_0x00c8
            X.9IE r3 = (X.AnonymousClass9IE) r3
            int r0 = r3.A01
            if (r0 != r1) goto L_0x00c8
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ca
        L_0x00c8:
            r0 = 0
            return r0
        L_0x00ca:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IE.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object obj;
        switch (this.A01) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 7:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
                obj = this.A00;
                break;
            case 2:
            case 6:
            case 8:
            case 9:
            case 31:
                obj = this.A00;
                if (obj == null) {
                    return 0;
                }
                break;
            default:
                return super.hashCode();
        }
        return obj.hashCode();
    }

    public final String toString() {
        if (21 - this.A01 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MediaLargerCTABufferUiActions(setAutomatedMetricsLoggingLargerCTABuffer=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IE(int i) {
        this((List) null, 31);
        this.A01 = i;
        switch (i) {
            case 6:
                this.A01 = 6;
                this((Object) null, 6);
                return;
            case 7:
                this((AnonymousClass51N) new AnonymousClass51M());
                return;
            case 9:
                this.A01 = 9;
                this((1Xj) null, 9);
                return;
            case 28:
                this.A01 = 28;
                this((Set) new LinkedHashSet());
                return;
            default:
                this.A01 = 31;
                return;
        }
    }

    public AnonymousClass9IE(AnonymousClass0iw r2) {
        this.A01 = 1;
        this.A00 = r2;
    }

    public AnonymousClass9IE(1Xj r2, int i) {
        this.A01 = i;
        if (9 - i != 0) {
            0qQ.A0B(r2, 1);
        }
        this.A00 = r2;
    }

    public AnonymousClass9IE(C238863Ds r2) {
        this.A01 = 29;
        this.A00 = r2;
    }

    public AnonymousClass9IE(AnonymousClass51N r2) {
        this.A01 = 7;
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass9IE(GifUrlImpl gifUrlImpl) {
        this.A01 = 27;
        0qQ.A0B(gifUrlImpl, 1);
        this.A00 = gifUrlImpl;
    }

    public AnonymousClass9IE(FollowStatus followStatus) {
        this.A01 = 4;
        this.A00 = followStatus;
    }

    public AnonymousClass9IE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass9IE(List list, int i) {
        this.A01 = i;
        switch (i) {
            case 22:
            case 25:
                0qQ.A0B(list, 1);
                break;
        }
        this.A00 = list;
    }

    public AnonymousClass9IE(Map map) {
        this.A01 = 0;
        this.A00 = map;
    }

    public AnonymousClass9IE(Set set) {
        this.A01 = 28;
        0qQ.A0B(set, 1);
        this.A00 = set;
    }
}
