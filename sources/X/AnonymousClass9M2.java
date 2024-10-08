package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.9M2  reason: invalid class name */
public final class AnonymousClass9M2 extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M2(int i, Object obj, Object obj2) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                AnonymousClass5ZB r10 = (AnonymousClass5ZB) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.A02;
                0sJ r8 = (0sJ) this.A01;
                C268454dQ r4 = r10.A05;
                AnonymousClass5ZD r3 = r10.A08;
                if (r3 == null) {
                    r3 = AnonymousClass5ZD.A04;
                }
                C291715hl r0 = r10.A06;
                if (r0 != null) {
                    i2 = r0.A00;
                } else {
                    i2 = 0;
                }
                C291715hl r2 = new C291715hl(i2);
                C291725hm r02 = r10.A07;
                if (r02 != null) {
                    i3 = r02.A00;
                } else {
                    i3 = 1;
                }
                spannable.setSpan(new C378079Ok((Typeface) r8.invoke(r4, r3, r2, new C291725hm(i3))), intValue, intValue2, 33);
                break;
            case 1:
                String str = (String) obj;
                0qQ.A0B(str, 0);
                ((C299665vd) this.A01).DqP(str, ((C299575vQ) this.A02).Be5().A03, (String) obj2, (String) obj3);
                break;
            case 2:
                C240983Nk r102 = (C240983Nk) obj;
                AnonymousClass3W1 r11 = (AnonymousClass3W1) obj2;
                C262804Gb r12 = (C262804Gb) obj3;
                0qQ.A0B(r102, 0);
                0qQ.A0B(r11, 1);
                0qQ.A0B(r12, 2);
                ((C274134nl) this.A02).A01.DKE(r102, r12, (1Xj) this.A01, r11);
                break;
            case 3:
                View view = (View) obj;
                AnonymousClass4DU r112 = (AnonymousClass4DU) obj2;
                C238863Ds r122 = (C238863Ds) obj3;
                0qQ.A0B(view, 0);
                0qQ.A0B(r112, 1);
                0qQ.A0B(r122, 2);
                1Xj r42 = (1Xj) this.A01;
                UserSession userSession = ((C242923Ws) this.A02).A00;
                0qQ.A0B(r42, 0);
                C238833Dp A002 = C238833Dp.A00(userSession);
                A002.A0A(view, new C246153e7((AnonymousClass4HI) null, userSession, r42, r112));
                A002.A05(view, r122);
                break;
            case 4:
                AnonymousClass3YB r103 = (AnonymousClass3YB) obj;
                C243503Za r113 = (C243503Za) obj2;
                0qQ.A0B(r103, 0);
                0qQ.A0B(r113, 1);
                0qQ.A0B(obj3, 2);
                return Boolean.valueOf(C242923Ws.A01((1Xj) this.A01, (C242923Ws) this.A02, r103, r113));
            case 5:
                AnonymousClass4JV r104 = (AnonymousClass4JV) obj;
                Activity activity = (Activity) obj2;
                Context context = (Context) obj3;
                0qQ.A0B(r104, 0);
                0qQ.A0B(context, 2);
                C255983v2 r32 = C255983v2.A00;
                ExtendedImageUrl A1n = ((1Xj) this.A01).A1n(context);
                int A0G = 2Yu.A0G(context, 0Pn.A01(((C245813dW) this.A02).A00)) + r104.A00 + AnonymousClass2uJ.A00;
                if (activity != null) {
                    i = 2db.A01(activity);
                } else {
                    i = 0;
                }
                return r32.A01(context, A1n, A0G + i, 0);
            default:
                String str2 = (String) obj;
                C53277GlP glP = (C53277GlP) obj2;
                0qQ.A0B(str2, 0);
                0qQ.A0B(glP, 1);
                ((AnonymousClass339) this.A01).EzH(glP, (1Xj) this.A02, (C54512HGy) obj3, str2);
                break;
        }
        return C60340gF.A00;
    }
}
