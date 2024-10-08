package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.2sE  reason: invalid class name */
public final class AnonymousClass2sE {
    public int A00 = 4;
    public boolean A01;
    public final C61250m8 A02;
    public final Queue A03;

    public AnonymousClass2sE(Context context) {
        C61250m8 r1 = new C61250m8(context, 0);
        this.A02 = r1;
        this.A03 = new LinkedList();
        boolean z = RecyclerReelAvatarView.A05;
        0qQ.A0B(r1.A00, 0);
    }

    public final void A00() {
        if (!this.A01) {
            this.A01 = true;
            for (int i = 0; i < this.A00; i++) {
                this.A02.A00(new AnonymousClass5GK(this), R.layout.reel_item_with_background);
            }
        }
    }
}
