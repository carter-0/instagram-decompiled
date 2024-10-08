package X;

public final class SzH implements C3736696l {
    public final int A00;
    public final Object A01;

    public SzH(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final void onSuccess(Object obj) {
        0sP r1;
        switch (this.A00) {
            case 0:
                r1 = (0sP) this.A01;
                0qQ.A0B(r1, 0);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                r1 = (0sP) this.A01;
                break;
            default:
                return;
        }
        r1.invoke(obj);
    }
}
