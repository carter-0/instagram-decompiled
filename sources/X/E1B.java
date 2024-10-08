package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public final class E1B extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ShareToFriendsStoryConsumptionFragment";
    public C49390Eus A00;
    public User A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-975588360);
        Bundle requireArguments = requireArguments();
        User parcelable = requireArguments.getParcelable(C273654mx.A00(1379));
        if (parcelable == null) {
            i = 449187496;
        } else {
            this.A01 = parcelable;
            String string = requireArguments.getString(C273654mx.A00(1378));
            if (string == null) {
                i = -178290480;
            } else {
                this.A02 = string;
                E1B.super.onCreate(bundle);
                i = -117994544;
            }
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(733098785);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.share_to_friends_story_consumption_fragment, viewGroup, false);
        boolean A06 = 182.A06(0Tu.A06, DbT.A0X(this.A03), 36321675133855358L);
        GradientSpinnerAvatarView A0j = DbX.A0j(inflate, R.id.avatar);
        User user = this.A01;
        String str = "producer";
        if (user != null) {
            A0j.A0F((AnonymousClass9IV) null, this, user.Bh3());
            A0j.setGradientSpinnerVisible(false);
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.description_text);
            String str2 = this.A02;
            if (str2 == null) {
                str = "reelOwnerUsername";
            } else {
                User user2 = this.A01;
                if (user2 != null) {
                    Spanned fromHtml = Html.fromHtml(getString(2131956557, new Object[]{str2, user2.getUsername()}), 0);
                    0qQ.A07(fromHtml);
                    SpannableStringBuilder append = new SpannableStringBuilder().append(fromHtml);
                    if (A06) {
                        String A0m = DbU.A0m(this, 2131973578);
                        append.append(002.A0D(A0m, ' '));
                        AnonymousClass7AV.A03(append, new C2806552w(DbV.A0n(requireContext(), 2Yu.A0H(getContext(), R.attr.igds_color_gradient_blue))), A0m);
                        A0R.setText(append);
                        FP4.A01(A0R, 20, this);
                    } else {
                        A0R.setText(append);
                    }
                    TextView A0G = DbU.A0G(inflate, R.id.username);
                    User user3 = this.A01;
                    if (user3 != null) {
                        DbU.A1H(A0G, user3);
                        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.user_fullname);
                        User user4 = this.A01;
                        if (user4 != null) {
                            if (user4.getFullName() != null) {
                                User user5 = this.A01;
                                if (user5 != null) {
                                    A0R2.setText(user5.getFullName());
                                }
                            } else {
                                A0R2.setVisibility(8);
                            }
                            View requireViewById = inflate.requireViewById(R.id.follow_list_container);
                            Context context = requireViewById.getContext();
                            DbT.A16(context, requireViewById, 2Yu.A02(context));
                            FP4.A01(requireViewById, 19, this);
                            if (!A06) {
                                DbT.A1F(inflate, R.id.feature_unavailable_text, 0);
                            }
                            AnonymousClass0fD.A09(-1222195711, A022);
                            return inflate;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
