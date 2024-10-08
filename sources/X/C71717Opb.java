package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Opb  reason: case insensitive filesystem */
public final class C71717Opb implements MailboxCallback {
    public static final C71717Opb A00 = new C71717Opb();

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (!AnonymousClass7TE.A1a(obj)) {
            0KC.A0C("SecurityAlertRepository", "Failed to write ParticipantDeviceChange data to msys db");
        }
    }
}
