package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.fragment.AlbumEditFragment;

public final class KSO extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;

    public KSO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Ds8(AnonymousClass5Gv r2) {
        switch (this.A00) {
            case 8:
            case 9:
                r2.A08(true);
                return false;
            default:
                return super.Ds8(r2);
        }
    }

    public final void DsC(AnonymousClass5Gv r4) {
        switch (this.A00) {
            case 0:
                ((C52971GgO) this.A01).A03 = false;
                return;
            case 2:
                0qQ.A0B(r4, 0);
                C60108Jfo jfo = ((ClipsTimelineActionBarViewController) this.A01).A05.A09;
                if (jfo != null) {
                    jfo.A09 = false;
                    C60108Jfo.A01(jfo.A0F.A0E(), jfo);
                    return;
                }
                return;
            case 3:
                AlbumEditFragment albumEditFragment = (AlbumEditFragment) this.A01;
                1Au.A00(AnonymousClass7TE.A0l(albumEditFragment.A0d)).A1V(true);
                AnonymousClass7TF.A0D().post(new M3B(albumEditFragment));
                return;
            case 5:
                C59962JcV jcV = (C59962JcV) this.A01;
                1Au.A00(AnonymousClass7TE.A0l(jcV.A0i)).A1V(true);
                if (jcV.getActivity() != null && jcV.isVisible()) {
                    C273514mi r0 = jcV.A0P;
                    if (r0 == null) {
                        0qQ.A0F("provider");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    View findViewById = r0.BQ1().findViewById(R.id.feed_creation_filter_button);
                    findViewById.post(new M7G(findViewById, jcV));
                    return;
                }
                return;
            default:
                super.DsC(r4);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r3 = X.JW1.A00(r0);
        r2 = X.AnonymousClass7TE.A0e(r3.A0D, "ig_camera_nux");
        X.JTO.A1Q(r2, "FEED_POST_CAP_MUSIC_TRAY_ADD_FILTER");
        r2.AAJ("nux_step", "OPEN");
        X.JTO.A1S(r2, X.C360918fM.A00(r3.A0E).A00());
        X.AnonymousClass7TE.A1W(r2, "event_type", 2);
        X.DbW.A15(r2, r3.A0C);
        X.JTP.A1F(r2);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d1, code lost:
        r3 = X.JW1.A00(r0);
        r2 = X.AnonymousClass7TE.A0e(r3.A0D, "ig_camera_nux");
        X.JTO.A1Q(r2, "FEED_POST_CAP_MUSIC_TRAY_ADD_MUSIC");
        r2.AAJ("nux_step", "OPEN");
        X.JTO.A1S(r2, X.C360918fM.A00(r3.A0E).A00());
        X.AnonymousClass7TE.A1W(r2, "event_type", 2);
        X.DbW.A15(r2, r3.A0C);
        X.JTP.A1F(r2);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r1.E5T(X.AnonymousClass000.A00(r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r1.apply();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsH(X.AnonymousClass5Gv r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0116;
                case 2: goto L_0x0108;
                case 3: goto L_0x00c3;
                case 4: goto L_0x007e;
                case 5: goto L_0x006f;
                case 6: goto L_0x0060;
                case 7: goto L_0x0033;
                case 8: goto L_0x0021;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.H15 r0 = (X.H15) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Av r0 = X.1Au.A00(r0)
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 3227(0xc9b, float:4.522E-42)
        L_0x0016:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r2)
        L_0x001d:
            r1.apply()
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r0 = r5.A01
            X.H15 r0 = (X.H15) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Av r0 = X.1Au.A00(r0)
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 3231(0xc9f, float:4.528E-42)
            goto L_0x0016
        L_0x0033:
            java.lang.Object r0 = r5.A01
            X.3TW r0 = (X.AnonymousClass3TW) r0
            X.9J0 r0 = r0.A04
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.A00
            X.9Ib r0 = (X.C376459Ib) r0
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0020
            r0.invoke()
            return
        L_0x004b:
            java.lang.Object r0 = r5.A01
            X.GgO r0 = (X.C52971GgO) r0
            com.instagram.common.session.UserSession r0 = r0.A0E
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 2816(0xb00, float:3.946E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xY r1 = X.AnonymousClass7TG.A0g(r1, r0)
            goto L_0x001d
        L_0x0060:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.JcV r0 = (X.C59962JcV) r0
            X.0eM r0 = r0.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x008c
        L_0x006f:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.JcV r0 = (X.C59962JcV) r0
            X.0eM r0 = r0.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x00d1
        L_0x007e:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
        L_0x008c:
            X.JaN r3 = X.JW1.A00(r0)
            X.0wc r1 = r3.A0D
            java.lang.String r0 = "ig_camera_nux"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "FEED_POST_CAP_MUSIC_TRAY_ADD_FILTER"
            X.JTO.A1Q(r2, r0)
            java.lang.String r1 = "OPEN"
            java.lang.String r0 = "nux_step"
            r2.AAJ(r0, r1)
            com.instagram.common.session.UserSession r0 = r3.A0E
            X.8fN r0 = X.C360918fM.A00(r0)
            java.lang.String r0 = r0.A00()
            X.JTO.A1S(r2, r0)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.0iw r0 = r3.A0C
            X.DbW.A15(r2, r0)
            X.JTP.A1F(r2)
            r2.Cgf()
            return
        L_0x00c3:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
        L_0x00d1:
            X.JaN r3 = X.JW1.A00(r0)
            X.0wc r1 = r3.A0D
            java.lang.String r0 = "ig_camera_nux"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "FEED_POST_CAP_MUSIC_TRAY_ADD_MUSIC"
            X.JTO.A1Q(r2, r0)
            java.lang.String r1 = "OPEN"
            java.lang.String r0 = "nux_step"
            r2.AAJ(r0, r1)
            com.instagram.common.session.UserSession r0 = r3.A0E
            X.8fN r0 = X.C360918fM.A00(r0)
            java.lang.String r0 = r0.A00()
            X.JTO.A1S(r2, r0)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.0iw r0 = r3.A0C
            X.DbW.A15(r2, r0)
            X.JTP.A1F(r2)
            r2.Cgf()
            return
        L_0x0108:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A04
            r0 = 1
            r1.A07 = r0
            return
        L_0x0116:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A7P
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 278(0x116, float:3.9E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KSO.DsH(X.5Gv):void");
    }
}
