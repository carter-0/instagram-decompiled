package com.instagram.debug.devoptions.section.creationgenai;

import X.0s0;
import X.0xY;
import X.1Av;
import X.AnonymousClass0YZ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C362088hK;
import X.DbS;
import android.view.View;

public final class CreationGenAIOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ 1Av $userPreferences;

    public CreationGenAIOptions$getItems$1(1Av r1) {
        this.$userPreferences = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1212863331);
        1Av r2 = this.$userPreferences;
        0s0 r1 = r2.A3t;
        AnonymousClass0YZ[] r6 = 1Av.A8a;
        r1.Epx(r2, false, r6[460]);
        1Av r22 = this.$userPreferences;
        DbS.A1a(r22, false, r22.A3u, r6, 461);
        1Av r23 = this.$userPreferences;
        DbS.A1a(r23, false, r23.A1g, r6, 462);
        1Av r24 = this.$userPreferences;
        DbS.A1a(r24, false, r24.A1i, r6, 464);
        1Av r25 = this.$userPreferences;
        DbS.A1a(r25, false, r25.A3r, r6, 467);
        1Av r26 = this.$userPreferences;
        DbS.A1a(r26, false, r26.A3s, r6, 468);
        1Av r27 = this.$userPreferences;
        DbS.A1a(r27, false, r27.A3v, r6, 469);
        1Av r28 = this.$userPreferences;
        DbS.A1a(r28, false, r28.A2D, r6, 470);
        1Av r29 = this.$userPreferences;
        DbS.A1a(r29, false, r29.A2C, r6, 471);
        1Av r7 = this.$userPreferences;
        for (C362088hK A00 : C362088hK.values()) {
            AnonymousClass7TG.A1M(r7.A01, 1Av.A00(A00), 0);
        }
        0xY A0p = AnonymousClass7TE.A0p(this.$userPreferences);
        A0p.E5Z("magic_mod_feedback_nux_seen_count", 0);
        A0p.E5c("magic_mod_feedback_nux_last_seen_time", 0);
        A0p.apply();
        0xY A0p2 = AnonymousClass7TE.A0p(this.$userPreferences);
        A0p2.E5Z("magic_mod_edit_prompt_nux_seen_count", 0);
        A0p2.E5c("magic_mod_edit_prompt_nux_last_seen_time", 0);
        A0p2.apply();
        0xY A0p3 = AnonymousClass7TE.A0p(this.$userPreferences);
        A0p3.E5Z("magic_mod_sticker_info_text_seen_count", 0);
        A0p3.apply();
        0xY A0p4 = AnonymousClass7TE.A0p(this.$userPreferences);
        A0p4.E5c("magic_mod_consent_last_updated_in_ms", -1);
        A0p4.apply();
        AnonymousClass0fD.A0C(-869095115, A05);
    }
}
