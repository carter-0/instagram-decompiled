package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ue0  reason: case insensitive filesystem */
public final class C15511Ue0 extends C231632rz {
    public final AnonymousClass0iw A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15511Ue0(AnonymousClass0iw r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        String username;
        int A03 = AnonymousClass0fD.A03(1841492073);
        int A02 = DbW.A02(1, view, obj);
        if (i == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.genericsurvey.ui.BusinessCardViewBinder.Holder");
            C17657Vbn vbn = (C17657Vbn) tag;
            C45452Cwj cwj = (C45452Cwj) obj;
            AnonymousClass0iw r4 = this.A00;
            boolean A1S = DbW.A1S(1, vbn, cwj);
            0qQ.A0B(r4, A02);
            DbU.A1S(r4, vbn.A07, cwj.A00());
            String fullName = cwj.A00().getFullName();
            if (fullName == null || fullName.length() == 0) {
                textView = vbn.A06;
                username = cwj.A00().getUsername();
            } else {
                textView = vbn.A06;
                username = cwj.A00().getFullName();
            }
            textView.setText(username);
            String category = cwj.A00().A03.getCategory();
            if (category == null || category.length() == 0) {
                vbn.A05.setVisibility(8);
                Context context = textView.getContext();
                Resources resources = context.getResources();
                textView.setPadding(A1S ? 1 : 0, (int) 0nA.A00(context, resources.getDimension(R.dimen.abc_button_padding_horizontal_material)), A1S, (int) 0nA.A00(context, resources.getDimension(R.dimen.account_discovery_bottom_gap)));
            } else {
                TextView textView2 = vbn.A05;
                textView2.setVisibility(A1S);
                textView2.setText(cwj.A00().A03.getCategory());
            }
            cwj.A01();
            if (AnonymousClass7TE.A1b(cwj.A01())) {
                if (vbn.A00 == null) {
                    View inflate = vbn.A04.inflate();
                    C66580MXl.A1R(inflate);
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    vbn.A00 = viewGroup;
                    if (viewGroup != null) {
                        vbn.A01 = JTO.A0Y(viewGroup, R.id.grid_image_1);
                        vbn.A02 = JTO.A0Y(viewGroup, R.id.grid_image_2);
                        vbn.A03 = JTO.A0Y(viewGroup, R.id.grid_image_3);
                    }
                }
                IgImageView igImageView = vbn.A01;
                if (igImageView != null) {
                    igImageView.setUrl((ImageUrl) cwj.A01().get(A1S), r4);
                    IgImageView igImageView2 = vbn.A02;
                    if (igImageView2 != null) {
                        igImageView2.setUrl((ImageUrl) cwj.A01().get(1), r4);
                        IgImageView igImageView3 = vbn.A03;
                        if (igImageView3 != null) {
                            igImageView3.setUrl((ImageUrl) cwj.A01().get(A02), r4);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            AnonymousClass0fD.A0A(1024167221, A03);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass000.A00(33));
        AnonymousClass0fD.A0A(1231610929, A03);
        throw unsupportedOperationException;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1725037757);
        if (i == 0) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.business_card, false);
            A0A.setTag(new C17657Vbn(A0A));
            AnonymousClass0fD.A0A(1501799293, A04);
            return A0A;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
        AnonymousClass0fD.A0A(-571381236, A04);
        throw unsupportedOperationException;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
