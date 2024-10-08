package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.LwY  reason: case insensitive filesystem */
public final class C65598LwY implements MU7 {
    public final /* synthetic */ C61427K7c A00;

    public final void DWJ(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        0qQ.A0B(gradientSpinnerAvatarView, 1);
        C61427K7c k7c = this.A00;
        List A002 = ((C60425JlI) k7c.A07.getValue()).A00();
        AnonymousClass32A r2 = (AnonymousClass32A) k7c.A0G.getValue();
        r2.A05 = (AnonymousClass6UX) k7c.A08.getValue();
        r2.A0C = DbS.A0t(k7c.A0K);
        r2.A03 = (ReelViewerConfig) AnonymousClass7TE.A14(k7c.A0F);
        Reel reel2 = reel;
        r2.A09(reel2, AnonymousClass3BQ.CONTEXT_SHEET_PROMPT, gradientSpinnerAvatarView, (List) null, A002, A002);
        LN4 ln4 = (LN4) k7c.A0C.getValue();
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            String id = r0.getId();
            0qQ.A07(id);
            LN4.A00(ln4, AnonymousClass000.A00(3752), id);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C65598LwY(C61427K7c k7c) {
        this.A00 = k7c;
    }

    public final void DDf(String str) {
        C61427K7c.A02(this.A00, str);
    }
}
