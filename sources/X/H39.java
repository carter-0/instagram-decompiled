package X;

import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class H39 extends C270664h6 {
    public final int A00;
    public final Object A01;

    public H39(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D3s() {
        if (3 - this.A00 != 0) {
            super.D3s();
            return;
        }
        C238143As r1 = ((H1N) this.A01).A03;
        if (r1 != null) {
            r1.EaP(false);
        }
    }

    public final void D3u(C52263GLe gLe) {
        ImmutableList immutableList;
        C267324bN r0;
        switch (this.A00) {
            case 0:
                0qQ.A0B(gLe, 0);
                if (gLe.A0D && gLe.A0I && gLe.A00 == 0 && !gLe.A0F) {
                    C52185GIb gIb = (C52185GIb) this.A01;
                    ClipsViewerConfig clipsViewerConfig = gIb.A03;
                    if (clipsViewerConfig.A1H != null || ((immutableList = clipsViewerConfig.A0E) != null && !immutableList.isEmpty())) {
                        String str = gLe.A04;
                        UserSession userSession = gIb.A05;
                        if ((!1KU.A05(userSession) && !1KU.A04(userSession)) || str != null) {
                            gIb.A01 = false;
                            0xY AR4 = gIb.A06.AR4();
                            AR4.E5T("seen_chained_media_headload_response", gIb.A01);
                            AR4.apply();
                            C3728893a r1 = gIb.A07;
                            if (r1 != null) {
                                r1.A05((Object) null, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((GD0) this.A01).A0C();
                return;
            case 2:
                0qQ.A0B(gLe, 0);
                if (gLe.A0D) {
                    C55684Hlh hlh = (C55684Hlh) this.A01;
                    if (hlh.A00 == null && (r0 = (C267324bN) 00k.A0J(gLe.A09)) != null) {
                        hlh.A00 = r0.getId();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.D3u(gLe);
                return;
        }
    }
}
