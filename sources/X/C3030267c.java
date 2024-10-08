package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.PlatformLogger;

/* renamed from: X.67c  reason: invalid class name and case insensitive filesystem */
public final class C3030267c implements MailboxCallback {
    public final /* synthetic */ int A00;

    public C3030267c(int i) {
        this.A00 = i;
    }

    public final void onCompletion(Object obj) {
        int i = this.A00;
        PlatformLogger.platformEventLog(254, i);
        C3030067a.A02(i);
    }
}
