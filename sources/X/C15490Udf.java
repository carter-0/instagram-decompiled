package X;

import android.content.Context;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Udf  reason: case insensitive filesystem */
public final class C15490Udf extends 2Ru implements C231272rL, C231322rQ {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final LruCache A04 = new LruCache(100);
    public final C15545UeZ A05;
    public final C18480VsW A06;
    public final AnonymousClass3W1 A07 = new AnonymousClass3W1();
    public final C229122ms A08;
    public final C231762sK A09;

    public C15490Udf(Context context, C55802Hni hni, AnonymousClass0iw r11, 0MB r12, C229122ms r13, C20989X8f x8f, VQ1 vq1) {
        super(false);
        this.A03 = context;
        this.A02 = false;
        C18480VsW vsW = new C18480VsW();
        this.A06 = vsW;
        0qQ.A0B(vq1, 0);
        vsW.A00.A00.add(vq1);
        C15545UeZ ueZ = new C15545UeZ(context, hni, r11, r12, x8f);
        this.A05 = ueZ;
        C231762sK r0 = new C231762sK(context);
        this.A09 = r0;
        this.A08 = r13;
        init(new C231642s0[]{ueZ, r0});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.VPz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.VPz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.VPz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.VPz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.VPz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.VPz} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r9 = this;
            r0 = 1
            r9.A01 = r0
            r9.clear()
            X.VsW r7 = r9.A06
            java.util.List r0 = r7.A01
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            X.3kO r8 = r0.iterator()
        L_0x0012:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r2 = r8.next()
            X.3gp r2 = (X.C247733gp) r2
            java.lang.String r0 = r2.A0G
            android.util.LruCache r6 = r9.A04
            java.lang.Object r1 = r6.get(r0)
            X.VPz r1 = (X.C17298VPz) r1
            if (r1 != 0) goto L_0x0034
            X.VPz r1 = new X.VPz
            r1.<init>()
            java.lang.String r0 = r2.A0G
            r6.put(r0, r1)
        L_0x0034:
            X.Wv0 r5 = r7.A00
            com.google.common.collect.ImmutableSet r0 = X.C13990Tnq.A0L(r5)
            boolean r0 = r0.contains(r2)
            r1.A00 = r0
            X.UeZ r4 = r9.A05
            r9.addModel(r2, r1, r4)
            int r0 = r2.A01
            if (r0 <= 0) goto L_0x0012
            java.util.List r0 = r2.A0L
            java.util.Iterator r3 = r0.iterator()
        L_0x004f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r2 = r3.next()
            X.3gp r2 = (X.C247733gp) r2
            boolean r0 = X.C18480VsW.A00(r2)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.A0G
            java.lang.Object r1 = r6.get(r0)
            X.VPz r1 = (X.C17298VPz) r1
            if (r1 != 0) goto L_0x0075
            X.VPz r1 = new X.VPz
            r1.<init>()
            java.lang.String r0 = r2.A0G
            r6.put(r0, r1)
        L_0x0075:
            com.google.common.collect.ImmutableSet r0 = X.C13990Tnq.A0L(r5)
            boolean r0 = r0.contains(r2)
            r1.A00 = r0
            r9.addModel(r2, r1, r4)
            goto L_0x004f
        L_0x0083:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x008e
            X.2ms r1 = r9.A08
            X.2sK r0 = r9.A09
            r9.addModel(r1, r0)
        L_0x008e:
            r9.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15490Udf.A00():void");
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final void Crn() {
        this.A01 = false;
    }

    public final void EU8(AnonymousClass310 r1) {
    }

    public final void EWg(AnonymousClass2xS r1) {
    }

    public final void A01(1Xj r6) {
        if (r6 != null) {
            String id = r6.getId();
            id.getClass();
            if (!id.equals(this.A00)) {
                this.A00 = r6.getId();
            }
            this.A02 = r6.A0X;
            List list = this.A06.A01;
            list.clear();
            List list2 = r6.A0U;
            ArrayList<Object> arrayList = new ArrayList<>();
            for (Object next : list2) {
                if (C18480VsW.A00((C247733gp) next)) {
                    arrayList.add(next);
                }
            }
            for (Object add : arrayList) {
                list.add(add);
            }
            this.A05.A00 = r6;
            A00();
        }
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final AnonymousClass3W1 BQr(1Xj r2) {
        return this.A07;
    }

    public final /* synthetic */ List CBH() {
        return new ArrayList();
    }

    public final boolean CRD() {
        return this.A01;
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void AV9() {
        A00();
    }

    public final void Cs9(1Xj r1) {
        A00();
    }
}
