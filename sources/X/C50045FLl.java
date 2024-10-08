package X;

import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.FLl  reason: case insensitive filesystem */
public final class C50045FLl implements View.OnClickListener {
    public final /* synthetic */ FAY A00;

    public C50045FLl(FAY fay) {
        this.A00 = fay;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-433779202);
        FAY fay = this.A00;
        DeveloperOptionsLauncher.launchStoriesExperimentSwitcherTool(fay.A00, fay.A02, fay.A04);
        AnonymousClass0fD.A0C(-295256248, A05);
    }
}
