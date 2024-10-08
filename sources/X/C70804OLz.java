package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Map;

/* renamed from: X.OLz  reason: case insensitive filesystem */
public final class C70804OLz {
    public String A00;
    public final int A01;
    public final DirectThreadThemeInfo A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean A00() {
        String str = this.A05;
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public C70804OLz(Bundle bundle) {
        Parcelable.Creator creator;
        this.A09 = DbT.A0w(bundle, "message_non_null_identifier", "");
        this.A07 = bundle.getString("message_client_context");
        this.A0C = bundle.getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        this.A06 = bundle.getString("media_id");
        this.A08 = DbT.A0w(bundle, "message_content", "");
        this.A0A = DbT.A0w(bundle, "message_owner_user_id", "");
        this.A0G = bundle.getBoolean("should_quote_message_content", true);
        this.A0B = bundle.getString("message_sender_profile_pic_url");
        this.A0H = bundle.getBoolean("should_show_keyboard");
        this.A03 = bundle.getString("channel_creator_id");
        this.A04 = bundle.getString("channel_creator_profile_url");
        this.A0D = bundle.getBoolean("has_channel_ended");
        this.A05 = bundle.getString("channel_disabled_replies_composer");
        this.A0E = bundle.getBoolean("current_user_bc_creator", false);
        this.A0F = bundle.getBoolean("current_user_bc_moderator", false);
        this.A00 = bundle.getString(AnonymousClass000.A00(376));
        Class<DirectThreadThemeInfo> cls = DirectThreadThemeInfo.class;
        Object obj = cls.getDeclaredField("CREATOR").get((Object) null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            Map map = 0Yh.A03;
            throw AnonymousClass7TF.A0W("Could not access CREATOR field in class ", 0q1.A01(cls));
        }
        this.A02 = (DirectThreadThemeInfo) ((Parcelable) 0B0.A01(creator, bundle.getParcelable("channel_thread_theme_info"), cls));
        this.A01 = bundle.getInt("channel_thread_replies_count", -1);
    }
}
