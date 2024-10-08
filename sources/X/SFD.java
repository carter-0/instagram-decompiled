package X;

public final class SFD {
    public int A00;
    public long A01;
    public Object A02;
    public final SNE A03;

    public SFD(SNE sne) {
        sne.getClass();
        this.A03 = sne;
    }

    public SFD() {
        this.A03 = SNE.A01;
    }
}
