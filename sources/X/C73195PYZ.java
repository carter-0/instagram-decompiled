package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PYZ  reason: case insensitive filesystem */
public final class C73195PYZ implements Runnable {
    public final /* synthetic */ C332587Vp A00;
    public final /* synthetic */ 2Eq A01;

    public C73195PYZ(C332587Vp r1, 2Eq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        List list;
        C45339Cuh cuh;
        String C6C;
        C332587Vp r0 = this.A00;
        AnonymousClass2Ep r1 = this.A01;
        C332567Vn r7 = r0.A00;
        C242243Te A0b = C66580MXl.A0b(r1);
        if (A0b != null && (list = A0b.A0A) != null && (cuh = (C45339Cuh) list.get(0)) != null && (C6C = r1.C6C()) != null) {
            UserSession userSession = r7.A05;
            if (0qQ.A0K(userSession.A06, A0b.A07)) {
                AnonymousClass4DH r2 = r7.A02;
                if (r2.isResumed() && 0qQ.A0K(cuh.A02, "member_growth")) {
                    Context requireContext = r2.requireContext();
                    AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
                    int i = cuh.A00;
                    if (C273654mx.A00(583).equals(r7.A08) || !A002.A00.getBoolean(002.A0V("preference_milestone_dialog_", C6C, '_', i), false)) {
                        View A08 = DbU.A08(LayoutInflater.from(requireContext), R.layout.direct_broadcast_chat_milestone);
                        DbX.A13(requireContext, AnonymousClass7TE.A0d(A08, R.id.title), C253673rC.A04(AnonymousClass7TF.A0A(requireContext), Integer.valueOf(i), IgNetworkConsentStorage.MAX_ENTRIES, true, true), 2131958667);
                        AnonymousClass7TE.A0d(A08, R.id.subtitle).setText(2131958666);
                        ImageView A0G = DbS.A0G(A08, R.id.confetti_image_view);
                        C314126hh r22 = new C314126hh(requireContext);
                        r22.A02(A0G, AnonymousClass05K.A00);
                        C358248ab A0Y = DbS.A0Y(requireContext);
                        A0Y.A0k(A08);
                        A0Y.A06();
                        A0Y.A0s(true);
                        C71252OgJ.A00(A0Y, r22, 7);
                        C71250OgH.A00(A0Y, r22, 3);
                        DbT.A1V(A0Y);
                        0xY AR4 = A002.A00.AR4();
                        AR4.E5T(002.A0V("preference_milestone_dialog_", C6C, '_', i), true);
                        AR4.apply();
                    }
                }
            }
        }
    }
}
