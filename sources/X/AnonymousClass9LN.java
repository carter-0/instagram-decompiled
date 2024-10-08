package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9LN  reason: invalid class name */
public final class AnonymousClass9LN extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass4Jg r1;
        AnonymousClass4Jf r12;
        List list;
        AnonymousClass4Jg r2;
        AnonymousClass4Jf r22;
        List list2;
        C252063oV r0;
        C247793gv r13;
        switch (this.A00) {
            case 0:
                return new C244183am((AnonymousClass3ZB) ((C243613Zn) this.A01).A00.A09.getValue());
            case 1:
                return new C56153Htf((C55728HmP) ((C243613Zn) this.A01).A00.A0B.getValue());
            case 2:
                return new C244033aX((AnonymousClass3Z1) ((AnonymousClass3YE) ((C243613Zn) this.A01).A00.A03.getValue()).A03.getValue());
            case 3:
                return new C244003aU((AnonymousClass3ZP) ((C243613Zn) this.A01).A00.A0C.getValue());
            case 4:
                AnonymousClass3ZP r02 = (AnonymousClass3ZP) this.A01;
                return new C2803351i(r02.A00, r02.A01);
            case 5:
                C242923Ws r03 = (C242923Ws) this.A01;
                return new AnonymousClass3YE(r03.A00, r03.A01);
            case 6:
                return new C55503Hil(((C242923Ws) this.A01).A01);
            case 7:
                C242923Ws r04 = (C242923Ws) this.A01;
                return new AnonymousClass3ZZ(r04.A00, r04.A01);
            case 8:
                return new AnonymousClass3Z8(((C242923Ws) this.A01).A00);
            case 9:
                return new AnonymousClass4i1(((C242923Ws) this.A01).A01);
            case 10:
                return new AnonymousClass3Z9(((C242923Ws) this.A01).A01);
            case 11:
                return new AnonymousClass3ZB(((C242923Ws) this.A01).A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C244363b4(((C242923Ws) this.A01).A00);
            case 13:
                C242923Ws r05 = (C242923Ws) this.A01;
                return new C55728HmP(r05.A00, r05.A01, r05.A02);
            case 14:
                C242923Ws r06 = (C242923Ws) this.A01;
                return new AnonymousClass3ZP(r06.A00, r06.A01);
            case 15:
                r0 = ((C253993rl) this.A01).A0K;
                break;
            case 16:
                r0 = ((C253993rl) this.A01).A0L;
                break;
            case 17:
                r0 = ((C253993rl) this.A01).A0O;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C253993rl r3 = (C253993rl) this.A01;
                View view = r3.A0P.getView();
                view.getLayoutParams().height = r3.A0C;
                view.requestLayout();
                return view;
            case 19:
                r0 = ((C253993rl) this.A01).A0S;
                break;
            case 20:
                r0 = ((C253993rl) this.A01).A0T;
                break;
            case 21:
                r0 = ((C253993rl) this.A01).A0U;
                break;
            case 22:
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View requireViewById = ((C253993rl) this.A01).A0E.requireViewById(R.id.seen_state);
                0qQ.A07(requireViewById);
                GradientSpinner gradientSpinner = (GradientSpinner) requireViewById;
                if (!C61670oa.A02()) {
                    return gradientSpinner;
                }
                Context context = gradientSpinner.getContext();
                0qQ.A07(context);
                float A04 = AnonymousClass0od.A04(context, R.dimen.album_preview_add_item_margin, R.dimen.abc_star_medium);
                float A03 = AnonymousClass0od.A03(context, R.dimen.album_preview_add_item_margin, R.dimen.afi_indicator_arrow_margin_top);
                float A02 = AnonymousClass0od.A02(context, R.dimen.album_preview_add_item_margin);
                ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
                if (layoutParams != null) {
                    int i2 = (int) A04;
                    layoutParams.width = i2;
                    layoutParams.height = i2;
                }
                gradientSpinner.A02 = A03;
                gradientSpinner.A00 = A02;
                gradientSpinner.invalidate();
                return gradientSpinner;
            case 23:
                r0 = ((C253993rl) this.A01).A0Z;
                break;
            case 25:
                return ((AnonymousClass3ZH) this.A01).A01;
            case 26:
                return C60340gF.A00;
            case 31:
                return new C271164i0(((AnonymousClass3YE) this.A01).A01);
            case 32:
                AnonymousClass3YE r07 = (AnonymousClass3YE) this.A01;
                return new AnonymousClass3Z1(r07.A00, r07.A01);
            case 33:
                return new C246923fS(((C245813dW) this.A01).A00);
            case 34:
                return new C243173Xr(((C245813dW) this.A01).A00);
            case 35:
                return new AnonymousClass4Jd(((C245813dW) this.A01).A00);
            case 36:
                C246653ex r14 = (C246653ex) this.A01;
                Object obj = null;
                if (r14 != null) {
                    r2 = r14.A01;
                } else {
                    r2 = null;
                }
                if (!(!(r2 instanceof AnonymousClass4Jf) || (r22 = (AnonymousClass4Jf) r2) == null || (list2 = r22.A00) == null)) {
                    obj = 00k.A0J(list2);
                }
                return Boolean.valueOf(obj instanceof SocialContextBubbleUiState);
            case 37:
                C246653ex r08 = (C246653ex) this.A01;
                if (r08 != null) {
                    r1 = r08.A01;
                } else {
                    r1 = null;
                }
                if (r1 instanceof AnonymousClass4Jf) {
                    r12 = (AnonymousClass4Jf) r1;
                } else {
                    r12 = null;
                }
                boolean z = false;
                if (r12 != null && (list = r12.A00) != null && list.size() > 1 && (00k.A0J(list) instanceof SocialContextBubbleUiState)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 38:
                return ((C245813dW) this.A01).A01.BR1();
            case 39:
                return ((C245813dW) this.A01).A01.BR2();
            case 40:
                return new C262734Fu(((C245813dW) this.A01).A00);
            case Seq.NULL_REFNUM:
                return new AnonymousClass4H0(((C245813dW) this.A01).A00);
            case Seq.RefTracker.REF_OFFSET:
                return new C246293eL(((C245813dW) this.A01).A00);
            case 43:
                return new C262734Fu(((C262834Ge) this.A01).A00);
            case 44:
                return new C246293eL(((C262834Ge) this.A01).A00);
            case 45:
                C247533gU r4 = (C247533gU) this.A01;
                if (r4 != null) {
                    C247793gv r15 = r4.A01;
                    if (!(r15 instanceof HBC) && !(r15 instanceof C247783gu)) {
                        String A002 = AnonymousClass000.A00(3769);
                        String str = r4.A03;
                        String str2 = r4.A04;
                        String A0i = 002.A0i(A002, str, str2, '|');
                        1OO A0J = 1NK.A00().A0J(r4.A02, str2);
                        A0J.A0I = false;
                        A0J.A0J = true;
                        A0J.A02(new INJ(r4, 0));
                        A0J.A08 = A0i;
                        C226952iF A003 = A0J.A00();
                        r4.A00 = A003;
                        A003.E5t();
                    }
                }
                return new C245943dj(new C58179Inj(r4, 0));
            case 46:
                C247533gU r09 = (C247533gU) this.A01;
                if (r09 != null) {
                    r13 = r09.A01;
                } else {
                    r13 = null;
                }
                if (r13 instanceof C247783gu) {
                    return r13;
                }
                return null;
            case 47:
                Context context2 = ((AnonymousClass3Y5) this.A01).A05.A0C;
                0qQ.A07(context2);
                return context2.getDrawable(R.drawable.feed_like_big);
            case 48:
                int A012 = AnonymousClass0nB.A01(((C243073Xh) this.A01).A00);
                int i3 = AnonymousClass3XX.A00;
                return Integer.valueOf(View.MeasureSpec.makeMeasureSpec(A012, SN3.MAX_SIGNED_POWER_OF_TWO));
            case 49:
                return new C247213fx(((Boolean) ((C246903fQ) this.A01).A01.A0A.A00.invoke()).booleanValue());
            default:
                return this.A01;
        }
        return r0.getView();
    }
}
