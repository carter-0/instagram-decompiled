package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.PEx  reason: case insensitive filesystem */
public final class C72667PEx implements C74484Pve {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ NKN A01;
    public final /* synthetic */ String A02;

    public final void onFailure() {
    }

    public final /* synthetic */ void onFailureInBackground(AnonymousClass1XT r1) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onSuccessInBackground(AnonymousClass2Ep r1) {
    }

    public C72667PEx(Activity activity, NKN nkn, String str) {
        this.A01 = nkn;
        this.A02 = str;
        this.A00 = activity;
    }

    public final void onSuccess(AnonymousClass2Ep r7) {
        NKN nkn = this.A01;
        String str = this.A02;
        Activity activity = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(nkn.A0N);
        String str2 = "inbox";
        switch (nkn.A0B.ordinal()) {
            case 0:
                str2 = C273654mx.A00(183);
                break;
            case 1:
                str2 = C273654mx.A00(254);
                break;
            case 2:
            case 15:
                break;
            case 3:
                str2 = "inbox_search";
                break;
            case 4:
                str2 = C273654mx.A00(654);
                break;
            case 5:
                str2 = C273654mx.A00(2273);
                break;
            case 6:
                str2 = C273654mx.A00(653);
                break;
            case 8:
                str2 = C273654mx.A00(930);
                break;
            case 9:
                str2 = C273654mx.A00(380);
                break;
            case 10:
                str2 = "via_push_notification";
                break;
            case 11:
                str2 = "channel_link_bottom_sheet";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str2 = "pinned_ssc_on_profile";
                break;
            case 13:
                str2 = C273654mx.A00(905);
                break;
            case 14:
                str2 = "ssc_list";
                break;
            case 16:
                str2 = "note_chat";
                break;
            case 17:
                str2 = "inbox_channel_invitation";
                break;
            default:
                str2 = "ig_direct_group_invite";
                break;
        }
        1pE A012 = 1pE.A01(activity, nkn, A0l, str2);
        DbZ.A1Z(A012, str);
        DbV.A1R(A012);
        C69318NjJ njJ = nkn.A0B;
        if (njJ == C69318NjJ.CHAT_STICKER || njJ == C69318NjJ.MESSAGE_SHARE_STICKER || njJ == C69318NjJ.MESSAGE_SHARE_STICKER_ATTRIBUTION || njJ == C69318NjJ.DIRECT_SEARCH || njJ == C69318NjJ.NOTIFICATION) {
            DbX.A10(activity, AnonymousClass37D.A00);
        }
    }
}
