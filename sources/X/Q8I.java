package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Q8I extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Q8I(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        LinkedHashMap linkedHashMap;
        switch (this.A00) {
            case 0:
                C8121QhD qhD = (C8121QhD) this.A02;
                Intent intent = qhD.A02.getIntent();
                if (intent == null || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_LOGGING_ENABLED", true)) {
                    Map map = qhD.A01;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put("TARGET_NAME", "OFFSITE_FOOTER_DISCLAIMER_CLICK");
                    } else {
                        linkedHashMap = null;
                    }
                    C8902REu rEu = C8902REu.USER_CLICK_OFFSITEDISCLAIMER_ATOMIC;
                    if (linkedHashMap == null) {
                        linkedHashMap = 0Yt.A0E();
                    }
                    C11418SSt.A03(rEu, linkedHashMap);
                }
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) qhD.A04);
                Q6J q6j = qhD.A00;
                if (q6j != null) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    HashMap A1E2 = AnonymousClass7TE.A1E();
                    HashMap A1E3 = AnonymousClass7TE.A1E();
                    new BitSet(0);
                    C46649DiU A06 = C46649DiU.A06("com.bloks.www.metacheckout.disclaimer.learnmore", C359608dC.A01(A1E), A1E2);
                    C46649DiU.A0B(A06, 719983200);
                    A06.A03 = null;
                    A06.A02 = null;
                    A06.A04 = null;
                    A06.A0H(A1E3);
                    A06.A0E(q6j, igBloksScreenConfig);
                    return;
                }
                return;
            case 1:
            case 2:
                ((JPP) this.A01).D2j((1Xj) this.A02);
                return;
            case 3:
                0qQ.A0B(view, 0);
                View.OnClickListener onClickListener = (View.OnClickListener) this.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                0qQ.A0B(view, 0);
                ((GHV) this.A02).A09.invoke(this.A01, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(textPaint, 0);
                textPaint.setColor(AnonymousClass2E0.A0A().A03((Context) this.A01, 5));
                textPaint.setUnderlineText(false);
                return;
            case 1:
            case 2:
                0qQ.A0B(textPaint, 0);
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                return;
            case 3:
                0qQ.A0B(textPaint, 0);
                textPaint.setUnderlineText(false);
                textPaint.setColor(((Context) this.A02).getColor(R.color.baseline_neutral_80));
                return;
            case 4:
                0qQ.A0B(textPaint, 0);
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
