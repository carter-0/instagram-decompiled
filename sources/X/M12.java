package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.fragment.EditMediaInfoFragment;

public final class M12 implements AnonymousClass8Cg {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public M12(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void DHg(boolean z) {
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        if (z) {
            mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.SELF_DISCLOSURE_FLOW;
        } else {
            mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0B;
        }
        editMediaInfoFragment.A06 = mediaGenAIDetectionMethod;
        C252063oV r3 = editMediaInfoFragment.mAddGenAILabelStubber;
        int i = 8;
        boolean z2 = false;
        if (r3 != null) {
            r3.setVisibility(DbW.A00(z ? 1 : 0));
            if (!z) {
                EditMediaInfoFragment.A02(editMediaInfoFragment.mAddGenAILabelStubber.getView(), editMediaInfoFragment);
            }
        }
        C252063oV r0 = editMediaInfoFragment.mReplaceGenAILabelStubber;
        if (r0 != null) {
            if (z) {
                i = 0;
            }
            r0.setVisibility(i);
            if (z) {
                EditMediaInfoFragment.A02(editMediaInfoFragment.mReplaceGenAILabelStubber.getView(), editMediaInfoFragment);
            }
        }
        1Xj r02 = editMediaInfoFragment.A0I;
        if (!(r02 == null || r02.A1I() == editMediaInfoFragment.A06)) {
            z2 = true;
        }
        editMediaInfoFragment.A0p = z2;
        EditMediaInfoFragment.A07(editMediaInfoFragment);
    }
}
