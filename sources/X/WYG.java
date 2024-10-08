package X;

import android.view.View;
import com.instagram.aistudio.editor.AiSettingsRepository;

public final class WYG implements MVB {
    public final int A00;
    public final Object A01;
    public final String A02;

    public WYG(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                ((AiSettingsRepository) this.A01).A09(this.A02);
                return;
            case 1:
                C15328Uac.A0C((C15328Uac) this.A01, this.A02, "ads_manager", "promotion_list", "promote_row_button");
                return;
            default:
                C54176H1w h1w = (C54176H1w) this.A01;
                String str = ((C53039GhV) h1w.A0D.getValue()).A03;
                if (str != null) {
                    C54176H1w.A05(h1w, str, this.A02, false);
                    return;
                }
                return;
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
