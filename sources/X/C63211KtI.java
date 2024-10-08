package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.KtI  reason: case insensitive filesystem */
public abstract class C63211KtI {
    public static final K67 A00(28D r4, 28D r5, UserSession userSession, AnonymousClass3QO r7, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        K67 k67 = new K67();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelableArrayList("ClipsConstants.ARG_CLIPS_PEOPLE_TAG_LIST", AnonymousClass7TE.A1D(list));
        A0a.putString("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_ID", str);
        A0a.putStringArrayList("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_IDS", AnonymousClass7TE.A1D(list2));
        A0a.putParcelableArrayList("ClipsConstants.ARG_CLIPS_FB_USER_TAG_LIST", AnonymousClass7TE.A1D(list4));
        A0a.putSerializable("ARGS_PRESELECTED_AUDIENCE", r7);
        DbU.A1D(A0a, userSession);
        A0a.putString(AnonymousClass000.A00(23), str2);
        A0a.putSerializable(AnonymousClass000.A00(210), r4);
        if (list3 != null) {
            A0a.putStringArrayList("ClipsConstants.ARG_CLIPS_CONFIRMED_COLLABORATOR_TAG_IDS", AnonymousClass7TE.A1D(list3));
        }
        if (str6 != null) {
            A0a.putString(AnonymousClass000.A00(99), str6);
        }
        if (str4 != null) {
            A0a.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY", str4);
        }
        if (str3 != null) {
            A0a.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_VIDEO_PREVIEW_URL", str3);
        }
        A0a.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_AUDIO_CLUSTER_ID_FOR_COLLAB_CHECK", str5);
        A0a.putBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_EXCLUSIVE_REELS", z);
        A0a.putBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_CONTENT_SCHEDULING_MEDIA", z2);
        A0a.putBoolean("ARG_CLIPS_SHARE_SHEET_IS_ADD_COLLABORATORS_MODE", z3);
        A0a.putBoolean("ARG_CLIPS_IS_ADD_COLLABORATORS_MODE_ENABLED_FOR_EDITIONS", z6);
        if (r5 != null) {
            A0a.putSerializable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_ENTRY_POINT ", r5);
        }
        if (bool != null) {
            A0a.putBoolean(AnonymousClass000.A00(100), bool.booleanValue());
        }
        A0a.putBoolean("ARG_CLIPS_SHARE_SHEET_IS_TRIAL_REEL", z4);
        A0a.putBoolean("ARG_CLIPS_SHARE_SHEET_HAS_CLIPS_SPINS", z5);
        k67.setArguments(A0a);
        return k67;
    }
}
