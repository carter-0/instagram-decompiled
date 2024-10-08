package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class KFZ extends C232222tE {
    public final Activity A00;
    public final C61520KAz A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.promote_toggle_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        Li9 li9 = (Li9) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, li9, r9);
        C61520KAz kAz = this.A01;
        View A0F = JTO.A0F(r9);
        C16678UzE uzE = C16678UzE.VIDEOX_SHARESHEET;
        ViewGroup A0C = DbU.A0C(A0F, R.id.promote_toggle_row_container);
        kAz.A02 = A0C;
        if (A0C != null) {
            kAz.A06 = JTP.A0T(A0C, R.id.promote_row_icon);
            ViewGroup viewGroup = kAz.A02;
            if (viewGroup != null) {
                kAz.A04 = DbU.A0G(viewGroup, R.id.toggle_row_title);
                ViewGroup viewGroup2 = kAz.A02;
                if (viewGroup2 != null) {
                    kAz.A03 = DbU.A0G(viewGroup2, R.id.toggle_row_subtitle);
                    ViewGroup viewGroup3 = kAz.A02;
                    if (viewGroup3 != null) {
                        IgdsSwitch igdsSwitch = (IgdsSwitch) viewGroup3.requireViewById(R.id.toggle_row_switch);
                        kAz.A07 = igdsSwitch;
                        if (igdsSwitch != null) {
                            igdsSwitch.A07 = new C65370LsB(0, uzE, kAz);
                            TextView textView = kAz.A04;
                            if (textView != null) {
                                textView.setText(2131970552);
                                TextView textView2 = kAz.A03;
                                if (textView2 != null) {
                                    textView2.setText(2131970551);
                                    boolean A002 = kAz.A00();
                                    TextView textView3 = kAz.A03;
                                    if (textView3 != null) {
                                        textView3.setVisibility(DbW.A01(A002 ? 1 : 0));
                                    }
                                    if (li9.A02) {
                                        UserSession userSession = li9.A00;
                                        IgdsSwitch igdsSwitch2 = kAz.A07;
                                        if (igdsSwitch2 != null) {
                                            AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131964046);
                                            View rootView = igdsSwitch2.getRootView();
                                            0qQ.A07(rootView);
                                            A0V.A03(rootView);
                                            A0V.A02();
                                            A0V.A0F = A1U;
                                            igdsSwitch2.post(new M95(userSession, A0V.A00(), this));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final Class modelClass() {
        return Li9.class;
    }

    public KFZ(Activity activity, C61520KAz kAz) {
        this.A00 = activity;
        this.A01 = kAz;
    }
}
