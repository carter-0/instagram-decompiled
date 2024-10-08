package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class EEK extends C252233om {
    public TextView.OnEditorActionListener A00;
    public G8C A01;
    public ProgressButton A02;
    public Integer A03;
    public TextView A04;
    public 0lg A05;
    public boolean A06;
    public boolean A07;
    public final TextWatcher A08;
    public final TextView.OnEditorActionListener A09;

    public final void A00() {
        this.A06 = false;
        A02();
        this.A01.ARL();
    }

    public final void A01() {
        this.A06 = true;
        A02();
        this.A01.APF();
    }

    public final void onDestroyView() {
        this.A04 = null;
        this.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2.A01.Ca3() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            boolean r0 = r2.A06
            r1.setShowProgressBar(r0)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0014
            X.G8C r0 = r2.A01
            boolean r0 = r0.Ca3()
            r1 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A02
            r0.setEnabled(r1)
            X.G8C r0 = r2.A01
            r0.DaH(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEK.A02():void");
    }

    public final void A03(boolean z) {
        String str;
        G8C g8c = this.A01;
        g8c.DUM();
        if (this.A07 && !(g8c instanceof E59)) {
            C49881FBf fBf = C49881FBf.A00;
            0lg r3 = this.A05;
            C46634DiE BzS = g8c.BzS();
            if (BzS != null) {
                str = BzS.A01;
            } else {
                str = null;
            }
            EXD B6Y = g8c.B6Y();
            Integer num = this.A03;
            Boolean valueOf = Boolean.valueOf(z);
            0qQ.A0B(r3, 0);
            fBf.A01(r3, B6Y, valueOf, (Boolean) null, num, str, (String) null);
        }
    }

    public final void D6z(View view) {
        FP2.A00(this.A02, 33, this);
        TextView textView = this.A04;
        if (textView != null) {
            TextView.OnEditorActionListener onEditorActionListener = this.A00;
            if (onEditorActionListener == null) {
                onEditorActionListener = this.A09;
            }
            textView.setOnEditorActionListener(onEditorActionListener);
        }
    }

    public final void onPause() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.removeTextChangedListener(this.A08);
        }
    }

    public final void onResume() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.addTextChangedListener(this.A08);
        }
        A02();
    }

    public EEK(TextView textView, 0lg r4, G8C g8c, ProgressButton progressButton, int i) {
        this.A07 = true;
        this.A09 = new FQe(this, 15);
        this.A08 = new C48054ESy(this, 16);
        this.A05 = r4;
        this.A01 = g8c;
        this.A04 = textView;
        this.A02 = progressButton;
        progressButton.setText(i);
        this.A02.setEnabled(false);
        this.A01.DaH(false);
    }

    public EEK(TextView textView, 0lg r8, G8C g8c, ProgressButton progressButton) {
        this(textView, r8, g8c, progressButton, 2131968361);
    }
}
