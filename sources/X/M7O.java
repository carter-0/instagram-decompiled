package X;

public final class M7O implements Runnable {
    public final /* synthetic */ C53030GhL A00;
    public final /* synthetic */ String A01;

    public M7O(C53030GhL ghL, String str) {
        this.A01 = str;
        this.A00 = ghL;
    }

    public final void run() {
        C310336ap A0W = DbV.A0W();
        A0W.A0H = "ai_studio_deletion_progress";
        A0W.A0D = this.A01;
        A0W.A0A(new C57276IVl(this.A00, 3));
        DbY.A1N(A0W);
    }
}
