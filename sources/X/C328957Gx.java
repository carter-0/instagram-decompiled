package X;

import com.instagram.realtimeclient.RealtimeClientManager$MessageDeliveryCallback;

/* renamed from: X.7Gx  reason: invalid class name and case insensitive filesystem */
public final class C328957Gx extends RealtimeClientManager$MessageDeliveryCallback {
    public final /* synthetic */ C328927Gu A00;

    public final void onTimeout() {
    }

    public C328957Gx(C328927Gu r1) {
        this.A00 = r1;
    }

    public final void onSuccess(String str, String str2, long j, Long l) {
        if (l != null) {
            this.A00.A01 = l.longValue();
        }
    }

    public final void onFailure(Integer num, String str, String str2, boolean z, C254403sQ r5, String str3, boolean z2, boolean z3) {
    }
}
