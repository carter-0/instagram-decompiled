package X;

import android.os.Bundle;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.File;

/* renamed from: X.UvB  reason: case insensitive filesystem */
public final class C16455UvB extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelPicsPleaseResponseShareFragment";
    public Medium A00;
    public User A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public final String getModuleName() {
        return "reel_pics_please_response_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        Medium medium;
        int A022 = AnonymousClass0fD.A02(-413566388);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        boolean z = requireArguments.getBoolean("reel_pics_please_response_share_fragment_arguments_is_video");
        String string = requireArguments.getString("reel_pics_please_response_share_fragment_arguments_preset_medium_file_path");
        if (string != null) {
            File file = new File(string);
            int i = 1;
            if (z) {
                i = 3;
            }
            medium = C282665Eg.A03(file, i, 0);
        } else {
            medium = null;
        }
        this.A00 = medium;
        UserSession userSession = this.A00;
        0qQ.A07(userSession);
        this.A01 = 17h.A00(userSession).A02(requireArguments.getString("reel_pics_please_response_share_fragment_arguments_responder_user_id"));
        this.A05 = requireArguments.getString("reel_pics_please_response_share_fragment_arguments_sticker_prompt");
        this.A02 = DbV.A0o(requireArguments, "reel_pics_please_response_share_fragment_arguments_sticker_prompt_background_color");
        this.A03 = requireArguments.getString("reel_pics_please_response_share_fragment_arguments_original_question_id");
        this.A04 = requireArguments.getString("reel_pics_please_response_share_fragment_arguments_question_response_id");
        AnonymousClass0fD.A09(463760347, A022);
    }
}
