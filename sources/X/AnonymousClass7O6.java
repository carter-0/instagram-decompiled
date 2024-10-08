package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.7O6  reason: invalid class name */
public final class AnonymousClass7O6 implements C232262tL, C331837So {
    public long A00;
    public C327637Bp A01;
    public Integer A02;
    public String A03;
    public final int A04;
    public final Drawable A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public AnonymousClass7O6(Drawable drawable, C327637Bp r3, Integer num, String str, String str2, int i, long j, boolean z, boolean z2) {
        0qQ.A0B(str2, 2);
        this.A06 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A09 = z;
        this.A05 = drawable;
        this.A04 = i;
        this.A01 = r3;
        this.A02 = num;
        this.A08 = z2;
        this.A07 = String.valueOf(j);
    }

    public final int getType() {
        return 56;
    }

    public final long C7Z() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass7O6 r6 = (AnonymousClass7O6) obj;
        0qQ.A0B(r6, 0);
        if (this.A00 == r6.A00 && 0qQ.A0K(this.A03, r6.A03) && this.A09 == r6.A09) {
            return true;
        }
        return false;
    }
}
