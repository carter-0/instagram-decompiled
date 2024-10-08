package com.instagram.user.model;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C45142Cr0;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoUpcomingEventLiveMetadata extends 17P implements UpcomingEventLiveMetadata {
    public static final C3035269k CREATOR = CTA.A00(89);
    public ScheduledLiveProductsMetadataIntf A00;

    public final ScheduledLiveProductsMetadataIntf Btm() {
        ScheduledLiveProductsMetadataIntf scheduledLiveProductsMetadataIntf = this.A00;
        if (scheduledLiveProductsMetadataIntf == null) {
            return (ScheduledLiveProductsMetadataIntf) A05(-1648702171, ImmutablePandoScheduledLiveProductsMetadata.class);
        }
        return scheduledLiveProductsMetadataIntf;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata, com.instagram.user.model.UpcomingEventLiveMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45142Cr0.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Ai3() {
        return A0j(246302041);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata] */
    public final boolean BNM() {
        return getBooleanValueByHashCode(201661944);
    }

    public final String BeF() {
        return A0j(1878451178);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata] */
    public final Integer CFW() {
        return getOptionalIntValueByHashCode(1941332754);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata] */
    public final Boolean CPg() {
        return getOptionalBooleanValueByHashCode(-81031001);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata] */
    public final boolean CbF() {
        return getBooleanValueByHashCode(-433113869);
    }

    public final UpcomingEventLiveMetadata EAe(1E9 r2) {
        ScheduledLiveProductsMetadataIntf Btm = Btm();
        if (Btm != null) {
            Btm.EAb(r2);
        } else {
            Btm = null;
        }
        this.A00 = Btm;
        return this;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata, X.17P] */
    public final UpcomingEventLiveMetadataImpl FH0(1E9 r9) {
        ScheduledLiveProductsMetadata scheduledLiveProductsMetadata;
        String A0j = A0j(246302041);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-81031001);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-433113869);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(201661944);
        String A0j2 = A0j(1878451178);
        ScheduledLiveProductsMetadataIntf Btm = Btm();
        if (Btm != null) {
            scheduledLiveProductsMetadata = Btm.FGv(r9);
        } else {
            scheduledLiveProductsMetadata = null;
        }
        return new UpcomingEventLiveMetadataImpl(scheduledLiveProductsMetadata, optionalBooleanValueByHashCode, getOptionalIntValueByHashCode(1941332754), A0j, A0j2, booleanValueByHashCode, booleanValueByHashCode2);
    }

    public final UpcomingEventLiveMetadataImpl FH1(1E6 r2) {
        return FH0(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
