package X;

import android.view.View;
import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import java.util.Collection;

/* renamed from: X.7Yi  reason: invalid class name and case insensitive filesystem */
public final class C333277Yi extends C331647Ru implements C13907Tl7 {
    public final AvatarPrivacySettingsRepository A00;
    public final AvatarStore A01;
    public final C331877Su A02;
    public final AvatarReactionsRepository A03;

    public final void A05(View view) {
        AvatarReactionsRepository avatarReactionsRepository = this.A03;
        if (!(!((Collection) avatarReactionsRepository.A0C.getValue()).isEmpty())) {
            avatarReactionsRepository.A03();
        }
        07U r4 = 07U.A05;
        AnonymousClass07Z r3 = (AnonymousClass07Z) this.A00.A01.invoke();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r3);
        1Eo.A05(19B.A00, new C66171MGi(r3, r4, this, (AnonymousClass4D7) null, 32), A002);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C333277Yi(C331627Rs r6) {
        super(r6);
        UserSession userSession = r6.A00;
        C331877Su r4 = new C331877Su(userSession);
        AvatarReactionsRepository A002 = C331867Sr.A00(userSession);
        AvatarPrivacySettingsRepository A003 = AnonymousClass7T8.A00(userSession);
        AvatarStore A004 = 25x.A00(userSession);
        0qQ.A0B(A002, 3);
        0qQ.A0B(A003, 4);
        0qQ.A0B(A004, 5);
        this.A02 = r4;
        this.A03 = A002;
        this.A00 = A003;
        this.A01 = A004;
    }

    public final boolean A08() {
        if (0qQ.A0K(this.A01.A01.A00, C299715vi.A00)) {
            if (!182.A06(0Tu.A05, this.A02.A00, 36322624321628458L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
