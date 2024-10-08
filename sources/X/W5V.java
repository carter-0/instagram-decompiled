package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class W5V implements DialogInterface.OnClickListener, X9Y {
    public C14729U5o A00;
    public CharSequence A01;
    public ListAdapter A02;
    public final /* synthetic */ U5e A03;

    public final Drawable Aeg() {
        return null;
    }

    public final int BDk() {
        return 0;
    }

    public final int CDm() {
        return 0;
    }

    public W5V(U5e u5e) {
        this.A03 = u5e;
    }

    public final CharSequence BDe() {
        return this.A01;
    }

    public final boolean Cc6() {
        C14729U5o u5o = this.A00;
        if (u5o != null) {
            return u5o.isShowing();
        }
        return false;
    }

    public final void ENu(ListAdapter listAdapter) {
        this.A02 = listAdapter;
    }

    public final void EPV(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void EZI(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final void EZJ(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public final void EhJ(CharSequence charSequence) {
        this.A01 = charSequence;
    }

    public final void Eq2(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void Etl(int i, int i2) {
        if (this.A02 != null) {
            U5e u5e = this.A03;
            C18080Vl9 vl9 = new C18080Vl9(u5e.A04);
            CharSequence charSequence = this.A01;
            if (charSequence != null) {
                vl9.A08(charSequence);
            }
            ListAdapter listAdapter = this.A02;
            int selectedItemPosition = u5e.getSelectedItemPosition();
            C17742VdB vdB = vl9.A01;
            vdB.A0B = listAdapter;
            vdB.A03 = this;
            vdB.A00 = selectedItemPosition;
            vdB.A0I = true;
            C14729U5o A002 = vl9.A00();
            this.A00 = A002;
            ListView listView = A002.A00.A0I;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            AnonymousClass0fN.A00(this.A00);
        }
    }

    public final void dismiss() {
        C14729U5o u5o = this.A00;
        if (u5o != null) {
            u5o.dismiss();
            this.A00 = null;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        U5e u5e = this.A03;
        u5e.setSelection(i);
        if (u5e.getOnItemClickListener() != null) {
            u5e.performItemClick((View) null, i, this.A02.getItemId(i));
        }
        dismiss();
    }
}
