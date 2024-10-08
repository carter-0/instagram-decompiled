package com.instagram.discovery.filters.intf;

import X.2PP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FilterConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(28);
    public final Map A00;
    public final Map A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return 2PP.A00(this.A00, filterConfig.A00) && 2PP.A00(this.A01, filterConfig.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
        parcel.writeMap(this.A01);
    }

    public FilterConfig(Map map) {
        Map map2;
        Object key;
        Object value;
        boolean z;
        this.A00 = new HashMap();
        this.A01 = new HashMap();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if ("true".equalsIgnoreCase((String) A1J.getValue())) {
                map2 = this.A01;
                key = A1J.getKey();
                z = true;
            } else if ("false".equalsIgnoreCase((String) A1J.getValue())) {
                map2 = this.A01;
                key = A1J.getKey();
                z = false;
            } else {
                map2 = this.A00;
                key = A1J.getKey();
                value = A1J.getValue();
                map2.put(key, value);
            }
            value = Boolean.valueOf(z);
            map2.put(key, value);
        }
    }

    public FilterConfig(Parcel parcel) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        HashMap hashMap2 = new HashMap();
        this.A01 = hashMap2;
        Class<Map> cls = Map.class;
        parcel.readMap(hashMap, cls.getClassLoader());
        parcel.readMap(hashMap2, cls.getClassLoader());
    }
}
