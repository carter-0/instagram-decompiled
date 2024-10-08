package X;

public final class FTG implements C635813i {
    public final int A00;
    public final String A01;

    public FTG(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        int i = this.A00;
        1Fc r2 = new 1Fc();
        String str2 = this.A01;
        if (2 - i != 0) {
            str = "hallpass_id";
        } else {
            str = "ndx_request_source";
        }
        r2.A05(str, str2);
        return r2;
    }
}
