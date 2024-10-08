package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public abstract class I22 {
    public final boolean A00;

    public static final void A00(View view, 0sP r3) {
        0qQ.A0B(view, 0);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A04 = new C54310H7f(r3, 1);
        A0m.A07 = true;
        A0m.A02 = 0.95f;
        A0m.A00();
    }

    public final IgImageView A01() {
        if (this instanceof H9C) {
            return ((H9C) this).A03;
        }
        return ((H9B) this).A03;
    }

    public final void A02() {
        View view;
        if (this instanceof H9C) {
            H9C h9c = (H9C) this;
            view = h9c.A04;
            view.setVisibility(8);
            if (!h9c.A00) {
                view = h9c.A01;
            }
        } else {
            H9B h9b = (H9B) this;
            view = h9b.A05;
            view.setVisibility(8);
            if (!h9b.A00) {
                view = h9b.A02;
            }
        }
        view.setOnTouchListener((View.OnTouchListener) null);
    }

    public final void A03(C62320sa r15) {
        View view;
        int i;
        Activity activity;
        if (this instanceof H9C) {
            H9C h9c = (H9C) this;
            view = h9c.A04;
            view.setVisibility(0);
            Context context = view.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                UserSession userSession = h9c.A02;
                0Tu r8 = 0Tu.A05;
                if (182.A06(r8, userSession, 36330501291655839L)) {
                    1Av A002 = 1Au.A00(userSession);
                    0s0 r6 = A002.A0Z;
                    AnonymousClass0YZ[] r5 = 1Av.A8a;
                    Object CDM = r6.CDM(A002, r5[335]);
                    String str = h9c.A05;
                    if (!0qQ.A0K(CDM, str)) {
                        0s0 r3 = A002.A0Y;
                        if (AnonymousClass7TE.A0M(r3.CDM(A002, r5[334])) < DbS.A04(r8, userSession, 36611976268421420L)) {
                            new C349317zw(activity, userSession).A01(h9c.A01, view, C366978pz.A0U);
                            DbS.A1a(A002, str, r6, r5, 335);
                            DbZ.A1b(A002, r3, r5, 334);
                        }
                    }
                }
            }
            2eS.A01(h9c.A00);
            if (!h9c.A00) {
                view = h9c.A01;
            }
            i = 23;
        } else {
            H9B h9b = (H9B) this;
            View view2 = h9b.A05;
            view2.setVisibility(0);
            2eS.A01(h9b.A01);
            if (!h9b.A00) {
                view2 = h9b.A02;
            }
            i = 22;
        }
        A00(view, new MP9(r15, i));
    }

    public final void A04(0sP r4) {
        ViewGroup viewGroup;
        if (this instanceof H9C) {
            H9C h9c = (H9C) this;
            View view = h9c.A00;
            view.setVisibility(0);
            2eS.A01(view);
            if (h9c.A00) {
                A00(view, r4);
                viewGroup = h9c.A01;
            } else {
                C56800ICx.A00(view, 32, r4);
                return;
            }
        } else {
            H9B h9b = (H9B) this;
            View view2 = h9b.A01;
            view2.setVisibility(0);
            2eS.A01(view2);
            if (h9b.A00) {
                A00(view2, r4);
                viewGroup = h9b.A02;
            } else {
                C56800ICx.A00(view2, 31, r4);
                return;
            }
        }
        A00(viewGroup, r4);
    }

    public I22(UserSession userSession) {
        this.A00 = 182.A06(0Tu.A05, userSession, 36324746035540303L);
    }
}
