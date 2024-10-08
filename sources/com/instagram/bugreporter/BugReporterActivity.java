package com.instagram.bugreporter;

import X.08y;
import X.09i;
import X.19B;
import X.1Eo;
import X.AnonymousClass0wW;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.C49673F1f;
import X.C70853OOi;
import X.C71772f0;
import X.C74547Pwg;
import X.MH4;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.modal.ModalActivity;

public final class BugReporterActivity extends ModalActivity {
    public C74547Pwg A00 = new Object();

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, com.instagram.bugreporter.BugReporterActivity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        C49673F1f f1f = new C49673F1f(getSession(), "BugReporterActivity");
        Fragment A0P = getSupportFragmentManager().A0P(R.id.layout_container_main);
        C74547Pwg A002 = C70853OOi.A00(getIntent().getExtras(), getSession());
        this.A00 = A002;
        if (A0P == null) {
            A002.AVy("bug_reporter_activity");
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                AnonymousClass0xx A003 = C71772f0.A00(getLifecycle());
                1Eo.A05(19B.A00, new MH4(f1f, this, extras, (AnonymousClass4D7) null, 12), A003);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.bugreporter.BugReporterActivity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return r1.A04(extras);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
