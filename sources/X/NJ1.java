package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Map;

public final class NJ1 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NudityReceiverEducationGetSupportFragment";
    public View A00;
    public ViewStub A01;
    public C69483NmR A02 = C69483NmR.IN_THREAD;
    public C69459Nm3 A03 = C69459Nm3.RECEIVER;
    public DirectThreadAnalyticsParams A04;
    public IgdsBottomButtonLayout A05;
    public boolean A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131961540);
        DbX.A1A(new C71402Ok1((Object) this, 25), DbX.A0M(), r4);
    }

    public final String getModuleName() {
        return "get_support";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        this.A01 = DbU.A0D(view, R.id.main_container_stub);
        BaseFragmentActivity activity = getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        activity.A0a();
        ViewStub viewStub = this.A01;
        if (viewStub == null) {
            str = "mainContainerStub";
        } else {
            View inflate = viewStub.inflate();
            this.A00 = inflate;
            str = "mainContainer";
            if (inflate != null) {
                IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) AnonymousClass7TF.A0F(inflate, R.id.stepper_header);
                View view2 = this.A00;
                if (view2 != null) {
                    ImageView A0J = DbX.A0J(view2, R.id.nudity_receiver_safety_tips_image);
                    DbU.A13(A0J.getContext(), A0J, R.drawable.ig_illustrations_illo_support_refresh);
                    View view3 = this.A00;
                    if (view3 != null) {
                        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(view3, R.id.nudity_receiver_list_cell_report);
                        C69349Njo njo = C69349Njo.TYPE_CHEVRON;
                        igdsListCell.A0G(njo, true);
                        C71402Ok1.A00(igdsListCell, 26, this);
                        boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A07, 0), 36325897087235418L);
                        View view4 = this.A00;
                        if (view4 != null) {
                            IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0F(view4, R.id.nudity_receiver_list_cell_prevent);
                            igdsListCell2.A0G(njo, true);
                            AnonymousClass0fU.A00(new C50100FOq(2, (Object) this, A062), igdsListCell2);
                            View view5 = this.A00;
                            if (view5 != null) {
                                IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TF.A0F(view5, R.id.nudity_receiver_list_cell_find);
                                igdsListCell3.A0G(njo, true);
                                C71402Ok1.A00(igdsListCell3, 27, this);
                                View view6 = this.A00;
                                if (view6 != null) {
                                    IgdsListCell igdsListCell4 = (IgdsListCell) AnonymousClass7TF.A0F(view6, R.id.nudity_receiver_list_cell_learn);
                                    igdsListCell4.A0G(njo, true);
                                    C71402Ok1.A00(igdsListCell4, 28, this);
                                    igdsStepperHeader.A03(2, 3, true, false);
                                    igdsStepperHeader.A01();
                                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.action_bottom_button);
                                    this.A05 = igdsBottomButtonLayout;
                                    String str2 = null;
                                    if (igdsBottomButtonLayout != null) {
                                        Context context = getContext();
                                        if (context != null) {
                                            str2 = context.getString(2131961522);
                                        }
                                        igdsBottomButtonLayout.setPrimaryActionText(str2);
                                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A05;
                                        if (igdsBottomButtonLayout2 != null) {
                                            igdsBottomButtonLayout2.setPrimaryActionIsLoading(false);
                                            C71402Ok1 ok1 = new C71402Ok1((Object) this, 29);
                                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A05;
                                            if (igdsBottomButtonLayout3 != null) {
                                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(ok1);
                                                super.onViewCreated(view, bundle);
                                                return;
                                            }
                                        }
                                    }
                                    0qQ.A0F("bottomButtonLayout");
                                    throw AnonymousClass00P.createAndThrow();
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public static final void A00(NJ1 nj1, String str) {
        FH7.A08(nj1.requireActivity(), AnonymousClass7TE.A0l(nj1.A07), 2EG.A2e, str, "get_support");
    }

    public final void onCreate(Bundle bundle) {
        Parcelable.Creator creator;
        int A022 = AnonymousClass0fD.A02(-1015325004);
        NJ1.super.onCreate(bundle);
        String string = requireArguments().getString("ODNC_USER_ROLE_KEY");
        if (string == null) {
            string = "RECEIVER";
        }
        this.A03 = C69459Nm3.valueOf(string);
        String string2 = requireArguments().getString("ODNC_ENTRY_POINT_KEY");
        if (string2 == null) {
            string2 = "IN_THREAD";
        }
        this.A02 = C69483NmR.valueOf(string2);
        this.A06 = requireArguments().getBoolean("IS_ELIGIBLE_FOR_LOGGING_KEY");
        Bundle requireArguments = requireArguments();
        Class<DirectThreadAnalyticsParams> cls = DirectThreadAnalyticsParams.class;
        Object obj = cls.getDeclaredField("CREATOR").get((Object) null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            Map map = 0Yh.A03;
            IllegalArgumentException A0W = AnonymousClass7TF.A0W("Could not access CREATOR field in class ", 0q1.A01(cls));
            AnonymousClass0fD.A09(413920377, A022);
            throw A0W;
        }
        this.A04 = (DirectThreadAnalyticsParams) ((Parcelable) 0B0.A01(creator, requireArguments.getParcelable("DIRECT_THREAD_ANALYTICS_PARAMS_KEY"), cls));
        AnonymousClass0fD.A09(1267811467, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1106624046);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudity_receiver_education_get_support_view, viewGroup, false);
        AnonymousClass0fD.A09(-88796936, A022);
        return inflate;
    }
}
