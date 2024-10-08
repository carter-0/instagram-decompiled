package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.7j9  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C339157j9 {
    public static AnonymousClass6M3 A01(Context context, UserSession userSession, C354808Nl r6) {
        AnonymousClass6M3 r2 = new AnonymousClass6M3(context, (Drawable) r6, context.getResources().getDimensionPixelSize(R.dimen.avatar_upsell_sheet_sp_image_width));
        r2.A01(A00(userSession, r6));
        r2.A08 = r6.BTZ().A0M();
        r2.A02(R.dimen.button_text_size);
        r2.A03 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        return r2;
    }

    public static int A00(UserSession userSession, C354808Nl r4) {
        CameraTool cameraTool;
        Integer A0N = AnonymousClass0t1.A01.A01(userSession).A0N();
        boolean z = false;
        if (A0N == AnonymousClass05K.A0C) {
            z = true;
        }
        PromptStickerModel BTZ = r4.BTZ();
        if (BTZ.A0B && !BTZ.A0L()) {
            GenAIToolInfoDictIntf B91 = BTZ.A00.B91();
            if (B91 != null) {
                cameraTool = B91.C8A();
            } else {
                cameraTool = null;
            }
            if (cameraTool != CameraTool.MEMU_IN_FEED_WITH_MIMICRY) {
                return 2131970882;
            }
        }
        if (BTZ.A0M() && !BTZ.A0L() && !z) {
            return 2131974556;
        }
        if (BTZ.A0M() && !BTZ.A0L() && z) {
            return 2131974555;
        }
        if (BTZ.A0M() && BTZ.A0L() && !z) {
            return 2131974566;
        }
        if (BTZ.A0M() && BTZ.A0L() && z) {
            return 2131974565;
        }
        if (BTZ.A0H() && z) {
            return 2131955637;
        }
        if (BTZ.A0H() && !z) {
            return 2131955638;
        }
        if (!BTZ.A0H() && z) {
            return 2131970896;
        }
        if (BTZ.A03() == StoryPromptType.MAGIC_MOD_BACKDROP) {
            return 2131970894;
        }
        if (BTZ.A03() == StoryPromptType.MAGIC_MOD_RESTYLE) {
            return 2131970895;
        }
        return 2131970897;
    }

    public static boolean A02(C354808Nl r1) {
        PromptStickerModel BTZ = r1.BTZ();
        if (!BTZ.A0M() || BTZ.A0L()) {
            return false;
        }
        return true;
    }
}
