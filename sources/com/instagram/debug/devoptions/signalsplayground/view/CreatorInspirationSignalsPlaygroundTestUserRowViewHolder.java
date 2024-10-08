package com.instagram.debug.devoptions.signalsplayground.view;

import X.0qQ;
import X.AnonymousClass0fU;
import X.AnonymousClass0iw;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9IV;
import X.C249703kE;
import X.DbU;
import X.DbX;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public final class CreatorInspirationSignalsPlaygroundTestUserRowViewHolder extends C249703kE {
    public final AnonymousClass0iw analyticsModule;
    public final Delegate delegate;
    public final GradientSpinnerAvatarView imageView;
    public final IgTextView primaryName;
    public final IgTextView secondaryName;
    public final ConstraintLayout testUserRowContainer;

    public interface Delegate {
        void onUserRowClick(User user);
    }

    public final void bind(User user) {
        0qQ.A0B(user, 0);
        this.imageView.A0F((AnonymousClass9IV) null, this.analyticsModule, user.Bh3());
        this.imageView.setGradientSpinnerVisible(false);
        DbU.A1H(this.primaryName, user);
        this.secondaryName.setText(user.A0Q());
        AnonymousClass0fU.A00(new CreatorInspirationSignalsPlaygroundTestUserRowViewHolder$bind$1(this, user), this.testUserRowContainer);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUserRowViewHolder(View view, AnonymousClass0iw r3, Delegate delegate2) {
        super(view);
        AnonymousClass7TG.A1U(view, r3, delegate2);
        this.analyticsModule = r3;
        this.delegate = delegate2;
        this.testUserRowContainer = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.test_user_row_container);
        this.imageView = DbX.A0j(view, R.id.profile_image);
        this.primaryName = DbX.A0Z(view, R.id.primary_name);
        this.secondaryName = DbX.A0Z(view, R.id.secondary_name);
    }
}
