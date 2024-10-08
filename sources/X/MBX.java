package X;

public final /* synthetic */ class MBX implements 0sP {
    public final /* synthetic */ LFE A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ MBX(LFE lfe, String str, String str2) {
        this.A00 = lfe;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object invoke(Object obj) {
        LFE lfe = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        C60921Jtf A002 = lfe.A00(str);
        if (A002 == null) {
            A002 = new C60921Jtf(str, str2, 0sr.A1M(new String[]{str2}));
        } else {
            A002.A02.add(str2);
            0qQ.A0B(str2, 0);
            A002.A00 = str2;
        }
        lfe.A01(A002);
        return C60340gF.A00;
    }
}
