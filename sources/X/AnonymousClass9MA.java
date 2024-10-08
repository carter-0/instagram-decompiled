package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.List;
import java.util.Set;

/* renamed from: X.9MA  reason: invalid class name */
public final class AnonymousClass9MA extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MA(int i, Object obj, Object obj2, boolean z) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        N4L n4l;
        02m r4;
        C334157al r3;
        boolean z;
        Integer num;
        DirectThreadThemeInfo directThreadThemeInfo;
        List list;
        switch (this.A00) {
            case 0:
                r4 = 02m.A0p;
                0qQ.A07(r4);
                r3 = (C334157al) this.A01;
                z = this.A03;
                r4.markerEnd(16659282, 4);
                break;
            case 1:
                r4 = 02m.A0p;
                0qQ.A07(r4);
                r3 = (C334157al) this.A01;
                z = this.A03;
                r4.markerStart(16659282);
                break;
            case 2:
                C254703su r32 = (C254703su) this.A02;
                boolean z2 = true;
                if (r32.A1S() && ((n4l = r32.A0D) == null || !n4l.A06)) {
                    z2 = !this.A03 && (r32.A1T() || C331057Pi.A02((C242373Tu) this.A01));
                }
                return Boolean.valueOf(z2);
            case 3:
                if (!this.A03 || (directThreadThemeInfo = (DirectThreadThemeInfo) this.A02) == null) {
                    return ((Context) this.A01).getDrawable(R.drawable.rounded_blue_gradient_rectangle);
                }
                Context context = (Context) this.A01;
                int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.asset_picker_static_sticker_last_row_padding);
                AnonymousClass7I8 r7 = new AnonymousClass7I8(context);
                int[] A002 = C329947Kv.A00.A00(context, directThreadThemeInfo, AnonymousClass3HA.A00(context));
                0qQ.A07(A002);
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{2Yu.A0F(context, R.attr.cyanBubblePressedBackground), 2Yu.A0F(context, R.attr.cyanBubbleBackground)});
                AnonymousClass9XQ r1 = new AnonymousClass9XQ(new C328047Df((C242553Us) null, 127));
                int length = A002.length;
                if (length == 0) {
                    int A0F = 2Yu.A0F(context, R.attr.cyanBubbleBackground);
                    r1.A02 = colorStateList;
                    r1.A01 = A0F;
                    Paint paint = r1.A05;
                    paint.setColor(A0F);
                    paint.setShader((Shader) null);
                    r1.A03 = null;
                } else if (length == 1) {
                    int i = A002[0];
                    Paint paint2 = r1.A05;
                    paint2.setColor(i);
                    paint2.setShader((Shader) null);
                    r1.A03 = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) r7.A00(), A002, (float[]) null, Shader.TileMode.CLAMP);
                    r1.A03 = linearGradient;
                    r1.A05.setShader(linearGradient);
                    AnonymousClass9XQ.A00(r1);
                }
                float f = (float) dimensionPixelOffset;
                if (!(r1.getShape() instanceof C308496Um)) {
                    return r1;
                }
                ((C308496Um) r1.getShape()).A00(f, f, f, f);
                r1.invalidateSelf();
                return r1;
            case 4:
                AnonymousClass3W1 r42 = (AnonymousClass3W1) this.A02;
                AnonymousClass2xU r33 = (AnonymousClass2xU) this.A01;
                boolean z3 = this.A03;
                r42.A0L(r33, (Integer) null, z3);
                return new C245943dj(new GL3(14, r33, r42, z3));
            case 5:
                AnonymousClass3W1 r43 = (AnonymousClass3W1) this.A02;
                AnonymousClass2xU r34 = (AnonymousClass2xU) this.A01;
                boolean z4 = this.A03;
                r43.A0L(r34, (Integer) null, z4);
                return new C245943dj(new GL3(15, r34, r43, z4));
            case 7:
                return new AnonymousClass49W((UserSession) this.A02, (AnonymousClass49S) this.A01, new String(), this.A03);
            case 9:
                Object obj = this.A01;
                if (obj != null) {
                    return obj;
                }
                C336257eK r44 = (C336257eK) this.A02;
                UserSession userSession = r44.A0C;
                C337287g2 r6 = r44.A0D;
                if (this.A03) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                return C14225Ts5.A01(userSession, (AnonymousClass4D6) null, r44, (G9d) null, r6, num, false);
            default:
                C56489HzL hzL = C59656JRy.A00;
                UserSession userSession2 = (UserSession) this.A02;
                1L5 r35 = (1L5) this.A01;
                if (this.A03) {
                    list = C56489HzL.A01;
                } else {
                    list = C56489HzL.A00;
                }
                Set A0k = 00k.A0k(list);
                0qQ.A0B(userSession2, 0);
                0qQ.A0B(r35, 1);
                return new C52344GOn(userSession2, r35, A0k);
        }
        C334197ap.A00(r4, r3, z);
        return C60340gF.A00;
    }
}
