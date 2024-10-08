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

public final class E4G extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AddObjectivesFlowConnectFragment";
    public RecyclerView A00;
    public C46816Dls A01;
    public BusinessFlowAnalyticsLogger A02;
    public C46383De2 A03;
    public IgdsBottomButtonLayout A04;
    public String A05;
    public List A06;
    public G8D A07;
    public IgdsStepperHeader A08;
    public final Set A09 = DbS.A0y();
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final 1wn A0C = FXZ.A00(this, 3);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131952323);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        FPB.A02(A0K, r3, this, 15);
    }

    public final String getModuleName() {
        return "add_objectives_flow_connect_fragment";
    }

    public final void onAttach(Context context) {
        G8D g8d;
        0qQ.A0B(context, 0);
        E4G.super.onAttach(context);
        G8D requireActivity = requireActivity();
        if (requireActivity instanceof G8D) {
            g8d = requireActivity;
        } else {
            g8d = null;
        }
        this.A07 = g8d;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A08 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.A03(1, 2, true, false);
        }
        IgdsStepperHeader igdsStepperHeader2 = this.A08;
        if (igdsStepperHeader2 != null) {
            igdsStepperHeader2.A01();
        }
        IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.action_bottom_button);
        A0c.setPrimaryButtonEnabled(false);
        A0c.setPrimaryActionOnClickListener(FPB.A00(this, 16));
        this.A04 = A0c;
        Dba.A16(getViewLifecycleOwner(), ((C46750Dkd) this.A0A.getValue()).A02, new C59101J6j(15, (Object) this, (Object) view), 47);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("business_objectives", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public E4G() {
        0Yh A0z = DbS.A0z(C46750Dkd.class);
        this.A0A = DbS.A0I(new C20703Wxa(this, 10), new C20703Wxa(this, 11), new C41566AwY(9, (Object) null, this), A0z);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1252348747);
        E4G.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r4 = this.A0B;
        this.A03 = new C46383De2(AnonymousClass7TE.A0l(r4), this);
        1xC.A01.A02(this.A0C, AnonymousClass0KZ.class);
        this.A05 = DbS.A0l(requireArguments);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A07, this, DbT.A0X(r4));
        this.A02 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("business_objectives", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(-1755835421, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-138260677);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_objectives_flow_connect_fragment, viewGroup, false);
        Dba.A06(inflate).setText(2131952321);
        Dba.A05(inflate).setText(2131952320);
        Dba.A16(getViewLifecycleOwner(), ((C46750Dkd) this.A0A.getValue()).A03, new C58728Iwb(this, 35), 47);
        AnonymousClass0fD.A09(-1511279716, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(770164341);
        super.onDestroyView();
        this.A08 = null;
        this.A00 = null;
        1xC.A01.A03(this.A0C, AnonymousClass0KZ.class);
        AnonymousClass0fD.A09(-1319679847, A022);
    }
}
