package X;

import androidx.compose.runtime.Recomposer;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import java.util.List;

/* renamed from: X.9KP  reason: invalid class name */
public final class AnonymousClass9KP extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(07U r2, AnonymousClass07V r3, AnonymousClass4D7 r4, C262094Cc r5, AnonymousClass0r6 r6) {
        super(2, r4);
        this.A06 = 1;
        this.A02 = r3;
        this.A03 = r2;
        this.A01 = r5;
        this.A04 = r6;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.9KP, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.9KP, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        return new X.AnonymousClass9KP(r1, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        return new X.AnonymousClass9KP(r2, r1, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        return new X.AnonymousClass9KP(r5, r6, r7, r8, r9, r10, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            int r1 = r12.A06
            r10 = r14
            switch(r1) {
                case 0: goto L_0x003e;
                case 1: goto L_0x0052;
                case 2: goto L_0x0018;
                case 3: goto L_0x006c;
                case 4: goto L_0x0088;
                case 5: goto L_0x008e;
                case 6: goto L_0x0092;
                case 7: goto L_0x0098;
                case 8: goto L_0x00af;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c0;
                case 11: goto L_0x00cc;
                case 12: goto L_0x0024;
                case 13: goto L_0x0031;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r8 = r12.A03
            java.lang.Object r7 = r12.A05
            java.lang.Object r6 = r12.A04
            java.lang.Object r9 = r12.A01
            java.lang.Object r5 = r12.A02
            r11 = 14
        L_0x0012:
            X.9KP r4 = new X.9KP
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11)
            return r4
        L_0x0018:
            java.lang.Object r7 = r12.A05
            java.lang.Object r6 = r12.A04
            java.lang.Object r8 = r12.A03
            java.lang.Object r5 = r12.A02
            java.lang.Object r9 = r12.A01
            r11 = 2
            goto L_0x0012
        L_0x0024:
            java.lang.Object r5 = r12.A02
            java.lang.Object r6 = r12.A04
            java.lang.Object r7 = r12.A05
            java.lang.Object r8 = r12.A03
            java.lang.Object r9 = r12.A01
            r11 = 12
            goto L_0x0012
        L_0x0031:
            java.lang.Object r7 = r12.A05
            java.lang.Object r8 = r12.A03
            java.lang.Object r9 = r12.A01
            java.lang.Object r6 = r12.A04
            java.lang.Object r5 = r12.A02
            r11 = 13
            goto L_0x0012
        L_0x003e:
            java.lang.Object r2 = r12.A05
            androidx.compose.runtime.Recomposer r2 = (androidx.compose.runtime.Recomposer) r2
            java.lang.Object r1 = r12.A01
            X.0sK r1 = (X.0sK) r1
            java.lang.Object r0 = r12.A02
            X.5PR r0 = (X.AnonymousClass5PR) r0
            X.9KP r4 = new X.9KP
            r4.<init>((X.AnonymousClass5PR) r0, (androidx.compose.runtime.Recomposer) r2, (X.AnonymousClass4D7) r14, (X.0sK) r1)
            r4.A03 = r13
            return r4
        L_0x0052:
            java.lang.Object r6 = r12.A02
            X.07V r6 = (X.AnonymousClass07V) r6
            java.lang.Object r5 = r12.A03
            X.07U r5 = (X.07U) r5
            java.lang.Object r8 = r12.A01
            X.4Cc r8 = (X.C262094Cc) r8
            java.lang.Object r0 = r12.A04
            X.0r6 r0 = (X.AnonymousClass0r6) r0
            X.9KP r4 = new X.9KP
            r7 = r14
            r9 = r0
            r4.<init>((X.07U) r5, (X.AnonymousClass07V) r6, (X.AnonymousClass4D7) r7, (X.C262094Cc) r8, (X.AnonymousClass0r6) r9)
            r4.A05 = r13
            return r4
        L_0x006c:
            java.lang.Object r8 = r12.A03
            X.51R r8 = (X.AnonymousClass51R) r8
            java.lang.Object r7 = r12.A04
            X.51M r7 = (X.AnonymousClass51M) r7
            java.lang.Object r5 = r12.A05
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r5 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r5
            java.lang.Object r9 = r12.A01
            X.2Nn r9 = (X.2Nn) r9
            java.lang.Object r6 = r12.A02
            X.5kq r6 = (X.C293505kq) r6
            int r11 = r12.A00
            X.9KP r4 = new X.9KP
            r4.<init>((com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r5, (X.C293505kq) r6, (X.AnonymousClass51M) r7, (X.AnonymousClass51R) r8, (X.2Nn) r9, (X.AnonymousClass4D7) r10, (int) r11)
            return r4
        L_0x0088:
            java.lang.Object r2 = r12.A05
            java.lang.Object r1 = r12.A01
            r0 = 4
            goto L_0x00c6
        L_0x008e:
            java.lang.Object r1 = r12.A05
            r0 = 5
            goto L_0x00ba
        L_0x0092:
            java.lang.Object r2 = r12.A05
            java.lang.Object r1 = r12.A01
            r0 = 6
            goto L_0x00c6
        L_0x0098:
            java.lang.Object r7 = r12.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r12.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager) r6
            java.lang.Object r5 = r12.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r8 = r12.A01
            java.util.List r8 = (java.util.List) r8
            X.9KP r4 = new X.9KP
            r9 = r14
            r4.<init>((com.instagram.common.session.UserSession) r5, (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager) r6, (java.util.List) r7, (java.util.List) r8, (X.AnonymousClass4D7) r9)
            return r4
        L_0x00af:
            java.lang.Object r2 = r12.A05
            java.lang.Object r1 = r12.A01
            r0 = 8
            goto L_0x00c6
        L_0x00b6:
            java.lang.Object r1 = r12.A05
            r0 = 9
        L_0x00ba:
            X.9KP r4 = new X.9KP
            r4.<init>(r1, r14, r0)
            return r4
        L_0x00c0:
            java.lang.Object r2 = r12.A05
            java.lang.Object r1 = r12.A01
            r0 = 10
        L_0x00c6:
            X.9KP r4 = new X.9KP
            r4.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.AnonymousClass4D7) r14, (int) r0)
            return r4
        L_0x00cc:
            java.lang.Object r1 = r12.A05
            r0 = 11
            X.9KP r4 = new X.9KP
            r4.<init>(r1, r14, r0)
            r4.A01 = r13
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KP.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KP) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.9KP, X.4D7] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03de  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:309:0x0762=Splitter:B:309:0x0762, B:324:0x07c2=Splitter:B:324:0x07c2, B:268:0x0668=Splitter:B:268:0x0668} */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r3 = r18
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x0373;
                case 1: goto L_0x033b;
                case 2: goto L_0x030c;
                case 3: goto L_0x024a;
                case 4: goto L_0x077f;
                case 5: goto L_0x0165;
                case 6: goto L_0x071f;
                case 7: goto L_0x067f;
                case 8: goto L_0x062e;
                case 9: goto L_0x058c;
                case 10: goto L_0x0511;
                case 11: goto L_0x04a0;
                case 12: goto L_0x00f6;
                case 13: goto L_0x00c2;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x00a6
            if (r2 != r6) goto L_0x0498
            X.0eS.A00(r3)
        L_0x0015:
            X.7dS r3 = (X.C335737dS) r3
            r10 = 0
            X.7dS r2 = X.C335737dS.BOTTOMSHEET_MEDIA_CREATION_GENERIC
            X.7dS r1 = X.C335737dS.BOTTOMSHEET_MEDIA_CREATION_STORY
            X.7dS[] r1 = new X.C335737dS[]{r2, r1}
            java.util.Set r1 = X.0sc.A06(r1)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r8 = r0.A05
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.0qQ.A0B(r8, r10)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36323758193061322(0x810c4400012dca, double:3.0346291731017E-306)
            boolean r1 = X.182.A06(r4, r8, r1)
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.A02
            X.7pV r1 = (X.C342997pV) r1
            X.AhH r7 = new X.AhH
            r7.<init>(r1)
            java.lang.Object r6 = r0.A01
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00a3
            java.lang.Object r9 = r0.A04
            X.0wc r9 = (X.0wc) r9
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r5 = X.C335077cL.A00()
            X.0qQ.A0B(r3, r10)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r4 = r0.A01
            java.lang.String r2 = "media_creation_nudge_shown_count"
            int r0 = r4.getInt(r2, r10)
            X.0xY r1 = r4.AR4()
            int r0 = r0 + 1
            r1.E5Z(r2, r0)
            r1.apply()
            X.0xY r4 = r4.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "media_creation_nudge_last_seen_time_ms"
            r4.E5c(r0, r1)
            r4.apply()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.C227642jf.A04(r2, r8)
            java.lang.String r0 = "nudge_type"
            r2.putSerializable(r0, r3)
            X.Gzy r1 = new X.Gzy
            r1.<init>()
            r1.setArguments(r2)
            X.IbI r0 = new X.IbI
            r0.<init>(r9, r5, r7)
            r1.A00 = r0
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A00(r6, r1, r8)
        L_0x00a3:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x00a6:
            X.0eS.A00(r3)
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r5 = X.C335077cL.A00()
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r0.A05
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A04
            X.0wc r2 = (X.0wc) r2
            r0.A00 = r6
            java.lang.Enum r3 = r5.A02(r2, r3, r4, r0)
            if (r3 != r1) goto L_0x0015
            return r1
        L_0x00c2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x00d3
            if (r2 == r4) goto L_0x034c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            X.0eS.A00(r3)
            java.lang.Object r2 = r0.A05
            X.7aW r2 = (X.C334007aW) r2
            X.7aT r5 = r2.A00
            java.lang.Object r8 = r0.A03
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            java.lang.Object r6 = r0.A01
            com.instagram.user.model.FollowStatus r6 = (com.instagram.user.model.FollowStatus) r6
            java.lang.Object r7 = r0.A04
            X.EWA r7 = (X.EWA) r7
            java.lang.Object r2 = r0.A02
            X.0sa r2 = (X.C62320sa) r2
            r0.A00 = r4
            r9 = r0
            r10 = r2
            java.lang.Object r0 = r5.ClV(r6, r7, r8, r9, r10)
            goto L_0x0370
        L_0x00f6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0114
            if (r2 != r5) goto L_0x07e7
            X.0eS.A00(r3)
        L_0x0102:
            X.9IP r3 = (X.AnonymousClass9IP) r3
            boolean r1 = r3.A02
            if (r1 == 0) goto L_0x0144
            java.lang.Object r1 = r0.A01
            X.B2F r1 = (X.B2F) r1
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r0 = r3.A01
            r1.onSuccess(r0)
            goto L_0x00a3
        L_0x0114:
            X.0eS.A00(r3)
            java.lang.Object r6 = r0.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r8 = r0.A04
            X.0lg r8 = (X.0lg) r8
            java.lang.Object r2 = r0.A05
            X.1pf r2 = (X.C66621pf) r2
            X.12T r4 = r2.A02
            r7 = 0
            r3 = 1318303345(0x4e93b671, float:1.23910362E9)
            r2 = 3
            X.0nV r13 = r4.CO6(r3, r2)
            java.lang.Object r9 = r0.A03
            X.RqI r9 = (X.C10320RqI) r9
            r0.A00 = r5
            java.lang.String r10 = "AndroidAppAttestationPluginKeystore"
            r14 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = r0
            java.lang.Object r3 = com.instagram.security.attestation.keystore.worker.KeyAttestationUtils.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r1) goto L_0x0102
            return r1
        L_0x0144:
            java.lang.Object r1 = r3.A01
            X.Gn5 r1 = (X.C53375Gn5) r1
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = X.00k.A0L(r1)
            X.RHJ r1 = (X.RHJ) r1
            if (r1 != 0) goto L_0x015a
        L_0x0158:
            X.RHJ r1 = X.RHJ.A0Z
        L_0x015a:
            java.lang.Object r0 = r0.A01
            X.B2F r0 = (X.B2F) r0
            if (r0 == 0) goto L_0x00a3
            r0.DEE(r1)
            goto L_0x00a3
        L_0x0165:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r5 = 5
            r8 = 4
            r2 = 3
            r6 = 2
            r9 = 1
            r14 = 0
            if (r4 == 0) goto L_0x0183
            if (r4 == r9) goto L_0x01be
            if (r4 == r6) goto L_0x01f1
            if (r4 == r2) goto L_0x021c
            if (r4 == r8) goto L_0x0239
            if (r4 == r5) goto L_0x034c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0183:
            X.0eS.A00(r3)
            java.lang.Object r10 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r10 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r10
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase r3 = r10.A05
            X.92U r7 = r3.A00()
            X.92T r4 = r3.A01()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Map r3 = r10.A07
            java.util.Set r3 = r3.keySet()
            r13.addAll(r3)
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r11 = r10.A06
            com.instagram.common.session.UserSession r10 = r10.A01
            X.0sn r12 = X.0sn.A00
            r0.A01 = r7
            r0.A02 = r4
            r0.A03 = r13
            r0.A00 = r9
            X.0nV r3 = r11.A00
            X.9KP r9 = new X.9KP
            r9.<init>((com.instagram.common.session.UserSession) r10, (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager) r11, (java.util.List) r12, (java.util.List) r13, (X.AnonymousClass4D7) r14)
            java.lang.Object r3 = X.1Eo.A00(r0, r3, r9)
            if (r3 != r1) goto L_0x01cd
            return r1
        L_0x01be:
            java.lang.Object r13 = r0.A03
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r4 = r0.A02
            X.92T r4 = (X.AnonymousClass92T) r4
            java.lang.Object r7 = r0.A01
            X.92U r7 = (X.AnonymousClass92U) r7
            X.0eS.A00(r3)
        L_0x01cd:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r9 = r3 instanceof X.C239793Ih
            if (r9 == 0) goto L_0x0223
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r9 = r3.A00
            java.util.List r9 = (java.util.List) r9
            r0.A01 = r7
            r0.A02 = r4
            r0.A03 = r13
            r0.A04 = r9
            r0.A00 = r6
            X.3oI r10 = r7.A05
            X.5mx r3 = new X.5mx
            r3.<init>(r7, r4, r9)
            java.lang.Object r3 = X.AnonymousClass1t4.A00(r10, r0, r3)
            if (r3 != r1) goto L_0x0204
            return r1
        L_0x01f1:
            java.lang.Object r9 = r0.A04
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r13 = r0.A03
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r4 = r0.A02
            X.92T r4 = (X.AnonymousClass92T) r4
            java.lang.Object r7 = r0.A01
            X.92U r7 = (X.AnonymousClass92U) r7
            X.0eS.A00(r3)
        L_0x0204:
            r0.A01 = r4
            r0.A02 = r14
            r0.A03 = r14
            r0.A04 = r14
            r0.A00 = r2
            X.3oI r3 = r7.A05
            X.5rA r2 = new X.5rA
            r2.<init>(r7, r4, r9, r13)
            java.lang.Object r2 = X.AnonymousClass1t4.A00(r3, r0, r2)
            if (r2 != r1) goto L_0x0223
            return r1
        L_0x021c:
            java.lang.Object r4 = r0.A01
            X.92T r4 = (X.AnonymousClass92T) r4
            X.0eS.A00(r3)
        L_0x0223:
            r0.A01 = r14
            r0.A02 = r14
            r0.A03 = r14
            r0.A00 = r8
            X.3oI r3 = r4.A00
            X.AtM r2 = new X.AtM
            r2.<init>(r4, r6)
            java.lang.Object r3 = X.AnonymousClass1t4.A00(r3, r0, r2)
            if (r3 != r1) goto L_0x023c
            return r1
        L_0x0239:
            X.0eS.A00(r3)
        L_0x023c:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r2
            r0.A00 = r5
            java.lang.Object r0 = com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A00(r2, r3, r0)
            goto L_0x0370
        L_0x024a:
            X.0eS.A00(r3)
            java.lang.Object r2 = r0.A03
            X.51R r2 = (X.AnonymousClass51R) r2
            java.lang.String r12 = r2.A0F
            java.lang.Object r1 = r0.A04
            X.51M r1 = (X.AnonymousClass51M) r1
            boolean r6 = X.AnonymousClass51Q.A05(r1)
            java.lang.Object r10 = r0.A05
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r10 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r10
            android.content.Context r9 = r10.A04
            java.lang.Object r7 = r0.A01
            X.2Nn r7 = (X.2Nn) r7
            if (r6 == 0) goto L_0x0273
            java.lang.String r3 = r2.A0I
            if (r3 != 0) goto L_0x0274
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0273:
            r3 = r12
        L_0x0274:
            java.lang.Object r1 = r0.A02
            X.5kq r1 = (X.C293505kq) r1
            java.lang.String r4 = r1.A0T
            r8 = 1
            r1 = 2
            X.0qQ.A0B(r7, r1)
            r1 = 3
            X.0qQ.A0B(r3, r1)
            r1 = 5
            X.0qQ.A0B(r4, r1)
            if (r6 == 0) goto L_0x0305
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            int r2 = X.AnonymousClass8XE.A01(r9)
            int r1 = X.AnonymousClass8XE.A00(r9)
            int r1 = X.1MF.A01(r3, r2, r1)
            int r1 = java.lang.Math.max(r1, r8)
            r5.inSampleSize = r1
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r5.inPreferredConfig = r1
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r3, r5)
        L_0x02a8:
            java.lang.String r5 = "DraftUtils"
            r11 = 0
            if (r1 != 0) goto L_0x02cd
            java.lang.String r2 = "No cover frame found. isPhoto: "
            java.lang.String r1 = ", filePath: "
            java.lang.String r1 = X.002.A1A(r2, r1, r3, r6)
            X.0kD.A06(r5, r1, r11)
        L_0x02b8:
            if (r11 == 0) goto L_0x00a3
            int r14 = r0.A00
            X.6oS r1 = X.C318116oQ.A00(r10)
            r13 = 0
            X.MGl r9 = new X.MGl
            r9.<init>((com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r10, (java.io.File) r11, (java.lang.String) r12, (X.AnonymousClass4D7) r13, (int) r14)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r9, r1)
            goto L_0x00a3
        L_0x02cd:
            java.io.File r2 = r7.A01()     // Catch:{ IOException -> 0x02fb }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x02fb }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x02fb }
            X.C357818Zu.A00(r3)     // Catch:{ IOException -> 0x02fb }
            java.lang.String r2 = "cover_photo.jpg"
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x02fb }
            r4.<init>(r3, r2)     // Catch:{ IOException -> 0x02fb }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02fb }
            r2.<init>(r4)     // Catch:{ IOException -> 0x02fb }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x02fb }
            r3.<init>(r2)     // Catch:{ IOException -> 0x02fb }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x02fb }
            boolean r2 = X.JZK.A00(r2, r1, r3)     // Catch:{ IOException -> 0x02fb }
            if (r2 != 0) goto L_0x02f3
            r4 = r11
        L_0x02f3:
            r3.close()     // Catch:{ IOException -> 0x02fb }
            r1.recycle()
            r11 = r4
            goto L_0x02b8
        L_0x02fb:
            r3 = move-exception
            java.lang.String r2 = "could not save draft cover frame"
            X.0kD.A06(r5, r2, r3)     // Catch:{ all -> 0x07ef }
            r1.recycle()
            goto L_0x02b8
        L_0x0305:
            r1 = 0
            android.graphics.Bitmap r1 = X.C39908AIz.A01(r3, r1)
            goto L_0x02a8
        L_0x030c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x031d
            if (r2 == r4) goto L_0x034c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x031d:
            X.0eS.A00(r3)
            java.lang.Object r2 = r0.A05
            X.07Z r2 = (X.AnonymousClass07Z) r2
            X.07V r2 = r2.getLifecycle()
            java.lang.Object r3 = r0.A04
            X.07U r3 = (X.07U) r3
            r9 = 0
            java.lang.Object r8 = r0.A03
            java.lang.Object r6 = r0.A02
            java.lang.Object r7 = r0.A01
            r10 = 33
            X.MHG r5 = new X.MHG
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            goto L_0x036a
        L_0x033b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0351
            if (r2 == r4) goto L_0x034c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x034c:
            X.0eS.A00(r3)
            goto L_0x00a3
        L_0x0351:
            X.0eS.A00(r3)
            java.lang.Object r8 = r0.A05
            java.lang.Object r2 = r0.A02
            X.07V r2 = (X.AnonymousClass07V) r2
            java.lang.Object r3 = r0.A03
            X.07U r3 = (X.07U) r3
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A04
            r9 = 0
            r10 = 19
            X.MHP r5 = new X.MHP
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
        L_0x036a:
            r0.A00 = r4
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r3, r2, r0, r5)
        L_0x0370:
            if (r0 != r1) goto L_0x00a3
            return r1
        L_0x0373:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0388
            if (r2 != r9) goto L_0x07f4
            java.lang.Object r8 = r0.A04
            X.5Ps r8 = (X.C285105Ps) r8
            java.lang.Object r4 = r0.A03
            X.0eS.A00(r3)     // Catch:{ all -> 0x0805 }
            goto L_0x047b
        L_0x0388:
            X.0eS.A00(r3)
            java.lang.Object r2 = r0.A03
            X.4Cq r2 = (X.C262224Cq) r2
            X.4Cc r2 = r2.ArX()
            X.4Co r4 = X.AnonymousClass5H8.A00(r2)
            java.lang.Object r12 = r0.A05
            androidx.compose.runtime.Recomposer r12 = (androidx.compose.runtime.Recomposer) r12
            X.05G r2 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r6 = r12.A0D
            monitor-enter(r6)
            java.lang.Throwable r2 = r12.A02     // Catch:{ all -> 0x0836 }
            if (r2 != 0) goto L_0x0835
            X.05G r2 = r12.A0K     // Catch:{ all -> 0x0836 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0836 }
            X.4e5 r3 = (X.AnonymousClass4e5) r3     // Catch:{ all -> 0x0836 }
            X.4e5 r2 = X.AnonymousClass4e5.ShuttingDown     // Catch:{ all -> 0x0836 }
            int r2 = r3.compareTo(r2)     // Catch:{ all -> 0x0836 }
            if (r2 <= 0) goto L_0x082d
            X.4Co r2 = r12.A06     // Catch:{ all -> 0x0836 }
            if (r2 != 0) goto L_0x0825
            r12.A06 = r4     // Catch:{ all -> 0x0836 }
            androidx.compose.runtime.Recomposer.A01(r12)     // Catch:{ all -> 0x0836 }
            monitor-exit(r6)
            r3 = 11
            X.JFw r2 = new X.JFw
            r2.<init>(r12, r3)
            X.5Pr r8 = X.AnonymousClass5PH.A01(r2)
            X.5Pm r13 = r12.A0B
        L_0x03cb:
            X.05G r11 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r10 = r11.getValue()
            X.5Pd r10 = (X.C284975Pd) r10
            r7 = r10
            X.5Pc r7 = (X.C284965Pc) r7
            X.5Pf r6 = r7.A00
            boolean r2 = r6.containsKey(r13)
            if (r2 != 0) goto L_0x03f2
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x03fb
            X.5Pt r2 = new X.5Pt
            r2.<init>()
            X.5Pf r2 = r6.A04(r13, r2)
            X.5Pc r7 = new X.5Pc
            r7.<init>(r2, r13, r13)
        L_0x03f2:
            if (r10 == r7) goto L_0x0424
            boolean r2 = r11.AIY(r10, r7)
            if (r2 == 0) goto L_0x03cb
            goto L_0x0424
        L_0x03fb:
            java.lang.Object r14 = r7.A02
            java.lang.Object r2 = r6.get(r14)
            X.0qQ.A0A(r2)
            X.5Pt r2 = (X.AnonymousClass5Pt) r2
            java.lang.Object r3 = r2.A01
            X.5Pt r2 = new X.5Pt
            r2.<init>(r3, r13)
            X.5Pf r6 = r6.A04(r14, r2)
            X.5Pe r3 = X.AnonymousClass5Pe.A00
            X.5Pt r2 = new X.5Pt
            r2.<init>(r14, r3)
            X.5Pf r3 = r6.A04(r13, r2)
            java.lang.Object r2 = r7.A01
            X.5Pc r7 = new X.5Pc
            r7.<init>(r3, r2, r13)
            goto L_0x03f2
        L_0x0424:
            java.lang.Object r2 = r12.A0D     // Catch:{ all -> 0x0803 }
            monitor-enter(r2)     // Catch:{ all -> 0x0803 }
            java.util.List r14 = androidx.compose.runtime.Recomposer.A00(r12)     // Catch:{ all -> 0x0800 }
            monitor-exit(r2)     // Catch:{ all -> 0x0803 }
            r13 = 0
            int r12 = r14.size()     // Catch:{ all -> 0x0803 }
        L_0x0431:
            if (r13 >= r12) goto L_0x045e
            java.lang.Object r2 = r14.get(r13)     // Catch:{ all -> 0x0803 }
            X.5Pj r2 = (X.C285025Pj) r2     // Catch:{ all -> 0x0803 }
            X.5Wn r2 = (X.AnonymousClass5Wn) r2     // Catch:{ all -> 0x0803 }
            java.lang.Object r11 = r2.A0D     // Catch:{ all -> 0x0803 }
            monitor-enter(r11)     // Catch:{ all -> 0x0803 }
            X.5Wq r2 = r2.A08     // Catch:{ all -> 0x07fc }
            java.lang.Object[] r10 = r2.A09     // Catch:{ all -> 0x07fc }
            r7 = 0
            int r6 = r10.length     // Catch:{ all -> 0x07fc }
        L_0x0444:
            if (r7 >= r6) goto L_0x045a
            r3 = r10[r7]     // Catch:{ all -> 0x07fc }
            boolean r2 = r3 instanceof X.C286625Xd     // Catch:{ all -> 0x07fc }
            if (r2 == 0) goto L_0x0457
            X.5Xd r3 = (X.C286625Xd) r3     // Catch:{ all -> 0x07fc }
            if (r3 == 0) goto L_0x0457
            X.5Wo r2 = r3.A05     // Catch:{ all -> 0x07fc }
            if (r2 == 0) goto L_0x0457
            r2.CNl(r3, r5)     // Catch:{ all -> 0x07fc }
        L_0x0457:
            int r7 = r7 + 1
            goto L_0x0444
        L_0x045a:
            monitor-exit(r11)     // Catch:{ all -> 0x0803 }
            int r13 = r13 + 1
            goto L_0x0431
        L_0x045e:
            java.lang.Object r7 = r0.A01     // Catch:{ all -> 0x0803 }
            X.0sK r7 = (X.0sK) r7     // Catch:{ all -> 0x0803 }
            java.lang.Object r6 = r0.A02     // Catch:{ all -> 0x0803 }
            X.5PR r6 = (X.AnonymousClass5PR) r6     // Catch:{ all -> 0x0803 }
            r3 = 14
            X.MHP r2 = new X.MHP     // Catch:{ all -> 0x0803 }
            r2.<init>((java.lang.Object) r7, (java.lang.Object) r6, (X.AnonymousClass4D7) r5, (int) r3)     // Catch:{ all -> 0x0803 }
            r0.A03 = r4     // Catch:{ all -> 0x0803 }
            r0.A04 = r8     // Catch:{ all -> 0x0803 }
            r0.A00 = r9     // Catch:{ all -> 0x0803 }
            java.lang.Object r2 = X.19E.A00(r0, r2)     // Catch:{ all -> 0x0803 }
            if (r2 != r1) goto L_0x047b
            goto L_0x07ff
        L_0x047b:
            r8.dispose()
            java.lang.Object r1 = r0.A05
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1
            X.05G r0 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r3 = r1.A0D
            monitor-enter(r3)
            X.4Co r0 = r1.A06     // Catch:{ all -> 0x0822 }
            if (r0 != r4) goto L_0x048d
            r1.A06 = r5     // Catch:{ all -> 0x0822 }
        L_0x048d:
            androidx.compose.runtime.Recomposer.A01(r1)     // Catch:{ all -> 0x0822 }
            monitor-exit(r3)
            X.5Pm r0 = r1.A0B
            X.C392299ua.A00(r0)
            goto L_0x00a3
        L_0x0498:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04a0:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x04f4
            if (r4 != r2) goto L_0x0509
            java.lang.Object r9 = r0.A04
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A02
            java.lang.Object r8 = r0.A01
            X.0eS.A00(r3)
        L_0x04b4:
            java.lang.Object r7 = r0.A05
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r7 = (com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.1Wm.A05
            X.4Cc r2 = r0.getContext()
            X.1Wm r3 = new X.1Wm
            r3.<init>(r2)
            X.3ju r2 = r7.A0D
            X.38B r2 = r2.BY2()
            r10 = 0
            r11 = 5
            X.MGO r4 = new X.MGO
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.A07(r4, r2)
            X.3ju r2 = r7.A0C
            X.38B r2 = r2.BY2()
            r11 = 6
            X.MGO r4 = new X.MGO
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.A07(r4, r2)
            r0.A01 = r8
            r0.A02 = r5
            r0.A03 = r6
            r0.A04 = r9
            r2 = 1
            r0.A00 = r2
            java.lang.Object r2 = X.1Wm.A03(r0, r3)
            if (r2 != r1) goto L_0x04b4
            return r1
        L_0x04f4:
            X.0eS.A00(r3)
            java.lang.Object r8 = r0.A01
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            goto L_0x04b4
        L_0x0509:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0511:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0533
            if (r2 != r8) goto L_0x052b
            java.lang.Object r4 = r0.A04
            X.17J r4 = (X.AnonymousClass17J) r4
            java.lang.Object r5 = r0.A03
            X.1Ej r5 = (X.1Ej) r5
            java.lang.Object r6 = r0.A02
            X.136 r6 = (X.136) r6
            X.0eS.A00(r3)
            goto L_0x055f
        L_0x052b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0533:
            X.0eS.A00(r3)
            java.lang.Object r5 = r0.A05
            X.1Ej r5 = (X.1Ej) r5
            X.05G r4 = r5.A04
        L_0x053c:
            java.lang.Object r3 = r4.getValue()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            boolean r2 = r4.AIY(r3, r2)
            if (r2 == 0) goto L_0x053c
            X.136 r6 = r5.A05
            java.lang.Object r4 = r0.A01
            X.17J r4 = (X.AnonymousClass17J) r4
            r0.A02 = r6
            r0.A03 = r5
            r0.A04 = r4
            r0.A00 = r8
            java.lang.Object r2 = X.136.A00(r0, r6)
            if (r2 != r1) goto L_0x055f
            return r1
        L_0x055f:
            boolean r1 = r5.A06     // Catch:{ all -> 0x0587 }
            if (r1 == 0) goto L_0x056c
            java.util.List r2 = r5.A01     // Catch:{ all -> 0x0587 }
            com.facebook.pando.TreeUpdaterJNI r1 = r4.FHC()     // Catch:{ all -> 0x0587 }
            r2.add(r1)     // Catch:{ all -> 0x0587 }
        L_0x056c:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x0587 }
            r6.A05(r7)
            java.lang.Object r0 = r0.A05
            X.1Ej r0 = (X.1Ej) r0
            X.05G r3 = r0.A04
        L_0x0577:
            java.lang.Object r2 = r3.getValue()
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0577
            return r1
        L_0x0587:
            r2 = move-exception
            r6.A05(r7)
            throw r2
        L_0x058c:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r10 = 3
            r9 = 2
            r2 = 1
            r8 = 0
            if (r4 == 0) goto L_0x05c9
            if (r4 == r2) goto L_0x05bd
            if (r4 == r9) goto L_0x05a9
            if (r4 != r10) goto L_0x05a1
            java.lang.Object r4 = r0.A01
            X.136 r4 = (X.136) r4
            goto L_0x0617
        L_0x05a1:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x05a9:
            java.lang.Object r7 = r0.A04
            X.136 r7 = (X.136) r7
            java.lang.Object r6 = r0.A03
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.A02
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r5 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager) r5
            java.lang.Object r4 = r0.A01
            X.136 r4 = (X.136) r4
            X.0eS.A00(r3)     // Catch:{ all -> 0x0629 }
            goto L_0x05fe
        L_0x05bd:
            java.lang.Object r5 = r0.A02
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r5 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager) r5
            java.lang.Object r4 = r0.A01
            X.136 r4 = (X.136) r4
            X.0eS.A00(r3)
            goto L_0x05df
        L_0x05c9:
            X.0eS.A00(r3)
            java.lang.Object r5 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r5 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager) r5
            X.136 r4 = r5.A0I
            r0.A01 = r4
            r0.A02 = r5
            r0.A00 = r2
            java.lang.Object r2 = X.136.A00(r0, r4)
            if (r2 != r1) goto L_0x05df
            return r1
        L_0x05df:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0627 }
            r6.<init>()     // Catch:{ all -> 0x0627 }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = r5.A00     // Catch:{ all -> 0x0627 }
            if (r2 == 0) goto L_0x05eb
            r6.add(r2)     // Catch:{ all -> 0x0627 }
        L_0x05eb:
            X.136 r7 = r5.A0J     // Catch:{ all -> 0x0627 }
            r0.A01 = r4     // Catch:{ all -> 0x0627 }
            r0.A02 = r5     // Catch:{ all -> 0x0627 }
            r0.A03 = r6     // Catch:{ all -> 0x0627 }
            r0.A04 = r7     // Catch:{ all -> 0x0627 }
            r0.A00 = r9     // Catch:{ all -> 0x0627 }
            java.lang.Object r2 = X.136.A00(r0, r7)     // Catch:{ all -> 0x0627 }
            if (r2 != r1) goto L_0x05fe
            return r1
        L_0x05fe:
            java.util.Set r2 = r5.A0E     // Catch:{ all -> 0x0622 }
            r6.addAll(r2)     // Catch:{ all -> 0x0622 }
            r7.A05(r8)     // Catch:{ all -> 0x0627 }
            r0.A01 = r4     // Catch:{ all -> 0x0627 }
            r0.A02 = r8     // Catch:{ all -> 0x0627 }
            r0.A03 = r8     // Catch:{ all -> 0x0627 }
            r0.A04 = r8     // Catch:{ all -> 0x0627 }
            r0.A00 = r10     // Catch:{ all -> 0x0627 }
            java.lang.Object r0 = com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager.A01(r5, r6, r0)     // Catch:{ all -> 0x0627 }
            if (r0 != r1) goto L_0x061a
            return r1
        L_0x0617:
            X.0eS.A00(r3)     // Catch:{ all -> 0x0620 }
        L_0x061a:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x0620 }
            r4.A05(r8)
            return r1
        L_0x0620:
            r2 = move-exception
            goto L_0x062a
        L_0x0622:
            r0 = move-exception
            r7.A05(r8)     // Catch:{ all -> 0x0627 }
            throw r0     // Catch:{ all -> 0x0627 }
        L_0x0627:
            r2 = move-exception
            goto L_0x062a
        L_0x0629:
            r2 = move-exception
        L_0x062a:
            r4.A05(r8)
            throw r2
        L_0x062e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x064e
            if (r2 != r6) goto L_0x0646
            java.lang.Object r2 = r0.A04
            java.lang.Object r4 = r0.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl) r4
            java.lang.Object r5 = r0.A02
            X.136 r5 = (X.136) r5
            X.0eS.A00(r3)
            goto L_0x0668
        L_0x0646:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x064e:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl) r4
            X.136 r5 = r4.A08
            java.lang.Object r2 = r0.A01
            r0.A02 = r5
            r0.A03 = r4
            r0.A04 = r2
            r0.A00 = r6
            java.lang.Object r0 = X.136.A00(r0, r5)
            if (r0 != r1) goto L_0x0668
            return r1
        L_0x0668:
            java.util.Map r1 = r4.A05     // Catch:{ all -> 0x07e2 }
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x07e2 }
            if (r0 == 0) goto L_0x067b
            java.lang.Object r0 = r1.remove(r2)     // Catch:{ all -> 0x07e2 }
            X.B2w r0 = (X.C41841B2w) r0     // Catch:{ all -> 0x07e2 }
            if (r0 == 0) goto L_0x067b
            r0.Ezd()     // Catch:{ all -> 0x07e2 }
        L_0x067b:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x07e2 }
            goto L_0x07de
        L_0x067f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r15 = 1
            if (r2 == 0) goto L_0x06cd
            if (r2 != r15) goto L_0x0717
            java.lang.Object r6 = r0.A04
            java.util.List r6 = (java.util.List) r6
            X.0eS.A00(r3)
        L_0x068f:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0703
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x06a0
            r6.addAll(r1)
        L_0x06a0:
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            X.92I r1 = X.AnonymousClass92I.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x06c7
            X.5om r8 = X.C295715om.A05
            X.5ol r9 = X.C295705ol.A06
            java.util.List r14 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r14)
            r16 = 0
            java.lang.String r10 = "user_custom_dictionary_key"
            java.lang.String r11 = ""
            X.5ky r7 = new X.5ky
            r12 = r11
            r13 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6.add(r7)
        L_0x06c7:
            X.3Ih r1 = new X.3Ih
            r1.<init>(r6)
            return r1
        L_0x06cd:
            X.0eS.A00(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.lang.Object r2 = r0.A02
            java.util.Collection r2 = (java.util.Collection) r2
            r7.addAll(r2)
            java.lang.String r2 = "nolang"
            r7.add(r2)
            java.lang.Object r2 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager) r2
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader r5 = r2.A01
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.util.List r2 = X.00k.A0a(r7)
            r0.A04 = r6
            r0.A00 = r15
            java.lang.Object r3 = r5.A00(r4, r3, r2, r0)
            if (r3 != r1) goto L_0x068f
            return r1
        L_0x0703:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0711
            X.5sO r3 = (X.C297815sO) r3
            java.lang.Object r0 = r3.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
            return r1
        L_0x0711:
            X.Wub r2 = new X.Wub
            r2.<init>()
            throw r2
        L_0x0717:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x071f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0741
            if (r2 != r6) goto L_0x0739
            java.lang.Object r2 = r0.A04
            X.92W r2 = (X.AnonymousClass92W) r2
            java.lang.Object r4 = r0.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r4
            java.lang.Object r5 = r0.A02
            X.136 r5 = (X.136) r5
            X.0eS.A00(r3)
            goto L_0x0762
        L_0x0739:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0741:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r4
            java.util.Set r3 = r4.A09
            java.lang.Object r2 = r0.A01
            X.92W r2 = (X.AnonymousClass92W) r2
            r3.remove(r2)
            X.136 r5 = r4.A0H
            r0.A02 = r5
            r0.A03 = r4
            r0.A04 = r2
            r0.A00 = r6
            java.lang.Object r0 = X.136.A00(r0, r5)
            if (r0 != r1) goto L_0x0762
            return r1
        L_0x0762:
            java.util.Map r0 = r4.A08     // Catch:{ all -> 0x07e2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x07e2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x07e2 }
        L_0x076c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07e2 }
            if (r0 == 0) goto L_0x077c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07e2 }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r0     // Catch:{ all -> 0x07e2 }
            r0.A05(r2)     // Catch:{ all -> 0x07e2 }
            goto L_0x076c
        L_0x077c:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x07e2 }
            goto L_0x07de
        L_0x077f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x07a1
            if (r2 != r6) goto L_0x0799
            java.lang.Object r2 = r0.A04
            X.92W r2 = (X.AnonymousClass92W) r2
            java.lang.Object r4 = r0.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r4
            java.lang.Object r5 = r0.A02
            X.136 r5 = (X.136) r5
            X.0eS.A00(r3)
            goto L_0x07c2
        L_0x0799:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07a1:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A05
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r4
            java.util.Set r3 = r4.A09
            java.lang.Object r2 = r0.A01
            X.92W r2 = (X.AnonymousClass92W) r2
            r3.add(r2)
            X.136 r5 = r4.A0H
            r0.A02 = r5
            r0.A03 = r4
            r0.A04 = r2
            r0.A00 = r6
            java.lang.Object r0 = X.136.A00(r0, r5)
            if (r0 != r1) goto L_0x07c2
            return r1
        L_0x07c2:
            java.util.Map r0 = r4.A08     // Catch:{ all -> 0x07e2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x07e2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x07e2 }
        L_0x07cc:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07e2 }
            if (r0 == 0) goto L_0x07dc
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07e2 }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r0     // Catch:{ all -> 0x07e2 }
            r0.A04(r2)     // Catch:{ all -> 0x07e2 }
            goto L_0x07cc
        L_0x07dc:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x07e2 }
        L_0x07de:
            r5.A05(r7)
            return r1
        L_0x07e2:
            r2 = move-exception
            r5.A05(r7)
            throw r2
        L_0x07e7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07ef:
            r0 = move-exception
            r1.recycle()
            throw r0
        L_0x07f4:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x07fc:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0803 }
            throw r1     // Catch:{ all -> 0x0803 }
        L_0x07ff:
            return r1
        L_0x0800:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0803 }
            throw r1     // Catch:{ all -> 0x0803 }
        L_0x0803:
            r2 = move-exception
            goto L_0x0806
        L_0x0805:
            r2 = move-exception
        L_0x0806:
            r8.dispose()
            java.lang.Object r1 = r0.A05
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1
            X.05G r0 = androidx.compose.runtime.Recomposer.A0N
            java.lang.Object r3 = r1.A0D
            monitor-enter(r3)
            X.4Co r0 = r1.A06     // Catch:{ all -> 0x0822 }
            if (r0 != r4) goto L_0x0818
            r1.A06 = r5     // Catch:{ all -> 0x0822 }
        L_0x0818:
            androidx.compose.runtime.Recomposer.A01(r1)     // Catch:{ all -> 0x0822 }
            monitor-exit(r3)
            X.5Pm r0 = r1.A0B
            X.C392299ua.A00(r0)
            throw r2
        L_0x0822:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L_0x0825:
            java.lang.String r0 = "Recomposer already running"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0836 }
            r1.<init>(r0)     // Catch:{ all -> 0x0836 }
            goto L_0x0834
        L_0x082d:
            java.lang.String r0 = "Recomposer shut down"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0836 }
            r1.<init>(r0)     // Catch:{ all -> 0x0836 }
        L_0x0834:
            throw r1     // Catch:{ all -> 0x0836 }
        L_0x0835:
            throw r2     // Catch:{ all -> 0x0836 }
        L_0x0836:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(AnonymousClass5PR r2, Recomposer recomposer, AnonymousClass4D7 r4, 0sK r5) {
        super(2, r4);
        this.A06 = 0;
        this.A05 = recomposer;
        this.A01 = r5;
        this.A02 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C293505kq r3, AnonymousClass51M r4, AnonymousClass51R r5, 2Nn r6, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A06 = 3;
        this.A03 = r5;
        this.A04 = r4;
        this.A05 = clipsCreationDraftViewModel;
        this.A01 = r6;
        this.A02 = r3;
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(UserSession userSession, ContentFilterDictionarySyncManager contentFilterDictionarySyncManager, List list, List list2, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A06 = 7;
        this.A02 = list;
        this.A05 = contentFilterDictionarySyncManager;
        this.A03 = userSession;
        this.A01 = list2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A06 = i;
        this.A05 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A06 = i;
        this.A05 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KP(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A06 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
    }
}
