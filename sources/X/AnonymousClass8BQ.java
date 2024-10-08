package X;

import android.content.Context;
import android.view.View;
import android.widget.Adapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8BQ  reason: invalid class name */
public final class AnonymousClass8BQ {
    public ReboundViewPager A00;
    public AnonymousClass8BS A01;
    public CirclePageIndicator A02;
    public List A03;
    public AnonymousClass0eM A04;
    public final UserSession A05;
    public final ArrayList A06 = new ArrayList();
    public final AnonymousClass0xx A07;

    public AnonymousClass8BQ(View view, AnonymousClass07V r5, UserSession userSession, AnonymousClass8BL r7) {
        List list;
        0qQ.A0B(view, 1);
        0qQ.A0B(r5, 4);
        this.A05 = userSession;
        if (182.A06(0Tu.A06, userSession, 36331124061914019L)) {
            list = AnonymousClass8BR.A04;
        } else {
            list = AnonymousClass8BR.A03;
        }
        this.A03 = list;
        this.A07 = C71772f0.A00(r5);
        this.A00 = (ReboundViewPager) view.requireViewById(R.id.colour_palette_pager);
        Context context = view.getContext();
        0qQ.A07(context);
        AnonymousClass8BS r1 = new AnonymousClass8BS(context, userSession, r7, this.A03);
        this.A01 = r1;
        this.A00.setAdapter((Adapter) r1);
        this.A00.A0J = new C351938Ba();
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) view.requireViewById(R.id.colour_palette_pager_indicator);
        this.A02 = circlePageIndicator;
        circlePageIndicator.A01(0, 3);
        this.A00.A0P(this.A02);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.0r1, java.lang.Object] */
    public final void A03(boolean z, boolean z2) {
        Object value;
        182.A06(0Tu.A05, this.A05, 36331124061914019L);
        ? obj = new Object();
        boolean z3 = z;
        if (z2) {
            if (this.A04 == null) {
                ArrayList arrayList = this.A06;
                if (!arrayList.isEmpty()) {
                    A01(this.A03);
                    if (!arrayList.isEmpty()) {
                        A00(AnonymousClass8BT.A00(arrayList));
                    }
                }
            }
            A01(this.A03);
            AnonymousClass0eM r0 = this.A04;
            if (!(r0 == null || (value = r0.getValue()) == null)) {
                AnonymousClass0xx r2 = this.A07;
                1Eo.A03(AnonymousClass05K.A00, AnonymousClass12T.A00.AOJ(-18, 3), new AnonymousClass9KI(this, obj, value, (AnonymousClass4D7) null, 3, z3), r2);
            }
            this.A04 = null;
        }
        if (!obj.A00) {
            C294975nL.A04((C295005nO) null, new View[]{this.A00, this.A02}, z);
        }
    }

    public final void A00(ArrayList arrayList) {
        AnonymousClass8BS r3 = this.A01;
        r3.A02.add(0, arrayList);
        0fE.A00(r3, 1695962476);
        this.A02.setPageCount(r3.getCount());
        this.A00.A0K(0);
        r3.A01 = true;
    }

    public final void A01(List list) {
        this.A03 = list;
        AnonymousClass8BS r3 = this.A01;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AnonymousClass8BT.A00((ArrayList) it.next()));
            }
            if (!arrayList.isEmpty()) {
                List list2 = r3.A02;
                list2.clear();
                list2.addAll(arrayList);
                0fE.A00(r3, 614419318);
                this.A02.setPageCount(r3.getCount());
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void A02(boolean z) {
        C294975nL.A05(new View[]{this.A00, this.A02}, z);
    }
}
