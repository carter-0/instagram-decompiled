package X;

import android.util.SparseArray;

/* renamed from: X.G2o  reason: case insensitive filesystem */
public final class C51805G2o extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SparseArray A04;
    public final /* synthetic */ 0sP A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51805G2o(SparseArray sparseArray, 0sP r3, float f, int i, int i2, int i3) {
        super(1);
        this.A04 = sparseArray;
        this.A02 = i;
        this.A03 = i2;
        this.A05 = r3;
        this.A01 = i3;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        SparseArray sparseArray = this.A04;
        sparseArray.put(this.A02, obj);
        if (sparseArray.size() == this.A03) {
            this.A05.invoke(F7H.A00(sparseArray, this.A00, this.A01));
        }
        return C60340gF.A00;
    }
}
