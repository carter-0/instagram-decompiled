package X;

public final class FYS implements C232262tL, C296945qu {
    public final C63868L9x A00;

    public FYS(C63868L9x l9x) {
        0qQ.A0B(l9x, 1);
        this.A00 = l9x;
    }

    public final C296905qq B9p() {
        return new C296905qq(1, 1, 1, 1, 1.0f);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        FYS fys = (FYS) obj;
        String str2 = this.A00.A04;
        if (fys != null) {
            str = fys.A00.A04;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }
}
