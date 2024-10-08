package X;

public final class USd extends C19062WIs {
    public final Object A00;
    public final /* synthetic */ C18592Vuj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public USd(C18592Vuj vuj, Object obj, int i) {
        super(vuj, i);
        this.A01 = vuj;
        this.A00 = obj;
    }

    public final void AT8() {
        W0R w0r = this.A01.A0L;
        int i = this.A00;
        Object obj = this.A00;
        synchronized (w0r) {
            w0r.A03(i).updateExtraData(w0r.A02(i), obj);
        }
    }
}
