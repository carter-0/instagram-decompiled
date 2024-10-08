package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.OriginalTransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Oa0  reason: case insensitive filesystem */
public final class C71037Oa0 {
    public static final C71037Oa0 A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v35, types: [com.instagram.direct.model.DirectMessageEditHistory, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013e  */
    public final void A05(com.instagram.common.session.UserSession r14, com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r15, X.C254703su r16, java.lang.String r17, long r18) {
        /*
            r13 = this;
            r8 = 0
            r6 = 1
            r7 = 3
            r4 = 2
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r5 = r15.content_
            if (r5 != 0) goto L_0x000a
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r5 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE
        L_0x000a:
            X.0qQ.A07(r5)
            java.lang.Integer r0 = r5.A0M()
            int r3 = r0.intValue()
            r10 = r17
            r0 = r18
            r2 = r16
            if (r3 == r8) goto L_0x0106
            if (r3 == r7) goto L_0x0156
            if (r3 == r6) goto L_0x00bb
            if (r3 == r4) goto L_0x0054
            r0 = 5
            if (r3 != r0) goto L_0x004a
            int r1 = r5.supplementMessageContentCase_
            r0 = 6
            if (r1 != r0) goto L_0x0051
            java.lang.Object r0 = r5.supplementMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions r0 = (com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions) r0
        L_0x002f:
            X.0qQ.A07(r0)
            java.lang.String r3 = r0.mediaId_
            X.0qQ.A07(r3)
            int r0 = r0.interventionType_
            if (r0 == 0) goto L_0x004e
            if (r0 == r6) goto L_0x004b
            if (r0 != r4) goto L_0x004e
            X.Nmu r0 = X.C69512Nmu.NUDE
        L_0x0041:
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r6) goto L_0x013e
            if (r1 == r4) goto L_0x013f
        L_0x004a:
            return
        L_0x004b:
            X.Nmu r0 = X.C69512Nmu.A02
            goto L_0x0041
        L_0x004e:
            X.Nmu r0 = X.C69512Nmu.UNSET
            goto L_0x0041
        L_0x0051:
            com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions r0 = com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions.DEFAULT_INSTANCE
            goto L_0x002f
        L_0x0054:
            int r3 = r5.supplementMessageContentCase_
            if (r3 != r7) goto L_0x007f
            java.lang.Object r7 = r5.supplementMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.EditText r7 = (com.instagram.direct.armadilloexpress.transportpayload.EditText) r7
        L_0x005c:
            X.0qQ.A07(r7)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r8 = r2.C7c()
            long r3 = r18 - r8
            long r8 = r5.toMinutes(r3)
            r4 = 15
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x004a
            java.lang.String r3 = r2.A1u
            boolean r3 = X.0qQ.A0K(r3, r10)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = "ArmadilloExpressProtobufAdapter"
            java.lang.String r0 = "sender id mismatch for edit"
            goto L_0x0243
        L_0x007f:
            com.instagram.direct.armadilloexpress.transportpayload.EditText r7 = com.instagram.direct.armadilloexpress.transportpayload.EditText.DEFAULT_INSTANCE
            goto L_0x005c
        L_0x0082:
            X.2FW r3 = r2.A10
            X.2FW r8 = X.2FW.A1g
            if (r3 != r8) goto L_0x00b0
            int r3 = r7.bitField0_
            r3 = r3 & 1
            if (r3 == 0) goto L_0x00b0
            java.util.List r5 = r2.A0u()
            if (r5 != 0) goto L_0x0098
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
        L_0x0098:
            java.lang.String r4 = r2.A1q
            if (r4 == 0) goto L_0x0151
            com.instagram.direct.model.DirectMessageEditHistory r3 = new com.instagram.direct.model.DirectMessageEditHistory
            r3.<init>()
            r3.A01 = r4
            r3.A00 = r0
            r5.add(r3)
            r2.A1J(r5)
            java.lang.String r0 = r7.newContent_
            r2.A17(r8, r0)
        L_0x00b0:
            int r0 = r7.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x004a
            int r1 = r7.editCount_
            monitor-enter(r2)
            goto L_0x0147
        L_0x00bb:
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r5 = r5.A0L()
            X.0qQ.A07(r5)
            boolean r3 = r5.seen_
            if (r3 == 0) goto L_0x00d9
            X.4ik r3 = r2.A0e
            if (r3 == 0) goto L_0x0104
            X.5Dg r3 = r3.A03
            if (r3 == 0) goto L_0x0104
            X.4k3 r4 = r3.A02
        L_0x00d0:
            X.4k3 r3 = X.C272074k3.RAVEN_SCREENSHOT
            if (r4 == r3) goto L_0x00d9
            X.4k3 r3 = X.C272074k3.RAVEN_OPENED
            X.C69848NtC.A00(r2, r3, r0)
        L_0x00d9:
            boolean r3 = r5.replayed_
            if (r3 == 0) goto L_0x00f0
            X.4ik r3 = r2.A0e
            if (r3 == 0) goto L_0x0102
            X.5Dg r3 = r3.A03
            if (r3 == 0) goto L_0x0102
            X.4k3 r4 = r3.A02
        L_0x00e7:
            X.4k3 r3 = X.C272074k3.RAVEN_SCREENSHOT
            if (r4 == r3) goto L_0x00f0
            X.4k3 r3 = X.C272074k3.RAVEN_REPLAYED
            X.C69848NtC.A00(r2, r3, r0)
        L_0x00f0:
            boolean r3 = r5.screenshotted_
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r14.A06
            boolean r3 = X.AnonymousClass7F3.A01(r2, r3)
            if (r3 == 0) goto L_0x004a
            X.4k3 r3 = X.C272074k3.RAVEN_SCREENSHOT
            X.C69848NtC.A00(r2, r3, r0)
            return
        L_0x0102:
            r4 = 0
            goto L_0x00e7
        L_0x0104:
            r4 = 0
            goto L_0x00d0
        L_0x0106:
            int r3 = r5.supplementMessageContentCase_
            if (r3 != r6) goto L_0x012d
            java.lang.Object r3 = r5.supplementMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.Reaction r3 = (com.instagram.direct.armadilloexpress.transportpayload.Reaction) r3
        L_0x010e:
            X.0qQ.A07(r3)
            java.lang.String r11 = r3.emoji_
            java.lang.String r12 = r3.superReactType_
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8 = 0
            X.46u r7 = new X.46u
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r1 = r3.reactionStatus_
            java.lang.String r0 = "created"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            r2.A0y(r14, r7, r10, r8)
            return
        L_0x012d:
            com.instagram.direct.armadilloexpress.transportpayload.Reaction r3 = com.instagram.direct.armadilloexpress.transportpayload.Reaction.DEFAULT_INSTANCE
            goto L_0x010e
        L_0x0130:
            java.lang.String r1 = r3.reactionStatus_
            java.lang.String r0 = "deleted"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004a
            r2.A0z(r14, r7, r10, r8)
            return
        L_0x013e:
            r0 = 0
        L_0x013f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A1I(r3, r0)
            return
        L_0x0147:
            int r0 = r2.A01     // Catch:{ all -> 0x023c }
            if (r0 == r1) goto L_0x023a
            r2.A01 = r1     // Catch:{ all -> 0x023c }
            r2.A2C = r6     // Catch:{ all -> 0x023c }
            goto L_0x023a
        L_0x0151:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0156:
            int r0 = r5.supplementMessageContentCase_
            r1 = 4
            if (r0 != r1) goto L_0x018d
            java.lang.Object r0 = r5.supplementMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.MediaReaction r0 = (com.instagram.direct.armadilloexpress.transportpayload.MediaReaction) r0
        L_0x015f:
            com.instagram.direct.armadilloexpress.transportpayload.Reaction r3 = r0.reaction_
            if (r3 != 0) goto L_0x0165
            com.instagram.direct.armadilloexpress.transportpayload.Reaction r3 = com.instagram.direct.armadilloexpress.transportpayload.Reaction.DEFAULT_INSTANCE
        L_0x0165:
            X.0qQ.A07(r3)
            int r0 = r5.supplementMessageContentCase_
            if (r0 != r1) goto L_0x018a
            java.lang.Object r0 = r5.supplementMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.MediaReaction r0 = (com.instagram.direct.armadilloexpress.transportpayload.MediaReaction) r0
        L_0x0170:
            java.lang.String r5 = r0.mediaId_
            X.0qQ.A07(r5)
            java.lang.String r0 = r3.reactionStatus_
            X.0qQ.A07(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "created"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01ef
            java.lang.String r6 = r3.emoji_
            monitor-enter(r2)
            goto L_0x0190
        L_0x018a:
            com.instagram.direct.armadilloexpress.transportpayload.MediaReaction r0 = com.instagram.direct.armadilloexpress.transportpayload.MediaReaction.DEFAULT_INSTANCE
            goto L_0x0170
        L_0x018d:
            com.instagram.direct.armadilloexpress.transportpayload.MediaReaction r0 = com.instagram.direct.armadilloexpress.transportpayload.MediaReaction.DEFAULT_INSTANCE
            goto L_0x015f
        L_0x0190:
            X.3sw r3 = r2.A0m     // Catch:{ all -> 0x023c }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x023c }
            java.util.ArrayList r0 = r3.A00     // Catch:{ all -> 0x023c }
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ all -> 0x023c }
        L_0x019b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r4 = X.AnonymousClass7TF.A0a(r1)     // Catch:{ all -> 0x023c }
            X.N2T r4 = (X.N2T) r4     // Catch:{ all -> 0x023c }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x023c }
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x019b
            java.util.ArrayList r0 = r4.A01     // Catch:{ all -> 0x023c }
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ all -> 0x023c }
        L_0x01b5:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r3)     // Catch:{ all -> 0x023c }
            X.N49 r1 = (X.N49) r1     // Catch:{ all -> 0x023c }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x023c }
            boolean r0 = X.0qQ.A0K(r0, r10)     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x01b5
            r1.A00 = r6     // Catch:{ all -> 0x023c }
            goto L_0x023a
        L_0x01cc:
            java.util.ArrayList r4 = r3.A00     // Catch:{ all -> 0x023c }
            r0 = 39
            X.N49 r3 = new X.N49     // Catch:{ all -> 0x023c }
            r3.<init>(r10, r6, r0)     // Catch:{ all -> 0x023c }
            X.N2T r1 = new X.N2T     // Catch:{ all -> 0x023c }
            r1.<init>()     // Catch:{ all -> 0x023c }
            r1.A00 = r5     // Catch:{ all -> 0x023c }
            java.util.ArrayList r0 = r1.A01     // Catch:{ all -> 0x023c }
            r0.add(r3)     // Catch:{ all -> 0x023c }
            goto L_0x01eb
        L_0x01e2:
            java.util.ArrayList r4 = r4.A01     // Catch:{ all -> 0x023c }
            r0 = 39
            X.N49 r1 = new X.N49     // Catch:{ all -> 0x023c }
            r1.<init>(r10, r6, r0)     // Catch:{ all -> 0x023c }
        L_0x01eb:
            r4.add(r1)     // Catch:{ all -> 0x023c }
            goto L_0x023a
        L_0x01ef:
            java.lang.String r0 = "deleted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x023f
            monitor-enter(r2)
            X.3sw r0 = r2.A0m     // Catch:{ all -> 0x023c }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x023c }
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ all -> 0x023c }
        L_0x0200:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x023a
            java.lang.Object r4 = X.AnonymousClass7TF.A0a(r1)     // Catch:{ all -> 0x023c }
            X.N2T r4 = (X.N2T) r4     // Catch:{ all -> 0x023c }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x023c }
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x0200
            java.util.ArrayList r0 = r4.A01     // Catch:{ all -> 0x023c }
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ all -> 0x023c }
        L_0x021a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x0238
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r3)     // Catch:{ all -> 0x023c }
            X.N49 r1 = (X.N49) r1     // Catch:{ all -> 0x023c }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x023c }
            boolean r0 = X.0qQ.A0K(r0, r10)     // Catch:{ all -> 0x023c }
            if (r0 == 0) goto L_0x021a
        L_0x022e:
            java.util.ArrayList r0 = r4.A01     // Catch:{ all -> 0x023c }
            java.util.Collection r0 = X.0u4.A00(r0)     // Catch:{ all -> 0x023c }
            r0.remove(r1)     // Catch:{ all -> 0x023c }
            goto L_0x023a
        L_0x0238:
            r1 = 0
            goto L_0x022e
        L_0x023a:
            monitor-exit(r2)
            return
        L_0x023c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x023f:
            java.lang.String r1 = "ArmadilloExpressProtobufAdapter"
            java.lang.String r0 = "Unidentified media reaction status."
        L_0x0243:
            X.0KC.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71037Oa0.A05(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload, X.3su, java.lang.String, long):void");
    }

    public static final TransportPayload A00(byte[] bArr) {
        try {
            return (TransportPayload) R5b.A04(TransportPayload.DEFAULT_INSTANCE, bArr);
        } catch (AnonymousClass5I7 e) {
            0KC.A0H("ArmadilloExpressProtobufAdapter", 002.A0L("Unable to parse incoming protobuf (json: ", ')', 00l.A0Z(new String(bArr, AnonymousClass15Q.A05), '{')), e);
            throw new Exception("Protobuf parsing failure");
        }
    }

    public final TransportPayload A01(TransportPayload transportPayload, TransportPayload transportPayload2) {
        if (transportPayload != null) {
            SupplementMessageContent A0R = C66582MXn.A0R(transportPayload);
            0qQ.A07(A0R);
            if (A0R.supplementMessageContentCase_ == 5) {
                byte[] A05 = ((OriginalTransportPayload) A0R.supplementMessageContent_).originalTransportPayload_.A05();
                try {
                    0qQ.A0A(A05);
                    return A00(A05);
                } catch (C69531NnD e) {
                    0KC.A0H("ArmadilloExpressProtobufAdapter", "Parse originalTransportPayload failed. Use topLevelTransportPayload", e);
                    return transportPayload2;
                }
            }
        }
        return transportPayload2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0eP A03(com.instagram.common.session.UserSession r32, X.C74490Pvk r33, X.C331237Qc r34, long r35) {
        /*
            r31 = this;
            java.lang.String r5 = "ArmadilloExpressProtobufAdapter"
            r30 = 0
            r4 = 2
            r1 = 3
            r6 = r33
            byte[] r0 = r6.Baz()
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage r3 = com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage.DEFAULT_INSTANCE
            X.R5b r2 = X.R5b.A04(r3, r0)
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage r2 = (com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage) r2
            X.0qQ.A07(r2)
            java.lang.String r10 = r6.BZR()
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage$Metadata r0 = r2.metadata_
            if (r0 != 0) goto L_0x0021
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage$Metadata r0 = com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE
        L_0x0021:
            java.lang.String r0 = r0.senderId_
            long r17 = X.C66580MXl.A08(r0)
            int r0 = r2.payloadCase_
            if (r0 != r4) goto L_0x004b
            java.lang.Object r0 = r2.payload_
            X.TAP r0 = (X.TAP) r0
        L_0x002f:
            byte[] r7 = r0.A05()
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage$Metadata r0 = r2.metadata_
            if (r0 != 0) goto L_0x0039
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage$Metadata r0 = com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE
        L_0x0039:
            int r0 = r0.threadTypeTag_
            r8 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0051
            if (r0 == r8) goto L_0x0054
            if (r0 == r4) goto L_0x004e
            if (r0 == r1) goto L_0x0051
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r2)
            return r0
        L_0x004b:
            X.TAP r0 = X.TAP.A01
            goto L_0x002f
        L_0x004e:
            r25 = 2
            goto L_0x0056
        L_0x0051:
            r25 = 0
            goto L_0x0056
        L_0x0054:
            r25 = 1
        L_0x0056:
            long r0 = r6.C7a()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r15
            X.0qQ.A0A(r7)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r9 = A00(r7)
            int r7 = r9.transportPayloadCase_
            r14 = r31
            if (r7 != r8) goto L_0x00ca
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r7 = r9.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r7 = r7.content_
            if (r7 != 0) goto L_0x0074
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x0074:
            com.instagram.direct.armadilloexpress.transportpayload.Media r7 = r7.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.Raven r7 = r7.A0M()
            X.0qQ.A07(r7)
            X.Nmx r8 = r7.A0L()
            X.0qQ.A07(r8)
            X.Nmx r7 = X.C69515Nmx.RAVEN_VIEW_MODEL_ONCE
            if (r8 == r7) goto L_0x008f
            X.Nmx r7 = X.C69515Nmx.RAVEN_VIEW_MODEL_REPLAYABLE
            if (r8 == r7) goto L_0x008f
            goto L_0x00ca
        L_0x008f:
            int r13 = r6.C34()
            r12 = 0
        L_0x0094:
            if (r12 >= r13) goto L_0x00c5
            byte[] r7 = r6.C32(r12)
            X.R5b r8 = X.R5b.A04(r3, r7)
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage r8 = (com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage) r8
            X.0qQ.A07(r8)
            int r7 = r8.payloadCase_
            if (r7 != r4) goto L_0x00c2
            java.lang.Object r7 = r8.payload_
            X.TAP r7 = (X.TAP) r7
        L_0x00ab:
            byte[] r7 = r7.A05()
            X.0qQ.A0A(r7)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r11 = A00(r7)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r7 = X.C66582MXn.A0R(r11)
            int r8 = r7.supplementMessageContentCase_
            r7 = 5
            if (r8 == r7) goto L_0x00c6
            int r12 = r12 + 1
            goto L_0x0094
        L_0x00c2:
            X.TAP r7 = X.TAP.A01
            goto L_0x00ab
        L_0x00c5:
            r11 = 0
        L_0x00c6:
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r9 = r14.A01(r11, r9)
        L_0x00ca:
            java.lang.Long r22 = java.lang.Long.valueOf(r17)     // Catch:{ NnC -> 0x0157 }
            java.lang.String r24 = X.C2611348j.A04(r10, r0)     // Catch:{ NnC -> 0x0157 }
            java.lang.Integer r21 = X.AnonymousClass05K.A0j     // Catch:{ NnC -> 0x0157 }
            r18 = r32
            r20 = r34
            r26 = r35
            r19 = r9
            r23 = r10
            r28 = r0
            r17 = r14
            X.3su r8 = r17.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)     // Catch:{ NnC -> 0x0157 }
            int r7 = r6.C34()
            r1 = 0
        L_0x00eb:
            if (r1 >= r7) goto L_0x0152
            byte[] r0 = r6.C32(r1)
            X.R5b r10 = X.R5b.A04(r3, r0)
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage r10 = (com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage) r10
            X.0qQ.A07(r10)
            int r0 = r10.payloadCase_
            if (r0 != r4) goto L_0x014f
            java.lang.Object r0 = r10.payload_
            X.TAP r0 = (X.TAP) r0
        L_0x0102:
            byte[] r0 = r0.A05()
            X.0qQ.A0A(r0)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r9 = A00(r0)
            long r26 = r6.C33(r1)
            long r26 = r26 * r15
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage$Metadata r0 = r10.metadata_
            if (r0 != 0) goto L_0x0119
            com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage$Metadata r0 = com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE
        L_0x0119:
            java.lang.String r0 = r0.senderId_
            long r28 = X.C66580MXl.A08(r0)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r23 = X.C66580MXl.A0S(r9)     // Catch:{ NnC -> 0x012f }
            r21 = r14
            r22 = r18
            r24 = r8
            r25 = r20
            r21.A04(r22, r23, r24, r25, r26, r28)     // Catch:{ NnC -> 0x012f }
            goto L_0x014c
        L_0x012f:
            r9 = move-exception
            java.lang.String r0 = "Failed to create from reverb supplemental payload"
            X.0KC.A0J(r5, r0, r9)
            java.lang.String r11 = r8.A0k()
            java.lang.String r10 = " Failed to create from reverb supplemental payload: "
            java.lang.String r9 = r9.getLocalizedMessage()
            if (r9 != 0) goto L_0x0143
            java.lang.String r9 = "Unknown error"
        L_0x0143:
            r0 = 46
            java.lang.String r0 = X.002.A0h(r11, r10, r9, r0)
            r8.A1F(r0)
        L_0x014c:
            int r1 = r1 + 1
            goto L_0x00eb
        L_0x014f:
            X.TAP r0 = X.TAP.A01
            goto L_0x0102
        L_0x0152:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r8, r2)
            return r0
        L_0x0157:
            r1 = move-exception
            java.lang.String r0 = "Failed to create from reverb top level payload"
            X.0KC.A0J(r5, r0, r1)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71037Oa0.A03(com.instagram.common.session.UserSession, X.Pvk, X.7Qc, long):X.0eP");
    }

    public final void A04(UserSession userSession, SupplementMessagePayload supplementMessagePayload, C254703su r9, C331237Qc r10, long j, long j2) {
        Object obj;
        String id;
        Long A0r = C66581MXm.A0r(userSession, AnonymousClass0t1.A01);
        if (A0r == null || A0r.longValue() != j2) {
            Iterator it = r10.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Long BST = ((User) obj).BST();
                if (BST != null && BST.longValue() == j2) {
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                id = user.getId();
            } else {
                0wb.A03("ArmadilloExpressProtobufAdapter", "senderIgId is null");
                0KC.A0C("ArmadilloExpressProtobufAdapter", "Not able to get the senderIgId");
                return;
            }
        } else {
            id = userSession.A06;
        }
        A05(userSession, supplementMessagePayload, r9, id, j);
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [X.1Xy, X.1Xx, java.lang.Object] */
    public final C254703su A02(UserSession userSession, TransportPayload transportPayload, C331237Qc r40, Integer num, Long l, String str, String str2, int i, long j, long j2, boolean z) {
        Object obj;
        C69405Nkj nkj;
        C254703su r5;
        LinkedHashMap linkedHashMap;
        ImmutableMap A0K;
        1Xj r11;
        ExtendedImageUrl extendedImageUrl;
        List<ExtendedImageUrl> Al9;
        TransportPayload transportPayload2 = transportPayload;
        0qQ.A0B(transportPayload2, 5);
        C331237Qc r36 = r40;
        DirectThreadKey directThreadKey = r36.A00;
        String str3 = directThreadKey.A00;
        UserSession userSession2 = userSession;
        Long l2 = l;
        String str4 = null;
        if (0qQ.A0K(C66581MXm.A0r(userSession2, AnonymousClass0t1.A01), l2)) {
            str4 = userSession2.A06;
        } else {
            Iterator it = r36.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((User) obj).BST(), l2)) {
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                str4 = user.getId();
            }
        }
        if (str4 == null) {
            0wb.A03("ArmadilloExpressProtobufAdapter", "senderIgid is null");
            0KC.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve senderIgid");
            throw new Exception("Not able to resolve senderIgid");
        } else if (str3 != null) {
            int i2 = i;
            if (i2 == 1) {
                nkj = C69405Nkj.SHH_MODE;
            } else if (i2 != 2) {
                nkj = C69405Nkj.UNRECOGNIZED;
            } else {
                nkj = C69405Nkj.DISAPPEARING_MESSAGE;
            }
            OIH A002 = C69847NtB.A00(transportPayload2, nkj, num, str2, (String) null, str, str4, str3, j2, j);
            if (A002 != null) {
                C254933tI r1 = null;
                String str5 = A002.A09;
                if (str5 != null) {
                    String str6 = A002.A08;
                    if (182.A06(0Tu.A05, userSession2, 2342161901213719208L)) {
                        r5 = 2L2.A00(userSession2).BRz(directThreadKey, str5);
                    } else {
                        r5 = null;
                    }
                    if (r5 == null) {
                        String A03 = C2611348j.A03(str5);
                        if (A03 == null) {
                            A03 = "0";
                        }
                        r1 = new C254933tI(new OU1(2FW.A1M, (2FW) null, new C2814857z(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT), str5, str6, A03, "0", "replyActionSource", (String) null, true));
                    } else {
                        Object A003 = C70058Nwa.A00(r5, str6);
                        if (!r5.A1d()) {
                            if (TimeUnit.MILLISECONDS.toDays(C51966G9m.A07(TimeUnit.MICROSECONDS.toMillis(r5.C7c()))) < 1) {
                                if (r5.A10 == 2FW.A1A && (A003 instanceof 1Xj)) {
                                    r11 = (1Xj) A003;
                                    if (r11.BR7() == 1iA.A0Q) {
                                        ImageInfo A1p = r11.A1p();
                                        if (!(A1p == null || (Al9 = A1p.Al9()) == null)) {
                                            ArrayList A0r = AnonymousClass7TG.A0r(Al9);
                                            for (ExtendedImageUrl extendedImageUrl2 : Al9) {
                                                A0r.add(new ExtendedImageUrl(C66834MdS.A07(extendedImageUrl2.A0A), extendedImageUrl2.getWidth(), extendedImageUrl2.getHeight()));
                                            }
                                            if (!A0r.isEmpty()) {
                                                C45444CwX AKc = A1p.AKc();
                                                AKc.A03 = A0r;
                                                ImageInfo A004 = AKc.A00();
                                                ? obj2 = new Object();
                                                obj2.EZf(A004);
                                                r11 = new 1Xj(new 1hu((UserSession) null), obj2);
                                            }
                                        }
                                        A003 = r11;
                                    }
                                }
                                if (r5.A10 == 2FW.A0y && (A003 instanceof List)) {
                                    1Xj r4 = (List) A003;
                                    r11 = AnonymousClass7TE.A1C();
                                    Iterator it2 = r4.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        if (!(next instanceof C254873tC)) {
                                            break;
                                        }
                                        C254873tC r13 = (C254873tC) next;
                                        if (r13.A02 != 9) {
                                            break;
                                        }
                                        String str7 = r13.A0u;
                                        if (str7 != null) {
                                            C254883tD r22 = r13.A0Q;
                                            ExtendedImageUrl extendedImageUrl3 = r13.A0X;
                                            if (extendedImageUrl3 != null) {
                                                String str8 = extendedImageUrl3.A0A;
                                                0qQ.A07(str8);
                                                extendedImageUrl = new ExtendedImageUrl(C66834MdS.A07(str8), extendedImageUrl3.getWidth(), extendedImageUrl3.getHeight());
                                            } else {
                                                extendedImageUrl = null;
                                            }
                                            long j3 = r13.A0D;
                                            GifUrlImpl gifUrlImpl = r13.A0Z;
                                            GifUrlImpl gifUrlImpl2 = null;
                                            if (gifUrlImpl != null) {
                                                gifUrlImpl2 = gifUrlImpl;
                                            }
                                            r11.add(new C254873tC(extendedImageUrl, r22, gifUrlImpl2, str7, r13.A08, r13.A02, j3, r13.A0K, r13.A04()));
                                        } else {
                                            throw AnonymousClass7TE.A0y();
                                        }
                                    }
                                    r11.clear();
                                    if (r11.isEmpty()) {
                                        r11 = r4;
                                    }
                                    A003 = r11;
                                }
                            }
                        }
                        if (str6 == null || (A0K = r5.A0K()) == null) {
                            linkedHashMap = r5.A0K();
                        } else {
                            linkedHashMap = AnonymousClass7TE.A1H();
                            Iterator it3 = A0K.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry A1J = AnonymousClass7TE.A1J(it3);
                                if (0qQ.A0K(A1J.getKey(), str6)) {
                                    Dbb.A1V(A1J, linkedHashMap);
                                }
                            }
                        }
                        String A0h = r5.A0h();
                        String A0f = r5.A0f();
                        if (A0f == null) {
                            A0f = "0";
                        }
                        OU1 ou1 = new OU1(r5.A10, r5.A0z, A003, A0h, str6, A0f, r5.A1u, "replyActionSource", r5.A1q, true);
                        ou1.A0I = linkedHashMap;
                        ou1.A07 = r5.A0l;
                        r1 = new C254933tI(ou1);
                    }
                }
                C254703su r42 = new C254703su();
                r42.A0a = r1;
                synchronized (r42) {
                    boolean z2 = z;
                    if (r42.A2Q != z2) {
                        r42.A2C = true;
                        r42.A2Q = z2;
                    }
                }
                OWL.A00.A02(A002, r42);
                if (transportPayload2.transportPayloadCase_ == 1) {
                    AddMessageContent addMessageContent = transportPayload2.A0L().content_;
                    if (addMessageContent == null) {
                        addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
                    }
                    0qQ.A07(addMessageContent);
                    boolean z3 = false;
                    for (C74384Pu0 pu0 : O49.A00) {
                        if (pu0.FMq(addMessageContent)) {
                            pu0.A8C(userSession2, A002, addMessageContent, r42, r36);
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        r42.A17(2FW.A1M, new C2814857z("need_update"));
                    }
                    r42.A0N(userSession2, (C254763t0) null);
                }
                if (transportPayload2.transportPayloadCase_ == 2 && !r42.A2D) {
                    r42.A2D = true;
                    r42.A2C = true;
                }
                return r42;
            }
            0KC.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve message metadata");
            throw new Exception("Not able to resolve message metadata");
        } else {
            0wb.A03("ArmadilloExpressProtobufAdapter", "threadIgid is null");
            0KC.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve threadIgId");
            throw new Exception("Not able to resolve threadIgId");
        }
    }
}
