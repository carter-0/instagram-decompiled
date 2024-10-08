package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.7SU  reason: invalid class name */
public final class AnonymousClass7SU {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public final void A00(AnonymousClass0iw r9, C390689rg r10, C254743sy r11) {
        0qQ.A0B(r9, 1);
        AnonymousClass9H7 r1 = this.A00;
        NIE nie = r1.A0L;
        if (nie != null) {
            nie.A07();
        }
        if (AnonymousClass1ow.A00 != null) {
            FragmentActivity requireActivity = r1.A0u.requireActivity();
            UserSession userSession = r1.A10;
            String moduleName = r9.getModuleName();
            AnonymousClass4DH r5 = new AnonymousClass4DH();
            Bundle bundle = new Bundle();
            C67002Mga.A01(bundle, r11, "thread_key");
            String A002 = AnonymousClass000.A00(246);
            bundle.putString(A002, moduleName);
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r10);
            r5.setArguments(bundle);
            String moduleName2 = r9.getModuleName();
            Bundle bundle2 = new Bundle();
            C67002Mga.A01(bundle2, r11, "thread_key");
            bundle2.putString(A002, moduleName2);
            bundle2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r10);
            C309516Yo r0 = new C309516Yo(requireActivity, userSession);
            r0.A0D(r5);
            r0.A04();
            return;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass7SU(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final void A01(C390689rg r7, C254743sy r8) {
        AnonymousClass9H7 r1 = this.A00;
        NIE nie = r1.A0L;
        if (nie != null) {
            nie.A07();
        }
        if (AnonymousClass1ow.A00 != null) {
            FragmentActivity requireActivity = r1.A0u.requireActivity();
            UserSession userSession = r1.A10;
            AnonymousClass4DH r3 = new AnonymousClass4DH();
            Bundle bundle = new Bundle();
            C67002Mga.A01(bundle, r8, "thread_key");
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r7);
            r3.setArguments(bundle);
            Bundle bundle2 = new Bundle();
            C67002Mga.A01(bundle2, r8, "thread_key");
            bundle2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r7);
            C309516Yo r0 = new C309516Yo(requireActivity, userSession);
            r0.A0D(r3);
            r0.A04();
            return;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }
}
