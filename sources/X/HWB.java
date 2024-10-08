package X;

import com.instagram.android.R;
import instagram.features.stories.fragment.ReelViewerFragment;

public abstract class HWB {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        String A0h = DbY.A0h(r5, 0);
        C313186g1 r0 = (C313186g1) C308206Td.A0F(r4, C313186g1.class, R.id.story_bloks_sticker_controller);
        if (r0 == null) {
            return null;
        }
        0qQ.A0B(A0h, 0);
        C273384mU r02 = r0.A00.A02;
        C255773uh Au5 = r02.Au5();
        if (Au5 == null) {
            return null;
        }
        ((ReelViewerFragment) r02).A1E.Bz3(Au5).A06(A0h);
        return null;
    }
}
