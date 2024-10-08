package X;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7oK  reason: invalid class name and case insensitive filesystem */
public final class C342277oK extends C255963v0 {
    public AnonymousClass8DT A00;
    public Interpolator A01 = new LinearInterpolator();
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06 = 2;
    public final List A07;

    public final void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        ReboundViewPager reboundViewPager2 = reboundViewPager;
        0qQ.A0B(reboundViewPager2, 0);
        View view2 = view;
        0qQ.A0B(view2, 1);
        float abs = Math.abs(f);
        int i2 = (int) abs;
        float f2 = (float) i2;
        int i3 = i2 + 1;
        if (f2 == abs) {
            i3 = i2;
        }
        List list = this.A07;
        if (i3 >= list.size()) {
            view2.setScaleX(0.0f);
            view2.setScaleY(0.0f);
            view2.setVisibility(8);
            return;
        }
        C342267oJ r1 = (C342267oJ) list.get(i2);
        C342267oJ r0 = (C342267oJ) list.get(i3);
        float interpolation = this.A01.getInterpolation(abs - f2);
        float f3 = r1.A01;
        float f4 = r0.A01;
        float A042 = (float) AnonymousClass37Q.A04((double) interpolation, 0.0d, 1.0d, (double) Math.min(f3, f4), (double) Math.max(f3, f4));
        float f5 = 1.0f;
        if (f < 0.0f) {
            f5 = -1.0f;
        }
        float f6 = A042 * f5;
        float f7 = r1.A02;
        float f8 = r0.A02;
        double d = (double) (1.0f - interpolation);
        float A043 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) Math.min(f7, f8), (double) Math.max(f7, f8));
        float f9 = r1.A00;
        float f10 = r0.A00;
        float A044 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) Math.min(f9, f10), (double) Math.max(f9, f10));
        float f11 = this.A05;
        float f12 = 1.0f;
        if (reboundViewPager2.A0S()) {
            f12 = -1.0f;
        }
        float f13 = f6 + (f11 * f12);
        float f14 = this.A02 / 2.0f;
        float f15 = 1.0f;
        if (reboundViewPager2.A0S()) {
            f15 = -1.0f;
        }
        view2.setTranslationX(f13 - (f15 * f14));
        view2.setTranslationY((this.A04 + this.A03) - f14);
        view2.setAlpha(A044);
        view2.setScaleX(A043);
        view2.setScaleY(A043);
        int i4 = 0;
        if (A043 == 0.0f) {
            i4 = 8;
        }
        view2.setVisibility(i4);
        AnonymousClass8DT r6 = this.A00;
        if (r6 != null) {
            Object tag = view2.getTag();
            if (tag != null) {
                C370978xN r5 = (C370978xN) tag;
                AnonymousClass87G r02 = r5.A01;
                if (r02 != null && r02.A04 == AnonymousClass87I.EMPTY) {
                    String str = r6.A05;
                    if ("pre_capture".equals(str)) {
                        AnonymousClass8DS r12 = r6.A04;
                        float f16 = 0.0f;
                        if (!r12.Es7()) {
                            f16 = 1.0f;
                        } else if (i != 0 || f < 0.0f) {
                            if (abs > 1.0f) {
                                abs = 1.0f;
                            }
                            f16 = abs;
                        }
                        r12.B0v().setAlpha((int) (f16 * 255.0f));
                    } else if (!"post_capture".equals(str) && !"clip_transition".equals(str)) {
                        return;
                    }
                    r5.A00();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean FHR(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    public final int AVk(ReboundViewPager reboundViewPager, float f) {
        int i = reboundViewPager.A07;
        int i2 = 1;
        float f2 = (float) i;
        if (!reboundViewPager.A0S() ? f >= f2 : f <= f2) {
            i2 = 0;
        }
        return (i - 2) - i2;
    }

    public final int CfQ(ReboundViewPager reboundViewPager, float f) {
        int i = reboundViewPager.A07;
        int i2 = 1;
        float f2 = (float) i;
        if (!reboundViewPager.A0S() ? f <= f2 : f >= f2) {
            i2 = 0;
        }
        return i + 2 + i2;
    }

    public C342277oK(C342267oJ[] r6, float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A04 = f4;
        this.A05 = f2 / 2.0f;
        this.A03 = (f3 - f4) / 2.0f;
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        arrayList.add(new C342267oJ(0.0f, 1.0f, 1.0f));
        arrayList.addAll(0sr.A1P(Arrays.copyOf(r6, 2)));
        arrayList.add(new C342267oJ(r6[1].A01, 0.0f, 0.0f));
    }
}
