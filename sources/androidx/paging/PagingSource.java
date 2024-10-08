package androidx.paging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C60349Jjw;
import X.C62320sa;
import X.C62914KoS;
import X.C63967LFt;
import X.JTO;
import X.LFy;
import X.MNB;
import com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.save.repository.SavedAudioPagingSource;

public abstract class PagingSource {
    public final LFy A00 = new LFy((C62320sa) null, MNB.A00);

    public final void A03() {
        if (this.A00.A02() && C62914KoS.A00 != null && JTO.A1b(3)) {
            0qQ.A0B(AnonymousClass7TG.A0m(this, "Invalidated PagingSource ", AnonymousClass7TE.A1A()), 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: X.0rk} */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v9, types: [X.JZl, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v28, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r6v35 */
    /* JADX WARNING: type inference failed for: r6v36 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.LCU r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r3 = r21
            r2 = r22
            boolean r0 = r3 instanceof X.C60349Jjw
            r1 = r23
            if (r0 == 0) goto L_0x00dd
            X.Jjw r3 = (X.C60349Jjw) r3
            java.lang.Object r0 = r2.A00()
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = X.C60349Jjw.A00(r3, r0, r1)
            return r4
        L_0x001b:
            java.util.Map r1 = r3.A01
            java.lang.String r2 = r3.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r3 = r1.get(r2)
            if (r3 == 0) goto L_0x00c3
            X.JVf r3 = (X.C59721JVf) r3
            java.lang.Object r0 = r3.A00
            X.Jw2 r0 = (X.C61064Jw2) r0
            r1 = 1
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r0.A00
            X.JwI r0 = (X.C61080JwI) r0
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x009a
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r1) goto L_0x009a
            java.lang.Object r3 = r3.A00
            X.Jw2 r3 = (X.C61064Jw2) r3
            if (r3 == 0) goto L_0x0095
            java.lang.Object r0 = r3.A00
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0090
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.next()
            X.4sL r0 = (X.C276014sL) r0
            X.1Xj r0 = r0.A00
            X.4bN r0 = X.C295375o3.A02(r0)
            r2.add(r0)
            goto L_0x0064
        L_0x007a:
            java.lang.Object r1 = r3.A01
            X.4sa r1 = (X.C276114sa) r1
            boolean r0 = r1.BU8()
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = r1.BP8()
        L_0x0088:
            X.Jjs r4 = new X.Jjs
            r4.<init>(r0, r2)
            return r4
        L_0x008e:
            r0 = 0
            goto L_0x0088
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x009a:
            r6 = 0
            X.Jjs r4 = new X.Jjs
            X.0sn r7 = X.0sn.A00
            r5 = 0
            java.lang.Object r0 = r3.A01
            X.GSY r0 = (X.GSY) r0
            java.lang.Object r1 = r0.A00
            X.4sa r1 = (X.C276114sa) r1
            if (r1 == 0) goto L_0x00b4
            boolean r0 = r1.BU8()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r6 = r1.BP8()
        L_0x00b4:
            r8 = 0
            java.lang.String r0 = "saved"
            boolean r0 = X.0qQ.A0K(r2, r0)
            r9 = 3
            if (r0 == 0) goto L_0x00bf
            r9 = 0
        L_0x00bf:
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x00c8:
            X.Jjs r4 = new X.Jjs
            X.0sn r7 = X.0sn.A00
            r5 = 0
            r8 = 0
            java.lang.String r0 = "saved"
            boolean r0 = X.0qQ.A0K(r2, r0)
            r9 = 3
            if (r0 == 0) goto L_0x00d8
            r9 = 0
        L_0x00d8:
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00dd:
            boolean r0 = r3 instanceof com.instagram.save.repository.SavedAudioPagingSource
            if (r0 == 0) goto L_0x017e
            r7 = r3
            com.instagram.save.repository.SavedAudioPagingSource r7 = (com.instagram.save.repository.SavedAudioPagingSource) r7
            r5 = 44
            boolean r0 = X.MEA.A03(r5, r1)
            if (r0 == 0) goto L_0x0140
            r6 = r1
            X.MEA r6 = (X.MEA) r6
            int r4 = r6.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0140
            int r4 = r4 - r3
            r6.A00 = r4
        L_0x00fa:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0123
            if (r0 != r4) goto L_0x0179
            X.0eS.A00(r1)
        L_0x0108:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0145
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CFx r0 = (X.C43857CFx) r0
            java.util.List r2 = r0.A01
            X.Ct2 r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x011d
            java.lang.String r0 = r1.A00
        L_0x011d:
            X.Jjs r5 = new X.Jjs
            r5.<init>(r0, r2)
            return r5
        L_0x0123:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r3 = r7.A00
            java.lang.Object r1 = r2.A00()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r7.A01
            r6.A00 = r4
            X.1OC r1 = X.C64027LJo.A00(r3, r1, r0)
            r0 = 1237494160(0x49c2a990, float:1594674.0)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r5) goto L_0x0108
            return r5
        L_0x0140:
            X.MEA r6 = X.MEA.A00(r7, r1, r5)
            goto L_0x00fa
        L_0x0145:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0174
            X.4dm r1 = X.JTP.A0N(r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0166
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r1 = r0.getStatus()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x0160:
            X.Jjr r5 = new X.Jjr
            r5.<init>(r0)
            return r5
        L_0x0166:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x016f
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            goto L_0x0160
        L_0x016f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0174:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0179:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x017e:
            boolean r0 = r3 instanceof com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource
            if (r0 == 0) goto L_0x03bc
            r6 = r3
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r6 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r6
            r8 = 0
            boolean r0 = X.C59814JZl.A01(r8, r1)
            if (r0 == 0) goto L_0x0328
            r5 = r1
            X.JZl r5 = (X.C59814JZl) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0328
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x019a:
            java.lang.Object r12 = r5.A07
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r11 = 0
            r7 = 3
            r10 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0215
            if (r0 == r9) goto L_0x0273
            if (r0 == r10) goto L_0x02fc
            if (r0 != r7) goto L_0x0373
            java.lang.Object r10 = r5.A06
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r8 = r5.A05
            X.0rk r8 = (X.0rk) r8
            java.lang.Object r9 = r5.A04
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r1 = r5.A03
            X.JtR r1 = (X.C60907JtR) r1
            java.lang.Object r3 = r5.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r6 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r6
            X.0eS.A00(r12)
        L_0x01c7:
            if (r12 == 0) goto L_0x01d2
            r3.add(r12)
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
        L_0x01d2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x032f
            java.lang.Object r11 = r10.next()
            X.Jx3 r11 = (X.C61092Jx3) r11
            com.instagram.api.schemas.ACRType r2 = r11.A01
            if (r2 != 0) goto L_0x01f4
            com.instagram.model.reels.ReelType r0 = r11.A03
            if (r0 == 0) goto L_0x0212
            int r2 = r0.ordinal()
            r0 = 22
            if (r2 == r0) goto L_0x020f
            r0 = 37
            if (r2 != r0) goto L_0x0212
            com.instagram.api.schemas.ACRType r2 = com.instagram.api.schemas.ACRType.SMART_REEL
        L_0x01f4:
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            r5.A01 = r6
            r5.A02 = r3
            r5.A03 = r1
            r5.A04 = r9
            r5.A05 = r8
            r5.A06 = r10
            r5.A00 = r7
            java.lang.Object r12 = com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A00(r2, r11, r6, r5)
            if (r12 != r4) goto L_0x01c7
            return r4
        L_0x020f:
            com.instagram.api.schemas.ACRType r2 = com.instagram.api.schemas.ACRType.HIGHLIGHT_REEL
            goto L_0x01f4
        L_0x0212:
            com.instagram.api.schemas.ACRType r2 = com.instagram.api.schemas.ACRType.UNKNOWN
            goto L_0x01f4
        L_0x0215:
            java.util.ArrayList r3 = X.JTQ.A0e(r12)
            com.instagram.common.session.UserSession r15 = r6.A03
            boolean r0 = X.1KU.A0G(r15)
            if (r0 == 0) goto L_0x0284
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0284
            X.2jA r16 = new X.2jA
            r16.<init>()
            r5.A01 = r6
            r5.A02 = r2
            r5.A03 = r3
            r5.A00 = r9
            X.LF8 r12 = X.C63143KsB.A00(r15)
            X.29E r14 = r12.A03
            r13 = 246627450(0xeb33c7a, float:4.4185144E-30)
            r0 = 15000(0x3a98, double:7.411E-320)
            long r0 = r14.A03(r13, r0)
            r12.A02 = r0
            X.0Tu r12 = X.0Tu.A05
            r0 = 36318874815371816(0x8107d300031a28, double:3.0315409053870726E-306)
            boolean r0 = X.182.A06(r12, r15, r0)
            if (r0 == 0) goto L_0x0270
            X.12V r1 = r6.A02
            r0 = 1754429340(0x6892779c, float:5.533375E24)
            X.0nV r1 = r1.AOJ(r0, r7)
            r20 = 10
            X.MGj r0 = new X.MGj
            r19 = r11
            r17 = r3
            r18 = r6
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.Object r0 = X.1Eo.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x0270
        L_0x026d:
            if (r0 != r4) goto L_0x0282
            return r4
        L_0x0270:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x026d
        L_0x0273:
            java.lang.Object r3 = r5.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r5.A02
            X.LCU r2 = (X.LCU) r2
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r6 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r6
            X.0eS.A00(r12)
        L_0x0282:
            r6.A00 = r9
        L_0x0284:
            com.instagram.common.session.UserSession r13 = r6.A03
            X.LF8 r12 = X.C63143KsB.A00(r13)
            X.29E r14 = r12.A03
            r9 = 246615524(0xeb30de4, float:4.4140283E-30)
            r0 = 15000(0x3a98, double:7.411E-320)
            long r0 = r14.A03(r9, r0)
            r12.A01 = r0
            java.lang.Object r12 = r2.A00()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r9 = X.AnonymousClass7TF.A0g(r13)
            r5.A01 = r6
            r5.A02 = r3
            r5.A03 = r11
            r5.A00 = r10
            X.1NY r2 = X.DbU.A0M(r13)
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            r2.A07(r10)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.HOURS
            r0 = 0
            long r0 = r13.toMillis(r0)
            r2.A01 = r0
            java.lang.String r1 = "clips/acr_browser"
            if (r12 != 0) goto L_0x02fa
            java.lang.String r0 = ""
        L_0x02c2:
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.A0A = r0
            java.lang.String r1 = "clips/"
            java.lang.String r0 = "acr_browser/"
            r2.A08(r10)
            X.JTS.A1L(r2, r1, r0)
            java.lang.Class<X.CDr> r1 = X.C43799CDr.class
            java.lang.Class<X.Cyc> r0 = X.C45564Cyc.class
            r2.A0O(r11, r1, r0, r8)
            if (r12 == 0) goto L_0x02e0
            java.lang.String r0 = "max_id"
            r2.A9m(r0, r12)
        L_0x02e0:
            if (r9 == 0) goto L_0x02e7
            java.lang.String r0 = "camera_session_id"
            r2.A9m(r0, r9)
        L_0x02e7:
            X.1OC r1 = r2.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetACRsForBrowserResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetACRsForBrowserResponse>>"
            X.0qQ.A0C(r1, r0)
            r0 = 1754429340(0x6892779c, float:5.533375E24)
            java.lang.Object r12 = r1.A02(r5, r0, r7, r8)
            if (r12 != r4) goto L_0x0307
            return r4
        L_0x02fa:
            r0 = r12
            goto L_0x02c2
        L_0x02fc:
            java.lang.Object r3 = r5.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r6 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r6
            X.0eS.A00(r12)
        L_0x0307:
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0378
            java.lang.Object r1 = X.C51972G9s.A0m(r12)
            X.0qQ.A07(r1)
            X.JtR r1 = (X.C60907JtR) r1
            X.0rk r9 = new X.0rk
            r9.<init>()
            X.0rk r8 = new X.0rk
            r8.<init>()
            java.util.List r0 = r1.A01
            java.util.Iterator r10 = r0.iterator()
            goto L_0x01d2
        L_0x0328:
            X.JZl r5 = new X.JZl
            r5.<init>(r6, r1, r8)
            goto L_0x019a
        L_0x032f:
            com.instagram.common.session.UserSession r0 = r6.A03
            X.LF8 r6 = X.C63143KsB.A00(r0)
            int r2 = r9.A00
            int r10 = r8.A00
            X.4sZ r7 = r1.A00
            boolean r9 = r7.A01
            X.29E r8 = r6.A03
            long r0 = r6.A01
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "total_acrs_count"
            r8.A0A(r0, r2, r4)
            long r4 = r6.A01
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "filtered_total_acrs_count"
            r8.A0A(r4, r0, r1)
            long r4 = r6.A01
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "has_more_acrs"
            r8.A0A(r4, r0, r1)
            long r1 = r6.A01
            r0 = 246615524(0xeb30de4, float:4.4140283E-30)
            long r0 = r8.A02(r0, r1)
            r6.A01 = r0
            java.lang.String r0 = r7.A00
            X.Jjs r4 = new X.Jjs
            r4.<init>(r0, r3)
            return r4
        L_0x0373:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0378:
            java.lang.String r2 = "Browser result cannot be fetched"
            com.instagram.common.session.UserSession r4 = r6.A03
            X.LF8 r3 = X.C63143KsB.A00(r4)
            X.29E r5 = r3.A03
            long r9 = r3.A01
            java.lang.String r6 = java.lang.String.valueOf(r2)
            r8 = 246615524(0xeb30de4, float:4.4140283E-30)
            java.lang.String r7 = ""
            long r0 = r5.A07(r6, r7, r8, r9)
            r3.A01 = r0
            X.LF8 r5 = X.C63143KsB.A00(r4)
            long r12 = r5.A00
            r0 = 0
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x03af
            X.29E r8 = r5.A03
            java.lang.String r9 = java.lang.String.valueOf(r2)
            r11 = 246622982(0xeb32b06, float:4.4168337E-30)
            r10 = r7
            long r3 = r8.A07(r9, r10, r11, r12)
            r5.A00 = r3
        L_0x03af:
            r5.A00 = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r2)
            X.Jjr r4 = new X.Jjr
            r4.<init>(r0)
            return r4
        L_0x03bc:
            boolean r0 = r3 instanceof com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource
            if (r0 == 0) goto L_0x04e6
            com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource r3 = (com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource) r3
            r7 = 33
            boolean r0 = X.C66146MDy.A02(r7, r1)
            if (r0 == 0) goto L_0x046d
            r4 = r1
            X.MDy r4 = (X.C66146MDy) r4
            int r6 = r4.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r5
            if (r0 == 0) goto L_0x046d
            int r6 = r6 - r5
            r4.A00 = r6
        L_0x03d8:
            java.lang.Object r1 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0406
            if (r0 != r6) goto L_0x04e1
            java.lang.Object r2 = r4.A02
            X.LCU r2 = (X.LCU) r2
            java.lang.Object r3 = r4.A01
            com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource r3 = (com.instagram.clips.audio.trending.repository.TrendingAudioPagingSource) r3
            X.0eS.A00(r1)
        L_0x03ee:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x04ad
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CEa r0 = (X.C43808CEa) r0
            X.Jtr r7 = r0.A01
            if (r7 != 0) goto L_0x0474
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0406:
            X.0eS.A00(r1)
            X.HkO r11 = r3.A02
            com.instagram.common.session.UserSession r0 = r3.A03
            java.lang.String r12 = r3.A05
            java.lang.Object r9 = r2.A00()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r8 = r3.A04
            int r1 = r3.A01
            boolean r10 = r3.A00
            X.C66146MDy.A00(r3, r2, r4, r6)
            X.1NY r6 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r7 = "music/top_trends/"
            r6.A0A(r7)
            java.lang.String r0 = "referrer_audio_id"
            r6.A9m(r0, r12)
            java.lang.String r0 = "max_id"
            r6.A9m(r0, r9)
            java.lang.String r0 = "top_audio_tab_type"
            r6.A9m(r0, r8)
            java.lang.String r0 = "page_size"
            r6.A0C(r0, r1)
            java.lang.Class<X.CEa> r1 = X.C43808CEa.class
            java.lang.Class<X.CzJ> r0 = X.C45607CzJ.class
            r6.A0Q(r1, r0)
            X.0eM r0 = r11.A01
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x045c
            if (r10 == 0) goto L_0x046a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x044e:
            r6.A07(r0)
            java.lang.String r0 = X.002.A0g(r7, r9, r8)
            r6.A0A = r0
            r0 = 900000(0xdbba0, double:4.44659E-318)
            r6.A01 = r0
        L_0x045c:
            X.1OC r1 = r6.A0M()
            r0 = 1092486062(0x411e03ae, float:9.875898)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x03ee
            return r5
        L_0x046a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x044e
        L_0x046d:
            X.MDy r4 = new X.MDy
            r4.<init>(r3, r1, r7)
            goto L_0x03d8
        L_0x0474:
            X.BB1 r1 = r7.A00
            boolean r0 = r1.A01
            r6 = 0
            if (r0 == 0) goto L_0x04a3
            java.lang.Object r5 = r2.A00()
            java.lang.String r4 = r1.A00
            boolean r0 = X.0qQ.A0K(r5, r4)
            if (r0 == 0) goto L_0x04ab
            com.instagram.common.session.UserSession r3 = r3.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342161772359981489(0x208107b9000419b1, double:4.064537133208569E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x04ab
            java.lang.String r0 = "Duplicate nextKey found: "
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = X.002.A0R(r0, r5)
            java.lang.String r0 = "TrendingAudioPagingSource"
            X.0wb.A03(r0, r1)
        L_0x04a3:
            java.util.List r0 = r7.A01
            X.Jjs r5 = new X.Jjs
            r5.<init>(r6, r0)
            return r5
        L_0x04ab:
            r6 = r4
            goto L_0x04a3
        L_0x04ad:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x04dc
            X.4dm r1 = X.JTP.A0N(r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x04ce
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XP r0 = (X.1XP) r0
            java.lang.String r1 = r0.getStatus()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x04c8:
            X.Jjr r5 = new X.Jjr
            r5.<init>(r0)
            return r5
        L_0x04ce:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x04d7
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            goto L_0x04c8
        L_0x04d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04dc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04e6:
            X.Jjt r3 = (X.C60348Jjt) r3
            boolean r5 = r2 instanceof X.C60344Jjp
            if (r5 == 0) goto L_0x0529
            X.Kfy r6 = X.C62448Kfy.REFRESH
        L_0x04ee:
            int r9 = r3.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r0) goto L_0x0507
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.String r0 = "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"
            r4.println(r0)
            if (r5 == 0) goto L_0x0526
            int r4 = r2.A00
            int r0 = r4 % 3
            if (r0 != 0) goto L_0x0526
            int r9 = r4 / 3
        L_0x0505:
            r3.A00 = r9
        L_0x0507:
            java.lang.Object r7 = r2.A00()
            int r8 = r2.A00
            boolean r10 = r2.A01
            X.L8i r5 = new X.L8i
            r5.<init>(r6, r7, r8, r9, r10)
            X.4Cc r0 = r3.A02
            r10 = 0
            r11 = 25
            X.MHP r6 = new X.MHP
            r7 = r3
            r8 = r2
            r9 = r5
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11)
            java.lang.Object r0 = X.1Eo.A00(r1, r0, r6)
            return r0
        L_0x0526:
            int r9 = r2.A00
            goto L_0x0505
        L_0x0529:
            boolean r0 = r2 instanceof X.C60342Jjn
            if (r0 == 0) goto L_0x0530
            X.Kfy r6 = X.C62448Kfy.APPEND
            goto L_0x04ee
        L_0x0530:
            boolean r0 = r2 instanceof X.C60343Jjo
            if (r0 == 0) goto L_0x0537
            X.Kfy r6 = X.C62448Kfy.PREPEND
            goto L_0x04ee
        L_0x0537:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingSource.A04(X.LCU, X.4D7):java.lang.Object");
    }

    public Object A05(C63967LFt lFt) {
        if ((this instanceof C60349Jjw) || (this instanceof SavedAudioPagingSource) || (this instanceof ClipsACRBrowserPagingSource) || !(this instanceof TrendingAudioPagingSource)) {
            return null;
        }
        ((TrendingAudioPagingSource) this).A00 = true;
        return null;
    }
}
