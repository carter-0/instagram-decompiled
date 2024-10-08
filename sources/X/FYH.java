package X;

import com.instagram.model.direct.DirectSearchPrompt;

public final class FYH implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final DirectSearchPrompt A03;

    public FYH(DirectSearchPrompt directSearchPrompt, int i, int i2, int i3) {
        0qQ.A0B(directSearchPrompt, 1);
        this.A03 = directSearchPrompt;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYH fyh = (FYH) obj;
        0qQ.A0B(fyh, 0);
        if (0qQ.A0K(this.A03, fyh.A03) && this.A00 == fyh.A00 && this.A01 == fyh.A01 && this.A02 == fyh.A02) {
            return true;
        }
        return false;
    }
}
