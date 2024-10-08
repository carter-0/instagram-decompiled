package X;

import java.util.List;

/* renamed from: X.GUu  reason: case insensitive filesystem */
public final class C52492GUu extends C308786Vp {
    public final int A00;
    public final C233402vf A01;
    public final C249863kU A02;

    public final int A03(C233472vm r9, int i, int i2, int i3) {
        0qQ.A0B(r9, 0);
        return A02(i, i2, i3, A01(i3, r9.A03()), r9.A07(), r9.A08());
    }

    public final 1PW A08(List list) {
        0qQ.A0B(list, 0);
        1PW A08 = super.A08(list);
        int i = this.A00;
        int A05 = A05(list);
        if (A05 == -1) {
            A05 = this.A00;
        }
        A08.A09 = i - A05;
        return A08;
    }

    public final void A0G(1PW r2, int i, int i2, int i3, int i4) {
        0qQ.A0B(r2, 0);
        super.A0G(r2, i, i2, i3, i4);
        int i5 = -1;
        if (i != -1) {
            i5 = (i3 - i) - 1;
        }
        r2.A09 = i5;
    }

    public final boolean A0K(C233472vm r2) {
        return false;
    }

    public /* synthetic */ C52492GUu(C228812mN r4, C233402vf r5, C249863kU r6, int i) {
        super(new C233672wA(), new C233512vq(r4), true);
        this.A02 = r6;
        this.A00 = i;
        this.A01 = r5;
    }

    public final int A01(int i, int i2) {
        return Math.max(this.A00 + i2, i + 1);
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        return C51969G9p.A0l(obj).getPosition();
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        return GV8.A00(obj);
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        return this.A01.BTe(C51969G9p.A0l(obj).getPosition());
    }

    public final boolean A0H(C252093oY r4, 1PW r5, C233472vm r6, int i, int i2, int i3) {
        C51972G9s.A1D(r6, r5);
        if (this.A02.A02.isEmpty() || this.A0D.size() < r6.A07()) {
            return false;
        }
        r5.A01("consumed_media_gap_did_meet");
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean A0I(C252093oY r2, C233472vm r3, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
