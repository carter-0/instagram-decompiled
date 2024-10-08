package X;

/* renamed from: X.Mpe  reason: case insensitive filesystem */
public final class C67544Mpe extends 0ng {
    public final /* synthetic */ C67542Mpc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67544Mpe(C67542Mpc mpc) {
        super(313, 3, false, false);
        this.A00 = mpc;
    }

    public final void run() {
        C67542Mpc mpc = this.A00;
        C45209CsM csM = (C45209CsM) mpc.A00.A02("direct_recent_stickers_file_key", false);
        if (csM != null) {
            mpc.A01.addAll(C51966G9m.A1J(csM.A00));
        }
    }
}
