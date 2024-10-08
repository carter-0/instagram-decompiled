package X;

import android.util.SparseArray;

/* renamed from: X.SdW  reason: case insensitive filesystem */
public final class C11628SdW implements AnonymousClass2gO {
    public final /* synthetic */ SRc A00;
    public final /* synthetic */ C298475tU A01;

    public C11628SdW(SRc sRc, C298475tU r2) {
        this.A01 = r2;
        this.A00 = sRc;
    }

    public final void onChanged(Object obj) {
        C298475tU r5 = this.A01;
        AnonymousClass2gB r4 = r5.A05;
        Object A02 = r4.A02();
        A02.getClass();
        SparseArray sparseArray = (SparseArray) A02;
        SRc sRc = this.A00;
        int i = sRc.A02;
        Object obj2 = sparseArray.get(i);
        sparseArray.put(i, obj);
        r4.A0B(sparseArray);
        r5.A0O(sRc, obj, obj2);
    }
}
