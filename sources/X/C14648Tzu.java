package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Tzu  reason: case insensitive filesystem */
public final class C14648Tzu extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new ImageView(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r9, C276544tV r10, Object obj) {
        C14594Tyy tyy = (C14594Tyy) view;
        C51973G9u.A1E(tyy, r9, r10);
        int i = -16777216;
        C276544tV A07 = r10.A07(35);
        int i2 = 24;
        if (A07 != null) {
            try {
                String A0F = A07.A0F();
                float f = 24.0f;
                if (A0F != null) {
                    f = AnonymousClass6Su.A01(A0F);
                }
                i2 = (int) f;
            } catch (C258053yO unused) {
            }
            C276544tV A072 = A07.A07(35);
            if (A072 != null) {
                i = AnonymousClass6TP.A00(r9, A072, 0);
            }
        }
        tyy.A01(new C7293Q2s(r9.A00, 2.0f, i, i2));
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

    public C14648Tzu(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
