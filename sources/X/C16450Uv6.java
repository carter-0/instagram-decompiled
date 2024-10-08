package X;

import android.os.Bundle;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import java.io.File;

/* renamed from: X.Uv6  reason: case insensitive filesystem */
public final class C16450Uv6 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelMessageShareFragment";
    public 28D A00;
    public Capabilities A01;
    public MessageShareStickerData A02;
    public File A03;

    public final String getModuleName() {
        return "reel_message_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(982397677);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C13991Tnr.A0A(requireArguments, AnonymousClass000.A00(2458));
        this.A03 = new File(JTP.A0m(requireArguments, AnonymousClass000.A00(2457)));
        MessageShareStickerData messageShareStickerData = (MessageShareStickerData) requireArguments.getParcelable(AnonymousClass000.A00(2459));
        if (messageShareStickerData != null) {
            this.A02 = messageShareStickerData;
            this.A01 = messageShareStickerData.A04;
            AnonymousClass0fD.A09(1313624228, A022);
            return;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A09(45043684, A022);
        throw A0h;
    }
}
