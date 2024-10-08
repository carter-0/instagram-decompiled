package X;

/* renamed from: X.4Xl  reason: invalid class name and case insensitive filesystem */
public final class C266074Xl implements C266084Xm {
    public final C265984Xc[] A00;
    public final int[] A01;

    public final C265994Xd FHW(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i3 >= iArr.length) {
                2AG.A03("BaseMediaChunkOutput", 002.A0O("Unmatched track of type: ", i2));
                return new AnonymousClass4YK();
            } else if (i2 == iArr[i3]) {
                return this.A00[i3];
            } else {
                i3++;
            }
        }
    }

    public C266074Xl(int[] iArr, C265984Xc[] r2) {
        this.A01 = iArr;
        this.A00 = r2;
    }
}
