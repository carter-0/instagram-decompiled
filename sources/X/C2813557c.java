package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.57c  reason: invalid class name and case insensitive filesystem */
public abstract class C2813557c {
    public static C293045jw A00;

    public static final void A01(Fragment fragment, 2dZ r7, C252063oV r8, List list) {
        C293045jw r0 = A00;
        if (r0 != null) {
            C293025ju r4 = r0.A00;
            UserSession userSession = r4.A06;
            if (182.A06(0Tu.A06, userSession, 36319218412559383L)) {
                if (!182.A06(0Tu.A05, userSession, 36324694495867127L)) {
                    r8.getView().setVisibility(8);
                }
                if (!(fragment instanceof AnonymousClass4DO) || ((AnonymousClass4DO) fragment).getCanShowVoiceMessageBar()) {
                    C67442Mnx mnx = r4.A01;
                    if (mnx != null) {
                        r4.A07.add(mnx);
                    }
                    r4.A01 = new C67442Mnx(r7, r8, list);
                    r4.A03 = new WeakReference(fragment);
                    if (C293025ju.A01(r4)) {
                        0wc r2 = ((AnonymousClass7GP) r4.A08.getValue()).A00;
                        0Aj A002 = r2.A00(r2.A00, "audio_clips_playback_pop_out");
                        if (A002.isSampled()) {
                            A002.Cgf();
                        }
                        C67442Mnx mnx2 = r4.A01;
                        if (mnx2 != null) {
                            mnx2.A02(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r4.A02(true);
            }
        }
    }

    public static final void A00(Fragment fragment) {
        C331037Pg r0;
        C293045jw r02 = A00;
        if (r02 != null) {
            C293025ju r2 = r02.A00;
            WeakReference weakReference = r2.A03;
            if ((weakReference.get() == fragment || weakReference.get() == null) && (r0 = r2.A00) != null) {
                r0.A0C(false);
            }
        }
    }
}
