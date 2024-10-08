package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class U3J extends View {
    public final C14676U0x A00;
    public final List A01;
    public final C18730Vz9 A02 = C18730Vz9.A00(this, 4);

    public U3J(Context context) {
        super(context, (AttributeSet) null, 0);
        C14676U0x u0x = new C14676U0x(context);
        this.A00 = u0x;
        this.A01 = new ArrayList();
        setBackground(u0x);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        A00(this);
        super.onDraw(canvas);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A02);
    }

    public final void setListener(C20846X0y x0y) {
        this.A00.A01 = x0y;
    }

    public static final void A00(U3J u3j) {
        if (u3j.getWidth() != 0 && u3j.getHeight() != 0) {
            List<VR3> list = u3j.A01;
            for (VR3 vr3 : list) {
                C14676U0x u0x = u3j.A00;
                RectF rectF = vr3.A00;
                List<C17878VhV> list2 = vr3.A01;
                0qQ.A0B(rectF, 0);
                if (!u0x.getBounds().isEmpty()) {
                    Context context = u0x.A02;
                    int A002 = C18092VlM.A00(context, 1200.0f);
                    float A04 = ((((float) AnonymousClass7TF.A04(u0x)) - rectF.centerX()) / ((float) AnonymousClass7TF.A06(u0x))) * 1.5f;
                    float f = (rectF.left + rectF.right) / 2.0f;
                    float f2 = (rectF.top + rectF.bottom) / 2.0f;
                    HashMap hashMap = new HashMap();
                    List<C17476VXd> list3 = u0x.A06;
                    for (C17476VXd vXd : list3) {
                        hashMap.put(vXd.A03, vXd);
                    }
                    float A003 = (float) C18092VlM.A00(context, -300.0f);
                    float A004 = (float) C18092VlM.A00(context, -1000.0f);
                    float A005 = (float) C18092VlM.A00(context, 700.0f);
                    for (C17878VhV vhV : list2) {
                        2SP r18 = 2SP.A01;
                        float f3 = 0.75f - 0.05f;
                        float A022 = 0.05f + (r18.A02() * f3);
                        Paint paint = new Paint();
                        paint.set(vhV.A01);
                        paint.setAlpha(255);
                        List list4 = u0x.A07;
                        Object obj = hashMap.get(vhV.A02.A03);
                        0qQ.A0A(obj);
                        C17878VhV vhV2 = new C17878VhV(paint, (C17476VXd) obj, vhV.A00);
                        C18573VuP vuP = vhV2.A04;
                        C18573VuP vuP2 = vhV.A04;
                        float f4 = vuP2.A05 + rectF.left;
                        float f5 = vuP2.A06 + rectF.top;
                        float f6 = 1.0f - 0.95f;
                        vuP.A05 = ((f - f4) * f6) + f4;
                        vuP.A06 = ((f2 - f5) * f6) + f5;
                        vuP.A03 = vuP2.A03 * 0.95f;
                        vuP.A04 = vuP2.A04 * 0.95f;
                        vuP.A02 = vuP2.A02;
                        C18619VvC vvC = vhV2.A03;
                        vvC.A05 = A022;
                        vvC.A06 = A022;
                        vvC.A01 = ((float) A002) * ((((A022 - 0.05f) / f3) * (1.0f - 0.75f)) + 0.75f);
                        vvC.A04 = C13988Tno.A00(1.0f, -1.0f, r18.A02()) * 540.0f;
                        vvC.A08 = ((float) C18092VlM.A00(context, 200.0f)) * (C14676U0x.A00(-1.0f, 1.0f) + A04);
                        vvC.A09 = C14676U0x.A00(A003, A004);
                        vvC.A02 = A005;
                        list4.add(vhV2);
                    }
                    int max = Math.max(0, 66 - list2.size());
                    for (int i = 0; i < max; i++) {
                        2SQ r2 = 2SP.A00;
                        2SP r5 = 2SP.A01;
                        float f7 = 1.5f - 0.1f;
                        float A023 = 0.1f + (r5.A02() * f7);
                        float A006 = C13988Tno.A00(0.6f, 0.3f, r5.A02());
                        List list5 = u0x.A07;
                        C17878VhV vhV3 = new C17878VhV((Paint) 00k.A0G(u0x.A05, r2), (C17476VXd) 00k.A0G(list3, r2), r5.A08(1000));
                        C18573VuP vuP3 = vhV3.A04;
                        vuP3.A05 = C14676U0x.A00(rectF.left, rectF.right);
                        vuP3.A06 = C14676U0x.A00(rectF.top, rectF.bottom);
                        vuP3.A03 = A006;
                        vuP3.A04 = A006;
                        vuP3.A02 = r5.A02() * 360.0f;
                        C18619VvC vvC2 = vhV3.A03;
                        vvC2.A01 = ((float) A002) * ((((A023 - 0.1f) / f7) * (1.0f - 0.75f)) + 0.75f);
                        vvC2.A05 = A023;
                        vvC2.A06 = A023;
                        int i2 = -1;
                        if (r5.A0A()) {
                            i2 = 1;
                        }
                        vvC2.A04 = ((float) i2) * C13988Tno.A00(540.0f, 270.0f, r5.A02());
                        vvC2.A08 = ((float) C18092VlM.A00(context, 200.0f)) * (C14676U0x.A00(-1.0f, 1.0f) + A04);
                        vvC2.A09 = C14676U0x.A00(A003, A004);
                        vvC2.A02 = A005;
                        list5.add(vhV3);
                    }
                    Choreographer choreographer = u0x.A04;
                    Choreographer.FrameCallback frameCallback = u0x.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                }
            }
            list.clear();
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        int A06 = AnonymousClass0fD.A06(-1219045195);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A02;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(-215312546, A06);
    }
}
