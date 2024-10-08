package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.pando.TreeJNI;
import com.instagram.pando.livetree.LiveTreeJNI;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Iw7  reason: case insensitive filesystem */
public final class C58698Iw7 extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58698Iw7(AnonymousClass3Y5 r2, C56083HsW hsW, C53866GvX gvX, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A04 = gvX;
        switch (i2) {
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A03 = r2;
                this.A01 = i;
                this.A02 = hsW;
                break;
            default:
                this.A02 = r2;
                this.A01 = i;
                this.A03 = hsW;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0sK r3;
        Object obj;
        Integer valueOf;
        Object obj2;
        switch (this.A00) {
            case 0:
                ((Q2X) this.A02).Ck0(this.A01, SG9.A00((Throwable) this.A03));
                break;
            case 1:
            case 2:
                r3 = (0sK) this.A03;
                obj = this.A02;
                valueOf = Integer.valueOf(this.A01);
                obj2 = ((C59964JcX) this.A04).A02;
                break;
            case 9:
                ((LinearLayoutManager) this.A03).A1p(this.A01, C3516489r.A00(AnonymousClass7TE.A0S((View) this.A04), ((AnonymousClass89v) this.A02).A02));
                break;
            case 10:
                NWK nwk = (NWK) this.A04;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                nwk.A02.DGG((C67331Mm7) this.A02, this.A01);
                nwk.A01((C66788McZ) this.A03);
                break;
            case 11:
                C67331Mm7 mm7 = (C67331Mm7) this.A03;
                boolean A0K = 0qQ.A0K(mm7.A00, AnonymousClass43I.A00);
                C67325Mm1 mm1 = (C67325Mm1) this.A04;
                if (!A0K) {
                    Number number = mm1.A00;
                    if (number != null) {
                        mm1.A00 = Integer.valueOf(((C249703kE) this.A02).getAbsoluteAdapterPosition());
                        mm1.notifyItemChanged(number.intValue());
                        Number number2 = mm1.A00;
                        if (number2 != null) {
                            mm1.notifyItemChanged(number2.intValue());
                        }
                    }
                    0qQ.A0F("currentSelectedPosition");
                    throw AnonymousClass00P.createAndThrow();
                }
                mm1.A01.DGG(mm7, this.A01);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                r3 = (0sK) this.A03;
                obj = ((C53311Glx) this.A02).A04;
                valueOf = Integer.valueOf(this.A01);
                obj2 = this.A04;
                break;
            case 14:
                List<Object> access$getOptionalTreeListNative = ((LiveTreeJNI) this.A04).getOptionalTreeListNative(this.A01, (Class) this.A03);
                if (access$getOptionalTreeListNative == null) {
                    return null;
                }
                0sP r2 = (0sP) this.A02;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object invoke : access$getOptionalTreeListNative) {
                    Object invoke2 = r2.invoke(invoke);
                    if (invoke2 != null) {
                        A1C.add(invoke2);
                    }
                }
                return A1C;
            case 15:
                TreeJNI access$getOptionalTreeValueNative = ((LiveTreeJNI) this.A04).getOptionalTreeValueNative(this.A01, (Class) this.A03);
                if (access$getOptionalTreeValueNative != null) {
                    return ((0sP) this.A02).invoke(access$getOptionalTreeValueNative);
                }
                return null;
            case 16:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                AnonymousClass3Y5 r6 = (AnonymousClass3Y5) this.A03;
                int i2 = this.A01;
                C56083HsW hsW = (C56083HsW) this.A02;
                int i3 = hsW.A00;
                int i4 = hsW.A01;
                int A0B = C51972G9s.A0B(r6, 0.0d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i2);
                gradientDrawable.setStroke(A0B, i3);
                gradientDrawable.setCornerRadius((float) C51972G9s.A0B(r6, (double) i4));
                return gradientDrawable;
            case 17:
                AnonymousClass3Y5 r1 = (AnonymousClass3Y5) this.A03;
                int i5 = this.A01;
                return AnonymousClass0eN.A01(new C58698Iw7(r1, (C56083HsW) this.A02, (C53866GvX) this.A04, i5, 16));
            case 19:
                AnonymousClass3Y5 r62 = (AnonymousClass3Y5) this.A02;
                int i6 = this.A01;
                C56083HsW hsW2 = (C56083HsW) this.A03;
                int i7 = hsW2.A00;
                int i8 = hsW2.A01;
                int A0B2 = C51972G9s.A0B(r62, 0.0d);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(i6);
                gradientDrawable2.setStroke(A0B2, i7);
                gradientDrawable2.setCornerRadius((float) C51972G9s.A0B(r62, (double) i8));
                return gradientDrawable2;
            case 20:
                1Xj r22 = (1Xj) this.A03;
                int i9 = this.A01;
                return C52589GYo.A00((2WX) this.A02, r22, (C52589GYo) this.A04, i9);
            default:
                r3 = (0sK) this.A04;
                obj = this.A02;
                valueOf = Integer.valueOf(this.A01);
                obj2 = this.A03;
                break;
        }
        r3.invoke(obj, valueOf, obj2);
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58698Iw7(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A03 = obj3;
    }
}
