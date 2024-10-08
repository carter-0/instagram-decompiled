package X;

import com.instagram.user.model.User;

/* renamed from: X.N5z  reason: case insensitive filesystem */
public final class C68210N5z extends AnonymousClass0T0 implements C232262tL {
    public boolean A00;
    public final C266444Yx A01;
    public final C266444Yx A02;
    public final C266444Yx A03;
    public final C273014lo A04;
    public final C273014lo A05;
    public final User A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;

    public /* synthetic */ C68210N5z(C266444Yx r8, C266444Yx r9, C273014lo r10, User user, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        C52255GKw gKw = null;
        C273014lo r2 = null;
        r8 = (i & 4) != 0 ? JUH.A00("") : r8;
        r10 = (i & 8) != 0 ? C273014lo.SECONDARY : r10;
        if ((i & 16) != 0) {
            num2 = AnonymousClass05K.A0Y;
        } else {
            num2 = null;
        }
        gKw = (i & 32) != 0 ? JUH.A00("") : gKw;
        r2 = (i & 64) != 0 ? C273014lo.UNKNOWN : r2;
        boolean A1Q = C51966G9m.A1Q(i & 128, z);
        boolean A1Q2 = C51966G9m.A1Q(i & 256, z2);
        r9 = (i & 1024) != 0 ? JUH.A00("") : r9;
        0qQ.A0B(user, 1);
        C51974G9v.A0d(3, r8, r10, num2, gKw);
        0qQ.A0B(r2, 7);
        0qQ.A0B(r9, 11);
        this.A06 = user;
        this.A07 = num;
        this.A02 = r8;
        this.A04 = r10;
        this.A08 = num2;
        this.A03 = gKw;
        this.A05 = r2;
        this.A00 = A1Q;
        this.A09 = A1Q2;
        this.A01 = r9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68210N5z) {
                C68210N5z n5z = (C68210N5z) obj;
                if (!(0qQ.A0K(this.A06, n5z.A06) && this.A07 == n5z.A07 && 0qQ.A0K(this.A02, n5z.A02) && this.A04 == n5z.A04 && this.A08 == n5z.A08 && 0qQ.A0K(this.A03, n5z.A03) && this.A05 == n5z.A05 && this.A00 == n5z.A00 && this.A09 == n5z.A09 && 0qQ.A0K(this.A01, n5z.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06.getId();
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0K(this.A06) + C69810NsX.A00(this.A07)) * 31);
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A07(this.A04, A072) + C69810NsX.A00(this.A08)) * 31)))) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
