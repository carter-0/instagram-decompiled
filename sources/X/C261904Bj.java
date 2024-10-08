package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4Bj  reason: invalid class name and case insensitive filesystem */
public final class C261904Bj extends Handler {
    public final /* synthetic */ AnonymousClass43O A00;

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what == 1) {
            Object obj = message.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.realtime.snapshot.BaseSnapshotRequestManager.SnapshotHttpRequest<*>");
            AnonymousClass659 r1 = (AnonymousClass659) obj;
            0qQ.A0B(r1, 0);
            AnonymousClass11X r0 = r1.A02;
            if (r0 != null) {
                1ES.A03(r0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261904Bj(Looper looper, AnonymousClass43O r2) {
        super(looper);
        this.A00 = r2;
    }
}
