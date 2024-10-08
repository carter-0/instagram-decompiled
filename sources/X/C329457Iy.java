package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.7Iy  reason: invalid class name and case insensitive filesystem */
public final class C329457Iy implements C329367Ip, C329377Iq {
    public C329467Iz A00 = C329467Iz.CLOSED;
    public C355148Ov A01;
    public 0sL A02 = AnonymousClass7J0.A00;
    public boolean A03;
    public final UserSession A04;
    public final AnonymousClass7IM A05;
    public final AnonymousClass7IO A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C377229La(this, 22));
    public final AnonymousClass0eM A08;

    public static final void A00(C329467Iz r6, C329457Iy r7) {
        C329467Iz r0 = r7.A00;
        if (r0 != r6) {
            r7.A00 = r6;
            0eP r4 = new 0eP(r0, r6);
            C329467Iz r5 = C329467Iz.TYPING;
            C329467Iz r62 = C329467Iz.CLOSED;
            if (r4.equals(new 0eP(r5, r62))) {
                A01(r7, false);
                return;
            }
            C329467Iz r2 = C329467Iz.EXPANDED;
            if (r4.equals(new 0eP(r2, r62))) {
                A01(r7, true);
            } else if (r4.equals(new 0eP(r62, r2))) {
                r7.A02(true);
            } else if (r4.equals(new 0eP(r5, r2))) {
                r7.A02(false);
            } else if (r4.equals(new 0eP(new Object(), r5))) {
                A01(r7, false);
                C355148Ov r02 = r7.A01;
                if (r02 != null && r02.isShowing()) {
                    A01(r7, false);
                    C355148Ov r03 = r7.A01;
                    if (r03 != null) {
                        r03.dismiss();
                    }
                }
            }
        }
    }

    public static final void A01(C329457Iy r3, boolean z) {
        View view = (View) r3.A07.getValue();
        if (view != null) {
            C294975nL A012 = C294975nL.A01(view, 0);
            if (z) {
                A012.A0G();
                A012.A0O(view.getRotation(), 0.0f);
                A012.A0H();
                return;
            }
            A012.A0G();
            view.setRotation(0.0f);
        }
    }

    private final void A02(boolean z) {
        View contentView;
        View view = (View) this.A07.getValue();
        if (view != null) {
            C355148Ov r7 = this.A01;
            C294975nL A012 = C294975nL.A01(view, 0);
            if (z) {
                A012.A0G();
                A012.A0O(view.getRotation(), 45.0f);
                A012.A0H();
            } else {
                A012.A0G();
                view.setRotation(45.0f);
            }
            if (r7 != null && (contentView = r7.getContentView()) != null) {
                contentView.measure(0, 0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Resources resources = view.getResources();
                r7.showAtLocation(view, 0, (iArr[0] - contentView.getMeasuredWidth()) + view.getMeasuredWidth(), (iArr[1] - contentView.getMeasuredHeight()) - ((int) (resources.getDimension(R.dimen.abc_control_corner_material) * resources.getDisplayMetrics().density)));
                C294975nL A013 = C294975nL.A01(contentView, 1);
                A013.A0G();
                C294975nL A0D = A013.A0C(450).A0D(new OvershootInterpolator(1.7f));
                A0D.A0M(0.0f, 1.0f);
                A0D.A0U(0.0f, 0.95f, (float) contentView.getMeasuredWidth());
                A0D.A0V(0.0f, 0.95f, (float) contentView.getMeasuredHeight());
                A0D.A0S(35.0f, -5.0f);
                A0D.A05 = new PQD(contentView);
                A0D.A0H();
            }
        }
    }

    public final ColorFilterAlphaImageView BZe() {
        return (ColorFilterAlphaImageView) this.A07.getValue();
    }

    public final void FMQ(boolean z) {
        View view = (View) this.A07.getValue();
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        this.A05.A00(AnonymousClass7JU.RIGHT_INSET, AnonymousClass7JT.PLUS, z);
    }

    public C329457Iy(View view, UserSession userSession, AnonymousClass7IM r5, AnonymousClass7IO r6) {
        this.A04 = userSession;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = AnonymousClass1YB.A00(new C377479Lz(33, view, this));
        A01(this, false);
        View view2 = (View) this.A07.getValue();
        if (view2 != null) {
            AnonymousClass0fU.A00(new AnonymousClass7J2(this), view2);
        }
    }

    public final void ADc(0sL r1) {
        this.A02 = r1;
    }
}
