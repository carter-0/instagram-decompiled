package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LiL  reason: case insensitive filesystem */
public final class C64801LiL implements C232262tL {
    public final int A00;
    public final C16528UwY A01;
    public final ImageUrl A02;
    public final String A03;
    public final boolean A04;

    public C64801LiL(C16528UwY uwY, ImageUrl imageUrl, String str, int i, boolean z) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A01 = uwY;
        this.A00 = i;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
