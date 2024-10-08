package com.instagram.business.promote.model;

import X.00k;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51967G9n;
import X.C51969G9p;
import X.JTR;
import X.Pxf;
import X.W6D;
import X.X3S;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class PromoteState implements Parcelable {
    public static final W6D CREATOR = new W6D(50);
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Map A0A = Collections.synchronizedMap(new HashMap());

    public static final void A00(PromoteData promoteData) {
        0qQ.A0B(promoteData, 0);
        PromoteDataSnapshot promoteDataSnapshot = promoteData.A0s;
        if (promoteDataSnapshot == null) {
            promoteDataSnapshot = new PromoteDataSnapshot();
            promoteData.A0s = promoteDataSnapshot;
        }
        promoteDataSnapshot.A07 = promoteData.A0i;
        promoteDataSnapshot.A0A = promoteData.A1I;
        promoteDataSnapshot.A0C = promoteData.A2e;
        promoteDataSnapshot.A05 = promoteData.A0b;
        promoteDataSnapshot.A06 = promoteData.A0e;
        promoteDataSnapshot.A0B = promoteData.A1Z;
        promoteDataSnapshot.A01 = promoteData.A0A;
        promoteDataSnapshot.A00 = promoteData.A07;
        promoteDataSnapshot.A0D.clear();
        PromoteDataSnapshot promoteDataSnapshot2 = promoteData.A0s;
        if (promoteDataSnapshot2 != null) {
            List list = promoteDataSnapshot2.A0D;
            List list2 = promoteData.A21;
            0qQ.A06(list2);
            list.addAll(list2);
            PromoteDataSnapshot promoteDataSnapshot3 = promoteData.A0s;
            if (promoteDataSnapshot3 != null) {
                promoteDataSnapshot3.A03 = promoteData.A0U;
                promoteDataSnapshot3.A02 = promoteData.A0T;
                promoteDataSnapshot3.A09 = promoteData.A0w;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A02(PromoteData promoteData) {
        0qQ.A0B(promoteData, 0);
        return C51967G9n.A0t(new BoostFlowType[]{BoostFlowType.DRAFT, BoostFlowType.BOOST_AGAIN}, 0).contains(promoteData.A0l);
    }

    public final void A04(XIGIGBoostDestination xIGIGBoostDestination, PromoteData promoteData) {
        0qQ.A0B(promoteData, 0);
        this.A05 = AnonymousClass7TF.A1V(xIGIGBoostDestination);
        promoteData.A0i = xIGIGBoostDestination;
        promoteData.A26.add(xIGIGBoostDestination);
        A01(this, AnonymousClass05K.A00);
    }

    public final void A05(XIGIGBoostDestination xIGIGBoostDestination, PromoteData promoteData) {
        XIGIGBoostDestination[] xIGIGBoostDestinationArr;
        XIGIGBoostDestination xIGIGBoostDestination2;
        XIGIGBoostDestination xIGIGBoostDestination3;
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal == 1) {
            xIGIGBoostDestinationArr = new XIGIGBoostDestination[1];
            xIGIGBoostDestination2 = XIGIGBoostDestination.DIRECT_MESSAGE;
            xIGIGBoostDestinationArr[0] = xIGIGBoostDestination2;
        } else if (ordinal == 12) {
            xIGIGBoostDestinationArr = new XIGIGBoostDestination[1];
            xIGIGBoostDestination2 = XIGIGBoostDestination.WHATSAPP_MESSAGE;
            xIGIGBoostDestinationArr[0] = xIGIGBoostDestination2;
        } else if (ordinal == 5) {
            xIGIGBoostDestinationArr = new XIGIGBoostDestination[]{XIGIGBoostDestination.DIRECT_MESSAGE, XIGIGBoostDestination.WHATSAPP_MESSAGE};
        } else {
            throw new Throwable("The destination should be a messaging ads objective.");
        }
        ArrayList A0q = Pxf.A0q(xIGIGBoostDestinationArr);
        if (A0q.size() == 1) {
            xIGIGBoostDestination3 = (XIGIGBoostDestination) 00k.A0I(A0q);
        } else {
            xIGIGBoostDestination3 = null;
        }
        promoteData.A0j = xIGIGBoostDestination3;
        promoteData.A20 = A0q;
        this.A07 = AnonymousClass7TE.A1b(A0q);
    }

    public final void A06(PromoteData promoteData) {
        0qQ.A0B(promoteData, 0);
        PromoteDataSnapshot promoteDataSnapshot = promoteData.A0s;
        if (promoteDataSnapshot != null) {
            A04(promoteDataSnapshot.A07, promoteData);
            PromoteDataSnapshot promoteDataSnapshot2 = promoteData.A0s;
            if (promoteDataSnapshot2 != null) {
                promoteData.A1I = promoteDataSnapshot2.A0A;
                promoteData.A0a = promoteDataSnapshot2.A04;
                promoteData.A0b = promoteDataSnapshot2.A05;
                promoteData.A2e = promoteDataSnapshot2.A0C;
                A09(promoteData, promoteDataSnapshot2.A0B);
                PromoteDataSnapshot promoteDataSnapshot3 = promoteData.A0s;
                if (promoteDataSnapshot3 != null) {
                    A08(promoteData, promoteDataSnapshot3.A01);
                    PromoteDataSnapshot promoteDataSnapshot4 = promoteData.A0s;
                    if (promoteDataSnapshot4 != null) {
                        A07(promoteData, promoteDataSnapshot4.A00);
                        List list = promoteData.A21;
                        list.clear();
                        PromoteDataSnapshot promoteDataSnapshot5 = promoteData.A0s;
                        if (promoteDataSnapshot5 != null) {
                            list.addAll(promoteDataSnapshot5.A0D);
                            PromoteDataSnapshot promoteDataSnapshot6 = promoteData.A0s;
                            if (promoteDataSnapshot6 != null) {
                                promoteData.A0U = promoteDataSnapshot6.A03;
                                promoteData.A0T = promoteDataSnapshot6.A02;
                                promoteData.A0w = promoteDataSnapshot6.A09;
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08(PromoteData promoteData, int i) {
        if (i != promoteData.A0A) {
            promoteData.A0A = i;
            this.A06 = AnonymousClass7TF.A1R(i);
            promoteData.A0I = promoteData.A07 * i;
            promoteData.A2v = false;
            A01(this, AnonymousClass05K.A0j);
        }
    }

    public final void A09(PromoteData promoteData, String str) {
        boolean z = false;
        0qQ.A0B(promoteData, 0);
        if (str != null) {
            if (!str.equals(promoteData.A1Z)) {
                z = true;
            } else {
                return;
            }
        }
        this.A02 = z;
        promoteData.A1Z = str;
        A01(this, AnonymousClass05K.A0N);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    public static final void A01(PromoteState promoteState, Integer num) {
        Iterator A0v = AnonymousClass7TF.A0v(promoteState.A0A);
        while (A0v.hasNext()) {
            X3S x3s = (X3S) JTR.A10(A0v);
            if (x3s != null) {
                x3s.Dab(promoteState, num);
            }
        }
    }

    public static final boolean A03(PromoteData promoteData) {
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE) {
            return true;
        }
        return false;
    }

    public final void A07(PromoteData promoteData, int i) {
        if (i != promoteData.A07) {
            promoteData.A07 = i;
            this.A03 = AnonymousClass7TF.A1R(i);
            if (!promoteData.A2v) {
                i *= promoteData.A0A;
            }
            promoteData.A0I = i;
            A01(this, AnonymousClass05K.A0Y);
        }
    }

    public final void A0A(X3S x3s) {
        Map map = this.A0A;
        if (!map.containsKey(C51969G9p.A0q(x3s))) {
            map.put(C51969G9p.A0q(x3s), new WeakReference(x3s));
        }
    }

    public final void A0B(X3S x3s) {
        Map map = this.A0A;
        if (map.containsKey(C51969G9p.A0q(x3s))) {
            map.remove(C51969G9p.A0q(x3s));
        }
    }

    public final void A0C(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            A01(this, AnonymousClass05K.A01);
        }
    }

    public final void A0D(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            A01(this, AnonymousClass05K.A0C);
        }
    }
}
