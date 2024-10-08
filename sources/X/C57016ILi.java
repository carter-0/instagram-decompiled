package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;

/* renamed from: X.ILi  reason: case insensitive filesystem */
public final class C57016ILi implements G7V {
    public final int A00;
    public final Object A01;

    public C57016ILi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void DN2() {
        switch (this.A00) {
            case 0:
                return;
            case 4:
                ((Activity) this.A01).finish();
                return;
            case 5:
                C52016GBn gBn = ((C52029GCb) this.A01).A0d;
                gBn.A06 = false;
                gBn.A0R("resume", false);
                return;
            default:
                ((DialogInterface.OnDismissListener) this.A01).onDismiss((DialogInterface) null);
                return;
        }
    }

    public final /* synthetic */ void DN7() {
        if (5 - this.A00 == 0) {
            C52016GBn gBn = ((C52029GCb) this.A01).A0d;
            gBn.A06 = true;
            gBn.A0N((C267324bN) null, "attempt_to_launch_ig_boost", false, true);
        }
    }

    public final void Do2() {
        if (this.A00 == 0) {
            DbT.A1I((Fragment) this.A01);
        }
    }
}
