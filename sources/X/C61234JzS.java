package X;

/* renamed from: X.JzS  reason: case insensitive filesystem */
public final class C61234JzS extends AnonymousClass0T0 implements C66417MQx {
    public final C66460MSo A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C61234JzS(C66460MSo mSo, Object obj, String str, String str2) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A00 = mSo;
        this.A01 = obj;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61234JzS) {
                C61234JzS jzS = (C61234JzS) obj;
                if (!0qQ.A0K(this.A03, jzS.A03) || !0qQ.A0K(this.A00, jzS.A00) || !0qQ.A0K(this.A01, jzS.A01) || !0qQ.A0K(this.A02, jzS.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A03))) + AnonymousClass7TG.A0E(this.A02);
    }
}
