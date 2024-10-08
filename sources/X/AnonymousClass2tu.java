package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.Collections;

/* renamed from: X.2tu  reason: invalid class name */
public final class AnonymousClass2tu extends C231632rz {
    public final C231032ql A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final Integer A04;
    public final boolean A05;

    public AnonymousClass2tu(Context context, AnonymousClass0iw r3, UserSession userSession, C231032ql r5, Integer num, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r5, 4);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A00 = r5;
        this.A04 = num;
        this.A05 = z;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-632907130);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        C231032ql r7 = this.A00;
        C268374dH r5 = (C268374dH) obj;
        r7.EBz(view, r5);
        Context context = this.A01;
        UserSession userSession = this.A03;
        AnonymousClass0iw r3 = this.A02;
        Object tag = view.getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(1639));
        Integer num = this.A04;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.shopping.productfeed.ProductHscrollState");
        C18696Vwu.A01(context, r3, userSession, r5, (C17524VZd) obj2, r7, (C14890UDs) tag, num);
        AnonymousClass0fD.A0A(-14299394, A032);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        bindView(i, view, obj, obj2);
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        this.A00.FJ3(view);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C268374dH r6 = (C268374dH) obj;
        C17524VZd vZd = (C17524VZd) obj2;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(vZd, 2);
        r5.A7U(0);
        C231032ql r3 = this.A00;
        r3.A9u(r6, vZd.A01);
        for (ProductFeedItem productFeedItem : Collections.unmodifiableList(r6.Bg7().A03)) {
            XC9 BgB = r3.BgB();
            0qQ.A0A(productFeedItem);
            BgB.A9t(productFeedItem, r6, vZd);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(2012063375);
        0qQ.A0B(viewGroup, 1);
        View A002 = C18696Vwu.A00(this.A01, viewGroup, this.A05);
        AnonymousClass0fD.A0A(1694744703, A032);
        return A002;
    }
}
