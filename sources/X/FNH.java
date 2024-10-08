package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.user.model.User;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.HashMap;
import java.util.List;

public final class FNH implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public FNH(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(952680077);
                E30 e30 = (E30) this.A02;
                int i2 = this.A01;
                int i3 = e30.A00;
                if (i3 != i2) {
                    List list = e30.A06;
                    ((View) list.get(i3)).findViewById(R.id.selected_color_item).setVisibility(8);
                    CircularImageView circularImageView = (CircularImageView) ((View) list.get(i2)).findViewById(R.id.selected_color_item);
                    Context requireContext = e30.requireContext();
                    e30.A09.getValue();
                    0qQ.A0A(circularImageView);
                    FC0.A01(requireContext, circularImageView, AnonymousClass7TE.A0M(((List) e30.A08.getValue()).get(i2)));
                    e30.A00 = i2;
                }
                i = -1259664655;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(58316559);
                C46826Dm2 dm2 = (C46826Dm2) this.A02;
                UserSession userSession = dm2.A03;
                Context context = dm2.A02;
                C53374Gn4 gn4 = (C53374Gn4) 00k.A0O(dm2.A00, this.A01);
                if (C53374Gn4.A00(0, gn4)) {
                    HashMap A022 = 1Av.A02(1Au.A00(userSession), "contacts_in_sharesheet_access_map");
                    String A0h = AnonymousClass7TF.A0h(gn4);
                    Object obj = A022.get(A0h);
                    if (obj == null) {
                        obj = Double.valueOf(0.0d);
                        A022.put(A0h, obj);
                    }
                    Dbc.A0v(userSession, (Number) obj, A0h, A022);
                    C49899FCc.A02(context, gn4.A04, "");
                }
                i = -169930396;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(118065154);
                C51876G5o g5o = ((C46835DmB) this.A02).A00;
                if (g5o != null) {
                    int i4 = this.A01;
                    0qQ.A0A(view);
                    g5o.DgB(view, i4);
                }
                i = -1147379620;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(1636743293);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A02;
                UserSession userSession2 = editProfileFieldsController.A0A;
                0xG r3 = editProfileFieldsController.A09;
                C319986rY r5 = C319986rY.SELF;
                User user = editProfileFieldsController.A04;
                if (user != null) {
                    str = AnonymousClass3ZA.A00(user);
                } else {
                    str = null;
                }
                C319976rX.A04(r3, userSession2, r5, DbS.A0j(this.A01), "tap_edit_profile_banner", str, (String) null, (String) null, (String) null, (String) null);
                DbW.A0y(AnonymousClass7TE.A0a(), new E35(), C46447Df9.A01(editProfileFieldsController.A06(), userSession2));
                i = -1927738836;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(367287049);
                FF8 ff8 = (FF8) this.A02;
                DialogInterface.OnClickListener onClickListener = ff8.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(ff8.A0D, this.A01);
                }
                ff8.A0D.dismiss();
                i = 1998154235;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-131745);
                UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A02;
                unifiedFollowFragment.A0Q = true;
                ViewPager2 viewPager2 = unifiedFollowFragment.viewPager;
                if (viewPager2 != null) {
                    viewPager2.A03(this.A01, true);
                }
                i = 303896781;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
