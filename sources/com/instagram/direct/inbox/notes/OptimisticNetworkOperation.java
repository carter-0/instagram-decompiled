package com.instagram.direct.inbox.notes;

import X.05G;
import X.AnonymousClass4D7;
import X.C279864zZ;
import X.C279894zc;
import X.NWL;
import X.NWM;
import X.NWN;
import X.NWO;
import X.NWP;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

public abstract class OptimisticNetworkOperation {
    public boolean A00;
    public final NotesApi A01;

    public Object A02(NotesApi notesApi, List list, AnonymousClass4D7 r18) {
        NotesApi notesApi2 = notesApi;
        AnonymousClass4D7 r12 = r18;
        if (this instanceof NWP) {
            return notesApi2.A04(String.valueOf(((NWP) this).A03), r12);
        }
        if (this instanceof NWN) {
            NWN nwn = (NWN) this;
            return notesApi2.A01((Integer) null, (Integer) null, nwn.A04, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r12, nwn.A02);
        } else if (this instanceof NWO) {
            NWO nwo = (NWO) this;
            return notesApi2.A00((Integer) null, (Integer) null, nwo.A03, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r12, nwo.A02);
        } else if (this instanceof NWM) {
            return notesApi2.A02((Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r12, ((NWM) this).A02);
        } else {
            return notesApi2.A03((Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r12, ((NWL) this).A02);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.4zZ} */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v6, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.Object A03(X.AnonymousClass4D7 r78) {
        /*
            r77 = this;
            r2 = r77
            r0 = r2
            boolean r1 = r2 instanceof X.NWP
            if (r1 == 0) goto L_0x0110
            r6 = r2
            X.NWP r6 = (X.NWP) r6
            long r1 = r6.A03
            java.lang.String r14 = r6.A06
            com.instagram.direct.inbox.notes.NotesRepository r0 = r6.A05
            monitor-enter(r0)
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0699 }
            r7 = 0
            X.05G r9 = r0.A0X     // Catch:{ all -> 0x010e }
            java.util.ArrayList r3 = X.C66583MXo.A0k(r9)     // Catch:{ all -> 0x010e }
            java.util.Iterator r2 = X.C66583MXo.A0l(r9)     // Catch:{ all -> 0x010e }
        L_0x0020:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x010e }
            r4 = 0
            if (r1 == 0) goto L_0x0065
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x010e }
            boolean r1 = X.C66583MXo.A1a(r5, r11)     // Catch:{ all -> 0x010e }
            if (r1 == 0) goto L_0x0020
        L_0x0031:
            X.4zZ r5 = (X.C279864zZ) r5     // Catch:{ all -> 0x010e }
            if (r5 == 0) goto L_0x0069
            java.util.HashMap r4 = r0.A0I     // Catch:{ all -> 0x010e }
            java.lang.String r2 = r5.A0K     // Catch:{ all -> 0x010e }
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x010e }
            boolean r1 = X.0qQ.A0K(r1, r5)     // Catch:{ all -> 0x010e }
            if (r1 == 0) goto L_0x0046
            r4.remove(r2)     // Catch:{ all -> 0x010e }
        L_0x0046:
            int r2 = r5.A01     // Catch:{ all -> 0x010e }
            com.instagram.direct.inbox.notes.models.NoteStyle r1 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT     // Catch:{ all -> 0x010e }
            int r1 = r1.A00     // Catch:{ all -> 0x010e }
            if (r2 != r1) goto L_0x005d
            java.lang.String r2 = r5.A0H     // Catch:{ all -> 0x010e }
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x010e }
            boolean r1 = X.0qQ.A0K(r1, r5)     // Catch:{ all -> 0x010e }
            if (r1 == 0) goto L_0x005d
            r4.remove(r2)     // Catch:{ all -> 0x010e }
        L_0x005d:
            int r7 = r3.indexOf(r5)     // Catch:{ all -> 0x010e }
            r3.remove(r5)     // Catch:{ all -> 0x010e }
            goto L_0x0067
        L_0x0065:
            r5 = r4
            goto L_0x0031
        L_0x0067:
            r4 = r5
            goto L_0x0076
        L_0x0069:
            java.lang.String r2 = "Note to be deleted (id="
            java.lang.String r1 = ") is not in repo"
            java.lang.String r2 = X.002.A0g(r2, r11, r1)     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "NotesRepository"
            X.0wb.A03(r1, r2)     // Catch:{ all -> 0x010e }
        L_0x0076:
            r9.Epw(r3)     // Catch:{ all -> 0x010e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x010e }
            r6.A01 = r4     // Catch:{ all -> 0x0699 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0699 }
            r6.A00 = r1     // Catch:{ all -> 0x0699 }
            r5 = 0
            if (r14 == 0) goto L_0x00f1
            r19 = 1
            java.util.ArrayList r8 = X.C66583MXo.A0k(r9)     // Catch:{ all -> 0x010e }
            X.05G r7 = r0.A0Z     // Catch:{ all -> 0x010e }
            java.lang.Object r1 = r7.getValue()     // Catch:{ all -> 0x010e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x010e }
            java.lang.Object r1 = r1.get(r14)     // Catch:{ all -> 0x010e }
            X.4zc r1 = (X.C279894zc) r1     // Catch:{ all -> 0x010e }
            r10 = 0
            if (r1 == 0) goto L_0x00ed
            com.instagram.user.model.User r13 = r1.A00     // Catch:{ all -> 0x010e }
            java.util.List r2 = r1.A05     // Catch:{ all -> 0x010e }
            java.util.ArrayList r4 = X.00k.A0U(r2)     // Catch:{ all -> 0x010e }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x010e }
        L_0x00ab:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x00ea
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x010e }
            boolean r2 = X.C66583MXo.A1a(r3, r11)     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x00ab
        L_0x00bb:
            X.4zZ r3 = (X.C279864zZ) r3     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x00ed
            r18 = 0
            r15 = r0
            r16 = r14
            r17 = r8
            r20 = r18
            r15.A0Q(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x010e }
            r4.remove(r3)     // Catch:{ all -> 0x010e }
            java.util.LinkedHashMap r10 = X.C66583MXo.A0n(r7)     // Catch:{ all -> 0x010e }
            java.lang.String r15 = r1.A04     // Catch:{ all -> 0x010e }
            java.lang.String r2 = r1.A02     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x010e }
            X.4zc r12 = new X.4zc     // Catch:{ all -> 0x010e }
            r17 = r1
            r18 = r4
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x010e }
            r10.put(r14, r12)     // Catch:{ all -> 0x010e }
            r7.Epw(r10)     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00ea:
            r3 = r10
            goto L_0x00bb
        L_0x00ec:
            r10 = r3
        L_0x00ed:
            r9.Epw(r8)     // Catch:{ all -> 0x010e }
            goto L_0x00f2
        L_0x00f1:
            r10 = r5
        L_0x00f2:
            r6.A02 = r10     // Catch:{ all -> 0x0699 }
            com.instagram.common.session.UserSession r1 = r6.A04     // Catch:{ all -> 0x0699 }
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)     // Catch:{ all -> 0x0699 }
            X.6uw r1 = new X.6uw     // Catch:{ all -> 0x0699 }
            r1.<init>(r5)     // Catch:{ all -> 0x0699 }
            r2.A00(r1)     // Catch:{ all -> 0x0699 }
            X.4zZ r1 = r6.A01     // Catch:{ all -> 0x0699 }
            boolean r1 = X.AnonymousClass7TF.A1V(r1)
            monitor-exit(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x010e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0699 }
        L_0x0110:
            boolean r1 = r2 instanceof X.NWN
            if (r1 == 0) goto L_0x01fc
            r5 = r2
            X.NWN r5 = (X.NWN) r5
            com.instagram.direct.inbox.notes.NotesRepository r0 = r5.A03
            long r1 = r5.A02
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r9 = r5.A05
            r0.A0N(r3, r9)
            java.lang.String r14 = r5.A04
            monitor-enter(r0)
            r8 = 0
            r13 = 0
            if (r9 == 0) goto L_0x016c
            X.05G r7 = r0.A0Z     // Catch:{ all -> 0x0699 }
            java.util.LinkedHashMap r6 = X.C66583MXo.A0n(r7)     // Catch:{ all -> 0x0699 }
            X.4zc r1 = A00(r9, r7)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0140
            java.util.List r1 = r1.A05     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0140
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x0699 }
            goto L_0x0141
        L_0x0140:
            r4 = r13
        L_0x0141:
            if (r4 == 0) goto L_0x01d4
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0699 }
        L_0x0147:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0168
            java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r10, r3)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0147
        L_0x0157:
            X.4zZ r10 = (X.C279864zZ) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x01d4
            int r8 = r4.indexOf(r10)     // Catch:{ all -> 0x0699 }
            r11 = r0
            r12 = r9
            r13 = r14
            r14 = r4
            r15 = r6
            com.instagram.direct.inbox.notes.NotesRepository.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0699 }
            goto L_0x016a
        L_0x0168:
            r10 = r13
            goto L_0x0157
        L_0x016a:
            r13 = r10
            goto L_0x01d4
        L_0x016c:
            X.05G r9 = r0.A0X     // Catch:{ all -> 0x0699 }
            java.util.ArrayList r7 = X.C66583MXo.A0k(r9)     // Catch:{ all -> 0x0699 }
            java.util.Iterator r2 = X.C66583MXo.A0l(r9)     // Catch:{ all -> 0x0699 }
        L_0x0176:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0191
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r6, r3)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0176
        L_0x0186:
            X.4zZ r6 = (X.C279864zZ) r6     // Catch:{ all -> 0x0699 }
            if (r6 == 0) goto L_0x01dd
            int r4 = r7.indexOf(r6)     // Catch:{ all -> 0x0699 }
            if (r4 >= r8) goto L_0x0194
            goto L_0x0193
        L_0x0191:
            r6 = r13
            goto L_0x0186
        L_0x0193:
            r4 = 0
        L_0x0194:
            r8 = r4
            X.17i r2 = r0.A0G     // Catch:{ all -> 0x0699 }
            com.instagram.common.session.UserSession r12 = r0.A0B     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r12.A06     // Catch:{ all -> 0x0699 }
            com.instagram.user.model.User r11 = r2.A02(r1)     // Catch:{ all -> 0x0699 }
            if (r11 == 0) goto L_0x01d2
            X.5y4 r10 = r6.A07     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x01d2
            X.Cwu r3 = new X.Cwu     // Catch:{ all -> 0x0699 }
            r3.<init>(r6)     // Catch:{ all -> 0x0699 }
            X.4sa r2 = r10.A00()     // Catch:{ all -> 0x0699 }
            com.instagram.api.schemas.NoteEmojiReactionInfo r1 = new com.instagram.api.schemas.NoteEmojiReactionInfo     // Catch:{ all -> 0x0699 }
            r1.<init>(r11, r13, r14)     // Catch:{ all -> 0x0699 }
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)     // Catch:{ all -> 0x0699 }
            X.5y5 r1 = X.C44237Cay.A00(r10, r2, r1)     // Catch:{ all -> 0x0699 }
            r3.A07 = r1     // Catch:{ all -> 0x0699 }
            X.4zZ r1 = r3.A00()     // Catch:{ all -> 0x0699 }
            X.4zZ r3 = X.AnonymousClass69P.A02(r1, r12)     // Catch:{ all -> 0x0699 }
            java.util.HashMap r2 = r0.A0I     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r6.A0K     // Catch:{ all -> 0x0699 }
            A01(r1, r7, r2)     // Catch:{ all -> 0x0699 }
            r2.put(r1, r3)     // Catch:{ all -> 0x0699 }
            r7.add(r4, r3)     // Catch:{ all -> 0x0699 }
        L_0x01d2:
            r13 = r6
            goto L_0x01dd
        L_0x01d4:
            r7.Epw(r6)     // Catch:{ all -> 0x0699 }
            X.05G r9 = r0.A0X     // Catch:{ all -> 0x0699 }
            java.util.ArrayList r7 = X.C66583MXo.A0k(r9)     // Catch:{ all -> 0x0699 }
        L_0x01dd:
            r9.Epw(r7)     // Catch:{ all -> 0x0699 }
            X.0eP r1 = X.AnonymousClass7TF.A0x(r13, r8)     // Catch:{ all -> 0x0699 }
            monitor-exit(r0)
            java.lang.Object r0 = r1.A00
            X.4zZ r0 = (X.C279864zZ) r0
            r5.A01 = r0
            int r0 = X.C51969G9p.A0A(r1)
            r5.A00 = r0
            X.4zZ r0 = r5.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x01fc:
            boolean r1 = r2 instanceof X.NWO
            if (r1 == 0) goto L_0x02d0
            r4 = r2
            X.NWO r4 = (X.NWO) r4
            com.instagram.direct.inbox.notes.NotesRepository r12 = r4.A06
            long r1 = r4.A02
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r13 = r4.A04
            r12.A0N(r3, r13)
            java.lang.String r14 = r4.A03
            monitor-enter(r0)
            r11 = 0
            if (r13 == 0) goto L_0x0240
            X.05G r7 = r12.A0Z     // Catch:{ all -> 0x0699 }
            java.util.LinkedHashMap r6 = X.C66583MXo.A0n(r7)     // Catch:{ all -> 0x0699 }
            X.4zc r1 = A00(r13, r7)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x02be
            java.util.List r1 = r1.A05     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x02be
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x0699 }
            java.util.Iterator r5 = r15.iterator()     // Catch:{ all -> 0x0699 }
        L_0x022e:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x02ad
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r2, r3)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x022e
            r11 = r2
            goto L_0x02ad
        L_0x0240:
            X.05G r6 = r12.A0X     // Catch:{ all -> 0x0699 }
            java.util.ArrayList r5 = X.C66583MXo.A0k(r6)     // Catch:{ all -> 0x0699 }
            java.util.Iterator r2 = X.C66583MXo.A0l(r6)     // Catch:{ all -> 0x0699 }
        L_0x024a:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0268
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r7, r3)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x024a
        L_0x025a:
            X.4zZ r7 = (X.C279864zZ) r7     // Catch:{ all -> 0x0699 }
            if (r7 == 0) goto L_0x02c7
            r4.A01 = r7     // Catch:{ all -> 0x0699 }
            int r2 = r5.indexOf(r7)     // Catch:{ all -> 0x0699 }
            r1 = 0
            if (r2 >= r1) goto L_0x026b
            goto L_0x026a
        L_0x0268:
            r7 = r11
            goto L_0x025a
        L_0x026a:
            r2 = 0
        L_0x026b:
            r4.A00 = r2     // Catch:{ all -> 0x0699 }
            X.17i r2 = r12.A0G     // Catch:{ all -> 0x0699 }
            com.instagram.common.session.UserSession r9 = r12.A0B     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r9.A06     // Catch:{ all -> 0x0699 }
            com.instagram.user.model.User r10 = r2.A02(r1)     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x02c7
            X.5y4 r8 = r7.A07     // Catch:{ all -> 0x0699 }
            if (r8 == 0) goto L_0x02c7
            X.Cwu r3 = new X.Cwu     // Catch:{ all -> 0x0699 }
            r3.<init>(r7)     // Catch:{ all -> 0x0699 }
            X.4sa r2 = r8.A00()     // Catch:{ all -> 0x0699 }
            com.instagram.api.schemas.NoteEmojiReactionInfo r1 = new com.instagram.api.schemas.NoteEmojiReactionInfo     // Catch:{ all -> 0x0699 }
            r1.<init>(r10, r11, r14)     // Catch:{ all -> 0x0699 }
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)     // Catch:{ all -> 0x0699 }
            X.5y5 r1 = X.C44237Cay.A00(r8, r2, r1)     // Catch:{ all -> 0x0699 }
            r3.A07 = r1     // Catch:{ all -> 0x0699 }
            X.4zZ r1 = r3.A00()     // Catch:{ all -> 0x0699 }
            X.4zZ r3 = X.AnonymousClass69P.A02(r1, r9)     // Catch:{ all -> 0x0699 }
            java.util.HashMap r2 = r12.A0I     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r7.A0K     // Catch:{ all -> 0x0699 }
            A01(r1, r5, r2)     // Catch:{ all -> 0x0699 }
            r2.put(r1, r3)     // Catch:{ all -> 0x0699 }
            int r1 = r4.A00     // Catch:{ all -> 0x0699 }
            r5.add(r1, r3)     // Catch:{ all -> 0x0699 }
            goto L_0x02c7
        L_0x02ad:
            X.4zZ r11 = (X.C279864zZ) r11     // Catch:{ all -> 0x0699 }
            if (r11 == 0) goto L_0x02be
            r4.A01 = r11     // Catch:{ all -> 0x0699 }
            int r1 = r15.indexOf(r11)     // Catch:{ all -> 0x0699 }
            r4.A00 = r1     // Catch:{ all -> 0x0699 }
            r16 = r6
            com.instagram.direct.inbox.notes.NotesRepository.A01(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0699 }
        L_0x02be:
            r7.Epw(r6)     // Catch:{ all -> 0x0699 }
            X.05G r6 = r12.A0X     // Catch:{ all -> 0x0699 }
            java.util.ArrayList r5 = X.C66583MXo.A0k(r6)     // Catch:{ all -> 0x0699 }
        L_0x02c7:
            r6.Epw(r5)     // Catch:{ all -> 0x0699 }
            monitor-exit(r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            return r0
        L_0x02d0:
            boolean r1 = r2 instanceof X.NWM
            if (r1 == 0) goto L_0x0390
            r5 = r2
            X.NWM r5 = (X.NWM) r5
            long r1 = r5.A02
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r12 = r5.A03
            monitor-enter(r0)
            r10 = 0
            if (r12 != 0) goto L_0x034c
            com.instagram.direct.inbox.notes.NotesRepository r8 = r5.A05     // Catch:{ all -> 0x0699 }
            X.05G r4 = r8.A0X     // Catch:{ all -> 0x0699 }
            java.util.ArrayList r15 = X.C66583MXo.A0k(r4)     // Catch:{ all -> 0x0699 }
            java.util.Iterator r3 = X.C66583MXo.A0l(r4)     // Catch:{ all -> 0x0699 }
        L_0x02ef:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0300
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r2, r6)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x02ef
            r10 = r2
        L_0x0300:
            X.4zZ r10 = (X.C279864zZ) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x0387
            r5.A01 = r10     // Catch:{ all -> 0x0699 }
            int r1 = r15.indexOf(r10)     // Catch:{ all -> 0x0699 }
            r9 = 0
            if (r1 >= r9) goto L_0x030e
            r1 = 0
        L_0x030e:
            r5.A00 = r1     // Catch:{ all -> 0x0699 }
            X.17i r2 = r8.A0G     // Catch:{ all -> 0x0699 }
            com.instagram.common.session.UserSession r7 = r8.A0B     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r7.A06     // Catch:{ all -> 0x0699 }
            com.instagram.user.model.User r1 = r2.A02(r1)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0387
            X.5y4 r6 = r10.A07     // Catch:{ all -> 0x0699 }
            if (r6 == 0) goto L_0x0387
            X.Cwu r3 = new X.Cwu     // Catch:{ all -> 0x0699 }
            r3.<init>(r10)     // Catch:{ all -> 0x0699 }
            X.4sa r2 = r6.A00()     // Catch:{ all -> 0x0699 }
            X.0sn r1 = X.0sn.A00     // Catch:{ all -> 0x0699 }
            X.0qQ.A0B(r1, r9)     // Catch:{ all -> 0x0699 }
            X.5y5 r1 = X.C44237Cay.A00(r6, r2, r1)     // Catch:{ all -> 0x0699 }
            r3.A07 = r1     // Catch:{ all -> 0x0699 }
            X.4zZ r1 = r3.A00()     // Catch:{ all -> 0x0699 }
            X.4zZ r3 = X.AnonymousClass69P.A02(r1, r7)     // Catch:{ all -> 0x0699 }
            java.util.HashMap r2 = r8.A0I     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r10.A0K     // Catch:{ all -> 0x0699 }
            A01(r1, r15, r2)     // Catch:{ all -> 0x0699 }
            r2.put(r1, r3)     // Catch:{ all -> 0x0699 }
            int r1 = r5.A00     // Catch:{ all -> 0x0699 }
            r15.add(r1, r3)     // Catch:{ all -> 0x0699 }
            goto L_0x0387
        L_0x034c:
            com.instagram.direct.inbox.notes.NotesRepository r11 = r5.A05     // Catch:{ all -> 0x0699 }
            X.05G r4 = r11.A0Z     // Catch:{ all -> 0x0699 }
            java.util.LinkedHashMap r15 = X.C66583MXo.A0n(r4)     // Catch:{ all -> 0x0699 }
            X.4zc r1 = A00(r12, r4)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0387
            java.util.List r1 = r1.A05     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0387
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x0699 }
            java.util.Iterator r3 = r14.iterator()     // Catch:{ all -> 0x0699 }
        L_0x0366:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0377
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r2, r6)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0366
            r10 = r2
        L_0x0377:
            X.4zZ r10 = (X.C279864zZ) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x0387
            r5.A01 = r10     // Catch:{ all -> 0x0699 }
            int r1 = r14.indexOf(r10)     // Catch:{ all -> 0x0699 }
            r5.A00 = r1     // Catch:{ all -> 0x0699 }
            r13 = 0
            com.instagram.direct.inbox.notes.NotesRepository.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0699 }
        L_0x0387:
            r4.Epw(r15)     // Catch:{ all -> 0x0699 }
            monitor-exit(r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            return r0
        L_0x0390:
            boolean r0 = r2 instanceof com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation
            if (r0 == 0) goto L_0x05ac
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r2 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r2
            r5 = 13
            r6 = r78
            boolean r0 = X.ME7.A02(r5, r6)
            if (r0 == 0) goto L_0x03c1
            r3 = r6
            X.ME7 r3 = (X.ME7) r3
            int r4 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x03c1
            int r4 = r4 - r1
            r3.A00 = r4
        L_0x03ae:
            java.lang.Object r1 = r3.A01
            X.1Hj r8 = X.1Hj.A02
            int r0 = r3.A00
            r15 = 2
            r13 = 1
            if (r0 == 0) goto L_0x03ce
            if (r0 == r13) goto L_0x03c9
            if (r0 == r15) goto L_0x03c9
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03c1:
            r0 = 42
            X.ME7 r3 = new X.ME7
            r3.<init>(r2, r6, r5, r0)
            goto L_0x03ae
        L_0x03c9:
            X.0eS.A00(r1)
            goto L_0x058d
        L_0x03ce:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r9 = r2.A05
            java.lang.String r0 = r9.A06
            r35 = r0
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = r2.A09
            int r11 = r0.A00
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r10 = r0.A00
            java.lang.String r12 = "2"
            com.instagram.direct.inbox.notes.NotesRepository r1 = r2.A06
            if (r11 != r10) goto L_0x04e0
            java.util.HashMap r4 = r1.A0I
            java.lang.Object r0 = r4.get(r12)
        L_0x03eb:
            X.4zZ r0 = (X.C279864zZ) r0
            r2.A00 = r0
            java.lang.String r0 = r2.A0B
            r7 = 0
            if (r0 == 0) goto L_0x04dd
            X.05G r5 = r1.A0Z
            X.4zc r5 = A00(r0, r5)
            r6 = 0
            if (r5 == 0) goto L_0x0421
            java.util.List r5 = r5.A05
            if (r5 == 0) goto L_0x0421
            java.util.Iterator r17 = r5.iterator()
        L_0x0405:
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x041f
            java.lang.Object r16 = r17.next()
            r5 = r16
            X.4zZ r5 = (X.C279864zZ) r5
            java.lang.String r14 = r5.A0K
            com.instagram.common.session.UserSession r5 = r1.A0B
            boolean r5 = X.C51966G9m.A1W(r5, r14)
            if (r5 == 0) goto L_0x0405
            r6 = r16
        L_0x041f:
            X.4zZ r6 = (X.C279864zZ) r6
        L_0x0421:
            r2.A01 = r6
            X.17i r6 = r2.A0A
            r5 = r35
            com.instagram.user.model.User r28 = r6.A02(r5)
            if (r28 == 0) goto L_0x058d
            com.instagram.direct.inbox.notes.models.NoteAudience r5 = r2.A07
            int r5 = r5.A00
            r39 = r5
            com.instagram.api.schemas.NoteBackgroundColor r20 = com.instagram.api.schemas.NoteBackgroundColor.WHITE
            com.instagram.api.schemas.NoteFontStyle r23 = com.instagram.api.schemas.NoteFontStyle.STANDARD
            if (r11 == r10) goto L_0x043b
            java.lang.String r12 = "0"
        L_0x043b:
            X.N3r r6 = r2.A08
            java.util.List r14 = r2.A0E
            X.5y2 r25 = X.AnonymousClass4A2.A01(r9, r6, r0, r14)
            if (r0 == 0) goto L_0x04d9
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.PROMPT_QUESTION
            int r5 = r5.A00
            r18 = r5
        L_0x044b:
            java.lang.String r5 = r2.A0C
            r34 = r5
            X.0sn r36 = X.0sn.A00
            r17 = -1
            java.lang.Integer r30 = X.JTO.A0w(r17)
            r45 = 0
            r41 = -1
            r16 = 0
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r45)
            X.4zZ r5 = new X.4zZ
            r21 = r7
            r22 = r7
            r24 = r7
            r26 = r7
            r27 = r7
            r31 = r7
            r32 = r12
            r33 = r7
            r37 = r7
            r38 = r36
            r40 = r18
            r43 = r41
            r46 = r45
            r47 = r45
            r48 = r45
            r18 = r5
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r46, r47, r48)
            if (r6 == 0) goto L_0x04d5
            X.JV7 r12 = r6.A07
            if (r12 == 0) goto L_0x04d5
            java.lang.String r12 = r12.A02
            if (r12 == 0) goto L_0x04d5
            X.5y2 r53 = X.AnonymousClass4A2.A01(r9, r6, r0, r14)
            java.lang.Integer r58 = X.JTO.A0w(r17)
            java.lang.String r60 = "0"
            X.4zZ r7 = new X.4zZ
            r46 = r7
            r47 = r16
            r48 = r20
            r49 = r16
            r50 = r16
            r51 = r23
            r52 = r16
            r54 = r16
            r55 = r16
            r56 = r28
            r57 = r29
            r59 = r16
            r61 = r16
            r62 = r34
            r63 = r35
            r64 = r36
            r65 = r16
            r66 = r36
            r67 = r39
            r68 = r11
            r69 = r41
            r71 = r41
            r73 = r45
            r74 = r45
            r75 = r45
            r76 = r45
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r71, r73, r74, r75, r76)
        L_0x04d5:
            if (r0 == 0) goto L_0x0584
            monitor-enter(r1)
            goto L_0x04ee
        L_0x04d9:
            r18 = r11
            goto L_0x044b
        L_0x04dd:
            r6 = r7
            goto L_0x0421
        L_0x04e0:
            java.lang.String r0 = r2.A0B
            if (r0 != 0) goto L_0x04e6
            r0 = r35
        L_0x04e6:
            java.util.HashMap r4 = r1.A0I
            java.lang.Object r0 = r4.get(r0)
            goto L_0x03eb
        L_0x04ee:
            X.05G r11 = r1.A0X     // Catch:{ all -> 0x0581 }
            java.util.ArrayList r10 = X.C66583MXo.A0k(r11)     // Catch:{ all -> 0x0581 }
            X.05G r9 = r1.A0Z     // Catch:{ all -> 0x0581 }
            java.util.LinkedHashMap r6 = X.C66583MXo.A0n(r9)     // Catch:{ all -> 0x0581 }
            X.4zc r2 = A00(r0, r9)     // Catch:{ all -> 0x0581 }
            if (r2 == 0) goto L_0x0509
            java.util.List r2 = r2.A05     // Catch:{ all -> 0x0581 }
            if (r2 == 0) goto L_0x0509
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1D(r2)     // Catch:{ all -> 0x0581 }
            goto L_0x050a
        L_0x0509:
            r12 = 0
        L_0x050a:
            if (r7 == 0) goto L_0x057c
            java.lang.String r2 = "1_"
            boolean r2 = X.C66580MXl.A1a(r2, r13, r0)     // Catch:{ all -> 0x057a }
            if (r2 == 0) goto L_0x0534
            A01(r0, r10, r4)     // Catch:{ all -> 0x057a }
            monitor-enter(r1)     // Catch:{ all -> 0x057a }
            r4.put(r0, r5)     // Catch:{ all -> 0x0531 }
            com.instagram.common.session.UserSession r2 = r1.A0B     // Catch:{ all -> 0x0531 }
            java.lang.String r2 = r2.A06     // Catch:{ all -> 0x0531 }
            boolean r4 = r4.containsKey(r2)     // Catch:{ all -> 0x0531 }
            r2 = 0
            if (r4 == 0) goto L_0x0527
            r2 = 1
        L_0x0527:
            r10.add(r2, r5)     // Catch:{ all -> 0x0531 }
            r2 = r16
            com.instagram.direct.inbox.notes.NotesRepository.A02(r7, r1, r0, r2, r6)     // Catch:{ all -> 0x0531 }
            monitor-exit(r1)     // Catch:{ all -> 0x057a }
            goto L_0x0570
        L_0x0531:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x057a }
            throw r0     // Catch:{ all -> 0x057a }
        L_0x0534:
            if (r12 == 0) goto L_0x0560
            boolean r2 = r12 instanceof java.util.Collection     // Catch:{ all -> 0x057a }
            if (r2 == 0) goto L_0x0541
            boolean r2 = r12.isEmpty()     // Catch:{ all -> 0x057a }
            if (r2 == 0) goto L_0x0541
            goto L_0x0560
        L_0x0541:
            java.util.Iterator r15 = r12.iterator()     // Catch:{ all -> 0x057a }
        L_0x0545:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x057a }
            if (r2 == 0) goto L_0x0560
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x057a }
            X.4zZ r14 = (X.C279864zZ) r14     // Catch:{ all -> 0x057a }
            com.instagram.common.session.UserSession r2 = r1.A0B     // Catch:{ all -> 0x057a }
            java.lang.String r4 = r2.A06     // Catch:{ all -> 0x057a }
            java.lang.String r2 = r14.A0K     // Catch:{ all -> 0x057a }
            boolean r2 = X.0qQ.A0K(r4, r2)     // Catch:{ all -> 0x057a }
            if (r2 == 0) goto L_0x0545
            r18 = 1
            goto L_0x0562
        L_0x0560:
            r18 = 0
        L_0x0562:
            r16 = r10
            r17 = r13
            r19 = r45
            r14 = r1
            r15 = r0
            r14.A0Q(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x057a }
            com.instagram.direct.inbox.notes.NotesRepository.A02(r7, r1, r0, r12, r6)     // Catch:{ all -> 0x057a }
        L_0x0570:
            r9.Epw(r6)     // Catch:{ all -> 0x0581 }
            r11.Epw(r10)     // Catch:{ all -> 0x0581 }
            monitor-exit(r1)
            r3.A00 = r13
            goto L_0x059f
        L_0x057a:
            r0 = move-exception
            goto L_0x0580
        L_0x057c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0581 }
        L_0x0580:
            throw r0     // Catch:{ all -> 0x0581 }
        L_0x0581:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0584:
            X.Gmu r2 = r2.A04
            if (r2 == 0) goto L_0x0592
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0F(r2, r5, r0)
        L_0x058d:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            return r8
        L_0x0592:
            if (r11 != r10) goto L_0x059a
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0H(r5, r0)
            goto L_0x058d
        L_0x059a:
            r1.A0G(r5)
            r3.A00 = r15
        L_0x059f:
            X.0V2 r0 = r1.A0R
            java.lang.Object r0 = r0.emit(r5, r3)
            if (r0 == r8) goto L_0x05a9
            X.0gF r0 = X.C60340gF.A00
        L_0x05a9:
            if (r0 != r8) goto L_0x058d
            return r8
        L_0x05ac:
            r4 = r2
            X.NWL r4 = (X.NWL) r4
            com.instagram.direct.inbox.notes.NotesRepository r0 = r4.A03
            long r1 = r4.A02
            java.lang.String r7 = java.lang.String.valueOf(r1)
            java.lang.String r10 = r4.A04
            monitor-enter(r0)
            r6 = 0
            r5 = 0
            if (r10 != 0) goto L_0x05ea
            X.05G r10 = r0.A0X     // Catch:{ all -> 0x0699 }
            java.util.ArrayList r9 = X.C66583MXo.A0k(r10)     // Catch:{ all -> 0x0699 }
            java.util.Iterator r2 = X.C66583MXo.A0l(r10)     // Catch:{ all -> 0x0699 }
        L_0x05c8:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x05e3
            java.lang.Object r14 = r2.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r14, r7)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x05c8
        L_0x05d8:
            X.4zZ r14 = (X.C279864zZ) r14     // Catch:{ all -> 0x0699 }
            if (r14 == 0) goto L_0x05e7
            int r8 = r9.indexOf(r14)     // Catch:{ all -> 0x0699 }
            if (r8 >= r6) goto L_0x0633
            goto L_0x05e5
        L_0x05e3:
            r14 = r5
            goto L_0x05d8
        L_0x05e5:
            r8 = 0
            goto L_0x0633
        L_0x05e7:
            r14 = r5
            goto L_0x066e
        L_0x05ea:
            X.05G r9 = r0.A0Z     // Catch:{ all -> 0x0699 }
            java.util.LinkedHashMap r8 = X.C66583MXo.A0n(r9)     // Catch:{ all -> 0x0699 }
            X.4zc r1 = A00(r10, r9)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x05ff
            java.util.List r1 = r1.A05     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x05ff
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x0699 }
            goto L_0x0600
        L_0x05ff:
            r3 = r5
        L_0x0600:
            if (r3 == 0) goto L_0x0603
            goto L_0x0605
        L_0x0603:
            r14 = r5
            goto L_0x062d
        L_0x0605:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0699 }
        L_0x0609:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0631
            java.lang.Object r14 = r2.next()     // Catch:{ all -> 0x0699 }
            boolean r1 = X.C66583MXo.A1a(r14, r7)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x0609
        L_0x0619:
            X.4zZ r14 = (X.C279864zZ) r14     // Catch:{ all -> 0x0699 }
            if (r14 == 0) goto L_0x0603
            int r6 = r3.indexOf(r14)     // Catch:{ all -> 0x0699 }
            r17 = 0
            r15 = r0
            r16 = r10
            r18 = r3
            r19 = r8
            com.instagram.direct.inbox.notes.NotesRepository.A01(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0699 }
        L_0x062d:
            r9.Epw(r8)     // Catch:{ all -> 0x0699 }
            goto L_0x0671
        L_0x0631:
            r14 = r5
            goto L_0x0619
        L_0x0633:
            r6 = r8
            X.17i r2 = r0.A0G     // Catch:{ all -> 0x0699 }
            com.instagram.common.session.UserSession r12 = r0.A0B     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r12.A06     // Catch:{ all -> 0x0699 }
            com.instagram.user.model.User r1 = r2.A02(r1)     // Catch:{ all -> 0x0699 }
            if (r1 == 0) goto L_0x066e
            X.5y4 r13 = r14.A07     // Catch:{ all -> 0x0699 }
            if (r13 == 0) goto L_0x066e
            X.Cwu r11 = new X.Cwu     // Catch:{ all -> 0x0699 }
            r11.<init>(r14)     // Catch:{ all -> 0x0699 }
            X.4sa r3 = r13.A00()     // Catch:{ all -> 0x0699 }
            X.0sn r2 = X.0sn.A00     // Catch:{ all -> 0x0699 }
            r1 = 0
            X.0qQ.A0B(r2, r1)     // Catch:{ all -> 0x0699 }
            X.5y5 r1 = X.C44237Cay.A00(r13, r3, r2)     // Catch:{ all -> 0x0699 }
            r11.A07 = r1     // Catch:{ all -> 0x0699 }
            X.4zZ r1 = r11.A00()     // Catch:{ all -> 0x0699 }
            X.4zZ r3 = X.AnonymousClass69P.A02(r1, r12)     // Catch:{ all -> 0x0699 }
            java.util.HashMap r2 = r0.A0I     // Catch:{ all -> 0x0699 }
            java.lang.String r1 = r14.A0K     // Catch:{ all -> 0x0699 }
            A01(r1, r9, r2)     // Catch:{ all -> 0x0699 }
            r2.put(r1, r3)     // Catch:{ all -> 0x0699 }
            r9.add(r8, r3)     // Catch:{ all -> 0x0699 }
        L_0x066e:
            r10.Epw(r9)     // Catch:{ all -> 0x0699 }
        L_0x0671:
            X.4Cq r3 = r0.A01     // Catch:{ all -> 0x0699 }
            r2 = 31
            X.MFW r1 = new X.MFW     // Catch:{ all -> 0x0699 }
            r1.<init>(r0, r7, r5, r2)     // Catch:{ all -> 0x0699 }
            X.AnonymousClass7TE.A1Z(r1, r3)     // Catch:{ all -> 0x0699 }
            X.0eP r1 = X.AnonymousClass7TF.A0x(r14, r6)     // Catch:{ all -> 0x0699 }
            monitor-exit(r0)
            java.lang.Object r0 = r1.A00
            X.4zZ r0 = (X.C279864zZ) r0
            r4.A01 = r0
            int r0 = X.C51969G9p.A0A(r1)
            r4.A00 = r0
            X.4zZ r0 = r4.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0699:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A03(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation
            if (r0 == 0) goto L_0x0086
            r10 = r13
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r10 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r10
            r3 = 14
            boolean r0 = X.ME7.A02(r3, r14)
            if (r0 == 0) goto L_0x0079
            r4 = r14
            X.ME7 r4 = (X.ME7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001d:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r5) goto L_0x0081
            X.0eS.A00(r1)
        L_0x002b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r6 = X.00k.A0X(r1)
            return r6
        L_0x0032:
            X.0eS.A00(r1)
            java.util.List r7 = r10.A0E
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0040
            X.0sn r6 = X.0sn.A00
            return r6
        L_0x0040:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.1ud r2 = X.1ua.A0G
            android.content.Context r1 = r10.A03
            com.instagram.common.session.UserSession r0 = r10.A05
            X.1ua r8 = r2.A01(r1, r0)
            java.util.Iterator r2 = r7.iterator()
        L_0x0052:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r9 = r2.next()
            X.4Cq r1 = r10.A0F
            r11 = 0
            r12 = 26
            X.MHI r7 = new X.MHI
            r7.<init>(r8, r9, r10, r11, r12)
            X.19B r0 = X.19B.A00
            X.2Q8 r0 = X.1Eo.A02(r0, r7, r1)
            r3.add(r0)
            goto L_0x0052
        L_0x0070:
            r4.A00 = r5
            java.lang.Object r1 = X.AnonymousClass42T.A00(r3, r4)
            if (r1 != r6) goto L_0x002b
            return r6
        L_0x0079:
            r0 = 42
            X.ME7 r4 = new X.ME7
            r4.<init>(r10, r14, r3, r0)
            goto L_0x001d
        L_0x0081:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0086:
            boolean r0 = r13 instanceof X.NWP
            if (r0 != 0) goto L_0x008c
            boolean r0 = r13 instanceof X.NWN
        L_0x008c:
            X.0sn r0 = X.0sn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A04(X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01df  */
    public final java.lang.Object A05(X.AnonymousClass4D7 r31) {
        /*
            r30 = this;
            r3 = 21
            r5 = r31
            boolean r0 = X.C66145MDx.A02(r3, r5)
            r9 = r30
            if (r0 == 0) goto L_0x0036
            r4 = r5
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r8 = r4.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 5
            r6 = 4
            r3 = 3
            r2 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r14) goto L_0x003c
            if (r0 == r2) goto L_0x006d
            if (r0 == r3) goto L_0x0083
            if (r0 == r6) goto L_0x031a
            if (r0 == r5) goto L_0x031a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            X.MDx r4 = new X.MDx
            r4.<init>(r9, r5, r3)
            goto L_0x001a
        L_0x003c:
            java.lang.Object r1 = r4.A02
            com.instagram.direct.inbox.notes.OptimisticNetworkOperation r1 = (com.instagram.direct.inbox.notes.OptimisticNetworkOperation) r1
            java.lang.Object r12 = r4.A01
            com.instagram.direct.inbox.notes.OptimisticNetworkOperation r12 = (com.instagram.direct.inbox.notes.OptimisticNetworkOperation) r12
            X.0eS.A00(r8)
            goto L_0x0059
        L_0x0048:
            X.0eS.A00(r8)
            r4.A01 = r9
            r4.A02 = r9
            r4.A00 = r14
            java.lang.Object r8 = r9.A03(r4)
            if (r8 == r7) goto L_0x0082
            r1 = r9
            r12 = r9
        L_0x0059:
            boolean r0 = X.AnonymousClass7TE.A1a(r8)
            r1.A00 = r0
            r4.A01 = r12
            r0 = 0
            r4.A02 = r0
            r4.A00 = r2
            java.lang.Object r8 = r12.A04(r4)
            if (r8 != r7) goto L_0x0074
            return r7
        L_0x006d:
            java.lang.Object r12 = r4.A01
            com.instagram.direct.inbox.notes.OptimisticNetworkOperation r12 = (com.instagram.direct.inbox.notes.OptimisticNetworkOperation) r12
            X.0eS.A00(r8)
        L_0x0074:
            java.util.List r8 = (java.util.List) r8
            com.instagram.direct.inbox.notes.NotesApi r0 = r12.A01
            r4.A01 = r12
            r4.A00 = r3
            java.lang.Object r8 = r12.A02(r0, r8, r4)
            if (r8 != r7) goto L_0x008a
        L_0x0082:
            return r7
        L_0x0083:
            java.lang.Object r12 = r4.A01
            com.instagram.direct.inbox.notes.OptimisticNetworkOperation r12 = (com.instagram.direct.inbox.notes.OptimisticNetworkOperation) r12
            X.0eS.A00(r8)
        L_0x008a:
            r13 = r8
            X.3Ii r13 = (X.C239803Ii) r13
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x030a
            r0 = r13
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r1 = r0.A00
            X.1XR r1 = (X.1XR) r1
            r4.A01 = r13
            r4.A00 = r6
            boolean r0 = r12 instanceof com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation
            if (r0 == 0) goto L_0x02f8
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r12 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r12
            X.3JC r1 = (X.AnonymousClass3JC) r1
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r1.A01
            X.C7f r0 = (X.C43735C7f) r0
            if (r0 == 0) goto L_0x01e7
            X.BiW r4 = r0.A0E()
            if (r4 == 0) goto L_0x01e7
            java.lang.Class<X.9ed> r2 = X.C382859ed.class
            r3 = 0
            java.lang.String r1 = "inbox_tray_item"
            r0 = 1825783268(0x6cd33de4, float:2.043005E27)
            X.3lr r2 = r4.getOptionalTreeField(r3, r1, r2, r0)
            if (r2 == 0) goto L_0x01e7
            java.lang.Class<X.69I> r1 = X.AnonymousClass69I.class
            r0 = -1665516441(0xffffffff9cba3c67, float:-1.2324061E-21)
            X.3lr r4 = r2.reinterpretRequired(r3, r1, r0)
            X.69I r4 = (X.AnonymousClass69I) r4
            if (r4 == 0) goto L_0x01e8
            X.69K r0 = r4.A0F()
            if (r0 == 0) goto L_0x01e8
            X.69O r5 = r0.A0E()
        L_0x00d9:
            X.69J r3 = r4.A0E()
            if (r3 == 0) goto L_0x01ed
            java.lang.Class<X.69N> r2 = X.AnonymousClass69N.class
            r1 = 0
            r0 = -1739341165(0xffffffff9853c293, float:-2.7369346E-24)
            X.3lr r2 = r3.reinterpretRequired(r1, r2, r0)
            X.69N r2 = (X.AnonymousClass69N) r2
            if (r2 == 0) goto L_0x01ed
            X.17i r1 = r12.A0A
            com.instagram.common.session.UserSession r0 = r12.A05
            X.4zZ r11 = X.AnonymousClass69P.A03(r0, r5, r2, r1)
        L_0x00f5:
            X.69L r0 = r4.A0G()
            if (r0 == 0) goto L_0x01e4
            X.Biy r3 = r0.A0E()
            if (r3 == 0) goto L_0x01e4
            java.lang.Class<X.Bix> r2 = X.C42823Bix.class
            java.lang.String r1 = "prompt_responses"
            r0 = 1661840459(0x630dac4b, float:2.613406E21)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            if (r0 == 0) goto L_0x01e4
            java.util.Iterator r6 = r0.iterator()
        L_0x0112:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r3 = r6.next()
            r2 = r3
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.69N> r1 = X.AnonymousClass69N.class
            r0 = -1739341165(0xffffffff9853c293, float:-2.7369346E-24)
            X.3lr r2 = r2.A01(r1, r0)
            r1 = 11
            java.lang.String r0 = "author_id"
            java.lang.String r1 = r2.getRequiredStringField(r1, r0)
            com.instagram.common.session.UserSession r0 = r12.A05
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 == 0) goto L_0x0112
        L_0x0138:
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x01e4
            java.lang.Class<X.69N> r1 = X.AnonymousClass69N.class
            r0 = -1739341165(0xffffffff9853c293, float:-2.7369346E-24)
            X.3lr r2 = r3.A01(r1, r0)
            X.69N r2 = (X.AnonymousClass69N) r2
            if (r2 == 0) goto L_0x01e4
            X.17i r1 = r12.A0A
            com.instagram.common.session.UserSession r0 = r12.A05
            X.4zZ r3 = X.AnonymousClass69P.A03(r0, r5, r2, r1)
        L_0x0151:
            X.69L r0 = r4.A0G()
            if (r0 == 0) goto L_0x01df
            X.Biy r2 = r0.A0E()
            if (r2 == 0) goto L_0x01df
            r1 = 0
            java.lang.String r0 = "strong_id__"
            java.lang.String r10 = r2.getRequiredStringField(r1, r0)
        L_0x0164:
            if (r11 == 0) goto L_0x0171
            X.Gmu r2 = r12.A04
            if (r2 == 0) goto L_0x01c9
            com.instagram.direct.inbox.notes.NotesRepository r1 = r12.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A0F(r2, r11, r0)
        L_0x0171:
            if (r3 == 0) goto L_0x02bd
            if (r10 == 0) goto L_0x02bd
            X.Cwu r9 = new X.Cwu
            r9.<init>(r3)
            X.5y2 r0 = r3.A0A
            if (r0 == 0) goto L_0x01f2
            X.D9e r6 = X.AnonymousClass60G.A00
            X.69L r1 = r4.A0G()
            if (r1 == 0) goto L_0x01c6
            X.Biy r2 = r1.A0E()
            if (r2 == 0) goto L_0x01c6
            java.lang.String r1 = "prompt_text"
            java.lang.String r1 = r2.A08(r1)
            if (r1 == 0) goto L_0x01c6
        L_0x0194:
            X.Cwq r4 = r6.A00(r10, r1)
            if (r5 == 0) goto L_0x01f4
            com.google.common.collect.ImmutableList r1 = r5.A0E()
            if (r1 == 0) goto L_0x01f4
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r7 = r1.iterator()
        L_0x01a8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r1 = r7.next()
            X.69Q r1 = (X.AnonymousClass69Q) r1
            X.69R r2 = r1.A0E()
            com.instagram.common.session.UserSession r1 = r12.A05
            X.1E5 r1 = X.1E4.A00(r1)
            com.instagram.user.model.User r1 = r2.A0E(r1)
            r6.add(r1)
            goto L_0x01a8
        L_0x01c6:
            java.lang.String r1 = ""
            goto L_0x0194
        L_0x01c9:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = r12.A09
            int r2 = r0.A00
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r0 = r0.A00
            com.instagram.direct.inbox.notes.NotesRepository r1 = r12.A06
            if (r2 != r0) goto L_0x01db
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A0H(r11, r0)
            goto L_0x0171
        L_0x01db:
            r1.A0G(r11)
            goto L_0x0171
        L_0x01df:
            r10 = 0
            goto L_0x0164
        L_0x01e1:
            r3 = 0
            goto L_0x0138
        L_0x01e4:
            r3 = 0
            goto L_0x0151
        L_0x01e7:
            r4 = 0
        L_0x01e8:
            r5 = 0
            if (r4 == 0) goto L_0x01ed
            goto L_0x00d9
        L_0x01ed:
            r11 = 0
            if (r4 == 0) goto L_0x02bd
            goto L_0x00f5
        L_0x01f2:
            r0 = 0
            goto L_0x0250
        L_0x01f4:
            r6 = 0
        L_0x01f5:
            r4.A04 = r6
            if (r5 == 0) goto L_0x025a
            r2 = 0
            r1 = 3093(0xc15, float:4.334E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            int r1 = r5.getRequiredIntField(r2, r1)
            java.lang.Integer r1 = X.JTO.A0w(r1)
        L_0x0208:
            r4.A01 = r1
            boolean r1 = r3.A0R
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.A00 = r1
            X.60F r27 = r4.A00()
            com.instagram.api.schemas.AudioNoteResponseInfo r1 = r0.A00
            r29 = r1
            com.instagram.api.schemas.AvatarNoteResponseInfo r1 = r0.A01
            r17 = r1
            com.instagram.api.schemas.GIFNoteResponseInfo r1 = r0.A02
            r16 = r1
            X.605 r15 = r0.A03
            com.instagram.api.schemas.ListeningNowResponseInfo r8 = r0.A04
            com.instagram.api.schemas.LiveNoteResponseInfo r7 = r0.A05
            com.instagram.api.schemas.LocationNoteResponseInfo r6 = r0.A06
            com.instagram.api.schemas.MusicNoteResponseInfo r5 = r0.A07
            com.instagram.api.schemas.NoteChatResponseInfo r4 = r0.A08
            X.60C r3 = r0.A09
            X.60E r2 = r0.A0A
            X.60H r1 = r0.A0C
            X.5y2 r0 = new X.5y2
            r24 = r4
            r25 = r3
            r26 = r2
            r28 = r1
            r21 = r7
            r22 = r6
            r23 = r5
            r18 = r16
            r19 = r15
            r20 = r8
            r15 = r0
            r16 = r29
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0250:
            r9.A0A = r0
            X.4zZ r7 = r9.A01()
            com.instagram.direct.inbox.notes.NotesRepository r4 = r12.A06
            monitor-enter(r4)
            goto L_0x025c
        L_0x025a:
            r1 = 0
            goto L_0x0208
        L_0x025c:
            X.05G r6 = r4.A0X     // Catch:{ all -> 0x02b9 }
            java.util.ArrayList r5 = X.C66583MXo.A0k(r6)     // Catch:{ all -> 0x02b9 }
            X.05G r3 = r4.A0Z     // Catch:{ all -> 0x02b9 }
            java.util.LinkedHashMap r2 = X.C66583MXo.A0n(r3)     // Catch:{ all -> 0x02b9 }
            X.4zc r0 = A00(r10, r3)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x0277
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x0277
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x02b9 }
            goto L_0x0278
        L_0x0277:
            r1 = 0
        L_0x0278:
            java.lang.String r0 = "1_"
            boolean r0 = X.C66580MXl.A1a(r0, r14, r10)     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02ad
            java.util.HashMap r1 = r4.A0I     // Catch:{ all -> 0x02b7 }
            A01(r10, r5, r1)     // Catch:{ all -> 0x02b7 }
            r2.remove(r10)     // Catch:{ all -> 0x02b7 }
            X.5y2 r0 = r7.A0A     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02b0
            X.60F r0 = r0.A0B     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02b0
            java.lang.String r8 = r0.A02     // Catch:{ all -> 0x02b7 }
            if (r8 == 0) goto L_0x02b0
            r1.put(r8, r7)     // Catch:{ all -> 0x02ab }
            com.instagram.common.session.UserSession r0 = r4.A0B     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x02ab }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x02ab }
            r0 = 0
            if (r1 == 0) goto L_0x02a3
            r0 = 1
        L_0x02a3:
            r5.add(r0, r7)     // Catch:{ all -> 0x02ab }
            r0 = 0
            com.instagram.direct.inbox.notes.NotesRepository.A02(r7, r4, r8, r0, r2)     // Catch:{ all -> 0x02ab }
            goto L_0x02b0
        L_0x02ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02b7 }
        L_0x02ad:
            com.instagram.direct.inbox.notes.NotesRepository.A02(r7, r4, r10, r1, r2)     // Catch:{ all -> 0x02b7 }
        L_0x02b0:
            r3.Epw(r2)     // Catch:{ all -> 0x02b9 }
            r6.Epw(r5)     // Catch:{ all -> 0x02b9 }
            goto L_0x02bc
        L_0x02b7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02b9 }
        L_0x02b9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x02bc:
            monitor-exit(r4)
        L_0x02bd:
            java.util.List r4 = r12.A0D
            java.util.Iterator r3 = r4.iterator()
        L_0x02c3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02db
            java.lang.Object r2 = r3.next()
            X.1wn r2 = (X.1wn) r2
            com.instagram.common.session.UserSession r0 = r12.A05
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.Lff> r0 = X.C64653Lff.class
            r1.A02(r2, r0)
            goto L_0x02c3
        L_0x02db:
            r4.clear()
            if (r11 == 0) goto L_0x031f
            com.instagram.direct.inbox.notes.NotesRepository r0 = r12.A06
            java.lang.String r2 = r11.A0H
            r0.A0L(r2)
            if (r2 == 0) goto L_0x031f
            com.instagram.common.session.UserSession r0 = r12.A05
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.6uw r0 = new X.6uw
            r0.<init>(r2)
            r1.A00(r0)
            return r13
        L_0x02f8:
            boolean r0 = r12 instanceof X.NWP
            if (r0 == 0) goto L_0x031f
            X.NWP r12 = (X.NWP) r12
            com.instagram.direct.inbox.notes.NotesRepository r2 = r12.A05
            long r0 = r12.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0L(r0)
            return r13
        L_0x030a:
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0320
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x031f
            r4.A01 = r13
            r4.A00 = r5
        L_0x0316:
            r12.A06()
            return r13
        L_0x031a:
            java.lang.Object r13 = r4.A01
            X.0eS.A00(r8)
        L_0x031f:
            return r13
        L_0x0320:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A05(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x014f=Splitter:B:73:0x014f, B:103:0x01cf=Splitter:B:103:0x01cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r18 = this;
            r1 = r18
            boolean r0 = r1 instanceof X.NWO
            if (r0 == 0) goto L_0x0013
            r0 = r1
            X.NWO r0 = (X.NWO) r0
            com.instagram.direct.inbox.notes.NotesRepository r3 = r0.A06
            X.4zZ r8 = r0.A01
            int r7 = r0.A00
            java.lang.String r5 = r0.A04
        L_0x0011:
            monitor-enter(r3)
            goto L_0x005a
        L_0x0013:
            boolean r0 = r1 instanceof X.NWM
            if (r0 == 0) goto L_0x0022
            r0 = r1
            X.NWM r0 = (X.NWM) r0
            com.instagram.direct.inbox.notes.NotesRepository r3 = r0.A05
            X.4zZ r8 = r0.A01
            int r7 = r0.A00
        L_0x0020:
            r5 = 0
            goto L_0x0011
        L_0x0022:
            boolean r0 = r1 instanceof com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation
            if (r0 == 0) goto L_0x0034
            r4 = r1
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r4 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r4
            java.lang.String r9 = r4.A0B
            if (r9 == 0) goto L_0x0157
            com.instagram.direct.inbox.notes.NotesRepository r1 = r4.A06
            X.4zZ r10 = r4.A01
            monitor-enter(r1)
            goto L_0x00dc
        L_0x0034:
            boolean r0 = r1 instanceof X.NWL
            if (r0 == 0) goto L_0x0042
            r0 = r1
            X.NWL r0 = (X.NWL) r0
            com.instagram.direct.inbox.notes.NotesRepository r3 = r0.A03
            X.4zZ r8 = r0.A01
            int r7 = r0.A00
            goto L_0x0020
        L_0x0042:
            boolean r0 = r1 instanceof X.NWP
            if (r0 == 0) goto L_0x004e
            r6 = r1
            X.NWP r6 = (X.NWP) r6
            com.instagram.direct.inbox.notes.NotesRepository r1 = r6.A05
            monitor-enter(r1)
            goto L_0x019e
        L_0x004e:
            r0 = r1
            X.NWN r0 = (X.NWN) r0
            com.instagram.direct.inbox.notes.NotesRepository r3 = r0.A03
            X.4zZ r8 = r0.A01
            int r7 = r0.A00
            java.lang.String r5 = r0.A05
            goto L_0x0011
        L_0x005a:
            X.05G r4 = r3.A0X     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x00d9 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x00d9 }
            java.util.ArrayList r2 = X.00k.A0U(r0)     // Catch:{ all -> 0x00d9 }
            r0 = 0
            if (r5 != 0) goto L_0x0081
            java.util.HashMap r1 = r3.A0I     // Catch:{ all -> 0x00d9 }
            if (r8 == 0) goto L_0x006f
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x00d9 }
        L_0x006f:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x00d9 }
            X.4zZ r0 = (X.C279864zZ) r0     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x007e
            r2.remove(r0)     // Catch:{ all -> 0x00d9 }
        L_0x007e:
            if (r8 == 0) goto L_0x00d4
            goto L_0x00cc
        L_0x0081:
            X.05G r6 = r3.A0Z     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x00d9 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00d9 }
            java.util.LinkedHashMap r1 = X.0Yt.A03(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x00d9 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x00d9 }
            X.4zc r0 = (X.C279894zc) r0     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d4
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d4
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00d9 }
            r12.<init>(r0)     // Catch:{ all -> 0x00d9 }
            if (r8 == 0) goto L_0x00d4
            r12.set(r7, r8)     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x00d9 }
            X.4zc r0 = (X.C279894zc) r0     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r8 = r0.A03     // Catch:{ all -> 0x00d9 }
            java.lang.String r9 = r0.A04     // Catch:{ all -> 0x00d9 }
            com.instagram.user.model.User r7 = r0.A00     // Catch:{ all -> 0x00d9 }
            java.lang.String r10 = r0.A02     // Catch:{ all -> 0x00d9 }
            java.lang.String r11 = r0.A01     // Catch:{ all -> 0x00d9 }
            r0 = 0
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x00d9 }
            r0 = 1
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x00d9 }
            X.4zc r6 = new X.4zc     // Catch:{ all -> 0x00d9 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d9 }
            r1.put(r5, r6)     // Catch:{ all -> 0x00d9 }
            goto L_0x00d4
        L_0x00cc:
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x00d9 }
            r1.put(r0, r8)     // Catch:{ all -> 0x00d9 }
            r2.add(r7, r8)     // Catch:{ all -> 0x00d9 }
        L_0x00d4:
            r4.Epw(r2)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r3)
            return
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00dc:
            X.05G r8 = r1.A0X     // Catch:{ all -> 0x022b }
            java.util.ArrayList r7 = X.C66583MXo.A0k(r8)     // Catch:{ all -> 0x022b }
            X.05G r6 = r1.A0Z     // Catch:{ all -> 0x022b }
            java.util.LinkedHashMap r5 = X.C66583MXo.A0n(r6)     // Catch:{ all -> 0x022b }
            X.4zc r0 = A00(r9, r6)     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x00f9
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x022b }
            if (r0 == 0) goto L_0x00f9
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x022b }
            if (r3 == 0) goto L_0x0105
            goto L_0x00fb
        L_0x00f9:
            r3 = 0
            goto L_0x0105
        L_0x00fb:
            r2 = 43
            X.PmE r0 = new X.PmE     // Catch:{ all -> 0x0227 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0227 }
            X.018.A1A(r3, r0)     // Catch:{ all -> 0x0227 }
        L_0x0105:
            java.lang.String r0 = "1_"
            r11 = 0
            r2 = 1
            boolean r0 = X.C66580MXl.A1a(r0, r2, r9)     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0118
            java.util.HashMap r0 = r1.A0I     // Catch:{ all -> 0x0227 }
            A01(r9, r7, r0)     // Catch:{ all -> 0x0227 }
            r5.remove(r9)     // Catch:{ all -> 0x0227 }
            goto L_0x014f
        L_0x0118:
            if (r3 == 0) goto L_0x0143
            java.lang.Object r0 = r5.get(r9)     // Catch:{ all -> 0x0227 }
            X.4zc r0 = (X.C279894zc) r0     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0143
            if (r10 == 0) goto L_0x0127
            r3.add(r10)     // Catch:{ all -> 0x0227 }
        L_0x0127:
            java.lang.String r13 = r0.A03     // Catch:{ all -> 0x0227 }
            java.lang.String r14 = r0.A04     // Catch:{ all -> 0x0227 }
            com.instagram.user.model.User r12 = r0.A00     // Catch:{ all -> 0x0227 }
            java.lang.String r15 = r0.A02     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0227 }
            X.0qQ.A0B(r13, r11)     // Catch:{ all -> 0x0227 }
            X.0qQ.A0B(r14, r2)     // Catch:{ all -> 0x0227 }
            X.4zc r11 = new X.4zc     // Catch:{ all -> 0x0227 }
            r17 = r3
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0227 }
            r5.put(r9, r11)     // Catch:{ all -> 0x0227 }
        L_0x0143:
            boolean r13 = X.AnonymousClass7TF.A1V(r10)
            r11 = r7
            r12 = r2
            r14 = r2
            r10 = r9
            r9 = r1
            r9.A0Q(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0227 }
        L_0x014f:
            r6.Epw(r5)     // Catch:{ all -> 0x022b }
            r8.Epw(r7)     // Catch:{ all -> 0x022b }
            monitor-exit(r1)
            goto L_0x0164
        L_0x0157:
            X.Gmu r3 = r4.A04
            if (r3 == 0) goto L_0x0182
            com.instagram.direct.inbox.notes.NotesRepository r2 = r4.A06
            X.4zZ r1 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A0F(r3, r1, r0)
        L_0x0164:
            java.util.List r5 = r4.A0D
            java.util.Iterator r3 = r5.iterator()
        L_0x016a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x019a
            java.lang.Object r2 = r3.next()
            X.1wn r2 = (X.1wn) r2
            com.instagram.common.session.UserSession r0 = r4.A05
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.Lff> r0 = X.C64653Lff.class
            r1.A02(r2, r0)
            goto L_0x016a
        L_0x0182:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = r4.A09
            int r3 = r0.A00
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r0 = r0.A00
            com.instagram.direct.inbox.notes.NotesRepository r2 = r4.A06
            X.4zZ r1 = r4.A00
            if (r3 != r0) goto L_0x0196
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A0H(r1, r0)
            goto L_0x0164
        L_0x0196:
            r2.A0G(r1)
            goto L_0x0164
        L_0x019a:
            r5.clear()
            return
        L_0x019e:
            X.4zZ r5 = r6.A01     // Catch:{ all -> 0x022b }
            if (r5 == 0) goto L_0x01cf
            int r4 = r6.A00     // Catch:{ all -> 0x022b }
            int r2 = r5.A01     // Catch:{ all -> 0x0227 }
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT     // Catch:{ all -> 0x0227 }
            int r0 = r0.A00     // Catch:{ all -> 0x0227 }
            if (r2 != r0) goto L_0x01c0
            java.util.HashMap r2 = r1.A0I     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = r5.A0H     // Catch:{ all -> 0x0227 }
            r2.put(r0, r5)     // Catch:{ all -> 0x0227 }
        L_0x01b3:
            X.05G r3 = r1.A0X     // Catch:{ all -> 0x0227 }
            java.util.ArrayList r2 = X.C66583MXo.A0k(r3)     // Catch:{ all -> 0x0227 }
            int r0 = r2.size()     // Catch:{ all -> 0x0227 }
            if (r4 <= r0) goto L_0x01c9
            goto L_0x01c8
        L_0x01c0:
            java.util.HashMap r2 = r1.A0I     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = r5.A0K     // Catch:{ all -> 0x0227 }
            r2.put(r0, r5)     // Catch:{ all -> 0x0227 }
            goto L_0x01b3
        L_0x01c8:
            r4 = r0
        L_0x01c9:
            r2.add(r4, r5)     // Catch:{ all -> 0x0227 }
            r3.Epw(r2)     // Catch:{ all -> 0x0227 }
        L_0x01cf:
            X.4zZ r7 = r6.A02     // Catch:{ all -> 0x022b }
            if (r7 == 0) goto L_0x0229
            java.lang.String r5 = r6.A06     // Catch:{ all -> 0x022b }
            if (r5 == 0) goto L_0x0229
            r4 = 0
            r3 = 1
            X.05G r6 = r1.A0Z     // Catch:{ all -> 0x0227 }
            java.util.LinkedHashMap r2 = X.C66583MXo.A0n(r6)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x0227 }
            X.4zc r0 = (X.C279894zc) r0     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0212
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0212
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x0227 }
            r13.add(r7)     // Catch:{ all -> 0x0227 }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x0227 }
            X.4zc r0 = (X.C279894zc) r0     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0212
            java.lang.String r9 = r0.A03     // Catch:{ all -> 0x0227 }
            java.lang.String r10 = r0.A04     // Catch:{ all -> 0x0227 }
            com.instagram.user.model.User r8 = r0.A00     // Catch:{ all -> 0x0227 }
            java.lang.String r11 = r0.A02     // Catch:{ all -> 0x0227 }
            java.lang.String r12 = r0.A01     // Catch:{ all -> 0x0227 }
            X.0qQ.A0B(r9, r4)     // Catch:{ all -> 0x0227 }
            X.0qQ.A0B(r10, r3)     // Catch:{ all -> 0x0227 }
            X.4zc r7 = new X.4zc     // Catch:{ all -> 0x0227 }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0227 }
            r2.put(r5, r7)     // Catch:{ all -> 0x0227 }
        L_0x0212:
            r6.Epw(r2)     // Catch:{ all -> 0x0227 }
            X.05G r2 = r1.A0X     // Catch:{ all -> 0x0227 }
            java.util.ArrayList r0 = X.C66583MXo.A0k(r2)     // Catch:{ all -> 0x0227 }
            r6 = r0
            r7 = r4
            r8 = r3
            r9 = r3
            r4 = r1
            r4.A0Q(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0227 }
            r2.Epw(r0)     // Catch:{ all -> 0x0227 }
            goto L_0x0229
        L_0x0227:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x022b }
        L_0x0229:
            monitor-exit(r1)
            return
        L_0x022b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A06():void");
    }

    public OptimisticNetworkOperation(NotesApi notesApi) {
        this.A01 = notesApi;
    }

    public static C279894zc A00(Object obj, 05G r2) {
        return (C279894zc) ((Map) r2.getValue()).get(obj);
    }

    public static void A01(Object obj, AbstractCollection abstractCollection, AbstractMap abstractMap) {
        C279864zZ r0 = (C279864zZ) abstractMap.remove(obj);
        if (r0 != null) {
            abstractCollection.remove(r0);
        }
    }
}
