package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.6P7  reason: invalid class name */
public final class AnonymousClass6P7 implements C2365734g {
    public final /* synthetic */ AnonymousClass6P6 A00;

    public AnonymousClass6P7(AnonymousClass6P6 r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        String str;
        0qQ.A0B(view, 0);
        AnonymousClass6P6 r5 = this.A00;
        IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.afi_container_for_footer);
        r5.A03 = igLinearLayout;
        Context context = r5.A00;
        if (context != null) {
            str = "container";
            if (igLinearLayout != null) {
                AnonymousClass9JO r1 = r5.A01;
                if (r1 == null) {
                    str = "negativeRenderingData";
                } else {
                    AnonymousClass6P6.A00(context, r1, igLinearLayout, r5, AnonymousClass05K.A01);
                    Context context2 = r5.A00;
                    if (context2 != null) {
                        IgLinearLayout igLinearLayout2 = r5.A03;
                        if (igLinearLayout2 != null) {
                            AnonymousClass9JO r12 = r5.A02;
                            if (r12 == null) {
                                str = "positiveRenderingData";
                            } else {
                                AnonymousClass6P6.A00(context2, r12, igLinearLayout2, r5, AnonymousClass05K.A00);
                                C309766Zn r0 = r5.A04;
                                if (r0 == null) {
                                    str = "delegate";
                                } else if (r0.CPp()) {
                                    IgLinearLayout igLinearLayout3 = r5.A03;
                                    if (igLinearLayout3 != null) {
                                        if (igLinearLayout3.getChildCount() == 2) {
                                            IgLinearLayout igLinearLayout4 = r5.A03;
                                            if (igLinearLayout4 != null) {
                                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igLinearLayout4, "alpha", new float[]{0.0f, 1.0f});
                                                ofFloat.setDuration(400);
                                                ofFloat.start();
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "context";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
