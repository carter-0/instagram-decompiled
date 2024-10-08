package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.66a  reason: invalid class name */
public final class AnonymousClass66a implements 0lm {
    public SessionedNotificationCenter A00;
    public final AnonymousClass66d A01 = new AnonymousClass66c(this);
    public final SettableFuture A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public /* synthetic */ AnonymousClass66a(SettableFuture settableFuture, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (this.A02.cancel(true)) {
            0KC.A0D("MEMEnabledAccountSession", "MEM Login cancelled before completion");
        }
        SessionedNotificationCenter sessionedNotificationCenter = this.A00;
        if (sessionedNotificationCenter == null) {
            0qQ.A0F("sessionedNotificationCenter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            sessionedNotificationCenter.removeObserver(this.A01, "MEMContextReadyNotification", (AnonymousClass2Lq) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public AnonymousClass66a() {
    }
}
