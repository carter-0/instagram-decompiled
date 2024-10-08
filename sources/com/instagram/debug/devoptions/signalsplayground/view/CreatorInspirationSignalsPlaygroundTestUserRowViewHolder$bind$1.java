package com.instagram.debug.devoptions.signalsplayground.view;

import X.AnonymousClass0fD;
import X.C249703kE;
import android.view.View;
import com.instagram.user.model.User;

public final class CreatorInspirationSignalsPlaygroundTestUserRowViewHolder$bind$1 implements View.OnClickListener {
    public final /* synthetic */ User $user;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUserRowViewHolder this$0;

    public CreatorInspirationSignalsPlaygroundTestUserRowViewHolder$bind$1(CreatorInspirationSignalsPlaygroundTestUserRowViewHolder creatorInspirationSignalsPlaygroundTestUserRowViewHolder, User user) {
        this.this$0 = creatorInspirationSignalsPlaygroundTestUserRowViewHolder;
        this.$user = user;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(913714391);
        CreatorInspirationSignalsPlaygroundTestUserRowViewHolder creatorInspirationSignalsPlaygroundTestUserRowViewHolder = this.this$0;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        creatorInspirationSignalsPlaygroundTestUserRowViewHolder.delegate.onUserRowClick(this.$user);
        AnonymousClass0fD.A0C(-924346320, A05);
    }
}
