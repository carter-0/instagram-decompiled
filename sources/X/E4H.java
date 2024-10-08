package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class E4H extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AddObjectivesFlowSeeMoreFragment";
    public RecyclerView A00;
    public C46815Dlr A01;
    public BusinessFlowAnalyticsLogger A02;
    public C46383De2 A03;
    public IgdsBottomButtonLayout A04;
    public String A05;
    public List A06;
    public List A07 = AnonymousClass7TE.A1C();
    public G8D A08;
    public IgdsStepperHeader A09;
    public final Set A0A = DbS.A0y();
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131952323);
        FPB.A02(DbX.A0M(), r3, this, 17);
    }

    public final String getModuleName() {
        return "add_objectives_flow_see_more_fragment";
    }

    public final void onAttach(Context context) {
        G8D g8d;
        0qQ.A0B(context, 0);
        E4H.super.onAttach(context);
        G8D requireActivity = requireActivity();
        if (requireActivity instanceof G8D) {
            g8d = requireActivity;
        } else {
            g8d = null;
        }
        this.A08 = g8d;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A09 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.A03(0, 2, true, false);
        }
        IgdsStepperHeader igdsStepperHeader2 = this.A09;
        if (igdsStepperHeader2 != null) {
            igdsStepperHeader2.A01();
        }
        this.A01 = new C46815Dlr(this);
        RecyclerView A0K = DbX.A0K(view);
        this.A00 = A0K;
        if (A0K != null) {
            DbY.A15(this, A0K);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C46815Dlr dlr = this.A01;
            if (dlr == null) {
                str = "adapter";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.setAdapter(dlr);
        }
        IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.action_bottom_button);
        A0c.setPrimaryButtonEnabled(false);
        A0c.setPrimaryActionOnClickListener(FPB.A00(this, 18));
        this.A04 = A0c;
        C46383De2 de2 = this.A03;
        if (de2 == null) {
            str = "onboardingChecklistNetworkHelper";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C47697EDg A002 = C47697EDg.A00(this, 11);
        AnonymousClass4D6 r3 = de2.A01;
        1NY A0b = AnonymousClass7TG.A0b(de2.A00);
        A0b.A0A("business/account/get_business_objectives_connection_methods/");
        A0b.A0Q(DvY.class, F52.class);
        DbW.A1E(A0b, A002, r3);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public E4H() {
        0Yh A0z = DbS.A0z(C46750Dkd.class);
        this.A0B = DbS.A0I(new C20703Wxa(this, 12), new C20703Wxa(this, 13), new C41566AwY(10, (Object) null, this), A0z);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(261899016);
        E4H.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r2 = this.A0C;
        this.A03 = new C46383De2(AnonymousClass7TE.A0l(r2), this);
        this.A05 = DbS.A0l(requireArguments);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A08, this, DbT.A0X(r2));
        this.A02 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("business_objectives", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(-1385959575, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2120024836);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_objectives_flow_see_more_fragment, viewGroup, false);
        Dba.A06(inflate).setText(2131952325);
        Dba.A05(inflate).setText(2131952324);
        Dba.A16(getViewLifecycleOwner(), ((C46750Dkd) this.A0B.getValue()).A03, new C58728Iwb(this, 36), 48);
        AnonymousClass0fD.A09(-903777615, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1853298034);
        super.onDestroyView();
        this.A09 = null;
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-943214330, A022);
    }
}
