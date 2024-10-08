package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education.NudityReceiverEducationSafetyTipsViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.Map;

/* renamed from: X.NIw  reason: case insensitive filesystem */
public final class C68458NIw extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NudityReceiverEducationSafetyTipsFragment";
    public int A00;
    public View A01;
    public ViewStub A02;
    public C69483NmR A03 = C69483NmR.IN_THREAD;
    public C69459Nm3 A04 = C69459Nm3.RECEIVER;
    public DirectThreadAnalyticsParams A05;
    public IgdsBottomButtonLayout A06;
    public boolean A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131961540);
        DbX.A1A(new C71402Ok1((Object) this, 30), DbX.A0M(), r4);
    }

    public final String getModuleName() {
        return "safety_tips";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String A16;
        String A162;
        String A163;
        String A164;
        String A165;
        String str;
        0qQ.A0B(view, 0);
        this.A02 = DbU.A0D(view, R.id.main_container_stub);
        BaseFragmentActivity activity = getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        activity.A0a();
        int i2 = this.A00;
        FragmentActivity requireActivity = requireActivity();
        if (i2 == 0) {
            i = R.drawable.ig_illustrations_illo_sharing_media_refresh;
            A16 = AnonymousClass7TE.A16(requireActivity, 2131961539);
            A162 = AnonymousClass7TE.A16(requireActivity, 2131961536);
            A163 = AnonymousClass7TE.A16(requireActivity, 2131961537);
            A164 = AnonymousClass7TE.A16(requireActivity, 2131961538);
            A165 = "";
        } else {
            i = R.drawable.ig_illustrations_illo_conversations_refresh;
            A16 = AnonymousClass7TE.A16(requireActivity, 2131961534);
            A162 = AnonymousClass7TE.A16(requireActivity, 2131961530);
            A163 = AnonymousClass7TE.A16(requireActivity, 2131961531);
            A164 = AnonymousClass7TE.A16(requireActivity, 2131961532);
            A165 = AnonymousClass7TE.A16(requireActivity, 2131961533);
        }
        NudityReceiverEducationSafetyTipsViewModel nudityReceiverEducationSafetyTipsViewModel = new NudityReceiverEducationSafetyTipsViewModel(A16, A162, A163, A164, A165, i);
        ViewStub viewStub = this.A02;
        if (viewStub == null) {
            str = "mainContainerStub";
        } else {
            View inflate = viewStub.inflate();
            this.A01 = inflate;
            str = "mainContainer";
            if (inflate != null) {
                IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) AnonymousClass7TF.A0F(inflate, R.id.stepper_header);
                View view2 = this.A01;
                if (view2 != null) {
                    ImageView A0J = DbX.A0J(view2, R.id.nudity_receiver_safety_tips_image);
                    DbU.A13(A0J.getContext(), A0J, nudityReceiverEducationSafetyTipsViewModel.A00);
                    View view3 = this.A01;
                    if (view3 != null) {
                        AnonymousClass7TG.A0R(view3, R.id.nudity_receiver_safety_tips_headline).setText(nudityReceiverEducationSafetyTipsViewModel.A01);
                        View view4 = this.A01;
                        if (view4 != null) {
                            TextView A0R = AnonymousClass7TG.A0R(view4, R.id.nudity_receiver_safety_tips_sensitive_content_bullet1);
                            A0R.setText(new C46674Dj3(AnonymousClass7TE.A0S(A0R), AnonymousClass7TE.A1I(nudityReceiverEducationSafetyTipsViewModel.A02), 4, 10, 1));
                            View view5 = this.A01;
                            if (view5 != null) {
                                TextView A0R2 = AnonymousClass7TG.A0R(view5, R.id.nudity_receiver_safety_tips_sensitive_content_bullet2);
                                A0R2.setText(new C46674Dj3(AnonymousClass7TE.A0S(A0R2), AnonymousClass7TE.A1I(nudityReceiverEducationSafetyTipsViewModel.A03), 4, 10, 1));
                                View view6 = this.A01;
                                if (view6 != null) {
                                    TextView A0R3 = AnonymousClass7TG.A0R(view6, R.id.nudity_receiver_safety_tips_sensitive_content_bullet3);
                                    CharSequence dj3 = new C46674Dj3(requireContext(), AnonymousClass7TE.A1I(nudityReceiverEducationSafetyTipsViewModel.A04), 4, 10, 1);
                                    String str2 = nudityReceiverEducationSafetyTipsViewModel.A05;
                                    if (str2.length() != 0) {
                                        C69198Ngw ngw = new C69198Ngw(this, str2, DbZ.A01(this));
                                        SpannableStringBuilder A0C = DbS.A0C(002.A0D(str2, ' '));
                                        AnonymousClass7AV.A04(A0C, ngw, str2);
                                        dj3 = TextUtils.concat(new CharSequence[]{dj3, A0C});
                                    }
                                    DbX.A1G(A0R3, dj3);
                                    igdsStepperHeader.A03(this.A00, 3, true, false);
                                    igdsStepperHeader.A01();
                                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.action_bottom_button);
                                    this.A06 = igdsBottomButtonLayout;
                                    String str3 = null;
                                    if (igdsBottomButtonLayout != null) {
                                        Context context = getContext();
                                        if (context != null) {
                                            str3 = context.getString(2131961535);
                                        }
                                        igdsBottomButtonLayout.setPrimaryActionText(str3);
                                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A06;
                                        if (igdsBottomButtonLayout2 != null) {
                                            igdsBottomButtonLayout2.setPrimaryActionIsLoading(false);
                                            C71402Ok1 ok1 = new C71402Ok1((Object) this, 31);
                                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A06;
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
        return DbS.A0T(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        Parcelable.Creator creator;
        int A022 = AnonymousClass0fD.A02(-778479569);
        C68458NIw.super.onCreate(bundle);
        this.A00 = requireArguments().getInt("current_step");
        String string = requireArguments().getString("ODNC_USER_ROLE_KEY");
        if (string == null) {
            string = "RECEIVER";
        }
        this.A04 = C69459Nm3.valueOf(string);
        String string2 = requireArguments().getString("ODNC_ENTRY_POINT_KEY");
        if (string2 == null) {
            string2 = "IN_THREAD";
        }
        this.A03 = C69483NmR.valueOf(string2);
        this.A07 = requireArguments().getBoolean("IS_ELIGIBLE_FOR_LOGGING_KEY");
        Bundle requireArguments = requireArguments();
        Class<DirectThreadAnalyticsParams> cls = DirectThreadAnalyticsParams.class;
        Object obj = cls.getDeclaredField("CREATOR").get((Object) null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            Map map = 0Yh.A03;
            IllegalArgumentException A0W = AnonymousClass7TF.A0W("Could not access CREATOR field in class ", 0q1.A01(cls));
            AnonymousClass0fD.A09(-902881272, A022);
            throw A0W;
        }
        this.A05 = (DirectThreadAnalyticsParams) ((Parcelable) 0B0.A01(creator, requireArguments.getParcelable("DIRECT_THREAD_ANALYTICS_PARAMS_KEY"), cls));
        AnonymousClass0fD.A09(-59268044, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1491204438);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudity_receiver_education_safety_tips_view, viewGroup, false);
        AnonymousClass0fD.A09(-887162207, A022);
        return inflate;
    }
}
