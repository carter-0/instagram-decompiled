package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3La  reason: invalid class name and case insensitive filesystem */
public abstract class C240473La implements C240483Lb {
    public static final Set A02 = new HashSet(Arrays.asList(new String[]{"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"}));
    public Map A00 = new HashMap();
    public C240493Lc A01;

    public final void A00(String str, Object obj) {
        if (A02.contains(str)) {
            this.A00.put(str, obj);
        }
    }

    public final Map B3S() {
        return this.A00;
    }

    public final C240493Lc BGA() {
        C240493Lc r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C240603Ln r02 = new C240603Ln(BiU(), this.A00, getWidth(), getHeight(), getSizeInBytes());
        this.A01 = r02;
        return r02;
    }

    public C240593Lm BiU() {
        return C240593Lm.A03;
    }
}
