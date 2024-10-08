package X;

/* renamed from: X.7eP  reason: invalid class name and case insensitive filesystem */
public final class C336307eP implements AnonymousClass11X {
    public Object A00;
    public Object A01;
    public final /* synthetic */ C336297eO A02;
    public final /* synthetic */ String A03;

    public final int getRunnableId() {
        return 264;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public C336307eP(C336297eO r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = r2.A06.ARG();
    }

    public final String getName() {
        return "queryBootstrap";
    }

    public final void onFinish() {
        C336297eO r3 = this.A02;
        String str = r3.A03;
        String str2 = this.A03;
        if (0qQ.A0K(str, str2)) {
            r3.A04 = false;
            r3.A01 = this.A00;
            r3.A02 = this.A01;
            C337257fy r1 = r3.A07;
            r1.EcJ((C337237fw) null);
            r1.EhX(str2);
            r1.EcJ(r3);
        }
    }

    public final void run() {
        C336297eO r3 = this.A02;
        C336287eN r2 = r3.A06;
        String str = this.A03;
        if (str == null) {
            str = "";
        }
        Object E5m = r2.E5m(str);
        this.A00 = E5m;
        this.A01 = r2.AIL(E5m, r3.A07.Bo1());
    }
}
