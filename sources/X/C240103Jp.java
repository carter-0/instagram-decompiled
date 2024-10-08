package X;

import android.app.Activity;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Jp  reason: invalid class name and case insensitive filesystem */
public final class C240103Jp implements C240093Jo {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C240083Jn A02;
    public final /* synthetic */ AnonymousClass358 A03;

    public final float AwJ(C238133Ar r1, float f) {
        return f;
    }

    public final boolean EsH() {
        return false;
    }

    public final boolean EsI(C238133Ar r9) {
        0qQ.A0B(r9, 0);
        AnonymousClass358 r7 = this.A03;
        UserSession userSession = r7.A02;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36317560555181391L) || 182.A06(r2, userSession, 36323045229472536L)) {
            return false;
        }
        AnonymousClass359 r4 = AnonymousClass358.A06;
        C2365134a r0 = r7.A04;
        C227872kC r3 = r7.A05;
        int A002 = AnonymousClass359.A00(r0, r3);
        if (A002 == 0) {
            return false;
        }
        if (r9.B6L() < A002 || (r9.B6L() == A002 && r9.AnC(0).getHeight() + r9.AnC(0).getTop() > r4.A01(this.A01, r3, this.A00))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.182.A06(r2, r3, 36323045229472536L) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EsJ(X.C238133Ar r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.358 r4 = r5.A03
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317560555181391(0x8106a10000154f, double:3.030709761950547E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0021
            r0 = 36323045229472536(0x810b9e00102b18, double:3.0341782920572776E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r2 = 1
            if (r0 != 0) goto L_0x0044
            X.34a r1 = r4.A04
            X.2kC r0 = r4.A05
            int r1 = X.AnonymousClass359.A00(r1, r0)
            int r0 = r6.AnH()
            if (r0 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            X.3Jn r0 = r5.A02
            boolean r0 = r0.EsJ(r6)
            if (r0 != 0) goto L_0x0044
            int r0 = r6.B6L()
            if (r0 == r1) goto L_0x0044
            r2 = 0
        L_0x0044:
            return r2
        L_0x0045:
            X.3Jn r0 = r5.A02
            boolean r2 = r0.EsJ(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240103Jp.EsJ(X.3Ar):boolean");
    }

    public C240103Jp(Activity activity, C240083Jn r2, AnonymousClass358 r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = activity;
        this.A00 = i;
    }

    public final void Dtt(float f) {
        this.A02.Dtt(f);
        AnonymousClass358 r5 = this.A03;
        if (r5.A00) {
            AnonymousClass358.A00(r5, false);
        }
        C227872kC r8 = r5.A05;
        C227802jw r7 = r8.A00;
        C238213Az r0 = r7.A0B;
        if (r0 != null) {
            r0.A09();
        }
        r5.A03.A00();
        AnonymousClass3D5 r6 = r7.A0E;
        if (r6 != null) {
            C238133Ar scrollingViewProxy = r7.getScrollingViewProxy();
            int B6L = r7.getScrollingViewProxy().B6L();
            r6.A01 = B6L;
            r6.A00 = ((float) AnonymousClass358.A06.A01(this.A01, r8, this.A00)) - f;
            AnonymousClass3D5.A00(scrollingViewProxy, r6, B6L);
        }
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = r7.A0A().A0H().A08;
        if (actionBarTitleViewSwitcher != null) {
            Activity activity = this.A01;
            C227762js r2 = r5.A01;
            if (r2.A01 < 2.0f) {
                C292425iv.A00(activity, actionBarTitleViewSwitcher, r2, r5.A02);
            }
        }
    }

    public final /* synthetic */ boolean E3Y() {
        return false;
    }

    public final /* synthetic */ boolean Es8() {
        return true;
    }
}
