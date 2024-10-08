package X;

import com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo;

public final class EJ9 extends ExY {
    public final DailyPromptsShareInfo A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EJ9(DailyPromptsShareInfo dailyPromptsShareInfo, String str) {
        super(2FW.A0f, str);
        0qQ.A0B(dailyPromptsShareInfo, 2);
        this.A01 = str;
        this.A00 = dailyPromptsShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ9) {
                EJ9 ej9 = (EJ9) obj;
                if (!0qQ.A0K(this.A01, ej9.A01) || !0qQ.A0K(this.A00, ej9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
