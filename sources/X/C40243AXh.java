package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.AXh  reason: case insensitive filesystem */
public final class C40243AXh implements AnonymousClass0iw, AnonymousClass0j6 {
    public static final String __redex_internal_original_name = "BroadcastChatJoinChatPreviewViewModel$AnalyticsModuleWithChannelExtra";
    public final /* synthetic */ KQO A00;

    public C40243AXh(KQO kqo) {
        this.A00 = kqo;
    }

    public final 0jB E4x() {
        0jB r3 = new 0jB();
        KQO kqo = this.A00;
        r3.A0A(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, kqo.A02());
        r3.A09("is_broadcast_chat", 1);
        r3.A09("add_to_inbox", 1);
        r3.A09("audience_type", kqo.A01());
        r3.A0A(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, kqo.A03);
        r3.A0A("ad_id", kqo.A02);
        return r3;
    }

    public final String getModuleName() {
        return "direct_thread_toggle";
    }
}
