package X;

import android.content.Context;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6MC  reason: invalid class name */
public final class AnonymousClass6MC extends AnonymousClass6MD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Context A04;
    public final C255773uh A05;
    public final AnonymousClass6M6 A06;
    public final AnonymousClass6MA A07;
    public final MediaFrameLayout A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6MC(Context context, C255773uh r5, AnonymousClass6M6 r6, AnonymousClass6MA r7, MediaFrameLayout mediaFrameLayout, boolean z, boolean z2) {
        super(r6, AnonymousClass6ME.A04);
        int i;
        int i2;
        int A0l;
        String str;
        int i3;
        String str2;
        0qQ.A0B(context, 1);
        0qQ.A0B(mediaFrameLayout, 2);
        0qQ.A0B(r6, 3);
        this.A04 = context;
        this.A08 = mediaFrameLayout;
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
        this.A09 = z2;
        if (z2) {
            i = r6.A07;
        } else {
            i = this.A02;
        }
        this.A02 = i;
        if (z2) {
            i2 = r6.A07;
        } else {
            i2 = this.A00;
        }
        this.A00 = i2;
        if (z) {
            1Xj r1 = r5.A0b;
            r1.getClass();
            A0l = (int) (((float) r6.A09) / r1.A0l());
            AnonymousClass6LR A1x = r1.A1x();
            if (!(A1x == null || (((str = A1x.A06) == null || str.length() == 0) && ((str2 = A1x.A05) == null || str2.length() == 0)))) {
                if (this.A09) {
                    i3 = r6.A06;
                } else {
                    i3 = r6.A08;
                }
                A0l += i3;
            }
        } else {
            float A002 = (float) AnonymousClass6M6.A00(context);
            1Xj r0 = this.A05.A0b;
            r0.getClass();
            A0l = (int) (A002 / r0.A0l());
        }
        this.A01 = A0l;
        this.A03 = AnonymousClass6M6.A00(this.A04);
    }
}
