package X;

/* renamed from: X.HFa  reason: case insensitive filesystem */
public final class C54472HFa extends C262934Go {
    public final /* synthetic */ GBE A00;

    public final void Dx6(C61065Jw3 jw3) {
        String str;
        String str2;
        0qQ.A0B(jw3, 0);
        int i = jw3.A00;
        if (i == 1) {
            str = "swipe_up";
        } else if (i != 2) {
            str = "swipe_vertical";
        } else {
            str = "swipe_down";
        }
        int i2 = jw3.A01;
        if (i2 == 1) {
            str2 = "dismiss";
        } else if (i2 != 2) {
            str2 = "anchored";
        } else {
            str2 = "fullscreen";
        }
        GBE gbe = this.A00;
        ((C52030GCc) gbe.A1b.getValue()).A05(gbe.A1L.A02(), str, str2);
    }

    public C54472HFa(GBE gbe) {
        this.A00 = gbe;
    }

    public final void DHB(Integer num) {
        this.A00.A1K.A0N((C267324bN) null, "fragment_paused", false, true);
    }
}
