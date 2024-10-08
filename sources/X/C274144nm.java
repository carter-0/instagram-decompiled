package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4nm  reason: invalid class name and case insensitive filesystem */
public final class C274144nm extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C274134nl A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C274144nm(C274134nl r2, 1Xj r3, int i, boolean z) {
        super(0);
        this.A03 = z;
        this.A02 = r3;
        this.A00 = i;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (!this.A03) {
            return null;
        }
        return C246473ef.A00(this.A02, (ImageUrl) null, this.A01.A01.BQd(), this.A00, false);
    }
}
