package com.instagram.model.mediasize;

import X.0Yv;
import X.0qQ;
import X.17P;
import X.AnonymousClass9GA;
import X.B48;
import X.C3035269k;
import X.C376379Ht;
import X.C45444CwX;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoImageInfo extends 17P implements ImageInfo {
    public static final C3035269k CREATOR = new C376379Ht(7);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoImageInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final /* synthetic */ C45444CwX AKc() {
        return new C45444CwX(this);
    }

    public final AdditionalCandidates AZb() {
        return (AdditionalCandidates) A05(-668751256, ImmutablePandoAdditionalCandidates.class);
    }

    public final SpriteSheetInfoCandidates Abg() {
        return (SpriteSheetInfoCandidates) A05(174361741, ImmutablePandoSpriteSheetInfoCandidates.class);
    }

    public final List Al9() {
        ImmutableList A08 = A08(-1411310768, AnonymousClass9GA.class);
        if (A08 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(A08, 10));
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            AnonymousClass9GA r1 = (AnonymousClass9GA) it.next();
            0qQ.A0A(r1);
            arrayList.add(new ExtendedImageUrl(r1));
        }
        return arrayList;
    }

    public final SpriteSheetInfoCandidates BqD() {
        return (SpriteSheetInfoCandidates) A05(1213067069, ImmutablePandoSpriteSheetInfoCandidates.class);
    }

    public final List ByG() {
        ImmutableList A08 = A08(2102113375, AnonymousClass9GA.class);
        if (A08 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(A08, 10));
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            AnonymousClass9GA r1 = (AnonymousClass9GA) it.next();
            0qQ.A0A(r1);
            arrayList.add(new ExtendedImageUrl(r1));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoImageInfo, com.instagram.model.mediasize.ImageInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(B48.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ImageInfoImpl FEa() {
        AdditionalCandidatesImpl additionalCandidatesImpl;
        SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl;
        AdditionalCandidates AZb = AZb();
        SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl2 = null;
        if (AZb != null) {
            additionalCandidatesImpl = AZb.FEZ();
        } else {
            additionalCandidatesImpl = null;
        }
        SpriteSheetInfoCandidates Abg = Abg();
        if (Abg != null) {
            spriteSheetInfoCandidatesImpl = Abg.FEb();
        } else {
            spriteSheetInfoCandidatesImpl = null;
        }
        List Al9 = Al9();
        SpriteSheetInfoCandidates BqD = BqD();
        if (BqD != null) {
            spriteSheetInfoCandidatesImpl2 = BqD.FEb();
        }
        return new ImageInfoImpl(additionalCandidatesImpl, spriteSheetInfoCandidatesImpl, spriteSheetInfoCandidatesImpl2, Al9, ByG());
    }
}
