package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.AdZ  reason: case insensitive filesystem */
public final class C40526AdZ implements C41822B2d {
    public final long A00;
    public final Context A01;
    public final C353738Iw A02;

    public final boolean EKL(Bitmap bitmap, Medium medium, C358058aI r12) {
        ArrayList A012;
        Context context = this.A01;
        0qg.A01();
        if (0qg.A00(context, false) >= 314572800) {
            if (!medium.CeS() && medium.A0C * 1000 >= this.A00) {
                C353738Iw r5 = this.A02;
                if (bitmap != null) {
                    r5.A00 = new C370298wA(bitmap);
                    String str = r5.A02;
                    if (str != null) {
                        C348037xm r7 = r5.A03;
                        if (r7 == null) {
                            r7 = C347997xi.A00(str);
                            r5.A03 = r7;
                        }
                        C370308wB r1 = r5.A00;
                        if ((r1 instanceof C370298wA) && r7 != null) {
                            AGy aGy = AGy.A00;
                            0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap");
                            Bitmap bitmap2 = ((C370298wA) r1).A00;
                            0qQ.A0B(bitmap2, 0);
                            if (!(bitmap2.getWidth() == 224 || bitmap2.getHeight() == 224)) {
                                bitmap2 = AnonymousClass7TG.A0K(bitmap2);
                            }
                            IValue forward = r7.A00.forward(IValue.from(AGy.A00(bitmap2)));
                            if (forward.isTensorList()) {
                                C353698Is r3 = r5.A04;
                                r3.A01 = true;
                                Tensor[] tensorList = forward.toTensorList();
                                AGz aGz = AGz.A00;
                                List list = r5.A05;
                                0qQ.A0A(tensorList);
                                A012 = aGz.A01(r3, list, tensorList, true);
                            } else {
                                IValue[] tuple = forward.toTuple();
                                List list2 = r5.A05;
                                0qQ.A0A(tuple);
                                A012 = aGy.A01(r5.A04, list2, tuple);
                            }
                            AEP.A01(r12, A012);
                        }
                    } else {
                        C370288w9 r13 = r5.A01;
                        if (r13 != null) {
                            r13.DYh(AnonymousClass7TE.A1C());
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final String getName() {
        return "SceneUnderstandingScanner";
    }

    public final List ADt() {
        return 0sr.A1P(new C392049u7[]{new C389169p0(256), new C389159oz()});
    }

    public C40526AdZ(Context context, C353698Is r8, UserSession userSession) {
        this.A01 = context;
        this.A02 = new C353738Iw(r8, 0sr.A1P(new C353728Iv[]{C353728Iv.CONCEPT_SCORES, C353728Iv.AESTHETICS_SCORES, C353728Iv.OFFENSIVE_SCORES, C353728Iv.EMBEDDINGS}));
        this.A00 = System.currentTimeMillis() - (((long) C227382jA.A00(userSession)) * 86400000);
    }
}
