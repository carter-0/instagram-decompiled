package X;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.Callable;

public final class ANX implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Callable A01;

    public ANX(Activity activity, Callable callable) {
        this.A00 = activity;
        this.A01 = callable;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2139262319);
        try {
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A00);
            if (A012 != null) {
                A012.A0B();
            }
            this.A01.call();
        } catch (Exception e) {
            AnonymousClass7TG.A1I(0wj.A01, "DirectPluginImpl: openUrllessLinkInfoShortcutBottomSheet() failed to navigate to web link", e, 20134884);
        }
        AnonymousClass0fD.A0C(9234013, A05);
    }
}
