package com.instagram.lockscreen;

import X.09i;
import X.0oI;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass7TF;
import X.C342017nu;
import X.C71396Ojv;
import X.DbT;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgActivity;

public final class LockScreenCameraCaptureActivity extends IgActivity {
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1017198086);
        super.onCreate(bundle);
        if (!AnonymousClass7TF.A1Z(C342017nu.A00(this, 09i.A0A.A08(this)).A05)) {
            0oI.A08(DbT.A05(this), AnonymousClass000.A00(2881), false);
            finish();
            i = 2023547353;
        } else {
            if (getIntent().getBooleanExtra("isSecure", false)) {
                setShowWhenLocked(true);
            }
            getTheme().applyStyle(R.style.IgdsSemanticColors, true);
            setContentView(R.layout.activity_lock_screen_camera_capture);
            AnonymousClass0fU.A00(new C71396Ojv(this, 2), findViewById(R.id.show_unlock_required_content));
            i = -1961313102;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
