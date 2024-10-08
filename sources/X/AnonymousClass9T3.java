package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.io.IOException;

/* renamed from: X.9T3  reason: invalid class name */
public abstract class AnonymousClass9T3 {
    public static final AnonymousClass3Q2 A00(AnonymousClass3Q2 r3, String str) {
        0qQ.A0B(r3, 0);
        try {
            String A00 = AnonymousClass3Q1.A00(r3);
            0qQ.A07(A00);
            AnonymousClass3Q2 parseFromJson = AnonymousClass3Q1.parseFromJson(16P.A00(A00));
            0qQ.A07(parseFromJson);
            0qQ.A0B(str, 0);
            parseFromJson.A3t = str;
            parseFromJson.A35 = str;
            CameraAREffect cameraAREffect = r3.A10;
            CameraAREffect cameraAREffect2 = parseFromJson.A10;
            if (!(cameraAREffect == null || cameraAREffect2 == null)) {
                cameraAREffect2.A0k = cameraAREffect.A0k;
            }
            r3.A2f = str;
            return parseFromJson;
        } catch (IOException e) {
            0wb.A01.Ew3("PendingMedia#copyPendingMedia", e);
            throw new IllegalStateException("Failed to copy pending media", e);
        }
    }

    public static final AnonymousClass3Q2 A01(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass3Q2 r1 = new AnonymousClass3Q2(str);
        r1.A0V(1iA.A0Q);
        return r1;
    }

    public static final AnonymousClass3Q2 A02(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass3Q2 r1 = new AnonymousClass3Q2(str);
        r1.A0V(1iA.A0a);
        return r1;
    }
}
