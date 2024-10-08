package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8Ly  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C354418Ly implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8LU A00;

    public /* synthetic */ C354418Ly(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8LU r2 = this.A00;
        if (obj instanceof C61465K8u) {
            AnonymousClass81C r1 = r2.A0Z.A00;
            if (((C3503584i) r1.A00()).AXb() != null) {
                ((C3503584i) r1.A00()).EHz();
            }
        } else if (obj instanceof C385089iN) {
            AnonymousClass81C r12 = r2.A0Z.A00;
            if (((C3503584i) r12.A00()).AXb() != null) {
                ((C3503584i) r12.A00()).EUm((CameraAREffect) r2.A0a.A06.getValue());
            }
        }
    }
}
