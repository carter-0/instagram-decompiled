package com.facebook.location.platform.api;

import X.AnonymousClass7TE;
import X.Pxg;
import X.SWY;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class Coordinate extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(Coordinate.class);
    @SafeParcelable.Field(5)
    public final float confidence;
    @SafeParcelable.Field(1)
    public final long timeStamp;
    @SafeParcelable.Field(2)
    public final long utcTimeStamp;
    @SafeParcelable.Field(3)
    public final double x;
    @SafeParcelable.Field(4)
    public final double y;

    public Coordinate(long j, double d, double d2) {
        this(j, -1, d, d2, 1.0f);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Coordinate{timeStamp=");
        A1A.append(this.timeStamp);
        A1A.append(", utcTimeStamp=");
        A1A.append(this.utcTimeStamp);
        A1A.append(", x=");
        A1A.append(this.x);
        A1A.append(", y=");
        A1A.append(this.y);
        A1A.append(", confidence=");
        A1A.append(this.confidence);
        return Pxg.A0x(A1A);
    }

    public Coordinate(long j, long j2, double d, double d2, float f) {
        this.timeStamp = j;
        this.utcTimeStamp = j2;
        this.x = d;
        this.y = d2;
        this.confidence = f;
    }

    public Coordinate(double d, double d2) {
        this(-1, d, d2);
    }

    public Coordinate() {
        this.timeStamp = 0;
        this.utcTimeStamp = 0;
        this.x = 0.0d;
        this.y = 0.0d;
        this.confidence = 0.0f;
    }
}
