package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LiU  reason: case insensitive filesystem */
public final class C64809LiU implements C232262tL {
    public final int A00;
    public final ImageUrl A01;
    public final C247733gp A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C64809LiU(ImageUrl imageUrl, C247733gp r3, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A01 = imageUrl;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = l;
        this.A07 = z;
        this.A08 = z2;
        this.A00 = i;
        this.A09 = z3;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        if (obj != null) {
            return obj.equals(this);
        }
        return false;
    }
}
