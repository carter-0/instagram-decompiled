package X;

public final class XEg implements C3032668b {
    public final C21099XEn A00;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 2) {
            C21099XEn xEn = this.A00;
            return xEn.A00.apply(objArr[0], objArr[1]);
        }
        throw DbW.A0a("Array of size 2 expected but got ", length);
    }

    public XEg(C21099XEn xEn) {
        this.A00 = xEn;
    }
}
