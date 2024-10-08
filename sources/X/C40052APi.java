package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.APi  reason: case insensitive filesystem */
public final class C40052APi implements AnonymousClass2gO {
    public final /* synthetic */ C359318cb A00;

    public C40052APi(C359318cb r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C353538Ia r0;
        AnonymousClass88C r7 = (AnonymousClass88C) obj;
        if (r7 != null) {
            int ordinal = r7.ordinal();
            if (ordinal == 0) {
                C359318cb r2 = this.A00;
                r2.A0O(r2.A0S.getString(2131955501));
            } else if (ordinal == 1) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                C359318cb r3 = this.A00;
                File file = r3.A0z.A01;
                if (file != null) {
                    Medium A03 = C282665Eg.A03(file, 3, 0);
                    A03.A0K = true;
                    A1C.add(A03);
                }
                ClipsCreationViewModel clipsCreationViewModel = r3.A0s;
                if (r3.A0Y.ordinal() == 357) {
                    r0 = C387899mx.A00;
                } else {
                    r0 = C387839mr.A00;
                }
                clipsCreationViewModel.A0X(r0);
                if (clipsCreationViewModel.A0s()) {
                    C359318cb.A05(r3.A0h.A02, r3, r3.A0w, A1C);
                } else {
                    r3.A0G();
                }
                UserSession userSession = r3.A0b;
                Context context = r3.A0S;
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean(AnonymousClass000.A00(973), true);
                ((FYW) userSession.A01(C389369pK.class, new MMR(userSession, 23))).A02(context, A0a);
            } else if (ordinal == 2) {
                C359318cb r02 = this.A00;
                r02.A0G();
                C59689JTv.A0B(r02.A0X, "fetch_media_failed");
            }
        }
    }
}
