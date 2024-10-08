package X;

import android.content.ComponentName;

public final class TA6 implements Comparable {
    public final ComponentName A00;
    public final PzA A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.A02 - ((TA6) obj).A01.A02;
    }

    public TA6(ComponentName componentName, PzA pzA) {
        this.A01 = pzA;
        this.A00 = componentName;
    }
}
