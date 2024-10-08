package X;

import android.animation.Animator;
import android.app.Application;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.GgK  reason: case insensitive filesystem */
public final class C52967GgK extends C361478gI {
    public boolean A00;
    public final ArrayList A01 = AnonymousClass7TE.A1C();
    public final 05G A02 = 106.A01((Object) null);
    public final UserSession A03;

    public final void A0E() {
        this.A00 = true;
        ArrayList arrayList = this.A01;
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            C53152GjO gjO = (C53152GjO) AnonymousClass7TF.A0a(A1G);
            C57462Ib6 ib6 = gjO.A01;
            if (ib6 != null) {
                ib6.A00();
            }
            gjO.A01 = null;
            gjO.A02 = null;
            gjO.A00 = null;
        }
        arrayList.clear();
    }

    public final void A0F() {
        this.A00 = true;
        Iterator A1G = AnonymousClass7TE.A1G(this.A01);
        while (A1G.hasNext()) {
            C53152GjO gjO = (C53152GjO) AnonymousClass7TF.A0a(A1G);
            C57462Ib6 ib6 = gjO.A01;
            if (ib6 != null) {
                ib6.A00();
            }
            gjO.A01 = null;
        }
    }

    public static final void A00(C52967GgK ggK) {
        C57462Ib6 ib6;
        if (!ggK.A00) {
            C53152GjO gjO = (C53152GjO) ggK.A02.getValue();
            if (gjO != null) {
                1Xj r2 = gjO.A00;
                if (r2 != null) {
                    if (gjO.A01 == null) {
                        ggK.A0G(gjO);
                    }
                    ArrayList arrayList = ggK.A01;
                    ArrayList<C57462Ib6> A0p = AnonymousClass7TF.A0p(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A0p.add(((C53152GjO) it.next()).A01);
                    }
                    for (C57462Ib6 ib62 : A0p) {
                        if (ib62 != null) {
                            ib62.A01 = false;
                            ((C14044Tol) ib62.A07.getValue()).A0A("recycler view scroll");
                        }
                    }
                    if (r2.getId() != null && (ib6 = gjO.A01) != null) {
                        Integer num = ib6.A00;
                        Integer num2 = AnonymousClass05K.A01;
                        if (num != num2) {
                            ib6.A00 = num2;
                            String str = r2.A0M;
                            AnonymousClass3WR CEL = r2.CEL();
                            SimpleVideoLayout simpleVideoLayout = ib6.A05;
                            C263754Nf r6 = new C263754Nf((Object) r2, ib6.A02);
                            r6.A00 = true;
                            ((C14044Tol) ib6.A07.getValue()).A09(simpleVideoLayout, CEL, r6, str, "clips_template_browser", 1.0f, -1, 0, true, false);
                            ib6.A06.getValue();
                            if (r2.getId() == null) {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        ib6.A01 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList2 = ggK.A01;
            ArrayList<C57462Ib6> A0p2 = AnonymousClass7TF.A0p(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                A0p2.add(((C53152GjO) it2.next()).A01);
            }
            for (C57462Ib6 ib63 : A0p2) {
                if (ib63 != null) {
                    ib63.A01 = false;
                    ((C14044Tol) ib63.A07.getValue()).A0A("recycler view scroll");
                }
            }
        }
    }

    public final void A0H(C53152GjO gjO) {
        05G r3 = this.A02;
        C53152GjO gjO2 = (C53152GjO) r3.getValue();
        if (gjO == null) {
            if (r3.getValue() != null) {
                if (gjO2 != null) {
                    View view = gjO2.A04;
                    C51972G9s.A0I(view).setDuration(200).setListener(new C52775GcS(view, 4));
                }
                r3.Epw((Object) null);
                return;
            }
            A00(this);
        } else if (gjO.A00 != null && !0qQ.A0K(gjO2, gjO)) {
            if (gjO.A01 == null) {
                A0G(gjO);
            }
            if (gjO2 != null) {
                View view2 = gjO2.A04;
                C51972G9s.A0I(view2).setDuration(200).setListener(new C52775GcS(view2, 4));
            }
            View view3 = gjO.A04;
            view3.setAlpha(0.0f);
            view3.setVisibility(0);
            DbY.A0G(view3).setDuration(200).setListener((Animator.AnimatorListener) null);
            r3.Epw(gjO);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52967GgK(Application application, UserSession userSession) {
        super(application);
        boolean A1Y = DbW.A1Y(userSession);
        this.A03 = userSession;
        this.A00 = A1Y;
        C58099ImL.A01(this, C318116oQ.A00(this), 27);
    }

    public static void A01(AnonymousClass0eM r1) {
        C52967GgK ggK = (C52967GgK) r1.getValue();
        ggK.A00 = false;
        A00(ggK);
    }

    public final void A0G(C53152GjO gjO) {
        gjO.A01 = new C57462Ib6(A0D(), this.A03, gjO.A0C, new C55561Hjh(gjO), DbX.A01(gjO.A02));
        this.A01.add(gjO);
    }
}
