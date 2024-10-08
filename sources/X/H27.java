package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;

public final class H27 extends C273374mT implements C249763kK, C262944Gp {
    public static final String __redex_internal_original_name = "SaveToNewCollectionFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public EditText A05;
    public 1Xj A06;
    public C56561I1p A07;
    public C55736HmX A08;
    public String A09;
    public String A0A;
    public AnonymousClass4DU A0B;
    public RoundedCornerCheckMarkSelectableImageView A0C;
    public final TextWatcher A0D = new C56722I9i(this, 6);

    public final /* synthetic */ void Cv6(float f) {
    }

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }

    public final /* synthetic */ void D4N() {
    }

    public final /* synthetic */ void D4O(Integer num) {
    }

    public final /* synthetic */ void DHB(Integer num) {
    }

    public final /* synthetic */ void DYG(int i, int i2) {
    }

    public final /* synthetic */ void Dx6(C61065Jw3 jw3) {
    }

    public final String getModuleName() {
        return "save_to_collections_tray";
    }

    public final void D9d() {
        View view = this.mView;
        if (view != null) {
            0nA.A0N(view);
        }
    }

    public final String getSessionId() {
        return requireArguments().getString("SaveToNewCollectionFragment.ARGS_SESSION_ID");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1788302559);
        H27.super.onCreate(bundle);
        this.A06 = 1E7.A00(getSession()).A02(requireArguments().getString("SaveToNewCollectionFragment.ARGS_MEDIA_ID"));
        this.A00 = requireArguments().getInt("SaveToNewCollectionFragment.ARGS_CAROUSEL_INDEX");
        this.A09 = requireArguments().getString("SaveToNewCollectionFragment.ARGS_NAVIGATION_TYPE");
        this.A0B = (AnonymousClass4DU) requireArguments().getParcelable("SaveToNewCollectionFragment.ARGS_PARENT_MODULE");
        this.A02 = requireArguments().getInt("SaveToNewCollectionFragment.ARGS_POSITION");
        this.A03 = requireArguments().getInt("SaveToNewCollectionFragment.ARGS_PREV_NUM_COLLECTIONS");
        AnonymousClass4DU r3 = this.A0B;
        UserSession session = getSession();
        H27 h27 = this;
        if (requireArguments().getString("SaveToNewCollectionFragment.ARGS_SESSION_ID") == null) {
            h27 = null;
        }
        this.A07 = new C56561I1p(this, session, r3, h27);
        if (this.A06 == null) {
            DbX.A14(requireContext(), AnonymousClass37D.A00);
        }
        AnonymousClass0fD.A09(-1712000953, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-760062111);
        H27.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0C2 = DbT.A0C(layoutInflater, (ViewGroup) null, R.layout.save_to_new_collection);
        AnonymousClass0fD.A09(1801727205, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1811164030);
        super.onDestroyView();
        this.A0C = null;
        this.A05 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(861109236, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1424230457);
        H27.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-1025220650, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0C = (RoundedCornerCheckMarkSelectableImageView) view.requireViewById(R.id.collection_image);
        1Xj r1 = this.A06;
        r1.getClass();
        ExtendedImageUrl A1m = r1.A1m(R.dimen.fbpay_ui_text_button_width);
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A0C;
        if (A1m != null) {
            roundedCornerCheckMarkSelectableImageView.setUrl(A1m, this);
        } else {
            roundedCornerCheckMarkSelectableImageView.A02();
        }
        this.A04 = view.findViewById(R.id.edit_text_underline);
        this.A01 = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        EditText editText = (EditText) view.requireViewById(R.id.create_collection_edit_text);
        this.A05 = editText;
        editText.addTextChangedListener(this.A0D);
        this.A05.requestFocus();
        0nA.A0Q(this.A05);
    }
}
