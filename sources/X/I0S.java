package X;

public final class I0S {
    public static final I0S A00 = new Object();

    public final void A00(C286575Wy r10, C62320sa r11, int i, boolean z) {
        int i2;
        C62320sa r7 = r11;
        0qQ.A0B(r11, 0);
        r10.ExV(186292424);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r11) | i;
        } else {
            i2 = i;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r10, z);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1899919892, "com.instagram.direct.inbox.ui.conversationstartersmenu.FloatingActionButton.FloatingActionButton (FloatingActionButton.kt:43)");
            }
            if (C51975G9x.A1T(r10, new J7Q(r11, "Conversation_Starters_Floating_Action_Button", 3, z), 467586890)) {
                0fL.A00(-1026190340);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 14, this, r7, z2);
        }
    }
}
