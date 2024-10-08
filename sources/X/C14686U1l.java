package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.U1l  reason: case insensitive filesystem */
public final class C14686U1l extends Handler {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14686U1l(Looper looper, int i) {
        super(looper);
        this.A00 = i;
    }

    public final void handleMessage(Message message) {
        C276544tV r1;
        C277014uI A0A;
        if (this.A00 != 0) {
            0qQ.A0B(message, 0);
            super.handleMessage(message);
            if (message.what == 0) {
                Object obj = message.obj;
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.bloks.components.IgSliderBinderUtils.SliderController");
                VVF vvf = ((VMD) obj).A00;
                if (vvf != null) {
                    C276544tV r3 = vvf.A02;
                    C277014uI A0A2 = r3.A0A(40);
                    C308276Tl r12 = new C308276Tl();
                    r12.A03(vvf.A02, 0);
                    r12.A02(Integer.valueOf(vvf.A00));
                    C307886Rw.A03(vvf.A01, r3, r12.A00(), A0A2);
                    return;
                }
                return;
            }
            return;
        }
        super.handleMessage(message);
        C17728Vcx vcx = (C17728Vcx) message.obj;
        if (message.what == 0 && vcx != null && (r1 = vcx.A0D) != null && vcx.A0C != null && (A0A = r1.A0A(38)) != null) {
            C276544tV r32 = vcx.A0D;
            C308276Tl r2 = new C308276Tl();
            r2.A01(Float.valueOf(((float) vcx.A07) / 2.14748365E9f));
            r2.A02(vcx.A0C);
            C307886Rw.A03(vcx.A0C, r32, r2.A00(), A0A);
        }
    }
}
