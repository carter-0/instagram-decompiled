package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import java.io.IOException;

/* renamed from: X.AkL  reason: case insensitive filesystem */
public final class C40851AkL implements Runnable {
    public final /* synthetic */ AnonymousClass8Q2 A00;

    public C40851AkL(AnonymousClass8Q2 r1) {
        this.A00 = r1;
    }

    public final void run() {
        int i;
        int i2;
        String str;
        2Nn r8;
        AnonymousClass8Q2 r4 = this.A00;
        C355208Pb r2 = r4.A0D;
        AnonymousClass51M CEK = r2.CEK();
        Context context = r4.A07.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        try {
            int BlP = r2.BlP();
            if (CEK != null) {
                i = CEK.A08 - CEK.A09;
            } else {
                i = 0;
            }
            int i3 = BlP + i;
            if (CEK != null) {
                i2 = CEK.A0B();
            } else {
                i2 = 0;
            }
            Integer BPR = r2.BPR();
            if (BPR != null) {
                i3 = BPR.intValue();
            }
            if (i3 > i2) {
                i3 = i2;
            }
            if (CEK != null) {
                r4.A0F.A0D(i2, i3, CEK.A09, CEK.A08);
            }
            ClipsTrimFilmstrip clipsTrimFilmstrip = r4.A0F;
            int i4 = (clipsTrimFilmstrip.A01 / dimensionPixelSize) + 1;
            UserSession userSession = r4.A09;
            Fragment fragment = r4.A08;
            String str2 = null;
            if (CEK == null || (r8 = r4.A0G) == null) {
                str = null;
            } else {
                boolean z = false;
                if (r4.A02 != AnonymousClass05K.A00) {
                    z = true;
                }
                str = C348947zL.A02(CEK, r8, z).getPath();
            }
            int i5 = r4.A00;
            if (CEK != null && AnonymousClass51Q.A05(CEK)) {
                str2 = CEK.A0F.A0I;
            }
            C64137LPm.A00(context, fragment, userSession, clipsTrimFilmstrip.A07, LKM.A01(str, str2, i5), "post_capture", i4, r4.A05, r4.A06);
        } catch (IOException unused) {
        }
    }
}
