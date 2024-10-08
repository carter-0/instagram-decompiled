package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.7I2  reason: invalid class name */
public final class AnonymousClass7I2 implements C332277Ui {
    public Integer A00 = AnonymousClass05K.A0N;
    public final AnonymousClass7I1 A01;

    public final void D9a() {
    }

    public final void D9V() {
        int i;
        C329067Hl r3 = this.A01.A00;
        C331697Sa r4 = r3.A1i;
        r4.A01();
        int intValue = this.A00.intValue();
        if (intValue == 1) {
            AnonymousClass7AW r2 = r3.A0j;
            2Er r0 = r3.A0W;
            String str = null;
            if (r0 != null) {
                str = r0.C6C();
            }
            DirectShareTarget A002 = r4.A00();
            if (!(r2 == null || str == null || A002 == null)) {
                r2.A01(A002, str);
            }
        } else if (intValue == 0) {
            Bundle bundle = new Bundle();
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
            AnonymousClass9H7 r7 = r4.A00;
            AnonymousClass4DH r22 = r7.A0u;
            r22.getChildFragmentManager().A0s(r7.A0s);
            0s1 r6 = new 0s1(r22.getChildFragmentManager());
            UserSession userSession = r7.A10;
            C72485P7u p7u = new C72485P7u(r7);
            E1P e1p = new E1P();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
            e1p.setArguments(bundle);
            e1p.A00 = p7u;
            r6.A0A(e1p, R.id.thread_fragment_container);
            r6.A0I((String) null);
            r6.A00();
        } else if (intValue == 2) {
            AnonymousClass7KX r62 = r3.A0f;
            DirectThreadKey A09 = C329067Hl.A09(r3);
            AnonymousClass2Es r02 = (AnonymousClass2Es) r3.A22.get();
            DirectPromptTypes directPromptTypes = DirectPromptTypes.UNKNOWN;
            if (r02 != null) {
                directPromptTypes = AnonymousClass79B.A01(((AnonymousClass3U9) r02).A01.A1m);
            }
            if (!(r62 == null || A09 == null)) {
                int A003 = C329067Hl.A00(r3);
                2Er r03 = r3.A0W;
                if (r03 != null) {
                    i = r03.AdN();
                } else {
                    i = 0;
                }
                UserSession userSession2 = r62.A03;
                C70846ONz oNz = new C70846ONz(r62.A02, userSession2);
                DirectPromptTypes directPromptTypes2 = DirectPromptTypes.ROLL_CALL;
                String str2 = A09.A00;
                boolean z = false;
                if (directPromptTypes == DirectPromptTypes.ADD_YOURS) {
                    z = true;
                }
                oNz.A03(directPromptTypes2, Boolean.valueOf(z), str2);
                1as.A04.A02(r62.A00, userSession2, (DirectEditAddYoursParams) null, directPromptTypes, A09, A003, i);
            }
        }
        this.A00 = AnonymousClass05K.A0N;
        if (182.A06(0Tu.A05, r3.A1Z, 2342164289210885349L)) {
            r3.A1A();
        }
    }

    public AnonymousClass7I2(AnonymousClass7I1 r2) {
        this.A01 = r2;
    }
}
