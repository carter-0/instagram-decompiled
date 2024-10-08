package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.9j3  reason: invalid class name and case insensitive filesystem */
public final class C385509j3 extends C14097Tpp {
    public C40161AUb A00;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new FrameLayout(context);
    }

    private final C40161AUb A00(C307786Rm r6) {
        C40161AUb aUb = this.A00;
        if (aUb != null) {
            return aUb;
        }
        ATD A002 = C343897qz.A00(r6.A00, new C343647qZ("Bloks"));
        A002.A01(new C380729Zh(A002), C345757u2.A04);
        A002.A01(new C345707tx(A002), C345607tn.A00);
        A002.A01(new C380749Zj(A002), C345547th.A00);
        A002.A01(new C345687tv(A002), C345697tw.A00);
        A002.A01(new C345667tt(A002), C345677tu.A00);
        A002.A01(new C345827u9(A002), C344397rn.A00);
        A002.A02(new C382399dd(A002, (C344037rD) null));
        C40161AUb aUb2 = new C40161AUb(A002);
        C40161AUb.A00(aUb2).Ega(921600);
        C40161AUb.A00(aUb2).Efj(false);
        C40161AUb.A00(aUb2).Eew(false);
        this.A00 = aUb2;
        return aUb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1.equals("front") != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r4, X.C307786Rm r5, X.C276544tV r6, java.lang.Object r7) {
        /*
            r3 = this;
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.AnonymousClass7TG.A1T(r4, r5, r6)
            X.AUb r2 = r3.A00(r5)
            java.lang.String r1 = r6.A0D()
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = "front"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            X.0qQ.A0A(r2)
            r2.A03(r0)
            android.view.View r0 = r2.A01()
            r4.addView(r0)
            r2.EIx()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385509j3.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        AnonymousClass7TG.A1N(viewGroup, r3);
        viewGroup.removeAllViews();
        C40161AUb A002 = A00(r3);
        0qQ.A0A(A002);
        A002.pause();
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
