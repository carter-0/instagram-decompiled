package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Uv8  reason: case insensitive filesystem */
public final class C16452Uv8 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelFundraiserPublicThanksStickerFragment";
    public int A00;
    public int A01;
    public int A02;
    public 28D A03;
    public User A04;

    public final String getModuleName() {
        return "reel_fundraiser_public_thanks_sticker_fragment_module";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2027587138);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = C13991Tnr.A09(bundle2, AnonymousClass000.A00(118));
            this.A01 = bundle2.getInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_GRADIENT_START_BACKGROUND_COLOR");
            this.A00 = bundle2.getInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_GRADIENT_END_BACKGROUND_COLOR");
            this.A02 = bundle2.getInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_MESSAGE_COLOR");
            try {
                Parcelable.Creator creator = User.CREATOR;
                this.A04 = 1aC.A04(bundle2.getString("ReelFundraiserShareConstants.ARGUMENTS_KEY_FUNDRAISER_RECIPIENT"));
                AnonymousClass0fD.A09(677940091, A022);
            } catch (IOException unused) {
                0wb.A03(__redex_internal_original_name, "Could not parse json User for the donor public thanks fundraiser sticker.");
                AnonymousClass0fD.A09(-288059215, A022);
            }
        } else {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-1231978293, A022);
            throw A0y;
        }
    }
}
