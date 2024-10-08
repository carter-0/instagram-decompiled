package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public final class GIN extends C52050GCw implements AnonymousClass32U {
    public boolean A00 = true;
    public boolean A01;
    public final Context A02;
    public final FragmentActivity A03;
    public final AnonymousClass4DH A04;
    public final ClipsViewerConfig A05;
    public final UserSession A06;
    public final C60178Jgx A07;
    public final AnonymousClass4DU A08;
    public final AnonymousClass93T A09;
    public final C55684Hlh A0A;
    public final C62320sa A0B;

    public GIN(Context context, AnonymousClass4DH r4, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C60178Jgx jgx, AnonymousClass4DU r8, AnonymousClass93T r9, C55684Hlh hlh, C62320sa r11) {
        0qQ.A0B(r9, 6);
        this.A04 = r4;
        this.A06 = userSession;
        this.A02 = context;
        this.A08 = r8;
        this.A05 = clipsViewerConfig;
        this.A09 = r9;
        this.A0A = hlh;
        this.A0B = r11;
        this.A07 = jgx;
        this.A03 = r4.requireActivity();
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final void Dpy(C267324bN r9, int i) {
        0qQ.A0B(r9, 0);
        ClipsViewerConfig clipsViewerConfig = this.A05;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        0qQ.A0B(clipsViewerSource, 0);
        GJY[] values = GJY.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            GJY gjy = values[i2];
            if (gjy.A02 != clipsViewerSource) {
                i2++;
            } else if (gjy != GJY.A08 && !this.A01 && !AnonymousClass7TF.A1Y(clipsViewerConfig.A0U, false)) {
                boolean A0K = 0qQ.A0K(clipsViewerConfig.A00, "clips_media_notes_stack");
                Context context = this.A02;
                int i3 = 2131955475;
                if (A0K) {
                    i3 = 2131955504;
                }
                String A0p = C51967G9n.A0p(context, i3);
                C310336ap A0a = DbS.A0a();
                DbS.A19(context, A0a, 2131955476);
                A0a.A02();
                A0a.A04 = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                A0a.A0D(A0p);
                A0a.A0A = new IVT(i, 1, r9, this);
                A0a.A0L = true;
                A0a.A02 = context.getResources().getDimensionPixelOffset(R.dimen.tab_bar_height_panorama);
                A0a.A0R = true;
                A0a.A0J = true;
                A0a.A06();
                DbY.A1N(A0a);
                this.A01 = true;
                return;
            } else {
                return;
            }
        }
    }

    public final void DW8(int i, int i2) {
        C267324bN A0C;
        C52012GBj gBj = this.A02;
        if (gBj != null && (A0C = gBj.A0C(i)) != null) {
            C52058GDe BzC = GD6.A01(this.A0B).BzC(A0C);
            if (A0C.A02 != null) {
                C52146GGo.A00(A0C, BzC, this.A06);
            }
        }
    }
}
