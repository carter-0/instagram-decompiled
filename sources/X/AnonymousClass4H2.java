package X;

import com.instagram.tagging.widget.MediaTagHintsLayout;

/* renamed from: X.4H2  reason: invalid class name */
public abstract class AnonymousClass4H2 {
    public static final void A00(AnonymousClass3W1 r3, AnonymousClass3VC r4, boolean z) {
        0qQ.A0B(r3, 0);
        MediaTagHintsLayout mediaTagHintsLayout = r4.A02;
        mediaTagHintsLayout.A01();
        mediaTagHintsLayout.A02(r3.A07(r4.A00, -1), z);
    }

    public static final void A01(AnonymousClass50X r6, AnonymousClass3VC r7, boolean z) {
        0qQ.A0B(r6, 0);
        AnonymousClass3W1 r2 = r6.A01;
        int i = r6.A00;
        AnonymousClass47M A07 = r2.A07(i, -1);
        if (r6.A03) {
            A07.A05 = true;
            MediaTagHintsLayout mediaTagHintsLayout = r7.A02;
            mediaTagHintsLayout.A01();
            mediaTagHintsLayout.A02(A07, false);
        } else if (r2 != r7.A01 || r2.A03 != r7.A00) {
            MediaTagHintsLayout mediaTagHintsLayout2 = r7.A02;
            mediaTagHintsLayout2.setTags(r6.A02);
            mediaTagHintsLayout2.A01();
            AnonymousClass3W1 r1 = r7.A01;
            if (r1 != null) {
                r1.A0M(r7, Integer.valueOf(r7.A00), true);
            }
            r7.A00 = i;
            r7.A01 = r2;
            r2.A0L(r7, Integer.valueOf(i), true);
            if (z) {
                r7.A00();
            }
        }
    }
}
