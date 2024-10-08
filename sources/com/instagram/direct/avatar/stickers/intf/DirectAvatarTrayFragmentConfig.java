package com.instagram.direct.avatar.stickers.intf;

import X.JTS;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.android.R;

public abstract class DirectAvatarTrayFragmentConfig implements Parcelable {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public DirectAvatarTrayFragmentConfig(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A05 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A01 = i;
        this.A00 = i2;
    }

    public final class NestedTray extends DirectAvatarTrayFragmentConfig {
        public static final NestedTray A00 = new NestedTray();
        public static final Parcelable.Creator CREATOR = LVP.A00(61);

        public NestedTray() {
            super(2131953514, -1, true, false, false, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class StandaloneNonDraggableTray extends DirectAvatarTrayFragmentConfig {
        public static final StandaloneNonDraggableTray A00 = new StandaloneNonDraggableTray();
        public static final Parcelable.Creator CREATOR = LVP.A00(62);

        public StandaloneNonDraggableTray() {
            super(2131953514, -1, false, false, true, true);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class StandaloneTray extends DirectAvatarTrayFragmentConfig {
        public static final StandaloneTray A00 = new StandaloneTray();
        public static final Parcelable.Creator CREATOR = LVP.A00(63);

        public StandaloneTray() {
            super(2131953514, -1, false, true, true, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class Tab extends DirectAvatarTrayFragmentConfig {
        public static final Tab A00 = new Tab();
        public static final Parcelable.Creator CREATOR = LVP.A00(64);

        public Tab() {
            super(2131960275, R.dimen.asset_picker_redesign_sticker_height, false, false, false, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }
}
