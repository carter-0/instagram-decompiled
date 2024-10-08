package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FeedItemType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CRh  reason: case insensitive filesystem */
public final class C44025CRh extends 17P implements AnonymousClass3IO {
    public List A00;

    public final long BEV() {
        return A03(3355);
    }

    public final FeedItemType BVr() {
        return (FeedItemType) A0M(-1852539703, DOT.A00);
    }

    public final List C2t() {
        List list = this.A00;
        if (list == null) {
            return A0o(-1525319953, CQ3.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh, X.3IO] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44886Cmc.A00(this));
    }

    public final String AYU() {
        return A0h(1583739286);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean Azg() {
        return getBooleanValueByHashCode(-103247416);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean B9g() {
        return getBooleanValueByHashCode(591789623);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean BKW() {
        return getBooleanValueByHashCode(-598077295);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean BNW() {
        return getBooleanValueByHashCode(-2096559507);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean BUf() {
        return getBooleanValueByHashCode(519330262);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean BWP() {
        return getBooleanValueByHashCode(-1960299899);
    }

    public final String BjK() {
        return A0h(648884134);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean BwD() {
        return getBooleanValueByHashCode(1074687995);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean Bwu() {
        return getBooleanValueByHashCode(1175160178);
    }

    public final String C9L() {
        return A0h(-1938614671);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final boolean Cdo() {
        return getBooleanValueByHashCode(-1947593954);
    }

    public final AnonymousClass3IO E9w(1E9 r4) {
        List<C241293Oq> C2t = C2t();
        ArrayList A0r = AnonymousClass7TG.A0r(C2t);
        for (C241293Oq r0 : C2t) {
            r0.E9F(r4);
            A0r.add(r0);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3IN FEt(X.1E9 r23) {
        /*
            r22 = this;
            r1 = 1583739286(0x5e65f196, float:4.14229736E18)
            r0 = r22
            java.lang.String r5 = r0.A0h(r1)
            r1 = -1992012396(0xffffffff89444d94, float:-2.3629119E-33)
            int r10 = r0.getIntValueByHashCode(r1)
            r1 = -103247416(0xfffffffff9d891c8, float:-1.4056161E35)
            boolean r13 = r0.getBooleanValueByHashCode(r1)
            r1 = 591789623(0x2345fe37, float:1.07332235E-17)
            boolean r14 = r0.getBooleanValueByHashCode(r1)
            r1 = 3355(0xd1b, float:4.701E-42)
            long r11 = r0.A03(r1)
            r1 = -1947593954(0xffffffff8bea131e, float:-9.0162286E-32)
            boolean r15 = r0.getBooleanValueByHashCode(r1)
            r1 = -598077295(0xffffffffdc5a1091, float:-2.4551904E17)
            boolean r16 = r0.getBooleanValueByHashCode(r1)
            r1 = -2096559507(0xffffffff83090a6d, float:-4.027265E-37)
            boolean r17 = r0.getBooleanValueByHashCode(r1)
            r1 = 519330262(0x1ef459d6, float:2.587166E-20)
            boolean r18 = r0.getBooleanValueByHashCode(r1)
            com.instagram.api.schemas.FeedItemType r4 = r0.BVr()
            r1 = -1960299899(0xffffffff8b283285, float:-3.239363E-32)
            boolean r19 = r0.getBooleanValueByHashCode(r1)
            r1 = 648884134(0x26ad2fa6, float:1.2017202E-15)
            java.lang.String r6 = r0.A0h(r1)
            r1 = 1074687995(0x400e6ffb, float:2.2255847)
            boolean r20 = r0.getBooleanValueByHashCode(r1)
            r1 = 1175160178(0x460b8572, float:8929.361)
            boolean r21 = r0.getBooleanValueByHashCode(r1)
            java.util.List r1 = r0.C2t()
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x006c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r3.next()
            X.3Oq r1 = (X.C241293Oq) r1
            r2 = r23
            X.3Op r1 = r1.FC4(r2)
            r9.add(r1)
            goto L_0x006c
        L_0x0082:
            java.lang.String r7 = r0.A0S()
            r1 = -1938614671(0xffffffff8c731671, float:-1.8726792E-31)
            java.lang.String r8 = r0.A0h(r1)
            X.3IN r3 = new X.3IN
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44025CRh.FEt(X.1E9):X.3IN");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRh] */
    public final int getDuration() {
        return getIntValueByHashCode(-1992012396);
    }

    public final String getTitle() {
        return A0S();
    }
}
