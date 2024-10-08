package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.uimanager.UIManagerHelper;
import com.instagram.android.R;

public final class SVJ implements DialogInterface.OnKeyListener {
    public final int A00;
    public final Object A01;

    public SVJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                DbY.A1S(dialogInterface, keyEvent);
                if (keyEvent.getAction() != 1) {
                    return false;
                }
                if (i == 4 || i == 111) {
                    C13438TaR taR = ((C7366Q8j) this.A01).A02;
                    if (taR != null) {
                        C12225Spe spe = (C12225Spe) taR;
                        spe.A01.APe(new W0S(UIManagerHelper.A00(spe.A00), spe.A02.getId()));
                        return true;
                    }
                    throw AnonymousClass7TE.A0z("onRequestClose callback must be set if back key is expected to close the modal");
                }
                Context context = ((View) this.A01).getContext();
                0qQ.A0C(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                Activity A002 = ((Q6H) context).A00();
                if (A002 != null) {
                    return A002.onKeyUp(i, keyEvent);
                }
                return false;
            case 1:
                if (i != 4 || keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                QC9 qc9 = (QC9) this.A01;
                C13610Tdc A0P = qc9.getChildFragmentManager().A0P(R.id.auth_container_view);
                if ((A0P instanceof C13610Tdc) && A0P.onBackPressed()) {
                    return true;
                }
                qc9.AVU((Bundle) null, (C11330SNj) null, new RuntimeException());
                return true;
            case 2:
                Activity activity = (Activity) this.A01;
                if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                    return false;
                }
                activity.finish();
                return false;
            default:
                if (i == 4) {
                    return true;
                }
                return false;
        }
    }
}
