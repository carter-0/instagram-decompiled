package X;

import com.instagram.genai.imageutils.MaskUtilsKt;

/* renamed from: X.MMz  reason: case insensitive filesystem */
public final class C66316MMz extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ int[] A04;
    public final /* synthetic */ int[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66316MMz(int[] iArr, int[] iArr2, int i, int i2, int i3, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = i2;
        this.A05 = iArr;
        this.A01 = i3;
        this.A04 = iArr2;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int A0M = AnonymousClass7TE.A0M(obj);
        for (int i2 = 0; i2 < this.A00; i2++) {
            int i3 = (this.A02 * i2) + A0M;
            if (this.A05[i3] == this.A01) {
                int[] iArr = this.A04;
                if (this.A03) {
                    i = MaskUtilsKt.A00;
                } else {
                    i = MaskUtilsKt.A01;
                }
                iArr[i3] = i;
            }
        }
        return C60340gF.A00;
    }
}
