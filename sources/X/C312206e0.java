package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6e0  reason: invalid class name and case insensitive filesystem */
public final class C312206e0 {
    public final C312216e1 A00;
    public final C312196dz A01;
    public final Set A02 = new HashSet();

    public final boolean A01(UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        C312216e1 r4 = this.A00;
        if (r4.A01 == null) {
            C312196dz r1 = r4.A02;
            if (!(r1 instanceof C312246e4)) {
                if (r1 instanceof C312186dy) {
                    C312186dy r12 = (C312186dy) r1;
                    if (r12.A07 == null) {
                        str = "canShowEffectPicker() mEffectManager delegate is null";
                    } else if (r12.A07 != null) {
                        r1 = r12.A07;
                    } else {
                        throw new RuntimeException("delegate is null!");
                    }
                } else {
                    str = "canShowEffectPicker() mEffectManager not instance of InternalIgEffectManager";
                }
                0kD.A07("EffectPickerRenderHelper", str, (Throwable) null);
            }
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.camera.effect.mq.InternalIgEffectManager");
            C312246e4 r13 = (C312246e4) r1;
            C366868po r3 = r4.A00;
            if (r3 == null) {
                r3 = new C366868po(r4, userSession);
                r4.A00 = r3;
            }
            Boolean bool = r13.A0I;
            if (bool != null) {
                r3.A00(bool.booleanValue());
            }
            r13.A05.ATE(new C366878pp(r3, r13));
        }
        Boolean bool2 = r4.A01;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static final boolean A00(CameraAREffect cameraAREffect, C312206e0 r4) {
        Set set = r4.A02;
        if (!set.contains(cameraAREffect)) {
            if (!r4.A01.CRl(cameraAREffect)) {
                return false;
            }
            set.add(cameraAREffect);
        }
        return true;
    }

    public C312206e0(C312196dz r2) {
        this.A01 = r2;
        this.A00 = new C312216e1(r2);
    }
}
