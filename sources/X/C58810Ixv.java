package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;

/* renamed from: X.Ixv  reason: case insensitive filesystem */
public final class C58810Ixv extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58810Ixv(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A06 = obj4;
        this.A07 = obj5;
        this.A04 = obj6;
        this.A05 = obj7;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Class<?> cls;
        int width;
        int height;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                2WE r1 = (2WE) obj2;
                0qQ.A0B(r1, 0);
                r1.A01 = true;
                C244463bE r5 = (C244463bE) this.A06;
                C337927h8 r2 = (C337927h8) this.A07;
                r5.A00 = r2.A0D;
                String A002 = AnonymousClass000.A00(3847);
                Object obj3 = this.A01;
                try {
                    r1.A00 = 00R.A03(A002, 127);
                    JGF.A01(r1, obj3, r2, new Object[]{r2.A0C, obj3}, 20);
                    r1.A00 = null;
                    String A003 = AnonymousClass000.A00(3849);
                    2Wa r8 = (2Wa) this.A02;
                    try {
                        r1.A00 = 00R.A03(A003, 127);
                        Object obj4 = r8.A03;
                        Boolean valueOf = Boolean.valueOf(r2.A0E);
                        Boolean valueOf2 = Boolean.valueOf(r2.A0H);
                        Integer valueOf3 = Integer.valueOf(r2.A01);
                        Integer valueOf4 = Integer.valueOf(r2.A06);
                        Integer valueOf5 = Integer.valueOf(r2.A05);
                        Boolean valueOf6 = Boolean.valueOf(r2.A0G);
                        Boolean valueOf7 = Boolean.valueOf(r2.A0I);
                        Boolean valueOf8 = Boolean.valueOf(r2.A0O);
                        Integer valueOf9 = Integer.valueOf(r2.A00);
                        Integer valueOf10 = Integer.valueOf(r2.A04);
                        AnonymousClass3AS r6 = r2.A07;
                        if (r6 != null) {
                            cls = r6.getClass();
                        } else {
                            cls = null;
                        }
                        JGF.A01(r1, r5, r2, new Object[]{obj4, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, 0, valueOf6, null, valueOf7, valueOf8, valueOf9, null, valueOf10, cls}, 21);
                        r1.A00 = null;
                        try {
                            r1.A00 = 00R.A03("recycler-binder", 127);
                            C59344JFw.A00(r1, r2, new Object[]{r2.A0A}, 29);
                            r1.A00 = null;
                            String A004 = AnonymousClass000.A00(3848);
                            Object obj5 = this.A03;
                            Object obj6 = this.A04;
                            Object obj7 = this.A05;
                            try {
                                r1.A00 = 00R.A03(A004, 127);
                                r1.A02(new C59137J7t(2, r2, obj5, obj7, obj6), C51970G9q.A1b());
                                r1.A00 = null;
                                break;
                            } catch (Throwable th) {
                                r1.A00 = null;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            r1.A00 = null;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        r1.A00 = null;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    r1.A00 = null;
                    throw th4;
                }
            case 1:
                C305006Gb A0L = C51968G9o.A0L(obj2);
                List list = (List) this.A05;
                Object obj8 = this.A06;
                Object obj9 = this.A07;
                Object obj10 = this.A03;
                Object obj11 = this.A01;
                Object obj12 = this.A02;
                Object obj13 = this.A04;
                C58968J1f j1f = C58968J1f.A00;
                C51971G9r.A10(A0L, new C59437JJm(1, obj9, obj8, obj11, obj12, obj10, list, obj13), new C66312MMv(5, j1f, list), list.size());
                break;
            case 2:
                2WE A0f = C51968G9o.A0f(obj2);
                Object obj14 = this.A06;
                C59345JFx.A00(A0f, obj14, new Object[]{obj14}, 4);
                Object obj15 = this.A02;
                C59345JFx.A00(A0f, obj15, new Object[]{obj15}, 5);
                Object obj16 = this.A07;
                C59345JFx.A00(A0f, obj16, new Object[]{obj16}, 6);
                Object obj17 = this.A04;
                C59345JFx.A00(A0f, obj17, new Object[]{obj17}, 7);
                Object obj18 = this.A03;
                C59345JFx.A00(A0f, obj18, new Object[]{obj18}, 8);
                Object obj19 = this.A05;
                C59345JFx.A00(A0f, obj19, new Object[]{obj19}, 9);
                Object obj20 = this.A01;
                C59345JFx.A00(A0f, obj20, new Object[]{obj20}, 10);
                break;
            case 3:
                Point point = (Point) obj2;
                0qQ.A0B(point, 0);
                View view = (View) this.A01;
                boolean z = view instanceof RoundedCornerImageView;
                int i = point.x;
                if (z) {
                    width = ((Context) this.A02).getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
                } else {
                    width = view.getWidth();
                }
                int i2 = i - (width / 2);
                int i3 = point.y;
                if (z) {
                    height = ((Context) this.A02).getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
                } else {
                    height = view.getHeight();
                }
                ((C309866Zx) this.A03).DSZ((View) this.A06, view, (C255773uh) this.A04, (C250973mM) this.A07, (C309426Yf) this.A05, C273654mx.A00(3370), C273654mx.A00(3174), i2, i3 - (height / 2));
                break;
            case 4:
                Context A0L2 = C51969G9p.A0L(this.A06);
                C243673Zt r82 = (C243673Zt) this.A07;
                2V5 r7 = (2V5) this.A05;
                int A022 = DbW.A02(1, r82, r7);
                float dimension = A0L2.getResources().getDimension(R.dimen.album_preview_add_item_margin);
                C51973G9u.A18(r82);
                float[] fArr = new float[A022];
                fArr[0] = dimension / 2.0f;
                fArr[1] = (-dimension) / 2.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(800);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                C51970G9q.A11(new I84(r7, 29), ofFloat, r82);
                C56372HxQ.A01((2V5) this.A03, (C243673Zt) this.A04, 400);
                C56372HxQ.A01((2V5) this.A01, (C243673Zt) this.A02, 100);
                break;
            default:
                C243673Zt r72 = (C243673Zt) this.A06;
                float dimension2 = ((C53904GwA) this.A07).A00.getResources().getDimension(R.dimen.album_preview_add_item_margin);
                C51973G9u.A18(r72);
                float[] A1b = C51965G9l.A1b();
                A1b[0] = dimension2 / 2.0f;
                A1b[1] = (-dimension2) / 2.0f;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(A1b);
                ofFloat2.setDuration(800);
                ofFloat2.setInterpolator(new DecelerateInterpolator());
                C51970G9q.A11(new I84((2V5) this.A05, 37), ofFloat2, r72);
                C53904GwA.A00((2V5) this.A03, (C243673Zt) this.A04, 400);
                C53904GwA.A00((2V5) this.A01, (C243673Zt) this.A02, 100);
                break;
        }
        return C60340gF.A00;
    }
}
