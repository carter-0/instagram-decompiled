package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class LEV {
    public final void A00(AnonymousClass0iw r8, M0V m0v, MVX mvx, C60687JpY jpY, boolean z) {
        boolean A1Z = AnonymousClass7TG.A1Z(jpY, m0v);
        String str = m0v.A0D;
        if (str != null) {
            A01(m0v, mvx, jpY, str);
            User user = m0v.A08;
            if (user != null) {
                jpY.A0A.setUrl(user.Bh3(), r8);
            }
            if (m0v.A0H) {
                GradientSpinner gradientSpinner = jpY.A0B;
                gradientSpinner.A02();
                gradientSpinner.setGradientColors((int) R.style.OrangePurpleGradientPatternStyle);
                gradientSpinner.setVisibility(0);
            }
            jpY.A03.setVisibility(0);
            TextView textView = jpY.A08;
            textView.setVisibility(0);
            User user2 = m0v.A08;
            if (user2 != null) {
                DbU.A1H(textView, user2);
            }
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            Context A0S = AnonymousClass7TE.A0S(textView);
            L9P l9p = jpY.A0C;
            0qQ.A0B(l9p, A1Z ? 1 : 0);
            User user3 = m0v.A08;
            if (user3 != null && user3.isVerified()) {
                l9p.A04.setVisibility(0);
            }
            LiveUserPaySupportTier liveUserPaySupportTier = m0v.A06;
            if (liveUserPaySupportTier != null) {
                LKL.A01(A0S, l9p.A02, l9p.A00, liveUserPaySupportTier, m0v.A01);
            }
            if (z) {
                l9p.A03.setVisibility(0);
                l9p.A01.setVisibility(0);
            }
            View view = jpY.A01;
            view.setVisibility(8);
            view.setSelected(z);
            LY7.A00(view, 66, m0v, mvx);
            if (z) {
                C63562KzB.A00.post(new M9G(m0v, mvx, jpY));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A01(MVW mvw, MVX mvx, C60687JpY jpY, CharSequence charSequence) {
        jpY.A00();
        jpY.A07.setText(charSequence);
        View view = jpY.A04;
        view.setAlpha(1.0f);
        List A1P = 0sr.A1P(new View[]{jpY.A05, jpY.A02, jpY.A03, view});
        C64285LYl lYl = new C64285LYl(mvw, mvx, jpY);
        Iterator it = A1P.iterator();
        while (it.hasNext()) {
            JTO.A0H(it).setOnTouchListener(lYl);
        }
    }
}
