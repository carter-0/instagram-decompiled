package X;

import com.instagram.common.typedurl.ImageUrl;

public final class FYL implements C232262tL {
    public final ImageUrl A00;
    public final C47326Dut A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return this.A04.equals(((FYL) obj).A04);
    }

    public FYL(ImageUrl imageUrl, C47326Dut dut, String str, String str2, String str3, String str4) {
        this.A00 = imageUrl;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A01 = dut;
    }
}
