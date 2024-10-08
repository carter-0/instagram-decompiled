package X;

import android.view.View;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Kth  reason: case insensitive filesystem */
public abstract class C63236Kth {
    public static final void A00(View view, C327907Cr r5, C330047Lf r6) {
        0qQ.A0B(view, 0);
        switch (r5.A02.ordinal()) {
            case 0:
                r6.DrD("info_button");
                return;
            case 1:
            case 3:
                r6.Dmg(false);
                return;
            case 2:
            case 4:
                r6.DmO(false);
                return;
            case 5:
                r6.D4M(view);
                return;
            case 6:
                r6.Dmg(true);
                return;
            case 7:
                r6.DmO(true);
                return;
            case 8:
                r6.DWq();
                return;
            case 9:
                r6.Dqs();
                return;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                r6.DmI();
                return;
            case 14:
                r6.Cup();
                return;
            case 15:
                r6.Cuv();
                return;
            case 16:
                r6.Cuq();
                return;
            case 17:
                r6.DTQ(true);
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                r6.DTQ(false);
                return;
            case 19:
                r6.Djt();
                return;
            case 20:
                r6.Dju();
                return;
            case 21:
                r6.CuD();
                return;
            case 22:
            case 23:
                r6.CyL();
                return;
            case 24:
                throw AnonymousClass7TE.A0z("Does not use this click handler");
            case 25:
                throw AnonymousClass7TE.A0z("Does not use this click handler");
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
