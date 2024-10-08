package X;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.common.session.UserSession;

/* renamed from: X.9MS  reason: invalid class name */
public final class AnonymousClass9MS extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MS(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(3);
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier Ezh;
        Object obj4 = obj3;
        Object obj5 = obj2;
        Object obj6 = obj;
        switch (this.A00) {
            case 0:
                AnonymousClass6I0 r6 = (AnonymousClass6I0) obj6;
                C286575Wy r12 = (C286575Wy) obj5;
                ((Number) obj4).intValue();
                if (0fL.A02()) {
                    0fL.A01(409468393, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
                }
                Object obj7 = this.A01;
                Object ECw = r12.ECw();
                Object obj8 = AnonymousClass5XT.A00;
                if (ECw == obj8) {
                    ECw = new AnonymousClass6I5(r6, new C58682Ivr(obj7, 14));
                    r12.FLL(ECw);
                }
                AnonymousClass6I5 r7 = (AnonymousClass6I5) ECw;
                Object ECw2 = r12.ECw();
                if (ECw2 == obj8) {
                    ECw2 = new AnonymousClass6I8(new AnonymousClass6I6(r7));
                    r12.FLL(ECw2);
                }
                AnonymousClass6I8 r8 = (AnonymousClass6I8) ECw2;
                AnonymousClass6H8 r9 = (AnonymousClass6H8) this.A04;
                if (r9 != null) {
                    r12.ExS(205264983);
                    r12.ExS(6622915);
                    if (0fL.A02()) {
                        0fL.A01(-1935379076, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:31)");
                    }
                    View view = (View) r12.AJO(AndroidCompositionLocals_androidKt.A03);
                    boolean AGu = r12.AGu(view);
                    Object ECw3 = r12.ECw();
                    if (AGu || ECw3 == obj8) {
                        ECw3 = new AnonymousClass6I9(view);
                        r12.FLL(ECw3);
                    }
                    if (0fL.A02()) {
                        0fL.A00(750518060);
                    }
                    C286565Wx.A0L((C286565Wx) r12, false);
                    Object[] objArr = {r9, r7, r8, ECw3};
                    boolean AGu2 = r12.AGu(r9) | r12.AGw(r7) | r12.AGw(r8) | r12.AGw(ECw3);
                    Object ECw4 = r12.ECw();
                    if (AGu2 || ECw4 == obj8) {
                        ECw4 = new C58769IxG(3, r7, r8, r9, ECw3);
                        r12.FLL(ECw4);
                    }
                    C286645Xf.A06(r12, (0sP) ECw4, objArr);
                } else {
                    r12.ExS(205858881);
                }
                C286565Wx.A0L((C286565Wx) r12, false);
                Modifier modifier = (Modifier) this.A03;
                if (!(r9 == null || (Ezh = modifier.Ezh(new TraversablePrefetchStateModifierElement(r9))) == null)) {
                    modifier = Ezh;
                }
                boolean AGu3 = r12.AGu(r7);
                Object obj9 = this.A02;
                boolean AGu4 = AGu3 | r12.AGu(obj9);
                Object ECw5 = r12.ECw();
                if (AGu4 || ECw5 == obj8) {
                    ECw5 = new JGF(4, r7, obj9);
                    r12.FLL(ECw5);
                }
                AnonymousClass6ID.A00(r12, modifier, r8, (0sL) ECw5, 8, 0);
                if (0fL.A02()) {
                    0fL.A00(1009371908);
                    break;
                }
                break;
            case 1:
                Context context = (Context) obj6;
                AnonymousClass3TO r122 = (AnonymousClass3TO) obj5;
                C245853da r5 = (C245853da) obj4;
                0qQ.A0B(context, 0);
                0qQ.A0B(r122, 1);
                0qQ.A0B(r5, 2);
                return ((AnonymousClass4U7) this.A04).A02.A01(context, (1Xj) this.A01, (AnonymousClass4DU) this.A03, (AnonymousClass3W1) this.A02, r5, r122);
            case 2:
                C267064at r62 = (C267064at) obj6;
                AnonymousClass3W1 r123 = (AnonymousClass3W1) obj5;
                0xF r52 = (0xF) obj4;
                0qQ.A0B(r62, 0);
                0qQ.A0B(r123, 1);
                1Xj r4 = (1Xj) this.A02;
                r62.A07(new AnonymousClass52N(r4, (C242923Ws) this.A04, r123));
                r62.A04 = r4;
                r62.A05 = r123;
                r62.A07 = ((AnonymousClass3YB) this.A01).A02;
                AnonymousClass3W1 r3 = (AnonymousClass3W1) this.A03;
                0xF r2 = new 0xF();
                if (r52 != null) {
                    r2.A0C(0j8.A03(r52));
                }
                if (r4.A0C.getMezqlToken() != null) {
                    0xF.A00(r2, r4.A0C.getMezqlToken(), "mezql_token");
                }
                if (r4.A0C.getLoggingInfoToken() != null) {
                    0xF.A00(r2, r4.A0C.getLoggingInfoToken(), "ranking_info_token");
                }
                if (r4.A0C.getConnectionId() != null) {
                    0xF.A00(r2, r4.A0C.getConnectionId(), AnonymousClass000.A00(1214));
                }
                int i = r3.A0W;
                if (i >= 0) {
                    0xF.A00(r2, Integer.valueOf(i), "recs_ix");
                }
                if (r3.getPosition() >= 0) {
                    0xF.A00(r2, Integer.valueOf(r3.getPosition()), "m_ix");
                }
                r62.A03 = r2;
                break;
            default:
                Context context2 = (Context) obj6;
                0qQ.A0B(context2, 0);
                C246393eW r53 = C246393eW.A00;
                UserSession userSession = ((C245813dW) this.A04).A00;
                1Xj r82 = (1Xj) this.A02;
                AnonymousClass3W1 r11 = (AnonymousClass3W1) this.A03;
                return r53.A00(context2, userSession, r82, r82, (AnonymousClass4DU) this.A01, r11, (AnonymousClass3VA) obj5);
        }
        return C60340gF.A00;
    }
}
