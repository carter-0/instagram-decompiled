package X;

import android.text.SpannableString;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class F3i {
    public static boolean A09;
    public C46388DeA A00;
    public String A01 = "";
    public String A02 = "";
    public List A03;
    public final BusinessFlowAnalyticsLogger A04;
    public final OnboardingCheckListFragment A05;
    public final C46383De2 A06;
    public final UserSession A07;
    public final String A08;

    public F3i(BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, OnboardingCheckListFragment onboardingCheckListFragment, C46383De2 de2, UserSession userSession, String str) {
        DbW.A1N(userSession, 1, str);
        this.A07 = userSession;
        this.A05 = onboardingCheckListFragment;
        this.A06 = de2;
        this.A04 = businessFlowAnalyticsLogger;
        this.A08 = str;
    }

    public final void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger != null) {
            String str2 = str;
            if (str != null) {
                businessFlowAnalyticsLogger.Ckp(new C22030Xtl("onboarding_checklist", this.A08, str2, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
        }
    }

    public final void A00() {
        SpannableString spannableString;
        int A0H;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        0sn<F3Q> r0 = this.A03;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        for (F3Q f3q : r0) {
            if ("complete".equals(f3q.A03)) {
                builder2.add(f3q);
            } else {
                builder.add(f3q);
            }
        }
        ImmutableList build = builder.build();
        ImmutableList build2 = builder2.build();
        OnboardingCheckListFragment onboardingCheckListFragment = this.A05;
        ViewModelListUpdate A0R = DbS.A0R();
        build.getClass();
        C249803kO it = build.iterator();
        while (it.hasNext()) {
            A0R.A00(new FXy((F3Q) it.next()));
        }
        build2.getClass();
        if (!build2.isEmpty()) {
            A0R.A00(new C50319FXz(onboardingCheckListFragment.getString(2131956477)));
            C249803kO it2 = build2.iterator();
            while (it2.hasNext()) {
                A0R.A00(new FXy((F3Q) it2.next()));
            }
        }
        onboardingCheckListFragment.A06.A05(A0R);
        int size = build2.size();
        int size2 = build2.size() + build.size();
        String string = onboardingCheckListFragment.getString(2131956478, new Object[]{Integer.valueOf(size), Integer.valueOf(size2)});
        if (DbY.A1Y(0Tu.A05, onboardingCheckListFragment.A07, 36326240684226196L)) {
            spannableString = new SpannableString(002.A0g(string, " ", onboardingCheckListFragment.getString(2131974204)));
            A0H = 2Yu.A07(onboardingCheckListFragment.requireContext());
            onboardingCheckListFragment.mStepsCompletedTextView.setAllCaps(false);
        } else {
            spannableString = new SpannableString(002.A0g(string, " ", onboardingCheckListFragment.getString(2131974203)));
            if (size <= size2 / 2) {
                A0H = R.color.clips_gradient_redesign_color_1;
            } else {
                A0H = 2Yu.A0H(onboardingCheckListFragment.requireContext(), R.attr.igds_color_success);
            }
        }
        0mq.A02(spannableString, spannableString.toString(), onboardingCheckListFragment.requireContext().getColor(2Yu.A08(onboardingCheckListFragment.requireContext())));
        0mq.A02(spannableString, string, onboardingCheckListFragment.requireContext().getColor(A0H));
        onboardingCheckListFragment.mStepsCompletedTextView.setText(spannableString);
        onboardingCheckListFragment.mHeadline.setHeadline((CharSequence) onboardingCheckListFragment.A04.A02);
        onboardingCheckListFragment.mHeadline.setBody((CharSequence) onboardingCheckListFragment.A04.A01);
        if (onboardingCheckListFragment.A0A) {
            onboardingCheckListFragment.A0A = false;
            C49538ExN exN = onboardingCheckListFragment.A02;
            AnonymousClass61R r2 = exN.A01;
            ImageView imageView = exN.A00;
            if (!(imageView == null || r2 == null || r2.isPlaying())) {
                imageView.setVisibility(0);
                r2.EL2(0.0f);
                r2.E2p();
            }
        }
        if (build.isEmpty()) {
            onboardingCheckListFragment.mBusinessNavBar.setVisibility(0);
            AnonymousClass7TH.A0R(onboardingCheckListFragment.mSkipOcContainer);
            return;
        }
        CallerContext callerContext = FRZ.A00;
    }

    public final void A02(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            String str = ((F3Q) next).A05;
            0qQ.A07(str);
            if (C48741EjQ.A00(str) != null) {
                A1C.add(next);
            }
        }
        this.A03 = A1C;
        A00();
    }
}
