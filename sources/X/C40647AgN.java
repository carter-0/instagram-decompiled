package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.AgN  reason: case insensitive filesystem */
public final class C40647AgN implements C273414mX {
    public final int A00;
    public final Object A01;

    public C40647AgN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cyc() {
        C357918a4 r3;
        switch (this.A00) {
            case 0:
                C40401AbY abY = (C40401AbY) ((AnonymousClass8XA) this.A01).A0l.getValue();
                AudioOverlayTrack audioOverlayTrack = abY.A01;
                if (audioOverlayTrack != null) {
                    C40401AbY.A00(abY, audioOverlayTrack, false);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                C40401AbY abY2 = (C40401AbY) this.A01;
                if (abY2.A03) {
                    abY2.A01();
                    return;
                }
                return;
            case 3:
                A86 a86 = (A86) this.A01;
                a86.A02 = false;
                A4I a4i = a86.A08;
                int i = a86.A00;
                r3 = a4i.A00;
                int i2 = i * IgNetworkConsentStorage.MAX_ENTRIES;
                for (XAT Dld : r3.A10.A02) {
                    Dld.Dld(i2);
                }
                TrackSnippet trackSnippet = r3.A0Q;
                if (trackSnippet != null) {
                    trackSnippet.A00 = i2;
                }
                r3.A0y.DvW(i2);
                C3506785t r0 = r3.A0b;
                if (r0 != null) {
                    r0.Edn(i2);
                }
                AJ9 aj9 = r3.A0Z;
                if (aj9 != null) {
                    AJ9.A05(aj9);
                    break;
                }
                break;
            default:
                r3 = ((AJ9) this.A01).A0J;
                break;
        }
        r3.A0H();
    }

    public final /* synthetic */ void Cyf() {
        if (1 - this.A00 == 0) {
            AnonymousClass29V r2 = 27p.A01(((C353438Hq) this.A01).A08).A0C;
            C279294yP r4 = C279294yP.STORY;
            0Aj A0e = AnonymousClass7TE.A0e(r2.A01, "ig_camera_nux");
            if (A0e.isSampled()) {
                A0e.AAJ("entity", "GLASSES_CAMERA");
                A0e.AAJ("nux_step", C66579MXk.A00(208));
                AnonymousClass283 r22 = r2.A04;
                String str = r22.A0L;
                if (str == null) {
                    str = "";
                }
                A0e.AAJ("camera_session_id", str);
                AnonymousClass7TE.A1V(A0e, r22);
                A0e.A8M(r4, "camera_destination");
                A0e.Cgf();
            }
        }
    }
}
