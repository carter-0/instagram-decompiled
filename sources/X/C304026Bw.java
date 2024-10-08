package X;

import android.content.Context;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.user.model.User;

/* renamed from: X.6Bw  reason: invalid class name and case insensitive filesystem */
public final class C304026Bw extends 0Yg implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C270284gU A01;
    public final /* synthetic */ C299665vd A02;
    public final /* synthetic */ C299635va A03;
    public final /* synthetic */ C2364233r A04;
    public final /* synthetic */ TifuViewModel A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ C262224Cq A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C304026Bw(Context context, C270284gU r3, C299665vd r4, C299635va r5, C2364233r r6, TifuViewModel tifuViewModel, User user, C62320sa r9, 0sP r10, C262224Cq r11, boolean z) {
        super(2);
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = tifuViewModel;
        this.A04 = r6;
        this.A08 = r10;
        this.A07 = r9;
        this.A0A = z;
        this.A09 = r11;
        this.A06 = user;
        this.A00 = context;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r13 = (C286575Wy) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1103905387, "com.instagram.feed.tifu.TifuNetegoComposeBinder.TifuRoot.<anonymous> (TifuNetegoComposeBinder.kt:212)");
            }
            C270284gU r36 = this.A01;
            AnonymousClass5vX r12 = (AnonymousClass5vX) r36.getValue();
            C299635va r17 = this.A03;
            C299665vd r35 = this.A02;
            r13.ExS(-70493463);
            TifuViewModel tifuViewModel = this.A05;
            boolean AGu = r13.AGu(tifuViewModel);
            C2364233r r10 = this.A04;
            boolean AGw = AGu | r13.AGw(r10);
            Object ECw = r13.ECw();
            if (AGw || ECw == AnonymousClass5XT.A00) {
                ECw = new C377409Ls(17, tifuViewModel, r10);
                r13.FLL(ECw);
            }
            C62320sa r9 = (C62320sa) ECw;
            C286565Wx r8 = (C286565Wx) r13;
            C286565Wx.A0L(r8, false);
            r13.ExS(-70487397);
            boolean AGw2 = r13.AGw(r10) | r13.AGu(tifuViewModel);
            Object ECw2 = r13.ECw();
            if (AGw2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C377409Ls(18, tifuViewModel, r10);
                r13.FLL(ECw2);
            }
            C62320sa r6 = (C62320sa) ECw2;
            C286565Wx.A0L(r8, false);
            0sP r16 = this.A08;
            C62320sa r15 = this.A07;
            r13.ExS(-70473218);
            boolean AGu2 = r13.AGu(tifuViewModel);
            Object ECw3 = r13.ECw();
            if (AGu2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C377259Ld(tifuViewModel, 25);
                r13.FLL(ECw3);
            }
            0sP r5 = (0sP) ECw3;
            C286565Wx.A0L(r8, false);
            r13.ExS(-70479777);
            boolean AGu3 = r13.AGu(tifuViewModel);
            Object ECw4 = r13.ECw();
            if (AGu3 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = new C377259Ld(tifuViewModel, 26);
                r13.FLL(ECw4);
            }
            0sP r4 = (0sP) ECw4;
            C286565Wx.A0L(r8, false);
            r13.ExS(-70477079);
            boolean AGu4 = r13.AGu(tifuViewModel);
            Object ECw5 = r13.ECw();
            if (AGu4 || ECw5 == AnonymousClass5XT.A00) {
                ECw5 = new AnonymousClass9LZ(tifuViewModel, 30);
                r13.FLL(ECw5);
            }
            0sL r3 = (0sL) ECw5;
            C286565Wx.A0L(r8, false);
            r13.ExS(-70470673);
            boolean AGu5 = r13.AGu(tifuViewModel);
            Object ECw6 = r13.ECw();
            if (AGu5 || ECw6 == AnonymousClass5XT.A00) {
                ECw6 = new C377219Kz(tifuViewModel, 15);
                r13.FLL(ECw6);
            }
            C62320sa r2 = (C62320sa) ECw6;
            C286565Wx.A0L(r8, false);
            r13.ExS(-70468063);
            boolean AGu6 = r13.AGu(tifuViewModel);
            Object ECw7 = r13.ECw();
            if (AGu6 || ECw7 == AnonymousClass5XT.A00) {
                ECw7 = new C377259Ld(tifuViewModel, 27);
                r13.FLL(ECw7);
            }
            C286565Wx.A0L(r8, false);
            AnonymousClass5vX r18 = r12;
            C62320sa r19 = r9;
            C62320sa r20 = r6;
            C286575Wy r152 = r13;
            C299665vd r162 = r35;
            C304036Bx.A00(r152, r162, r17, r18, r19, r20, r15, r2, r16, r5, r4, (0sP) ECw7, r3, 0, 0, 45056, false, false, this.A0A, false);
            if (((AnonymousClass5vX) r36.getValue()).A0A) {
                r13.ExS(-70460078);
                C262224Cq r22 = this.A09;
                boolean AGw3 = r13.AGw(r22) | r13.AGu(tifuViewModel);
                Object ECw8 = r13.ECw();
                if (AGw3 || ECw8 == AnonymousClass5XT.A00) {
                    ECw8 = new C58186Inq(8, r22, tifuViewModel);
                    r13.FLL(ECw8);
                }
                C62320sa r52 = (C62320sa) ECw8;
                C286565Wx.A0L(r8, false);
                r13.ExS(-70455727);
                boolean AGw4 = r13.AGw(r22) | r13.AGu(tifuViewModel);
                Object ECw9 = r13.ECw();
                if (AGw4 || ECw9 == AnonymousClass5XT.A00) {
                    ECw9 = new J6S(29, r22, tifuViewModel);
                    r13.FLL(ECw9);
                }
                0sP r42 = (0sP) ECw9;
                C286565Wx.A0L(r8, false);
                r13.ExS(-70451415);
                boolean AGw5 = r13.AGw(r10);
                User user = this.A06;
                Context context = this.A00;
                boolean AGw6 = AGw5 | r13.AGw(user) | r13.AGw(context);
                Object ECw10 = r13.ECw();
                if (AGw6 || ECw10 == AnonymousClass5XT.A00) {
                    ECw10 = new C58195Inz(38, context, r10, user);
                    r13.FLL(ECw10);
                }
                C286565Wx.A0L(r8, false);
                C54853HVk.A00(r13, user.getUsername(), r52, (C62320sa) ECw10, r42, 0);
            }
            if (0fL.A02()) {
                0fL.A00(1986706993);
            }
        } else {
            r13.Evl();
        }
        return C60340gF.A00;
    }
}
