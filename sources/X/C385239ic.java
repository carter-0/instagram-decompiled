package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.9ic  reason: invalid class name and case insensitive filesystem */
public final class C385239ic extends C231632rz {
    public final int A00;
    public final int A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass7Q6 A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C385239ic(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7Q6 r3, int i, int i2) {
        this.A03 = userSession;
        this.A02 = r1;
        this.A04 = r3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(1908225761);
        Object tag = view.getTag();
        tag.getClass();
        C39696A5m a5m = (C39696A5m) tag;
        UserSession userSession = this.A03;
        AnonymousClass0iw r4 = this.A02;
        C3251571g r11 = (C3251571g) obj;
        AnonymousClass7Q6 r3 = this.A04;
        int i2 = 0;
        while (true) {
            View[] viewArr = a5m.A01;
            if (i2 < viewArr.length) {
                Object tag2 = viewArr[i2].getTag();
                tag2.getClass();
                C337057fc r1 = (C337057fc) tag2;
                if (i2 < r11.A01()) {
                    Object A022 = r11.A02(i2);
                    A022.getClass();
                    C337077fe.A02(r4, userSession, (C317486nL) A022, r3, r1);
                } else {
                    C337077fe.A04(r1);
                }
                i2++;
            } else {
                AnonymousClass0fD.A0A(384026622, A032);
                return;
            }
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-701085111);
        int i2 = this.A01;
        int i3 = this.A00;
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        viewGroup2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, AnonymousClass7TG.A05(context));
        C39696A5m a5m = new C39696A5m(viewGroup2, i2);
        for (int i4 = 0; i4 < i2; i4++) {
            IgFrameLayout A012 = C337077fe.A01(context, i3, AnonymousClass7TF.A1T(i4, i2 - 1));
            a5m.A01[i4] = A012;
            viewGroup2.addView(A012);
        }
        viewGroup2.setTag(a5m);
        AnonymousClass0fD.A0A(60785046, A032);
        return viewGroup2;
    }
}
