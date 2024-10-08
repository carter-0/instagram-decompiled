package X;

import android.widget.EditText;

/* renamed from: X.Iax  reason: case insensitive filesystem */
public final class C57453Iax implements X7D {
    public final /* synthetic */ C57106IOu A00;

    public C57453Iax(C57106IOu iOu) {
        this.A00 = iOu;
    }

    public final void DC3() {
        C57106IOu iOu = this.A00;
        C57106IOu.A00(iOu).A02(true, true);
        EditText editText = iOu.A07;
        editText.setSelection(editText.getText().length());
    }

    public final void onStart() {
        C57106IOu.A00(this.A00).A02(true, false);
    }
}
