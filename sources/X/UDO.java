package X;

import android.view.View;
import android.widget.EditText;
import com.instagram.android.R;

public final class UDO extends C249703kE {
    public final EditText A00;
    public final 0sP A01;
    public final 0sP A02;
    public final View A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDO(View view, 0sP r6, 0sP r7) {
        super(view);
        DbZ.A0t(1, view, r6, r7);
        this.A01 = r6;
        this.A02 = r7;
        EditText editText = (EditText) AnonymousClass7TF.A0F(view, R.id.muted_word_edit_text);
        this.A00 = editText;
        View A0G = AnonymousClass7TF.A0G(view, R.id.muted_word_delete_button);
        this.A03 = A0G;
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        editText.setOnEditorActionListener(new WDC(this, 5));
        editText.setOnFocusChangeListener(new WBI(this, 5));
        WB8.A00(A0G, 47, this);
    }
}
