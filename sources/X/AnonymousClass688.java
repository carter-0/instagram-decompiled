package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.688  reason: invalid class name */
public final class AnonymousClass688 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass2FF A00;

    public AnonymousClass688(AnonymousClass2FF r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        0qQ.A0B(obj, 0);
        this.A00.accept(obj);
    }
}
