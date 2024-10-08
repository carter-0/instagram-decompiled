package X;

public final class IXI implements JOU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IXI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Cyj(boolean z) {
        Object obj;
        switch (this.A00) {
            case 0:
                H24 h24 = (H24) this.A02;
                h24.A06 = z;
                H24.A01(h24);
                break;
            case 1:
                H25 h25 = (H25) this.A01;
                h25.A07 = z;
                H25.A02(h25);
                obj = this.A02;
                break;
            default:
                H10 h10 = (H10) this.A02;
                if (h10.A04 != z) {
                    h10.A05 = true;
                }
                h10.A04 = z;
                H10.A03(h10);
                break;
        }
        obj = this.A01;
        ((C331157Pu) obj).A07();
    }
}
