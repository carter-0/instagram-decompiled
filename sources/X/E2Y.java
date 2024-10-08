package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;

public final class E2Y extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProductEligibilityStatusFragment";
    public UserMonetizationProductType A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new MMS(this, 1));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(C51789G1y.A00);

    public final void configureActionBar(2da r2) {
        int i;
        0qQ.A0B(r2, 0);
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType == null) {
            0qQ.A0F("productType");
            throw AnonymousClass00P.createAndThrow();
        }
        switch (userMonetizationProductType.ordinal()) {
            case 1:
                i = 2131966711;
                break;
            case 3:
                i = 2131954188;
                break;
            case 9:
                i = 2131966714;
                break;
            case 10:
                i = 2131966718;
                break;
            case 11:
                i = 2131964326;
                break;
            case 15:
                i = 2131966712;
                break;
            default:
                throw AnonymousClass7TE.A0w("monetization type is not supported");
        }
        DbW.A1B(r2, i);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0I = DbT.A0I(view, R.id.product_tool_eligibility_status_recycler_view);
        DbV.A1B(A0I.getContext(), A0I);
        Dba.A17(A0I, this.A02);
        C46786DlE dlE = (C46786DlE) this.A03.getValue();
        dlE.A01();
        if (dlE.A01 == null) {
            2AW.A00(dlE.A06).A01(dlE.A04, new MP7(dlE, 29));
        } else {
            C46786DlE.A00(dlE);
        }
        DbV.A1F(getViewLifecycleOwner(), dlE.A03, new MP7(this, 28), 24);
        AnonymousClass7TE.A1Z(new C66170MGh(view2, dlE, this, (AnonymousClass4D7) null, 23), DbV.A0J(this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public E2Y() {
        MMS mms = new MMS(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMS(new MMS(this, 3), 4));
        this.A03 = DbS.A0I(new MMS(A002, 5), mms, new MMW(37, (Object) null, A002), DbS.A0z(C46786DlE.class));
        this.A04 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        int A022 = AnonymousClass0fD.A02(-43103896);
        E2Y.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 == null || (string = bundle2.getString("ARGUMENT_PRODUCT_TYPE")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(908033960, A022);
            throw A0y;
        }
        this.A00 = C272504kq.A00(string);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean(C273654mx.A00(206));
        } else {
            z = false;
        }
        this.A01 = z;
        AnonymousClass0eM r3 = this.A03;
        C46786DlE dlE = (C46786DlE) r3.getValue();
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str = bundle4.getString(C273654mx.A00(205));
        }
        dlE.A01 = str;
        ((C46786DlE) r3.getValue()).A02 = this.A01;
        AnonymousClass0fD.A09(479855933, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2141131933);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_tool_eligibility_status, viewGroup, false);
        C3021461u r5 = (C3021461u) inflate.requireViewById(R.id.bottom_button_layout);
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType == null) {
            0qQ.A0F("productType");
            throw AnonymousClass00P.createAndThrow();
        }
        if (userMonetizationProductType == UserMonetizationProductType.BRANDED_CONTENT) {
            String str = ((C46786DlE) this.A03.getValue()).A01;
            if (0qQ.A0K(str, "not_eligible")) {
                JVF.A01(this, AnonymousClass7TE.A0l(this.A04), AnonymousClass05K.A00);
            } else if (0qQ.A0K(str, "eligible_pending_opt_in")) {
                r5.setVisibility(0);
                r5.setPrimaryAction(getString(2131954152), new FPF(59, (Object) this, (Object) this));
            }
        }
        AnonymousClass0fD.A09(1015726900, A022);
        return inflate;
    }
}
