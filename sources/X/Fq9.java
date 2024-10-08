package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

public final class Fq9 implements Runnable {
    public final /* synthetic */ DirectShareSheetFragment A00;

    public Fq9(DirectShareSheetFragment directShareSheetFragment) {
        this.A00 = directShareSheetFragment;
    }

    public final void run() {
        DirectShareSheetFragment directShareSheetFragment = this.A00;
        if (directShareSheetFragment.isAdded()) {
            DirectShareSheetFragment.A0F(directShareSheetFragment);
        }
    }
}
