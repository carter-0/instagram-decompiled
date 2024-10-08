package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu;

/* renamed from: X.8FH  reason: invalid class name */
public final class AnonymousClass8FH implements AnonymousClass2gO {
    public C279284yO A00;
    public boolean A01;
    public final C3495480u A02 = new AnonymousClass8FJ(this);
    public final UserSession A03;
    public final CameraPreCaptureUtilityMenu A04;

    public AnonymousClass8FH(UserSession userSession, CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu) {
        0qQ.A0B(userSession, 2);
        this.A04 = cameraPreCaptureUtilityMenu;
        this.A03 = userSession;
    }

    public static final void A00(AnonymousClass8FH r4) {
        CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu;
        if (!r4.A01 || !(r4.A00 instanceof AnonymousClass80O)) {
            CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu2 = r4.A04;
            if (cameraPreCaptureUtilityMenu2 != null) {
                cameraPreCaptureUtilityMenu2.A06.setVisibility(4);
                return;
            }
            return;
        }
        UserSession userSession = r4.A03;
        if (AnonymousClass81x.A00(userSession) && (cameraPreCaptureUtilityMenu = r4.A04) != null) {
            cameraPreCaptureUtilityMenu.A06.setVisibility(0);
        }
        0Tu r2 = 0Tu.A05;
        182.A06(r2, userSession, 36317998641845983L);
        182.A06(r2, userSession, 36317998641911520L);
        182.A06(r2, userSession, 36317998641977057L);
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        this.A01 = ((Boolean) obj).booleanValue();
        A00(this);
    }
}
