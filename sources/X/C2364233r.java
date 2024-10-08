package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.user.model.User;

/* renamed from: X.33r  reason: invalid class name and case insensitive filesystem */
public final class C2364233r extends C2364333s {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass322 A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2364233r(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass322 r5, boolean z) {
        super(C2364533u.A00);
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = z;
    }

    public static final void A00(C286575Wy r26, C299665vd r27, C299635va r28, AnonymousClass5vY r29, C2364233r r30, TifuViewModel tifuViewModel, User user, 0sP r33, int i, boolean z) {
        int i2;
        C286575Wy r8 = r26;
        r8.ExV(24926339);
        int i3 = i;
        TifuViewModel tifuViewModel2 = tifuViewModel;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r8.AGu(tifuViewModel2)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        C299635va r262 = r28;
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r8.AGu(r262)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i3 & 384) == 0) {
            int i6 = 128;
            if (r8.AGu(r27)) {
                i6 = 256;
            }
            i2 |= i6;
        }
        AnonymousClass5vY r25 = r29;
        if ((i3 & 3072) == 0) {
            int i7 = 1024;
            if (r8.AGw(r25)) {
                i7 = C249703kE.FLAG_MOVED;
            }
            i2 |= i7;
        }
        0sP r22 = r33;
        if ((i3 & 24576) == 0) {
            int i8 = 8192;
            if (r8.AGw(r22)) {
                i8 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i2 |= i8;
        }
        User user2 = user;
        if ((196608 & i) == 0) {
            boolean AGw = r8.AGw(user2);
            int i9 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AGw) {
                i9 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i2 |= i9;
        }
        boolean z2 = z;
        if ((1572864 & i) == 0) {
            boolean AGv = r8.AGv(z2);
            int i10 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AGv) {
                i10 = Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
            }
            i2 |= i10;
        }
        C2364233r r7 = r30;
        if ((12582912 & i) == 0) {
            int i11 = 4194304;
            if (r8.AGw(r7)) {
                i11 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i2 |= i11;
        }
        if ((4793491 & i2) != 4793490 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-832714336, "com.instagram.feed.tifu.TifuNetegoComposeBinder.TifuRoot (TifuNetegoComposeBinder.kt:181)");
            }
            Object ECw = r8.ECw();
            Object obj = AnonymousClass5XT.A00;
            if (ECw == obj) {
                ECw = new AnonymousClass6FV(C286645Xf.A00(r8, 19B.A00));
                r8.FLL(ECw);
            }
            C262224Cq r11 = ((AnonymousClass6FV) ECw).A00;
            r8.ExS(1651372372);
            int i12 = i2 & 14;
            boolean z3 = false;
            boolean z4 = false;
            if (i12 == 4) {
                z4 = true;
            }
            Object ECw2 = r8.ECw();
            if (z4 || ECw2 == obj) {
                ECw2 = new C376909Ju(tifuViewModel2, (AnonymousClass4D7) null, 22);
                r8.FLL(ECw2);
            }
            C286565Wx r4 = (C286565Wx) r8;
            C286565Wx.A0L(r4, false);
            19B r3 = 19B.A00;
            Integer num = AnonymousClass05K.A00;
            1Eo.A03(num, r3, (0sL) ECw2, r11);
            r8.ExS(1651373974);
            if (r7.A04) {
                if (182.A06(0Tu.A05, r7.A02, 36326339469457118L)) {
                    r8.ExS(1651379196);
                    boolean z5 = false;
                    if (i12 == 4) {
                        z5 = true;
                    }
                    Object ECw3 = r8.ECw();
                    if (z5 || ECw3 == obj) {
                        ECw3 = new C376909Ju(tifuViewModel2, (AnonymousClass4D7) null, 23);
                        r8.FLL(ECw3);
                    }
                    C286565Wx.A0L(r4, false);
                    1Eo.A03(num, r3, (0sL) ECw3, r11);
                    r8.ExS(1651381563);
                    boolean z6 = false;
                    if (i12 == 4) {
                        z6 = true;
                    }
                    Object ECw4 = r8.ECw();
                    if (z6 || ECw4 == obj) {
                        ECw4 = new C376909Ju(tifuViewModel2, (AnonymousClass4D7) null, 24);
                        r8.FLL(ECw4);
                    }
                    C286565Wx.A0L(r4, false);
                    1Eo.A03(num, r3, (0sL) ECw4, r11);
                }
            }
            C286565Wx.A0L(r4, false);
            C270284gU A022 = AnonymousClass6FW.A02(r8, tifuViewModel2.A0G, 0);
            Context context = (Context) r8.AJO(AndroidCompositionLocals_androidKt.A01);
            r8.ExS(1651388151);
            boolean AGw2 = r8.AGw(r7);
            boolean z7 = false;
            if (i12 == 4) {
                z7 = true;
            }
            boolean z8 = AGw2 | z7;
            Object ECw5 = r8.ECw();
            if (z8 || ECw5 == obj) {
                ECw5 = new C377409Ls(19, tifuViewModel2, r7);
                r8.FLL(ECw5);
            }
            C62320sa r2 = (C62320sa) ECw5;
            C286565Wx.A0L(r4, false);
            r8.ExS(1651397599);
            boolean AGw3 = r8.AGw(r11);
            boolean z9 = false;
            if (i12 == 4) {
                z9 = true;
            }
            boolean AGw4 = AGw3 | z9 | r8.AGw(r7);
            Object ECw6 = r8.ECw();
            if (AGw4 || ECw6 == obj) {
                ECw6 = new AnonymousClass9MC(22, r7, r11, tifuViewModel2);
                r8.FLL(ECw6);
            }
            0sP r14 = (0sP) ECw6;
            C286565Wx.A0L(r4, false);
            0qQ.A0B(r14, 0);
            r25.A00 = r14;
            r8.ExS(1651402625);
            boolean AGw5 = r8.AGw(r11);
            if (i12 == 4) {
                z3 = true;
            }
            boolean z10 = AGw5 | z3;
            Object ECw7 = r8.ECw();
            if (z10 || ECw7 == obj) {
                ECw7 = new C377449Lw(12, r11, tifuViewModel2);
                r8.FLL(ECw7);
            }
            0sL r9 = (0sL) ECw7;
            C286565Wx.A0L(r4, false);
            0qQ.A0B(r9, 0);
            r25.A01 = r9;
            C286885Ye.A03(r8, r7.A02, r7.A01.getModuleName(), AnonymousClass5PI.A01(r8, new C304026Bw(context, A022, r27, r262, r7, tifuViewModel2, user2, r2, r22, r11, z2), -1060022731), 196608, 28, false, false, false);
            if (0fL.A02()) {
                0fL.A00(-1419730718);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBF(r7, tifuViewModel2, r262, r27, r25, r22, user2, i3, 0, z2);
        }
    }
}
