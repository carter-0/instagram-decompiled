package X;

import android.content.Context;

/* renamed from: X.Mdq  reason: case insensitive filesystem */
public final class C66857Mdq {
    public final Context A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    private final AnonymousClass0eM A00(int i) {
        return AnonymousClass0eN.A00(0eO.A02, new MJ3(i, 29, this));
    }

    public final String A01(long j, boolean z, boolean z2) {
        AnonymousClass0eM r0;
        Context context = this.A00;
        String A012 = AnonymousClass7F5.A01(context, j);
        if (z) {
            if (this.A0I) {
                return DbW.A0h(context, A012, 2131960371);
            }
            if (!this.A0J) {
                r0 = this.A0D;
            }
            return null;
        } else if (!z2 || this.A0I) {
            return A012;
        } else {
            if (!this.A0J) {
                r0 = this.A0C;
            }
            return null;
        }
        return DbS.A0t(r0);
    }

    public C66857Mdq(Context context, boolean z, boolean z2, boolean z3) {
        this.A00 = context;
        this.A0I = z;
        this.A0H = z2;
        this.A0J = z3;
        this.A0G = A00(z ? 2131960683 : 2131960697);
        this.A03 = A00(z ? 2131958638 : 2131958637);
        this.A0E = A00(z ? 2131960679 : 2131960696);
        this.A01 = A00(z ? 2131958635 : 2131958634);
        this.A0B = A00(z ? 2131959814 : 2131959815);
        this.A0A = A00(z ? 2131959813 : 2131959812);
        this.A0F = A00(2131960682);
        this.A02 = A00(2131958636);
        this.A07 = A00(2131959430);
        this.A05 = A00(2131959416);
        this.A08 = A00(2131959431);
        this.A06 = A00(2131959417);
        this.A0D = A00(2131960434);
        this.A0C = A00(2131960433);
        this.A09 = A00(2131960681);
        this.A04 = A00(2131960678);
    }

    public final String A02(Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass0eM r0;
        int intValue = num.intValue();
        if (z) {
            if (intValue != 0) {
                if (intValue != 3) {
                    return str;
                }
                if (z2) {
                    r0 = this.A0A;
                } else {
                    r0 = this.A01;
                }
            } else if (!z3 || !this.A0I) {
                if (z4) {
                    r0 = this.A06;
                } else {
                    r0 = this.A03;
                }
            } else if (!z4 || this.A0H) {
                r0 = this.A02;
            } else {
                r0 = this.A05;
            }
        } else if (intValue != 0) {
            if (intValue != 3) {
                return str;
            }
            if (z2) {
                r0 = this.A0B;
            } else {
                r0 = this.A0E;
            }
        } else if (!z3 || !this.A0I) {
            if (z4) {
                r0 = this.A08;
            } else {
                r0 = this.A0G;
            }
        } else if (!z4 || this.A0H) {
            r0 = this.A0F;
        } else {
            r0 = this.A07;
        }
        return DbS.A0t(r0);
    }
}
