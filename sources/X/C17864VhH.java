package X;

import android.content.Context;

/* renamed from: X.VhH  reason: case insensitive filesystem */
public final class C17864VhH {
    public final AnonymousClass2t9 A00;
    public final Context A01;
    public final C53290Glc A02;
    public final AnonymousClass0iw A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.Uin} */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v28, types: [X.2tL] */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (X.C14502TxO.A00(r0).A0Q != false) goto L_0x0083;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C14087Tpd r21) {
        /*
            r20 = this;
            r5 = 0
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            r7 = r21
            boolean r0 = r7.A0A
            r6 = r20
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r7.A02
            X.Uin r0 = new X.Uin
            r0.<init>(r1)
        L_0x0015:
            r4.A00(r0)
        L_0x0018:
            X.2t9 r0 = r6.A00
            r0.A05(r4)
            return
        L_0x001e:
            java.util.List r8 = r7.A04
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x003e
            android.content.Context r1 = r6.A01
            r0 = 2131968415(0x7f13419f, float:1.9573724E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131969793(0x7f134701, float:1.9576519E38)
            java.lang.String r1 = r1.getString(r0)
            X.Uiq r0 = new X.Uiq
            r0.<init>(r2, r1)
            r4.A00(r0)
        L_0x003e:
            boolean r3 = r7.A0B
            if (r3 == 0) goto L_0x004a
            X.Uim r0 = new X.Uim
            r0.<init>()
            r4.A00(r0)
        L_0x004a:
            java.util.Iterator r11 = r8.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r2 = r11.next()
            X.VkR r2 = (X.C18043VkR) r2
            java.lang.String r0 = r2.A02()
            X.Uwy r10 = X.VH2.A00(r0)
            if (r10 == 0) goto L_0x004e
            X.Uwy r0 = X.C16551Uwy.SECTION_TYPE_COLLECTION
            if (r10 == r0) goto L_0x004e
            X.Uwy r0 = X.C16551Uwy.SECTION_TYPE_ITEM
            r9 = 1
            if (r10 != r0) goto L_0x0083
            X.VYg r0 = r2.A00()
            X.VTj r0 = r0.A02
            X.0qQ.A0A(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            if (r0 == 0) goto L_0x00f2
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            boolean r0 = r0.A0Q
            r8 = 0
            if (r0 == 0) goto L_0x0084
        L_0x0083:
            r8 = 1
        L_0x0084:
            java.util.Set r1 = r7.A05
            java.lang.String r0 = r2.A01()
            boolean r1 = r1.contains(r0)
            r13 = 0
            r0 = 4
            X.JZA r14 = new X.JZA
            r14.<init>((int) r0, (int) r0, (boolean) r1, (boolean) r8)
            int r1 = r10.ordinal()
            if (r1 == r9) goto L_0x00d3
            r0 = 2
            if (r1 == r0) goto L_0x00c9
            if (r1 != r5) goto L_0x004e
            X.VYg r0 = r2.A00()
            X.VPN r0 = r0.A03
            if (r0 == 0) goto L_0x00ed
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x00ed
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r13, r13}
            java.lang.String r0 = "%s_%s_%s:"
            java.lang.String r16 = X.0mp.A06(r0, r1)
            X.UNy r12 = new X.UNy
            r14 = r13
            r15 = r13
            r18 = r13
            r19 = r13
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
        L_0x00c3:
            X.2tL r12 = (X.C232262tL) r12
            r4.A00(r12)
            goto L_0x004e
        L_0x00c9:
            java.lang.String r1 = r7.A02
            X.Glc r0 = r6.A02
            X.WSS r12 = new X.WSS
            r12.<init>(r0, r14, r2, r1)
            goto L_0x00c3
        L_0x00d3:
            java.lang.String r0 = r7.A02
            X.Glc r13 = r6.A02
            X.WSY r12 = new X.WSY
            r15 = r2
            r16 = r0
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x00c3
        L_0x00e2:
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0018
            X.Uil r0 = new X.Uil
            r0.<init>()
            goto L_0x0015
        L_0x00ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17864VhH.A00(X.Tpd):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    public C17864VhH(Context context, C53290Glc glc, AnonymousClass0iw r6, X1Z x1z, C20924X4p x4p, C20848X1a x1a, VPB vpb) {
        C15799Uii uii;
        this.A01 = context;
        this.A03 = r6;
        this.A02 = glc;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new Object());
        A002.A01(new Object());
        A002.A01(new Object());
        A002.A01(new Object());
        if (vpb == null) {
            uii = new C15799Uii(r6, x1a);
        }
        A002.A01(uii);
        A002.A01(new C15777UiM(r6, x1z));
        this.A00 = DbU.A0U(A002, new C15775UiK(x4p, AnonymousClass7TE.A16(context, 2131968295)));
    }
}
