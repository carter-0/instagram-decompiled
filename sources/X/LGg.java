package X;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public final class LGg {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final UserSession A05;
    public final LBF A06;
    public final AnonymousClass8RL A07;
    public final AnonymousClass8RF A08;
    public final C60108Jfo A09;
    public final C61806KMu A0A;
    public final ArrayList A0B = AnonymousClass7TE.A1C();
    public final ArrayList A0C = AnonymousClass7TE.A1C();
    public final boolean A0D;

    public LGg(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, UserSession userSession, LBF lbf, AnonymousClass8RL r9, AnonymousClass8RF r10, C60108Jfo jfo, C61806KMu kMu, int i) {
        C51973G9u.A0s(1, userSession, linearLayout, linearLayout2);
        this.A05 = userSession;
        this.A02 = context;
        this.A09 = jfo;
        this.A08 = r10;
        this.A07 = r9;
        this.A0A = kMu;
        this.A03 = linearLayout;
        this.A04 = linearLayout2;
        this.A06 = lbf;
        this.A00 = i;
        this.A0D = 182.A06(0Tu.A05, userSession, 36320043046870933L);
        this.A01 = i / 2;
        lbf.A02 = this;
    }

    public final void A05(C62517Kh8 kh8, int i, int i2, boolean z) {
        int i3;
        0qQ.A0B(kh8, 3);
        Iterator it = this.A0C.iterator();
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            LPJ A0e = JTO.A0e(it);
            if (kh8 != C62517Kh8.TIMED_ELEMENTS_TRACK || A0e.A08() != i2) {
                if (z) {
                    i4 = A0e.A00;
                }
                A0e.A0I(i - i4);
            }
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            LPJ A0e2 = JTO.A0e(it2);
            if (kh8 != C62517Kh8.TIMED_ELEMENTS_TRACK || A0e2.A08() != i2) {
                if (z) {
                    i3 = A0e2.A00;
                } else {
                    i3 = 0;
                }
                A0e2.A0I(i - i3);
            }
        }
    }

    public final void A00() {
        C61806KMu kMu = this.A0A;
        int i = this.A01;
        kMu.A02 = i;
        kMu.A0G();
        C61806KMu.A00(kMu);
        C61806KMu.A02(kMu, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        if (((X.C61193Jym) X.C51966G9m.A19(r2.getValue(), r4.A00)).CFq() == X.AnonymousClass05K.A0N) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r10 = this;
            X.8RF r3 = r10.A08
            X.8RH r6 = r3.A0E()
            X.KMu r8 = r10.A0A
            X.LTY r4 = r8.A01
            X.0eP r1 = r4.A04
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0090
            X.0eP r0 = r4.A04
            int r7 = X.C51970G9q.A0B(r0)
            int r9 = X.C51969G9p.A0A(r0)
            boolean r0 = r4.A0V(r7, r9)
            if (r0 == 0) goto L_0x008e
            X.Jyn r0 = r4.A0G(r7, r9)
            X.KhL r1 = r0.A09
        L_0x002b:
            int r0 = r9 * 2
            int r5 = r0 + 2
            boolean r0 = r8.A0L()
            if (r0 == 0) goto L_0x003e
            X.8Rb r1 = new X.8Rb
            r1.<init>(r7, r5)
        L_0x003a:
            r3.A0G(r1)
        L_0x003d:
            return
        L_0x003e:
            if (r1 == 0) goto L_0x003d
            int r1 = r1.ordinal()
            if (r1 == r2) goto L_0x0056
            r0 = 1
            if (r1 == r0) goto L_0x0050
            r0 = 3
            if (r1 == r0) goto L_0x0050
            r0 = 4
            if (r1 == r0) goto L_0x0050
            return
        L_0x0050:
            X.8Rh r1 = new X.8Rh
            r1.<init>(r7, r5)
            goto L_0x003a
        L_0x0056:
            X.0eP r0 = r4.A04
            int r8 = X.C51970G9q.A0B(r0)
            int r2 = X.C51969G9p.A0A(r0)
            boolean r0 = r6 instanceof X.C355838Ro
            r1 = 0
            if (r0 == 0) goto L_0x0074
            X.8Ro r6 = (X.C355838Ro) r6
            int r0 = r6.A01
            if (r0 != r8) goto L_0x0074
            int r0 = r6.A00
            int r0 = r0 + -2
            int r0 = r0 / 2
            if (r0 != r2) goto L_0x0074
            r1 = 1
        L_0x0074:
            X.Jyn r0 = r4.A0G(r7, r9)
            X.N49 r0 = r0.A07
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r0.A01
        L_0x007e:
            if (r1 == 0) goto L_0x0088
            X.8Ro r1 = new X.8Ro
            r1.<init>(r7, r5, r0)
            goto L_0x003a
        L_0x0086:
            r0 = 0
            goto L_0x007e
        L_0x0088:
            X.8Rq r1 = new X.8Rq
            r1.<init>(r7, r5, r0)
            goto L_0x003a
        L_0x008e:
            r1 = 0
            goto L_0x002b
        L_0x0090:
            int r1 = r4.A00
            r2 = -1
            if (r1 == r2) goto L_0x00cf
            X.0Ud r2 = r4.A09
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r0 = X.C51966G9m.A19(r0, r1)
            X.Jym r0 = (X.C61193Jym) r0
            boolean r0 = r0.Ayv()
            if (r0 != 0) goto L_0x00bc
            int r1 = r4.A00
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r0 = X.C51966G9m.A19(r0, r1)
            X.Jym r0 = (X.C61193Jym) r0
            java.lang.Integer r2 = r0.CFq()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1 = 0
            if (r2 != r0) goto L_0x00bd
        L_0x00bc:
            r1 = 1
        L_0x00bd:
            int r0 = r4.A00
            if (r1 == 0) goto L_0x00c8
            X.8Rd r1 = new X.8Rd
            r1.<init>(r0)
            goto L_0x003a
        L_0x00c8:
            X.8Ri r1 = new X.8Ri
            r1.<init>(r0)
            goto L_0x003a
        L_0x00cf:
            X.0Ud r0 = r8.A0J
            java.lang.Object r1 = r0.getValue()
            X.KgT r0 = X.C62478KgT.Dragging
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r0 = r6 instanceof X.AnonymousClass8Rc
            if (r0 != 0) goto L_0x00e3
            boolean r0 = r6 instanceof X.C355738Re
            if (r0 == 0) goto L_0x003d
        L_0x00e3:
            if (r1 != 0) goto L_0x003d
            X.8Rs r1 = new X.8Rs
            r1.<init>(r2)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LGg.A01():void");
    }

    public final void A02(float f) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = ((KMT) it.next()).A09;
            if (recyclerView != null) {
                recyclerView.setAlpha(f);
            }
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            RecyclerView recyclerView2 = ((KMT) it2.next()).A09;
            if (recyclerView2 != null) {
                recyclerView2.setAlpha(f);
            }
        }
    }

    public final void A03(int i) {
        this.A0A.A00 = i;
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            C60434JlR jlR = ((KMT) it.next()).A0C;
            jlR.A00 = i;
            jlR.notifyDataSetChanged();
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            C60434JlR jlR2 = ((KMT) it2.next()).A0C;
            jlR2.A00 = i;
            jlR2.notifyDataSetChanged();
        }
    }

    public final void A04(int i) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = ((KMT) it.next()).A09;
            if (recyclerView != null) {
                recyclerView.setVisibility(i);
            }
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            RecyclerView recyclerView2 = ((KMT) it2.next()).A09;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(i);
            }
        }
    }

    public final void A06(boolean z) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            JTO.A0e(it).A0L(z);
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            JTO.A0e(it2).A0L(z);
        }
    }
}
