package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.WSh  reason: case insensitive filesystem */
public final class C19274WSh implements C232262tL {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C61052Jvq A03;
    public final ImageUrl A04;
    public final User A05;
    public final C391379sn A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.A02);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19274WSh wSh = (C19274WSh) obj;
        0qQ.A0B(wSh, 0);
        if (this.A02 == wSh.A02 && 0qQ.A0K(this.A07, wSh.A07) && 0qQ.A0K(this.A05, wSh.A05) && this.A01 == wSh.A01 && this.A0C == wSh.A0C && this.A0B == wSh.A0B && this.A06 == wSh.A06 && 0qQ.A0K(this.A03, wSh.A03)) {
            return true;
        }
        return false;
    }

    public C19274WSh(C61052Jvq jvq, ImageUrl imageUrl, User user, C391379sn r4, String str, float f, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = j;
        this.A07 = str;
        this.A04 = imageUrl;
        this.A05 = user;
        this.A01 = i;
        this.A00 = f;
        this.A08 = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A06 = r4;
        this.A03 = jvq;
    }
}
