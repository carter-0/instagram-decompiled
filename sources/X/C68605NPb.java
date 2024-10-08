package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NPb  reason: case insensitive filesystem */
public final class C68605NPb extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67943MxT(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_scheduled_message_text, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        C68207N5w n5w = (C68207N5w) r10;
        C67943MxT mxT = (C67943MxT) r11;
        boolean A1U = AnonymousClass7TF.A1U(0, n5w, mxT);
        C254703su r7 = n5w.A04;
        Long l = r7.A1Q;
        if (l != null) {
            long longValue = l.longValue();
            IgTextView igTextView = mxT.A01;
            igTextView.setText(r7.A1q);
            igTextView.setTextColor(n5w.A00);
            igTextView.setBackground(n5w.A01);
            igTextView.setOnLongClickListener(n5w.A02);
            igTextView.setOnTouchListener(new AnonymousClass76R(new C67675MsB(A1U ? 1 : 0, n5w, mxT), JTO.A0F(mxT), igTextView, A1U));
            IgTextView igTextView2 = mxT.A00;
            Context context = igTextView2.getContext();
            C328637Fo r8 = n5w.A03;
            if (!(r8 == C328637Fo.GROUP_WITH_BOTH || r8 == C328637Fo.GROUP_WITH_ABOVE)) {
                Calendar calendar = C14240TsN.A02;
                0qQ.A0A(context);
                String A00 = C69937Nud.A00(context, TimeUnit.SECONDS.toMillis(longValue));
                if (r7.A0P() != null) {
                    A00 = DbV.A0u(context, context.getString(2131972673), A00, 2131964456);
                }
                if (n5w.A05) {
                    A00 = DbV.A0u(context, A00, context.getString(2131961937), 2131964456);
                    JTS.A0u(context, igTextView2, R.attr.igds_color_error_or_destructive);
                }
                igTextView2.setText(A00);
                igTextView2.setVisibility(0);
            }
            igTextView.post(new PVR(mxT));
        }
    }

    public final Class modelClass() {
        return C68207N5w.class;
    }
}
