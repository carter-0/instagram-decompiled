package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.Iterator;

/* renamed from: X.Tyk  reason: case insensitive filesystem */
public final class C14580Tyk {
    public Integer A00;
    public int A01;

    public final void A01(View view, C240373Kq r6, C46471DfZ dfZ) {
        Window window;
        Window window2;
        Object obj;
        0qQ.A0B(view, 1);
        if (r6.A01 != null) {
            C14548TyD tyD = C18425VrU.A01.A00;
            Iterator A1G = AnonymousClass7TE.A1G(tyD.A00);
            while (true) {
                if (!A1G.hasNext()) {
                    tyD.A7c(new C19314WTw(view));
                    break;
                }
                Object next = A1G.next();
                0qQ.A07(next);
                AnonymousClass2eo r1 = (AnonymousClass2eo) next;
                if (!(r1 instanceof C19314WTw) || ((obj = ((C19314WTw) r1).A00.get()) != null && obj.equals(view))) {
                    break;
                }
            }
        }
        FragmentActivity activity = r6.getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            this.A01 = window2.getAttributes().softInputMode;
        }
        if (dfZ.A0E == C46626Di6.FULL_SCREEN) {
            Activity rootActivity = r6.getRootActivity();
            AnonymousClass2uJ.A04(rootActivity, rootActivity.getColor(R.color.fds_transparent));
            return;
        }
        Integer num = dfZ.A0G;
        if (num != null) {
            int intValue = num.intValue();
            Dialog dialog = r6.A01;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
    }

    public final void A02(C240373Kq r5) {
        Window window;
        View view = r5.mView;
        if (view != null) {
            Iterator A1G = AnonymousClass7TE.A1G(C18425VrU.A01.A00.A00);
            while (A1G.hasNext()) {
                AnonymousClass2eo r1 = (AnonymousClass2eo) AnonymousClass7TF.A0a(A1G);
                if (!(r1 instanceof C19314WTw)) {
                    break;
                }
                Object obj = ((C19314WTw) r1).A00.get();
                if (obj == null || obj == view) {
                    A1G.remove();
                }
            }
        }
        FragmentActivity activity = r5.getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(this.A01);
        }
        Integer num = this.A00;
        if (num != null) {
            AnonymousClass2uJ.A04(r5.getRootActivity(), num.intValue());
        }
    }

    public static final void A00(C240373Kq r2) {
        0hq parentFragmentManager = r2.getParentFragmentManager();
        if (parentFragmentManager.A0M() <= 0 || parentFragmentManager.A0G) {
            DbX.A1I(r2);
        } else {
            parentFragmentManager.A0c();
        }
    }
}
