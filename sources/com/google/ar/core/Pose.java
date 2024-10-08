package com.google.ar.core;

import java.util.Locale;

public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.a);
    public final Quaternion quaternion;
    public final float[] translation;

    public Pose(float[] fArr, Quaternion quaternion2) {
        this.translation = fArr;
        this.quaternion = quaternion2;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        float[] fArr = this.translation;
        Float valueOf = Float.valueOf(fArr[0]);
        Float valueOf2 = Float.valueOf(fArr[1]);
        Float valueOf3 = Float.valueOf(fArr[2]);
        Quaternion quaternion2 = this.quaternion;
        return String.format(locale, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", new Object[]{valueOf, valueOf2, valueOf3, Float.valueOf(quaternion2.x), Float.valueOf(quaternion2.y), Float.valueOf(quaternion2.z), Float.valueOf(quaternion2.w)});
    }
}
