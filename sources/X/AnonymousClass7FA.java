package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7FA  reason: invalid class name */
public final class AnonymousClass7FA extends C252233om {
    public View A00;
    public ViewGroup A01;
    public C391979tz A02;
    public C392289uY A03;
    public C66748Mbt A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C39761A8b A08;
    public final C74401PuH A09;
    public final C41831B2m A0A;
    public final Set A0B = new LinkedHashSet();
    public final 0ng A0C;

    public static final void A00(AnonymousClass7FA r3) {
        r3.A03 = null;
        Set<C392289uY> set = r3.A0B;
        for (C392289uY A022 : set) {
            A022.A02();
        }
        set.clear();
        r3.A05 = false;
        ViewGroup viewGroup = r3.A01;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
    }

    public static final void A01(AnonymousClass7FA r2) {
        if (r2.A02 != null && r2.A01 != null) {
            0nY.A00().ATE(r2.A0C);
        }
    }

    public static final void A02(AnonymousClass7FA r4, C392289uY r5, boolean z) {
        Context context;
        ViewGroup viewGroup = r4.A01;
        if (viewGroup != null) {
            if (r4.A06) {
                context = new C251383n1(viewGroup.getContext(), (int) R.style.DirectShhMode);
            } else {
                context = viewGroup.getContext();
            }
            0qQ.A0A(context);
            View A062 = r5.A06(context);
            viewGroup.removeAllViews();
            viewGroup.addView(A062);
            viewGroup.setVisibility(0);
            r5.A04(z);
            r5.A00 = new C40457AcS(r4);
            r4.A03 = r5;
            r4.A0B.add(r5);
        }
    }

    public final void A03(View view) {
        if (!0qQ.A0K(this.A00, view)) {
            this.A00 = view;
            this.A0A.reset();
            A00(this);
            A01(this);
        }
    }

    public final void A04(C391979tz r14) {
        C72386P3z p3z;
        this.A02 = r14;
        Boolean bool = null;
        boolean z = true;
        if (r14 instanceof C388829oS) {
            C41831B2m b2m = this.A0A;
            if ((b2m instanceof C72386P3z) && (p3z = (C72386P3z) b2m) != null) {
                C74536PwV pwV = ((C388829oS) r14).A00;
                0qQ.A0B(pwV, 0);
                C74536PwV pwV2 = p3z.A00;
                if (pwV2 != null) {
                    C68321NAi nAi = ((PCH) pwV2).A00;
                    int count = nAi.mResultSet.getCount();
                    C68321NAi nAi2 = ((PCH) pwV).A00;
                    if (nAi2.mResultSet.getCount() == count) {
                        Collection A0C2 = C229632nm.A0C(0, count);
                        if (!(A0C2 instanceof Collection) || !A0C2.isEmpty()) {
                            0sh it = A0C2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                int A002 = it.A00();
                                if (nAi.mResultSet.getLong(A002, 0) != nAi2.mResultSet.getLong(A002, 0)) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        bool = Boolean.valueOf(z);
                    }
                }
                p3z.A00 = pwV;
                bool = Boolean.valueOf(z);
            }
        } else {
            bool = true;
        }
        if (0qQ.A0K(bool, true)) {
            this.A0A.reset();
            A00(this);
            A01(this);
        }
    }

    public final void A05(boolean z) {
        ViewGroup viewGroup;
        C392289uY r0;
        if (this.A03 == null || (viewGroup = this.A01) == null || viewGroup.getVisibility() != 0 || (r0 = this.A03) == null || !r0.A05()) {
            this.A0A.reset();
            A00(this);
            this.A05 = z;
            A01(this);
        }
    }

    public final void onPause() {
        for (C392289uY A022 : this.A0B) {
            A022.A02();
        }
    }

    public final void onResume() {
        if (!this.A07) {
            this.A0A.E3d();
            this.A07 = true;
        }
        for (C392289uY A032 : this.A0B) {
            A032.A03();
        }
    }

    public AnonymousClass7FA(ViewGroup viewGroup, C41831B2m b2m, boolean z) {
        this.A0A = b2m;
        this.A01 = viewGroup;
        this.A06 = z;
        this.A0C = new C377909Ns(this);
        this.A09 = new C377919Nt(this);
        this.A08 = new C39761A8b(this);
    }
}
