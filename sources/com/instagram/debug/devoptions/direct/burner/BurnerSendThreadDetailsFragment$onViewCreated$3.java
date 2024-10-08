package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C254763t0;
import X.C358248ab;
import X.C358278ae;
import X.DbT;
import X.Dba;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

public final class BurnerSendThreadDetailsFragment$onViewCreated$3 implements View.OnClickListener {
    public final /* synthetic */ BurnerSendThreadDetailsFragment this$0;

    public BurnerSendThreadDetailsFragment$onViewCreated$3(BurnerSendThreadDetailsFragment burnerSendThreadDetailsFragment) {
        this.this$0 = burnerSendThreadDetailsFragment;
    }

    public final void onClick(View view) {
        C358248ab A0I;
        int i;
        C358278ae r1;
        DialogInterface.OnClickListener onClickListener;
        int A05 = AnonymousClass0fD.A05(-1853991161);
        view.setEnabled(false);
        BurnerSendThreadDetailsFragment burnerSendThreadDetailsFragment = this.this$0;
        C254763t0 r5 = burnerSendThreadDetailsFragment.directThreadId;
        if (r5 == null) {
            A0I = Dba.A0I(burnerSendThreadDetailsFragment);
            A0I.A05 = "Failed to bulk send";
            A0I.A0q("Thread id is null");
            i = 2131968772;
            r1 = C358278ae.BLUE;
            onClickListener = BurnerSendThreadDetailsFragment$onViewCreated$3$builder$1.INSTANCE;
        } else {
            BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
            UserSession A0l = AnonymousClass7TE.A0l(burnerSendThreadDetailsFragment.session$delegate);
            BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
            if (burnerSendSettingsConfig == null) {
                0qQ.A0F("sendSettingsConfig");
                throw AnonymousClass00P.createAndThrow();
            }
            companion.sendMessageToThread(A0l, r5, burnerSendSettingsConfig.buckId, burnerSendSettingsConfig.messageType, burnerSendSettingsConfig.messageCount);
            A0I = Dba.A0I(this.this$0);
            A0I.A05 = "Bulk send started";
            A0I.A0q("Message sent triggered");
            i = 2131968772;
            r1 = C358278ae.BLUE;
            onClickListener = BurnerSendThreadDetailsFragment$onViewCreated$3$builder$2.INSTANCE;
        }
        A0I.A0R(onClickListener, r1, i);
        DbT.A1V(A0I);
        view.setEnabled(true);
        AnonymousClass0fD.A0C(1690085344, A05);
    }
}
