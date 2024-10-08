package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Gha  reason: case insensitive filesystem */
public final class C53042Gha extends 2YL implements JS8 {
    public C331157Pu A00;
    public C55554Hja A01;
    public final C74382Ptx A02 = new C57024ILq(this);
    public final UserSession A03;
    public final AnonymousClass0eM A04;
    public final C74439Puu A05 = new C57025ILr(this);

    public C53042Gha(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = AnonymousClass0eN.A01(new C58188Ins(3, new C54440HDt(userSession), new AnonymousClass8ZA(userSession)));
    }

    public final void EKA(Activity activity, C55645Hl4 hl4, C55554Hja hja) {
        AnonymousClass0eM r1 = this.A04;
        ((HDY) r1.getValue()).A00 = hl4;
        C252733pa r4 = (C252733pa) r1.getValue();
        String str = hl4.A01;
        C74439Puu puu = this.A05;
        0qQ.A0B(puu, 2);
        AnonymousClass7TE.A1Z(new MFd(activity, puu, r4, str, (AnonymousClass4D7) null, 0), r4.A01);
        this.A01 = hja;
    }

    public final boolean EtK(Context context) {
        UserSession userSession = this.A03;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36326300813637297L)) {
            return true;
        }
        if (!182.A06(r2, userSession, 36326300813702834L)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(Pxd.A00(690), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void A00(Activity activity, C53042Gha gha, Integer num) {
        String str;
        String str2;
        N49 n49;
        String str3;
        Context applicationContext = activity.getApplicationContext();
        1xC r4 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        Resources resources = applicationContext.getResources();
        Integer num2 = AnonymousClass05K.A00;
        int i = 2131972585;
        if (num == num2) {
            i = 2131972586;
        }
        DbT.A1D(resources, A0a, i);
        A0a.A03();
        A0a.A0K = false;
        A0a.A04 = applicationContext.getDrawable(R.drawable.spotify_ig_connection_refresh_illo_spotify_toast);
        DbY.A1K(r4, A0a);
        C55554Hja hja = gha.A01;
        if (hja != null) {
            if (num == num2) {
                str = RealtimeConstants.SEND_SUCCESS;
            } else {
                str = "error";
            }
            C55645Hl4 hl4 = ((HDY) gha.A04.getValue()).A00;
            IO9 io9 = hja.A00;
            UserSession userSession = io9.A0R;
            GVT gvt = io9.A0V;
            C54689HOu hOu = C54689HOu.A0X;
            C320506sU r8 = io9.A0Q;
            String str4 = io9.A0b;
            String str5 = io9.A0a;
            long j = io9.A0M;
            String str6 = null;
            if (hl4 != null) {
                str2 = hl4.A01;
                n49 = hl4.A00;
            } else {
                str2 = null;
                n49 = null;
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gvt, userSession), "instagram_organic_audio_page_spotify_add_result_impression");
            if (A0e.isSampled()) {
                C51965G9l.A1C(hOu, A0e);
                C51973G9u.A12(A0e, "audio_page", j);
                A0e.A8M(HOL.SONG, "audio_type");
                A0e.A9F("audio_owner_id", C51972G9s.A0j(str5));
                A0e.A9F("audio_cluster_id", C51972G9s.A0j(str2));
                C51973G9u.A11(A0e, r8);
                C51965G9l.A1H(A0e, C51972G9s.A0j(str5));
                C51965G9l.A1E(A0e, C51972G9s.A0j(str4));
                if (n49 != null) {
                    str3 = n49.A01;
                } else {
                    str3 = null;
                }
                A0e.AAJ("spotify_track_id", str3);
                if (n49 != null) {
                    str6 = n49.A00;
                }
                A0e.AAJ("spotify_listen_url", str6);
                A0e.AAJ("spotify_add_result", str);
                A0e.Cgf();
            }
        }
        ((HDY) gha.A04.getValue()).A00 = null;
        gha.A01 = null;
    }
}
