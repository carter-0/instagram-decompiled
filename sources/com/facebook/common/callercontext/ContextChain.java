package com.facebook.common.callercontext;

import X.002;
import X.2Ob;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContextChain implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(24);
    public String A00;
    public Map A01;
    public String A02;
    public final ContextChain A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ContextChain contextChain = (ContextChain) obj;
            if (!2Ob.A00(this.A00, contextChain.A00) || !2Ob.A00(this.A03, contextChain.A03)) {
                return false;
            }
        }
        return true;
    }

    public final ContextChain A00() {
        ContextChain contextChain = this.A03;
        if (contextChain == null) {
            return this;
        }
        return contextChain.A00();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00});
    }

    public final String toString() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String str2 = this.A00;
        this.A02 = str2;
        ContextChain contextChain = this.A03;
        if (contextChain == null) {
            return str2;
        }
        String A0T = 002.A0T(contextChain.toString(), this.A02, '/');
        this.A02 = A0T;
        return A0T;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A03, i);
    }

    public ContextChain(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    public ContextChain(ContextChain contextChain, String str, String str2) {
        Map map;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = 002.A0g(str, ":", str2);
        this.A03 = contextChain;
        if (contextChain != null && (map = contextChain.A01) != null) {
            this.A01 = new HashMap(map);
        }
    }

    public ContextChain(ContextChain contextChain, String str) {
        this.A05 = "serialized_tag";
        this.A04 = "serialized_name";
        this.A00 = str;
        this.A03 = contextChain;
        Map map = contextChain.A01;
        if (map != null) {
            this.A01 = new HashMap(map);
        }
    }
}
