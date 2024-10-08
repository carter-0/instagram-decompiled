package X;

import com.facebook.location.platform.api.Location;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.PeO  reason: case insensitive filesystem */
public final class C73532PeO implements C255533uI {
    public static final C73532PeO A00;
    public static final /* synthetic */ C255543uJ A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.PeO, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.instagram.bugreporter.model.BugReport", obj, 25);
        r1.A00(DevServerEntity.COLUMN_DESCRIPTION);
        r1.A00("additionalDescription");
        r1.A00("screenCaptureAttachments");
        r1.A00("screenCaptureChunkAttachments");
        r1.A00("otherAttachments");
        r1.A00("syncAttachments");
        r1.A00("categoryId");
        r1.A00("customConfigId");
        r1.A00("userId");
        r1.A00("adId");
        r1.A01("source", true);
        r1.A00(Location.EXTRAS);
        r1.A00("areCompleteLogsEnabled");
        r1.A00("screenRageShakingFrom");
        r1.A00("navChain");
        r1.A00("notifName");
        r1.A00("notifAggId");
        r1.A00("notificationType");
        r1.A00("promotionId");
        r1.A00("reportId");
        r1.A00("screenshotsAdded");
        r1.A00("screenshotsRemoved");
        r1.A00("videosAdded");
        r1.A00("videosRemoved");
        r1.A00("viewHierarchyDump");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = BugReport.A0P;
        C255453u9 r21 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r21), C360578eo.A00(r21), r1[2], r1[3], r1[4], r1[5], C360578eo.A00(r21), C360578eo.A00(r21), C360578eo.A00(r21), C360578eo.A00(r21), r1[10], r1[11], AnonymousClass40E.A00, C360578eo.A00(r21), C360578eo.A00(r21), C360578eo.A00(r21), C360578eo.A00(r21), C360578eo.A00(r21), C360578eo.A00(r21), r21, r1[20], r1[21], r1[22], r1[23], C360578eo.A00(C20435WrL.A00)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.instagram.bugreporter.source.BugReportSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: com.meta.flytrap.attachment.model.AttachmentCounter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: com.meta.flytrap.attachment.model.AttachmentCounter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.meta.flytrap.attachment.model.AttachmentCounter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: com.meta.flytrap.attachment.model.AttachmentCounter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.io.File} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r57) {
        /*
            r56 = this;
            r30 = 0
            r1 = r57
            r0 = r30
            X.0qQ.A0B(r1, r0)
            X.3uJ r11 = A01
            X.40b r10 = r1.ADI(r11)
            X.3uA[] r29 = com.instagram.bugreporter.model.BugReport.A0P
            r8 = 0
            r19 = r8
            r20 = r8
            r23 = r8
            r21 = r8
            r28 = r8
            r26 = r8
            r25 = r8
            r22 = r8
            r27 = r8
            r24 = r8
            r18 = r8
            r1 = r8
            r2 = r8
            r3 = r8
            r4 = r8
            r5 = r8
            r6 = r8
            r48 = r8
            r7 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r9 = 0
            r55 = 0
        L_0x003a:
            int r0 = r10.ANp(r11)
            switch(r0) {
                case -1: goto L_0x01df;
                case 0: goto L_0x01d1;
                case 1: goto L_0x01c4;
                case 2: goto L_0x01b7;
                case 3: goto L_0x01aa;
                case 4: goto L_0x019d;
                case 5: goto L_0x0190;
                case 6: goto L_0x0183;
                case 7: goto L_0x0176;
                case 8: goto L_0x0168;
                case 9: goto L_0x0154;
                case 10: goto L_0x0140;
                case 11: goto L_0x012c;
                case 12: goto L_0x0122;
                case 13: goto L_0x0114;
                case 14: goto L_0x0100;
                case 15: goto L_0x00ea;
                case 16: goto L_0x00d7;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00b1;
                case 19: goto L_0x00a8;
                case 20: goto L_0x0095;
                case 21: goto L_0x0082;
                case 22: goto L_0x006f;
                case 23: goto L_0x005b;
                case 24: goto L_0x0047;
                default: goto L_0x0041;
            }
        L_0x0041:
            X.WzB r1 = new X.WzB
            r1.<init>(r0)
            throw r1
        L_0x0047:
            r13 = 24
            X.WrL r12 = X.C20435WrL.A00
            r0 = r28
            java.lang.Object r28 = r10.AO4(r0, r12, r11, r13)
            r0 = r28
            java.io.File r0 = (java.io.File) r0
            r28 = r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x00fd
        L_0x005b:
            r13 = 23
            r12 = r29[r13]
            r0 = r27
            java.lang.Object r27 = r10.AO5(r0, r12, r11, r13)
            r0 = r27
            com.meta.flytrap.attachment.model.AttachmentCounter r0 = (com.meta.flytrap.attachment.model.AttachmentCounter) r0
            r27 = r0
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fd
        L_0x006f:
            r13 = 22
            r12 = r29[r13]
            r0 = r26
            java.lang.Object r26 = r10.AO5(r0, r12, r11, r13)
            r0 = r26
            com.meta.flytrap.attachment.model.AttachmentCounter r0 = (com.meta.flytrap.attachment.model.AttachmentCounter) r0
            r26 = r0
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00fd
        L_0x0082:
            r13 = 21
            r12 = r29[r13]
            r0 = r25
            java.lang.Object r25 = r10.AO5(r0, r12, r11, r13)
            r0 = r25
            com.meta.flytrap.attachment.model.AttachmentCounter r0 = (com.meta.flytrap.attachment.model.AttachmentCounter) r0
            r25 = r0
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x00fd
        L_0x0095:
            r13 = 20
            r12 = r29[r13]
            r0 = r24
            java.lang.Object r24 = r10.AO5(r0, r12, r11, r13)
            r0 = r24
            com.meta.flytrap.attachment.model.AttachmentCounter r0 = (com.meta.flytrap.attachment.model.AttachmentCounter) r0
            r24 = r0
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00fd
        L_0x00a8:
            r0 = 19
            java.lang.String r48 = r10.AOA(r11, r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00fd
        L_0x00b1:
            r13 = 18
            X.3u9 r12 = X.C255453u9.A01
            r0 = r23
            java.lang.Object r23 = r10.AO4(r0, r12, r11, r13)
            r0 = r23
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x00fd
        L_0x00c4:
            r13 = 17
            X.3u9 r12 = X.C255453u9.A01
            r0 = r22
            java.lang.Object r22 = r10.AO4(r0, r12, r11, r13)
            r0 = r22
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00fd
        L_0x00d7:
            X.3u9 r13 = X.C255453u9.A01
            r12 = 16
            r0 = r21
            java.lang.Object r21 = r10.AO4(r0, r13, r11, r12)
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            r21 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00fd
        L_0x00ea:
            X.3u9 r13 = X.C255453u9.A01
            r12 = 15
            r0 = r20
            java.lang.Object r20 = r10.AO4(r0, r13, r11, r12)
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            r0 = 32768(0x8000, float:4.5918E-41)
        L_0x00fd:
            r9 = r9 | r0
            goto L_0x003a
        L_0x0100:
            X.3u9 r13 = X.C255453u9.A01
            r12 = 14
            r0 = r19
            java.lang.Object r19 = r10.AO4(r0, r13, r11, r12)
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            goto L_0x003a
        L_0x0114:
            X.3u9 r12 = X.C255453u9.A01
            r0 = 13
            java.lang.Object r8 = r10.AO4(r8, r12, r11, r0)
            java.lang.String r8 = (java.lang.String) r8
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            goto L_0x003a
        L_0x0122:
            r0 = 12
            boolean r55 = r10.ANi(r11, r0)
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            goto L_0x003a
        L_0x012c:
            r13 = 11
            r12 = r29[r13]
            r0 = r18
            java.lang.Object r18 = r10.AO5(r0, r12, r11, r13)
            r0 = r18
            java.util.Map r0 = (java.util.Map) r0
            r18 = r0
            r9 = r9 | 2048(0x800, float:2.87E-42)
            goto L_0x003a
        L_0x0140:
            r13 = 10
            r12 = r29[r13]
            r0 = r17
            java.lang.Object r17 = r10.AO5(r0, r12, r11, r13)
            r0 = r17
            com.instagram.bugreporter.source.BugReportSource r0 = (com.instagram.bugreporter.source.BugReportSource) r0
            r17 = r0
            r9 = r9 | 1024(0x400, float:1.435E-42)
            goto L_0x003a
        L_0x0154:
            X.3u9 r13 = X.C255453u9.A01
            r12 = 9
            r0 = r16
            java.lang.Object r16 = r10.AO4(r0, r13, r11, r12)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            r16 = r0
            r9 = r9 | 512(0x200, float:7.175E-43)
            goto L_0x003a
        L_0x0168:
            X.3u9 r12 = X.C255453u9.A01
            r0 = 8
            java.lang.Object r15 = r10.AO4(r15, r12, r11, r0)
            java.lang.String r15 = (java.lang.String) r15
            r9 = r9 | 256(0x100, float:3.59E-43)
            goto L_0x003a
        L_0x0176:
            X.3u9 r12 = X.C255453u9.A01
            r0 = 7
            java.lang.Object r14 = r10.AO4(r14, r12, r11, r0)
            java.lang.String r14 = (java.lang.String) r14
            r9 = r9 | 128(0x80, float:1.794E-43)
            goto L_0x003a
        L_0x0183:
            X.3u9 r12 = X.C255453u9.A01
            r0 = 6
            java.lang.Object r7 = r10.AO4(r7, r12, r11, r0)
            java.lang.String r7 = (java.lang.String) r7
            r9 = r9 | 64
            goto L_0x003a
        L_0x0190:
            r12 = 5
            r0 = r29[r12]
            java.lang.Object r6 = r10.AO5(r6, r0, r11, r12)
            java.util.List r6 = (java.util.List) r6
            r9 = r9 | 32
            goto L_0x003a
        L_0x019d:
            r12 = 4
            r0 = r29[r12]
            java.lang.Object r5 = r10.AO5(r5, r0, r11, r12)
            java.util.List r5 = (java.util.List) r5
            r9 = r9 | 16
            goto L_0x003a
        L_0x01aa:
            r12 = 3
            r0 = r29[r12]
            java.lang.Object r4 = r10.AO5(r4, r0, r11, r12)
            java.util.List r4 = (java.util.List) r4
            r9 = r9 | 8
            goto L_0x003a
        L_0x01b7:
            r12 = 2
            r0 = r29[r12]
            java.lang.Object r3 = r10.AO5(r3, r0, r11, r12)
            java.util.List r3 = (java.util.List) r3
            r9 = r9 | 4
            goto L_0x003a
        L_0x01c4:
            X.3u9 r12 = X.C255453u9.A01
            r0 = 1
            java.lang.Object r2 = r10.AO4(r2, r12, r11, r0)
            java.lang.String r2 = (java.lang.String) r2
            r9 = r9 | 2
            goto L_0x003a
        L_0x01d1:
            X.3u9 r12 = X.C255453u9.A01
            r0 = r30
            java.lang.Object r1 = r10.AO4(r1, r12, r11, r0)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r9 | 1
            goto L_0x003a
        L_0x01df:
            r10.AST(r11)
            com.instagram.bugreporter.model.BugReport r29 = new com.instagram.bugreporter.model.BugReport
            r40 = r15
            r41 = r16
            r42 = r8
            r43 = r19
            r44 = r20
            r45 = r21
            r46 = r22
            r47 = r23
            r49 = r3
            r50 = r4
            r51 = r5
            r52 = r6
            r53 = r18
            r54 = r9
            r30 = r17
            r31 = r24
            r32 = r25
            r33 = r26
            r34 = r27
            r35 = r28
            r36 = r1
            r37 = r2
            r38 = r7
            r39 = r14
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73532PeO.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BugReport bugReport = (BugReport) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, bugReport);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r6 = BugReport.A0P;
        C255453u9 r2 = C255453u9.A01;
        ADJ.AS7(bugReport.A0A, r2, r3, 0);
        ADJ.AS7(bugReport.A07, r2, r3, A1U ? 1 : 0);
        ADJ.AS8(bugReport.A0K, r6[2], r3, 2);
        ADJ.AS8(bugReport.A0L, r6[3], r3, 3);
        ADJ.AS8(bugReport.A0J, r6[4], r3, 4);
        ADJ.AS8(bugReport.A0M, r6[5], r3, 5);
        ADJ.AS7(bugReport.A08, r2, r3, 6);
        ADJ.AS7(bugReport.A09, r2, r3, 7);
        ADJ.AS7(bugReport.A0I, r2, r3, 8);
        ADJ.AS7(bugReport.A06, r2, r3, 9);
        if (ADJ.EsA(r3, 10) || bugReport.A00 != BugReportSource.USER_OPTIONS) {
            ADJ.AS8(bugReport.A00, r6[10], r3, 10);
        }
        ADJ.AS8(bugReport.A0N, r6[11], r3, 11);
        ADJ.ARt(r3, 12, bugReport.A0O);
        ADJ.AS7(bugReport.A0H, r2, r3, 13);
        ADJ.AS7(bugReport.A0B, r2, r3, 14);
        ADJ.AS7(bugReport.A0D, r2, r3, 15);
        ADJ.AS7(bugReport.A0C, r2, r3, 16);
        ADJ.AS7(bugReport.A0E, r2, r3, 17);
        ADJ.AS7(bugReport.A0F, r2, r3, 18);
        ADJ.ASC(bugReport.A0G, r3, 19);
        ADJ.AS8(bugReport.A01, r6[20], r3, 20);
        ADJ.AS8(bugReport.A02, r6[21], r3, 21);
        ADJ.AS8(bugReport.A03, r6[22], r3, 22);
        ADJ.AS8(bugReport.A04, r6[23], r3, 23);
        ADJ.AS7(bugReport.A05, C20435WrL.A00, r3, 24);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
