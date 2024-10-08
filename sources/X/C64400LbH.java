package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.user.model.User;

/* renamed from: X.LbH  reason: case insensitive filesystem */
public final class C64400LbH implements AnonymousClass2Kv {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ IGAIAgentType A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass6ST A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;

    public C64400LbH(Activity activity, 28D r2, IGAIAgentType iGAIAgentType, UserSession userSession, AnonymousClass6ST r5, User user, String str) {
        this.A06 = str;
        this.A02 = iGAIAgentType;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = r2;
        this.A05 = user;
        this.A04 = r5;
    }

    public final void invoke(AnonymousClass3JD r9) {
        C82 c82;
        C81 A0E;
        C8R c8r;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (!(r9 == null || (c82 = (C82) r9.Bny()) == null || (A0E = c82.A0E()) == null || (c8r = (C8R) A0E.reinterpretRequired(2, C8R.class, -612162544)) == null)) {
            C43198BuM A0E2 = c8r.A0E();
            if (A0E2 != null) {
                str = A0E2.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            } else {
                str = null;
            }
            C43201BuP A0G = c8r.A0G();
            if (A0G != null) {
                str2 = A0G.A09(DevServerEntity.COLUMN_DESCRIPTION);
            } else {
                str2 = null;
            }
            C43201BuP A0G2 = c8r.A0G();
            if (A0G2 != null) {
                str3 = A0G2.A0C("tagline");
            } else {
                str3 = null;
            }
            C43199BuN A0F = c8r.A0F();
            if (A0F != null) {
                str4 = A0F.A08(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            } else {
                str4 = null;
            }
            C43201BuP A0G3 = c8r.A0G();
            if (A0G3 != null) {
                str5 = A0G3.getOptionalStringField(6, "welcome_message");
            }
            if (!(str == null || str2 == null || str3 == null || str4 == null)) {
                A19.A00(this.A00, this.A01, this.A03, new ProfileStickerAiAgentData(this.A02, this.A06, str3, str, str4, str5), this.A05, AnonymousClass05K.A0C);
                return;
            }
        }
        AnonymousClass6ST r0 = this.A04;
        Activity activity = this.A00;
        r0.dismiss();
        C59689JTv.A0C(activity, AnonymousClass000.A00(4146));
    }
}
