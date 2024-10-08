package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.Uv5  reason: case insensitive filesystem */
public final class C16449Uv5 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelShareFundraiserStickerFragment";
    public 28D A00;
    public C19475WaN A01;
    public boolean A02;

    public final String getModuleName() {
        return "reel_fundraiser_duplicate_sticker_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1634779577);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = AnonymousClass7TH.A07(bundle2, AnonymousClass000.A00(118));
            this.A02 = bundle2.getBoolean("ReelFundraiserShareConstants.ARGUMENTS_KEY_IS_DUPLICATE_STICKER", false);
            try {
                0c5 r3 = 0c9.A04;
                UserSession userSession = this.A00;
                0qQ.A07(userSession);
                String string = bundle2.getString("ReelFundraiserShareConstants.ARGUMENTS_KEY_FUNDRAISER_MODEL");
                if (string != null) {
                    AnonymousClass8YF parseFromJson = AB9.parseFromJson(r3.A01(userSession, string));
                    0qQ.A07(parseFromJson);
                    this.A01 = new C19475WaN(parseFromJson);
                    AnonymousClass0fD.A09(1641886562, A022);
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                AnonymousClass0fD.A09(1875529236, A022);
                throw illegalStateException;
            } catch (IOException unused) {
                0wb.A03(__redex_internal_original_name, "Could not parse json User for the donor duplicate fundraiser sticker.");
                AnonymousClass0fD.A09(1869236524, A022);
            }
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Required value was null.");
            AnonymousClass0fD.A09(-954087405, A022);
            throw illegalStateException2;
        }
    }
}
