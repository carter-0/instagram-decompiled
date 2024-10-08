package X;

import android.text.Layout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.M8w  reason: case insensitive filesystem */
public final class C66037M8w implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ CharSequence A01;
    public final /* synthetic */ String A02;

    public C66037M8w(IgTextView igTextView, CharSequence charSequence, String str) {
        this.A02 = str;
        this.A00 = igTextView;
        this.A01 = charSequence;
    }

    public final void run() {
        float f;
        String A19 = AnonymousClass7TE.A19(new 11S("\\s+").A03(DbV.A12(this.A02)), 0);
        IgTextView igTextView = this.A00;
        float measureText = igTextView.getPaint().measureText(A19);
        Layout layout = igTextView.getLayout();
        if (layout != null) {
            f = (float) layout.getWidth();
        } else {
            f = measureText;
        }
        igTextView.post(new C66041M9a(igTextView, this.A01, measureText, f));
    }
}
