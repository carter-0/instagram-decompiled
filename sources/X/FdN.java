package X;

public final class FdN implements C358618bC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C46811Dln A01;
    public final /* synthetic */ 0rm A02;

    public FdN(C46811Dln dln, 0rm r2, int i) {
        this.A02 = r2;
        this.A01 = dln;
        this.A00 = i;
    }

    public final boolean onToggle(boolean z) {
        Object obj = this.A02.A00;
        ((C61082JwK) obj).A01 = z;
        C46811Dln dln = this.A01;
        C49400Ev2 ev2 = dln.A00;
        0qQ.A06(obj);
        int i = this.A00;
        2YL A0H = DbS.A0H(ev2.A00.A01);
        AnonymousClass7TE.A1Z(new JTZ(A0H, obj, (AnonymousClass4D7) null, i, 22), C318116oQ.A00(A0H));
        dln.notifyItemChanged(i);
        return true;
    }
}
