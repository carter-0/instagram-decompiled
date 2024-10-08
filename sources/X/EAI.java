package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

public final class EAI extends C231632rz {
    public final G7T A00;
    public final boolean A01;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.3Z5, android.view.View, com.instagram.igds.components.button.IgdsButton] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r7 == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r2 = r19
            r5 = r18
            r0 = 852311534(0x32cd3dee, float:2.3893303E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = r17
            X.AnonymousClass7TG.A1U(r0, r5, r2)
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof X.C49426EvS
            if (r0 == 0) goto L_0x008f
            X.EvS r1 = (X.C49426EvS) r1
            if (r1 == 0) goto L_0x008f
            boolean r0 = r5 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L_0x008b
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x008b
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0089
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0089
            boolean r6 = r2.booleanValue()
        L_0x0030:
            X.G7T r3 = r15.A00
            boolean r7 = r15.A01
            r0 = 2
            X.0qQ.A0B(r3, r0)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r2 = r1.A00
            r2.A01()
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r2)
            r1 = 1
            if (r6 != 0) goto L_0x0086
            X.4lo r10 = X.C273014lo.PRIMARY
        L_0x0046:
            X.4lp r11 = X.C273024lp.MEDIUM
            r0 = 2131975973(0x7f135f25, float:1.9589053E38)
            if (r6 != 0) goto L_0x0050
            r0 = 2131972313(0x7f1350d9, float:1.958163E38)
        L_0x0050:
            java.lang.String r12 = X.AnonymousClass7TE.A16(r9, r0)
            r13 = 0
            X.ELi r8 = new X.ELi
            r14 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14)
            if (r6 != r1) goto L_0x0062
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r7 != 0) goto L_0x0064
        L_0x0062:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            r8.setAlpha(r0)
            r0 = 29
            X.FPA.A00(r8, r3, r5, r6, r0)
            r0 = 36
            X.FP7 r1 = new X.FP7
            r1.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r5)
            r0 = 0
            r2.A02(r1, r5)
            r2.A05(r8, r0)
            r0 = 37
            X.FP7.A00(r2, r0, r3, r5)
            r0 = 1105141410(0x41df1ea2, float:27.889957)
        L_0x0082:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0086:
            X.4lo r10 = X.C273014lo.SECONDARY
            goto L_0x0046
        L_0x0089:
            r6 = 0
            goto L_0x0030
        L_0x008b:
            r0 = -599728126(0xffffffffdc40e002, float:-2.17157979E17)
            goto L_0x0082
        L_0x008f:
            r0 = -710798921(0xffffffffd5a211b7, float:-2.2274621E13)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAI.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public EAI(G7T g7t, boolean z) {
        this.A01 = z;
        this.A00 = g7t;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1862997698);
        0qQ.A0B(viewGroup, 1);
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), true);
        igdsPeopleCell.setTag(new C49426EvS(igdsPeopleCell));
        AnonymousClass0fD.A0A(-985057115, A03);
        return igdsPeopleCell;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
