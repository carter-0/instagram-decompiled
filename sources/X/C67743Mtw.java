package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Mtw  reason: case insensitive filesystem */
public final class C67743Mtw extends 2YL {
    public C262204Co A00;
    public final UserSession A01;
    public final LP4 A02;
    public final DirectDailyPromptsResponseListRepository A03;
    public final DirectThreadKey A04;
    public final C229122ms A05;
    public final String A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final int A0A;
    public final AnonymousClass0iw A0B;
    public final C66930MfP A0C;
    public final String A0D;
    public final String A0E;

    public final boolean A01(boolean z, boolean z2) {
        C262204Co r0 = this.A00;
        if (r0 != null && !r0.CQL()) {
            return false;
        }
        AnonymousClass4D7 A0t = C51975G9x.A0t(this.A00);
        this.A00 = C51966G9m.A1L(new MFa(this, A0t, 1, z2, z), C318116oQ.A00(this));
        return true;
    }

    public C67743Mtw(AnonymousClass0iw r12, UserSession userSession, LP4 lp4, DirectDailyPromptsResponseListRepository directDailyPromptsResponseListRepository, DirectThreadKey directThreadKey, String str, String str2, String str3, int i) {
        05F A032;
        DirectThreadKey directThreadKey2 = directThreadKey;
        C51974G9v.A1M(r12, directDailyPromptsResponseListRepository, directThreadKey2);
        String str4 = str;
        0qQ.A0B(str4, 5);
        String str5 = str2;
        String str6 = str3;
        AnonymousClass7TF.A1F(str5, 6, str6);
        this.A01 = userSession;
        this.A0B = r12;
        this.A03 = directDailyPromptsResponseListRepository;
        this.A04 = directThreadKey2;
        this.A0E = str4;
        this.A06 = str5;
        this.A0A = i;
        this.A0D = str6;
        this.A02 = lp4;
        02z A012 = 106.A01(C72625PDe.A00);
        this.A07 = A012;
        this.A08 = 10b.A03(A012);
        AnonymousClass0Ud r4 = directDailyPromptsResponseListRepository.A08;
        AnonymousClass0Ud r5 = directDailyPromptsResponseListRepository.A06;
        AnonymousClass0Ud r6 = directDailyPromptsResponseListRepository.A04;
        AnonymousClass0Ud r7 = directDailyPromptsResponseListRepository.A05;
        AnonymousClass0Ud r8 = directDailyPromptsResponseListRepository.A07;
        AnonymousClass0Ud r9 = directDailyPromptsResponseListRepository.A0A;
        LP4 lp42 = directDailyPromptsResponseListRepository.A01;
        if (lp42 != null) {
            A032 = lp42.A01(str5);
        } else {
            A032 = 10b.A03(JTO.A1J());
        }
        C73522Pe8 pe8 = new C73522Pe8(7, this, new AnonymousClass0r6[]{r4, r5, r6, r7, r8, r9, A032});
        this.A09 = 10b.A02(C72626PDf.A00, C318116oQ.A00(this), pe8, AnonymousClass10A.A01);
        this.A05 = new PRL(this, 6);
        this.A0C = C69868NtW.A00(userSession);
        if (lp4 != null) {
            lp4.A02(str5);
            AnonymousClass7TE.A1Z(new C66182MGt((Object) this, (AnonymousClass4D7) null, 14), C318116oQ.A00(this));
        }
    }

    public final void A00(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        C333537Zi A002 = C333527Zh.A00(this.A01);
        DirectThreadKey directThreadKey = this.A04;
        if (!z) {
            str2 = "CREATED";
            str3 = "❤";
        } else {
            str2 = "DELETED";
            str3 = null;
        }
        A002.A0K(directThreadKey, "daily_prompt", str2, str, str3, this.A0E);
        C66930MfP mfP = this.A0C;
        String str5 = directThreadKey.A00;
        String str6 = directThreadKey.A01;
        int i = this.A0A;
        String str7 = this.A0D;
        if (!z) {
            str4 = "True";
        } else {
            str4 = "False";
        }
        C66930MfP.A02(mfP, str5, str6, "daily_prompt_response_upvoted", "tap", "upvote_button", "daily_prompt_responses_sheet", DbY.A0q("daily_prompt_submission_id", str, AnonymousClass7TE.A1L("is_upvoted", str4), AnonymousClass7TE.A1L("user_type", str7)), i);
    }
}
