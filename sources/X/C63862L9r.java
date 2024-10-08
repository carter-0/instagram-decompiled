package X;

import android.content.res.Resources;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.L9r  reason: case insensitive filesystem */
public final class C63862L9r {
    public boolean A00;
    public final Resources A01;
    public final UserSession A02;
    public final IGTVUploadViewModel A03;
    public final LFB A04;
    public final boolean A05;

    public C63862L9r(Resources resources, UserSession userSession, IGTVUploadViewModel iGTVUploadViewModel, LFB lfb) {
        C51972G9s.A1D(iGTVUploadViewModel, userSession);
        this.A04 = lfb;
        this.A01 = resources;
        this.A03 = iGTVUploadViewModel;
        this.A02 = userSession;
        boolean A0K = 0qQ.A0K(lfb.A02.A02, IGTVAccountLevelMonetizationToggleSetting.TOGGLED_ON.A00);
        this.A05 = A0K;
        this.A00 = A0K;
    }
}
