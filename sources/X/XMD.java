package X;

import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;

public final class XMD extends AnonymousClass0T0 implements MR1 {
    public final int A00 = 1;
    public final Object A01;

    public XMD(C61024JvO jvO) {
        this.A01 = jvO;
    }

    public static XMD A00(RemoteBooleanSettingId remoteBooleanSettingId) {
        return new XMD(new C61024JvO(remoteBooleanSettingId));
    }

    public static XMD A01(RemoteStringSettingId remoteStringSettingId) {
        return new XMD(new C61024JvO(remoteStringSettingId));
    }

    public static KYA A02(C61024JvO jvO, XTW xtw, Class cls, String str) {
        return new KYA(new C61079JwH(xtw, (MR1) new XMD(jvO), str), new 0Yh(cls));
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof XMD) || ((XMD) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A03(1, obj) || !0qQ.A0K(this.A01, ((XMD) obj).A01)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!A03(0, obj) || this.A01 != ((XMD) obj).A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return this.A01.hashCode();
        }
        Integer num = (Integer) this.A01;
        return C21344XXl.A00(num).hashCode() + num.intValue();
    }

    public XMD(Integer num) {
        this.A01 = num;
    }
}
