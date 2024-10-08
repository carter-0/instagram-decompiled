package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

/* renamed from: X.7IO  reason: invalid class name */
public final class AnonymousClass7IO {
    public final AnonymousClass7IR A00;
    public final AnonymousClass7IQ A01;
    public final C62320sa A02;

    public AnonymousClass7IO(AnonymousClass0iw r2, UserSession userSession, C62320sa r4) {
        0qQ.A0B(r2, 2);
        this.A02 = r4;
        this.A01 = AnonymousClass7IP.A00(r2, userSession);
        this.A00 = new AnonymousClass7IR(r2, userSession);
    }

    public final void A00(AnonymousClass7JU r7) {
        String str;
        if (r7 != null) {
            C62320sa r2 = this.A02;
            2Eq r0 = (2Eq) r2.invoke();
            if (r0 != null) {
                List BRV = r0.BRV();
                AnonymousClass7IR r1 = this.A00;
                String str2 = r7.A00;
                2Eq r02 = (2Eq) r2.invoke();
                if (r02 == null || (str = r02.C6C()) == null) {
                    str = "";
                }
                0qQ.A0B(str2, 1);
                0wc r22 = r1.A00;
                0Aj A002 = r22.A00(r22.A00, "direct_composer_tap_poll");
                if (A002.isSampled()) {
                    A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                    A002.AAe("recipient_ids", BRV);
                    A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                    A002.Cgf();
                }
            }
        }
    }
}
