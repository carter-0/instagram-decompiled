package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.util.Collections;

public abstract class F7J {
    public static void A01(Activity activity, Fragment fragment, UserSession userSession, 1Xj r8, String str, String str2, boolean z) {
        MusicOverlayStickerModel A03 = C271404in.A03((MusicProduct) null, r8, (Integer) null);
        C50903Fki fki = new C50903Fki(activity, fragment, userSession, r8, str, str2, z);
        boolean z2 = true;
        if (A03 != null) {
            if (A03.A0t) {
                z2 = false;
            }
            boolean A1P = AnonymousClass7TF.A1P(Boolean.TRUE.equals(A03.A0E) ? 1 : 0);
            if (!z2) {
                C49007Enj.A00(activity, new C49981FHq(fki), A1P);
                return;
            }
        }
        fki.Dje(Collections.singletonList(AnonymousClass7TE.A0v()));
    }

    public static void A00(Activity activity, Fragment fragment, UserSession userSession, 1Xj r9, File file, String str, String str2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(2450), str);
        A0a.putString(AnonymousClass000.A00(2452), r9.getId());
        A0a.putString(AnonymousClass000.A00(2451), file.getAbsolutePath());
        A0a.putString(AnonymousClass000.A00(2449), str2);
        Bundle requireArguments = fragment.requireArguments();
        String string = requireArguments.getString("follower_id");
        String A00 = AnonymousClass000.A00(3144);
        String string2 = requireArguments.getString(A00);
        A0a.putString("follower_id", string);
        A0a.putString(A00, string2);
        SQH.A01(fragment.mFragmentManager);
        if (fragment.getContext() != null && !fragment.mDetached && !fragment.mRemoving) {
            AnonymousClass6W8.A02(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(3227)).A0D(fragment, 401);
        }
    }
}
