package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public final class WFK implements C20993X8p {
    public final C358248ab A00;

    public final C20993X8p EdL(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A00.A0q(charSequence);
        return this;
    }

    public final C20993X8p Ee4(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A00.A0b((DialogInterface.OnClickListener) null, charSequence.toString());
        return this;
    }

    public final C20993X8p EgC(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A00.A0c(onClickListener, charSequence.toString());
        return this;
    }

    public final C20993X8p Eok(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A00.A05 = charSequence.toString();
        return this;
    }

    public final Dialog AKr() {
        return this.A00.A02();
    }

    public WFK(Context context) {
        this.A00 = new C358248ab(context);
    }
}
