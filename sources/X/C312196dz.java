package X;

import android.widget.TextView;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6dz  reason: invalid class name and case insensitive filesystem */
public interface C312196dz extends AnonymousClass0iw, 0lm {
    public static final String __redex_internal_original_name = "IgCameraEffectManagerInterface";

    void A8U(C312136ds r1);

    C348407yO AMo(C371458yK r1, AudioGraphClientProvider audioGraphClientProvider, AnonymousClass82S r3, AnonymousClass82U r4, C367648rL r5, C312596el r6, CameraControlServiceDelegate cameraControlServiceDelegate, AnonymousClass6e9 r8, AnonymousClass82N r9, AnonymousClass82P r10, C371608yg r11, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, AnonymousClass82G r13, CameraAREffect cameraAREffect, UserSession userSession, Integer num, Integer num2, String str, String str2, boolean z);

    C348407yO ANF(String str);

    C312206e0 B0C();

    boolean CKk(CameraAREffect cameraAREffect);

    boolean CRl(CameraAREffect cameraAREffect);

    AnonymousClass6i7 Cg9(AnonymousClass8yN r1, C352728Ep r2, CameraAREffect cameraAREffect, C371218xo r4);

    void CjU(String str);

    void CkZ(C371458yK r1, C352728Ep r2, CameraAREffect cameraAREffect);

    void E3c(String str, List list);

    void ENN(TextView textView);

    void EXK(GalleryPickerServiceDataSource galleryPickerServiceDataSource);

    void EyC(String str);

    String getModuleName();
}
