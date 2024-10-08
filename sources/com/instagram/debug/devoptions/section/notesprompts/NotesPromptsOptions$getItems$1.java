package com.instagram.debug.devoptions.section.notesprompts;

import X.0xY;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class NotesPromptsOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public NotesPromptsOptions$getItems$1(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(614428222);
        0xY A0N = AnonymousClass7TF.A0N(this.$userSession);
        A0N.ED3("suggested_prompts_in_notes_last_updated_timestamp");
        A0N.ED3("suggested_prompts_in_notes");
        A0N.apply();
        AnonymousClass0fD.A0C(368462058, A05);
    }
}
