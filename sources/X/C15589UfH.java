package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UfH  reason: case insensitive filesystem */
public final class C15589UfH extends 1P0 {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1pO A02;

    public C15589UfH(AnonymousClass540 r1, UserSession userSession, 1pO r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-604010279);
        AnonymousClass540 r1 = this.A00;
        if (r1 != null) {
            r1.AVX(AnonymousClass000.A00(3081));
        }
        AnonymousClass0fD.A0A(-2083658198, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1384737682);
        C3723890q r6 = (C3723890q) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -1184254646);
        1pO r2 = this.A02;
        1pO.A00(this.A00, this.A01, r2, r6);
        AnonymousClass0fD.A0A(1159186887, A0D);
        AnonymousClass0fD.A0A(1335049634, A03);
    }
}
