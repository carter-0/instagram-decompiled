package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Inu  reason: case insensitive filesystem */
public final class C58190Inu extends 0Yg implements C62320sa {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C231502rm A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58190Inu(ImageUrl imageUrl, C231502rm r3, String str, String str2) {
        super(0);
        this.A01 = r3;
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (!this.A01.A0H) {
            return null;
        }
        return new C247533gU(this.A00, this.A02, this.A03);
    }
}
