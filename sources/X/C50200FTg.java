package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.io.File;

/* renamed from: X.FTg  reason: case insensitive filesystem */
public final class C50200FTg implements C74381Ptw {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final ClipsCelebrationReshareViewModel A03;
    public final 1Xj A04;

    public final void CId() {
    }

    public final void CJB() {
        Fragment fragment = this.A01;
        float A09 = (float) 0nA.A09(fragment.requireContext());
        float A08 = (float) 0nA.A08(fragment.requireContext());
        RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
        UserSession userSession = this.A02;
        C2367835b r3 = new C2367835b(userSession);
        rectF.offsetTo(0.0f, A08);
        if (182.A06(0Tu.A05, userSession, 36316714446688873L)) {
            C49731F3w A07 = 1as.A04.A02.A07(r3, userSession, 2FW.A1D);
            String id = this.A04.getId();
            if (id != null) {
                A07.A06(id);
                A07.A07.putParcelable("DirectShareSheetConstants.clips_celebration_reshare_view_model", this.A03);
                DirectShareSheetFragment A002 = A07.A00();
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A00);
                if (A012 != null) {
                    A012.A0J(A002);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        RectF rectF2 = rectF;
        FFV.A00(this.A00, rectF, rectF2, 28D.A2o, userSession, (ReelsVisualRepliesModel) null, this.A03, this.A04, (File) null, C273654mx.A00(248), (String) null, 0, false);
    }

    public C50200FTg(Activity activity, Fragment fragment, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r5) {
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = activity;
        this.A04 = r5;
        this.A03 = clipsCelebrationReshareViewModel;
    }
}
