package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.B54;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoMediaReminder extends 17P implements MediaReminder {
    public static final C3035269k CREATOR = CTB.A00(17);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.MediaReminder, com.instagram.api.schemas.ImmutablePandoMediaReminder] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B54.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaReminder] */
    public final Integer B2f() {
        return getOptionalIntValueByHashCode(-939987875);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaReminder] */
    public final Boolean Cac() {
        return getOptionalBooleanValueByHashCode(-764824566);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaReminder] */
    public final MediaReminderImpl F60() {
        return new MediaReminderImpl(getOptionalBooleanValueByHashCode(-764824566), getOptionalIntValueByHashCode(-939987875));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaReminder] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
