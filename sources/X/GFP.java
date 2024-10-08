package X;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicReference;

public abstract class GFP implements C252293os {
    public Timer A00;
    public final AtomicReference A01 = new AtomicReference((Object) null);

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public void DVx(int i, int i2) {
        Timer timer = this.A00;
        if (timer != null) {
            timer.cancel();
        }
        this.A01.set(AnonymousClass7TF.A0x(Integer.valueOf(i), i2));
        Timer timer2 = new Timer();
        timer2.schedule(new C58048Ikg(this), 150);
        this.A00 = timer2;
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r10, float f, float f2) {
        int intValue;
        int intValue2;
        1Xj r2;
        1Xj r1;
        String str;
        String str2;
        String str3;
        String str4;
        if (this instanceof GFO) {
            GFO gfo = (GFO) this;
            0qQ.A0B(r10, 2);
            AnonymousClass3W1 r12 = gfo.A0I;
            if (r12.A01 != f) {
                r12.A01 = f;
                AnonymousClass3W1.A00(r12, 68);
            }
            if (r10 != r12.A0i) {
                r12.A0i = r10;
                AnonymousClass3W1.A00(r12, 16);
            }
            Drawable drawable = null;
            if (gfo.A0D()) {
                ReboundViewPager reboundViewPager = gfo.A03;
                if (reboundViewPager != null) {
                    Integer valueOf = Integer.valueOf(reboundViewPager.A09);
                    Integer valueOf2 = Integer.valueOf(reboundViewPager.A0A);
                    if (valueOf != null && valueOf2 != null && (intValue = valueOf.intValue()) >= 0 && (intValue2 = valueOf2.intValue()) >= 0) {
                        List list = gfo.A0J;
                        if (list != null) {
                            r1 = DbZ.A0T(list, intValue % gfo.A03());
                            r2 = DbZ.A0T(list, intValue2 % gfo.A03());
                            if (r1 != null) {
                                str = r1.A2Y();
                            }
                            str = null;
                        } else {
                            r1 = null;
                            r2 = null;
                            str = null;
                        }
                        Integer A0D = 0nH.A0D(str);
                        if (r1 != null) {
                            str2 = r1.A2X();
                        } else {
                            str2 = null;
                        }
                        Integer A0D2 = 0nH.A0D(str2);
                        if (r2 != null) {
                            str3 = r2.A2Y();
                        } else {
                            str3 = null;
                        }
                        Integer A0D3 = 0nH.A0D(str3);
                        if (r2 != null) {
                            str4 = r2.A2X();
                        } else {
                            str4 = null;
                        }
                        Integer A0D4 = 0nH.A0D(str4);
                        if (A0D2 != null && A0D != null && A0D3 != null && A0D4 != null) {
                            float A002 = AnonymousClass7TE.A00(f, (float) intValue);
                            AnonymousClass0eM r22 = gfo.A0L;
                            int A04 = DbW.A04(((ArgbEvaluator) r22.getValue()).evaluate(A002, A0D, A0D3), "null cannot be cast to non-null type kotlin.Int");
                            int A042 = DbW.A04(((ArgbEvaluator) r22.getValue()).evaluate(A002, A0D2, A0D4), "null cannot be cast to non-null type kotlin.Int");
                            ReboundViewPager reboundViewPager2 = gfo.A03;
                            if (reboundViewPager2 != null) {
                                drawable = reboundViewPager2.getBackground();
                            }
                            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                            if (gradientDrawable == null) {
                                ReboundViewPager reboundViewPager3 = gfo.A03;
                                if (reboundViewPager3 != null) {
                                    reboundViewPager3.setBackground(C51970G9q.A0O(GradientDrawable.Orientation.TOP_BOTTOM, A04, A042));
                                    return;
                                }
                                return;
                            }
                            gradientDrawable.setColors(new int[]{A04, A042});
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ReboundViewPager reboundViewPager4 = gfo.A03;
            if (reboundViewPager4 != null) {
                reboundViewPager4.setBackground((Drawable) null);
            }
        }
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
        if (this instanceof GFO) {
            GFO gfo = (GFO) this;
            C51967G9n.A1B(gfo.A0B, true);
            gfo.A08();
            gfo.A0I.A2X = true;
            gfo.A04().Ckn(AnonymousClass05K.A01, i, i2);
        }
    }
}
