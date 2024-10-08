package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C51903G6x;
import X.C51966G9m;
import X.C71277OhI;
import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.List;

public final class BurnerSendSettingsFragment$onViewCreated$2$shareFragment$1 implements C51903G6x {
    public final /* synthetic */ View $button;
    public final /* synthetic */ List $items;
    public final /* synthetic */ C71277OhI $targetUserIdEditText;
    public final /* synthetic */ BurnerSendSettingsFragment this$0;

    public void onRecipientsChanged() {
    }

    public void onShareTap(List list) {
    }

    public BurnerSendSettingsFragment$onViewCreated$2$shareFragment$1(BurnerSendSettingsFragment burnerSendSettingsFragment, C71277OhI ohI, View view, List list) {
        this.this$0 = burnerSendSettingsFragment;
        this.$targetUserIdEditText = ohI;
        this.$button = view;
        this.$items = list;
    }

    public void onShareOneTap(DirectShareTarget directShareTarget) {
        if (directShareTarget != null && !directShareTarget.A0M()) {
            Iterator it = directShareTarget.A0B().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (!C51966G9m.A1W(AnonymousClass7TE.A0l(this.this$0.session$delegate), A18)) {
                    BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
                    if (burnerSendSettingsConfig == null) {
                        0qQ.A0F("sendSettingsConfig");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    burnerSendSettingsConfig.targetUserId = A18;
                    C71277OhI ohI = this.$targetUserIdEditText;
                    0qQ.A0B(A18, 0);
                    ohI.A00 = A18;
                    this.$button.setEnabled(true);
                    this.this$0.setItems(this.$items);
                    return;
                }
            }
            this.$button.setEnabled(true);
        }
    }
}
