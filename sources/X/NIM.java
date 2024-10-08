package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NIM extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectDailyPromptsCreationNuxFragment";
    public O6Q A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.creation_nux_title);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.creation_nux_subtitle);
        AnonymousClass0eM r4 = this.A02;
        int i = 2131958857;
        if (AnonymousClass7K4.A02(AnonymousClass7TE.A0l(r4))) {
            i = 2131958856;
        }
        int i2 = 2131958855;
        if (AnonymousClass7K4.A02(AnonymousClass7TE.A0l(r4))) {
            i2 = 2131958854;
        }
        A0R.setText(i);
        A0R2.setText(i2);
        C71401Ok0.A01(view.requireViewById(R.id.prompt_nux_get_started_button), 15, this);
        String str = this.A01;
        if (str != null) {
            DbX.A1T(AnonymousClass7TE.A0p(DbX.A0h(r4)), "broadcast_channel_daily_prompt_nux", str, true);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(93184871);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.daily_prompts_creation_nux, false);
        AnonymousClass0fD.A09(1732861827, A022);
        return A0D;
    }
}
