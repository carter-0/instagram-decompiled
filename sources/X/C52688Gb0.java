package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Gb0  reason: case insensitive filesystem */
public final class C52688Gb0 extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new ImageView(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r18, C276544tV r19, Object obj) {
        int i;
        float f;
        C52692Gb4 A00;
        C52692Gb4 A002;
        C52733Gbk gbk;
        C14594Tyy tyy = (C14594Tyy) view;
        C307786Rm r4 = r18;
        C276544tV r11 = r19;
        C51973G9u.A1E(tyy, r4, r11);
        int A03 = r11.A03(40, 0);
        C276544tV A07 = r11.A07(35);
        String str = "4.0dp";
        String A0K = r11.A0K(36);
        if (A0K != null) {
            str = A0K;
        }
        C276544tV A072 = r11.A07(41);
        C276544tV A073 = r11.A07(38);
        String str2 = "rectangle";
        String A0G = r11.A0G();
        if (A0G != null) {
            str2 = A0G;
        }
        if (A07 != null) {
            i = AnonymousClass6TP.A00(r4, A07, 0);
        } else {
            i = -1;
        }
        try {
            f = AnonymousClass6Su.A01(str);
        } catch (C258053yO e) {
            1Kn.A03("CDSGlimmerViewUtils", e);
            f = C14573Tyc.A00(r4.A00, 4.0f);
        }
        if (A072 != null) {
            A00 = C52692Gb4.A00(A072.A02(36, 0.3f), A072.A02(35, 0.5f));
        } else {
            A00 = C52692Gb4.A00(0.3f, 0.5f);
        }
        if (A073 != null) {
            A002 = C52692Gb4.A00(A073.A02(36, 0.066f), A073.A02(35, 0.11f));
        } else {
            A002 = C52692Gb4.A00(0.066f, 0.11f);
        }
        if ("circle".equalsIgnoreCase(str2)) {
            gbk = C52733Gbk.CIRCLE;
        } else {
            gbk = C52733Gbk.RECTANGLE;
        }
        tyy.A01(new C52689Gb1(A00, A002, gbk, f, A03, i, r4.A05));
        tyy.A00();
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        C14594Tyy tyy = (C14594Tyy) view;
        0qQ.A0B(tyy, 0);
        Animatable animatable = tyy.A00;
        if (animatable != null) {
            animatable.stop();
        }
        tyy.A01 = false;
    }

    public C52688Gb0(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
