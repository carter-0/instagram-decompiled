package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.NkH  reason: case insensitive filesystem */
public enum C69377NkH {
    EARPIECE,
    SPEAKERPHONE,
    BLUETOOTH,
    HEADSET;

    /* access modifiers changed from: public */
    static {
        C69377NkH[] nkHArr;
        A00 = 0oU.A00(nkHArr);
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 2) {
            return NetInfoModule.CONNECTION_TYPE_BLUETOOTH;
        }
        if (ordinal == 0) {
            return "earpiece";
        }
        if (ordinal == 3) {
            return "headset";
        }
        if (ordinal == 1) {
            return "speaker";
        }
        throw AnonymousClass7TE.A1K();
    }
}
