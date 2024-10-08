package X;

import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.AtJ  reason: case insensitive filesystem */
public final class C41397AtJ implements AnonymousClass0eK {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C41397AtJ(IgLiteCameraProxy igLiteCameraProxy) {
        this.A01 = 2;
        this.A02 = igLiteCameraProxy;
    }

    public static A6Y A00(IgLiteCameraProxy igLiteCameraProxy) {
        return (A6Y) igLiteCameraProxy.A04.get();
    }

    public final Object get() {
        Object obj;
        switch (this.A01) {
            case 0:
                return ((C40437Ac8) this.A00).A0N.A05(C395019z4.A00((FilterGroupModel) this.A02, "OneCameraImageRenderController"), false);
            case 1:
                return new C39887ADj((AnonymousClass4DH) this.A00, ((C40575AeM) this.A02).A05);
            default:
                synchronized (this) {
                    obj = this.A00;
                    if (obj == null) {
                        IgLiteCameraProxy igLiteCameraProxy = (IgLiteCameraProxy) this.A02;
                        igLiteCameraProxy.A0M = false;
                        obj = new A6Y(new AUE(igLiteCameraProxy), Boolean.valueOf(igLiteCameraProxy.A0I), igLiteCameraProxy.A0E);
                        this.A00 = obj;
                    }
                }
                return obj;
        }
    }

    public C41397AtJ(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }
}
