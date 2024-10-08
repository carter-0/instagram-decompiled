package com.instagram.tagging.model;

import X.17Z;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.C14502TxO;
import X.C62630Kj1;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.sponsored.AdTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import java.util.List;

public abstract class Tag implements Parcelable {
    public PointF A00;

    public final int describeContents() {
        return 0;
    }

    public PointF A00() {
        if ((this instanceof PeopleTag) || (this instanceof AdTag) || !(this instanceof MediaSuggestedProductTag)) {
            return this.A00;
        }
        return ((MediaSuggestedProductTag) this).A00;
    }

    public C62630Kj1 A01() {
        if (this instanceof PeopleTag) {
            return C62630Kj1.PEOPLE;
        }
        if (this instanceof AdTag) {
            return C62630Kj1.AD;
        }
        if (this instanceof MediaSuggestedProductTag) {
            return C62630Kj1.SUGGESTED_PRODUCT;
        }
        return C62630Kj1.FB_USER_TAG;
    }

    public TaggableModel A02() {
        if (this instanceof PeopleTag) {
            return ((PeopleTag) this).A00;
        }
        if (this instanceof MediaSuggestedProductTag) {
            return ((MediaSuggestedProductTag) this).A07();
        }
        if (this instanceof AdTag) {
            return ((AdTag) this).A00;
        }
        return ((FBUserTag) this).A02;
    }

    public String A03() {
        if (this instanceof PeopleTag) {
            return CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
        }
        if (this instanceof MediaSuggestedProductTag) {
            return "product_id";
        }
        if (this instanceof AdTag) {
            return "ad_id";
        }
        return "tag_id";
    }

    public String A04() {
        if (this instanceof AdTag) {
            String title = ((AdTag) this).A00.A00.getTitle();
            if (title != null) {
                return title;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (this instanceof PeopleTag) {
            return ((PeopleTag) this).A00.A04;
        } else {
            if (!(this instanceof MediaSuggestedProductTag)) {
                return ((FBUserTag) this).A02.A01;
            }
            List list = ((MediaSuggestedProductTag) this).A02;
            if (list == null || list.isEmpty()) {
                return null;
            }
            C14502TxO.A00(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A01);
            return C14502TxO.A00(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A01).A0J;
        }
    }

    public void A05(17Z r4) {
        if (this instanceof PeopleTag) {
            PeopleTag peopleTag = (PeopleTag) this;
            if (peopleTag.A08() != null) {
                r4.A0S(AnonymousClass000.A00(1817), peopleTag.A02);
                r4.A0q("categories");
                r4.A0b();
                r4.A0t(peopleTag.A08());
                r4.A0Y();
            }
        }
    }

    public void A06(TaggableModel taggableModel) {
        if ((this instanceof MediaSuggestedProductTag) || (this instanceof AdTag)) {
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof PeopleTag) {
            ((PeopleTag) this).A00 = (PeopleTag.UserInfo) taggableModel;
        } else {
            ((FBUserTag) this).A02 = (FBUserTag.FBUserInfo) taggableModel;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        return ((Tag) obj).getId().equals(getId());
    }

    public final String getId() {
        if (!(this instanceof MediaSuggestedProductTag)) {
            return A02().getId();
        }
        MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) this;
        StringBuilder sb = new StringBuilder();
        if (mediaSuggestedProductTag.A07() != null) {
            sb.append(mediaSuggestedProductTag.A07().A0H);
        }
        PointF pointF = mediaSuggestedProductTag.A00;
        if (pointF != null) {
            sb.append(pointF.toString());
        }
        return sb.toString();
    }

    public Tag(Parcel parcel, ClassLoader classLoader) {
        A06((TaggableModel) parcel.readParcelable(classLoader));
        this.A00 = (PointF) parcel.readParcelable(classLoader);
    }

    public int hashCode() {
        return (getId().hashCode() * 31) + getClass().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(A02(), i);
        parcel.writeParcelable(this.A00, i);
    }

    public Tag() {
    }
}
