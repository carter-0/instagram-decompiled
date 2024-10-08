package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7B0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7B0 implements C327387Ao {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ AnonymousClass7B0(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r38, AnonymousClass7LQ r39, AnonymousClass7L2 r40) {
        String str;
        String str2;
        String str3;
        Integer num;
        1Xj r14;
        int i;
        C254923tH A002;
        AnonymousClass7LQ r4 = r39;
        C254703su r2 = r4.A0e;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(0Tu.A05, userSession2, 36330505586623136L);
        C2609947v r6 = r2.A0g;
        if (!A06) {
            r6.getClass();
        } else if (r6 == null) {
            0wj.A01.AEf("ContextReplyViewModelGeneratorFactory: voiceMedia is null for VoiceReplyContentViewModel", 20134884).report();
        }
        User A02 = 17h.A00(userSession2).A02(r2.A1u);
        C254793t3 r3 = r4.A0G.A0P;
        List list = null;
        if (r3 instanceof C254763t0) {
            str = ((C254763t0) r3).A00;
        } else {
            str = null;
        }
        if (r6 != null) {
            str2 = r6.A02();
        } else {
            str2 = null;
        }
        String A0g = r2.A0g();
        String A0f = r2.A0f();
        2FW r1 = 2FW.A1k;
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(r1, A0g, A0f);
        if (A02 != null) {
            str3 = A02.getUsername();
        } else {
            str3 = null;
        }
        if (r6 != null) {
            num = r6.A00();
        } else {
            num = null;
        }
        int intValue = ((Number) C66801Mcn.A00(num, 0, "playbackDurationMs")).intValue();
        if (r6 != null) {
            r14 = r6.A02;
            i = r6.A00;
            list = r6.A03();
        } else {
            r14 = null;
            i = 0;
        }
        AnonymousClass9HC r7 = r38;
        AnonymousClass7FE A04 = AnonymousClass7FD.A04(userSession2, r7, r4, r40, r1, AnonymousClass0eN.A01(new DID()));
        AnonymousClass7FT A003 = AnonymousClass7FG.A00(context, userSession2, r7, r4, r1);
        if (r3 == null) {
            A002 = C254923tH.DJANGO;
        } else {
            A002 = C300965yF.A00(r3);
        }
        boolean A1S = r2.A1S();
        return new C328657Fq((N4D) null, A003, A04, A002, r14, directMessageIdentifier, AnonymousClass05K.A00, AnonymousClass05K.A0C, (Long) null, r2.A1K, str2, str3, str, list, intValue, i, A1S, r2.A2P, false);
    }
}
