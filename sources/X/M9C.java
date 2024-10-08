package X;

import com.instagram.tagging.widget.MediaTagHintsLayout;

public final class M9C implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ MediaTagHintsLayout A02;

    public M9C(AnonymousClass3W1 r1, MediaTagHintsLayout mediaTagHintsLayout, int i) {
        this.A02 = mediaTagHintsLayout;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass3W1 r3 = this.A01;
        int i = this.A00;
        boolean A002 = MediaTagHintsLayout.A00(r3, i);
        MediaTagHintsLayout mediaTagHintsLayout = this.A02;
        if (!A002) {
            mediaTagHintsLayout.A02.getClass();
            mediaTagHintsLayout.A02(r3.A07(i, -1), true);
        }
        Runnable runnable = mediaTagHintsLayout.A03;
        if (runnable != null) {
            mediaTagHintsLayout.A05.removeCallbacks(runnable);
            mediaTagHintsLayout.A03 = null;
        }
    }
}
