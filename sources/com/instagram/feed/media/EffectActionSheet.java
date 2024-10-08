package com.instagram.feed.media;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.JU1;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class EffectActionSheet extends AnonymousClass0T0 implements Parcelable, EffectActionSheetIntf {
    public static final Parcelable.Creator CREATOR = new C376399Hv(10);
    public final List A00;
    public final List A01;

    public EffectActionSheet(List list, List list2) {
        0qQ.A0B(list, 1);
        0qQ.A0B(list2, 2);
        this.A00 = list;
        this.A01 = list2;
    }

    public final EffectActionSheet FE0() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EffectActionSheet) {
                EffectActionSheet effectActionSheet = (EffectActionSheet) obj;
                if (!0qQ.A0K(this.A00, effectActionSheet.A00) || !0qQ.A0K(this.A01, effectActionSheet.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A01);
    }

    public final List BfN() {
        return this.A00;
    }

    public final List BqS() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAREffectActionSheet", JU1.A00(this));
    }
}
