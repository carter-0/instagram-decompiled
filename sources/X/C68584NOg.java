package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.NOg  reason: case insensitive filesystem */
public final class C68584NOg extends C232222tE {
    public int A00;
    public int A01;
    public final UserSession A02;
    public final 2el A03;
    public final OEK A04;
    public final C74357PtX A05;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        AnonymousClass0YZ[] r0 = C68052MzJ.A06;
        return new C68052MzJ(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlight_in_grid_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C321556uN r0;
        1Ns r02;
        User CCd;
        C19269WSc wSc = (C19269WSc) r9;
        C68052MzJ mzJ = (C68052MzJ) r10;
        AnonymousClass7TG.A1N(wSc, mzJ);
        0nA.A0f(JTO.A0F(mzJ), this.A01);
        0nA.A0V(JTO.A0F(mzJ), this.A00);
        OEK oek = this.A04;
        UserSession userSession = this.A02;
        2el r3 = this.A03;
        AnonymousClass7TG.A1Q(userSession, r3);
        mzJ.A00.setVisibility(DbW.A01(wSc.A03 ? 1 : 0));
        IgImageView igImageView = mzJ.A02;
        if (wSc.A03) {
            r0 = C321556uN.DISABLED;
        } else {
            r0 = null;
        }
        igImageView.setMediaOverlay(r0);
        boolean z = wSc.A06;
        if (z) {
            igImageView.setIcon(C321546uM.A0E);
        }
        if (wSc.A05 && 182.A06(0Tu.A05, userSession, 36327237116508400L)) {
            igImageView.setMediaOverlay(C321556uN.DELETED_STORY_WARNING);
            igImageView.setIcon(C321546uM.A0A);
        }
        ((TextView) mzJ.A04.CDM(mzJ, C68052MzJ.A06[0])).setText(wSc.A02);
        ExtendedImageUrl extendedImageUrl = wSc.A00;
        if (!(extendedImageUrl == null && ((r02 = wSc.A01.A0W) == null || (CCd = r02.CCd()) == null || (extendedImageUrl = CCd.A0E()) == null || !z))) {
            igImageView.setUrl(extendedImageUrl, oek.A00);
        }
        igImageView.setOnLongClickListener(new FPY(4, wSc, oek, mzJ));
        C71399Ojy.A00(igImageView, mzJ, oek, wSc, 30);
        View view = mzJ.itemView;
        Reel reel = wSc.A01;
        C2354830a A002 = AnonymousClass30Y.A00(reel, Integer.valueOf(mzJ.getAbsoluteAdapterPosition()), reel.getId());
        A002.A00(new C72263OzY(new OFU(userSession, oek, wSc, mzJ)));
        C51967G9n.A0z(view, A002, r3);
    }

    public final Class modelClass() {
        return C19269WSc.class;
    }

    public C68584NOg(AnonymousClass0iw r2, UserSession userSession, 2el r4, C74357PtX ptX, C230242pG r6, int i, int i2) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = ptX;
        this.A03 = r4;
        this.A04 = new OEK(r2, ptX, r6);
    }
}
