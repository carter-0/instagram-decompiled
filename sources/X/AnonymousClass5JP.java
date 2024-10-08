package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.5JP  reason: invalid class name */
public final class AnonymousClass5JP implements 1OW {
    public final /* bridge */ /* synthetic */ Object E1o(16F r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass5JN parseFromJson = C63393KwE.parseFromJson(r2);
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final void ENE(17Z r3, Object obj) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(obj, 1);
        AnonymousClass5JN r4 = (AnonymousClass5JN) obj;
        r3.A0c();
        String str = r4.A01;
        if (str != null) {
            r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        }
        String str2 = r4.A00;
        if (str2 != null) {
            r3.A0R("pending_media_key", str2);
        }
        r3.A0Z();
    }
}
