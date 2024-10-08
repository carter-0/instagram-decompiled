package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7F4  reason: invalid class name */
public final class AnonymousClass7F4 implements C232262tL, C331837So {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C376629Is A04;
    public final MessageIdentifier A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final C327637Bp A0F;

    public AnonymousClass7F4(C376629Is r2, C327637Bp r3, MessageIdentifier messageIdentifier, String str, String str2, String str3, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(str, 1);
        this.A09 = str;
        this.A03 = j;
        this.A02 = i;
        this.A04 = r2;
        this.A0F = r3;
        this.A0C = z;
        this.A0E = z2;
        this.A0B = z3;
        this.A0A = z4;
        this.A05 = messageIdentifier;
        this.A0D = z5;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = str2;
        this.A06 = str3;
        this.A08 = String.valueOf(j);
    }

    /* renamed from: A00 */
    public final boolean isContentSame(AnonymousClass7F4 r6) {
        0qQ.A0B(r6, 0);
        if (this.A03 == r6.A03 && 0qQ.A0K(this.A09, r6.A09) && 0qQ.A0K(this.A04, r6.A04) && this.A0C == r6.A0C && this.A0E == r6.A0E) {
            return true;
        }
        return false;
    }

    public final long C7Z() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A08;
    }

    public final int getType() {
        return 57;
    }
}
