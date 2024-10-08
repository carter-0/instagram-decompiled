package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;

/* renamed from: X.8H0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8H0 implements AnonymousClass2gO {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ AnonymousClass8H0(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C340547lR r0;
        0eP r6 = (0eP) obj;
        C340297l2 r4 = this.A00.A06;
        if (r4 != null) {
            boolean booleanValue = ((Boolean) r6.A01).booleanValue();
            C341957no r2 = new C341957no();
            if (!booleanValue) {
                r4.A0N(r2, false);
            } else if (C340297l2.A06(r4) && (r0 = ((BasicCameraOutputController) C340297l2.A02(r4)).A04) != null) {
                r0.A0N.Cgd(r2, true, true, false);
            }
        }
    }
}
