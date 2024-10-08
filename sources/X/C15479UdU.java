package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.UdU  reason: case insensitive filesystem */
public final class C15479UdU extends 2Ru {
    public final C273674n0 A00;
    public final C15560Ueo A01;
    public final C15523UeC A02;
    public final C19611Wca A03;
    public final AnonymousClass71T A04;
    public final AnonymousClass32Q A05;
    public final C229122ms A06;
    public final C231762sK A07;
    public final List A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15479UdU(Context context, UserSession userSession, AnonymousClass4DU r10, AnonymousClass32J r11, C19611Wca wca, AnonymousClass32Q r13, C229122ms r14, List list, boolean z) {
        super(false);
        0qQ.A0B(userSession, 2);
        C51974G9v.A1N(r13, r14, wca);
        this.A08 = list;
        this.A05 = r13;
        this.A06 = r14;
        this.A03 = wca;
        this.A09 = z;
        AnonymousClass71T r6 = new AnonymousClass71T(context);
        this.A04 = r6;
        C231762sK r5 = new C231762sK(context);
        this.A07 = r5;
        C15560Ueo ueo = new C15560Ueo(r10, userSession, (C267644bx) null, r11);
        this.A01 = ueo;
        C15523UeC ueC = new C15523UeC(userSession, r10);
        this.A02 = ueC;
        this.A00 = new C273674n0((C324266yu) null, r13, AnonymousClass05K.A0C);
        init(new C231642s0[]{r6, r5, ueo, ueC});
    }

    public static void A00(C15348Uaz uaz) {
        ((C15479UdU) uaz.A06.getValue()).A01();
    }

    public final boolean isEmpty() {
        if (this.A00.A02() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (X.00k.A0u(r6, r5) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r14 = this;
            r14.clear()
            X.4n0 r3 = r14.A00
            r3.A06()
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0080
            int r2 = r3.A02()
            r11 = 0
        L_0x0013:
            if (r11 >= r2) goto L_0x008d
            r0 = 3
            int r9 = r11 / r0
            int r10 = r11 % r0
            java.util.List r0 = r3.A01
            java.lang.Object r1 = r0.get(r11)
            X.1Xj r1 = (X.1Xj) r1
            int r12 = X.C243233Xy.A00(r1)
            r0 = 2
            boolean r13 = X.AnonymousClass7TF.A1T(r10, r0)
            X.VZV r8 = new X.VZV
            r8.<init>(r9, r10, r11, r12, r13)
            X.DTv r7 = X.C254423sS.A03(r1)
            if (r7 == 0) goto L_0x005d
            java.util.List r6 = r14.A08
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x005d
            X.Pwf r0 = r7.Bbg()
            r5 = 0
            if (r0 == 0) goto L_0x007e
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = r0.BzM()
        L_0x0049:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r4 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.PENDING
            if (r0 == r4) goto L_0x0065
            X.Pwf r0 = r7.Bbg()
            if (r0 == 0) goto L_0x0057
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r5 = r0.BzM()
        L_0x0057:
            boolean r0 = X.00k.A0u(r6, r5)
            if (r0 == 0) goto L_0x0065
        L_0x005d:
            X.Ueo r0 = r14.A01
        L_0x005f:
            r14.addModel(r1, r8, r0)
        L_0x0062:
            int r11 = r11 + 1
            goto L_0x0013
        L_0x0065:
            X.Pwf r0 = r7.Bbg()
            if (r0 == 0) goto L_0x0062
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = r0.BzM()
            if (r0 != r4) goto L_0x0062
            boolean r0 = r6.contains(r4)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x005d
            X.UeC r0 = r14.A02
            goto L_0x005f
        L_0x007e:
            r0 = r5
            goto L_0x0049
        L_0x0080:
            X.Wca r0 = r14.A03
            X.72b r2 = r0.Afm()
            X.6rr r1 = r0.A00
            X.71T r0 = r14.A04
            r14.addModel(r2, r1, r0)
        L_0x008d:
            X.2ms r1 = r14.A06
            boolean r0 = r1.CKB()
            if (r0 != 0) goto L_0x009b
            boolean r0 = r1.CT5()
            if (r0 == 0) goto L_0x00a0
        L_0x009b:
            X.2sK r0 = r14.A07
            r14.addModel(r1, r0)
        L_0x00a0:
            r14.notifyDataSetChangedSmart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15479UdU.A01():void");
    }
}
