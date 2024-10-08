package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tv  reason: invalid class name and case insensitive filesystem */
public final class C232552tv extends C231632rz {
    public final C231172qz A00;
    public final Context A01;
    public final AnonymousClass0iw A02;

    public C232552tv(Context context, AnonymousClass0iw r3, C231172qz r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r4, 3);
        this.A01 = context;
        this.A02 = r3;
        this.A00 = r4;
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
        this.A00.FJ0(view);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        ImmutableList copyOf;
        C268364dG r0;
        C16576UxV uxV;
        Object obj3 = obj2;
        int A03 = AnonymousClass0fD.A03(-21808127);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        String str = null;
        if (!(!(obj instanceof C268364dG) || (r0 = (C268364dG) obj) == null || (uxV = r0.A02) == null)) {
            str = uxV.toString();
        }
        C231172qz r7 = this.A00;
        r7.EBp(view, str);
        Context context = this.A01;
        Object tag = view.getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(3669));
        UEA uea = (UEA) tag;
        AnonymousClass0iw r5 = this.A02;
        C268364dG r15 = (C268364dG) obj;
        0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.shopping.widget.merchanthscroll.MerchantHscrollState");
        C17391VTs vTs = (C17391VTs) obj3;
        0qQ.A0B(context, 0);
        0qQ.A0B(uea, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r15, 4);
        0qQ.A0B(vTs, 5);
        List list = r15.A0B;
        if (list == null || (copyOf = ImmutableList.copyOf((Collection) list)) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            ShoppingBrandWithProducts shoppingBrandWithProducts = ((BGO) ((C45284Ctn) it.next()).A01).A01;
            if (shoppingBrandWithProducts != null) {
                arrayList.add(shoppingBrandWithProducts);
            }
        }
        C18271Vol.A01(context, new W9s(r15, vTs, r7), r5, vTs, r7, uea, r15.A01(), r15.A09, arrayList);
        AnonymousClass0fD.A0A(730832533, A03);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VPV, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r7, Object obj, Object obj2) {
        ImmutableList copyOf;
        ImmutableList copyOf2;
        C268364dG r8 = (C268364dG) obj;
        C17391VTs vTs = (C17391VTs) obj2;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(vTs, 2);
        List list = r8.A0B;
        if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null && !copyOf.isEmpty()) {
            C231172qz r4 = this.A00;
            ? obj3 = new Object();
            obj3.A00 = r8;
            r4.A9L(obj3, vTs.A01);
            List list2 = r8.A0B;
            if (!(list2 == null || (copyOf2 = ImmutableList.copyOf((Collection) list2)) == null)) {
                Iterator it = copyOf2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    ShoppingBrandWithProducts shoppingBrandWithProducts = ((BGO) ((C45284Ctn) next).A01).A01;
                    if (shoppingBrandWithProducts != null) {
                        r4.A9K(shoppingBrandWithProducts.CCd(), i);
                        i = i2;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            r7.A7U(0);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-350647471);
        0qQ.A0B(viewGroup, 1);
        View A002 = C18271Vol.A00(this.A01, viewGroup);
        AnonymousClass0fD.A0A(1791470128, A03);
        return A002;
    }
}
