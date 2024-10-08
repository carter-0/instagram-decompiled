package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C63335KvI;
import X.CTA;
import X.MOR;
import X.MOS;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoIgFundedIncentive extends 17P implements IgFundedIncentiveIntf {
    public static final C3035269k CREATOR = new CTA(46);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final IgFundedIncentiveBannerIconType AfB() {
        return (IgFundedIncentiveBannerIconType) A0N(-1907158612, MOR.A00);
    }

    public final List Awm() {
        return A08(1557721666, ImmutablePandoIgFundedIncentiveDetail.class);
    }

    public final IgFundedIncentiveBannerButtonIntf B62() {
        return (IgFundedIncentiveBannerButtonIntf) A05(-413013087, ImmutablePandoIgFundedIncentiveBannerButton.class);
    }

    public final IgFundedIncentiveNuxDisplayStyle BXc() {
        return (IgFundedIncentiveNuxDisplayStyle) A0M(1499655110, MOS.A00);
    }

    public final IgFundedIncentiveBannerButtonIntf BqQ() {
        return (IgFundedIncentiveBannerButtonIntf) A05(1189786973, ImmutablePandoIgFundedIncentiveBannerButton.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive FFV() {
        /*
            r17 = this;
            r1 = r17
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType r4 = r1.AfB()
            r0 = 1653358671(0x628c404f, float:1.293589E21)
            java.lang.Integer r6 = r1.getOptionalIntValueByHashCode(r0)
            r0 = 513507190(0x1e9b7f76, float:1.646398E-20)
            java.lang.Integer r7 = r1.getOptionalIntValueByHashCode(r0)
            r0 = -1724546052(0xffffffff993583fc, float:-9.384135E-24)
            java.lang.String r8 = r1.A0h(r0)
            java.util.List r0 = r1.Awm()
            r3 = 0
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail r0 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail) r0
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl r0 = r0.FFX()
            r13.add(r0)
            goto L_0x002a
        L_0x003e:
            r13 = r3
        L_0x003f:
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf r0 = r1.B62()
            if (r0 == 0) goto L_0x008b
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton r2 = r0.FFW()
        L_0x0049:
            r0 = -540695623(0xffffffffdfc5a3b9, float:-2.848286E19)
            boolean r14 = r1.getBooleanValueByHashCode(r0)
            r0 = 1853315183(0x6e77586f, float:1.9137427E28)
            java.lang.String r9 = r1.A0k(r0)
            r0 = -613728513(0xffffffffdb6b3eff, float:-6.6215884E16)
            boolean r15 = r1.getBooleanValueByHashCode(r0)
            r0 = 2050142337(0x7a32b081, float:2.319522E35)
            java.lang.String r10 = r1.A0i(r0)
            r0 = -1939587441(0xffffffff8c643e8f, float:-1.7583307E-31)
            java.lang.String r11 = r1.A0i(r0)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle r5 = r1.BXc()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf r0 = r1.BqQ()
            if (r0 == 0) goto L_0x007a
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton r3 = r0.FFW()
        L_0x007a:
            r0 = -978473626(0xffffffffc5adad66, float:-5557.675)
            boolean r16 = r1.getBooleanValueByHashCode(r0)
            java.lang.String r12 = r1.A0S()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r1 = new com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x008b:
            r2 = r3
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive.FFV():com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive, com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C63335KvI.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive] */
    public final Integer Ard() {
        return getOptionalIntValueByHashCode(1653358671);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive] */
    public final Integer Are() {
        return getOptionalIntValueByHashCode(513507190);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive] */
    public final boolean BBV() {
        return getBooleanValueByHashCode(-540695623);
    }

    public final String BGl() {
        return A0k(1853315183);
    }

    public final String BXa() {
        return A0i(2050142337);
    }

    public final String BXb() {
        return A0i(-1939587441);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive] */
    public final boolean Bum() {
        return getBooleanValueByHashCode(-978473626);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive] */
    public final boolean CY9() {
        return getBooleanValueByHashCode(-613728513);
    }

    public final String getDescription() {
        return A0h(-1724546052);
    }

    public final String getTitle() {
        return A0S();
    }
}
