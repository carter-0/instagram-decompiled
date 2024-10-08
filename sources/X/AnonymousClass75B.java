package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.75B  reason: invalid class name */
public abstract class AnonymousClass75B {
    public static final C231672s5 A00 = AnonymousClass75G.A00;
    public static final C231672s5 A01 = AnonymousClass75F.A00;
    public static final AnonymousClass75D A02 = new AnonymousClass75E();
    public static final AnonymousClass75D A03 = new AnonymousClass75C();

    public static final void A00(IgImageView igImageView, int i) {
        C231672s5 r0;
        AnonymousClass75D r02;
        C226642hc r1 = igImageView.A0I;
        if (r1 instanceof AnonymousClass77D) {
            AnonymousClass77D r12 = (AnonymousClass77D) r1;
            if (i == 0) {
                r02 = null;
            } else if (i != 1) {
                r02 = A02;
            } else {
                r02 = A03;
            }
            r12.A01 = r02;
            return;
        }
        if (i == 0) {
            r0 = null;
        } else if (i != 1) {
            r0 = A00;
        } else {
            r0 = A01;
        }
        igImageView.A0I = r0;
    }
}
