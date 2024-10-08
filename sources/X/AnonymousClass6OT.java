package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.facebook.rendercore.text.RCTextView;
import com.instagram.android.R;

/* renamed from: X.6OT  reason: invalid class name */
public final class AnonymousClass6OT implements C253183qL {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return obj3 != obj4;
    }

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public AnonymousClass6OT(C307786Rm r1, C276544tV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        GradientDrawable gradientDrawable;
        AnonymousClass6OW r6;
        RCTextView rCTextView = (RCTextView) obj;
        0qQ.A0B(rCTextView, 1);
        C307786Rm r2 = this.A00;
        Object A06 = C307476Qg.A06(r2, this.A01);
        A06.getClass();
        AnonymousClass6OX r4 = (AnonymousClass6OX) A06;
        if (rCTextView instanceof C307046Op) {
            C58840Ae r3 = (C58840Ae) r2.A01.get(R.id.text_renderer_logger);
            C307046Op r5 = (C307046Op) rCTextView;
            r5.A00 = r4;
            AnonymousClass6OZ r0 = r4.A04;
            if (r0 == null || (r6 = r0.A03) == null || !r6.A0E || r6.A0C == null) {
                gradientDrawable = null;
            } else {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(r6.A0C.intValue());
                float f = ((float) r4.A03) / 4.0f;
                if (f < 8.0f) {
                    f = 8.0f;
                }
                gradientDrawable.setCornerRadius(f * r6.A01);
            }
            r5.setBackground(gradientDrawable);
            rCTextView.post(new C307056Oq(r3, rCTextView, r4));
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RCTextView rCTextView = (RCTextView) obj;
        0qQ.A0B(rCTextView, 1);
        if (rCTextView instanceof C307046Op) {
            ((C307046Op) rCTextView).A00 = null;
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }
}
