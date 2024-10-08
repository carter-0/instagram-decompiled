package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.Nem  reason: case insensitive filesystem */
public final class C69107Nem extends C71135OdY {
    public C49945FFy A00;
    public C331157Pu A01;
    public C70513O9m A02 = new C70513O9m();
    public PNV A03;
    public C72865PNb A04;
    public C72866PNc A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final C71111Ocu A09;
    public final PMP A0A;
    public final AnonymousClass0eM A0B = C73900Plb.A00(this, 19);
    public final UserSession A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69107Nem(Activity activity, UserSession userSession, C71111Ocu ocu, PMP pmp) {
        super(DbS.A0z(C72831PLt.class));
        0qQ.A0B(ocu, 3);
        this.A08 = activity;
        this.A0A = pmp;
        this.A09 = ocu;
        this.A0C = userSession;
        A0J(new C68287N9a(false, 0.0f));
        this.A0A.A01 = new C70514O9n(this);
    }

    public static final void A03(C69107Nem nem, boolean z) {
        nem.A05 = null;
        nem.A06 = false;
        View view = nem.A0A.A06;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        C331157Pu r0 = nem.A01;
        if (r0 != null) {
            r0.A07();
        }
        C71111Ocu ocu = nem.A09;
        ocu.A05(POJ.A00);
        if (z) {
            C68287N9a n9a = (C68287N9a) nem.A01;
            if ((n9a == null || !n9a.A01) && nem.A01 == null) {
                ocu.A05(new PN4(false));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C69107Nem r5) {
        /*
            X.Pry r2 = r5.A01
            r0 = r2
            X.N9a r0 = (X.C68287N9a) r0
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.A01
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r4 = r0 ^ 1
            r3 = 0
            if (r2 == 0) goto L_0x002d
            r2 = 0
            r1 = 0
            X.N9a r0 = new X.N9a
            r0.<init>(r2, r1)
        L_0x0019:
            r5.A0J(r0)
            A03(r5, r4)
            r5.A03 = r3
            X.FFy r0 = r5.A00
            if (r0 == 0) goto L_0x0028
            r0.A02()
        L_0x0028:
            r5.A00 = r3
            r5.A04 = r3
            return
        L_0x002d:
            r0 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69107Nem.A00(X.Nem):void");
    }

    public static final void A01(C69107Nem nem) {
        C68287N9a n9a = (C68287N9a) nem.A01;
        if ((n9a != null && n9a.A01) || nem.A01 != null) {
            nem.A09.A05(new PN4(true));
        }
    }

    public static final void A02(C69107Nem nem, C72866PNc pNc) {
        nem.A06 = pNc.A02;
        nem.A0A.A01(pNc.A03);
        C331157Pu r2 = pNc.A01;
        r2.A02(nem.A08, pNc.A00);
        nem.A01 = r2;
        nem.A09.A05(POE.A00);
        A01(nem);
    }

    public static final boolean A04(C69107Nem nem) {
        C68287N9a n9a = (C68287N9a) nem.A01;
        if (n9a == null || !n9a.A01) {
            return false;
        }
        LinkedList linkedList = nem.A02.A00;
        if (linkedList.size() <= 1) {
            A00(nem);
            return true;
        } else if (linkedList.size() > 1) {
            linkedList.removeLast();
            PMP pmp = nem.A0A;
            AnonymousClass0eM r6 = pmp.A08;
            int childCount = C66583MXo.A0C(r6).getChildCount();
            if (childCount == 1) {
                View childAt = C66583MXo.A0C(r6).getChildAt(0);
                if (childAt != null) {
                    C66583MXo.A0C(r6).removeView(childAt);
                    childAt.setVisibility(0);
                }
            } else if (childCount > 1) {
                View childAt2 = C66583MXo.A0C(r6).getChildAt(childCount - 1);
                C66583MXo.A0C(r6).getChildAt(childCount - 2).setVisibility(0);
                C66580MXl.A1D(C66583MXo.A0D(childAt2.animate().translationX(AnonymousClass7TE.A02(childAt2))), new C73263PZh(childAt2, pmp));
            }
            if (nem.A07) {
                View view = pmp.A03;
                view.clearFocus();
                0nA.A0N(view);
            }
            return true;
        } else {
            throw AnonymousClass7TE.A0z("Back stack should have multiple sheets when attempting to navigate back. Ensure [#canNavigateBack] is checked before calling this method.");
        }
    }
}
