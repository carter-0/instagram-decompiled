package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.instagram.android.R;

/* renamed from: X.LRs  reason: case insensitive filesystem */
public abstract class C64169LRs {
    public static final Toast A00(Context context, String str) {
        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.layout_invalid_audio_duration_toast);
        DbX.A13(context, DbU.A0G(A08, R.id.toast_subtitle_text), str, 2131955495);
        Toast toast = new Toast(context);
        toast.setView(A08);
        toast.setGravity(80, 0, DbS.A02(context, 130));
        toast.setDuration(1);
        toast.show();
        return toast;
    }

    public static final void A01(Context context, Exception exc, String str, boolean z) {
        String str2;
        int i;
        String str3;
        0qQ.A0B(str, 1);
        if (z) {
            str2 = "ClipMetadataCorrupt";
        } else {
            str2 = "CannotAddClip";
        }
        0kD.A07(str2, str, exc);
        if (z) {
            i = 2131955190;
            str3 = "bad_metadata";
        } else {
            i = 2131955191;
            str3 = "add_video_failed";
        }
        C59689JTv.A0F(context, str3, i);
    }

    public static final void A02(Context context, Integer num, String str, int i) {
        String str2;
        0qQ.A0B(str, 2);
        0kD.A07("ClipsOopsError", str, (Throwable) null);
        String string = context.getString(i);
        switch (num.intValue()) {
            case 0:
                str2 = "DELETE_SEGMENT_NO_UI";
                break;
            case 1:
                str2 = "STITCHED_VIDEO_ERROR";
                break;
            case 2:
                str2 = "DIRECTORY_PROVIDER_GHOST";
                break;
            case 3:
                str2 = "FRAME_RETRIEVING_FAILED";
                break;
            case 4:
                str2 = "VIDEO_PLAYER_NULL";
                break;
            case 5:
                str2 = "VIDEO_AUDIO_BURN";
                break;
            case 6:
                str2 = "IMPORT_ERROR";
                break;
            case 7:
                str2 = "VIEWHOLDER_NULL";
                break;
            case 8:
                str2 = "VVP_ERROR";
                break;
            case 9:
                str2 = "MISSING_VIDEO";
                break;
            default:
                str2 = "EFFECT_RETRIEVING_FAILED";
                break;
        }
        C59689JTv.A03(context, string, AnonymousClass7TF.A0j(str2), 0);
    }

    public static final void A03(Context context, String str) {
        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.layout_invalid_audio_duration_toast);
        DbX.A13(context, DbU.A0G(A08, R.id.toast_subtitle_text), str, 2131955494);
        Toast toast = new Toast(context);
        toast.setView(A08);
        toast.setGravity(80, 0, DbS.A02(context, 130));
        toast.setDuration(1);
        toast.show();
    }
}
