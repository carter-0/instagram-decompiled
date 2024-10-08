package X;

import android.os.Bundle;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import java.io.File;
import java.io.Serializable;

/* renamed from: X.Uv3  reason: case insensitive filesystem */
public final class C16447Uv3 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelJoinChatShareFragment";
    public 28D A00;
    public JoinChatStickerData A01;
    public File A02;

    public final String getModuleName() {
        return "reels_join_chat_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        File file;
        int A022 = AnonymousClass0fD.A02(1069475831);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("ReelJoinChatShareConstants.ARGUMENTS_KEY_JOIN_CHAT_BACKGROUND_FILE_PATH");
        if (serializable instanceof File) {
            file = (File) serializable;
        } else {
            file = null;
        }
        this.A02 = file;
        this.A00 = C13991Tnr.A0A(requireArguments, AnonymousClass000.A00(1017));
        this.A01 = (JoinChatStickerData) C320236s2.A00(requireArguments, JoinChatStickerData.class, AnonymousClass000.A00(1018));
        AnonymousClass0fD.A09(1218977838, A022);
    }
}
