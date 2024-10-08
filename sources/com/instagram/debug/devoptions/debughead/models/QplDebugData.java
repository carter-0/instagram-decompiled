package com.instagram.debug.devoptions.debughead.models;

import X.0XY;
import X.0wb;
import X.AnonymousClass000;
import X.AnonymousClass0Z1;
import X.AnonymousClass7TE;
import X.RXC;
import android.util.JsonWriter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QplDebugData {
    public int mDuration;
    public String mEndThreadName;
    public ArrayList mExtras;
    public short mLastActionId;
    public final int mMarkerId;
    public final String mMarkerName;
    public final long mMonotonicStartTimestamp;
    public final List mPoints;
    public String mStartThreadName;
    public final int mUniqueIdentifier;

    public void addPoint(QplPointDebugData qplPointDebugData) {
        this.mPoints.add(qplPointDebugData);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QplDebugData) || ((QplDebugData) obj).mUniqueIdentifier != this.mUniqueIdentifier) {
            return false;
        }
        return true;
    }

    public String getStatus() {
        return AnonymousClass0Z1.A00(this.mLastActionId);
    }

    public int hashCode() {
        return Integer.valueOf(this.mUniqueIdentifier).hashCode();
    }

    public String toFormattedString() {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("\t");
        try {
            jsonWriter.beginObject();
            jsonWriter.name("action").value(AnonymousClass0Z1.A00(this.mLastActionId));
            jsonWriter.name("annotations").beginObject();
            ArrayList arrayList = this.mExtras;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jsonWriter.name(AnonymousClass7TE.A18(it)).value(AnonymousClass7TE.A18(it));
                }
            }
            jsonWriter.endObject();
            jsonWriter.name("points").beginArray();
            for (QplPointDebugData qplPointDebugData : this.mPoints) {
                jsonWriter.beginObject();
                jsonWriter.name(PublicKeyCredentialControllerUtility.JSON_KEY_NAME).value(qplPointDebugData.mName);
                if (!qplPointDebugData.mData.isEmpty()) {
                    jsonWriter.name("data").value(qplPointDebugData.mData);
                }
                jsonWriter.name("timestamp").value(qplPointDebugData.mTimestamp - this.mMonotonicStartTimestamp);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.name(AnonymousClass000.A00(4107)).beginObject();
            jsonWriter.name("end").value(this.mEndThreadName);
            jsonWriter.name("start").value(this.mStartThreadName);
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException e) {
            0wb.A06("QplDebugData", "failed to format QPL event details", e);
        }
        return stringWriter.toString();
    }

    public QplDebugData(0XY r3) {
        ArrayList arrayList;
        this.mMonotonicStartTimestamp = r3.BU5();
        this.mMarkerId = r3.getMarkerId();
        this.mUniqueIdentifier = r3.CBY();
        this.mMarkerName = RXC.A00(r3.getMarkerId());
        this.mDuration = r3.AzN();
        this.mLastActionId = r3.BKb();
        if (r3.B3E() != null) {
            arrayList = AnonymousClass7TE.A1D(r3.B3E());
        } else {
            arrayList = null;
        }
        this.mExtras = arrayList;
        this.mStartThreadName = Thread.currentThread().getName();
        this.mPoints = AnonymousClass7TE.A1C();
    }

    public void updateData(0XY r2) {
        ArrayList arrayList;
        this.mDuration = r2.AzN();
        this.mLastActionId = r2.BKb();
        if (r2.B3E() != null) {
            arrayList = AnonymousClass7TE.A1D(r2.B3E());
        } else {
            arrayList = null;
        }
        this.mExtras = arrayList;
        this.mEndThreadName = Thread.currentThread().getName();
    }
}
