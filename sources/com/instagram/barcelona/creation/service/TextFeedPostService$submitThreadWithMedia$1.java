package com.instagram.barcelona.creation.service;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1ua;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C333907aL;
import X.C333917aM;
import X.C53382GnE;
import X.C60340gF;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.XWS;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.creation.service.TextFeedPostService$submitThreadWithMedia$1", f = "TextFeedPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TextFeedPostService$submitThreadWithMedia$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C53382GnE A00;
    public final /* synthetic */ C333907aL A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFeedPostService$submitThreadWithMedia$1(C53382GnE gnE, C333907aL r3, AnonymousClass0iw r4, Integer num, Integer num2, String str, String str2, List list, AnonymousClass4D7 r10, boolean z) {
        super(2, r10);
        this.A04 = num;
        this.A01 = r3;
        this.A07 = list;
        this.A05 = str;
        this.A00 = gnE;
        this.A03 = num2;
        this.A06 = str2;
        this.A02 = r4;
        this.A08 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.barcelona.creation.service.TextFeedPostService$submitThreadWithMedia$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        Integer num = this.A04;
        C333907aL r2 = this.A01;
        List list = this.A07;
        String str = this.A05;
        return new TextFeedPostService$submitThreadWithMedia$1(this.A00, r2, this.A02, num, this.A03, str, this.A06, list, r13, this.A08);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TextFeedPostService$submitThreadWithMedia$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        Integer num = this.A04;
        int intValue = num.intValue();
        String str = null;
        if (intValue == 3) {
            C333907aL r8 = this.A01;
            List list = this.A07;
            String str2 = this.A05;
            C53382GnE gnE = this.A00;
            Integer num2 = this.A03;
            if (num2 != null) {
                str = XWS.A00(num2).A00;
            }
            C333907aL.A01(gnE, r8, this.A02, num, str2, str, this.A06, list, this.A08);
        } else if (intValue == 2) {
            C333907aL r82 = this.A01;
            List list2 = this.A07;
            String str3 = this.A05;
            C53382GnE gnE2 = this.A00;
            Integer num3 = this.A03;
            if (num3 != null) {
                str = XWS.A00(num3).A00;
            }
            AnonymousClass3Q2 A012 = C333907aL.A01(gnE2, r82, this.A02, num, str3, str, this.A06, list2, this.A08);
            1ua r6 = r82.A01;
            Iterator A0x = JTP.A0x(A012.A4m);
            while (A0x.hasNext()) {
                AnonymousClass3Q2 A0m = JTO.A0m(A0x);
                if (A0m.A0u()) {
                    Iterator A0g = JTQ.A0g(A0m);
                    while (A0g.hasNext()) {
                        AnonymousClass3Q2 A0m2 = JTO.A0m(A0g);
                        r6.A04.A0D(A0m2, A0m2.A35);
                    }
                } else {
                    r6.A04.A0D(A0m, A0m.A35);
                }
            }
            r6.A05.A04();
            r82.A00.A01 = A012;
        } else if (intValue == 0 || intValue == 1) {
            C333907aL r83 = this.A01;
            List list3 = this.A07;
            String str4 = this.A05;
            C53382GnE gnE3 = this.A00;
            Integer num4 = this.A03;
            if (num4 != null) {
                str = XWS.A00(num4).A00;
            }
            String str5 = this.A06;
            AnonymousClass0iw r9 = this.A02;
            AnonymousClass3Q2 A013 = C333907aL.A01(gnE3, r83, r9, num, str4, str, str5, list3, this.A08);
            1ua r5 = r83.A01;
            List list4 = A013.A4m;
            0qQ.A0B(list4, 1);
            PendingMediaStore pendingMediaStore = r5.A04;
            pendingMediaStore.A0D(A013, A013.A35);
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                AnonymousClass3Q2 A0m3 = JTO.A0m(it);
                pendingMediaStore.A0D(A0m3, A0m3.A35);
                if (A0m3.A0u()) {
                    Iterator A0g2 = JTQ.A0g(A0m3);
                    while (A0g2.hasNext()) {
                        AnonymousClass3Q2 A0m4 = JTO.A0m(A0g2);
                        pendingMediaStore.A0D(A0m4, A0m4.A35);
                    }
                }
            }
            r5.A05.A04();
            r5.A0B(A013);
            0qQ.A0B(r9, 1);
            C333917aM r1 = r83.A00;
            r1.A00 = null;
            r1.A01 = null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return C60340gF.A00;
    }
}
