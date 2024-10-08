package com.instagram.barcelona.feed.post.data;

import X.0eS;
import X.0sL;
import X.15p;
import X.1Hj;
import X.1NY;
import X.1Xj;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51968G9o;
import X.C60340gF;
import X.CDY;
import X.D0L;
import X.DbT;
import X.DbV;
import X.HDU;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.feed.post.data.PostPollRepository$votePoll$1", f = "PostPollRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class PostPollRepository$votePoll$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ HDU A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostPollRepository$votePoll$1(HDU hdu, AnonymousClass0iw r3, String str, String str2, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A02 = hdu;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = i;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.barcelona.feed.post.data.PostPollRepository$votePoll$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        return new PostPollRepository$votePoll$1(this.A02, this.A03, this.A05, this.A04, r9, this.A01);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.barcelona.feed.post.data.PostPollRepository$votePoll$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            UserSession userSession = this.A02.A00;
            String str = this.A05;
            String str2 = this.A04;
            int i = this.A01;
            String moduleName = this.A03.getModuleName();
            this.A00 = 1;
            String str3 = null;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0K("media/%s/%s/story_poll_vote/", new Object[]{str, str2});
            C51968G9o.A1L(A0a, "vote", String.valueOf(i), moduleName);
            1Xj A0U = DbV.A0U(userSession, str);
            if (A0U != null) {
                str3 = DbT.A0x(A0U);
            }
            A0a.A0G("ranking_info_token", str3);
            A0a.A0O((15p) null, CDY.class, D0L.class, false);
            Object A002 = DbT.A0U(A0a, true).A00(1187744550, this);
            if (A002 != r5) {
                A002 = C60340gF.A00;
            }
            if (A002 == r5) {
                return r5;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PostPollRepository$votePoll$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
