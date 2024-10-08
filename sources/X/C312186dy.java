package X;

import android.widget.TextView;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6dy  reason: invalid class name and case insensitive filesystem */
public final class C312186dy implements C312196dz {
    public static final String __redex_internal_original_name = "IgCameraEffectManagerWrapper";
    public TextView A00;
    public GalleryPickerServiceDataSource A01;
    public C312136ds A02;
    public C312206e0 A03 = new C312206e0(this);
    public final Object A04 = new Object();
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();
    public volatile C312196dz A07;

    public final C348407yO AMo(C371458yK r31, AudioGraphClientProvider audioGraphClientProvider, AnonymousClass82S r33, AnonymousClass82U r34, C367648rL r35, C312596el r36, CameraControlServiceDelegate cameraControlServiceDelegate, AnonymousClass6e9 r38, AnonymousClass82N r39, AnonymousClass82P r40, C371608yg r41, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, AnonymousClass82G r43, CameraAREffect cameraAREffect, UserSession userSession, Integer num, Integer num2, String str, String str2, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass82N r7 = r39;
        0qQ.A0B(r7, 3);
        AnonymousClass82P r8 = r40;
        0qQ.A0B(r8, 5);
        Integer num3 = num;
        0qQ.A0B(num3, 7);
        Integer num4 = num2;
        0qQ.A0B(num4, 8);
        C312596el r15 = r36;
        0qQ.A0B(r15, 10);
        String str3 = str2;
        0qQ.A0B(str3, 12);
        CameraAREffect cameraAREffect2 = cameraAREffect;
        if (this.A07 != null) {
            C312196dz r9 = this.A07;
            if (r9 != null) {
                return r9.AMo(r31, audioGraphClientProvider, r33, r34, r35, r15, cameraControlServiceDelegate, r38, r7, r8, r41, audioServiceConfigurationAnnouncer, r43, cameraAREffect2, userSession2, num3, num4, str, str3, z);
            }
        } else if (cameraAREffect != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeEffect() but mDelegate is null, effect is");
            sb.append(cameraAREffect2);
            0kD.A07(__redex_internal_original_name, sb.toString(), (Throwable) null);
        }
        return null;
    }

    public final C348407yO ANF(String str) {
        0qQ.A0B(str, 0);
        C312196dz r0 = this.A07;
        if (r0 != null) {
            return r0.ANF(str);
        }
        return null;
    }

    public final void CjU(String str) {
        0qQ.A0B(str, 0);
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.CjU(str);
        }
    }

    public final void EyC(String str) {
        0qQ.A0B(str, 0);
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.EyC(str);
        }
    }

    public final void A8U(C312136ds r2) {
        this.A02 = r2;
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.A8U(r2);
        }
    }

    public final C312206e0 B0C() {
        return this.A03;
    }

    public final boolean CKk(CameraAREffect cameraAREffect) {
        C312196dz r0 = this.A07;
        if (r0 != null) {
            return r0.CKk(cameraAREffect);
        }
        return false;
    }

    public final boolean CRl(CameraAREffect cameraAREffect) {
        C312196dz r0 = this.A07;
        if (r0 != null) {
            return r0.CRl(cameraAREffect);
        }
        return false;
    }

    public final AnonymousClass6i7 Cg9(AnonymousClass8yN r2, C352728Ep r3, CameraAREffect cameraAREffect, C371218xo r5) {
        C312196dz r0 = this.A07;
        if (r0 != null) {
            return r0.Cg9(r2, r3, cameraAREffect, r5);
        }
        return null;
    }

    public final void CkZ(C371458yK r2, C352728Ep r3, CameraAREffect cameraAREffect) {
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.CkZ(r2, r3, cameraAREffect);
        }
    }

    public final void E3c(String str, List list) {
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.E3c(str, list);
        }
    }

    public final void ENN(TextView textView) {
        if (this.A07 == null) {
            synchronized (this.A04) {
                if (this.A07 == null) {
                    this.A00 = textView;
                    return;
                }
            }
        }
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.ENN(textView);
        }
    }

    public final void EXK(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        if (this.A07 == null) {
            synchronized (this.A04) {
                if (this.A07 == null) {
                    this.A01 = galleryPickerServiceDataSource;
                    return;
                }
            }
        }
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.EXK(galleryPickerServiceDataSource);
        }
    }

    public final String getModuleName() {
        if (this.A07 == null) {
            0wb.A03(__redex_internal_original_name, "getModuleName() delegate is null");
            return "unknown_ig_composer";
        }
        C312196dz r0 = this.A07;
        if (r0 != null) {
            return r0.getModuleName();
        }
        return "";
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (this.A07 == null) {
            0wb.A03(__redex_internal_original_name, "onUserSessionWillEnd() delegate is null");
            return;
        }
        C312196dz r0 = this.A07;
        if (r0 != null) {
            r0.onUserSessionWillEnd(z);
        }
    }

    public C312186dy(C312136ds r2) {
        this.A02 = r2;
    }
}
