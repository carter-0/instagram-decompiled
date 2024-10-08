package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.AZr  reason: case insensitive filesystem */
public final class C40302AZr implements AnonymousClass8GH {
    public final int A00;
    public final Object A01;

    public C40302AZr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean D26() {
        switch (this.A00) {
            case 0:
                AnonymousClass80R r0 = ((AnonymousClass80Q) this.A01).A00;
                UserSession userSession = r0.A0R;
                C352888Fl r1 = r0.A0l;
                C59895JbK.A0H(userSession, r1.A0N());
                r1.A0Z((Runnable) null, (Runnable) null);
                return true;
            case 1:
                JYD jyd = (JYD) this.A01;
                JYD.A02(new AKK(jyd, 2), jyd);
                return true;
            case 2:
                C3504784u r2 = ((WUX) this.A01).A03;
                FragmentActivity activity = r2.A0A.getActivity();
                if (activity == null) {
                    return true;
                }
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "shopping_camera");
                A0a.putString(AnonymousClass000.A00(1703), "instagram_shopping_camera");
                A0a.putString(AnonymousClass000.A00(55), r2.A0G);
                new AnonymousClass6W8(activity, A0a, r2.A0B, ModalActivity.class, AnonymousClass000.A00(780)).A0C(activity.getApplicationContext());
                return true;
            default:
                AIY.A01((AIY) this.A01, true);
                return true;
        }
    }
}
