package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class E5Z extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "PolaroidStickerAttributionBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final String A01 = "polaroid_sticker_attribution_sheet_fragment";

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.title);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        ImageView A0J = DbX.A0J(view, R.id.icon);
        View A0G = AnonymousClass7TF.A0G(view, R.id.action_button);
        Context context = getContext();
        if (context != null) {
            A0R.setText(0bC.A01(context.getResources(), new String[0], 2131969530));
            A0R2.setText(0bC.A01(context.getResources(), new String[0], 2131969529));
            A0J.setImageDrawable(new C59996Jd5(context, (AnonymousClass4DH) null, AnonymousClass7TE.A0l(this.A00)));
            C50109FOz.A00(A0G, 32, this);
        }
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A09;
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1668770700);
        E5Z.super.onCreate(bundle);
        AnonymousClass0fD.A09(1660513601, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1655358904);
        0qQ.A0B(layoutInflater, 0);
        E5Z.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.polaroid_sticker_attribution_sheet_fragment, false);
        AnonymousClass0fD.A09(-663748048, A02);
        return A0D;
    }
}
