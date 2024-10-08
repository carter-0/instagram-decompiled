package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

public final class SF0 {
    public static final ImmutableSet A03 = ImmutableSet.A00("filled", "open");
    public static final ImmutableSet A04 = ImmutableSet.A01("dot", "sesame", "circle");
    public static final ImmutableSet A05 = ImmutableSet.A01("after", "before", "outside");
    public static final ImmutableSet A06 = ImmutableSet.A00("auto", NetInfoModule.CONNECTION_TYPE_NONE);
    public static final Pattern A07 = Pattern.compile("\\s+");
    public final int A00;
    public final int A01;
    public final int A02;

    public SF0(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }
}
