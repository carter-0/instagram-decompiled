package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.UkT  reason: case insensitive filesystem */
public final class C15904UkT extends AnonymousClass6MU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ImageUrl A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;

    public final C273914nO BkW() {
        C273924nP r0;
        C273914nO r1 = new C273914nO();
        if (this.A0M) {
            r0 = C273924nP.ANIMATED_STICKERS;
        } else {
            r0 = C273924nP.STATIC_STICKERS;
        }
        r1.A01 = r0;
        return r1;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0B;
    }

    public C15904UkT(ImageUrl imageUrl, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A0E = str;
        this.A07 = str2;
        this.A0F = str3;
        this.A0I = str4;
        this.A0H = str5;
        this.A05 = imageUrl;
        this.A0L = z;
        this.A0J = z2;
        this.A0K = z3;
        this.A0O = z4;
        this.A0G = str6;
        this.A08 = str7;
        this.A06 = l;
        this.A0A = str8;
        this.A0C = str9;
        this.A0B = str10;
        this.A09 = str11;
        this.A0M = z5;
        this.A0N = z6;
        this.A0D = str12;
        this.A04 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public C15904UkT() {
        this(new SimpleImageUrl(""), (Long) null, "", "", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, false, false, false, false, false, false);
    }
}
