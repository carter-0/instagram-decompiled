package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.Joy  reason: case insensitive filesystem */
public final class C60651Joy extends C249703kE {
    public C381919cn A00;
    public final EditText A01;
    public final L0K A02;
    public final View.OnFocusChangeListener A03;
    public final LWQ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60651Joy(EditText editText, L0K l0k) {
        super(editText);
        0qQ.A0B(editText, 1);
        this.A01 = editText;
        this.A02 = l0k;
        LWQ lwq = new LWQ(this);
        this.A04 = lwq;
        LYN lyn = new LYN(this, 3);
        this.A03 = lyn;
        editText.addTextChangedListener(lwq);
        editText.setOnFocusChangeListener(lyn);
        editText.setOnEditorActionListener(new LZR(this, 1));
    }
}
