package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NLd  reason: case insensitive filesystem */
public final class C68506NLd extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74585PxY A03;
    public final XAH A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C68506NLd(Context context, AnonymousClass0iw r3, UserSession userSession, C74585PxY pxY, XAH xah, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(xah, 5);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = pxY;
        this.A04 = xah;
        this.A0B = z;
        this.A07 = 0mk.A02(context);
        this.A0C = z2;
        this.A0D = z3;
        this.A0A = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A06 = str;
        this.A05 = num;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C51973G9u.A1E(r2, obj, obj2);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int A032 = AnonymousClass0fD.A03(1513633431);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0C(obj4, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
        C66967Mg0 mg0 = (C66967Mg0) obj4;
        C67430Mnl mnl = C67437Mns.A00;
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r14 = this.A01;
        0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.search.common.model.UserSearchEntry");
        C66632Ma1 ma1 = (C66632Ma1) obj3;
        C74585PxY pxY = this.A03;
        XAH xah = this.A04;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.UserRowViewBinder.Holder");
        C67431Mnm mnm = (C67431Mnm) tag;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        boolean z3 = this.A0D;
        boolean z4 = false;
        boolean A1S = AnonymousClass7TF.A1S(i, 1);
        if (mg0.A0F) {
            z4 = true;
        }
        boolean z5 = this.A09;
        String str = this.A06;
        Integer num = this.A05;
        Integer num2 = num;
        String str2 = str;
        mnl.A03((Activity) null, context, r14, userSession, mg0, ma1, (C66974Mg7) null, pxY, mnm, new C67432Mnn(DbT.A0j(userSession), num2, str2, z, z2, z3, A1S, z4, z5, false, false, this.A0A, this.A08, false), xah);
        AnonymousClass0fD.A0A(-1343415881, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-330373308);
        0qQ.A0B(viewGroup, 1);
        Context context = this.A00;
        ViewGroup A002 = C67430Mnl.A00(context, viewGroup, this.A07);
        if (i != 0) {
            if (i == 1) {
                ViewGroup.LayoutParams layoutParams = A002.getLayoutParams();
                DbT.A1B(context.getResources(), layoutParams, R.dimen.abc_list_item_height_large_material);
                A002.setLayoutParams(layoutParams);
            } else {
                IllegalArgumentException A0a = DbW.A0a("Invalid viewType = ", i);
                AnonymousClass0fD.A0A(1650127043, A032);
                throw A0a;
            }
        }
        AnonymousClass0fD.A0A(697305906, A032);
        return A002;
    }
}
