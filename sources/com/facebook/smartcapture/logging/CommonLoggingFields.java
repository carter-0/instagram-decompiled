package com.facebook.smartcapture.logging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.Pxf;
import X.Pxi;
import X.RF2;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CommonLoggingFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CommonLoggingFields$Companion$CREATOR$1();
    public static final Companion Companion = new Object();
    public static final CommonLoggingFields NO_OP_LOGGING_FIELDS = new CommonLoggingFields(RF2.LOW_END, "", "", (String) null, (Bundle) null, (String) null);
    public Map _tagsMap;
    public RF2 featureLevel;
    public String flowType;
    public String product;
    public String sessionId;
    public String submissionId;
    public Bundle tags;

    public final class Companion {
        public final Parcelable.Creator getCREATOR() {
            return CommonLoggingFields.CREATOR;
        }

        public final CommonLoggingFields getNO_OP_LOGGING_FIELDS() {
            return CommonLoggingFields.NO_OP_LOGGING_FIELDS;
        }

        /* access modifiers changed from: private */
        public final Map bundleToMap(Bundle bundle) {
            HashMap A1E = AnonymousClass7TE.A1E();
            if (bundle != null) {
                Iterator A0t = Pxf.A0t(bundle);
                while (A0t.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(A0t);
                    A1E.put(A18, bundle.getString(A18));
                }
            }
            return A1E;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public CommonLoggingFields(Parcel parcel) {
        0qQ.A0B(parcel, 1);
        RF2 rf2 = (RF2) parcel.readSerializable();
        if (rf2 != null) {
            this.featureLevel = rf2;
            String readString = parcel.readString();
            if (readString != null) {
                this.flowType = readString;
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    this.product = readString2;
                    this.sessionId = parcel.readString();
                    Bundle A0D = Pxi.A0D(parcel, String.class);
                    this.tags = A0D;
                    this._tagsMap = Companion.bundleToMap(A0D);
                    this.submissionId = parcel.readString();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public int describeContents() {
        return 0;
    }

    public final void setFeatureLevel(RF2 rf2) {
        0qQ.A0B(rf2, 0);
        this.featureLevel = rf2;
    }

    public final void setFlowType(String str) {
        0qQ.A0B(str, 0);
        this.flowType = str;
    }

    public final void setProduct(String str) {
        0qQ.A0B(str, 0);
        this.product = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeSerializable(this.featureLevel);
        parcel.writeString(this.flowType);
        parcel.writeString(this.product);
        parcel.writeString(this.sessionId);
        parcel.writeBundle(this.tags);
        parcel.writeString(this.submissionId);
    }

    public static final Parcelable.Creator getCREATOR() {
        return CREATOR;
    }

    public final RF2 getFeatureLevel() {
        return this.featureLevel;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public final Bundle getTags() {
        return this.tags;
    }

    public final Map getTagsMap() {
        return Pxf.A0x(this._tagsMap);
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSubmissionId(String str) {
        this.submissionId = str;
    }

    public final void setTags(Bundle bundle) {
        this.tags = bundle;
    }

    public CommonLoggingFields(RF2 rf2, String str, String str2, String str3, Bundle bundle, String str4) {
        AnonymousClass7TG.A1U(rf2, str, str2);
        this.featureLevel = rf2;
        this.flowType = str;
        this.product = str2;
        this.sessionId = str3;
        this.tags = bundle;
        this._tagsMap = Companion.bundleToMap(bundle);
        this.submissionId = str4;
    }
}
