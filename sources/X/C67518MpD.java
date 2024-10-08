package X;

import com.facebook.msys.mci.AccountSession;

/* renamed from: X.MpD  reason: case insensitive filesystem */
public final class C67518MpD implements 1aV {
    public final /* synthetic */ AnonymousClass6EW A00;
    public final /* synthetic */ AnonymousClass6EU A01;

    public C67518MpD(AnonymousClass6EW r1, AnonymousClass6EU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        0qQ.A0A(accountSession);
        MYY.A00(accountSession, "initializeWellbeingDatabase").execute(new C67519MpE(this.A00, this.A01));
    }
}
