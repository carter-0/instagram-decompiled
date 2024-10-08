package X;

import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.AaB  reason: case insensitive filesystem */
public final class C40316AaB implements AnonymousClass8LV, AnonymousClass89Y {
    public final AnonymousClass8BQ A00;
    public final AnonymousClass88K A01;
    public final C314446iH A02;
    public final EyedropperColorPickerTool A03;
    public final C352038Bl A04;
    public final 0sP A05;

    public C40316AaB(AnonymousClass8BQ r2, AnonymousClass88K r3, C314446iH r4, C352038Bl r5, EyedropperColorPickerTool eyedropperColorPickerTool, 0sP r7) {
        AnonymousClass7TG.A0w(2, r2, eyedropperColorPickerTool, r3);
        0qQ.A0B(r5, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = eyedropperColorPickerTool;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r5;
    }

    public final /* synthetic */ void DDq() {
    }

    public final /* synthetic */ void DDt() {
    }

    public final /* synthetic */ void DDu() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public final void DDs(int i) {
        this.A05.invoke(Integer.valueOf(i));
    }

    public final boolean onBackPressed() {
        this.A01.A09.remove(this);
        this.A00.A02(false);
        AnonymousClass7TE.A1U(this.A03, false);
        this.A02.D48(this);
        return true;
    }
}
