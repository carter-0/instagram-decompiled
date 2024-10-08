package X;

import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.Ld5  reason: case insensitive filesystem */
public final class C64504Ld5 implements MRY {
    public final /* synthetic */ InlineAddHighlightFragment A00;

    public C64504Ld5(InlineAddHighlightFragment inlineAddHighlightFragment) {
        this.A00 = inlineAddHighlightFragment;
    }

    public final int BWy() {
        InlineAddHighlightFragment inlineAddHighlightFragment = this.A00;
        Reel A0M = 1OP.A05(inlineAddHighlightFragment.A00).A0M(inlineAddHighlightFragment.A02);
        if (A0M != null) {
            return C51967G9n.A04(A0M.A0e, 0);
        }
        0wb.A03("InlineAddHighlightFragment", "No reel found for getNumMediaSelected");
        return 0;
    }
}
