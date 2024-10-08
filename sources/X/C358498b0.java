package X;

import android.view.View;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.8b0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C358498b0 implements View.OnClickListener {
    public final /* synthetic */ C358368an A00;

    public /* synthetic */ C358498b0(C358368an r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        ConstrainedEditText constrainedEditText = this.A00.A1j;
        if (!constrainedEditText.getText().subSequence(0, constrainedEditText.getSelectionEnd()).toString().matches("^.*?@\\S*$")) {
            if (constrainedEditText.getSelectionEnd() <= 0 || Character.isWhitespace(constrainedEditText.getText().toString().charAt(constrainedEditText.getSelectionEnd() - 1))) {
                str = "@";
            } else {
                str = " @";
            }
            constrainedEditText.getText().insert(constrainedEditText.getSelectionEnd(), str);
        }
    }
}
