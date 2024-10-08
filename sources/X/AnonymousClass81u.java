package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.81u  reason: invalid class name */
public final class AnonymousClass81u implements C252203oj {
    public final /* synthetic */ C3497781s A00;

    public final void DmB(2cs r1) {
    }

    public AnonymousClass81u(C3497781s r1) {
        this.A00 = r1;
    }

    public final void DmC(2cs r9) {
        double d = r9.A09.A00;
        if (d == 1.0d) {
            C3497781s r7 = this.A00;
            double width = ((double) (r7.A00 * 2)) + (((double) ((C3497981v) r7.BOi()).getView().getWidth()) * 0.5d);
            View view = ((C3497981v) r7.A0O).getView();
            ViewGroup viewGroup = r7.A0L;
            viewGroup.setLayoutParams(new LinearLayout.LayoutParams((int) (width + (((double) view.getWidth()) * 0.5d)), viewGroup.getHeight()));
            ((C3497981v) r7.BOi()).getView().setTranslationX(0.0f);
            view.setTranslationX(0.0f);
        } else if (d == 0.0d) {
            ((C3497981v) this.A00.BOi()).Eql(false, false);
        }
    }

    public final void DmD(2cs r7) {
        C3497781s r5 = this.A00;
        if (r5.A00 == -1) {
            View view = r5.A0I;
            r5.A00 = (int) (((double) (((float) (view.getWidth() - (r5.A0F * 2))) - ((float) view.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen)))) * 0.06667999999999999d);
        }
        double d = r7.A09.A00;
        if (d == 0.0d) {
            ((C3497981v) r5.BOi()).Eql(true, false);
        } else if (d == 1.0d) {
            View view2 = ((C3497981v) r5.A0O).getView();
            int width = view2.getWidth();
            ViewGroup viewGroup = r5.A0L;
            viewGroup.setLayoutParams(new LinearLayout.LayoutParams(width, viewGroup.getHeight()));
            C3498081w BOi = r5.BOi();
            ((C3497981v) BOi).getView().setTranslationX((float) r5.A00);
            view2.setTranslationX((float) (-r5.A00));
        }
    }

    public final void DmE(2cs r5) {
        float f = (float) r5.A09.A00;
        C3497781s r2 = this.A00;
        float f2 = ((float) r2.A00) * f;
        ((C3497981v) r2.BOi()).getView().setTranslationX(f2);
        ((C3497981v) r2.A0O).getView().setTranslationX(-f2);
        r2.BOi().EOX(Math.max(Math.min(1.0f, f), 0.0f));
    }
}
