package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UZh  reason: case insensitive filesystem */
public final class C15279UZh extends AnonymousClass4DH implements AnonymousClass4DS, X3S {
    public static final String __redex_internal_original_name = "PromoteCampaignControlsBudgetDurationFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public ViewStub A05;
    public C18643Vvl A06;
    public String A07;
    public int A08;
    public int A09;
    public int A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public final AnonymousClass0eM A0E = C20694WxQ.A00(this, 37);
    public final AnonymousClass0eM A0F = C20694WxQ.A00(this, 38);
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(new C20694WxQ(this, 40));
    public final AnonymousClass0eM A0H = C20694WxQ.A00(this, 41);
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final AnonymousClass0eM A0J = AnonymousClass1YB.A00(new C20694WxQ(this, 39));

    public final void Dab(PromoteState promoteState, Integer num) {
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0j) {
            A01(A00(this).A07, A00(this).A0A);
            int i = A00(this).A0I;
            A00(this).A0I = this.A02 + ((A00(this).A0A - this.A00) * A00(this).A07) + this.A01;
            boolean A0E2 = A00(this).A0E();
            A00(this).A0I = i;
            View view = this.A04;
            if (view != null) {
                view.setVisibility(DbW.A01(A0E2 ? 1 : 0));
            } else if (A0E2) {
                ViewStub viewStub = this.A05;
                if (viewStub != null) {
                    viewStub.setVisibility(0);
                    ViewStub viewStub2 = this.A05;
                    if (viewStub2 != null) {
                        View inflate = viewStub2.inflate();
                        if (inflate != null) {
                            this.A04 = inflate;
                            View findViewById = inflate.findViewById(R.id.budget_ads_manager_link_text);
                            if (findViewById != null) {
                                WBB.A01(findViewById, 2, this);
                                View view2 = this.A04;
                                if (view2 != null) {
                                    AnonymousClass7TG.A0R(view2, R.id.budget_warning_text).setText(2131970245);
                                    View view3 = this.A04;
                                    if (view3 != null) {
                                        view3.setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                0qQ.A0F("budgetWarningViewStub");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131970242);
        r5.Eu4(true);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        this.A06 = A002;
        A002.A01(new WBB(this, 1), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A06;
        if (vvl != null) {
            vvl.A02(true);
        }
    }

    public final String getModuleName() {
        return "promotion_campaign_controls_budget_duration";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String A002;
        0qQ.A0B(view, 0);
        C13991Tnr.A0w(this);
        AnonymousClass0eM r5 = this.A0H;
        C13990Tnq.A0O(r5).A0A(this);
        this.A0D = DbU.A0G(view, R.id.total_spend_value_view);
        this.A0B = DbU.A0G(view, R.id.elapsed_spend_text_view);
        this.A0C = DbU.A0G(view, R.id.remaining_spend_text_view);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AnonymousClass000.A00(582));
        if (string != null) {
            this.A08 = Integer.parseInt(string);
            this.A02 = requireArguments.getInt("spent_budget_offset_amount");
            this.A00 = requireArguments.getInt("elapsed_duration_in_days");
            this.A0A = requireArguments.getInt("total_duration_in_days");
            this.A03 = requireArguments.getInt("total_budget_offset_amount");
            this.A09 = requireArguments.getInt(AnonymousClass000.A00(761));
            this.A07 = requireArguments.getString("boosted_id");
            A00(this).A07 = this.A08;
            PromoteData A003 = A00(this);
            int i = this.A0A;
            A003.A0A = i;
            this.A01 = (this.A03 - this.A02) - (this.A08 * (i - this.A00));
            A00(this).A0I = A00(this).A07 * A00(this).A0A;
            int i2 = (this.A0A * 24) - this.A09;
            A01(A00(this).A07, A00(this).A0A);
            A00(this).A1n.add(0, 0);
            List list = A00(this).A1n;
            0qQ.A06(list);
            0sh it = 0sr.A1R(list).iterator();
            while (it.hasNext()) {
                int A004 = it.A00();
                List list2 = A00(this).A1n;
                list2.set(A004, Integer.valueOf(C51971G9r.A0I(list2, A004) + A00(this).A07));
            }
            if (!C66581MXm.A1W(A00(this).A07, A00(this).A1n)) {
                G9w.A0x(A00(this).A07, A00(this).A1n);
            }
            List list3 = A00(this).A1n;
            0qQ.A06(list3);
            01V.A1C(list3);
            Context requireContext = requireContext();
            AnonymousClass0eM r6 = this.A0I;
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            VAH.A00(requireContext, new C17567VaL(view, "budget_slider"), A00(this), C13990Tnq.A0O(r5), A0l, W2x.A04(requireContext(), A00(this)));
            A00(this).A1o = new ArrayList();
            A00(this).A1o.add(0, Integer.valueOf(A00(this).A0A));
            UserSession userSession = A00(this).A0y;
            0qQ.A06(userSession);
            if (182.A06(0Tu.A05, userSession, 36327988735785818L)) {
                List list4 = W2x.A01;
                ArrayList A0p = AnonymousClass7TF.A0p(list4);
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    AnonymousClass7TF.A1M(A0p, AnonymousClass7TG.A0F(it2) + A00(this).A0A);
                }
                Iterator it3 = A0p.iterator();
                while (it3.hasNext()) {
                    G9w.A0x(AnonymousClass7TG.A0F(it3), A00(this).A1o);
                }
            } else {
                List list5 = W2x.A00;
                ArrayList A0p2 = AnonymousClass7TF.A0p(list5);
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    AnonymousClass7TF.A1M(A0p2, AnonymousClass7TG.A0F(it4) + A00(this).A0A);
                }
                Iterator it5 = A0p2.iterator();
                while (it5.hasNext()) {
                    G9w.A0x(AnonymousClass7TG.A0F(it5), A00(this).A1o);
                }
            }
            if (!C66581MXm.A1W(A00(this).A0A, A00(this).A1o)) {
                G9w.A0x(A00(this).A0A, A00(this).A1o);
            }
            List list6 = A00(this).A1o;
            0qQ.A06(list6);
            01V.A1C(list6);
            Context requireContext2 = requireContext();
            UserSession A0l2 = AnonymousClass7TE.A0l(r6);
            C17567VaL vaL = new C17567VaL(view, "duration_slider");
            Context requireContext3 = requireContext();
            List list7 = A00(this).A1o;
            0qQ.A06(list7);
            VAH.A00(requireContext2, vaL, A00(this), C13990Tnq.A0O(r5), A0l2, W2x.A05(requireContext3, list7));
            this.A05 = DbU.A0D(view, R.id.budget_warning_stub);
            TextView textView = this.A0B;
            if (textView != null) {
                String A0K = C13992Tns.A0K(this, this.A02);
                if (i2 < 24) {
                    Context requireContext4 = requireContext();
                    int i3 = 2131970463;
                    if (i2 == 1) {
                        i3 = 2131970465;
                    }
                    A002 = DbW.A0h(requireContext4, Integer.valueOf(i2), i3);
                    0qQ.A0A(A002);
                } else {
                    A002 = W2x.A00(requireContext(), this.A00);
                }
                textView.setText(getString(2131970273, new Object[]{A0K, A002}));
                TextView textView2 = this.A0B;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    super.onViewCreated(view, bundle);
                    return;
                }
            }
            0qQ.A0F("elapsedSpendView");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final PromoteData A00(C15279UZh uZh) {
        return (PromoteData) AnonymousClass7TE.A14(uZh.A0J);
    }

    private final void A01(int i, int i2) {
        String str;
        int i3 = i2 - this.A00;
        int i4 = (i * i3) + this.A01;
        int i5 = ((i2 - this.A0A) * 24) + this.A09;
        TextView textView = this.A0D;
        if (textView == null) {
            str = "totalSpendValueView";
        } else {
            textView.setText(getString(2131970814, new Object[]{C13992Tns.A0K(this, this.A02 + i4), W2x.A00(requireContext(), i2)}));
            str = "remainingSpendView";
            if (i5 < 24) {
                TextView textView2 = this.A0C;
                if (textView2 != null) {
                    String A0K = C13992Tns.A0K(this, i4);
                    Context requireContext = requireContext();
                    int i6 = 2131970463;
                    if (i5 == 1) {
                        i6 = 2131970465;
                    }
                    String A0h = DbW.A0h(requireContext, Integer.valueOf(i5), i6);
                    0qQ.A0A(A0h);
                    textView2.setText(getString(2131970275, new Object[]{A0K, A0h}));
                }
            } else {
                TextView textView3 = this.A0C;
                if (textView3 != null) {
                    textView3.setText(getString(2131970275, new Object[]{C13992Tns.A0K(this, i4), W2x.A00(requireContext(), i3)}));
                }
            }
            TextView textView4 = this.A0C;
            if (textView4 != null) {
                textView4.setVisibility(0);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-739244584);
        C15279UZh.super.onCreate(bundle);
        C13991Tnr.A0w(this);
        AnonymousClass0fD.A09(-861255262, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1049506367);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_campaign_controls_budget_duration_view, viewGroup, false);
        AnonymousClass0fD.A09(-1867959056, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1017784700);
        super.onDestroy();
        this.A06 = null;
        AnonymousClass0fD.A09(-1712530148, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(195281974);
        super.onDestroyView();
        C13990Tnq.A0O(this.A0H).A0B(this);
        this.A04 = null;
        AnonymousClass0fD.A09(324931036, A022);
    }
}
