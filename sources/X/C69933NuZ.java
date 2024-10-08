package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NuZ  reason: case insensitive filesystem */
public abstract class C69933NuZ {
    public static final Bundle A00(ImageUrl imageUrl, C254793t3 r3, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Bundle A0a = AnonymousClass7TE.A0a();
        AnonymousClass9H0.A02(A0a, r3, "DirectThreadInviteLinkSettingsFragment.THREAD_ID");
        A0a.putString("DirectThreadInviteLinkSettingsFragment.THREAD_V2_ID", str);
        A0a.putString("DirectThreadInviteLinkSettingsFragment.THREAD_TITLE", str2);
        A0a.putParcelable("DirectThreadInviteLinkSettingsFragment.IMAGE_URL", imageUrl);
        A0a.putInt("DirectThreadInviteLinkSettingsFragment.MEMBER_COUNT", i);
        A0a.putBoolean("DirectThreadInviteLinkSettingsFragment.IS_ADMIN", z);
        A0a.putBoolean("DirectThreadInviteLinkSettingsFragment.IS_MODERATOR", z2);
        A0a.putBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK_MODE", z3);
        A0a.putBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_ADMIN_APPROVAL_MODE", z4);
        A0a.putString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK", str3);
        A0a.putString("DirectThreadInviteLinkSettingsFragment.BROADCAST_CHAT_CREATOR_ID", str4);
        A0a.putBoolean("DirectThreadInviteLinkSettingsFragment.IS_SUBSCRIBER_ONLY", z5);
        A0a.putBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_FORCE_DISABLE_TOGGLE", z6);
        A0a.putInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE", i2);
        A0a.putInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE", i3);
        A0a.putString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_USERTYPE", str5);
        return A0a;
    }
}
