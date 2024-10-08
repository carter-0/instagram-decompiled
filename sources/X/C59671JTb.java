package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JTb  reason: case insensitive filesystem */
public final class C59671JTb extends AnonymousClass0T0 {
    public boolean A00;
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59671JTb(int r3) {
        /*
            r2 = this;
            r2.A01 = r3
            r1 = 0
            switch(r3) {
                case 0: goto L_0x0020;
                case 1: goto L_0x001e;
                case 2: goto L_0x001c;
                case 3: goto L_0x001a;
                case 4: goto L_0x0018;
                case 5: goto L_0x0016;
                case 6: goto L_0x0014;
                case 7: goto L_0x0012;
                case 8: goto L_0x000f;
                case 9: goto L_0x0006;
                case 10: goto L_0x0006;
                case 11: goto L_0x000c;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 15
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            r0 = 11
            goto L_0x0008
        L_0x000f:
            r0 = 8
            goto L_0x0008
        L_0x0012:
            r0 = 7
            goto L_0x0008
        L_0x0014:
            r0 = 6
            goto L_0x0008
        L_0x0016:
            r0 = 5
            goto L_0x0008
        L_0x0018:
            r0 = 4
            goto L_0x0008
        L_0x001a:
            r0 = 3
            goto L_0x0008
        L_0x001c:
            r0 = 2
            goto L_0x0008
        L_0x001e:
            r0 = 1
            goto L_0x0008
        L_0x0020:
            r0 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59671JTb.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            case 5:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
            case 6:
                if (this != obj) {
                    i = 6;
                    break;
                } else {
                    return true;
                }
            case 7:
                if (this != obj) {
                    i = 7;
                    break;
                } else {
                    return true;
                }
            case 8:
                if (this != obj) {
                    i = 8;
                    break;
                } else {
                    return true;
                }
            case 9:
                if (this != obj) {
                    i = 9;
                    break;
                } else {
                    return true;
                }
            case 11:
                if (this != obj) {
                    i = 11;
                    break;
                } else {
                    return true;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                if (this != obj) {
                    i = 12;
                    break;
                } else {
                    return true;
                }
            case 13:
                if (this != obj) {
                    i = 13;
                    break;
                } else {
                    return true;
                }
            case 14:
                if (this != obj) {
                    i = 14;
                    break;
                } else {
                    return true;
                }
            case 15:
                if (this != obj) {
                    i = 15;
                    break;
                } else {
                    return true;
                }
            case 16:
                if (this != obj) {
                    i = 16;
                    break;
                } else {
                    return true;
                }
            case 17:
                if (this != obj) {
                    i = 17;
                    break;
                } else {
                    return true;
                }
            case EglBase14Impl.EGLExt_SDK_VERSION:
                if (this != obj) {
                    i = 18;
                    break;
                } else {
                    return true;
                }
            case 19:
                if (this != obj) {
                    i = 19;
                    break;
                } else {
                    return true;
                }
            case 20:
                if (this != obj) {
                    i = 20;
                    break;
                } else {
                    return true;
                }
            case 21:
                if (this != obj) {
                    i = 21;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof C59671JTb)) {
            return false;
        }
        C59671JTb jTb = (C59671JTb) obj;
        if (jTb.A01 == i && this.A00 == jTb.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        switch (this.A01) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
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
                if (this.A00) {
                    return 1231;
                }
                return 1237;
            default:
                return super.hashCode();
        }
    }

    public C59671JTb(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
    }
}
