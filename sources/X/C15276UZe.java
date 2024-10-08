package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* renamed from: X.UZe  reason: case insensitive filesystem */
public final class C15276UZe extends AnonymousClass4DH implements AnonymousClass4DS, X3S {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceMinAgePickerBottomSheetFragment";
    public NumberPicker A00;
    public PromoteData A01;
    public PromoteState A02;
    public UserSession A03;
    public String A04;
    public C18643Vvl A05;
    public final AnonymousClass0eM A06 = C20702WxZ.A00(this, 24);

    public final void Dab(PromoteState promoteState, Integer num) {
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131970338);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        this.A05 = A002;
        A002.A01(new WBB(this, 16), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A05;
        if (vvl == null) {
            0qQ.A0F("actionBarButtonController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            vvl.A02(true);
        }
    }

    public final String getModuleName() {
        return "promote_create_audience_min_age_picker_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        NumberPicker numberPicker = (NumberPicker) view.requireViewById(R.id.min_age_picker);
        this.A00 = numberPicker;
        if (numberPicker != null) {
            numberPicker.setMinValue(18);
            NumberPicker numberPicker2 = this.A00;
            if (numberPicker2 != null) {
                numberPicker2.setMaxValue(25);
                NumberPicker numberPicker3 = this.A00;
                if (numberPicker3 != null) {
                    numberPicker3.setWrapSelectorWheel(false);
                    return;
                }
            }
        }
        0qQ.A0F("agePicker");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1957344299);
        C15276UZe.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getString("screen");
        }
        this.A01 = XAI.A00(this);
        PromoteState A002 = XA9.A00(this);
        this.A02 = A002;
        A002.A0A(this);
        PromoteData promoteData = this.A01;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = promoteData.A0y;
        AnonymousClass0fD.A09(-1115287989, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1834188320);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_min_age_picker_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(1491994967, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1433816511);
        super.onDestroyView();
        PromoteState promoteState = this.A02;
        if (promoteState == null) {
            0qQ.A0F("promoteState");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteState.A0B(this);
        AnonymousClass0fD.A09(1320149050, A022);
    }
}
