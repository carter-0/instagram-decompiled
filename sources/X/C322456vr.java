package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6vr  reason: invalid class name and case insensitive filesystem */
public final class C322456vr {
    public int A00 = 0;
    public 2da A01;
    public boolean A02 = false;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final Runnable A06 = new C322466vs(this);

    public static void A00(UserSession userSession, C322456vr r12, int i) {
        2aX r3 = new 2aX(2aD.A06, r12.A00);
        AnonymousClass2g1 r2 = AnonymousClass2g1.PROFILE_PAGE;
        C226252fx r1 = C226252fx.NUMBERED;
        if (i == 2) {
            2aN.A00(userSession).A00().A00.AHZ();
            2aN.A00(userSession).A00().A02(r1, r2, r3);
            2aV A012 = 2aN.A00(userSession).A01();
            2aX r4 = new 2aX(2aD.A0p, r12.A00);
            AnonymousClass2g1 r22 = AnonymousClass2g1.BOTTOM_SHEET;
            0qQ.A0B(r22, 0);
            A012.A02(new C239993Jd(C226252fx.LIST_ITEM, r22, (C71062aE) null, (Set) null), r4);
            return;
        }
        UserSession userSession2 = r12.A05;
        int A002 = AnonymousClass3H7.A00(userSession2);
        int A003 = AnonymousClass3H6.A00(userSession2);
        int A004 = AnonymousClass3H5.A00(userSession);
        int i2 = 0;
        if (A004 > 0) {
            i2 = 1;
        }
        2aT.A00(2aN.A00(userSession).A00(), r1, r2, r3, AnonymousClass05K.A01, "click", (Map) null, A003, i2, A002, A004);
    }

    public final void A02(UserSession userSession) {
        UserSession userSession2 = this.A05;
        int A002 = AnonymousClass3H7.A00(userSession2);
        int A003 = AnonymousClass3H6.A00(userSession2);
        int A004 = AnonymousClass3H5.A00(userSession);
        int i = 1;
        int i2 = 0;
        if (A004 > 0) {
            i2 = 1;
        }
        2aT A005 = 2aN.A00(userSession).A00();
        2aX r13 = new 2aX(2aD.A06, this.A00);
        AnonymousClass2g1 r12 = AnonymousClass2g1.PROFILE_PAGE;
        C226252fx r11 = C226252fx.NUMBERED;
        Integer num = AnonymousClass05K.A01;
        A005.A04(r11, r12, r13, num, A003, i2, A002, A004);
        2aT A006 = 2aN.A00(userSession).A00();
        2aD r7 = 2aD.A0b;
        int i3 = 0;
        if (this.A00 > 0) {
            i3 = 1;
        }
        2aX r1 = new 2aX(r7, i3);
        AnonymousClass2g1 r6 = AnonymousClass2g1.BOTTOM_NAVIGATION_BAR;
        C226252fx r3 = C226252fx.DOT;
        A006.A04(r3, r6, r1, num, A003, i2, A002, A004);
        2aV A012 = 2aN.A00(userSession).A01();
        2aX r9 = new 2aX(2aD.A0p, this.A00);
        AnonymousClass2g1 r2 = AnonymousClass2g1.BOTTOM_SHEET;
        0qQ.A0B(r2, 0);
        A012.A02(new C239993Jd(r11, r2, (C71062aE) null, (Set) null), r9);
        2aV A013 = 2aN.A00(userSession).A01();
        if (this.A00 <= 0) {
            i = 0;
        }
        2aX r14 = new 2aX(r7, i);
        0qQ.A0B(r6, 0);
        A013.A02(new C239993Jd(r3, r6, (C71062aE) null, (Set) null), r14);
    }

    public C322456vr(AnonymousClass4DH r3, UserSession userSession) {
        this.A04 = r3;
        this.A05 = userSession;
    }

    public final int A01(UserSession userSession) {
        int A002;
        if (AnonymousClass3EM.A01()) {
            A002 = AnonymousClass3H5.A01.A02(userSession, AnonymousClass3EM.A04()) + AnonymousClass3H7.A00(userSession);
        } else {
            A002 = AnonymousClass3H7.A00(userSession);
        }
        this.A00 = A002;
        return A002;
    }

    public final void A03(UserSession userSession) {
        boolean z = false;
        if (A01(userSession) > 0) {
            z = true;
        }
        2dZ r7 = this.A01;
        if (r7 != null) {
            User A012 = AnonymousClass0t1.A01.A01(this.A05);
            Context requireContext = this.A04.requireContext();
            String username = A012.getUsername();
            boolean z2 = false;
            if (A012.A0N() == AnonymousClass05K.A0C) {
                z2 = true;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(username);
            C319306qN.A00.A00(requireContext, spannableStringBuilder, z2);
            2dZ r5 = r7;
            int i = 0;
            2dZ.A0K(r5, spannableStringBuilder, true, false);
            r7.Eoo(new C319316qO(this));
            r7.EuC(true);
            boolean isVerified = A012.isVerified();
            if (isVerified) {
                2dZ.A0F(r5);
            }
            Object value = r5.A0Y.getValue();
            0qQ.A07(value);
            View view = (View) value;
            if (!isVerified) {
                i = 8;
            }
            view.setVisibility(i);
            2dZ.A0F(r5);
            Object value2 = r5.A0b.getValue();
            0qQ.A07(value2);
            View view2 = (View) value2;
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            view2.setVisibility(i2);
            Object value3 = r5.A0c.getValue();
            0qQ.A07(value3);
            ((View) value3).setVisibility(8);
            Object value4 = r5.A0d.getValue();
            0qQ.A07(value4);
            ((View) value4).setVisibility(0);
            if (z != this.A02) {
                this.A02 = z;
                A00(userSession, this, 2);
            }
            A02(userSession);
        }
    }
}
