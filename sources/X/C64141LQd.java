package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.util.HashMap;

/* renamed from: X.LQd  reason: case insensitive filesystem */
public final class C64141LQd {
    public final Context A00;
    public final C228602lw A01;
    public final UserSession A02;
    public final C17999Vjb A03;
    public final ShoppingTaggingFeedArguments A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();
    public final 0V2 A06 = JTQ.A0p();
    public final HashMap A07 = AnonymousClass7TE.A1E();

    public C64141LQd(Context context, C228602lw r3, UserSession userSession, C17999Vjb vjb, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        C51973G9u.A0r(3, userSession, shoppingTaggingFeedArguments, vjb);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = userSession;
        this.A04 = shoppingTaggingFeedArguments;
        this.A03 = vjb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.05G A00(X.C64141LQd r20, java.lang.String r21) {
        /*
            r1 = r20
            java.util.HashMap r2 = r1.A07
            r3 = r21
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L_0x00b0
            android.content.Context r6 = r1.A00
            com.instagram.common.session.UserSession r9 = r1.A02
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = r1.A04
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r10 = r0.A05
            if (r10 != 0) goto L_0x002a
            java.lang.String r0 = ""
            java.lang.Object r0 = r2.get(r0)
            X.05G r0 = (X.05G) r0
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r0 = r0.getValue()
            X.ULE r0 = (X.ULE) r0
            if (r0 == 0) goto L_0x00ec
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r10 = r0.A01
        L_0x002a:
            r14 = 0
            r7 = 1
            X.0sn r19 = X.0sn.A00
            if (r10 != 0) goto L_0x008c
            com.instagram.user.model.User r1 = X.DbT.A0j(r9)
            boolean r8 = X.VH4.A00(r9)
            boolean r0 = r1.A1R()
            if (r0 != 0) goto L_0x0045
            boolean r0 = r1.A1Q()
            r1 = 0
            if (r0 == 0) goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            r0 = 2131974977(0x7f135b41, float:1.9587033E38)
            java.lang.CharSequence r4 = r6.getText(r0)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            r12 = 0
            java.lang.String r11 = ""
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r10 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader
            r13 = r12
            r15 = r14
            r16 = r14
            r17 = r14
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00b3
            X.0Tu r8 = X.0Tu.A06
            r0 = 36318063066355548(0x8107160000175c, double:3.031027552040534E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x007d
            r0 = 2131974975(0x7f135b3f, float:1.958703E38)
            java.lang.CharSequence r4 = r6.getText(r0)
            X.0qQ.A0C(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
        L_0x007d:
            X.0qQ.A0B(r4, r14)
            r10.A01 = r4
            r10.A02 = r12
            r10.A03 = r14
            r10.A04 = r7
            r10.A00 = r11
            r10.A06 = r7
        L_0x008c:
            com.instagram.shopping.model.taggingfeed.SourceType r5 = com.instagram.shopping.model.taggingfeed.SourceType.UNRECOGNIZED
            r18 = 0
            java.lang.String r7 = ""
            X.Jw0 r16 = new X.Jw0
            r4 = r16
            r6 = r18
            r8 = r7
            r9 = r19
            r4.<init>((com.instagram.shopping.model.taggingfeed.SourceType) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.List) r9)
            X.ULE r15 = new X.ULE
            r17 = r10
            r20 = r9
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.02z r0 = X.106.A01(r15)
            r2.put(r3, r0)
        L_0x00b0:
            X.05G r0 = (X.05G) r0
            return r0
        L_0x00b3:
            if (r8 == 0) goto L_0x00dd
            r0 = 2131974976(0x7f135b40, float:1.9587031E38)
            java.lang.CharSequence r0 = r6.getText(r0)
            X.0qQ.A0C(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            X.0qQ.A0B(r0, r14)
            r10.A01 = r0
            r10.A02 = r12
            r10.A03 = r7
            r10.A04 = r7
            r0 = 2131974984(0x7f135b48, float:1.9587047E38)
        L_0x00cf:
            java.lang.CharSequence r0 = r6.getText(r0)
            X.0qQ.A0C(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            r10.A00 = r0
            r10.A06 = r14
            goto L_0x008c
        L_0x00dd:
            X.0qQ.A0B(r4, r14)
            r10.A01 = r4
            r10.A02 = r12
            r10.A03 = r14
            r10.A04 = r7
            r0 = 2131974985(0x7f135b49, float:1.958705E38)
            goto L_0x00cf
        L_0x00ec:
            r10 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64141LQd.A00(X.LQd, java.lang.String):X.05G");
    }

    public static final void A01(C64141LQd lQd, String str, 0sP r4) {
        Object value = A00(lQd, str).getValue();
        Object invoke = r4.invoke(value);
        if (!0qQ.A0K(invoke, value)) {
            A00(lQd, str).Epw(invoke);
        }
    }
}
