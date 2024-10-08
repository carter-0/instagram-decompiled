package X;

import com.instagram.avatars.store.AvatarStore;

/* renamed from: X.LdC  reason: case insensitive filesystem */
public final class C64510LdC implements C267624bv {
    public final /* synthetic */ C267624bv A00;
    public final /* synthetic */ AnonymousClass27H A01;
    public final /* synthetic */ AvatarStore A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C250973mM A04;
    public final /* synthetic */ AnonymousClass6ZN A05;

    public final /* synthetic */ void CxR() {
    }

    public C64510LdC(C267624bv r1, AnonymousClass27H r2, AvatarStore avatarStore, C255773uh r4, C250973mM r5, AnonymousClass6ZN r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = avatarStore;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public final void CxD() {
        AnonymousClass6ZN r1 = this.A05;
        if (AnonymousClass7TF.A1Z(r1.A0I)) {
            r1.A08 = true;
        }
        this.A00.CxD();
    }

    public final void CxF() {
        this.A00.CxF();
    }

    public final void CxG() {
        AnonymousClass6ZN r2 = this.A05;
        r2.A0B = false;
        AnonymousClass27H r1 = this.A02.A01.A00;
        if (!0qQ.A0K(r1, C299715vi.A00) || 0qQ.A0K(r1, this.A01) || !AnonymousClass7TF.A1Z(r2.A0I)) {
            r2.A0G.E0w(this.A03, this.A04, AnonymousClass05K.A0C, false);
        }
    }
}
