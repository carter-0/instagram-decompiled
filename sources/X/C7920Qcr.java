package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;
import com.instagram.android.R;

/* renamed from: X.Qcr  reason: case insensitive filesystem */
public final class C7920Qcr extends QCA {
    public C10856RzH A00;

    public final void onViewCreated(View view, Bundle bundle) {
        ResolvedConsentTextsProvider resolvedConsentTextsProvider;
        0qQ.A0B(view, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (resolvedConsentTextsProvider = (ResolvedConsentTextsProvider) bundle2.getParcelable("texts_provider")) == null) {
            throw Pxe.A0g();
        }
        requireContext();
        C10856RzH rzH = resolvedConsentTextsProvider.A00;
        0qQ.A0B(rzH, 0);
        this.A00 = rzH;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ImageView A01 = SKW.A01(view, R.id.icon_lock);
            ImageView A012 = SKW.A01(view, R.id.icon_portrait);
            ImageView A013 = SKW.A01(view, R.id.iv_back_button);
            A01.setColorFilter(C11408SSf.A01(activity, R.attr.sc_primary_icon));
            A012.setColorFilter(C11408SSf.A01(activity, R.attr.sc_primary_icon));
            A013.setColorFilter(C11408SSf.A01(activity, R.attr.sc_primary_icon));
            if (this.A00 != null) {
                A01.setImageDrawable((Drawable) null);
                0qQ.A0A(this.A00);
                A012.setImageDrawable((Drawable) null);
                0qQ.A0A(this.A00);
                DbU.A13(activity, A013, R.drawable.instagram_arrow_left_pano_outline_24);
            }
            C11497SbK.A01(A013, 41, this);
        }
        C10856RzH rzH2 = this.A00;
        if (rzH2 != null) {
            SKW.A02(view, R.id.data_information_title).setText(rzH2.A0G);
            C10856RzH rzH3 = this.A00;
            if (rzH3 != null) {
                SKW.A02(view, R.id.data_information_body).setText(rzH3.A0A);
                C10856RzH rzH4 = this.A00;
                if (rzH4 != null) {
                    SKW.A02(view, R.id.data_information_first_section_title).setText(rzH4.A0D);
                    C10856RzH rzH5 = this.A00;
                    if (rzH5 != null) {
                        SKW.A02(view, R.id.data_information_first_section_body1).setText(rzH5.A0B);
                        C10856RzH rzH6 = this.A00;
                        if (rzH6 != null) {
                            SKW.A02(view, R.id.data_information_first_section_body2).setText(rzH6.A0C);
                            C10856RzH rzH7 = this.A00;
                            if (rzH7 != null) {
                                SKW.A02(view, R.id.data_information_second_section_title).setText(rzH7.A0F);
                                C10856RzH rzH8 = this.A00;
                                if (rzH8 != null) {
                                    SKW.A02(view, R.id.data_information_second_section_body).setText(rzH8.A0E);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("consentTexts");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(159431393);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.data_information_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1857540839, A02);
        return inflate;
    }
}
