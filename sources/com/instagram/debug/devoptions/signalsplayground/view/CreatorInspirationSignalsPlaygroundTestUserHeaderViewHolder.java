package com.instagram.debug.devoptions.signalsplayground.view;

import X.0qQ;
import X.AnonymousClass7TF;
import X.C249703kE;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbY;
import X.Dba;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder extends C249703kE {
    public final IgTextView titleView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.titleView = Dba.A0E(view, R.id.test_user_list_header);
    }

    public final void bind(int i, int i2) {
        DbT.A18(DbS.A07(this), this.titleView, i);
        IgTextView igTextView = this.titleView;
        Resources A05 = DbU.A05(this.itemView);
        if (i2 != 0) {
            igTextView.setPadding(A05.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), DbY.A01(DbS.A07(this)), AnonymousClass7TF.A02(DbS.A07(this), R.dimen.account_discovery_bottom_gap), 0);
        } else {
            igTextView.setPadding(A05.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, AnonymousClass7TF.A02(DbS.A07(this), R.dimen.account_discovery_bottom_gap), 0);
        }
    }
}
