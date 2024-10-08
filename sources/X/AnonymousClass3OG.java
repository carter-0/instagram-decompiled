package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3OG  reason: invalid class name */
public abstract class AnonymousClass3OG {
    public static final 1Xj A00(C231332rR r4, C238133Ar r5, int i) {
        0qQ.A0B(r4, 1);
        int BCl = i - r5.BCl();
        if (BCl >= r4.getCount()) {
            return null;
        }
        Object item = r4.getItem(BCl);
        if (item instanceof 1Xl) {
            return ((1Xl) item).BPf();
        }
        if (!(item instanceof AnonymousClass5GH) || !(r4 instanceof AnonymousClass2rI)) {
            return null;
        }
        AnonymousClass5GH r2 = (AnonymousClass5GH) item;
        AnonymousClass2rI r42 = (AnonymousClass2rI) r4;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r42, 1);
        return r42.A0S.A02(r2.A00).A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r5.BQr(r3).A35 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3V3 A01(com.instagram.common.session.UserSession r4, X.C231332rR r5, X.C238133Ar r6, int r7) {
        /*
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 3
            X.0qQ.A0B(r4, r0)
            X.1Xj r3 = A00(r5, r6, r7)
            r2 = 0
            if (r3 == 0) goto L_0x0031
            boolean r0 = r3.A5p()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r3.CcK()
            if (r0 == 0) goto L_0x0024
            X.3W1 r0 = r5.BQr(r3)
            boolean r0 = r0.A35
            r1 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            boolean r0 = A04(r4, r5, r3)
            if (r0 != 0) goto L_0x002d
            if (r1 == 0) goto L_0x0031
        L_0x002d:
            X.3V3 r2 = X.C253923rd.A09(r3, r6, r7)
        L_0x0031:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OG.A01(com.instagram.common.session.UserSession, X.2rR, X.3Ar, int):X.3V3");
    }

    public static final void A02(UserSession userSession, AnonymousClass3V3 r9, C232722uK r10) {
        SlideInAndOutIconView A01;
        SlideInAndOutIconView A012;
        if (userSession != null && C238173Av.A00(userSession)) {
            AnonymousClass3W1 BQq = r9.BQq();
            View BQB = r9.BQB();
            if (BQq != null && BQB != null && !BQq.A30) {
                Rect rect = new Rect();
                BQB.getLocalVisibleRect(rect);
                if (rect.bottom < BQB.getHeight() || ((double) (rect.bottom - rect.top)) < ((double) BQB.getHeight()) * 0.5d) {
                    AnonymousClass3TS Adf = r9.Adf();
                    if (!(Adf == null || (A01 = Adf.A01()) == null)) {
                        A01.setIcon(r10.A0H.getDrawable(R.drawable.spinsta_data_white));
                        A01.setText((String) null);
                        A01.setVisibility(0);
                    }
                    C232722uK.A05(AnonymousClass4Lc.ZERO_RATING_NUX, r10);
                    return;
                }
                String str = null;
                1R7 C82 = AnonymousClass1Qz.A00(r10.A0K).C82();
                0qQ.A07(C82);
                C266444Yx A00 = C70348O3a.A00(C82, "");
                C232822uV r3 = C232822uV.A0A;
                AnonymousClass3TS Adf2 = r9.Adf();
                if (!(Adf2 == null || (A012 = Adf2.A01()) == null)) {
                    Context context = r10.A0H;
                    A012.setIcon(context.getDrawable(R.drawable.spinsta_data_white));
                    A012.A02 = C232812uU.SLIDE_IN;
                    if (A00 != null) {
                        str = C66909Mes.A00(context, A00).toString();
                    }
                    A012.setText(str);
                }
                AnonymousClass3W1 BQq2 = r9.BQq();
                if (BQq2 != null) {
                    0qQ.A0A(r3);
                    BQq2.A0H(A00, r3, R.drawable.spinsta_data_white);
                }
                C232722uK.A05(AnonymousClass4Lc.ZERO_RATING_NUX, r10);
                BQq.A30 = true;
            }
        }
    }

    public static final boolean A04(UserSession userSession, C231332rR r4, Object obj) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(userSession, 2);
        if (obj instanceof AnonymousClass3Y6) {
            return !((AnonymousClass3Y6) obj).A0M.isEmpty();
        }
        if (!(obj instanceof 1Xj)) {
            return false;
        }
        1Xj r5 = (1Xj) obj;
        AnonymousClass3W1 BQr = r4.BQr(r5);
        if (r5.A5D()) {
            1Xj A1c = r5.A1c(BQr.A03);
            if (A1c == null || !A1c.A6W(userSession)) {
                return false;
            }
            return true;
        } else if (r5.A5H()) {
            return r5.A1b().A6W(userSession);
        } else {
            return r5.A6W(userSession);
        }
    }

    public static final boolean A05(C52761GcE gcE, AnonymousClass3OB r7, long j, boolean z, boolean z2) {
        boolean z3 = false;
        0qQ.A0B(r7, 0);
        if (!z || z2) {
            AnonymousClass3OB r0 = AnonymousClass3OB.IDLE;
            if (gcE != null) {
                if (r7 == r0) {
                    return true;
                }
                z3 = false;
                if (r7 == AnonymousClass3OB.PAUSED) {
                    return true;
                }
            } else if ((r7 == r0 || r7 == AnonymousClass3OB.PAUSED) && Math.abs(j) <= 7000) {
                return true;
            } else {
                return false;
            }
        }
        return z3;
    }

    public static final void A03(AnonymousClass3V3 r1, C245853da r2) {
        AnonymousClass3V4 r0;
        if ((r1 instanceof AnonymousClass4EA) && (r0 = ((AnonymousClass4EA) r1).A0J) != null) {
            r0.A00(r2);
        }
    }
}
