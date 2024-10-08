package X;

import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;

public final class EE9 extends C252233om {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ AnonymousClass4DJ A02;

    public EE9(Fragment fragment, AnonymousClass0iw r2, AnonymousClass4DJ r3) {
        this.A02 = r3;
        this.A00 = fragment;
        this.A01 = r2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ImageUrl imageUrl;
        if (i == 17 && i2 == 1797) {
            if (intent == null || (imageUrl = (ImageUrl) intent.getParcelableExtra(AnonymousClass000.A00(698))) == null) {
                throw AnonymousClass7TE.A0z("result data could not be null when payment guidance enabled");
            }
            boolean z = true;
            if (!intent.getBooleanExtra("is_ab_test", false)) {
                z = false;
            }
            new Handler().postDelayed(new C51494Fv2(this.A00, this.A01, imageUrl, z), 500);
        }
        this.A02.unregisterLifecycleListener(this);
    }

    public final void onDestroy() {
        this.A02.unregisterLifecycleListener(this);
    }
}
