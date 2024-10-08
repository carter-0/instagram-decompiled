package X;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.CustomTypefaceSpan;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Umd  reason: case insensitive filesystem */
public abstract class C15996Umd extends C15267UYh implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenThankYouScreenBaseFragment";
    public IgTextView A00;
    public IgTextView A01;
    public IgImageView A02;
    public 2el A03;
    public IgdsBottomButtonLayout A04;

    public final CharSequence A09(JVH jvh) {
        CharSequence A012 = C66909Mes.A01(this, (C266444Yx) jvh.A01);
        if (((C16038UnR) A07()).A01) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
            A012 = spannableStringBuilder;
            String str = jvh.A05;
            int A08 = 00l.A08(spannableStringBuilder, str, 0, false);
            Typeface A0N = AnonymousClass7TG.A0N(requireContext());
            if (A08 >= 0 && A0N != null) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan(A0N), A08, DbX.A05(str) + A08, 17);
            }
        }
        return A012;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2el r0 = this.A03;
        if (r0 != null) {
            Dba.A0z(view, r0, this);
            this.A02 = DbT.A0b(view, R.id.thank_you_screen_icon);
            this.A01 = DbT.A0a(view, R.id.thank_you_screen_title);
            this.A00 = DbT.A0a(view, R.id.thank_you_screen_subtitle);
            this.A04 = C13990Tnq.A0Q(view);
            DbV.A1F(getViewLifecycleOwner(), ((C16038UnR) A07()).A03, new C20786Wyx(this, 26), 12);
            C18463VsC vsC = ((C16038UnR) A07()).A06;
            boolean z = ((C16038UnR) A07()).A00;
            XB6 xb6 = vsC.A00;
            String str2 = vsC.A01;
            if (z) {
                str = "lead_gen_thank_you_screen_with_call_button";
            } else {
                str = "lead_gen_thank_you_screen";
            }
            xb6.Cgq(C18463VsC.A00(vsC.A02), str2, str, "consumer_thank_you_screen_impression", "impression");
            return;
        }
        0qQ.A0F("viewpointManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0A() {
        UserSession userSession;
        Activity A002;
        if (this instanceof C16011Ums) {
            C16011Ums ums = (C16011Ums) this;
            userSession = ((C16038UnR) ums.A09.getValue()).A04;
            A002 = DbT.A03(ums);
        } else {
            C16010Umr umr = (C16010Umr) this;
            AnonymousClass0eM r3 = umr.A00;
            if (((C16038UnR) r3.getValue()).A0E) {
                userSession = ((C16038UnR) r3.getValue()).A04;
                A002 = C61190ls.A00(umr.requireActivity());
            } else {
                W1T.A01(umr.requireActivity(), ((C16038UnR) r3.getValue()).A04, ((C16038UnR) r3.getValue()).A0D);
                return;
            }
        }
        AnonymousClass7TG.A1N(userSession, A002);
        C71342cb.A00(userSession).A06(A002);
        A002.finish();
    }

    public final void configureActionBar(2da r4) {
        Dbb.A1J(r4);
        DbX.A1A(new WBA((Object) this, 19), DbX.A0M(), r4);
    }

    public final AnonymousClass0wW getSession() {
        return ((C16038UnR) A07()).A04;
    }

    public final boolean onBackPressed() {
        A0A();
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-565498187);
        0qQ.A0B(layoutInflater, 0);
        this.A03 = DbY.A0U();
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_thank_you_screen, viewGroup, false);
        AnonymousClass0fD.A09(844148863, A022);
        return inflate;
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1072239862);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(54005786, A022);
    }
}
