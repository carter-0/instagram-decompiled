package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

/* renamed from: X.EhZ  reason: case insensitive filesystem */
public abstract class C48626EhZ {
    public static final Object A00(C307896Rx r7) {
        FragmentActivity A04 = C308206Td.A04(r7);
        0lg A0R = DbW.A0R(r7);
        if (182.A06(AnonymousClass7TF.A0H(A0R), A0R, 2342161703640832389L)) {
            Dbc.A0R(Eq6.A00(C21251XQw.MESSAGE_CONTROLS, (String) null), A04, A0R);
            return null;
        }
        DirectMessagesOptionsFragment directMessagesOptionsFragment = new DirectMessagesOptionsFragment();
        Bundle A08 = DbY.A08(directMessagesOptionsFragment);
        A08.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        A08.putSerializable(C66579MXk.A00(382), C69453Nlx.PRIVACY_SETTINGS);
        directMessagesOptionsFragment.setArguments(A08);
        DbZ.A18(directMessagesOptionsFragment, A04, A0R);
        return null;
    }
}
