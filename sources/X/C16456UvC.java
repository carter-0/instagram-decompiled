package X;

import android.os.Bundle;

/* renamed from: X.UvC  reason: case insensitive filesystem */
public final class C16456UvC extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelUserPayBadgesThanksSupporterCameraFragment";
    public int A00;
    public 28D A01 = 28D.A5J;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public final WUP A06 = new WUP(this, 27);

    public final String getModuleName() {
        return "ReelUserPayBadgesSupporterThankYouFragment";
    }

    public final void onCreate(Bundle bundle) {
        28D r1;
        int A022 = AnonymousClass0fD.A02(9776759);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_ENTRY_POINT");
        if (!(obj instanceof 28D) || (r1 = (28D) obj) == null) {
            r1 = 28D.A5J;
        }
        this.A01 = r1;
        this.A04 = requireArguments.getString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_ID");
        this.A05 = requireArguments.getString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_INSIGHTS_ID");
        if (requireArguments.containsKey("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_NUM_SUPPORTERS")) {
            this.A00 = requireArguments.getInt("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_NUM_SUPPORTERS");
            this.A03 = requireArguments.getString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_TITLE");
            this.A02 = C13988Tno.A0T(requireArguments, "USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_CREATION_DATE");
            AnonymousClass0fD.A09(200518461, A022);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Missing user pay supporters count");
        AnonymousClass0fD.A09(-217050875, A022);
        throw illegalStateException;
    }
}
