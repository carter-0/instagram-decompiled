package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model;

import X.0Yt;
import X.0qQ;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class TypedParameterMap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(8);
    public Map A00;
    public Map A01;
    public Map A02;
    public Map A03;
    public Map A04;
    public Map A05;
    public Map A06;

    public TypedParameterMap(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7) {
        0qQ.A0B(map, 1);
        0qQ.A0B(map2, 2);
        0qQ.A0B(map3, 3);
        0qQ.A0B(map4, 4);
        0qQ.A0B(map5, 5);
        0qQ.A0B(map6, 6);
        0qQ.A0B(map7, 7);
        this.A02 = map;
        this.A01 = map2;
        this.A03 = map3;
        this.A00 = map4;
        this.A04 = map5;
        this.A05 = map6;
        this.A06 = map7;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Map map = this.A02;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeFloat(((Number) entry.getValue()).floatValue());
        }
        Map map2 = this.A01;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeFloatArray((float[]) entry2.getValue());
        }
        Map map3 = this.A03;
        parcel.writeInt(map3.size());
        for (Map.Entry entry3 : map3.entrySet()) {
            parcel.writeString((String) entry3.getKey());
            parcel.writeInt(((Number) entry3.getValue()).intValue());
        }
        Map map4 = this.A00;
        parcel.writeInt(map4.size());
        for (Map.Entry entry4 : map4.entrySet()) {
            parcel.writeString((String) entry4.getKey());
            parcel.writeInt(((Boolean) entry4.getValue()).booleanValue() ? 1 : 0);
        }
        Map map5 = this.A04;
        parcel.writeInt(map5.size());
        for (Map.Entry entry5 : map5.entrySet()) {
            parcel.writeString((String) entry5.getKey());
            parcel.writeString((String) entry5.getValue());
        }
        Map map6 = this.A05;
        parcel.writeInt(map6.size());
        for (Map.Entry entry6 : map6.entrySet()) {
            parcel.writeString((String) entry6.getKey());
            parcel.writeString((String) entry6.getValue());
        }
        Map map7 = this.A06;
        parcel.writeInt(map7.size());
        for (Map.Entry entry7 : map7.entrySet()) {
            parcel.writeString((String) entry7.getKey());
            parcel.writeString((String) entry7.getValue());
        }
    }

    public final TypedParameterMap A00() {
        return new TypedParameterMap(0Yt.A03(this.A02), 0Yt.A03(this.A01), 0Yt.A03(this.A03), 0Yt.A03(this.A00), 0Yt.A03(this.A04), 0Yt.A03(this.A05), 0Yt.A03(this.A06));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypedParameterMap) {
            TypedParameterMap typedParameterMap = (TypedParameterMap) obj;
            if (0qQ.A0K(this.A02, typedParameterMap.A02)) {
                Map map = this.A01;
                Map map2 = typedParameterMap.A01;
                if (map.size() == map2.size()) {
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!Arrays.equals((float[]) entry.getValue(), (float[]) map2.get(entry.getKey()))) {
                                break;
                            }
                        } else if (!0qQ.A0K(this.A03, typedParameterMap.A03) || !0qQ.A0K(this.A00, typedParameterMap.A00) || !0qQ.A0K(this.A04, typedParameterMap.A04) || !0qQ.A0K(this.A05, typedParameterMap.A05) || !0qQ.A0K(this.A06, typedParameterMap.A06)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode();
        for (Map.Entry entry : this.A01.entrySet()) {
            hashCode = (((hashCode * 31) + ((String) entry.getKey()).hashCode()) * 31) + Arrays.hashCode((float[]) entry.getValue());
        }
        return (((((((((hashCode * 31) + this.A03.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode();
    }

    public TypedParameterMap() {
        this(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }
}
