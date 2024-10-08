package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class IQZ implements MVS {
    public View A00;
    public View A01;
    public View A02;
    public ViewStub A03;
    public TextView A04;
    public View A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final C61837KOb A08;
    public final C66576MXh A09;
    public final AnonymousClass80P A0A = AnonymousClass80P.TAG_PERSON;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A06;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHO((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 31), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final View ANH() {
        View A082 = DbU.A08(LayoutInflater.from(this.A06.requireContext()), R.layout.tag_people);
        this.A05 = A082;
        String str = "contentView";
        if (A082 != null) {
            View requireViewById = A082.requireViewById(R.id.metadata_row_people);
            0qQ.A0B(requireViewById, 0);
            this.A01 = requireViewById;
            this.A02 = requireViewById.requireViewById(R.id.tag_people_row_icon);
            View view = this.A01;
            if (view != null) {
                this.A04 = DbU.A0G(view, R.id.metadata_textview_people);
                View view2 = this.A05;
                if (view2 != null) {
                    this.A03 = DbU.A0D(view2, R.id.tag_people_info_button_view_stub);
                    View view3 = this.A01;
                    if (view3 != null) {
                        this.A00 = view3.requireViewById(R.id.chevron_icon);
                        View view4 = this.A02;
                        if (view4 == null) {
                            str = "peopleTagRowIcon";
                        } else {
                            view4.setVisibility(0);
                            View view5 = this.A00;
                            if (view5 == null) {
                                str = "chevronIcon";
                            } else {
                                view5.setVisibility(0);
                                View view6 = this.A01;
                                if (view6 != null) {
                                    C56800ICx.A00(view6, 30, this);
                                    View view7 = this.A05;
                                    if (view7 != null) {
                                        return view7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            str = "peopleTagRow";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A0A;
    }

    public IQZ(AnonymousClass4DH r2, UserSession userSession, C61837KOb kOb, C66576MXh mXh) {
        C51974G9v.A1P(r2, userSession, kOb, mXh);
        this.A06 = r2;
        this.A07 = userSession;
        this.A08 = kOb;
        this.A09 = mXh;
    }
}
