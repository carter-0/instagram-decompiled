package com.facebook.browser.lite.viewmode;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.JTS;
import X.REW;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class IABViewModeLaunchConfig implements Parcelable {
    public final REW A00;

    public final class FullScreen extends IABViewModeLaunchConfig {
        public static final FullScreen A00 = new FullScreen();
        public static final Parcelable.Creator CREATOR = SWS.A00(27);

        public final int describeContents() {
            return 0;
        }

        public FullScreen() {
            super(REW.FULL_SCREEN);
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("IABViewModeLaunchConfig(initViewMode=");
            return AnonymousClass7TG.A0n(this.A00, A1A);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class FullSheet extends IABViewModeLaunchConfig {
        public static final FullSheet A00 = new FullSheet();
        public static final Parcelable.Creator CREATOR = SWS.A00(28);

        public final int describeContents() {
            return 0;
        }

        public FullSheet() {
            super(REW.FULL_SHEET);
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("IABViewModeLaunchConfig(initViewMode=");
            return AnonymousClass7TG.A0n(this.A00, A1A);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class HalfSheet extends IABViewModeLaunchConfig {
        public static final HalfSheet A00 = new HalfSheet();
        public static final Parcelable.Creator CREATOR = SWS.A00(29);

        public final int describeContents() {
            return 0;
        }

        public HalfSheet() {
            super(REW.HALF_SHEET);
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("IABViewModeLaunchConfig(initViewMode=");
            return AnonymousClass7TG.A0n(this.A00, A1A);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class Peek extends IABViewModeLaunchConfig {
        public static final Peek A00 = new Peek();
        public static final Parcelable.Creator CREATOR = SWS.A00(30);

        public final int describeContents() {
            return 0;
        }

        public Peek() {
            super(REW.PEEK);
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("IABViewModeLaunchConfig(initViewMode=");
            return AnonymousClass7TG.A0n(this.A00, A1A);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public IABViewModeLaunchConfig(REW rew) {
        this.A00 = rew;
    }
}
