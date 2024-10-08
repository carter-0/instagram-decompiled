package X;

import android.app.Activity;
import android.view.View;
import com.instagram.reels.common.ui.StoryTypeSelectorView;

/* renamed from: X.81y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3498181y implements C2365734g {
    public final /* synthetic */ C3497781s A00;

    public /* synthetic */ C3498181y(C3497781s r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        StoryTypeSelectorView storyTypeSelectorView = (StoryTypeSelectorView) view;
        Activity activity = this.A00.A0H;
        storyTypeSelectorView.setOptionLabels(activity.getString(2131973594), activity.getString(2131973586));
        AnonymousClass0fU.A00(new AnonymousClass8FE(storyTypeSelectorView), storyTypeSelectorView);
    }
}
