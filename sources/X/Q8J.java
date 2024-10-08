package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.Collections;

public final class Q8J extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public Q8J(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        Long l;
        int i = this.A00;
        Context context = (Context) this.A01;
        if (i == 0) {
            UserSession userSession = (UserSession) this.A02;
            QKY qky = new QKY(context, userSession, "LITE_CHECKOUT");
            String str = this.A04;
            String str2 = this.A03;
            0Aj A0e = AnonymousClass7TE.A0e(qky.A0C(), "user_click_shopslitecheckouteligibility_atomic");
            if (A0e.isSampled()) {
                0bb r4 = new 0bb();
                r4.A06("checkout_flow", "checkout_init");
                r4.A06("external_session_id", qky.A02);
                r4.A06("navigation_chain", qky.A01);
                if (str2 != null) {
                    l = DbV.A0q(str2);
                } else {
                    l = null;
                }
                r4.A05("ad_id", l);
                r4.A06("iaw_session_id", str);
                QKY.A01(r4, qky);
                A0e.AAJ(Pxz.A00(9, 10, 87), "");
                Pxh.A18(2M7.A0G, A0e);
                0bb r1 = new 0bb();
                Pxe.A1T(r1, "lite_checkout");
                Pxe.A1S(r1, "lite_checkout");
                Pxe.A1Q(A0e, r1);
                A0e.AAK(r4, "custom_fields");
                A0e.Cgf();
            }
            C49940FFt fFt = new C49940FFt();
            fFt.A00 = EX7.ANIMATED_WHILE_LOADING;
            fFt.A02 = C46627Di7.DISABLED;
            C46471DfZ A032 = fFt.A03();
            C49672F1e f1e = new C49672F1e(userSession);
            IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
            igBloksScreenConfig.A0R = "com.bloks.www.bloks.commerce.lite.checkout.disclaimer";
            f1e.A00(A032);
            C46649DiU.A06("com.bloks.www.bloks.commerce.lite.checkout.disclaimer", DbY.A0m(AnonymousClass000.A00(187), JTQ.A0c(Dbb.A0e("ad_id", str2, AnonymousClass7TE.A1L("iaw_session_id", str)))), Collections.emptyMap()).A0F(context, igBloksScreenConfig);
        } else if (context != null) {
            SUL sul = new SUL(context, (UserSession) this.A02, 2EG.A46, this.A03, false);
            sul.A0S = this.A04;
            sul.A0A();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        int color;
        if (this.A00 != 0) {
            0qQ.A0B(textPaint, 0);
            super.updateDrawState(textPaint);
            color = textPaint.linkColor;
        } else {
            0qQ.A0B(textPaint, 0);
            Context context = (Context) this.A01;
            if (context != null) {
                color = context.getColor(R.color.igds_link);
            }
            textPaint.setUnderlineText(false);
        }
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }
}
