package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.List;

public final class U0D extends AnimatorListenerAdapter {
    public final float A00;
    public final int A01;
    public final Object A02;

    public U0D(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public final void onAnimationEnd(Animator animator) {
        String str;
        String str2;
        switch (this.A01) {
            case 2:
                ((View) this.A02).setTranslationX(this.A00);
                return;
            case 3:
                ((View) this.A02).setTranslationY(this.A00);
                return;
            case 4:
                if (this.A00 > 0.7f) {
                    UB3 ub3 = (UB3) this.A02;
                    C15697Uh3 uh3 = ub3.A07;
                    C19191WOx wOx = ub3.A08;
                    if (wOx != null) {
                        String str3 = wOx.A02;
                        if ("slideshow".equals(str3)) {
                            C15433Ucj A002 = wOx.A00(uh3.A0M.A00(wOx).A00);
                            if (A002 != null) {
                                FragmentActivity requireActivity = uh3.A0I.requireActivity();
                                UserSession userSession = uh3.A0O;
                                List list = A002.A02;
                                C17201VMf vMf = wOx.A00;
                                if (vMf != null) {
                                    str2 = vMf.A00;
                                } else {
                                    str2 = null;
                                }
                                String str4 = A002.A00.A00;
                                1Nv r10 = uh3.A08;
                                if (r10 != null) {
                                    WWU wwu = uh3.A04;
                                    if (wwu != null) {
                                        HWG.A00(requireActivity, userSession, wwu, r10, (1Xj) null, uh3, (Product) null, str3, str2, str4, "swipe_up", list, uh3.A0S);
                                        return;
                                    }
                                    0qQ.A0F("insightProcessor");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        } else {
                            FragmentActivity requireActivity2 = uh3.A0I.requireActivity();
                            UserSession userSession2 = uh3.A0O;
                            List list2 = wOx.A03;
                            C17201VMf vMf2 = wOx.A00;
                            if (vMf2 != null) {
                                str = vMf2.A00;
                            } else {
                                str = null;
                            }
                            1Nv r1 = uh3.A08;
                            if (r1 != null) {
                                WWU wwu2 = uh3.A04;
                                if (wwu2 != null) {
                                    HWG.A00(requireActivity2, userSession2, wwu2, r1, (1Xj) null, uh3, (Product) null, str3, str, (String) null, "swipe_up", list2, uh3.A0S);
                                    return;
                                }
                                0qQ.A0F("insightProcessor");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                        0qQ.A0F("impressionItem");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
            default:
                ((View) this.A02).setAlpha(this.A00);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (4 - this.A01 != 0) {
            super.onAnimationStart(animator);
        }
    }
}
