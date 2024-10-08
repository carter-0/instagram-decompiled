package X;

import com.facebook.msys.mca.MailboxCallback;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.OoA  reason: case insensitive filesystem */
public final class C71629OoA implements MailboxCallback {
    public final /* synthetic */ AnonymousClass638 A00;
    public final /* synthetic */ SettableFuture A01;

    public C71629OoA(AnonymousClass638 r1, SettableFuture settableFuture) {
        this.A00 = r1;
        this.A01 = settableFuture;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A01.set(Boolean.TRUE);
        AnonymousClass638 r2 = this.A00;
        AnonymousClass638 r0 = AnonymousClass638.$redex_init_class;
        r2.A0E = false;
        r2.A0F = false;
    }
}
