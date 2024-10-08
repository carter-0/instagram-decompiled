package X;

public final /* synthetic */ class TTF extends 03J implements C62320sa {
    public TTF(Object obj) {
        super(0, obj, SlK.class, "renderFooter", "renderFooter()V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        SlK slK = (SlK) this.receiver;
        String str2 = slK.A03;
        if (!(str2 == null || (str = slK.A04) == null)) {
            C15047ULa uLa = new C15047ULa(slK.A09, slK.A0G, slK.A02, slK.A0I, slK.A0F, slK.A0J, str2, str);
            C13789Th4 th4 = slK.A01;
            if (th4 != null) {
                C15047ULa uLa2 = uLa;
                th4.EF3(slK.A0A, slK.A0B, uLa2, slK.A0C, slK.A0D, slK.A0E, new TTG(slK, 3));
            }
        }
        return C60340gF.A00;
    }
}
