package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public final class WFL implements C20993X8p {
    public final AlertDialog.Builder A00;
    public final /* synthetic */ Context A01;

    public final C20993X8p Ee4(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.setNegativeButton(charSequence, (DialogInterface.OnClickListener) null);
        return this;
    }

    public WFL(Context context) {
        this.A01 = context;
        this.A00 = new AlertDialog.Builder(context);
    }

    public final Dialog AKr() {
        return this.A00.create();
    }

    public final C20993X8p EdL(CharSequence charSequence) {
        this.A00.setMessage(charSequence);
        return this;
    }

    public final C20993X8p EgC(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.setPositiveButton(charSequence, onClickListener);
        return this;
    }

    public final C20993X8p Eok(CharSequence charSequence) {
        this.A00.setTitle(charSequence);
        return this;
    }
}
