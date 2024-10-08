package X;

import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "")
public final class ONV {
    public final boolean A00;
    public final C60640iu A01;
    public final 1Q9 A02;

    public final void A00(AnonymousClass0iw r4, User user, String str, String str2) {
        0xI A04 = this.A02.A04("select_victim_page_loaded");
        A04.A0C("event_type", "page_load");
        if (str2 != null && !this.A00) {
            A04.A0C("content_id", str2);
        }
        if (str != null && !this.A00) {
            A04.A0C("frx_context", str);
        }
        A04.A0C("source_analytics_module", r4.getModuleName());
        if (user != null && !this.A00) {
            A04.A0C("responsible_user_id", user.getId());
        }
        this.A01.EFq(A04);
    }

    public final void A01(User user, String str, String str2, String str3) {
        0xI A04 = this.A02.A04("frx_prompt_button_clicked");
        A04.A0C("event_type", "click");
        if (str3 != null) {
            A04.A0C("action_type", str3);
        }
        if (str2 != null && !this.A00) {
            A04.A0C("content_id", str2);
        }
        if (str != null && !this.A00) {
            A04.A0C("frx_context", str);
        }
        if (user != null && !this.A00) {
            A04.A0C("responsible_user_id", user.getId());
        }
        this.A01.EFq(A04);
    }

    public final void A02(User user, String str, String str2, String str3) {
        0xI A04 = this.A02.A04("frx_prompt_button_impression");
        A04.A0C("event_type", "impression");
        if (str3 != null) {
            A04.A0C("action_type", str3);
        }
        if (str2 != null && !this.A00) {
            A04.A0C("content_id", str2);
        }
        if (str != null && !this.A00) {
            A04.A0C("frx_context", str);
        }
        if (user != null && !this.A00) {
            A04.A0C("responsible_user_id", user.getId());
        }
        this.A01.EFq(A04);
    }

    public ONV(C60640iu r1, 1Q9 r2, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = z;
    }
}
