package com.instagram.barcelona.permalink.data;

import X.05G;
import X.0Tu;
import X.0bH;
import X.0eS;
import X.0sP;
import X.182;
import X.1ES;
import X.1FZ;
import X.1Fj;
import X.1GP;
import X.1NX;
import X.1Xv;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.C51970G9q;
import X.C53384GnG;
import X.C54439HDr;
import X.C60340gF;
import X.C61170le;
import X.C638918c;
import X.D0B;
import X.INB;
import X.JRG;
import X.JV7;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2 extends AnonymousClass1Ek implements 0sP {
    public final /* synthetic */ C54439HDr A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2(C54439HDr hDr, List list, AnonymousClass4D7 r4) {
        super(1, r4);
        this.A00 = hDr;
        this.A01 = list;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r4) {
        return new BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2(this.A00, this.A01, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        0eS.A00(obj);
        C54439HDr hDr = this.A00;
        05G r6 = hDr.A07;
        do {
            value = r6.getValue();
        } while (!r6.AIY(value, C53384GnG.A00((JV7) null, (C53384GnG) value, (JRG) null, AnonymousClass05K.A01, (List) null, 1023, false, false, false, false)));
        UserSession userSession = hDr.A02;
        String str2 = hDr.A05;
        List list = this.A01;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36324003006131876L);
        boolean A1V = AnonymousClass7TF.A1V(C638918c.A01(C61170le.A00).A05);
        boolean z = ((C53384GnG) r6.getValue()).A07;
        1FZ r7 = new 1FZ(userSession, -2, 2, false);
        r7.A05();
        r7.A0A("text_feed/{post_id}/replies_streaming/");
        r7.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), D0B.class, true, true);
        r7.A9m("post_id", C51965G9l.A0u(str2));
        boolean z2 = true;
        if (list == null || !AnonymousClass7TE.A1b(list)) {
            str = null;
        } else {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0r.add(1Xv.A06(AnonymousClass7TE.A18(it)));
            }
            str = C51970G9q.A0k(A0r);
        }
        r7.A0G("prioritized_reply_ids", str);
        Boolean bool = null;
        if (A06) {
            bool = true;
        }
        r7.A0E("check_for_unavailable_replies", bool);
        if (!z) {
            z2 = null;
        }
        r7.A0E("media_archived", z2);
        r7.A0H("is_app_start", A1V);
        r7.A0A = "text_feed/{post_id}/replies_streaming/";
        r7.A03();
        1GP A0M = r7.A0M();
        A0M.A02(new INB(hDr, 0));
        1ES.A05(A0M, 1340669765, 2, true, false);
        return C60340gF.A00;
    }
}
