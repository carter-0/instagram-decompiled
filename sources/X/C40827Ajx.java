package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Ajx  reason: case insensitive filesystem */
public final class C40827Ajx implements Runnable {
    public final /* synthetic */ C352268Cr A00;

    public C40827Ajx(C352268Cr r1) {
        this.A00 = r1;
    }

    public final void run() {
        C352268Cr r2 = this.A00;
        AnonymousClass0eM r4 = r2.A0B;
        ((ClipsTrimFilmstrip) AnonymousClass7TE.A14(r4)).A07.setScrollXPercent(0.0f);
        ClipsTrimFilmstrip clipsTrimFilmstrip = (ClipsTrimFilmstrip) AnonymousClass7TE.A14(r4);
        ClipInfo clipInfo = r2.A03;
        if (clipInfo != null) {
            clipsTrimFilmstrip.A0D((int) clipInfo.A0A, 60000, clipInfo.A07, clipInfo.A05);
            AnonymousClass0eM r3 = r2.A0C;
            Resources resources = AnonymousClass7TH.A06(r3).getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
            int i = (((ClipsTrimFilmstrip) AnonymousClass7TE.A14(r4)).A01 / dimensionPixelSize2) + 1;
            Context A0S = AnonymousClass7TE.A0S(AnonymousClass7TH.A06(r3));
            UserSession userSession = r2.A08;
            Fragment fragment = r2.A07;
            ClipInfo clipInfo2 = r2.A03;
            if (clipInfo2 != null) {
                C64137LPm.A00(A0S, fragment, userSession, ((ClipsTrimFilmstrip) AnonymousClass7TE.A14(r4)).A07, LKM.A01(clipInfo2.A0F, (String) null, (int) clipInfo2.A0A), "post_capture", i, dimensionPixelSize2, dimensionPixelSize);
                return;
            }
        }
        0qQ.A0F("clipInfo");
        throw AnonymousClass00P.createAndThrow();
    }
}
