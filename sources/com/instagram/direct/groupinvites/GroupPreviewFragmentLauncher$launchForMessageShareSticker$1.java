package com.instagram.direct.groupinvites;

import X.0Hf;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass05E;
import X.AnonymousClass0iw;
import X.AnonymousClass10c;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6ST;
import X.AnonymousClass7TE;
import X.C331127Pr;
import X.C331157Pu;
import X.C50415FbO;
import X.C59689JTv;
import X.C59731JVp;
import X.C60340gF;
import X.C62320sa;
import X.C68756NVr;
import X.C69064Ne1;
import X.C69586NoU;
import X.C71045OaN;
import X.C71129OdS;
import X.C74254Pri;
import X.DbS;
import X.DbW;
import X.Fb3;
import X.NKN;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1", f = "GroupPreviewFragmentLauncher.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
public final class GroupPreviewFragmentLauncher$launchForMessageShareSticker$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C69064Ne1 A04;
    public final /* synthetic */ AnonymousClass6ST A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ C62320sa A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C69064Ne1 ne1, AnonymousClass6ST r6, String str, String str2, String str3, String str4, AnonymousClass4D7 r11, C62320sa r12, boolean z) {
        super(2, r11);
        this.A04 = ne1;
        this.A03 = userSession;
        this.A09 = str;
        this.A06 = str2;
        this.A0B = z;
        this.A01 = fragmentActivity;
        this.A05 = r6;
        this.A07 = str3;
        this.A02 = r3;
        this.A08 = str4;
        this.A0A = r12;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        C69064Ne1 ne1 = this.A04;
        UserSession userSession = this.A03;
        String str = this.A09;
        String str2 = this.A06;
        boolean z = this.A0B;
        return new GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(this.A01, this.A02, userSession, ne1, this.A05, str, str2, this.A07, this.A08, r15, this.A0A, z);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            AnonymousClass05E r0 = new AnonymousClass05E(new 0Hf(new C59731JVp(9, (AnonymousClass4D7) null), this.A04.A02, (AnonymousClass4D7) null, 0));
            this.A00 = 1;
            obj2 = AnonymousClass10c.A04(this, r0);
            if (obj2 == obj3) {
                return obj3;
            }
        }
        C69586NoU noU = (C69586NoU) obj2;
        if (noU instanceof C68756NVr) {
            C74254Pri pri = ((C68756NVr) noU).A00;
            if (pri instanceof GroupLinkPreviewResponse$Success) {
                0qQ.A0C(pri, "null cannot be cast to non-null type com.instagram.direct.request.response.GroupLinkPreviewResponse.Success");
                GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) pri;
                UserSession userSession = this.A03;
                String valueOf = String.valueOf(groupLinkPreviewResponse$Success.A04);
                boolean z = groupLinkPreviewResponse$Success.A0I;
                boolean z2 = groupLinkPreviewResponse$Success.A0C;
                boolean z3 = groupLinkPreviewResponse$Success.A0E;
                boolean z4 = groupLinkPreviewResponse$Success.A0H;
                boolean z5 = groupLinkPreviewResponse$Success.A0F;
                boolean A1S = DbW.A1S(1, userSession, valueOf);
                if ((!z || z4 || z2 || z3 || valueOf.equals(userSession.A06)) && !z5) {
                    String str = groupLinkPreviewResponse$Success.A0A;
                    if (str != null) {
                        ThreadFetchReason threadFetchReason = ThreadFetchReason.MESSAGE_SHARE_STICKER;
                        FragmentActivity fragmentActivity = this.A01;
                        String str2 = this.A07;
                        C71129OdS.A03(userSession, threadFetchReason, new C50415FbO(fragmentActivity, this.A02, userSession, this.A05, str2, str, this.A08), 20, str, A1S);
                        return C60340gF.A00;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                NKN A032 = C71045OaN.A03(groupLinkPreviewResponse$Success, ChatStickerStickerType.MESSAGE_STICKER, this.A09, this.A06, this.A0B, A1S);
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A0U = A032;
                C331157Pu A002 = A0W.A00();
                A032.A0C = new Fb3(userSession, A002, A0W, this.A0A);
                FragmentActivity fragmentActivity2 = this.A01;
                A002.A02(fragmentActivity2, A032);
                if (!fragmentActivity2.isDestroyed()) {
                    this.A05.dismiss();
                }
                return C60340gF.A00;
            }
        }
        FragmentActivity fragmentActivity3 = this.A01;
        if (!fragmentActivity3.isDestroyed()) {
            this.A05.dismiss();
            C59689JTv.A0F(fragmentActivity3, "general_error_try_again", 2131963032);
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupPreviewFragmentLauncher$launchForMessageShareSticker$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
