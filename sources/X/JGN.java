package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class JGN extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGN(C62320sa r2, C62320sa r3, C62320sa r4, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A04 = r2;
        switch (i2) {
            case 6:
            case 7:
                this.A03 = r3;
                this.A02 = r4;
                break;
            default:
                this.A02 = r3;
                this.A03 = r4;
                break;
        }
        this.A01 = i;
    }

    public static int A00(JGN jgn) {
        return C301445zH.A00(jgn.A01 | 1);
    }

    public static JGN A01(Object obj, Object obj2, Object obj3, int i, int i2) {
        return new JGN(i, i2, obj, obj2, obj3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        switch (this.A00) {
            case 0:
                C52694Gb6.A05((C52693Gb5) this.A03, C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (0sL) this.A02, A00(this));
                break;
            case 1:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                Object[] objArr = (Object[]) this.A03;
                I0h.A00((I0h) this.A04, A0R, (0sP) this.A02, Arrays.copyOf(objArr, objArr.length), A00(this));
                break;
            case 2:
                C56607I4g.A01((JNV) this.A04, C51966G9m.A0R(obj, obj2), (Alignment) this.A03, (0sL) this.A02, A00(this));
                break;
            case 3:
                ((AnonymousClass6I1) this.A04).A6s(C51966G9m.A0R(obj, obj2), this.A03, (0sL) this.A02, A00(this));
                break;
            case 4:
            case 5:
                C56195HuO.A00(C51966G9m.A0R(obj, obj2), (C61079JwH) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 6:
                C56198HuR.A01(C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 7:
                C56199HuS.A01(C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 8:
                C56629I5i.A01(C51966G9m.A0R(obj, obj2), (C61014JvE) this.A04, (C62626Kix) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 9:
                C56629I5i.A04(C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 10:
                C56202HuV.A01(C51966G9m.A0R(obj, obj2), (C61045Jvj) this.A04, (0sL) this.A03, (0sH) this.A02, A00(this));
                break;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C56205HuY.A00(C51966G9m.A0R(obj, obj2), (C59964JcX) this.A04, (LRW) this.A02, (0sP) this.A03, A00(this));
                break;
            case 13:
                HUJ.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (ImageUrl) this.A02, (0sP) this.A04, A00(this));
                break;
            case 14:
                C62320sa r2 = (C62320sa) this.A04;
                HUZ.A00(C51966G9m.A0R(obj, obj2), (C55765Hn0) this.A02, r2, (0sP) this.A03, A00(this));
                break;
            case 15:
                HVV.A00((LazyListState) this.A02, C51966G9m.A0R(obj, obj2), (List) this.A04, (0sP) this.A03, A00(this));
                break;
            case 16:
                C54886HWt.A00(C51966G9m.A0R(obj, obj2), (C335847dd) this.A03, (ImageUrl) this.A04, (0sP) this.A02, A00(this));
                break;
            case 17:
                I6N.A04(C51966G9m.A0R(obj, obj2), (AnonymousClass5Z4) this.A03, (CharSequence) this.A04, (0sP) this.A02, A00(this));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                I6N.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (AnonymousClass2DO) this.A02, (JQC) this.A04, A00(this));
                break;
            case 19:
                C52381GQg.A02((LazyListState) this.A04, C51966G9m.A0R(obj, obj2), (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 20:
                I5O.A00(C51966G9m.A0R(obj, obj2), (AnonymousClass5VN) this.A03, (C54605HKo) this.A02, (0sL) this.A04, A00(this));
                break;
            case 21:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                C54902HXk.A00((Context) this.A03, (Drawable) this.A04, A0R2, (C3018260f) this.A02, A00(this));
                break;
            case 22:
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) obj2;
                boolean A1U = AnonymousClass7TF.A1U(0, bitmap, str);
                KM0 km0 = (KM0) this.A04;
                C3516889w r3 = km0.A0A;
                AnonymousClass89v r0 = r3.A01;
                if (r0 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (str.equals(new C377089Km(r0, 0).invoke(this.A03))) {
                    C60691Jpc jpc = (C60691Jpc) this.A02;
                    AnonymousClass89v r02 = r3.A01;
                    if (r02 != null) {
                        C60999Juv juv = new C60999Juv((double[]) null, A1U ? 1 : 0, r02.A02, r02.A01, false);
                        juv.A00(0, bitmap);
                        jpc.A00 = juv;
                        KM0.A02(km0, jpc, this.A01);
                        break;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                break;
            case 23:
                I7I.A02(C51966G9m.A0R(obj, obj2), (C61050Jvo) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 24:
                C56277Hvl.A01(C51966G9m.A0R(obj, obj2), (H93) this.A04, (MagicModPostCaptureTransform) this.A02, (0sP) this.A03, A00(this));
                break;
            case 25:
                HYT.A00(C51966G9m.A0R(obj, obj2), (C285975Tl) this.A04, (MagicModPostCaptureTransform) this.A02, (C53526Gpw) this.A03, A00(this));
                break;
            case 26:
                C56283Hvr.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (Badge.ChallengeBadge) this.A02, (0sP) this.A04, A00(this));
                break;
            case 27:
                C56580I2k.A01(C51966G9m.A0R(obj, obj2), (C61037Jvb) this.A04, (0sP) this.A03, (0sP) this.A02, A00(this));
                break;
            case 28:
                HZE.A00(C51966G9m.A0R(obj, obj2), (C59721JVf) this.A04, (C52369GPq) this.A02, (0sL) this.A03, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C56639I5u.A01(C51966G9m.A0R(obj, obj2), (C53266GlE) this.A02, (0sP) this.A03, (0sK) this.A04, A00(this));
                break;
            case 30:
                C56651I6g.A04(C51966G9m.A0R(obj, obj2), (C52369GPq) this.A02, (C62320sa) this.A04, (C62320sa) this.A03, A00(this));
                break;
            case 31:
                C56286Hvu.A01(C51966G9m.A0R(obj, obj2), (QP8) this.A02, (0sP) this.A03, (0sP) this.A04, A00(this));
                break;
            case 32:
                HZP.A00(C51966G9m.A0R(obj, obj2), (C55622Hkh) this.A02, (C62320sa) this.A03, (C62320sa) this.A04, A00(this));
                break;
            case 33:
                C54948HZe.A00(C51966G9m.A0R(obj, obj2), (C61078JwG) this.A04, (C62320sa) this.A02, (0sP) this.A03, A00(this));
                break;
            case 34:
                I78.A05(C51966G9m.A0R(obj, obj2), (C53002Ggt) this.A04, (C55952HqG) this.A03, (OJf) this.A02, A00(this));
                break;
            case 35:
                I78.A04(C51966G9m.A0R(obj, obj2), (JVH) this.A04, (C317486nL) this.A03, (0sP) this.A02, A00(this));
                break;
            case 36:
                C317486nL r22 = (C317486nL) this.A03;
                I78.A01((Picture) this.A02, C51966G9m.A0R(obj, obj2), r22, (List) this.A04, A00(this));
                break;
            case 37:
                I78.A07(C51966G9m.A0R(obj, obj2), (C317486nL) this.A04, (List) this.A02, (0sP) this.A03, A00(this));
                break;
            case 38:
                C54955HZl.A00((C289525dk) this.A04, C51966G9m.A0R(obj, obj2), (C331547Rk) this.A02, (0sP) this.A03, A00(this));
                break;
            case 39:
            case 40:
                C55482HiQ hiQ = (C55482HiQ) this.A02;
                C54136H0f.A00(C51966G9m.A0R(obj, obj2), (C61084JwM) this.A03, hiQ, (C54136H0f) this.A04, A00(this));
                break;
            case 43:
                ((C54136H0f) this.A04).A06(C51966G9m.A0R(obj, obj2), (ImageUrl) this.A03, (ImageUrl) this.A02, A00(this));
                break;
            case 44:
                C56298HwB.A00((LazyListState) this.A02, C51966G9m.A0R(obj, obj2), (C61060Jvy) this.A03, (C67744Mtx) this.A04, A00(this));
                break;
            case 45:
                AnonymousClass3V2 r10 = (AnonymousClass3V2) obj;
                Activity activity = (Activity) obj2;
                0qQ.A0B(r10, 0);
                C55985Hqq hqq = (C55985Hqq) this.A04;
                1Xj r4 = (1Xj) this.A03;
                int i3 = this.A01;
                Context context = (Context) this.A02;
                if (2Y9.A00) {
                    int A0G = 2Yu.A0G(context, 0Pn.A01(hqq.A00)) + i3 + AnonymousClass2uJ.A00;
                    if (activity != null) {
                        i = 2db.A01(activity);
                    } else {
                        i = 0;
                    }
                    int i4 = A0G + i;
                    Size A012 = C255983v2.A00.A01(context, r4.A1n(context), i4, 0);
                    if (A012 != null) {
                        float height = ((float) A012.getHeight()) * 1.35f;
                        float A002 = (float) (AnonymousClass0nB.A00(context) - i4);
                        int i5 = (height > A002 ? 1 : (height == A002 ? 0 : -1));
                        View view = r10.A02;
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (i5 > 0) {
                            layoutParams2.width = A012.getWidth();
                            layoutParams = view.getLayoutParams();
                            i2 = A012.getHeight();
                        } else {
                            layoutParams2.width = (int) (A002 / 1.35f);
                            layoutParams = view.getLayoutParams();
                            i2 = (int) height;
                        }
                        layoutParams.height = i2;
                        break;
                    }
                }
                break;
            case 46:
                User user = (User) obj;
                0qQ.A0B(user, 0);
                N4R n4r = (N4R) this.A04;
                AnonymousClass3W1 r23 = (AnonymousClass3W1) this.A02;
                int i6 = this.A01;
                AnonymousClass7TF.A1B(n4r, 0, r23);
                ((C55504Him) this.A03).A00.A00.D3K((1Xj) n4r.A02, r23, user.getId(), i6, false);
                break;
            case 47:
                C317486nL r24 = (C317486nL) this.A02;
                C56590I2u.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, r24, (0sP) this.A04, A00(this));
                break;
            case 48:
                C56590I2u.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (List) this.A02, (0sP) this.A04, A00(this));
                break;
            case 49:
                I79.A05(C51966G9m.A0R(obj, obj2), (C54621HLe) this.A02, (C53547GqI) this.A03, (HBP) this.A04, A00(this));
                break;
            default:
                C55482HiQ hiQ2 = (C55482HiQ) this.A02;
                C54136H0f.A01(C51966G9m.A0R(obj, obj2), (C61084JwM) this.A03, hiQ2, (C54136H0f) this.A04, A00(this));
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGN(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i2;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
    }
}
