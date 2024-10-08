package X;

import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HWM {
    public static Map A00(C270584gy r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.AxM();
        A1H.put("disable_account_click", Boolean.valueOf(r3.AxM()));
        r3.AxN();
        A1H.put("disable_account_follow", Boolean.valueOf(r3.AxN()));
        r3.AxO();
        A1H.put("disable_audio_page_entry", Boolean.valueOf(r3.AxO()));
        r3.AxQ();
        A1H.put("disable_comment", Boolean.valueOf(r3.AxQ()));
        r3.AxR();
        A1H.put("disable_comment_count", Boolean.valueOf(r3.AxR()));
        r3.AxS();
        A1H.put("disable_like_button", Boolean.valueOf(r3.AxS()));
        r3.AxT();
        A1H.put("disable_like_count", Boolean.valueOf(r3.AxT()));
        r3.AxV();
        A1H.put("disable_more_options", Boolean.valueOf(r3.AxV()));
        r3.AxY();
        A1H.put("disable_share", Boolean.valueOf(r3.AxY()));
        r3.AxZ();
        A1H.put("disable_swipe_up_nux", Boolean.valueOf(r3.AxZ()));
        r3.B15();
        A1H.put("enable_comment_composer_in_viewer", Boolean.valueOf(r3.B15()));
        if (r3.BII() != null) {
            InteractionUpsellCTAType BII = r3.BII();
            0qQ.A0B(BII, 0);
            A1H.put("interaction_upsell_cta_type", BII.A00);
        }
        r3.BvR();
        A1H.put("show_follow_button_border", Boolean.valueOf(r3.BvR()));
        return 0Yt.A0B(A1H);
    }
}
