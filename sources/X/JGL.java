package X;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public final class JGL extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A00) {
            case 0:
                ((C56606I4f) this.A03).A07(C51966G9m.A0R(obj, obj2), this.A02, A00(this));
                break;
            case 1:
                C289565do.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A02, (0sP) this.A03, A00(this));
                break;
            case 2:
                ((C56018HrQ) this.A03).A00((C56127HtF) this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 3:
                GSC.A00(C51966G9m.A0R(obj, obj2), (C286025Tq) this.A03, (List) this.A02, A00(this));
                break;
            case 4:
                HR6.A00((C52693Gb5) this.A03, C51966G9m.A0R(obj, obj2), (0sL) this.A02, A00(this));
                break;
            case 5:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                C286705Xl[] r1 = (C286705Xl[]) this.A03;
                C286715Xm.A01(A0R, (0sL) this.A02, (C286705Xl[]) Arrays.copyOf(r1, r1.length), A00(this));
                break;
            case 6:
                C286715Xm.A00(C51966G9m.A0R(obj, obj2), (C286705Xl) this.A03, (0sL) this.A02, A00(this));
                break;
            case 7:
                C56665I6u.A07(C51966G9m.A0R(obj, obj2), (0sL) this.A03, (AnonymousClass62P) this.A02, A00(this));
                break;
            case 8:
                C54776HSj.A00(C51966G9m.A0R(obj, obj2), (0sL) this.A03, (AnonymousClass62P) this.A02, A00(this));
                break;
            case 9:
                C56197HuQ.A00(C51966G9m.A0R(obj, obj2), (0sL) this.A03, (AnonymousClass62P) this.A02, A00(this));
                break;
            case 10:
                C56197HuQ.A01(C51966G9m.A0R(obj, obj2), (0sL) this.A03, (AnonymousClass62P) this.A02, A00(this));
                break;
            case 11:
                C54782HSp.A00(C51966G9m.A0R(obj, obj2), (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C56629I5i.A02(C51966G9m.A0R(obj, obj2), (C61014JvE) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 13:
                C56629I5i.A03(C51966G9m.A0R(obj, obj2), (C61014JvE) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 14:
                C56647I6c.A03(C51966G9m.A0R(obj, obj2), (C61040Jve) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 15:
                boolean A1Z = AnonymousClass7TG.A1Z(obj, obj2);
                Fragment fragment = (Fragment) this.A03;
                AnonymousClass7TE.A1Z(new C66176MGn(fragment, this.A02, obj4, obj3, (AnonymousClass4D7) null, this.A01, A1Z ? 1 : 0), DbV.A0J(fragment));
                break;
            case 16:
                AnonymousClass7TG.A1N(obj, obj2);
                ((0sJ) this.A02).invoke(Integer.valueOf(this.A01), obj, this.A03, obj2);
                break;
            case 17:
                I7C.A09(C51966G9m.A0R(obj, obj2), (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                I6K.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C54085Gz9) this.A02, A00(this));
                break;
            case 19:
                I6K.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C54084Gz8) this.A02, A00(this));
                break;
            case 20:
                I2O.A01(C51966G9m.A0R(obj, obj2), (C55704Hm1) this.A03, (C55984Hqp) this.A02, A00(this));
                break;
            case 21:
                HVT.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 22:
                HVU.A00((LazyListState) this.A03, C51966G9m.A0R(obj, obj2), (C62320sa) this.A02, A00(this));
                break;
            case 23:
            case 24:
                C56241Hv8.A01(C51966G9m.A0R(obj, obj2), (C55932Hpu) this.A03, (C63596Kzj) this.A02, A00(this));
                break;
            case 25:
                C54851HVi.A00(C51966G9m.A0R(obj, obj2), (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 26:
                C54872HWf.A00(C51966G9m.A0R(obj, obj2), (C336617eu) this.A02, (C56030Hrc) this.A03, A00(this));
                break;
            case 27:
                C54880HWn.A00(C51966G9m.A0R(obj, obj2), (C54213H3i) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 28:
                C54881HWo.A00(C51966G9m.A0R(obj, obj2), (HN2) this.A03, (C56030Hrc) this.A02, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C56615I4q.A01(C51966G9m.A0R(obj, obj2), (C52971GgO) this.A03, (C334067ac) this.A02, A00(this));
                break;
            case 30:
            case 31:
                HX0.A00((AnonymousClass62P) this.A02, (0sP) this.A03, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 32:
                GS8.A0C(C51966G9m.A0R(obj, obj2), (ImageUrl) this.A03, (ImageUrl) this.A02, A00(this));
                break;
            case 33:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                AnonymousClass5VN r5 = (AnonymousClass5VN) this.A02;
                Object obj5 = this.A03;
                int A002 = A00(this);
                A0R2.ExV(528122021);
                if ((A002 & 6) == 0) {
                    i = G9t.A0O(A0R2, r5) | A002;
                } else {
                    i = A002;
                }
                if ((A002 & 48) == 0) {
                    i |= G9t.A0F(A0R2, obj5);
                }
                if ((i & 19) != 18 || !A0R2.Bwn()) {
                    if (0fL.A02()) {
                        0fL.A01(832131761, "com.instagram.creation.capture.assetpicker.cutout.crop.CropInnerArea (CropRectangle.kt:308)");
                    }
                    A0R2.AJO(I5O.A00);
                    C285245Qk r2 = Modifier.A00;
                    A0R2.ExS(859265723);
                    boolean A1S = AnonymousClass7TF.A1S(i & 14, 4);
                    Object ECw = A0R2.ECw();
                    if (A1S || ECw == AnonymousClass5XT.A00) {
                        ECw = new C58727Iwa(r5, 28);
                        A0R2.FLL(ECw);
                    }
                    C286565Wx A0H = C51965G9l.A0H(A0R2, false);
                    Modifier A012 = C56164Htt.A01(r2, (0sP) ECw);
                    C267314bM r10 = AndroidCompositionLocals_androidKt.A01;
                    Modifier A08 = C287205Zk.A08(C287205Zk.A0D(A012, 0nA.A01((Context) A0R2.AJO(r10), r5.A02 - r5.A01)), 0nA.A01((Context) A0R2.AJO(r10), r5.A00 - r5.A03));
                    C60340gF r102 = C60340gF.A00;
                    boolean A1S2 = C51975G9x.A1S(A0R2, 859272785, i);
                    Object ECw2 = A0R2.ECw();
                    if (A1S2 || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new C66188MGz(obj5, (AnonymousClass4D7) null, 49, 42);
                        A0R2.FLL(ECw2);
                    }
                    Modifier A0W = C51969G9p.A0W(A0H, A08, ECw2, r102, false);
                    boolean A1W = C51967G9n.A1W(A0R2, 859278571, false);
                    Object ECw3 = A0R2.ECw();
                    if (A1W || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = new GL4(false, 7);
                        A0R2.FLL(ECw3);
                    }
                    if (C51967G9n.A1X(A0R2, C51975G9x.A0I(A0H, A0W, ECw3, false))) {
                        0fL.A00(455028815);
                    }
                } else {
                    A0R2.Evl();
                }
                C286625Xd ASQ = A0R2.ASQ();
                if (ASQ != null) {
                    A01(ASQ, obj5, r5, A002, 33);
                    break;
                }
                break;
            case 34:
                int A0M = AnonymousClass7TE.A0M(obj);
                C15092UOk uOk = (C15092UOk) obj3;
                0qQ.A0B(uOk, 1);
                String A11 = DbT.A11(uOk.A05, (Map) this.A02);
                if (A11 == null) {
                    A11 = uOk.A06;
                }
                if (!LQE.A01(A11)) {
                    return null;
                }
                List list = (List) this.A03;
                Long valueOf = Long.valueOf(((long) ((C15092UOk) list.get(A0M)).A01()) + ((long) this.A01));
                C15092UOk uOk2 = (C15092UOk) list.get(A0M);
                float f = uOk2.A01;
                return AnonymousClass7TF.A0y(valueOf, (long) (((int) (((float) uOk2.A02) / f)) - ((int) (((float) uOk2.A04) / f))));
            case 35:
                C56571I2b.A02(C51966G9m.A0R(obj, obj2), (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 36:
                C56268Hvc.A01(C51966G9m.A0R(obj, obj2), (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 37:
                C56270Hve.A01(C51966G9m.A0R(obj, obj2), (C54649HMg) this.A02, (0sP) this.A03, A00(this));
                break;
            case 38:
                C56667I6w.A05(C51966G9m.A0R(obj, obj2), (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 39:
                C54913HXv.A00(C51966G9m.A0R(obj, obj2), (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 40:
                I7I.A05(C51966G9m.A0R(obj, obj2), (IQK) this.A03, (0sP) this.A02, A00(this));
                break;
            case Seq.NULL_REFNUM:
                HYJ.A00(C51966G9m.A0R(obj, obj2), (C362088hK) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case Seq.RefTracker.REF_OFFSET:
                HYK.A00(C51966G9m.A0R(obj, obj2), (MagicModPostCaptureTransform) this.A03, (0sL) this.A02, A00(this));
                break;
            case 43:
                C54924HYg.A00(C51966G9m.A0R(obj, obj2), (QP7) this.A02, (0sP) this.A03, A00(this));
                break;
            case 44:
                C56620I4v.A02(C51966G9m.A0R(obj, obj2), (C53327GmD) this.A02, (0sP) this.A03, A00(this));
                break;
            case 47:
                C286575Wy r4 = (C286575Wy) obj4;
                if (C51968G9o.A0B(obj2) == 2 && r4.Bwn()) {
                    r4.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(-1600032429, "com.instagram.creator.agent.settings.freeformfeedback.FreeformFeedbackFragment.onCreateView.<anonymous>.<anonymous> (FreeformFeedbackFragment.kt:83)");
                    }
                    boolean A1W2 = AnonymousClass7TF.A1W(((C61080JwI) C51966G9m.A18(this.A02)).A00, C54617HLa.LOADING);
                    r4.ExS(112928597);
                    Object obj6 = this.A03;
                    boolean AGw = r4.AGw(obj6);
                    Object ECw4 = r4.ECw();
                    if (AGw || ECw4 == AnonymousClass5XT.A00) {
                        ECw4 = G9w.A0t(r4, obj6, 38);
                    }
                    HZJ.A00(r4, (0sP) ECw4, this.A01, C51968G9o.A1Y(r4) ? 1 : 0, A1W2);
                    if (0fL.A02()) {
                        0fL.A00(-1163401622);
                        break;
                    }
                }
                break;
            case 48:
                C56581I2l.A02(C51966G9m.A0R(obj, obj2), (AnonymousClass6HD) this.A02, (AnonymousClass62P) this.A03, A00(this));
                break;
            case 49:
                C56290Hw3.A01(C51966G9m.A0R(obj, obj2), (C62320sa) this.A02, (AnonymousClass62P) this.A03, A00(this));
                break;
            default:
                C56651I6g.A02(C51966G9m.A0R(obj, obj2), (C53375Gn5) this.A02, (0sP) this.A03, A00(this));
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGL(C62320sa r2, C62320sa r3, int i, int i2) {
        super(2);
        this.A00 = i2;
        switch (i2) {
            case 11:
            case 35:
                this.A02 = r2;
                this.A03 = r3;
                break;
            default:
                this.A03 = r2;
                this.A02 = r3;
                break;
        }
        this.A01 = i;
    }

    public static int A00(JGL jgl) {
        return C301445zH.A00(jgl.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, Object obj2, int i, int i2) {
        r1.A06 = new JGL(i, i2, obj, obj2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGL(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }
}
