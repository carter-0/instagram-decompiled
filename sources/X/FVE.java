package X;

public final class FVE implements C66431MRl {
    public final int A00;

    public FVE(int i) {
        this.A00 = i;
    }

    public final 1XR E1s(16F r2) {
        1XR parseFromJson;
        switch (this.A00) {
            case 0:
                return F86.parseFromJson(r2);
            case 1:
                0qQ.A0B(r2, 0);
                parseFromJson = C48738EjN.parseFromJson(r2);
                break;
            default:
                0qQ.A0B(r2, 0);
                parseFromJson = F86.parseFromJson(r2);
                break;
        }
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }
}
