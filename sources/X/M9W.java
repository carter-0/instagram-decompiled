package X;

public final class M9W implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MSD A02;
    public final /* synthetic */ String A03;

    public M9W(MSD msd, String str, int i, int i2) {
        this.A02 = msd;
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        this.A02.Dof(this.A03, this.A01, this.A00);
    }
}
