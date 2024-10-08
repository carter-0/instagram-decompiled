package X;

import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.M9a  reason: case insensitive filesystem */
public final class C66041M9a implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ IgTextView A02;
    public final /* synthetic */ CharSequence A03;

    public C66041M9a(IgTextView igTextView, CharSequence charSequence, float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = igTextView;
        this.A03 = charSequence;
    }

    public final void run() {
        if (this.A01 > this.A00) {
            this.A02.setMaxLines(1);
        }
        CharSequence charSequence = this.A03;
        int length = charSequence.length();
        int i = 0;
        IgTextView igTextView = this.A02;
        if (length > 0) {
            igTextView.setText(charSequence);
            if (igTextView.getLineCount() > 1) {
                igTextView.setMaxLines(2);
            }
        } else {
            i = 8;
        }
        igTextView.setVisibility(i);
    }
}
