package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class IVP implements MVB {
    public boolean A00;
    public final /* synthetic */ GIN A01;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVP(GIN gin) {
        this.A01 = gin;
    }

    public final void onButtonClick(View view) {
        AnonymousClass9P8 r14;
        GIN gin = this.A01;
        AnonymousClass4DH r6 = gin.A04;
        if (r6.mLifecycleRegistry.A07() == 07U.A04) {
            this.A00 = true;
            AnonymousClass4DU r1 = gin.A08;
            UserSession userSession = gin.A06;
            ClipsViewerConfig clipsViewerConfig = gin.A05;
            AnonymousClass93T r4 = gin.A09;
            0qQ.A0B(r1, 0);
            AnonymousClass7TF.A1D(userSession, 1, r4);
            0Aj A0O = C51972G9s.A0O(r1, userSession);
            if (A0O.isSampled()) {
                DbW.A16(A0O, r1);
                C51970G9q.A18(A0O, 0);
                C51969G9p.A16(A0O, -1);
                C51970G9q.A1G(A0O, r4);
                C51965G9l.A19(C52236GKd.A1S, A0O);
                C51965G9l.A1C(AnonymousClass5OC.REMINDER, A0O);
                C51965G9l.A1R(A0O, r4.AmZ());
                A0O.Cgf();
            }
            try {
                28D A002 = C55275Hf4.A00(clipsViewerConfig.A0J);
                Activity activity = gin.A03;
                C60178Jgx jgx = gin.A07;
                if (jgx != null) {
                    r14 = jgx.A01;
                } else {
                    r14 = null;
                }
                AnonymousClass7TF.A1B(A002, 0, activity);
                if (r14 != null) {
                    C63175Ksi.A00(userSession, new IQF(activity, A002, r6, userSession, r14), r14.A09);
                    return;
                }
                I3M.A01(activity, (Bundle) null, r6, A002, userSession, false, true);
            } catch (Exception e) {
                AnonymousClass7TF.A19(0wj.A01.AEf("ClipsViewerSnackbarController", 817902720), DialogModule.KEY_MESSAGE, "Could not open camera from unfinished reel snackbar", e);
            }
        }
    }

    public final void onDismiss() {
        C60178Jgx jgx;
        GIN gin = this.A01;
        if (gin.A04.mLifecycleRegistry.A07() == 07U.A04 && !this.A00 && (jgx = gin.A07) != null) {
            C51971G9r.A1Q(jgx, C318116oQ.A00(jgx), 10);
        }
    }

    public final void onShow() {
        GIN gin = this.A01;
        AnonymousClass4DU r4 = gin.A08;
        UserSession userSession = gin.A06;
        AnonymousClass93T r3 = gin.A09;
        AnonymousClass7TG.A1N(r4, userSession);
        0qQ.A0B(r3, 4);
        0Aj A0u = G9t.A0u(r4, userSession);
        if (A0u.isSampled()) {
            DbW.A16(A0u, r4);
            C51970G9q.A18(A0u, 0);
            C51969G9p.A16(A0u, -1);
            C51970G9q.A1G(A0u, r3);
            C51973G9u.A14(A0u, "chaining_session_id", r3.AmZ());
            C51965G9l.A19(C52236GKd.A1S, A0u);
            C51965G9l.A1C(AnonymousClass5OC.REMINDER, A0u);
            A0u.Cgf();
        }
    }
}
