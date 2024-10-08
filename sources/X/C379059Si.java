package X;

import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.9Si  reason: invalid class name and case insensitive filesystem */
public final class C379059Si extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MusicAssetModel A02;
    public final /* synthetic */ B2D A03;
    public final /* synthetic */ C353638Im A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C379059Si(MusicAssetModel musicAssetModel, B2D b2d, C353638Im r7, String str, int i, int i2, boolean z) {
        super(92, 3, true, false);
        this.A04 = r7;
        this.A02 = musicAssetModel;
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z;
        this.A03 = b2d;
    }

    public final void run() {
        C353638Im r3 = this.A04;
        11Z.A02(new AnonymousClass9UY(C353638Im.A00(this.A02, r3, this.A05, this.A01, this.A00, this.A06), this.A03, r3));
    }
}
