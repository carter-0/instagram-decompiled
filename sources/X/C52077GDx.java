package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.GDx  reason: case insensitive filesystem */
public final class C52077GDx {
    public final C51990GAn A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final C231002qi A03;
    public final C51979GAc A04;

    public final void A00() {
        1Xj r0;
        EnumSet<E> noneOf = EnumSet.noneOf(Trigger.class);
        ClipsViewerConfig clipsViewerConfig = this.A01;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        if (!(clipsViewerSource == ClipsViewerSource.SELF_PROFILE || clipsViewerSource == ClipsViewerSource.FEED_CONTEXTUAL_SELF_PROFILE || clipsViewerSource == ClipsViewerSource.FEED_CONTEXTUAL_SELF_FAN_CLUB)) {
            noneOf.add(Trigger.A0J);
            if (this.A00.A00(this.A04.getModuleName()) && !clipsViewerConfig.A1t) {
                noneOf.add(Trigger.A16);
            }
        }
        String str = clipsViewerConfig.A1H;
        UserSession userSession = this.A02;
        C267324bN A002 = GDY.A00(clipsViewerConfig, userSession, str);
        if (!(A002 == null || (r0 = A002.A02) == null || !0qQ.A0K(DbT.A0j(userSession), r0.A2A(userSession)))) {
            noneOf.add(Trigger.A1o);
        }
        if (!noneOf.isEmpty()) {
            this.A03.AVg(noneOf);
        }
    }

    public C52077GDx(C51990GAn gAn, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C231002qi r4, C51979GAc gAc) {
        this.A02 = userSession;
        this.A01 = clipsViewerConfig;
        this.A04 = gAc;
        this.A00 = gAn;
        this.A03 = r4;
    }
}
