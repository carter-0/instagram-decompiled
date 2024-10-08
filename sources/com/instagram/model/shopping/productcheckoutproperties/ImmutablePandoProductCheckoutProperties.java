package com.instagram.model.shopping.productcheckoutproperties;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44920CnD;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo;

public final class ImmutablePandoProductCheckoutProperties extends 17P implements ProductCheckoutPropertiesIntf {
    public static final C3035269k CREATOR = CTA.A00(49);

    public final CurrencyAmountInfo Ati() {
        return (CurrencyAmountInfo) A05(277108806, ImmutablePandoCurrencyAmountInfo.class);
    }

    public final ShippingAndReturnsMetadataIntf Btf() {
        return (ShippingAndReturnsMetadataIntf) A05(282398665, ImmutablePandoShippingAndReturnsMetadata.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf, com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44920CnD.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean Ajx() {
        return getOptionalBooleanValueByHashCode(-1009937039);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean Ak9() {
        return getOptionalBooleanValueByHashCode(1352463419);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean Akj() {
        return getOptionalBooleanValueByHashCode(1209557281);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Integer B8M() {
        return getOptionalIntValueByHashCode(261613502);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean BBC() {
        return getOptionalBooleanValueByHashCode(-414564036);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean BBD() {
        return getOptionalBooleanValueByHashCode(1916113810);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Integer BIk() {
        return getOptionalIntValueByHashCode(-1448197106);
    }

    public final Long BeS() {
        return A0L(-1226045449);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean BgA() {
        return getOptionalBooleanValueByHashCode(-1664796441);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Integer CAB() {
        return getOptionalIntValueByHashCode(883331850);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Integer CF8() {
        return getOptionalIntValueByHashCode(1674036426);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean CVv() {
        return getOptionalBooleanValueByHashCode(-168393277);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean CaB() {
        return getOptionalBooleanValueByHashCode(1924211493);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final Boolean Cbv() {
        return getOptionalBooleanValueByHashCode(-1902860266);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties FFY() {
        /*
            r20 = this;
            r1 = -1009937039(0xffffffffc3cd9571, float:-411.1675)
            r0 = r20
            java.lang.Boolean r4 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1352463419(0x509cf43b, float:2.10660127E10)
            java.lang.Boolean r5 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1209557281(0x48186121, float:156036.52)
            java.lang.Boolean r6 = r0.getOptionalBooleanValueByHashCode(r1)
            com.instagram.model.payments.CurrencyAmountInfo r1 = r0.Ati()
            r3 = 0
            if (r1 == 0) goto L_0x008d
            com.instagram.model.payments.CurrencyAmountInfoImpl r2 = r1.FEe()
        L_0x0022:
            r1 = 261613502(0xf97e7be, float:1.4979013E-29)
            java.lang.Integer r13 = r0.getOptionalIntValueByHashCode(r1)
            r1 = -414564036(0xffffffffe74a413c, float:-9.551214E23)
            java.lang.Boolean r7 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1916113810(0x72359392, float:3.596492E30)
            java.lang.Boolean r8 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1618568598(0x60796596, float:7.188374E19)
            java.lang.String r18 = r0.A0j(r1)
            r1 = -1448197106(0xffffffffa9ae440e, float:-7.738958E-14)
            java.lang.Integer r14 = r0.getOptionalIntValueByHashCode(r1)
            r1 = -168393277(0xfffffffff5f685c3, float:-6.250088E32)
            java.lang.Boolean r9 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1924211493(0x72b12325, float:7.017131E30)
            java.lang.Boolean r10 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1902860266(0xffffffff8e94a816, float:-3.6646678E-30)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1226045449(0xffffffffb6ec07f7, float:-7.0342753E-6)
            java.lang.Long r17 = r0.A0L(r1)
            r1 = -1664796441(0xffffffff9cc538e7, float:-1.3051075E-21)
            java.lang.Boolean r12 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -2102555285(0xffffffff82ad8d6b, float:-2.5501235E-37)
            java.lang.String r19 = r0.A0j(r1)
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf r1 = r0.Btf()
            if (r1 == 0) goto L_0x0079
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r3 = r1.FFZ()
        L_0x0079:
            r1 = 883331850(0x34a6930a, float:3.1026894E-7)
            java.lang.Integer r15 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1674036426(0x63c7c4ca, float:7.3701644E21)
            java.lang.Integer r16 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = new com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x008d:
            r2 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties.FFY():com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties");
    }

    public final String getIgReferrerFbid() {
        return A0j(1618568598);
    }

    public final String getReceiverId() {
        return A0j(-2102555285);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
