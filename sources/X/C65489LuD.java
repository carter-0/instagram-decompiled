package X;

import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.HashMap;

/* renamed from: X.LuD  reason: case insensitive filesystem */
public final class C65489LuD implements C51884G5w {
    public final int A00;
    public final Object A01;

    public C65489LuD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CNw(String str) {
        SUL sul;
        String str2;
        String str3 = str;
        switch (this.A00) {
            case 0:
            case 1:
                0qQ.A0B(str, 0);
                C65197Lp1 lp1 = (C65197Lp1) this.A01;
                UserSession userSession = lp1.A03;
                27p.A01(userSession).A1X(lp1.A01);
                sul = new SUL(lp1.A02.requireActivity(), userSession, 2EG.A24, str3, false);
                str2 = "ShareReelsAdvancedSettingsFragment";
                break;
            case 5:
                0qQ.A0B(str, 0);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                sul = new SUL(clipsEditMetadataController.A0n, clipsEditMetadataController.A0s, 2EG.A24, str3, false);
                str2 = "ClipsEditMetadataController";
                break;
            case 6:
                ClipsEditMetadataController clipsEditMetadataController2 = (ClipsEditMetadataController) this.A01;
                HashMap A1E = AnonymousClass7TE.A1E();
                1Xj r1 = clipsEditMetadataController2.A0D;
                if (r1 != null) {
                    String A2n = r1.A2n();
                    if (A2n != null) {
                        A1E.put("media_igid", A2n);
                        R8F r8f = new R8F();
                        r8f.A0D(false);
                        AnonymousClass4DH r3 = clipsEditMetadataController2.A0q;
                        r8f.A0B(r3.getChildFragmentManager(), (String) null);
                        C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, clipsEditMetadataController2.A0s, "com.instagram.insights.media_refresh.revshare.monetization_status_detail", A1E);
                        E86.A01(A02, r8f, clipsEditMetadataController2, 26);
                        r3.schedule(A02);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            default:
                0qQ.A0B(str, 0);
                C61941KSq kSq = (C61941KSq) this.A01;
                sul = new SUL(kSq.requireActivity(), AnonymousClass7TE.A0l(kSq.A0Y), 2EG.A24, str3, false);
                str2 = "video_edit_metadata_fragment";
                break;
        }
        sul.A0S = str2;
        sul.A0A();
    }
}
