package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UYd  reason: case insensitive filesystem */
public final class C15263UYd extends C240383Kr {
    public QAL A00;
    public IgTextView A01;
    public IgView A02;
    public IgImageView A03;
    public String A04 = "";
    public boolean A05;
    public C15998Umf A06;
    public boolean A07;

    public final void A0M(Bundle bundle, Fragment fragment) {
        getParentFragmentManager().A0z("request_key", DbY.A0B("submitted", true));
        int A022 = JTQ.A02(this.A01);
        IgImageView igImageView = this.A03;
        if (igImageView != null) {
            igImageView.setVisibility(A022);
        }
        IgView igView = this.A02;
        if (igView != null) {
            igView.setVisibility(A022);
        }
        this.A05 = true;
        fragment.setArguments(bundle);
        0s1 A0C = DbW.A0C(this);
        A0C.A0D(fragment, "lead_ads_multi_step_form_bottom_sheet_dialog", R.id.bottom_sheet_container_view);
        A0C.A00();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        0qQ.A0B(dialogInterface, 0);
        C15263UYd.super.onDismiss(dialogInterface);
        getParentFragmentManager().A0z("request_key", DbY.A0B("is_bottom_sheet_open", false));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        IgTextView A0X = JTO.A0X(view, R.id.title_text_view);
        this.A01 = A0X;
        if (A0X != null) {
            A0X.setText(this.A04);
        }
        IgImageView A0Y = JTO.A0Y(view, R.id.bottom_sheet_start_nav_button_icon);
        this.A03 = A0Y;
        if (A0Y != null) {
            WB9.A00(A0Y, 45, this);
        }
        this.A02 = (IgView) view.findViewById(R.id.bottom_sheet_nav_bar_divider);
        if (this.A07) {
            int A022 = JTQ.A02(this.A01);
            IgImageView igImageView = this.A03;
            if (igImageView != null) {
                igImageView.setVisibility(A022);
            }
            IgView igView = this.A02;
            if (igView != null) {
                igView.setVisibility(A022);
            }
            this.A05 = true;
        }
    }

    public static final void A01(C15263UYd uYd) {
        if (uYd.A05) {
            QAL qal = uYd.A00;
            if (qal == null) {
                0qQ.A0F("dialog");
                throw AnonymousClass00P.createAndThrow();
            } else {
                qal.dismiss();
            }
        } else {
            C15998Umf umf = uYd.A06;
            if (umf != null) {
                umf.onBackPressed();
            }
        }
    }

    public final Dialog A0F(Bundle bundle) {
        QAL qal = new QAL(requireContext(), R.style.FormExtensionBottomSheetDialog);
        this.A00 = qal;
        qal.setOnShowListener(new C18844W5n(this, 4));
        QAL qal2 = this.A00;
        if (qal2 != null) {
            return qal2;
        }
        0qQ.A0F("dialog");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(82418656);
        C15263UYd.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 != null) {
            bundle2.putBoolean("is_form_extension", true);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || !bundle3.getBoolean("submitted", false)) {
            z = false;
        }
        this.A07 = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || (str = bundle4.getString("cta_label")) == null) {
            str = "";
        }
        this.A04 = str;
        if (this.A07) {
            A0M(this.mArguments, new C16010Umr());
        } else {
            C15998Umf umf = new C15998Umf();
            umf.A03 = this;
            umf.setArguments(this.mArguments);
            0s1 A0C = DbW.A0C(this);
            A0C.A0D(umf, "lead_ads_multi_step_form_bottom_sheet_dialog", R.id.bottom_sheet_container_view);
            A0C.A00();
            this.A06 = umf;
        }
        AnonymousClass0fD.A09(78732296, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-827053627);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_ads_fragment_multi_step_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(290387812, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1189019475);
        C15263UYd.super.onDestroy();
        this.A06 = null;
        AnonymousClass0fD.A09(-1038198465, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1383737110);
        C15263UYd.super.onDestroyView();
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(477369401, A022);
    }
}
