package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import java.util.List;

/* renamed from: X.AwF  reason: case insensitive filesystem */
public final class C41548AwF extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41548AwF(C370318wC r2, Integer num, List list, List list2, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A08 = 3;
        this.A07 = r2;
        this.A0B = num;
        this.A09 = list;
        this.A0A = list2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.AwF, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.1IW A00(X.C41548AwF r3) {
        /*
            r2 = 1
            r3.A00 = r2
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02
            X.4D7 r1 = X.1Ey.A02(r3)
            X.1IW r0 = new X.1IW
            r0.<init>(r2, r1)
            r0.A0I()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41548AwF.A00(X.AwF):X.1IW");
    }

    public static void A01(C41548AwF awF, 0rm r1) {
        AnonymousClass07Y r12 = (AnonymousClass07Y) r1.A00;
        if (r12 != null) {
            ((AnonymousClass07V) awF.A01).A0A(r12);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.AwF, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.AwF, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        return new X.C41548AwF(r3, r4, r15, r0, r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        return new X.C41548AwF(r4, r5, r6, r0, r2, r15, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            int r0 = r13.A08
            r12 = r15
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0035;
                case 2: goto L_0x004b;
                case 3: goto L_0x006a;
                case 4: goto L_0x0082;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r4 = r13.A01
            X.07V r4 = (X.AnonymousClass07V) r4
            java.lang.Object r3 = r13.A0B
            X.07U r3 = (X.07U) r3
            java.lang.Object r2 = r13.A09
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r0 = r13.A0A
            X.0sL r0 = (X.0sL) r0
            r11 = 5
        L_0x0017:
            X.AwF r1 = new X.AwF
            r5 = r1
            r6 = r3
            r7 = r4
            r8 = r15
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0023:
            java.lang.Object r4 = r13.A01
            X.07V r4 = (X.AnonymousClass07V) r4
            java.lang.Object r3 = r13.A0B
            X.07U r3 = (X.07U) r3
            java.lang.Object r2 = r13.A09
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r0 = r13.A0A
            X.0sL r0 = (X.0sL) r0
            r11 = 0
            goto L_0x0017
        L_0x0035:
            java.lang.Object r2 = r13.A0A
            X.1Xo r2 = (X.AnonymousClass1Xo) r2
            java.lang.Object r0 = r13.A0B
            X.3Ym r0 = (X.C243373Ym) r0
            java.lang.Object r6 = r13.A01
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r4 = r13.A09
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r13.A07
            X.6dq r5 = (X.C312116dq) r5
            r10 = 1
            goto L_0x0060
        L_0x004b:
            java.lang.Object r2 = r13.A0A
            X.1Xo r2 = (X.AnonymousClass1Xo) r2
            java.lang.Object r0 = r13.A0B
            X.3Ym r0 = (X.C243373Ym) r0
            java.lang.Object r6 = r13.A01
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r4 = r13.A09
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r13.A07
            X.6dq r5 = (X.C312116dq) r5
            r10 = 2
        L_0x0060:
            X.AwF r1 = new X.AwF
            r3 = r1
            r7 = r0
            r8 = r2
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x006a:
            java.lang.Object r2 = r13.A07
            X.8wC r2 = (X.C370318wC) r2
            java.lang.Object r3 = r13.A0B
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r4 = r13.A09
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r13.A0A
            java.util.List r0 = (java.util.List) r0
            X.AwF r1 = new X.AwF
            r5 = r0
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0082:
            java.lang.Object r4 = r13.A05
            X.07Z r4 = (X.AnonymousClass07Z) r4
            java.lang.Object r3 = r13.A04
            X.07U r3 = (X.07U) r3
            java.lang.Object r5 = r13.A07
            X.E48 r5 = (X.E48) r5
            java.lang.Object r2 = r13.A06
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r10 = r13.A03
            com.instagram.igds.components.headline.IgdsHeadline r10 = (com.instagram.igds.components.headline.IgdsHeadline) r10
            java.lang.Object r7 = r13.A0A
            com.instagram.igds.components.bulletcell.IgdsBulletCell r7 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r7
            java.lang.Object r8 = r13.A01
            com.instagram.igds.components.bulletcell.IgdsBulletCell r8 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r8
            java.lang.Object r9 = r13.A0B
            com.instagram.igds.components.bulletcell.IgdsBulletCell r9 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r9
            java.lang.Object r11 = r13.A02
            com.instagram.igds.components.textcell.IgdsFooterCell r11 = (com.instagram.igds.components.textcell.IgdsFooterCell) r11
            java.lang.Object r6 = r13.A09
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r6 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r6
            X.AwF r1 = new X.AwF
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41548AwF.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v23, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v29, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d0, code lost:
        r7.ATL(new X.C71567On2(r8, r4), r6, r2);
        r0 = r3.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01dc, code lost:
        if (r0 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01de, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01df, code lost:
        X.0eS.A00(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e2, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A08
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0106;
                case 2: goto L_0x016b;
                case 3: goto L_0x01e3;
                case 4: goto L_0x02fc;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r14.A00
            r3 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r14.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r9 = r14.A02
            X.0rm r9 = (X.0rm) r9
            X.0eS.A00(r15)     // Catch:{ all -> 0x0066 }
            goto L_0x0074
        L_0x0018:
            X.0eS.A00(r15)
            java.lang.Object r4 = r14.A01
            X.07V r4 = (X.AnonymousClass07V) r4
            X.07U r2 = r4.A07()
            X.07U r0 = X.07U.A02
            if (r2 == r0) goto L_0x0080
            X.0rm r9 = new X.0rm
            r9.<init>()
            X.0rm r2 = new X.0rm
            r2.<init>()
            java.lang.Object r0 = r14.A0B     // Catch:{ all -> 0x0066 }
            X.07U r0 = (X.07U) r0     // Catch:{ all -> 0x0066 }
            java.lang.Object r11 = r14.A09     // Catch:{ all -> 0x0066 }
            X.4Cq r11 = (X.C262224Cq) r11     // Catch:{ all -> 0x0066 }
            java.lang.Object r8 = r14.A0A     // Catch:{ all -> 0x0066 }
            X.0sL r8 = (X.0sL) r8     // Catch:{ all -> 0x0066 }
            r14.A02 = r9     // Catch:{ all -> 0x0066 }
            r14.A03 = r2     // Catch:{ all -> 0x0066 }
            r14.A04 = r0     // Catch:{ all -> 0x0066 }
            r14.A05 = r4     // Catch:{ all -> 0x0066 }
            r14.A06 = r11     // Catch:{ all -> 0x0066 }
            r14.A07 = r8     // Catch:{ all -> 0x0066 }
            X.1IW r10 = A00(r14)     // Catch:{ all -> 0x0066 }
            X.07T r6 = X.AnonymousClass07R.A01(r0)     // Catch:{ all -> 0x0066 }
            X.07T r7 = X.AnonymousClass07R.A00(r0)     // Catch:{ all -> 0x0066 }
            X.IHF r5 = new X.IHF     // Catch:{ all -> 0x0066 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0066 }
            r2.A00 = r5     // Catch:{ all -> 0x0066 }
            r4.A09(r5)     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r10.A0E()     // Catch:{ all -> 0x0066 }
            if (r0 != r1) goto L_0x0074
            return r1
        L_0x0066:
            r4 = move-exception
            java.lang.Object r0 = r9.A00
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x0070
            r0.AG7(r3)
        L_0x0070:
            A01(r14, r2)
            throw r4
        L_0x0074:
            java.lang.Object r0 = r9.A00
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x007d
            r0.AG7(r3)
        L_0x007d:
            A01(r14, r2)
        L_0x0080:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0083:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            if (r1 == 0) goto L_0x0095
            java.lang.Object r2 = r14.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r8 = r14.A02
            X.0rm r8 = (X.0rm) r8
            X.0eS.A00(r15)     // Catch:{ all -> 0x00f7 }
            goto L_0x00e8
        L_0x0095:
            X.0eS.A00(r15)
            java.lang.Object r3 = r14.A01
            X.07V r3 = (X.AnonymousClass07V) r3
            X.07U r2 = r3.A07()
            X.07U r1 = X.07U.A02
            if (r2 == r1) goto L_0x0306
            X.0rm r8 = new X.0rm
            r8.<init>()
            X.0rm r2 = new X.0rm
            r2.<init>()
            java.lang.Object r1 = r14.A0B     // Catch:{ all -> 0x00f7 }
            X.07U r1 = (X.07U) r1     // Catch:{ all -> 0x00f7 }
            java.lang.Object r10 = r14.A09     // Catch:{ all -> 0x00f7 }
            X.4Cq r10 = (X.C262224Cq) r10     // Catch:{ all -> 0x00f7 }
            java.lang.Object r7 = r14.A0A     // Catch:{ all -> 0x00f7 }
            X.0sL r7 = (X.0sL) r7     // Catch:{ all -> 0x00f7 }
            r14.A02 = r8     // Catch:{ all -> 0x00f7 }
            r14.A03 = r2     // Catch:{ all -> 0x00f7 }
            r14.A04 = r1     // Catch:{ all -> 0x00f7 }
            r14.A05 = r3     // Catch:{ all -> 0x00f7 }
            r14.A06 = r10     // Catch:{ all -> 0x00f7 }
            r14.A07 = r7     // Catch:{ all -> 0x00f7 }
            X.1IW r9 = A00(r14)     // Catch:{ all -> 0x00f7 }
            X.07T r5 = X.AnonymousClass07R.A01(r1)     // Catch:{ all -> 0x00f7 }
            X.07T r6 = X.AnonymousClass07R.A00(r1)     // Catch:{ all -> 0x00f7 }
            X.136 r11 = new X.136     // Catch:{ all -> 0x00f7 }
            r11.<init>()     // Catch:{ all -> 0x00f7 }
            X.3DN r4 = new X.3DN     // Catch:{ all -> 0x00f7 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00f7 }
            r2.A00 = r4     // Catch:{ all -> 0x00f7 }
            r3.A09(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.Object r1 = r9.A0E()     // Catch:{ all -> 0x00f7 }
            if (r1 != r0) goto L_0x00e8
            return r0
        L_0x00e8:
            java.lang.Object r1 = r8.A00
            X.4Co r1 = (X.C262204Co) r1
            if (r1 == 0) goto L_0x00f2
            r0 = 0
            r1.AG7(r0)
        L_0x00f2:
            A01(r14, r2)
            goto L_0x0306
        L_0x00f7:
            r4 = move-exception
            java.lang.Object r1 = r8.A00
            X.4Co r1 = (X.C262204Co) r1
            if (r1 == 0) goto L_0x0102
            r0 = 0
            r1.AG7(r0)
        L_0x0102:
            A01(r14, r2)
            throw r4
        L_0x0106:
            r0 = r15
            X.1Hj r1 = X.1Hj.A02
            int r2 = r14.A00
            r9 = 1
            if (r2 != 0) goto L_0x01df
            X.0eS.A00(r15)
            java.lang.Object r11 = r14.A0A
            X.1Xo r11 = (X.AnonymousClass1Xo) r11
            java.lang.Object r4 = r14.A0B
            X.3Ym r4 = (X.C243373Ym) r4
            java.lang.Object r12 = r14.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r2 = r14.A09
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r14.A07
            r14.A02 = r11
            r14.A03 = r4
            r14.A04 = r12
            r14.A05 = r2
            r14.A06 = r0
            X.1IW r3 = A00(r14)
            X.Cvu r13 = com.instagram.save.api.SaveApiUtil.A02(r2, r12, r4, r11)
            X.2IS r5 = new X.2IS
            r5.<init>()
            java.lang.String r2 = r11.BpP()
            java.lang.String r0 = "effect_id"
            r5.A04(r0, r2)
            boolean r0 = X.AnonymousClass7TF.A1V(r2)
            X.17k.A0E(r0)
            java.lang.Class<X.9bV> r4 = X.C381289bV.class
            java.lang.String r0 = "IGAREffectSaveMutation"
            X.3Fa r2 = new X.3Fa
            r2.<init>(r5, r4, r0, r9)
            r0 = 9
            X.T0J r10 = new X.T0J
            r10.<init>(r3, r0)
            X.IL2 r8 = new X.IL2
            r8.<init>(r9, r10, r11, r12, r13)
            X.8j4 r7 = X.C363088j4.A00(r12)
            r0 = 0
            X.On7 r6 = new X.On7
            r6.<init>(r8, r0)
            r4 = 7
            goto L_0x01d0
        L_0x016b:
            r0 = r15
            X.1Hj r1 = X.1Hj.A02
            int r2 = r14.A00
            r5 = 1
            if (r2 != 0) goto L_0x01df
            X.0eS.A00(r15)
            java.lang.Object r11 = r14.A0A
            X.1Xo r11 = (X.AnonymousClass1Xo) r11
            java.lang.Object r4 = r14.A0B
            X.3Ym r4 = (X.C243373Ym) r4
            java.lang.Object r12 = r14.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r2 = r14.A09
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r14.A07
            r14.A02 = r11
            r14.A03 = r4
            r14.A04 = r12
            r14.A05 = r2
            r14.A06 = r0
            X.1IW r3 = A00(r14)
            X.Cvu r13 = com.instagram.save.api.SaveApiUtil.A02(r2, r12, r4, r11)
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r2 = r11.BpP()
            java.lang.String r0 = "effect_id"
            r6.A04(r0, r2)
            boolean r0 = X.AnonymousClass7TF.A1V(r2)
            X.17k.A0E(r0)
            java.lang.Class<X.9bW> r4 = X.C381299bW.class
            java.lang.String r0 = "IGAREffectUnsaveMutation"
            X.3Fa r2 = new X.3Fa
            r2.<init>(r6, r4, r0, r5)
            r0 = 10
            X.T0J r10 = new X.T0J
            r10.<init>(r3, r0)
            r9 = 2
            X.IL2 r8 = new X.IL2
            r8.<init>(r9, r10, r11, r12, r13)
            X.8j4 r7 = X.C363088j4.A00(r12)
            X.On7 r6 = new X.On7
            r6.<init>(r8, r5)
            r4 = 8
        L_0x01d0:
            X.On2 r0 = new X.On2
            r0.<init>(r8, r4)
            r7.ATL(r0, r6, r2)
            java.lang.Object r0 = r3.A0E()
            if (r0 != r1) goto L_0x0308
            return r1
        L_0x01df:
            X.0eS.A00(r15)
            return r0
        L_0x01e3:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r8 = 1
            if (r1 == 0) goto L_0x023b
            java.lang.Object r10 = r14.A06
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r14.A05
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r1 = r14.A04
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r14.A03
            X.8wC r7 = (X.C370318wC) r7
            java.lang.Object r4 = r14.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r14.A01
            X.8wD r6 = (X.C370328wD) r6
            X.0eS.A00(r15)
        L_0x0205:
            r10.add(r15)
            r10 = r1
        L_0x0209:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x02c0
            java.lang.Object r9 = r11.next()
            r14.A01 = r6
            r14.A02 = r4
            r14.A03 = r7
            r14.A04 = r10
            r14.A05 = r11
            r14.A06 = r10
            r14.A00 = r8
            X.12V r3 = r7.A03
            r5 = 0
            r2 = 935297209(0x37bf80b9, float:2.2828915E-5)
            r1 = 3
            X.0nV r3 = r3.CO6(r2, r1)
            r2 = 12
            X.9Jz r1 = new X.9Jz
            r1.<init>((java.lang.Object) r7, (java.lang.Object) r9, (X.AnonymousClass4D7) r5, (int) r2)
            java.lang.Object r15 = X.1Eo.A00(r14, r3, r1)
            if (r15 == r0) goto L_0x0308
            r1 = r10
            goto L_0x0205
        L_0x023b:
            X.0eS.A00(r15)
            java.lang.Object r7 = r14.A07
            X.8wC r7 = (X.C370318wC) r7
            r2 = 0
            X.8wD r6 = new X.8wD
            r6.<init>()
            java.lang.Object r1 = r14.A0B
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.String r5 = "source"
            X.0qQ.A0B(r1, r2)
            X.02m r4 = r6.A01
            int r3 = r6.A00
            r2 = 17640025(0x10d2a59, float:2.5927993E-38)
            r4.markerStart(r2, r3)
            int r1 = r1.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x0286
            java.lang.String r1 = "LEGACY"
        L_0x0265:
            r4.markerAnnotate(r2, r3, r5, r1)
            java.lang.Object r1 = r14.A09
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0274:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0289
            java.lang.Object r1 = r2.next()
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            java.lang.String r1 = r1.A0K
            r3.add(r1)
            goto L_0x0274
        L_0x0286:
            java.lang.String r1 = "EFFECT_COLLECTION"
            goto L_0x0265
        L_0x0289:
            java.util.Set r5 = X.00k.A0k(r3)
            java.lang.Object r1 = r14.A0A
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = X.00k.A0W(r1)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x029d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02b6
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            java.lang.String r1 = r1.A0K
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L_0x029d
            r4.add(r2)
            goto L_0x029d
        L_0x02b6:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r11 = r4.iterator()
            goto L_0x0209
        L_0x02c0:
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r10.iterator()
        L_0x02ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02de
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 == 0) goto L_0x02ca
            r3.add(r1)
            goto L_0x02ca
        L_0x02de:
            int r5 = r3.size()
            int r4 = r4.size()
            X.02m r3 = r6.A01
            int r2 = r6.A00
            r1 = 17640025(0x10d2a59, float:2.5927993E-38)
            java.lang.String r0 = "smart_eviction_count"
            r3.markerAnnotate(r1, r2, r0, r5)
            java.lang.String r0 = "smart_eviction_candidates_count"
            r3.markerAnnotate(r1, r2, r0, r4)
            r0 = 2
            r3.markerEnd(r1, r2, r0)
            goto L_0x0306
        L_0x02fc:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r3 = 1
            if (r1 == 0) goto L_0x0309
            X.0eS.A00(r15)
        L_0x0306:
            X.0gF r0 = X.C60340gF.A00
        L_0x0308:
            return r0
        L_0x0309:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A05
            X.07Z r1 = (X.AnonymousClass07Z) r1
            X.07V r2 = r1.getLifecycle()
            java.lang.Object r1 = r14.A04
            X.07U r1 = (X.07U) r1
            r13 = 0
            java.lang.Object r6 = r14.A07
            X.E48 r6 = (X.E48) r6
            java.lang.Object r5 = r14.A06
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r11 = r14.A03
            com.instagram.igds.components.headline.IgdsHeadline r11 = (com.instagram.igds.components.headline.IgdsHeadline) r11
            java.lang.Object r8 = r14.A0A
            com.instagram.igds.components.bulletcell.IgdsBulletCell r8 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r8
            java.lang.Object r9 = r14.A01
            com.instagram.igds.components.bulletcell.IgdsBulletCell r9 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r9
            java.lang.Object r10 = r14.A0B
            com.instagram.igds.components.bulletcell.IgdsBulletCell r10 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r10
            java.lang.Object r12 = r14.A02
            com.instagram.igds.components.textcell.IgdsFooterCell r12 = (com.instagram.igds.components.textcell.IgdsFooterCell) r12
            java.lang.Object r7 = r14.A09
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r7
            X.MGT r4 = new X.MGT
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r3
            java.lang.Object r1 = X.AnonymousClass3DM.A00(r1, r2, r14, r4)
            if (r1 != r0) goto L_0x0306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41548AwF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C41548AwF) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41548AwF(View view, 07U r3, AnonymousClass07Z r4, E48 e48, IgdsBottomButtonLayout igdsBottomButtonLayout, IgdsBulletCell igdsBulletCell, IgdsBulletCell igdsBulletCell2, IgdsBulletCell igdsBulletCell3, IgdsHeadline igdsHeadline, IgdsFooterCell igdsFooterCell, AnonymousClass4D7 r12) {
        super(2, r12);
        this.A08 = 4;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = e48;
        this.A06 = view;
        this.A03 = igdsHeadline;
        this.A0A = igdsBulletCell;
        this.A01 = igdsBulletCell2;
        this.A0B = igdsBulletCell3;
        this.A02 = igdsFooterCell;
        this.A09 = igdsBottomButtonLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41548AwF(Context context, C312116dq r3, UserSession userSession, C243373Ym r5, AnonymousClass1Xo r6, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A08 = i;
        this.A0A = r6;
        this.A0B = r5;
        this.A01 = userSession;
        this.A09 = context;
        this.A07 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41548AwF(07U r2, AnonymousClass07V r3, AnonymousClass4D7 r4, 0sL r5, C262224Cq r6, int i) {
        super(2, r4);
        this.A08 = i;
        this.A01 = r3;
        this.A0B = r2;
        this.A09 = r6;
        this.A0A = r5;
    }
}
