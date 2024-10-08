package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class Cu5 {
    public ImageUrl A00;
    public final String A01;

    public Cu5(C45295Cty cty) {
        String str;
        this.A01 = cty.A01;
        C45224Csf csf = cty.A00;
        if (csf != null && (str = csf.A00) != null) {
            this.A00 = new SimpleImageUrl(str);
        }
    }
}
