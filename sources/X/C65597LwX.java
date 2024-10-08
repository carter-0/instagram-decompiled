package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.LwX  reason: case insensitive filesystem */
public final class C65597LwX implements MU7 {
    public final /* synthetic */ K7b A00;

    public final void DDf(String str) {
    }

    public final void DWJ(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        0qQ.A0B(gradientSpinnerAvatarView, 1);
        K7b k7b = this.A00;
        AnonymousClass32A r2 = (AnonymousClass32A) k7b.A0F.getValue();
        r2.A05 = (AnonymousClass6UX) k7b.A0B.getValue();
        r2.A0C = "";
        r2.A03 = (ReelViewerConfig) AnonymousClass7TE.A14(k7b.A0E);
        AnonymousClass0eM r1 = k7b.A0A;
        List list = ((C60441JlZ) r1.getValue()).A02;
        List list2 = ((C60441JlZ) r1.getValue()).A02;
        Reel reel2 = reel;
        r2.A09(reel2, AnonymousClass3BQ.MUSIC_PICK_STICKER, gradientSpinnerAvatarView, (List) null, list, list2);
    }

    public C65597LwX(K7b k7b) {
        this.A00 = k7b;
    }
}
