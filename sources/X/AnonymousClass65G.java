package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.65G  reason: invalid class name */
public final class AnonymousClass65G implements AnonymousClass0lh {
    public boolean A00;
    public final 02m A01;

    public final void onSessionWillEnd() {
        this.A00 = false;
    }

    public static final String A00(Boolean bool) {
        if (bool == null) {
            return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        if (bool.booleanValue()) {
            return "TRUE";
        }
        return "FALSE";
    }

    public AnonymousClass65G(02m r1) {
        this.A01 = r1;
    }
}
