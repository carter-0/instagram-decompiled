package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class WTW implements C252213ok {
    public final int A00;
    public final Object A01;

    public WTW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DMr(int i, boolean z) {
        WF5 wf5;
        Activity rootActivity;
        IgAutoCompleteTextView igAutoCompleteTextView;
        View view;
        AnimatedHintsTextLayout animatedHintsTextLayout;
        switch (this.A00) {
            case 0:
                C15407UcJ ucJ = (C15407UcJ) this.A01;
                if (ucJ.mView != null && (wf5 = ucJ.A00) != null && (rootActivity = ucJ.getRootActivity()) != null && rootActivity.getWindow() != null) {
                    Activity rootActivity2 = ucJ.getRootActivity();
                    if (rootActivity2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (0nA.A0x(rootActivity2)) {
                        Integer num = wf5.A03;
                        if (num == null || num.intValue() != 16) {
                            i = 0;
                        } else {
                            Boolean bool = wf5.A02;
                            if (bool == null || bool.equals(false)) {
                                Activity rootActivity3 = ucJ.getRootActivity();
                                UserSession session = ucJ.getSession();
                                DbS.A1Z(session);
                                i -= 2Yu.A0G(rootActivity3, 0Pn.A01(session));
                            }
                        }
                        int max = Math.max(i, 0);
                        View view2 = ucJ.mView;
                        if (view2 != null) {
                            View rootView = view2.getRootView();
                            0qQ.A07(rootView);
                            0nA.A0X(rootView, max);
                            if (max > 0) {
                                View view3 = ucJ.mView;
                                if (view3 != null) {
                                    View findFocus = view3.findFocus();
                                    if (findFocus != null) {
                                        View.OnFocusChangeListener onFocusChangeListener = findFocus.getOnFocusChangeListener();
                                        findFocus.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                                        findFocus.post(new C20186Wmk(onFocusChangeListener, findFocus));
                                        return;
                                    }
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (i == 0 && (igAutoCompleteTextView = ((C15315UaN) this.A01).A08) != null) {
                    igAutoCompleteTextView.clearFocus();
                    return;
                }
                return;
            case 2:
                view = ((C16007Umo) this.A01).A00;
                break;
            case 3:
                view = ((C15314UaL) this.A01).A00;
                break;
            case 4:
                C15312UaJ uaJ = (C15312UaJ) this.A01;
                if (uaJ.A01().A03.A02() == C16534Uwe.MULTIPLE_CHOICE) {
                    view = uaJ.A00;
                    break;
                } else {
                    return;
                }
            case 5:
                C16002Umj umj = (C16002Umj) this.A01;
                if (((C14772U8i) umj.A04.getValue()).A02.A02() == C16534Uwe.MULTIPLE_CHOICE) {
                    view = umj.A00;
                    break;
                } else {
                    return;
                }
            case 6:
                C14137TqX tqX = (C14137TqX) this.A01;
                if (tqX.A0O && (animatedHintsTextLayout = tqX.A05) != null) {
                    ViewGroup.MarginLayoutParams A0G = DbX.A0G(animatedHintsTextLayout);
                    A0G.bottomMargin = C13988Tno.A07(i, 0Pn.A00(tqX.requireActivity()), 0);
                    animatedHintsTextLayout.setLayoutParams(A0G);
                    return;
                }
                return;
            case 7:
                ((C15337Uam) this.A01).A00 = i;
                return;
            default:
                ((C14450TwY) this.A01).A00 = i;
                return;
        }
        if (view != null) {
            view.setPadding(0, 0, 0, i);
        }
    }
}
