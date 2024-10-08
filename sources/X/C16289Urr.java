package X;

/* renamed from: X.Urr  reason: case insensitive filesystem */
public final class C16289Urr extends C18441Vrk implements X75 {
    public C16731V3o A00;
    public boolean A01;
    public final C16288Urq A02;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.V3o, java.lang.Object] */
    public final C16731V3o Abu() {
        String str;
        C16731V3o v3o = this.A00;
        int i = v3o.A00;
        C16731V3o v3o2 = this.A02.A00;
        if (v3o2 == null) {
            str = null;
        } else {
            str = v3o2.A02;
        }
        String str2 = v3o.A01;
        ? obj = new Object();
        obj.A00 = i;
        obj.A02 = str;
        obj.A01 = str2;
        return obj;
    }

    public final boolean CL0() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Urq, X.Vrk] */
    public C16289Urr(C16731V3o v3o, C16524UwT uwT, String str) {
        super(uwT, str);
        this.A00 = v3o;
        this.A02 = new C18441Vrk(C16524UwT.EDITTEXT, str);
    }
}
