package X;

import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class ENQ extends C50596FfB {
    public static final Map A07 = new C51636FxU();
    public final String A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();
    public final AtomicReference A02 = new AtomicReference(C48075EUt.PENDING);
    public final ImageUrl A03;
    public final C48103EVv A04;
    public final String A05;
    public final String A06;

    public final String AXz() {
        return "PENDING".toLowerCase(Locale.US);
    }

    public final int Ad8() {
        int ordinal = this.A04.ordinal();
        if (ordinal == 0) {
            return R.drawable.instagram_facebook_circle_filled_12;
        }
        if (ordinal != 1) {
            return 0;
        }
        return R.drawable.google_glyph_gray;
    }

    public final String B0m() {
        return "";
    }

    public final ImageUrl BGJ() {
        return this.A03;
    }

    public final String Bby() {
        return "";
    }

    public final boolean EHj() {
        return false;
    }

    public final String getFullName() {
        return this.A05;
    }

    public final String getUserId() {
        return "";
    }

    public final String getUsername() {
        return this.A06;
    }

    public ENQ(ImageUrl imageUrl, C48103EVv eVv, String str, String str2, String str3) {
        this.A06 = str;
        this.A05 = str2 == null ? "" : str2;
        this.A03 = imageUrl;
        this.A00 = str3;
        this.A04 = eVv;
    }
}
