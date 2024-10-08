package X;

/* renamed from: X.MbU  reason: case insensitive filesystem */
public final class C66723MbU implements C3032668b {
    public final C67272Ml7 A00;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 4) {
            C67272Ml7 ml7 = this.A00;
            return ml7.A00.ABm(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
        throw DbW.A0a("Array of size 4 expected but got ", length);
    }

    public C66723MbU(C67272Ml7 ml7) {
        this.A00 = ml7;
    }
}
