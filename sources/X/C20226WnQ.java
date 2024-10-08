package X;

import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.WnQ  reason: case insensitive filesystem */
public final class C20226WnQ implements Runnable {
    public final /* synthetic */ IgdsCheckBox A00;
    public final /* synthetic */ boolean A01;

    public C20226WnQ(IgdsCheckBox igdsCheckBox, boolean z) {
        this.A00 = igdsCheckBox;
        this.A01 = z;
    }

    public final void run() {
        this.A00.setChecked(this.A01);
    }
}
