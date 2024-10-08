package X;

import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;

/* renamed from: X.JvO  reason: case insensitive filesystem */
public final class C61024JvO extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;

    public C61024JvO(RemoteBooleanSettingId remoteBooleanSettingId) {
        this.A01 = remoteBooleanSettingId;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61024JvO) || ((C61024JvO) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj) || this.A01 != ((C61024JvO) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C61024JvO(RemoteStringSettingId remoteStringSettingId) {
        this.A01 = remoteStringSettingId;
    }
}
