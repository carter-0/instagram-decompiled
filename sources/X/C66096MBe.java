package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.MBe  reason: case insensitive filesystem */
public final /* synthetic */ class C66096MBe implements C61910qF, AnonymousClass82E {
    public final /* synthetic */ C64710Lgj A00;

    public C66096MBe(C64710Lgj lgj) {
        this.A00 = lgj;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(2, this.A00, C64710Lgj.class, "onEffectSetStarted", "onEffectSetStarted(Lcom/instagram/camera/effect/models/CameraAREffect;Lcom/instagram/camera/effect/models/CameraAREffect;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final void DBe(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        String str;
        C60312JjF A002 = C64710Lgj.A00(this.A00);
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
        } else {
            str = null;
        }
        A002.A00.A06.Epw(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass82E) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
