package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

/* renamed from: X.Atq  reason: case insensitive filesystem */
public final /* synthetic */ class C41430Atq implements C62320sa {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ C41430Atq(C329067Hl r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        C329067Hl r0 = this.A00;
        AnonymousClass7IR r1 = r0.A1d;
        List A0I = C329067Hl.A0I(r0);
        String A0F = C329067Hl.A0F(r0);
        C254783t2 r3 = r0.A1z;
        0qQ.A0B(r3, 2);
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00, "direct_composer_tap_sticker_search");
        if (!A0e.isSampled()) {
            return null;
        }
        A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0F);
        A0e.AAe("recipient_ids", A0I);
        A0e.AAJ("open_thread_id", AnonymousClass4KK.A02(r3));
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "search_icon");
        A0e.Cgf();
        return null;
    }
}
