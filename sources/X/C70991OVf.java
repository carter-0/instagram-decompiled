package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchMetaAIResponse;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.OVf  reason: case insensitive filesystem */
public final class C70991OVf {
    public final ON1 A01(UserSession userSession, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo;
        DiscoverableThreadInfo discoverableThreadInfo;
        0qQ.A0B(list, 7);
        ON1 on1 = new ON1();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectSearchResult directSearchResult = (DirectSearchResult) it.next();
            if (directSearchResult instanceof DirectShareTarget) {
                0qQ.A0C(directSearchResult, "null cannot be cast to non-null type com.instagram.model.direct.DirectShareTarget");
                DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
                if (z3 || !directShareTarget.A0P()) {
                    if (directShareTarget.A0S) {
                        arrayList = on1.A07;
                    } else {
                        String str2 = userSession.A06;
                        Integer A04 = directShareTarget.A04(str2, z4);
                        0qQ.A07(A04);
                        if (z) {
                            if (A04 == AnonymousClass05K.A01 || A04 == AnonymousClass05K.A0C) {
                                arrayList2 = on1.A06;
                                arrayList2.add(directShareTarget);
                            } else if (A04 == AnonymousClass05K.A0N) {
                                arrayList2 = on1.A05;
                                arrayList2.add(directShareTarget);
                            }
                        }
                        if (directShareTarget.A01 == 1012) {
                            A1C2.add(directShareTarget);
                        } else {
                            if (A04 == AnonymousClass05K.A0B) {
                                arrayList2 = on1.A01;
                            } else {
                                if (directShareTarget.A0U() || directShareTarget.A0O()) {
                                    if (z5 || ((creatorBroadcastThreadInfo = directShareTarget.A04) == null && directShareTarget.A05 == null && directShareTarget.A06 == null)) {
                                        if (((!C290685fj.A00(str) || !182.A06(0Tu.A05, userSession, 36317521901327631L)) && (!C290685fj.A01(str) || !182.A06(0Tu.A05, userSession, 36317521902114067L))) || !directShareTarget.A0Y(str2)) {
                                            if (directShareTarget.A0R()) {
                                                arrayList2 = on1.A0B;
                                            } else {
                                                arrayList2 = on1.A0D;
                                            }
                                        }
                                    } else if ((creatorBroadcastThreadInfo == null || !creatorBroadcastThreadInfo.A07) && (((discoverableThreadInfo = directShareTarget.A06) == null || !discoverableThreadInfo.A03) && directShareTarget.A05 == null)) {
                                        arrayList2 = on1.A02;
                                    } else {
                                        A1C.add(directShareTarget);
                                    }
                                }
                                if (A04 == AnonymousClass05K.A0Y) {
                                    arrayList2 = on1.A03;
                                } else {
                                    arrayList2 = on1.A04;
                                }
                            }
                            arrayList2.add(directShareTarget);
                        }
                    }
                }
            } else if ((directSearchResult instanceof DirectMessageSearchMessage) || (directSearchResult instanceof DirectMessageSearchThread)) {
                arrayList = on1.A08;
            } else if (directSearchResult instanceof DirectSearchResharedContent) {
                arrayList = on1.A0C;
            } else if (directSearchResult instanceof DirectSearchMetaAIResponse) {
                DirectSearchMetaAIResponse directSearchMetaAIResponse = (DirectSearchMetaAIResponse) directSearchResult;
                C69393NkX nkX = directSearchMetaAIResponse.A00;
                0qQ.A0B(nkX, 0);
                on1.A00 = nkX;
                on1.A09.addAll(directSearchMetaAIResponse.A01);
            } else if (directSearchResult instanceof DirectSearchPrompt) {
                arrayList = on1.A09;
            }
            arrayList.add(directSearchResult);
        }
        if (z2) {
            ArrayList arrayList3 = on1.A0D;
            ArrayList arrayList4 = on1.A06;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        }
        ArrayList arrayList5 = on1.A0D;
        arrayList5.addAll(A1C);
        arrayList5.addAll(0, A1C2);
        return on1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36317521901327631L) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36317521902114067L) != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.common.session.UserSession r8, X.ON1 r9, java.lang.String r10, java.util.List r11, java.util.List r12) {
        /*
            r7 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            boolean r3 = X.DbW.A1Z(r9)
            java.util.Iterator r6 = r11.iterator()
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r2 = r6.next()
            com.instagram.model.direct.DirectSearchResult r2 = (com.instagram.model.direct.DirectSearchResult) r2
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.DirectShareTarget"
            X.0qQ.A0C(r2, r0)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            boolean r0 = r2.A0P()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.A0L()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r2.A0U()
            if (r0 == 0) goto L_0x0067
            if (r12 != 0) goto L_0x0067
            boolean r0 = X.C290685fj.A00(r10)
            if (r0 == 0) goto L_0x004e
            X.0Tu r5 = X.0Tu.A05
            r0 = 36317521901327631(0x810698000d150f, double:3.0306853170977824E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 != 0) goto L_0x0061
        L_0x004e:
            boolean r0 = X.C290685fj.A01(r10)
            if (r0 == 0) goto L_0x009e
            X.0Tu r5 = X.0Tu.A05
            r0 = 36317521902114067(0x81069800191513, double:3.0306853175951277E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 == 0) goto L_0x009e
        L_0x0061:
            java.util.ArrayList r1 = r9.A03
        L_0x0063:
            r1.add(r2)
            goto L_0x000c
        L_0x0067:
            java.lang.String r0 = r8.A06
            java.lang.Integer r1 = r2.A04(r0, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x000c
            goto L_0x0061
        L_0x0072:
            if (r12 == 0) goto L_0x008b
            java.lang.String r0 = r2.A09()
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r2.A08()
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x008b
        L_0x0088:
            java.util.ArrayList r1 = r9.A0A
            goto L_0x0063
        L_0x008b:
            boolean r0 = X.C290685fj.A01(r10)
            if (r0 == 0) goto L_0x009e
            java.lang.Integer r0 = r2.A0E
            if (r0 == 0) goto L_0x009e
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x009e
            java.util.ArrayList r1 = r9.A02
            goto L_0x0063
        L_0x009e:
            java.util.ArrayList r1 = r9.A0D
            goto L_0x0063
        L_0x00a1:
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectSearchResharedContent
            if (r0 == 0) goto L_0x000c
            java.util.ArrayList r1 = r9.A0C
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.DirectSearchResharedContent"
            X.0qQ.A0C(r2, r0)
            goto L_0x0063
        L_0x00ad:
            java.util.ArrayList r0 = r9.A0C
            A00(r0)
            java.util.ArrayList r0 = r9.A0D
            A00(r0)
            java.util.ArrayList r0 = r9.A08
            A00(r0)
            java.util.ArrayList r0 = r9.A03
            A00(r0)
            java.util.ArrayList r0 = r9.A02
            A00(r0)
            java.util.ArrayList r0 = r9.A06
            A00(r0)
            java.util.ArrayList r0 = r9.A04
            A00(r0)
            java.util.ArrayList r0 = r9.A05
            A00(r0)
            java.util.ArrayList r0 = r9.A0A
            A00(r0)
            java.util.ArrayList r0 = r9.A0B
            A00(r0)
            java.util.ArrayList r0 = r9.A01
            A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70991OVf.A02(com.instagram.common.session.UserSession, X.ON1, java.lang.String, java.util.List, java.util.List):void");
    }

    public static final void A00(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
    }
}
