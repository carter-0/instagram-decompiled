package X;

import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.8P0  reason: invalid class name */
public final class AnonymousClass8P0 implements AnonymousClass8GH {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8P0(C355048Oj r1) {
        this.A00 = r1;
    }

    public final boolean D26() {
        AnonymousClass8BA r3 = this.A00.A0q.A00;
        if (!r3.A14.A01.A0J) {
            AnonymousClass8BA.A0F(r3, true);
            return true;
        }
        27r A01 = 27p.A01(r3.A0v);
        C59725JVj jVj = A01.A04.A0C;
        if (!(A01.A0J() == null || jVj == null)) {
            A01.A1Q(jVj, "STORY_BACKGROUND_COLOR");
        }
        C40317AaC aaC = (C40317AaC) r3.A1b.get();
        aaC.A03.A06(aaC);
        aaC.A04.DV9(aaC);
        EyedropperColorPickerTool eyedropperColorPickerTool = aaC.A07;
        if (eyedropperColorPickerTool != null) {
            if (aaC.A01) {
                eyedropperColorPickerTool.setColor(-1);
            } else {
                eyedropperColorPickerTool.setColor(aaC.A00.A01()[0]);
            }
        }
        C40317AaC.A03(aaC, true);
        return true;
    }
}
