package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6J3  reason: invalid class name */
public final class AnonymousClass6J3 implements AnonymousClass6J4 {
    public final long A00;
    public final AnonymousClass6J0 A01;
    public final C305586Iq A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ C305586Iq A09;
    public final /* synthetic */ C287265Zr A0A;
    public final /* synthetic */ C287245Zp A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public AnonymousClass6J3(AnonymousClass6J0 r4, LazyListState lazyListState, C305586Iq r6, C287265Zr r7, C287245Zp r8, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int i5;
        int A002;
        this.A0C = z;
        this.A09 = r6;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = r7;
        this.A0B = r8;
        this.A0D = z2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = j2;
        this.A08 = lazyListState;
        this.A01 = r4;
        this.A02 = r6;
        if (z) {
            i5 = Constraints.A01(j);
            A002 = Integer.MAX_VALUE;
        } else {
            i5 = Integer.MAX_VALUE;
            A002 = Constraints.A00(j);
        }
        this.A00 = AnonymousClass5SF.A04(0, i5, 0, A002);
    }

    public final AnonymousClass6JK A00(int i, long j) {
        int i2;
        AnonymousClass6J0 r0 = this.A01;
        int i3 = i;
        Object BK0 = r0.BK0(i3);
        Object Aqn = r0.Aqn(i3);
        long j2 = j;
        List Cnw = this.A02.Cnw(i3, j2);
        if (i3 == this.A05 - 1) {
            i2 = 0;
        } else {
            i2 = this.A06;
        }
        boolean z = this.A0C;
        C287265Zr r13 = this.A0A;
        C287245Zp r14 = this.A0B;
        AnonymousClass5Q8 layoutDirection = this.A09.getLayoutDirection();
        boolean z2 = this.A0D;
        int i4 = this.A04;
        int i5 = this.A03;
        long j3 = j2;
        return new AnonymousClass6JK(this.A08.A0D, r13, r14, layoutDirection, BK0, Aqn, Cnw, i3, i4, i5, i2, this.A07, j3, z, z2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass6JL AbW(int i, int i2, int i3, long j) {
        return A00(i, j);
    }
}
