package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.List;

/* renamed from: X.Qcx  reason: case insensitive filesystem */
public final class C7926Qcx extends C7916Qcn implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IdVerificationPhotoReviewFragment";
    public View A00;
    public ImageView A01;
    public C7936QdH A02;
    public IgFrameLayout A03;
    public T6A A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public FragmentActivity A09;
    public AnonymousClass0wW A0A;

    public final String getModuleName() {
        return "id_verification";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = view;
        this.A03 = (IgFrameLayout) SKW.A00(view, R.id.action_sheet_container);
        this.A07 = AnonymousClass7TE.A1C();
        C7936QdH qdH = new C7936QdH(requireActivity());
        this.A02 = qdH;
        qdH.setTitleText(getString(2131969415));
        this.A02.setSubtitleText(getString(2131969414));
        C11495SbI.A00(view.requireViewById(R.id.id_verification_photo_review_back_button), 35, this);
        this.A01 = DbU.A0F(view, R.id.id_verification_photo_preview);
        C3021461u r2 = (C3021461u) view.requireViewById(R.id.id_verification_photo_preview_bottom_button);
        r2.setPrimaryActionOnClickListener(new C11495SbI(this, 36));
        r2.setSecondaryActionOnClickListener(new C11495SbI(this, 37));
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = bundle2.getString("photo_file_path");
        }
        this.A04.A00(RDG.A04, RDI.A03, this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-143582079);
        C7926Qcx.super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        this.A09 = requireActivity;
        IdCaptureConfig idCaptureConfig = (IdCaptureConfig) requireActivity.getIntent().getParcelableExtra("id_capture_config");
        idCaptureConfig.getClass();
        Bundle bundle2 = this.mArguments;
        Bundle A0C = Pxi.A0C(bundle2, bundle2);
        A0C.putString("IgSessionManager.SESSION_TOKEN_KEY", idCaptureConfig.A0G);
        setArguments(A0C);
        AnonymousClass0wW A0T = DbX.A0T(this);
        this.A0A = A0T;
        this.A04 = new T6A(A0T);
        Bundle bundle3 = idCaptureConfig.A03;
        if (bundle3 != null) {
            this.A05 = bundle3.getString("challenge_use_case");
            bundle3.getString("challenge_id");
            bundle3.getString("av_session_id");
            bundle3.getString("flow_id");
        }
        this.A08 = this.A09.getIntent().getBooleanExtra("is_cancel_confirmation_action_sheet_enabled", false);
        AnonymousClass0fD.A09(-434573583, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-452922599);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.id_verification_photo_review_layout);
        AnonymousClass0fD.A09(1811249252, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(769388931);
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        C7926Qcx.super.onDestroyView();
        AnonymousClass0fD.A09(-1352382149, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1810638836);
        C7926Qcx.super.onStart();
        new R9C(this).A02(new Void[0]);
        AnonymousClass0fD.A09(1856120875, A022);
    }
}
