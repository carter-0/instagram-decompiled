package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VhD  reason: case insensitive filesystem */
public final class C17860VhD {
    public final Context A00;
    public final LinearLayout A01;
    public final ReelDashboardFragment A02;
    public final List A03 = new ArrayList();

    public final void A00(C249693kD r16) {
        int i;
        Drawable drawable;
        C249693kD r12 = r16;
        C19471WaJ A012 = C265894Ws.A01(r12);
        A012.getClass();
        List list = A012.A02.A0C;
        int A002 = A012.A00();
        if (list != null) {
            int size = list.size();
            Context context = this.A00;
            LayoutInflater from = LayoutInflater.from(context);
            LinearLayout linearLayout = this.A01;
            int childCount = size - linearLayout.getChildCount();
            int i2 = -childCount;
            if (childCount >= 0) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View inflate = from.inflate(R.layout.reel_dashboard_quiz_summary_answer_row, linearLayout, false);
                    this.A03.add(new C17634VbQ(inflate, this.A02));
                    linearLayout.addView(inflate);
                }
            } else {
                for (int i4 = 0; i4 < i2; i4++) {
                    linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                    List list2 = this.A03;
                    list2.remove(C51966G9m.A06(list2));
                }
            }
            int i5 = 0;
            while (true) {
                List list3 = this.A03;
                if (i5 < list3.size()) {
                    String str = context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i5];
                    C17634VbQ vbQ = (C17634VbQ) list3.get(i5);
                    C21026XAf xAf = (C21026XAf) list.get(i5);
                    boolean A1S = AnonymousClass7TF.A1S(i5, A002);
                    if (xAf.Arb() != null) {
                        i = xAf.Arb().intValue();
                    } else {
                        i = 0;
                    }
                    AnonymousClass0fU.A00(new FO4(vbQ, i, r12, i5, 2), vbQ.A01);
                    vbQ.A04.setText(xAf.getText());
                    vbQ.A03.setText(0mp.A06("%d", AnonymousClass7TF.A1b(i)));
                    if (A1S) {
                        Context context2 = vbQ.A00;
                        Drawable drawable2 = context2.getDrawable(R.drawable.instagram_circle_check_filled_16);
                        DbX.A11(context2, drawable2.mutate(), R.color.igds_active_badge);
                        drawable = drawable2;
                    } else {
                        C306386Ly r2 = vbQ.A05;
                        r2.A0M(str);
                        drawable = r2;
                    }
                    vbQ.A02.setImageDrawable(drawable);
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public C17860VhD(View view, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = view.getContext();
        this.A02 = reelDashboardFragment;
        this.A01 = (LinearLayout) view;
    }
}
