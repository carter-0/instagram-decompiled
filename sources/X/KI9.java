package X;

import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class KI9 extends AnonymousClass4HF {
    public final /* synthetic */ SelectHighlightsCoverFragment A00;

    public KI9(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        this.A00 = selectHighlightsCoverFragment;
    }

    public final void DVx(int i, int i2) {
        SelectHighlightsCoverFragment selectHighlightsCoverFragment = this.A00;
        if (selectHighlightsCoverFragment.A01.getItem(i) instanceof 1Xj) {
            1Xj r2 = (1Xj) selectHighlightsCoverFragment.A01.getItem(i);
            ExtendedImageUrl A1n = r2.A1n(selectHighlightsCoverFragment.requireContext());
            A1n.getClass();
            selectHighlightsCoverFragment.A03 = new C63830L8l(JW0.A01(A1n.getWidth(), A1n.getHeight()), A1n, r2.getId(), (String) null);
            SelectHighlightsCoverFragment.A00(selectHighlightsCoverFragment);
        }
    }
}
