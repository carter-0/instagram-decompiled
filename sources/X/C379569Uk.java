package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Uk  reason: invalid class name and case insensitive filesystem */
public final class C379569Uk extends AnonymousClass2xK {
    public final /* synthetic */ UserSession A00;

    public C379569Uk(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void DsH(AnonymousClass5Gv r8) {
        0xa A0q = AnonymousClass7TE.A0q(this.A00);
        int i = A0q.getInt("clips_prompt_tooltip_impression_count", 0);
        0xY AR4 = A0q.AR4();
        AR4.E5c("last_seen_timestamp_for_clips_prompt_tooltip", System.currentTimeMillis());
        AR4.apply();
        0xY AR42 = A0q.AR4();
        AR42.E5Z("clips_prompt_tooltip_impression_count", i + 1);
        AR42.apply();
    }
}
