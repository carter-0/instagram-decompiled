package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Nxr  reason: case insensitive filesystem */
public abstract class C70137Nxr {
    public static final void A00(Activity activity, UserSession userSession, C69309NjA njA, String str, String str2, String str3) {
        Bundle A0a = AnonymousClass7TE.A0a();
        if (str != null) {
            A0a.putString("surface", "daily_prompt");
            A0a.putString("collection_id", str2);
            A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0a.putString("message_id", str3);
            C67002Mga.A01(A0a, C300965yF.A05(C66580MXl.A0g(str)), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
            A0a.putSerializable("prompts_entry_point", njA);
            AnonymousClass6W8 A0b = DbS.A0b(activity, A0a, userSession, ModalActivity.class, "direct_card_gallery");
            A0b.A00 = 1;
            C66581MXm.A16(activity, A0b);
        }
    }
}
