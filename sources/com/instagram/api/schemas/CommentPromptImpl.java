package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.CW8;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CommentPromptImpl extends AnonymousClass0T0 implements Parcelable, CommentPrompt {
    public static final Parcelable.Creator CREATOR = DE7.A00(18);
    public final Integer A00;
    public final String A01;

    public final CommentPromptImpl F20() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentPromptImpl) {
                CommentPromptImpl commentPromptImpl = (CommentPromptImpl) obj;
                if (!0qQ.A0K(this.A01, commentPromptImpl.A01) || !0qQ.A0K(this.A00, commentPromptImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final String BaV() {
        return this.A01;
    }

    public final Integer BmI() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCommentPrompt", CW8.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public CommentPromptImpl(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
