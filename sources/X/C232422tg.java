package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.2tg  reason: invalid class name and case insensitive filesystem */
public final class C232422tg extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C230582pr A03;
    public final C228232l0 A04;
    public final C249763kK A05;
    public final C230662pz A06;
    public final boolean A07;

    public C232422tg(Context context, AnonymousClass0iw r5, UserSession userSession, C230582pr r7, C228232l0 r8, C249763kK r9, C230662pz r10) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r9, 3);
        0qQ.A0B(r7, 5);
        0qQ.A0B(r10, 6);
        0qQ.A0B(r8, 7);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = r9;
        this.A01 = r5;
        this.A03 = r7;
        this.A06 = r10;
        this.A04 = r8;
        this.A07 = 182.A06(0Tu.A05, userSession, 36320567032357502L);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C275544qW r11;
        IgImageView igImageView;
        IgImageView igImageView2;
        List Abw;
        IgLinearLayout igLinearLayout;
        String C2B;
        List list;
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(2110356307);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj3, 2);
        C57282IVr iVr = (C57282IVr) obj3;
        UserSession userSession = this.A02;
        C249763kK r6 = this.A05;
        IL3 il3 = new IL3(this.A01, userSession, iVr, this.A04, r6);
        C230582pr r13 = this.A03;
        C230602pt r12 = r13.A01;
        r12.A00 = il3;
        C230612pu r112 = r13.A06;
        r112.A00 = il3;
        Context context = this.A00;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.afi.ui.AfiViewBinder.Holder");
        C17696VcR vcR = (C17696VcR) tag;
        C230662pz r62 = this.A06;
        boolean z = this.A07;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(vcR, 2);
        0qQ.A0B(iVr, 3);
        0qQ.A0B(r62, 6);
        View view3 = vcR.A00;
        Object obj4 = new Object();
        String A002 = C230582pr.A00(iVr);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r02 = new C2354830a(iVr, obj4, A002);
        r02.A00(r12);
        r02.A00(r112);
        r13.A00.A05(view3, r02.A01());
        C53278GlQ glQ = iVr.A06.A01;
        if (glQ == null || (list = glQ.A04) == null) {
            r11 = null;
        } else {
            r11 = (C275544qW) 00k.A0J(list);
        }
        1Xj r30 = iVr.A02;
        AnonymousClass3W1 r3 = iVr.A03;
        Integer num = iVr.A04;
        IgTextView igTextView = vcR.A04;
        String str = null;
        if (r11 != null) {
            str = r11.getText();
        }
        igTextView.setText(str);
        if (r11 == null || (C2B = r11.C2B()) == null || C2B.length() == 0) {
            vcR.A05.setVisibility(8);
        } else {
            IgTextView igTextView2 = vcR.A05;
            igTextView2.setVisibility(0);
            igTextView2.setText(r11.C2B());
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
        if (!(drawable == null || r11 == null || (Abw = r11.Abw()) == null || Abw.size() < 2)) {
            C275524qU r122 = (C275524qU) 00k.A0O(Abw, 0);
            C275524qU r2 = (C275524qU) 00k.A0O(Abw, 1);
            IgLinearLayout igLinearLayout2 = vcR.A02;
            if (igLinearLayout2 == null || (igLinearLayout = vcR.A03) == null) {
                Context context2 = context;
                IL3 il32 = il3;
                C275524qU r19 = r122;
                C53278GlQ glQ2 = glQ;
                C56653I6i.A01(context2, drawable, il32, r19, glQ2, userSession, r30, r3, vcR.A09, r62, num, C273654mx.A00(3494), z);
                C56653I6i.A01(context, drawable, il3, r2, glQ, userSession, r30, r3, vcR.A0A, r62, num, C273654mx.A00(2153), z);
            } else {
                UserSession userSession2 = userSession;
                1Xj r23 = r30;
                AnonymousClass3W1 r24 = r3;
                C230662pz r25 = r62;
                Integer num2 = num;
                int A012 = (int) (((double) (AnonymousClass0nB.A01(context) / 2)) * 0.8d);
                Context context3 = context;
                IL3 il33 = il3;
                C53278GlQ glQ3 = glQ;
                C56653I6i.A00(context3, drawable, il33, r122, glQ3, userSession2, igLinearLayout2, r23, r24, r25, num2, "x_pano_outline_16", A012);
                C56653I6i.A00(context3, drawable, il33, r2, glQ3, userSession2, igLinearLayout, r23, r24, r25, num2, "check_pano_outline_16", A012);
            }
        }
        AnonymousClass0fU.A00(new IBU(il3, r3, r62), vcR.A08);
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36314670042974974L)) {
            igImageView = vcR.A07;
            igImageView.setVisibility(0);
            vcR.A06.setVisibility(8);
            ConstraintLayout constraintLayout = vcR.A01;
            Drawable drawable2 = context.getDrawable(R.drawable.rounded_afi_ini_background_prism_fix);
            RectF rectF = 0nA.A01;
            0qQ.A0B(constraintLayout, 0);
            constraintLayout.setBackground(drawable2);
        } else {
            igImageView = vcR.A06;
            if (!(igImageView == null || (igImageView2 = vcR.A07) == null)) {
                igImageView.setVisibility(0);
                igImageView2.setVisibility(8);
            }
        }
        if (182.A06(r4, userSession, 36314670043040511L)) {
            int A0H = 2Yu.A0H(context, R.attr.igds_color_stroke);
            0nA.A0K(context, vcR.A01, A0H);
            igImageView.setColorFilter(context.getColor(A0H));
        }
        AnonymousClass0fD.A0A(-1401329030, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1665793026);
        0qQ.A0B(viewGroup, 1);
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 1);
        Context context = viewGroup.getContext();
        boolean A062 = 182.A06(0Tu.A05, userSession, 36314670042909437L);
        int i2 = R.layout.afi_view_v2;
        if (A062) {
            i2 = R.layout.afi_view_prism_fix_segmented_pill;
        }
        View inflate = LayoutInflater.from(context).inflate(i2, viewGroup, false);
        0qQ.A0A(inflate);
        inflate.setTag(new C17696VcR(inflate, A062));
        AnonymousClass0fD.A0A(-1084065916, A032);
        return inflate;
    }
}
