package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.782  reason: invalid class name */
public abstract class AnonymousClass782 {
    public boolean A00;
    public final Context A01;
    public final RecyclerView A02;
    public final AnonymousClass780 A03;
    public final RefreshableNestedScrollingParent A04;
    public final View.OnTouchListener A05 = new AnonymousClass783(this);
    public final C249403jg A06;
    public final C228252l5 A07;

    public final void A00() {
        if (this instanceof AnonymousClass781) {
            AnonymousClass781 r0 = (AnonymousClass781) this;
            r0.A03.FHO(new AnonymousClass9I5(!r0.A03(), 1, 1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (X.C66642MaB.A02(r0, r2) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r1 == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
        if (X.C308556Us.A0B(r3, r0, r1) == false) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            X.780 r2 = r6.A03
            if (r2 == 0) goto L_0x0011
            boolean r1 = r6.A03()
            boolean r0 = r2.A02
            if (r0 == r1) goto L_0x0011
            r2.A02 = r1
            r2.A00()
        L_0x0011:
            r4 = r6
            boolean r0 = r6 instanceof X.AnonymousClass781
            if (r0 == 0) goto L_0x0083
            r5 = r4
            X.781 r5 = (X.AnonymousClass781) r5
            X.7Zg r1 = r5.A02
            X.7ZY r0 = r1.BSN()
            boolean r0 = r0.AiX()
            r3 = 0
            if (r0 != 0) goto L_0x00ae
            X.7S7 r0 = r1.C6l()
            X.7SD r0 = r0.C6Q()
            X.3Tu r0 = r0.A0H
            boolean r2 = X.C331057Pi.A02(r0)
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x0046
            com.instagram.common.session.UserSession r0 = r5.A01
            X.0qQ.A0B(r0, r3)
            boolean r0 = X.C66642MaB.A02(r0, r2)
            r1 = 1
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            com.instagram.common.session.UserSession r0 = r5.A01
            X.0qQ.A0B(r0, r3)
            boolean r0 = X.C66642MaB.A02(r0, r2)
            if (r0 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x00ae
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A02
            X.3jg r0 = r6.A06
            r1.A15(r0)
            android.view.View$OnTouchListener r0 = r6.A05
            r1.setOnTouchListener(r0)
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r3 = r6.A04
            android.content.Context r2 = r6.A01
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165275(0x7f07005b, float:1.7944763E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setRefreshingDistance(r0)
            r0 = 1
            r3.A09 = r0
            boolean r0 = r6 instanceof X.AnonymousClass787
            if (r0 == 0) goto L_0x0082
            X.787 r4 = (X.AnonymousClass787) r4
            X.XWj r0 = r4.A04
            if (r0 == 0) goto L_0x0082
            X.AnonymousClass2S0.A01(r2)
        L_0x0082:
            return
        L_0x0083:
            r2 = r4
            X.787 r2 = (X.AnonymousClass787) r2
            X.7Zg r1 = r2.A01
            X.7ZY r0 = r1.BSN()
            boolean r0 = r0.AiX()
            if (r0 != 0) goto L_0x00ae
            com.instagram.common.session.UserSession r3 = r2.A00
            X.7S7 r2 = r1.C6l()
            X.3t2 r0 = r2.C6c()
            X.0qQ.A07(r0)
            boolean r1 = r0 instanceof X.C254773t1
            X.7SD r0 = r2.C6Q()
            X.0qQ.A07(r0)
            boolean r0 = X.C308556Us.A0B(r3, r0, r1)
            if (r0 != 0) goto L_0x0054
        L_0x00ae:
            r6.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass782.A01():void");
    }

    public final void A02() {
        this.A02.A16(this.A06);
        this.A04.A0A = true;
    }

    public final boolean A03() {
        if (this instanceof AnonymousClass781) {
            return ((AnonymousClass781) this).A02.C6l().CVE();
        }
        AnonymousClass787 r0 = (AnonymousClass787) this;
        return C308556Us.A08(r0.A00, r0.A01.C6l().C6Q());
    }

    public AnonymousClass782(Context context, RecyclerView recyclerView, AnonymousClass780 r5, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        this.A01 = context;
        this.A04 = refreshableNestedScrollingParent;
        this.A03 = r5;
        this.A02 = recyclerView;
        AnonymousClass784 r1 = new AnonymousClass784(this);
        this.A07 = r1;
        this.A06 = new AnonymousClass785(this);
        refreshableNestedScrollingParent.A08 = r5;
        refreshableNestedScrollingParent.A06 = r1;
    }
}
