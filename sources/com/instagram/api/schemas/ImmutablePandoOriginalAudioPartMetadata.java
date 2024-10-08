package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41848B3p;
import X.C63023KqE;
import X.CTB;
import X.DLQ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoOriginalAudioPartMetadata extends 17P implements OriginalAudioPartMetadataIntf {
    public static final C3035269k CREATOR = CTB.A00(31);
    public User A00;

    public final List Adc() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    public final MusicCanonicalType Adu() {
        return (MusicCanonicalType) A0M(1549378051, DLQ.A00);
    }

    public final User BEv() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata, com.instagram.api.schemas.OriginalAudioPartMetadataIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C63023KqE.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final int Adr() {
        return getIntValueByHashCode(-1831842732);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final int Bag() {
        return getIntValueByHashCode(-1517837824);
    }

    public final ImageUrl C72() {
        return A09(1825632153);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final Boolean CRq() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    public final OriginalAudioPartMetadataIntf E7p(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -383946360);
        return this;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata, X.17P] */
    public final OriginalAudioPartMetadata F7C(1E9 r15) {
        ArrayList arrayList;
        User A0b;
        List Adc = Adc();
        User user = null;
        if (Adc != null) {
            arrayList = AnonymousClass7TG.A0r(Adc);
            Iterator it = Adc.iterator();
            while (it.hasNext()) {
                C41846B3n.A1S(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        int intValueByHashCode = getIntValueByHashCode(-1831842732);
        MusicCanonicalType Adu = Adu();
        String A0h = A0h(1258734948);
        String A0h2 = A0h(-1466137445);
        int intValueByHashCode2 = getIntValueByHashCode(55068821);
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -383946360);
        if (!(A0Z == null || (A0b = C41845B3m.A0b(r15, A0Z)) == null)) {
            user = C41846B3n.A0b(r15, A0b);
        }
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1033668234);
        return new OriginalAudioPartMetadata(Adu, A09(1825632153), user, getOptionalBooleanValueByHashCode(1470663792), A0h, A0h2, A0h(1139251232), arrayList, intValueByHashCode, intValueByHashCode2, getIntValueByHashCode(-1517837824), booleanValueByHashCode, getBooleanValueByHashCode(1630845353));
    }

    public final String getDisplayArtist() {
        return A0h(1258734948);
    }

    public final String getDisplayTitle() {
        return A0h(-1466137445);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final int getDurationInMs() {
        return getIntValueByHashCode(55068821);
    }

    public final String getMusicCanonicalId() {
        return A0h(1139251232);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final boolean isBookmarked() {
        return getBooleanValueByHashCode(1033668234);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
