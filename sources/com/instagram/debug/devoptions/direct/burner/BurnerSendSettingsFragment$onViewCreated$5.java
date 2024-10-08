package com.instagram.debug.devoptions.direct.burner;

import X.002;
import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C358248ab;
import X.C358278ae;
import X.C60340gF;
import X.DbT;
import X.Dba;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

public final class BurnerSendSettingsFragment$onViewCreated$5 implements View.OnClickListener {
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    public BurnerSendSettingsFragment$onViewCreated$5(BurnerSendSettingsFragment burnerSendSettingsFragment) {
        this.this$0 = burnerSendSettingsFragment;
    }

    public final void onClick(final View view) {
        int A05 = AnonymousClass0fD.A05(-1319122745);
        view.setEnabled(false);
        BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
        Context requireContext = this.this$0.requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.this$0.session$delegate);
        final BurnerSendSettingsFragment burnerSendSettingsFragment = this.this$0;
        BurnerSendSettingsConfig burnerSendSettingsConfig = burnerSendSettingsFragment.sendSettingsConfig;
        if (burnerSendSettingsConfig == null) {
            0qQ.A0F("sendSettingsConfig");
            throw AnonymousClass00P.createAndThrow();
        }
        companion.createCutoverThreadAndSendMessage(requireContext, A0l, burnerSendSettingsConfig, new 0sP() {
            public final void invoke(BurnerSendSettingsHelper.BurnerResponse burnerResponse) {
                int i;
                C358278ae r1;
                DialogInterface.OnClickListener onClickListener;
                0qQ.A0B(burnerResponse, 0);
                BurnerSendSettingsHelper.BurnerResponse burnerResponse2 = BurnerSendSettingsHelper.BurnerResponse.NO_ERROR;
                C358248ab A0I = Dba.A0I(BurnerSendSettingsFragment.this);
                if (burnerResponse != burnerResponse2) {
                    A0I.A05 = "Failed to bulk send";
                    A0I.A0q(burnerResponse.getErrorMsg());
                    i = 2131968772;
                    r1 = C358278ae.BLUE;
                    onClickListener = BurnerSendSettingsFragment$onViewCreated$5$1$builder$1.INSTANCE;
                } else {
                    A0I.A05 = "Bulk Send Successful";
                    BurnerSendSettingsConfig burnerSendSettingsConfig = BurnerSendSettingsFragment.this.sendSettingsConfig;
                    if (burnerSendSettingsConfig == null) {
                        0qQ.A0F("sendSettingsConfig");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    A0I.A0q(002.A0c("Sent ", " messages", burnerSendSettingsConfig.messageCount));
                    i = 2131968772;
                    r1 = C358278ae.BLUE;
                    onClickListener = BurnerSendSettingsFragment$onViewCreated$5$1$builder$2.INSTANCE;
                }
                A0I.A0R(onClickListener, r1, i);
                DbT.A1V(A0I);
                view.setEnabled(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BurnerSendSettingsHelper.BurnerResponse) obj);
                return C60340gF.A00;
            }
        });
        AnonymousClass0fD.A0C(-1290069833, A05);
    }
}
