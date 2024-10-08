package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Opa  reason: case insensitive filesystem */
public final class C71716Opa implements MailboxCallback {
    public static final C71716Opa A00 = new C71716Opa();

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (!AnonymousClass7TE.A1a(obj)) {
            0KC.A0C("SecurityAlertLocalDataSource", "Failed to write ParticipantDeviceChange data to msys db");
        }
    }
}
