package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import ca.psiphon.PsiphonTunnel;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.model.shopping.ProductSource;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;

/* renamed from: X.Ubt  reason: case insensitive filesystem */
public final class C15390Ubt extends AnonymousClass32G implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C21048XBp {
    public static final C16659Uyv A0N = C16659Uyv.CATALOG;
    public static final String __redex_internal_original_name = "CatalogSelectionFragment";
    public View.OnClickListener A00;
    public IgdsBottomButtonLayout A01;
    public C15477UdS A02;
    public W35 A03;
    public C17598Vaq A04;
    public C17910Vi1 A05;
    public RefreshableListView A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public C252063oV A0F;
    public EmptyStateView A0G;
    public String A0H;
    public String A0I = "";
    public boolean A0J;
    public final AnonymousClass0eM A0K = C227642jf.A02(this);
    public final VP9 A0L = new VP9(this);
    public final VPA A0M = new VPA(this);

    public final void DVy() {
    }

    public final void EKl() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        if (this.A0J) {
            ? obj = new Object();
            obj.A02 = DbV.A05(this).getString(2131969839);
            obj.A01 = new WBC(this, 65);
            r5.ErM(new C59904JbT(obj));
        } else {
            int i = 2131969839;
            if (this.A0B) {
                i = 2131964223;
            }
            r5.Eom(i);
        }
        r5.ARJ(false);
        r5.Eu4(true);
    }

    public final String getModuleName() {
        return "product_source_selection";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.UdS, android.widget.ListAdapter] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r2 = this.A0K;
        Boolean Cc0 = DbX.A0l(r0, r2).A03.Cc0();
        if (Cc0 == null || !Cc0.booleanValue()) {
            0S7.A00(this);
            ListView listView = this.A04;
            0qQ.A0C(listView, AnonymousClass000.A00(31));
            RefreshableListView refreshableListView = (RefreshableListView) listView;
            this.A06 = refreshableListView;
            if (refreshableListView != null) {
                ? r02 = this.A02;
                if (r02 == 0) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
                refreshableListView.setAdapter(r02);
            }
            if (this.A0B) {
                RefreshableListView refreshableListView2 = this.A06;
                if (refreshableListView2 != null) {
                    refreshableListView2.setPullToRefreshBackgroundColor(JTP.A02(getContext(), requireContext(), R.attr.backgroundColorSecondary));
                }
                RefreshableListView refreshableListView3 = this.A06;
                if (refreshableListView3 != null) {
                    refreshableListView3.setupAndEnableRefresh(new WBC(this, 68));
                    refreshableListView3.A07 = false;
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            C249713kF.A00.A0T();
            0lg A0X = DbT.A0X(r2);
            String string = bundle2.getString("waterfall_id");
            if (string == null) {
                string = "";
            }
            String string2 = bundle2.getString("prior_module_name");
            String A002 = AnonymousClass000.A00(1237);
            HashMap hashMap = new HashMap();
            hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A002);
            hashMap.put("waterfall_id", string);
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put("prior_module", string2);
            hashMap.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            hashMap.put(AnonymousClass000.A00(PsiphonTunnel.VPN_INTERFACE_MTU), String.valueOf(true));
            C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(2885), hashMap);
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A0X);
            igBloksScreenConfig.A0U = "";
            AnonymousClass3M3 A022 = C49891FBs.A02(igBloksScreenConfig, A042);
            0s1 r1 = new 0s1(getParentFragmentManager());
            r1.A09(A022, R.id.seller_access_revoked_bloks_container);
            r1.A00();
        }
    }

    public static final void A01(C15390Ubt ubt, C320156rr r2) {
        int i;
        EmptyStateView emptyStateView = ubt.A0G;
        if (emptyStateView != null) {
            emptyStateView.A0P(r2);
        }
        int ordinal = r2.ordinal();
        EmptyStateView emptyStateView2 = ubt.A0G;
        if (ordinal == 4) {
            if (emptyStateView2 != null) {
                i = 8;
            } else {
                return;
            }
        } else if (emptyStateView2 != null) {
            i = 0;
        } else {
            return;
        }
        emptyStateView2.setVisibility(i);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0K);
    }

    public final void DW7() {
        String str;
        C15477UdS udS = this.A02;
        if (udS == null) {
            str = "adapter";
        } else {
            if (udS.isEmpty()) {
                C17910Vi1 vi1 = this.A05;
                if (vi1 == null) {
                    str = "networkHelper";
                } else if (vi1.A00 != AnonymousClass05K.A00) {
                    vi1.A00(this.A08);
                    A01(this, C320156rr.LOADING);
                }
            }
            W35 w35 = this.A03;
            if (w35 == null) {
                str = "logger";
            } else {
                w35.A01 = A0N;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        FragmentActivity activity;
        if (this.A03 == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A0C && (activity = getActivity()) != null) {
            int i = 0;
            if (this.A09) {
                i = -1;
            }
            activity.setResult(i);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.V3W] */
    public final void onCreate(Bundle bundle) {
        String A062;
        String A0g;
        String str;
        int A022 = AnonymousClass0fD.A02(1730656552);
        C15390Ubt.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0B = requireArguments.getBoolean("in_app_signup_flow");
        this.A0E = requireArguments.getInt("in_app_signup_stepper_index");
        this.A0D = requireArguments.getInt("in_app_signup_stepper_capacity");
        String string = requireArguments.getString("in_app_signup_catalog_selection_title_text");
        if (string != null) {
            this.A0I = string;
        }
        this.A0H = requireArguments.getString("in_app_signup_bottom_button_text");
        String string2 = requireArguments.getString("in_app_signup_bottom_button_route");
        if (string2 != null) {
            this.A07 = string2;
        }
        this.A0J = requireArguments.getBoolean("is_onboarding");
        this.A0C = requireArguments.getBoolean("should_return_result");
        this.A0A = DbT.A1X(requireArguments, "is_tabbed");
        AnonymousClass0eM r1 = this.A0K;
        this.A03 = new W35(AnonymousClass7TE.A0l(r1), this, requireArguments.getString("prior_module_name"), requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY), requireArguments.getString("waterfall_id"), this.A0A);
        ProductSource A002 = W3U.A00(AnonymousClass7TE.A0l(r1));
        W35 w35 = this.A03;
        if (w35 == null) {
            str = "logger";
        } else {
            w35.A07(A002, A0N, requireArguments.getString("initial_tab"));
            ? obj = new Object();
            obj.A01 = null;
            obj.A00 = null;
            this.A02 = new C15477UdS(obj, this);
            VP9 vp9 = this.A0L;
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            Context requireContext = requireContext();
            0gy A003 = AnonymousClass07i.A00(this);
            if (this.A0B) {
                A062 = "commerce/catalogs/signup/";
            } else {
                A062 = 0mp.A06("commerce/user/%s/available_catalogs/", new Object[]{DbU.A0u(r1)});
            }
            this.A05 = new C17910Vi1(requireContext, A003, A0l, vp9, A062);
            VPA vpa = this.A0M;
            UserSession A0l2 = AnonymousClass7TE.A0l(r1);
            Context requireContext2 = requireContext();
            0gy A004 = AnonymousClass07i.A00(this);
            if (this.A0B) {
                A0g = "commerce/catalogs/signup/%s/";
            } else {
                A0g = 002.A0g("commerce/user/", DbU.A0u(r1), "/available_catalogs/%s/");
                0qQ.A07(A0g);
            }
            this.A04 = new C17598Vaq(requireContext2, A004, A0l2, vpa, A0g);
            C15477UdS udS = this.A02;
            if (udS == null) {
                str = "adapter";
            } else {
                String str2 = udS.A03.A01;
                this.A08 = str2;
                C17910Vi1 vi1 = this.A05;
                if (vi1 == null) {
                    str = "networkHelper";
                } else {
                    vi1.A00(str2);
                    A01(this, C320156rr.LOADING);
                    AnonymousClass0fD.A09(-1046479665, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1281010148);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_source_selection_fragment, viewGroup, false);
        String str = "adapter";
        if (this.A0B) {
            Context context = inflate.getContext();
            String A16 = AnonymousClass7TE.A16(context, 2131964218);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(DbY.A0c(context, A16, 2131964220));
            AnonymousClass7AV.A05(spannableStringBuilder, new UsS(context, this, DbV.A02(context), 2), A16);
            C15477UdS udS = this.A02;
            if (udS != null) {
                String str2 = this.A0I;
                if (str2 == null || str2.length() == 0) {
                    str2 = DbV.A05(this).getString(2131964221);
                }
                0qQ.A0A(str2);
                udS.A00 = new VTS(str2, spannableStringBuilder);
                C15477UdS.A00(udS);
                C252063oV A0Y = DbU.A0Y(inflate, R.id.in_app_signup_flow_stepper_header);
                this.A0F = A0Y;
                if (A0Y == null) {
                    str = "stepperHeader";
                } else {
                    ((IgdsStepperHeader) A0Y.getView()).A02(this.A0E, this.A0D);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.bottom_buttons);
                    this.A01 = igdsBottomButtonLayout;
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A01;
                    if (igdsBottomButtonLayout2 != null) {
                        igdsBottomButtonLayout2.setPrimaryAction(this.A0H, new WBE(4, (Object) context, (Object) this));
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A01;
                    if (igdsBottomButtonLayout3 != null) {
                        igdsBottomButtonLayout3.setSecondaryAction(getString(2131969829), new WBC(this, 66));
                    }
                    if (getRootActivity() instanceof AnonymousClass2ZP) {
                        Activity rootActivity = getRootActivity();
                        0qQ.A0C(rootActivity, C66579MXk.A00(16));
                        ((AnonymousClass2ZP) rootActivity).Enj(8);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C15477UdS udS2 = this.A02;
        if (udS2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                String A162 = AnonymousClass7TE.A16(context2, 2131969832);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(DbY.A0c(context2, A162, 2131969833));
                AnonymousClass7AV.A05(spannableStringBuilder2, new UsS(context2, this, context2.getColor(R.color.text_view_link_color), 1), A162);
                udS2.A01 = spannableStringBuilder2;
                C15477UdS.A00(udS2);
                EmptyStateView emptyStateView = (EmptyStateView) inflate.requireViewById(16908292);
                this.A0G = emptyStateView;
                if (emptyStateView != null) {
                    C320156rr r2 = C320156rr.ERROR;
                    emptyStateView.A0R(r2, R.drawable.loadmore_icon_refresh_compound);
                    emptyStateView.A0N(new WBC(this, 67), r2);
                }
                AnonymousClass0fD.A09(-566728739, A022);
                return inflate;
            }
            throw AnonymousClass7TE.A0y();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2066034494);
        super.onDestroyView();
        this.A01 = null;
        if (this.A0B && (getRootActivity() instanceof AnonymousClass2ZP)) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, C66579MXk.A00(16));
            ((AnonymousClass2ZP) rootActivity).Enj(0);
        }
        AnonymousClass0fD.A09(-1875337963, A022);
    }
}
