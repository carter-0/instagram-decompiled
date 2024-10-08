package X;

import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.3PM  reason: invalid class name */
public final class AnonymousClass3PM implements AnonymousClass3PN {
    public final /* synthetic */ AnonymousClass3PK A00;
    public final /* synthetic */ AnonymousClass3PJ A01;
    public final /* synthetic */ AnonymousClass3BV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass3PM(AnonymousClass3PK r1, AnonymousClass3PJ r2, AnonymousClass3BV r3, String str, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = z;
    }

    public final void DOJ(String str) {
        AnonymousClass3BV r1 = this.A02;
        if (!r1.A01) {
            r1.A05.remove(this);
            AnonymousClass3PO.A00(r1.A03).A04(this, str);
            this.A00.A00(str);
            if (str != null) {
                Set<Reference> set = r1.A04;
                for (Reference reference : set) {
                    C311566ct r0 = (C311566ct) reference.get();
                    if (r0 == null) {
                        set.remove(reference);
                    } else {
                        r0.DMh(str);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DOW(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            X.3BV r4 = r7.A02
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0057
            java.util.Set r0 = r4.A05
            r0.remove(r7)
            com.instagram.common.session.UserSession r1 = r4.A03
            X.3PP r0 = X.AnonymousClass3PO.A00(r1)
            r0.A04(r7, r8)
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r1)
            com.instagram.model.reels.Reel r1 = r0.A0M(r8)
            if (r1 == 0) goto L_0x0051
            X.3PJ r3 = r7.A01
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x0051
            X.3PK r2 = r7.A00
            java.lang.String r5 = r7.A03
            boolean r6 = r7.A04
            X.AnonymousClass3BV.A01(r1, r2, r3, r4, r5, r6)
        L_0x002d:
            if (r8 == 0) goto L_0x0057
            java.util.Set r3 = r4.A04
            java.util.Iterator r2 = r3.iterator()
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.6ct r0 = (X.C311566ct) r0
            if (r0 != 0) goto L_0x004d
            r3.remove(r1)
            goto L_0x0035
        L_0x004d:
            r0.DMj(r8, r9)
            goto L_0x0035
        L_0x0051:
            X.3PK r0 = r7.A00
            r0.A00(r8)
            goto L_0x002d
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PM.DOW(java.lang.String, boolean):void");
    }
}
