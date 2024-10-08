package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsActionCell;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class NIQ extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiSubscriptionItemFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "ai_subscription_item_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String string;
        String string2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.ai_subscription_time);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.ai_subscription_frequency);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (string2 = bundle2.getString("ai_subscription_time")) == null)) {
            igdsListCell.A0H(string2);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("ai_subscription_product_type");
        } else {
            str = null;
        }
        if (0qQ.A0K(str, "GENAI_REMINDER")) {
            igdsListCell2.A06(2131952853);
        }
        Bundle bundle4 = this.mArguments;
        if (!(bundle4 == null || (string = bundle4.getString("ai_subscription_frequency")) == null)) {
            igdsListCell2.A0H(string);
        }
        CharSequence text = getText(2131957531);
        0qQ.A07(text);
        ((IgdsActionCell) AnonymousClass7TF.A0F(view, R.id.ai_subscription_delete)).A00(new FPI((Object) this, 23), C69276Nic.DESTRUCTIVE, text);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass2uJ.A04(activity, AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_secondary_background));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1485131468);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_subscription_item_detail, viewGroup, false);
        AnonymousClass0fD.A09(-911302524, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1755372610);
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass2uJ.A04(activity, 0);
        }
        AnonymousClass0fD.A09(-711716383, A02);
    }
}
