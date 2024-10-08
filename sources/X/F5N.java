package X;

import android.os.Bundle;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public abstract class F5N {
    public static final E2L A00(String str, String str2) {
        0qQ.A0B(str, 0);
        Bundle A0P = AnonymousClass7TG.A0P(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2, AnonymousClass7TE.A1L("value_props_flow_type", str));
        E2L e2l = new E2L();
        e2l.setArguments(A0P);
        return e2l;
    }

    public static void A01(C309516Yo r2, ValuePropsFlow valuePropsFlow) {
        r2.A0B((Bundle) null, A00(valuePropsFlow.A00, (String) null));
        r2.A04();
    }
}
