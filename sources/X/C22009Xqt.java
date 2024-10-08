package X;

import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Xqt  reason: case insensitive filesystem */
public final class C22009Xqt {
    public static final C21484Xcb A0K = new C21484Xcb(Pxe.A0p());
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C21982Xoc A05;
    public final Timeline A06;
    public final XGY A07;
    public final C21484Xcb A08;
    public final C21484Xcb A09;
    public final C21975XoM A0A;
    public final C21405XaD A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public volatile long A0G;
    public volatile long A0H;
    public volatile long A0I;
    public volatile long A0J;

    public static C22009Xqt A00(C21405XaD xaD) {
        Timeline timeline = Timeline.A00;
        C21484Xcb xcb = A0K;
        return new C22009Xqt(C21982Xoc.A03, timeline, (XGY) null, xcb, xcb, C21975XoM.A02, xaD, ImmutableList.of(), 1, 1, 0, -9223372036854775807L, 0, 0, 0, 0, 0, false, false, false);
    }

    public final C22009Xqt A02(int i) {
        Timeline timeline = this.A06;
        C21484Xcb xcb = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        XGY xgy = this.A07;
        boolean z = this.A0D;
        C21975XoM xoM = this.A0A;
        C21405XaD xaD = this.A0B;
        List list = this.A0C;
        C21484Xcb xcb2 = this.A08;
        boolean z2 = this.A0E;
        int i2 = this.A00;
        int i3 = this.A02;
        C21982Xoc xoc = this.A05;
        C21484Xcb xcb3 = xcb2;
        C21405XaD xaD2 = xaD;
        List list2 = list;
        return new C22009Xqt(xoc, timeline, xgy, xcb, xcb3, xoM, xaD2, list2, i, i2, i3, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final C22009Xqt A03(int i, int i2, boolean z) {
        Timeline timeline = this.A06;
        C21484Xcb xcb = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i3 = this.A01;
        XGY xgy = this.A07;
        boolean z2 = this.A0D;
        C21975XoM xoM = this.A0A;
        C21405XaD xaD = this.A0B;
        List list = this.A0C;
        C21484Xcb xcb2 = this.A08;
        C21982Xoc xoc = this.A05;
        long j3 = this.A0G;
        long j4 = this.A0J;
        long j5 = this.A0I;
        boolean z3 = z2;
        C21975XoM xoM2 = xoM;
        C21405XaD xaD2 = xaD;
        int i4 = i3;
        return new C22009Xqt(xoc, timeline, xgy, xcb, xcb2, xoM2, xaD2, list, i4, i, i2, j, j2, j3, j4, j5, this.A0H, z3, z, this.A0F);
    }

    public final C22009Xqt A04(Timeline timeline) {
        C21484Xcb xcb = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        XGY xgy = this.A07;
        boolean z = this.A0D;
        C21975XoM xoM = this.A0A;
        C21405XaD xaD = this.A0B;
        List list = this.A0C;
        C21484Xcb xcb2 = this.A08;
        boolean z2 = this.A0E;
        int i2 = this.A00;
        int i3 = this.A02;
        C21982Xoc xoc = this.A05;
        C21484Xcb xcb3 = xcb2;
        List list2 = list;
        return new C22009Xqt(xoc, timeline, xgy, xcb, xcb3, xoM, xaD, list2, i, i2, i3, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final C22009Xqt A05(XGY xgy) {
        Timeline timeline = this.A06;
        C21484Xcb xcb = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        boolean z = this.A0D;
        C21975XoM xoM = this.A0A;
        C21405XaD xaD = this.A0B;
        List list = this.A0C;
        C21484Xcb xcb2 = this.A08;
        boolean z2 = this.A0E;
        int i2 = this.A00;
        int i3 = this.A02;
        C21982Xoc xoc = this.A05;
        C21484Xcb xcb3 = xcb2;
        List list2 = list;
        return new C22009Xqt(xoc, timeline, xgy, xcb, xcb3, xoM, xaD, list2, i, i2, i3, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final C22009Xqt A06(C21484Xcb xcb) {
        Timeline timeline = this.A06;
        C21484Xcb xcb2 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        XGY xgy = this.A07;
        boolean z = this.A0D;
        C21975XoM xoM = this.A0A;
        C21405XaD xaD = this.A0B;
        List list = this.A0C;
        boolean z2 = this.A0E;
        int i2 = this.A00;
        int i3 = this.A02;
        C21982Xoc xoc = this.A05;
        C21975XoM xoM2 = xoM;
        C21405XaD xaD2 = xaD;
        List list2 = list;
        return new C22009Xqt(xoc, timeline, xgy, xcb2, xcb, xoM2, xaD2, list2, i, i2, i3, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final boolean A07() {
        if (this.A01 == 3 && this.A0E && this.A02 == 0) {
            return true;
        }
        return false;
    }

    public final long A01() {
        long j;
        long j2;
        if (!A07()) {
            return this.A0I;
        }
        do {
            j = this.A0H;
            j2 = this.A0I;
        } while (j != this.A0H);
        return Util.A03(Util.A04(j2) + ((long) (((float) (SystemClock.elapsedRealtime() - j)) * 1.0f)));
    }

    public C22009Xqt(C21982Xoc xoc, Timeline timeline, XGY xgy, C21484Xcb xcb, C21484Xcb xcb2, C21975XoM xoM, C21405XaD xaD, List list, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A06 = timeline;
        this.A09 = xcb;
        this.A04 = j;
        this.A03 = j2;
        this.A01 = i;
        this.A07 = xgy;
        this.A0D = z;
        this.A0A = xoM;
        this.A0B = xaD;
        this.A0C = list;
        this.A08 = xcb2;
        this.A0E = z2;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = xoc;
        this.A0G = j3;
        this.A0J = j4;
        this.A0I = j5;
        this.A0H = j6;
        this.A0F = z3;
    }
}
