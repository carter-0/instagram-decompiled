package X;

import android.os.Bundle;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.su.model.MiddleStateCardUser;
import java.util.ArrayList;
import java.util.List;

public final class NJE extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "MiddleStateProfilePreviewFragment";
    public int A00 = -1;
    public int A01;
    public int A02;
    public C293005js A03;
    public C230012om A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08 = true;
    public int A09;
    public View A0A;
    public ViewPager2 A0B;
    public final String A0C = C273654mx.A00(820);
    public final AnonymousClass0eM A0D = C227642jf.A02(this);

    public final String getModuleName() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        0qQ.A0F("containerModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean onBackPressed() {
        FragmentActivity activity;
        ViewPager2 viewPager2 = this.A0B;
        if (viewPager2 != null) {
            C51972G9s.A0I(viewPager2).setDuration(400);
            2db.A06(getActivity(), this.A08);
            int i = this.A00;
            if (!(i == -1 || (activity = getActivity()) == null)) {
                AnonymousClass2uJ.A04(activity, i);
            }
            1Ng A0R = DbX.A0R(this.A0D);
            ViewPager2 viewPager22 = this.A0B;
            if (viewPager22 != null) {
                A0R.A00(new C57063INd(viewPager22.A00));
                return false;
            }
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        String string;
        Window window;
        Transition sharedElementExitTransition;
        Window window2;
        Transition sharedElementExitTransition2;
        Window window3;
        Transition sharedElementEnterTransition;
        int A022 = AnonymousClass0fD.A02(1143108383);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window3 = activity.getWindow()) == null || (sharedElementEnterTransition = window3.getSharedElementEnterTransition()) == null)) {
            sharedElementEnterTransition.setDuration(250);
        }
        FragmentActivity activity2 = getActivity();
        if (!(activity2 == null || (window2 = activity2.getWindow()) == null || (sharedElementExitTransition2 = window2.getSharedElementExitTransition()) == null)) {
            sharedElementExitTransition2.setDuration(250);
        }
        FragmentActivity activity3 = getActivity();
        if (!(activity3 == null || (window = activity3.getWindow()) == null || (sharedElementExitTransition = window.getSharedElementExitTransition()) == null)) {
            sharedElementExitTransition.setInterpolator(new DecelerateInterpolator());
        }
        NJE.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("ARG_START_POSITION");
        } else {
            i = 0;
        }
        this.A09 = i;
        this.A01 = i;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (arrayList = bundle3.getParcelableArrayList("ARG_LIST_CARD_USERS")) == null) {
            arrayList = 0sn.A00;
        }
        this.A07 = arrayList;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            i2 = bundle4.getInt("ARG_VIEW_STATE_ITEM_TYPE");
        } else {
            i2 = 0;
        }
        this.A02 = i2;
        Bundle bundle5 = this.mArguments;
        String str2 = "";
        if (bundle5 == null || (str = bundle5.getString("ARG_DISPLAY_FORMAT")) == null) {
            str = str2;
        }
        this.A06 = str;
        Bundle bundle6 = this.mArguments;
        if (!(bundle6 == null || (string = bundle6.getString("ARG_CONTAINER_MODULE")) == null)) {
            str2 = string;
        }
        this.A05 = str2;
        List list = this.A07;
        if (list != null) {
            if (list.size() > 0) {
                List list2 = this.A07;
                if (list2 != null) {
                    if (((MiddleStateCardUser) list2.get(0)).A0A) {
                        this.A04 = new C230012om(this, AnonymousClass7TE.A0l(this.A0D));
                        AnonymousClass0fD.A09(1125217330, A022);
                        return;
                    }
                }
            }
            this.A03 = new C293005js(this, AnonymousClass7TE.A0l(this.A0D));
            AnonymousClass0fD.A09(1125217330, A022);
            return;
        }
        0qQ.A0F("listCardUsers");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1183693588);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.middle_state_profile_preview_pager, viewGroup, false);
        this.A08 = 2db.A0A(getActivity());
        this.A00 = AnonymousClass2uJ.A00(getActivity());
        int A023 = JTP.A02(getContext(), requireActivity(), R.attr.igds_color_dimmer);
        2db.A02(getActivity(), A023);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass2uJ.A04(activity, A023);
        }
        ViewPager2 viewPager2 = (ViewPager2) inflate.requireViewById(R.id.profile_preview_view_pager);
        this.A0B = viewPager2;
        String str = "viewPager";
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(1);
            View childAt = viewPager2.getChildAt(0);
            0qQ.A0C(childAt, C273654mx.A00(4));
            ViewGroup viewGroup2 = (ViewGroup) childAt;
            int A032 = DbS.A03(viewGroup2.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            viewGroup2.setPadding(A032, 0, A032, 0);
            viewGroup2.setClipToPadding(false);
            ViewPager2 viewPager22 = this.A0B;
            if (viewPager22 != null) {
                viewPager22.setPageTransformer(new C14059Tp7((int) JTR.A02(requireContext())));
                ViewPager2 viewPager23 = this.A0B;
                if (viewPager23 != null) {
                    UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
                    List list = this.A07;
                    if (list == null) {
                        str = "listCardUsers";
                    } else {
                        int i = this.A00;
                        int i2 = this.A02;
                        String str2 = this.A06;
                        if (str2 == null) {
                            str = "displayFormat";
                        } else {
                            String str3 = this.A05;
                            if (str3 == null) {
                                str = "containerModule";
                            } else {
                                viewPager23.setAdapter(new C53160GjW(this, A0l, str2, str3, list, i, i2));
                                ViewPager2 viewPager24 = this.A0B;
                                if (viewPager24 != null) {
                                    viewPager24.A03(this.A09, false);
                                    ViewPager2 viewPager25 = this.A0B;
                                    if (viewPager25 != null) {
                                        viewPager25.A05(new N02(this, 0));
                                        View requireViewById = inflate.requireViewById(R.id.background_dimmer);
                                        this.A0A = requireViewById;
                                        if (requireViewById == null) {
                                            str = "backgroundDimmer";
                                        } else {
                                            C71402Ok1.A00(requireViewById, 54, this);
                                            AnonymousClass0fD.A09(901491028, A022);
                                            return inflate;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
