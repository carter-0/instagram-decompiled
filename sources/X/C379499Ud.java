package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.9Ud  reason: invalid class name and case insensitive filesystem */
public final class C379499Ud implements Runnable {
    public final /* synthetic */ AnonymousClass91N A00;
    public final /* synthetic */ Integer A01;

    public C379499Ud(AnonymousClass91N r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public final void run() {
        EditText editText = this.A00.A02;
        editText.onPreDraw();
        Editable text = editText.getText();
        AnonymousClass9UR.A03(editText.getLayout(), text, this.A01, editText.getTextSize());
    }
}
