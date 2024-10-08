package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import java.util.Iterator;

/* renamed from: X.Uei  reason: case insensitive filesystem */
public final class C15554Uei extends C231632rz {
    public final C231172qz A00;
    public final Context A01;
    public final AnonymousClass0iw A02;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        Object obj3 = obj2;
        int A03 = AnonymousClass0fD.A03(-82548485);
        AnonymousClass7TG.A1U(view, obj, obj2);
        if (obj instanceof C268364dG) {
            str = ((C268364dG) obj).A02.toString();
        } else {
            str = null;
        }
        C231172qz r6 = this.A00;
        r6.EBp(view, str);
        CGI cgi = (CGI) obj;
        Context context = this.A01;
        Object tag = view.getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(3669));
        C17391VTs vTs = (C17391VTs) obj3;
        C18271Vol.A01(context, (View.OnClickListener) null, this.A02, vTs, r6, (UEA) tag, (String) null, cgi.A00, C51966G9m.A1J(cgi.A01));
        AnonymousClass0fD.A0A(237713747, A03);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        this.A00.FJ0(view);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VPV, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r7, Object obj, Object obj2) {
        CGI cgi = (CGI) obj;
        C17391VTs vTs = (C17391VTs) obj2;
        C51973G9u.A1E(r7, cgi, vTs);
        C231172qz r4 = this.A00;
        r4.A9L(new Object(), vTs.A01);
        Iterator A0o = DbY.A0o(cgi.A01);
        int i = 0;
        while (A0o.hasNext()) {
            Object next = A0o.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else {
                r4.A9K(((ShoppingBrandWithProductsImpl) next).A00, i);
                i = i2;
            }
        }
        r7.A7U(0);
    }

    public C15554Uei(Context context, AnonymousClass0iw r2, C231172qz r3) {
        this.A01 = context;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1483291556);
        View A002 = C18271Vol.A00(this.A01, viewGroup);
        AnonymousClass0fD.A0A(640420358, A04);
        return A002;
    }
}
