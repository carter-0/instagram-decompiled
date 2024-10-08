package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.UUID;

/* renamed from: X.9Pt  reason: invalid class name and case insensitive filesystem */
public final class C378429Pt implements C3495480u {
    public final int A00;
    public final Object A01;

    public C378429Pt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        switch (this.A00) {
            case 0:
                C279284yO r9 = (C279284yO) obj;
                0qQ.A0B(r9, 0);
                C378689Qv r2 = (C378689Qv) this.A01;
                if (!0qQ.A0K(r2.A00, r9)) {
                    boolean equals = r9.equals(C3494080g.A00);
                    AnonymousClass0eM r4 = r2.A05;
                    C56076HsP hsP = (C56076HsP) r4.getValue();
                    if (equals) {
                        String obj2 = UUID.randomUUID().toString();
                        0qQ.A07(obj2);
                        hsP.A02(obj2);
                        ((C56076HsP) r4.getValue()).A01("enter_browser");
                        r2.A04.A03.getValue();
                        AnonymousClass4DH r1 = r2.A01;
                        if (r1.isVisible()) {
                            0s1 r6 = new 0s1(r1.getChildFragmentManager());
                            293 r42 = 293.A02;
                            Bundle bundle = new Bundle();
                            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r42);
                            bundle.putBoolean("apply_top_bottom_margin", false);
                            H12 h12 = new H12();
                            h12.setArguments(bundle);
                            r6.A0A(h12, R.id.clips_template_browser_fragment_holder);
                            r6.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
                            r6.A0I("clips_template_browser_fragment");
                            r6.A00();
                        }
                        r2.A03.A00().A0M(false);
                    } else {
                        hsP.A01("swipe_exit_template_browser");
                        ((C56076HsP) r4.getValue()).A00();
                        AnonymousClass4DH r12 = r2.A01;
                        if (r12.isVisible() && !r12.getChildFragmentManager().A12()) {
                            r12.getChildFragmentManager().A0y("clips_template_browser_fragment", 1);
                        }
                    }
                }
                r2.A00 = r9;
                return;
            case 1:
                CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
                0qQ.A0B(cameraConfiguration, 0);
                AnonymousClass8DD.A03(cameraConfiguration, (AnonymousClass8DD) this.A01);
                return;
            default:
                C279284yO r92 = (C279284yO) obj;
                0qQ.A0B(r92, 0);
                C40377AbA.A02(r92, (C40377AbA) this.A01);
                return;
        }
    }
}
