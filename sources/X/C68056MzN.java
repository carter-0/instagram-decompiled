package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.MzN  reason: case insensitive filesystem */
public abstract class C68056MzN extends C249703kE {
    public Integer A00;
    public C61065Jw3 A01;
    public final View A02;
    public final C61065Jw3[] A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68056MzN(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x0028
            android.content.Context r0 = r4.getContext()
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r0)
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r2.addView(r4, r0)
        L_0x0014:
            r3.<init>(r2)
            r3.A02 = r4
            r0 = 3
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r0)
            int r0 = r0.length
            X.Jw3[] r0 = new X.C61065Jw3[r0]
            r3.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A00 = r0
            return
        L_0x0028:
            r2 = r4
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68056MzN.<init>(android.view.View, boolean):void");
    }

    private final void A00() {
        int i;
        Integer num;
        C52860Gdt gdt;
        int i2;
        0fh.A01("GridItemViewHolder.updateRoundedCorner", 725901927);
        try {
            C61065Jw3[] jw3Arr = this.A03;
            int length = jw3Arr.length - 1;
            int i3 = length;
            int i4 = 0;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    C61065Jw3 jw3 = jw3Arr[length];
                    if (jw3 == null) {
                        if (i5 < 0) {
                            break;
                        }
                        length = i5;
                    } else {
                        i = jw3.A00;
                        num = (Integer) jw3.A02;
                        while (true) {
                            int i6 = i3 - 1;
                            C61065Jw3 jw32 = jw3Arr[i3];
                            if (jw32 == null || (i2 = jw32.A01) == -1) {
                                if (i6 < 0) {
                                    break;
                                }
                                i3 = i6;
                            } else {
                                i4 = i2;
                                break;
                            }
                        }
                    }
                }
            }
            i = -1;
            num = AnonymousClass05K.A0C;
            C61065Jw3 jw33 = new C61065Jw3(num, i4, i, 2);
            if (!jw33.equals(this.A01)) {
                this.A01 = jw33;
                Integer num2 = (Integer) jw33.A02;
                int i7 = jw33.A01;
                int i8 = jw33.A00;
                NE7 ne7 = (NE7) this;
                0qQ.A0B(num2, 0);
                if (ne7.A02) {
                    View view = ne7.A01.A03;
                    if (num2 == AnonymousClass05K.A01) {
                        float f = (float) i7;
                        if (f > 0.0f) {
                            C67644MrX mrX = ne7.A00;
                            if (mrX == null || mrX.A01 != i7) {
                                view.setForeground((Drawable) null);
                                ne7.A00 = null;
                            }
                            if (f == 0.0f) {
                                gdt = null;
                            } else {
                                gdt = new C52860Gdt(f, 1);
                            }
                            view.setOutlineProvider(gdt);
                            view.setClipToOutline(true);
                        }
                    }
                    if (num2 != AnonymousClass05K.A00 || ((float) i7) <= 0.0f) {
                        if (ne7.A00 != null) {
                            ne7.A00 = null;
                            view.setForeground((Drawable) null);
                        }
                        if (view.getOutlineProvider() != null) {
                            view.setOutlineProvider((ViewOutlineProvider) null);
                            view.setClipToOutline(false);
                        }
                    } else {
                        view.setOutlineProvider((ViewOutlineProvider) null);
                        view.setClipToOutline(false);
                        if (i8 != -1) {
                            C67644MrX mrX2 = ne7.A00;
                            if (mrX2 == null || mrX2.A01 != i7 || mrX2.A00 != i8) {
                                C67644MrX mrX3 = new C67644MrX(i7, i8);
                                ne7.A00 = mrX3;
                                view.setForeground(mrX3);
                            }
                        }
                    }
                }
            }
        } finally {
            0fh.A00(-259116533);
        }
    }

    public final void A01(Integer num) {
        char c;
        0fh.A01("GridItemViewHolder.unApplyRoundedCorner", -2080576701);
        try {
            C61065Jw3[] jw3Arr = this.A03;
            switch (num.intValue()) {
                case 0:
                    c = 0;
                    break;
                case 1:
                    c = 1;
                    break;
                default:
                    c = 2;
                    break;
            }
            if (jw3Arr[c] != null) {
                jw3Arr[c] = null;
                A00();
            }
        } finally {
            0fh.A00(1925666905);
        }
    }

    public final void A02(Integer num, Integer num2, int i, int i2) {
        char c;
        0fh.A01("GridItemViewHolder.applyRoundedCorner", -759206031);
        try {
            C61065Jw3[] jw3Arr = this.A03;
            switch (num2.intValue()) {
                case 0:
                    c = 0;
                    break;
                case 1:
                    c = 1;
                    break;
                default:
                    c = 2;
                    break;
            }
            C61065Jw3 jw3 = jw3Arr[c];
            if (!(jw3 != null && ((Integer) jw3.A02) == num && jw3.A01 == i && jw3.A00 == i2)) {
                jw3Arr[c] = new C61065Jw3(num, i, i2, 2);
                A00();
            }
        } finally {
            0fh.A00(625592737);
        }
    }
}
