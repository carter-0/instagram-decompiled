package X;

import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import java.io.File;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Wmj  reason: case insensitive filesystem */
public final class C20185Wmj implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C15292UZx A01;

    public C20185Wmj(ViewGroup viewGroup, C15292UZx uZx) {
        this.A01 = uZx;
        this.A00 = viewGroup;
    }

    public final void run() {
        int i;
        AnonymousClass80Q r0;
        String str;
        C15292UZx uZx = this.A01;
        if (uZx.mView != null) {
            ViewGroup viewGroup = this.A00;
            String str2 = uZx.A06;
            String str3 = null;
            if (str2 == null) {
                str = "mediaType";
            } else {
                if (str2.equals("image")) {
                    i = 1;
                } else {
                    boolean equals = str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
                    i = 0;
                    if (equals) {
                        i = 3;
                    }
                }
                File file = uZx.A03;
                if (file == null) {
                    str = "presetMediumFile";
                } else {
                    Medium A03 = C282665Eg.A03(file, i, 0);
                    AnonymousClass80D r5 = new AnonymousClass80D();
                    C41837B2s b2s = uZx.A08;
                    b2s.getClass();
                    r5.A0l = b2s;
                    AnonymousClass0eM r1 = uZx.A09;
                    C13992Tns.A0u(uZx, r5, r1);
                    AnonymousClass80D.A08(AnonymousClass7TE.A0l(r1), AnonymousClass80H.A02, AnonymousClass9QA.A00, r5);
                    r5.A3h = true;
                    r5.A0R = uZx.volumeKeyPressController;
                    C13991Tnr.A0v(viewGroup, r5, uZx.A02);
                    28D r12 = uZx.A00;
                    if (r12 == null) {
                        str = "entryPoint";
                    } else {
                        r5.A0B = r12;
                        r5.A0O = uZx;
                        r5.A3H = true;
                        r5.A3y = true;
                        r5.A0P = A03;
                        r5.A0w = null;
                        AnonymousClass80D.A0A(r5);
                        r5.A3Q = false;
                        r5.A3H = true;
                        r5.A3G = false;
                        if (!uZx.A07 || (str3 = uZx.A05) != null) {
                            r5.A2G = str3;
                            r5.A2E = uZx.A04;
                            r5.A36 = false;
                            r5.A3D = false;
                            0qQ.A07(r5);
                            uZx.A01 = new AnonymousClass80Q(r5);
                            if (uZx.mLifecycleRegistry.A07().compareTo(07U.A04) >= 0 && (r0 = uZx.A01) != null) {
                                r0.A01();
                                return;
                            }
                            return;
                        }
                        str = "effectId";
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
