package X;

/* renamed from: X.Ufi  reason: case insensitive filesystem */
public final class C15616Ufi extends 1P0 {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ 1OC A01;
    public final /* synthetic */ C323476xY A02;

    public C15616Ufi(1P0 r1, 1OC r2, C323476xY r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -636964199);
        this.A02.A00.remove(this.A01);
        this.A00.onFail(r4);
        AnonymousClass0fD.A0A(-1383612903, A0D);
    }

    public final void onFailInBackground(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 604290986);
        this.A02.A00.remove(this.A01);
        this.A00.onFailInBackground(r4);
        AnonymousClass0fD.A0A(1738368171, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(285612079);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(495582865, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1843930877);
        this.A02.A00.add(this.A01);
        this.A00.onStart();
        AnonymousClass0fD.A0A(-54520453, A03);
    }

    public final void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1473237684);
        this.A02.A00.remove(this.A01);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(2140688780, A03);
    }

    public final void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(2073161206);
        this.A02.A00.remove(this.A01);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(1595154880, A03);
    }
}
