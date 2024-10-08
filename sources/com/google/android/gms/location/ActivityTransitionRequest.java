package com.google.android.gms.location;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.JTR;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Comparator A03 = new Object();
    public static final Parcelable.Creator CREATOR = SWR.A00(61);
    public final String A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
                if (!SA1.A01(this.A01, activityTransitionRequest.A01) || !SA1.A01(this.A00, activityTransitionRequest.A00) || !SA1.A01(this.A02, activityTransitionRequest.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.A01.hashCode() * 31) + JTR.A0G(this.A00)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A01);
        String str = this.A00;
        String valueOf2 = String.valueOf(this.A02);
        StringBuilder A0q = Pxh.A0q(valueOf2, Pxf.A09(valueOf) + 61 + Pxf.A09(str));
        A0q.append("ActivityTransitionRequest [mTransitions=");
        A0q.append(valueOf);
        A0q.append(", mTag='");
        Pxf.A1P(A0q, str);
        A0q.append(", mClients=");
        A0q.append(valueOf2);
        return Pxg.A0w(A0q);
    }

    public ActivityTransitionRequest(List list, List list2, String str) {
        List unmodifiableList;
        AnonymousClass3Qk.A03(list, "transitions can't be null");
        AnonymousClass3Qk.A08(AnonymousClass7TF.A1R(list.size()), "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(A03);
        for (Object next : list) {
            AnonymousClass3Qk.A08(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.A02 = unmodifiableList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0E(parcel, this.A01, 1, false);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A0E(parcel, this.A02, 3, false);
        C301145yd.A06(parcel, A032);
    }
}
