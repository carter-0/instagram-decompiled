package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.UeZ  reason: case insensitive filesystem */
public final class C15545UeZ extends C231632rz {
    public 1Xj A00;
    public final C55802Hni A01;
    public final AnonymousClass0iw A02;
    public final 0MB A03;
    public final C17809VgM A04;

    public C15545UeZ(Context context, C55802Hni hni, AnonymousClass0iw r4, 0MB r5, C20989X8f x8f) {
        0qQ.A0B(r5, 3);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = hni;
        this.A04 = new C17809VgM(context, x8f);
    }

    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        float f;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-845572667);
        View view2 = view;
        AnonymousClass7TF.A1B(view2, 1, obj4);
        0qQ.A0B(obj3, 3);
        1Xj r1 = this.A00;
        int i3 = i;
        if (r1 != null) {
            C247733gp r0 = (C247733gp) obj4;
            r0.A02(r1);
            C55802Hni hni = this.A01;
            hni.A01.A05(view2, hni.A02.A00(002.A04(i3, "::", r0.A0G)));
        }
        if (i == 0 || i3 == 1) {
            C17809VgM vgM = this.A04;
            Object tag = view2.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.limitedprofile.adapter.LimitedCommentRowViewBinder.Holder");
            V46 v46 = (V46) tag;
            C247733gp r10 = (C247733gp) obj4;
            C17298VPz vPz = (C17298VPz) obj3;
            0MB r11 = this.A03;
            AnonymousClass0iw r5 = this.A02;
            0qQ.A0B(v46, 0);
            AnonymousClass7TF.A1B(r10, 1, vPz);
            AnonymousClass7TF.A1D(r11, 3, r5);
            User user = r10.A08;
            v46.A08 = r10;
            v46.A09 = vPz;
            Context context = vgM.A00;
            View view3 = v46.A01;
            if (vPz.A00) {
                i2 = 2Yu.A0H(context, R.attr.selectedCommentBackground);
            } else {
                i2 = R.color.direct_widget_primary_background;
            }
            view3.setBackgroundResource(i2);
            IgTextView igTextView = v46.A06;
            User user2 = r10.A08;
            if (user2 != null) {
                igTextView.setContentDescription(DbV.A0u(igTextView.getContext(), user2.getUsername(), r10.A0d, 2131972498));
            }
            DbX.A1G(igTextView, r11.A0D(igTextView.getContext(), new C252933pw((0rN) null, r10, (AnonymousClass3W1) null, (1sy) null, (AnonymousClass34A) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (List) null, false, true, false, false, true, false, false, false, false, false, false, false, false, false)));
            TextView textView = v46.A05;
            String str = 1G0.A07(context, r10.A03).toString();
            if (str.length() > 0) {
                textView.setText(str);
                textView.setVisibility(0);
                textView.setContentDescription(1G0.A03(context, (double) r10.A03));
            } else {
                textView.setVisibility(8);
            }
            if (user != null) {
                IgImageView igImageView = v46.A07;
                DbU.A1S(r5, igImageView, user);
                igImageView.setContentDescription(DbY.A0b(context, user, 2131963112));
            }
            ? r12 = v46.A07;
            2eS.A01(r12);
            r12.setImportantForAccessibility(1);
            AnonymousClass0fU.A00(new C18858W9w(1, vgM, r5, user), r12);
            View view4 = v46.A02;
            WC3.A00(view4, 18, new GestureDetector(view4.getContext(), new C380299Xl(3, r10, vgM)));
            if (!r10.A0k || r10.A0P) {
                v46.A03.setVisibility(8);
                v46.A04.setVisibility(8);
                f = 1.0f;
            } else {
                TextView textView2 = v46.A03;
                textView2.setVisibility(0);
                WBE.A00(textView2, 38, r10, vgM);
                TextView textView3 = v46.A04;
                textView3.setVisibility(0);
                WBE.A00(textView3, 39, r10, vgM);
                f = 0.4f;
            }
            ? r13 = v46.A07;
            if (!(f == r13.getAlpha() && f == v46.A06.getAlpha())) {
                r13.setAlpha(f);
                v46.A06.setAlpha(f);
            }
        }
        AnonymousClass0fD.A0A(-602288116, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        C247733gp r7 = (C247733gp) obj;
        AnonymousClass7TG.A1N(r6, r7);
        boolean A1V = AnonymousClass7TF.A1V(r7.A0F);
        r6.A7U(A1V ? 1 : 0);
        C55802Hni hni = this.A01;
        C17206VMk vMk = new C17206VMk();
        String A042 = 002.A04(A1V, "::", r7.A0G);
        C2354830a A002 = AnonymousClass30Y.A00(r7, vMk, A042);
        A002.A00(hni.A00);
        A002.A00(hni.A03);
        hni.A02.A01(A002.A01(), A042);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A002;
        int A032 = AnonymousClass0fD.A03(-2063441893);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A002 = this.A04.A00(viewGroup, false);
        } else if (i == 1) {
            A002 = this.A04.A00(viewGroup, true);
        } else {
            IllegalArgumentException A0a = DbW.A0a(C273654mx.A00(28), i);
            AnonymousClass0fD.A0A(1418342512, A032);
            throw A0a;
        }
        AnonymousClass0fD.A0A(-1241442149, A032);
        return A002;
    }
}
