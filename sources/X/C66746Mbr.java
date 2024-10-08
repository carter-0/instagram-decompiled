package X;

/* renamed from: X.Mbr  reason: case insensitive filesystem */
public final class C66746Mbr implements C3032668b {
    public final C67056MhT A00;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 3) {
            C67056MhT mhT = this.A00;
            return mhT.A00.ABl(objArr[0], objArr[1], objArr[2]);
        }
        throw DbW.A0a("Array of size 3 expected but got ", length);
    }

    public C66746Mbr(C67056MhT mhT) {
        this.A00 = mhT;
    }
}
