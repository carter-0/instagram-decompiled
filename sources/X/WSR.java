package X;

import com.instagram.common.typedurl.ImageUrl;

public final class WSR implements C232262tL {
    public final C381829cQ A00;
    public final VX5 A01;
    public final String A02;

    public WSR(AnonymousClass0iw r8, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, C62320sa r14, C62320sa r15, boolean z) {
        C381829cQ r1 = new C381829cQ(imageUrl, imageUrl2, num, str2, z);
        VX5 vx5 = new VX5(r8, r14, r15);
        this.A02 = str;
        this.A00 = r1;
        this.A01 = vx5;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C381829cQ r0;
        WSR wsr = (WSR) obj;
        C381829cQ r1 = this.A00;
        if (wsr != null) {
            r0 = wsr.A00;
        } else {
            r0 = null;
        }
        return 0qQ.A0K(r1, r0);
    }
}
