package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.instagram.android.R;

public final class UZJ extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceMinAgePickerBottomSheetFragmentV2";
    public NumberPicker A00;
    public final AnonymousClass0eM A01 = C20702WxZ.A00(this, 25);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = new C227862kA(new C20702WxZ(this, 26), new C20702WxZ(this, 27), new C41566AwY(25, (Object) null, this), new 0Yh(U92.class));

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131970338);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        A002.A01(new WBB(this, 17), AnonymousClass05K.A1F);
        A002.A02(true);
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
        }
        NumberPicker numberPicker2 = this.A00;
        if (numberPicker2 != null) {
            numberPicker2.setMaxValue(25);
        }
        NumberPicker numberPicker3 = this.A00;
        if (numberPicker3 != null) {
            numberPicker3.setWrapSelectorWheel(false);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1500332521);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_min_age_picker_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(-1259388710, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1391601517);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-2027353572, A022);
    }
}
