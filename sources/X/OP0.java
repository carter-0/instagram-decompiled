package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public abstract class OP0 {
    public static final void A01(Context context, Intent intent, Uri uri, String str, String str2) {
        DbW.A1N(context, 0, uri);
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str).appendQueryParameter(AnonymousClass000.A00(1153), context.getPackageName()).appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        intent.setData(buildUpon.build());
    }

    public static final String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        if (queryParameter == null) {
            return uri.getQueryParameter("target_user_id");
        }
        return queryParameter;
    }
}
