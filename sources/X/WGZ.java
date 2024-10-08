package X;

import android.os.Debug;

public final class WGZ implements 2Q6 {
    public final /* synthetic */ void initialize(boolean z, boolean z2, int i) {
    }

    public final /* synthetic */ void prepareForDump(2QM r1, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
    }

    public final /* synthetic */ int waitForDump(StringBuilder sb) {
        return 0;
    }

    public final int dumpJavaHeap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb) {
        Debug.dumpHprofData(charSequence.toString());
        return 0;
    }

    public final /* synthetic */ int dumpJavaHeapAsync(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb, boolean z) {
        Debug.dumpHprofData(charSequence.toString());
        return 0;
    }
}
