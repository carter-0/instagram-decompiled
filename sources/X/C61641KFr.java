package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KFr  reason: case insensitive filesystem */
public final class C61641KFr extends C232222tE {
    public final float A00;
    public final C66427MRh A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60632Jof(DbT.A0D(layoutInflater, viewGroup, R.layout.media_grid_item_layout, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        C321546uM r0;
        C321556uN r02;
        String A16;
        C64804LiO liO = (C64804LiO) r14;
        C60632Jof jof = (C60632Jof) r15;
        AnonymousClass7TG.A1N(liO, jof);
        UserSession userSession = this.A03;
        String str = liO.A03;
        ImageUrl imageUrl = liO.A02;
        C16528UwY uwY = liO.A01;
        boolean z = liO.A05;
        AnonymousClass0iw r03 = this.A02;
        C66427MRh mRh = this.A01;
        boolean z2 = liO.A04;
        int i = liO.A00;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1S(r03, mRh);
        IgImageView igImageView = jof.A03;
        igImageView.setUrl(imageUrl, r03);
        int ordinal = uwY.ordinal();
        if (ordinal == 3) {
            r0 = C321546uM.A0N;
            igImageView.setIcon(r0);
        } else if (ordinal != 9) {
            igImageView.A0H();
        } else {
            r0 = C321546uM.A08;
            igImageView.setIcon(r0);
        }
        if (z) {
            r02 = C321556uN.SELECTED;
        } else {
            r02 = null;
        }
        igImageView.setMediaOverlay(r02);
        AnonymousClass0fU.A00(new LXV(mRh, imageUrl, str, 2), igImageView);
        if (182.A06(0Tu.A05, userSession, 36321353011307819L)) {
            jof.A01.setVisibility(0);
            IgSimpleImageView igSimpleImageView = jof.A02;
            if (z2) {
                igSimpleImageView.setVisibility(0);
            } else {
                igSimpleImageView.setVisibility(8);
            }
            TextView textView = jof.A00;
            textView.setVisibility(0);
            if (i >= 3) {
                A16 = String.valueOf(i);
            } else {
                A16 = AnonymousClass7TE.A16(DbS.A07(jof), 2131965947);
            }
            textView.setText(A16);
        }
    }

    public final Class modelClass() {
        return C64804LiO.class;
    }

    public C61641KFr(C66427MRh mRh, AnonymousClass0iw r2, UserSession userSession, float f) {
        this.A03 = userSession;
        this.A02 = r2;
        this.A01 = mRh;
        this.A00 = f;
    }
}
