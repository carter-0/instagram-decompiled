package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.PmI  reason: case insensitive filesystem */
public final class C73938PmI extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73938PmI(float f, boolean z, boolean z2) {
        super(1);
        this.A01 = z;
        this.A02 = z2;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgLiteCameraProxy igLiteCameraProxy;
        NCn A002 = NCZ.A00(C66581MXm.A0j(obj));
        if ((A002 instanceof IgLiteCameraProxy) && (igLiteCameraProxy = (IgLiteCameraProxy) A002) != null) {
            boolean z = this.A01;
            boolean z2 = this.A02;
            float f = this.A00;
            if (z2) {
                C340547lR r1 = ((A6Y) igLiteCameraProxy.A04.get()).A00;
                if (r1 != null) {
                    r1.A0B(new C68359NBw(igLiteCameraProxy, f, z));
                }
            } else {
                IgLiteCameraProxy.A01(igLiteCameraProxy, f, z);
            }
        }
        return C60340gF.A00;
    }
}
