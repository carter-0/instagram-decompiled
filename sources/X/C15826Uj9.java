package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.question.model.QuestionResponsesModel;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Uj9  reason: case insensitive filesystem */
public final class C15826Uj9 extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C15826Uj9(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A05 = z;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        G85 g85;
        String str;
        FragmentActivity activity;
        String str2;
        if (this.A00 != 0) {
            File file = (File) obj;
            try {
                str2 = file.getCanonicalPath();
            } catch (IOException e) {
                0wb.A06("ReelQuestionResponseShareHelper_getFilePath", AnonymousClass000.A00(2255), e);
                str2 = file.getAbsolutePath();
            }
            Bundle bundle = (Bundle) this.A02;
            bundle.putString("reel_pics_please_response_share_fragment_arguments_preset_medium_file_path", str2);
            bundle.putBoolean("reel_pics_please_response_share_fragment_arguments_is_video", this.A05);
            C17801VgE vgE = (C17801VgE) this.A03;
            bundle.putString("reel_pics_please_response_share_fragment_arguments_responder_user_id", vgE.A00.A04.getId());
            QuestionResponsesModel questionResponsesModel = vgE.A01;
            bundle.putString("reel_pics_please_response_share_fragment_arguments_sticker_prompt", questionResponsesModel.A07);
            bundle.putInt("reel_pics_please_response_share_fragment_arguments_sticker_prompt_background_color", vgE.A00());
            bundle.putString("reel_pics_please_response_share_fragment_arguments_original_question_id", questionResponsesModel.A08);
            bundle.putString("reel_pics_please_response_share_fragment_arguments_question_response_id", vgE.A00.A07);
            DbU.A0x((Activity) this.A01, bundle, (0lg) this.A04, TransparentModalActivity.class, C273654mx.A00(3232));
            return;
        }
        SmartLockPluginImpl smartLockPluginImpl = (1WP) obj;
        0qQ.A0B(smartLockPluginImpl, 0);
        if (!smartLockPluginImpl.A00) {
            g85 = (G85) this.A02;
            str = "SmartLock disabled";
        } else {
            Fragment fragment = (Fragment) this.A03;
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                g85 = (G85) this.A02;
                str = "Activity is null";
            } else {
                AnonymousClass0aP r4 = (AnonymousClass0aP) this.A04;
                smartLockPluginImpl.getSmartLockBroker(activity, new C50524Fdk(fragment, r4, (G85) this.A02, (C46634DiE) this.A01, this.A05), r4, false);
                return;
            }
        }
        g85.CJG(str);
    }
}
