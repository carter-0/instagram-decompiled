package X;

import android.os.Looper;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.7wK  reason: invalid class name and case insensitive filesystem */
public final class C347137wK extends 0vM {
    public final /* synthetic */ List A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C347137wK(List list) {
        super("requestHoldIcons", 62395935);
        this.A00 = list;
    }

    public final void loggedRun() {
        1NK A002 = 1NK.A00();
        0qQ.A07(A002);
        for (CameraAREffect cameraAREffect : this.A00) {
            SimpleImageUrl simpleImageUrl = new SimpleImageUrl(cameraAREffect.A07);
            Looper.myLooper();
            Looper.getMainLooper();
            simpleImageUrl.AjH();
            String A0L = A002.A0L(simpleImageUrl);
            0qQ.A07(A0L);
            A002.A0F.A00().EHT(A0L);
        }
    }
}
