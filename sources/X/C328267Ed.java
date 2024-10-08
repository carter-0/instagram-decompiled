package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Ed  reason: invalid class name and case insensitive filesystem */
public final class C328267Ed extends C331017Pd implements C328277Ee {
    public final UserSession A00;
    public final AnonymousClass73U A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* synthetic */ void AHu() {
        C66677Mak.A04(this);
    }

    public final /* synthetic */ C242553Us BKr() {
        return C66677Mak.A00(this);
    }

    public final /* synthetic */ C242553Us BzG() {
        return C66677Mak.A01(this);
    }

    public final /* synthetic */ void CsL(float f) {
        C66677Mak.A06(this, f);
    }

    public final /* synthetic */ void EI5() {
        C66677Mak.A05(this);
    }

    public final /* synthetic */ void Ehf(C242553Us r1) {
        C66677Mak.A02(r1, this);
    }

    public final /* synthetic */ void FM4(C242553Us r1, float f) {
        C66677Mak.A03(r1, this, f);
    }

    public final C331277Qg BLj() {
        C328007Db r1 = ((AnonymousClass7EZ) this.A00).A0M;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.messagethread.text.TextContentViewHolder<*>");
        return (C331277Qg) C331277Qg.A06.get(((AnonymousClass76M) r1).A03.getBackground());
    }

    public C328267Ed(UserSession userSession, AnonymousClass9HO r3, AnonymousClass7EZ r4, C332807Wl r5, AnonymousClass9HC r6, AnonymousClass76L r7, AnonymousClass7L2 r8) {
        super(r4, r7, r5);
        this.A03 = r8;
        this.A00 = userSession;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
        this.A01 = new AnonymousClass73U(r3);
    }
}
