package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.WSa  reason: case insensitive filesystem */
public final class C19267WSa implements C232262tL {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19267WSa wSa = (C19267WSa) obj;
        0qQ.A0B(wSa, 0);
        if (0qQ.A0K(this.A03, wSa.A03) && this.A06 == wSa.A06 && this.A04 == wSa.A04 && this.A05 == wSa.A05) {
            return true;
        }
        return false;
    }

    public C19267WSa(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
    }
}
