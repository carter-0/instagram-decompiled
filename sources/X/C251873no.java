package X;

import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: X.3no  reason: invalid class name and case insensitive filesystem */
public final class C251873no extends C251883np {
    public final 1uY A00;
    public final File A01;
    public final Pattern A02 = Pattern.compile("<falco_acs_placeholder_claim>");
    public final DefaultFalcoAcsProvider A03;

    public C251873no(DefaultFalcoAcsProvider defaultFalcoAcsProvider, C251593nM r3, 1uY r4, File file) {
        super(r3, file);
        this.A01 = file;
        this.A00 = r4;
        this.A03 = defaultFalcoAcsProvider;
    }
}
