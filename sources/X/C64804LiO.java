package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LiO  reason: case insensitive filesystem */
public final class C64804LiO implements C232262tL {
    public final int A00;
    public final C16528UwY A01;
    public final ImageUrl A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C64804LiO(C16528UwY uwY, ImageUrl imageUrl, String str, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A01 = uwY;
        this.A05 = z2;
        this.A04 = z;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
