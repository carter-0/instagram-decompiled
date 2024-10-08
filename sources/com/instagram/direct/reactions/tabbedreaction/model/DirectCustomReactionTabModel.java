package com.instagram.direct.reactions.tabbedreaction.model;

import X.0oU;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;

public final class DirectCustomReactionTabModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(5);
    public final DirectCountBasedReaction A00;
    public final TabType A01;

    public enum TabType implements Parcelable {
        ALL_TAB,
        CUSTOM_EMOJI_TAB;
        
        public static final Parcelable.Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            AnonymousClass7TE.A1T(parcel, this);
        }

        /* access modifiers changed from: public */
        static {
            TabType[] tabTypeArr;
            A00 = 0oU.A00(tabTypeArr);
            CREATOR = new W6E(6);
        }
    }

    public DirectCustomReactionTabModel(DirectCountBasedReaction directCountBasedReaction, TabType tabType) {
        0qQ.A0B(tabType, 2);
        this.A00 = directCountBasedReaction;
        this.A01 = tabType;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectCustomReactionTabModel) {
                DirectCustomReactionTabModel directCustomReactionTabModel = (DirectCustomReactionTabModel) obj;
                if (!0qQ.A0K(this.A00, directCustomReactionTabModel.A00) || this.A01 != directCustomReactionTabModel.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        this.A01.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }
}
