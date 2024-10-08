package X;

/* renamed from: X.WDn  reason: case insensitive filesystem */
public final /* synthetic */ class C18935WDn implements C13505TbW {
    public final /* synthetic */ C14284TtI A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ Runnable A02;

    public /* synthetic */ C18935WDn(C14284TtI ttI, Runnable runnable, Runnable runnable2) {
        this.A01 = runnable;
        this.A00 = ttI;
        this.A02 = runnable2;
    }

    public final void onCancel() {
        Runnable runnable = this.A01;
        C14284TtI ttI = this.A00;
        Runnable runnable2 = this.A02;
        if (runnable == null) {
            ttI.A0F();
            runnable2.run();
            return;
        }
        runnable.run();
    }
}
