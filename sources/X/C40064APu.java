package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.APu  reason: case insensitive filesystem */
public final class C40064APu implements AnonymousClass2gO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CameraAREffect A01;
    public final /* synthetic */ C368528sn A02;
    public final /* synthetic */ C39641A3f A03;

    public C40064APu(CameraAREffect cameraAREffect, C368528sn r2, C39641A3f a3f, int i) {
        this.A03 = a3f;
        this.A01 = cameraAREffect;
        this.A02 = r2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        JSONObject A002 = C394469yA.A00((List) obj);
        this.A01.A0k = A002;
        C368528sn r2 = this.A02;
        if (this.A00 == r2.A00) {
            r2.A07.A00(A002);
        }
    }
}
