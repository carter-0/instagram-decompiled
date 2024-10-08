package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.8Iw  reason: invalid class name and case insensitive filesystem */
public final class C353738Iw {
    public C370308wB A00;
    public C370288w9 A01;
    public String A02;
    public C348037xm A03;
    public final C353698Is A04;
    public final List A05;

    public final void A00(Bitmap bitmap) {
        ArrayList A012;
        this.A00 = new C370298wA(bitmap);
        String str = this.A02;
        if (str != null) {
            C348037xm r5 = this.A03;
            if (r5 == null) {
                r5 = C347997xi.A00(str);
                this.A03 = r5;
            }
            C370308wB r1 = this.A00;
            if ((r1 instanceof C370298wA) && r5 != null) {
                AGy aGy = AGy.A00;
                0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap");
                Bitmap bitmap2 = ((C370298wA) r1).A00;
                0qQ.A0B(bitmap2, 0);
                if (!(bitmap2.getWidth() == 224 || bitmap2.getHeight() == 224)) {
                    bitmap2 = AnonymousClass7TG.A0K(bitmap2);
                }
                IValue forward = r5.A00.forward(IValue.from(AGy.A00(bitmap2)));
                if (forward.isTensorList()) {
                    C353698Is r3 = this.A04;
                    r3.A01 = true;
                    Tensor[] tensorList = forward.toTensorList();
                    AGz aGz = AGz.A00;
                    List list = this.A05;
                    0qQ.A0A(tensorList);
                    A012 = aGz.A01(r3, list, tensorList, false);
                } else {
                    IValue[] tuple = forward.toTuple();
                    List list2 = this.A05;
                    0qQ.A0A(tuple);
                    A012 = aGy.A01(this.A04, list2, tuple);
                }
                C370288w9 r0 = this.A01;
                if (r0 != null) {
                    r0.DYh(A012);
                    return;
                }
                return;
            }
            return;
        }
        C370288w9 r12 = this.A01;
        if (r12 != null) {
            r12.DYh(new ArrayList());
        }
    }

    public C353738Iw(C353698Is r3, List list) {
        this.A04 = r3;
        this.A05 = list;
        if (this.A02 == null) {
            r3.A04.A00(new C353748Ix(this));
        }
    }
}
