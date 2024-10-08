package com.instagram.neko.playables.activity;

import X.AnonymousClass0eM;
import X.AnonymousClass1YB;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C66217MIy;
import X.DbU;
import X.DbX;
import X.R8W;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class PlayableAdActivity extends BaseFragmentActivity {
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C66217MIy(this, 27));
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C66217MIy(this, 28));

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.neko.playables.activity.PlayableAdActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            R8W r8w = new R8W();
            r8w.setArguments(A06);
            C309516Yo A0N = DbX.A0N(this, this.A01);
            A0N.A0D(r8w);
            A0N.A0D = false;
            A0N.A0G = true;
            A0N.A04();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
