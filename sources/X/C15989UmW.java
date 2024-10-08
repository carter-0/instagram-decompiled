package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.UmW  reason: case insensitive filesystem */
public final class C15989UmW extends IgdsSwitch {
    public boolean A00;

    public void setChecked(boolean z) {
        if (this.A00 && isChecked() != z) {
            this.A00 = false;
            super.setChecked(z);
        }
    }

    public final void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.A00 = true;
    }
}
