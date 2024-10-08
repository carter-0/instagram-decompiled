package com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator;

import X.AnonymousClass7TG;
import X.C70146Ny0;
import com.facebook.msys.mci.AccountSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;

public final class IGBackupUpdateGeneratorPluginImplPostmailbox extends Postmailbox {
    public static final C70146Ny0 Companion = new Object();
    public static final String KEY_MIME_TYPE = "mimeType";
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String KEY_PREVIEW_OBJECT_ID = "previewObjectId";
    public static final String TAG = "IGBackupUpdateGeneratorPluginImplPostmailbox";
    public final MsysActiveUserSession msysActiveUserSession;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020c, code lost:
        r9 = r7.linkContext_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020e, code lost:
        if (r9 != null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0210, code lost:
        r9 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0216, code lost:
        if ((r9.bitField0_ & 32) == 0) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0218, code lost:
        r7 = r9.linkPreviewThumbnail_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021a, code lost:
        if (r7 != null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021c, code lost:
        r7 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021e, code lost:
        if (r7 == null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0220, code lost:
        r7 = r7.mediaTransport_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0222, code lost:
        if (r7 != null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0224, code lost:
        r7 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0226, code lost:
        r4.add(new com.facebook.wamsys.wce.EncryptedBackupsAttachment(r7.objectId_, r7.mimetype_, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0240, code lost:
        r16 = java.lang.Integer.valueOf(r8);
        r18 = java.lang.Boolean.valueOf(r13);
        r19 = X.OZ8.A00.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0254, code lost:
        if (r4.isEmpty() == false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0256, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0257, code lost:
        r22 = java.lang.Boolean.valueOf(r1);
        r23 = java.lang.Boolean.valueOf(r15);
        r14 = new com.facebook.wamsys.wce.MessageBackupDirective(r6, r16, (java.lang.String) null, r18, r19, r4, r3, r22, r23, (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026e, code lost:
        r7 = com.instagram.direct.armadilloexpress.transportpayload.Link.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0271, code lost:
        r3 = X.AnonymousClass7TE.A1C();
        r4 = r2.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0277, code lost:
        if (r4 != null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r13 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0279, code lost:
        r4 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027b, code lost:
        r4 = r4.A0M().media_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0281, code lost:
        if (r4 != null) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0283, code lost:
        r4 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0285, code lost:
        X.0qQ.A07(r4);
        r4 = X.C71119OdD.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x028c, code lost:
        if (r4 == null) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028e, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0291, code lost:
        r18 = java.lang.Integer.valueOf(r8);
        r20 = java.lang.Boolean.valueOf(r17);
        r21 = X.OZ8.A00.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a5, code lost:
        if (r3.isEmpty() == false) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a7, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r12 == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a8, code lost:
        r17 = r6;
        r16 = new com.facebook.wamsys.wce.MessageBackupDirective(r17, r18, (java.lang.String) null, r20, r21, r3, r7, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c1, code lost:
        if (r1 != r8) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c3, code lost:
        r1 = (com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload) r14.transportPayload_;
        X.0qQ.A07(r1);
        r3 = r14.openEb_;
        r2 = r14.isE2EeAttributed_;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02cf, code lost:
        if (r0 == 1) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d1, code lost:
        if (r0 == r8) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d3, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d8, code lost:
        if ((r1.bitField0_ & 1) == 0) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02da, code lost:
        r1 = r1.messageOtid_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02dc, code lost:
        if (r1 == null) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02de, code lost:
        r0 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r11 = new com.facebook.wamsys.wce.MessageBackupDirective(r1, 4, (java.lang.String) null, java.lang.Boolean.valueOf(r4), (java.util.List) null, (java.util.List) null, (java.lang.Number) null, java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf(r2), (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0304, code lost:
        if (r1 != 3) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0306, code lost:
        r13 = X.C71119OdD.A00;
        r12 = X.C66580MXl.A0S(r14);
        r7 = r14.openEb_;
        r2 = r14.isE2EeAttributed_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0314, code lost:
        if ((r12.bitField0_ & 1) == 0) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0316, code lost:
        r1 = r12.targetMessageOtid_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0318, code lost:
        if (r1 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x031a, code lost:
        r14 = r13.A04(r9, r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x031e, code lost:
        if (r14 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0320, code lost:
        r4 = r12.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 2342161901214571185L) == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0322, code lost:
        if (r4 != null) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0324, code lost:
        r4 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0326, code lost:
        r9 = r4.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0330, code lost:
        if (X.C66580MXl.A06(r9.mimetype_) == 0) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x033c, code lost:
        if (X.C66580MXl.A06(r4.A0L().objectId_) == 0) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x033e, code lost:
        r3 = com.facebook.wamsys.wce.EncryptedBackupsAttachment.$redex_init_class;
        r3 = r4.A0L();
        r17 = X.AnonymousClass7TE.A1I(new com.facebook.wamsys.wce.EncryptedBackupsAttachment(r3.objectId_, r3.mimetype_, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035d, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035e, code lost:
        if (r0 == 1) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0360, code lost:
        if (r0 == r8) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0362, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0363, code lost:
        r6 = X.OZ8.A00.A01((com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload) null, r0);
        r3 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0370, code lost:
        if (r9.seen_ == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0372, code lost:
        r3.add("UNREAD_RAVEN");
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0377, code lost:
        r0 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r11 = new com.facebook.wamsys.wce.MessageBackupDirective(r1, 3, r14, java.lang.Boolean.valueOf(r12), r6, r17, (java.lang.Number) null, java.lang.Boolean.valueOf(r7), java.lang.Boolean.valueOf(r2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0397, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0399, code lost:
        if (r9.replayed_ == false) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x039b, code lost:
        r6 = X.00k.A0U(r6);
        r6.add("RAVEN_REPLAYED");
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a5, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a8, code lost:
        X.0KC.A0C("ArmadilloExpressBackupGeneratorForProtoBufferTransport", "Delete message backup directive can't be created without a valid target message OTID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03af, code lost:
        r0 = new X.C68379NEf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b6, code lost:
        X.0KC.A0F("ArmadilloExpressBackupGeneratorForProtoBufferTransport", "Failed to parse protobuf to create backup directive", r2);
        r0 = new X.C68379NEf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r14 = X.C71037Oa0.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return new X.C68379NEf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r14 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1 = r14.transportPayloadCase_;
        r3 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r1 != 1) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r2 = r14.A0L();
        X.0qQ.A07(r2);
        r1 = r14.openEb_;
        r15 = r14.isE2EeAttributed_;
        r7 = r2.metadata_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r7 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        X.0qQ.A07(r7);
        r12 = r2.metadata_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r12 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        r12 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        X.0qQ.A07(r12);
        r14 = r2.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r14 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r14 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        X.0qQ.A07(r14);
        r7 = r14.A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r7 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        r7.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        r7 = X.C71119OdD.A01(r12);
        r17 = X.C71119OdD.A03(r9, r2, r7, r0);
        r13 = r14.A0O().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r13 == 3) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        r16 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        if (r13 == r8) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r13 == 4) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0 != r8) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r13 == 6) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        r3 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r17 = r6;
        r16 = new com.facebook.wamsys.wce.MessageBackupDirective(r17, java.lang.Integer.valueOf(r8), (java.lang.String) null, java.lang.Boolean.valueOf(r17), X.OZ8.A00.A01(r2, r0), (java.util.List) null, r7, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        r4 = X.AnonymousClass7TE.A1C();
        r3 = r2.metadata_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        if (r3 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        r3 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        X.0qQ.A07(r3);
        r3 = X.C71119OdD.A01(r3);
        r12 = X.C71119OdD.A03(r9, r2, r3, r0);
        r9 = r2.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00eb, code lost:
        if (r9 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ed, code lost:
        r9 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f1, code lost:
        if (r9.addMessageContentCase_ != 7) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        r7 = (com.instagram.direct.armadilloexpress.transportpayload.Collection) r9.addMessageContent_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
        r9 = r7.media_.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r9.hasNext() == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        r7 = X.C71119OdD.A00((com.instagram.direct.armadilloexpress.transportpayload.Media) X.AnonymousClass7TF.A0a(r9), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010d, code lost:
        if (r7 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010f, code lost:
        r4.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        r7 = com.instagram.direct.armadilloexpress.transportpayload.Collection.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        r7 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r13 = r6;
        r12 = new com.facebook.wamsys.wce.MessageBackupDirective(r13, java.lang.Integer.valueOf(r8), (java.lang.String) null, java.lang.Boolean.valueOf(r12), X.OZ8.A00.A01(r2, r0), r4, r3, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013e, code lost:
        r8 = r14.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r13 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        if (r8.mediaCase_ != 4) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r8 = r8.A0M().A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        if (r8 == X.C69515Nmx.RAVEN_VIEW_MODEL_ONCE) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        if (r8 != X.C69515Nmx.RAVEN_VIEW_MODEL_REPLAYABLE) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        r16 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0158, code lost:
        r7 = r2.metadata_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        if (r7 != null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015e, code lost:
        X.0qQ.A07(r7);
        r7 = X.C71119OdD.A01(r7);
        r14 = X.C71119OdD.A03(r9, r2, r7, r0);
        r11 = X.AnonymousClass7TE.A1C();
        r8 = r2.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016f, code lost:
        if (r8 != null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0171, code lost:
        r8 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0173, code lost:
        r8 = r8.A0L();
        X.0qQ.A07(r8);
        r8 = X.C71119OdD.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017e, code lost:
        if (r8 == null) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0180, code lost:
        r11.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        r8 = X.OZ8.A00.A01(r2, r0);
        r0 = r2.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018b, code lost:
        if (r0 != null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018f, code lost:
        r20 = null;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019b, code lost:
        if (X.AnonymousClass7TF.A1S(r0.A0L().mediaCase_, 4) == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r1 = java.nio.charset.StandardCharsets.UTF_8;
        X.0qQ.A08(r1);
        r2 = X.C66580MXl.A1a("{\"", 1, new java.lang.String(r7, r1));
        r9 = r27.msysActiveUserSession.userSession;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019d, code lost:
        r0 = X.17h.A00(r9).A02(r9.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a7, code lost:
        if (r0 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a9, code lost:
        r0 = r0.BST();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ad, code lost:
        if (r0 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01af, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b5, code lost:
        if (r0.longValue() == r32) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b7, code lost:
        r8 = X.00k.A0U(r8);
        r8.add("UNREAD_RAVEN");
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c0, code lost:
        r16 = java.lang.Integer.valueOf(r16);
        r18 = java.lang.Boolean.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ce, code lost:
        if (r11.isEmpty() != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d0, code lost:
        r20 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r2 != false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d2, code lost:
        r22 = java.lang.Boolean.valueOf(r1);
        r23 = java.lang.Boolean.valueOf(r15);
        r14 = new com.facebook.wamsys.wce.MessageBackupDirective(r6, r16, (java.lang.String) null, r18, r8, r20, r7, r22, r23, (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e9, code lost:
        r4 = X.AnonymousClass7TE.A1C();
        r3 = r2.metadata_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ef, code lost:
        if (r3 != null) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f1, code lost:
        r3 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f3, code lost:
        X.0qQ.A07(r3);
        r3 = X.C71119OdD.A01(r3);
        r13 = X.C71119OdD.A03(r9, r2, r3, r0);
        r9 = r2.content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0200, code lost:
        if (r9 != null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0202, code lost:
        r9 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0206, code lost:
        if (r9.addMessageContentCase_ != 3) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0208, code lost:
        r7 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r9.addMessageContent_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r3 == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.wamsys.wce.MessageBackupDirective IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirective(com.facebook.msys.mci.PrivacyContext r28, long r29, java.lang.String r31, long r32, int r34, java.lang.Number r35, java.lang.Object r36, byte[] r37) {
        /*
            r27 = this;
            r4 = 0
            r0 = r28
            r6 = r31
            int r8 = X.DbW.A02(r4, r0, r6)
            r11 = 7
            r7 = r37
            X.0qQ.A0B(r7, r11)
            r5 = 1
            r13 = 1
            r0 = r34
            if (r0 == r5) goto L_0x0019
            r13 = 0
            r12 = 1
            if (r0 == r8) goto L_0x001d
        L_0x0019:
            r12 = 0
            r3 = 0
            if (r13 == 0) goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            X.0qQ.A08(r1)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7, r1)
            java.lang.String r1 = "{\""
            boolean r2 = X.C66580MXl.A1a(r1, r5, r2)
            r1 = r27
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r1 = r1.msysActiveUserSession
            com.instagram.common.session.UserSession r9 = r1.userSession
            java.lang.String r10 = "IGBackupUpdateGeneratorPluginImplPostmailbox"
            if (r2 != 0) goto L_0x03d2
            if (r3 == 0) goto L_0x004e
            X.0qQ.A0B(r9, r4)
            if (r13 != 0) goto L_0x004e
            if (r12 == 0) goto L_0x03d2
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342161901214571185(0x208107d700591ab1, double:4.064646390970203E-152)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x03d2
        L_0x004e:
            X.0qQ.A0B(r9, r4)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r14 = X.C71037Oa0.A00(r7)     // Catch:{ NnD -> 0x03b5 }
            if (r14 == 0) goto L_0x03af
            int r1 = r14.transportPayloadCase_
            r3 = r32
            if (r1 != r5) goto L_0x02c1
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r2 = r14.A0L()
            X.0qQ.A07(r2)
            boolean r1 = r14.openEb_
            boolean r15 = r14.isE2EeAttributed_
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r7 = r2.metadata_
            if (r7 != 0) goto L_0x006e
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
        L_0x006e:
            X.0qQ.A07(r7)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r12 = r2.metadata_
            if (r12 != 0) goto L_0x0077
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r12 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
        L_0x0077:
            X.0qQ.A07(r12)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r14 = r2.content_
            if (r14 != 0) goto L_0x0080
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r14 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x0080:
            X.0qQ.A07(r14)
            java.lang.Integer r7 = r14.A0O()
            if (r7 == 0) goto L_0x008c
            r7.intValue()
        L_0x008c:
            java.lang.Long r7 = X.C71119OdD.A01(r12)
            boolean r17 = X.C71119OdD.A03(r9, r2, r7, r0)
            java.lang.Integer r12 = r14.A0O()
            int r13 = r12.intValue()
            r12 = 3
            if (r13 == r12) goto L_0x0271
            r16 = 2
            if (r13 == r8) goto L_0x01e9
            r12 = 4
            if (r13 == r12) goto L_0x013e
            r3 = 6
            if (r13 == r3) goto L_0x00d4
            com.facebook.wamsys.wce.MessageBackupDirective r3 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            r19 = 0
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r17)
            X.OZ8 r3 = X.OZ8.A00
            java.util.List r21 = r3.A01(r2, r0)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r15)
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r22 = r19
            r23 = r7
            r26 = r19
            r16 = r0
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x03c2
        L_0x00d4:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r3 = r2.metadata_
            if (r3 != 0) goto L_0x00de
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r3 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
        L_0x00de:
            X.0qQ.A07(r3)
            java.lang.Long r3 = X.C71119OdD.A01(r3)
            boolean r12 = X.C71119OdD.A03(r9, r2, r3, r0)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r9 = r2.content_
            if (r9 != 0) goto L_0x00ef
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r9 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x00ef:
            int r7 = r9.addMessageContentCase_
            if (r7 != r11) goto L_0x0113
            java.lang.Object r7 = r9.addMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.Collection r7 = (com.instagram.direct.armadilloexpress.transportpayload.Collection) r7
        L_0x00f7:
            X.TnY r7 = r7.media_
            java.util.Iterator r9 = r7.iterator()
        L_0x00fd:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x0116
            java.lang.Object r7 = X.AnonymousClass7TF.A0a(r9)
            com.instagram.direct.armadilloexpress.transportpayload.Media r7 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r7
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r7 = X.C71119OdD.A00(r7, r1)
            if (r7 == 0) goto L_0x00fd
            r4.add(r7)
            goto L_0x00fd
        L_0x0113:
            com.instagram.direct.armadilloexpress.transportpayload.Collection r7 = com.instagram.direct.armadilloexpress.transportpayload.Collection.DEFAULT_INSTANCE
            goto L_0x00f7
        L_0x0116:
            com.facebook.wamsys.wce.MessageBackupDirective r7 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            X.OZ8 r7 = X.OZ8.A00
            java.util.List r17 = r7.A01(r2, r0)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r15)
            r15 = 0
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r18 = r4
            r19 = r3
            r22 = r15
            r12 = r0
            r13 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x03c2
        L_0x013e:
            com.instagram.direct.armadilloexpress.transportpayload.Media r8 = r14.A0L()
            int r7 = r8.mediaCase_
            if (r7 != r12) goto L_0x0158
            com.instagram.direct.armadilloexpress.transportpayload.Raven r7 = r8.A0M()
            X.Nmx r8 = r7.A0L()
            X.Nmx r7 = X.C69515Nmx.RAVEN_VIEW_MODEL_ONCE
            if (r8 == r7) goto L_0x0156
            X.Nmx r7 = X.C69515Nmx.RAVEN_VIEW_MODEL_REPLAYABLE
            if (r8 != r7) goto L_0x0158
        L_0x0156:
            r16 = 6
        L_0x0158:
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r7 = r2.metadata_
            if (r7 != 0) goto L_0x015e
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
        L_0x015e:
            X.0qQ.A07(r7)
            java.lang.Long r7 = X.C71119OdD.A01(r7)
            boolean r14 = X.C71119OdD.A03(r9, r2, r7, r0)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r8 = r2.content_
            if (r8 != 0) goto L_0x0173
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r8 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x0173:
            com.instagram.direct.armadilloexpress.transportpayload.Media r8 = r8.A0L()
            X.0qQ.A07(r8)
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r8 = X.C71119OdD.A00(r8, r1)
            if (r8 == 0) goto L_0x0183
            r11.add(r8)
        L_0x0183:
            X.OZ8 r8 = X.OZ8.A00
            java.util.List r8 = r8.A01(r2, r0)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = r2.content_
            if (r0 != 0) goto L_0x018f
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x018f:
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = r0.A0L()
            int r0 = r0.mediaCase_
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r12)
            r20 = 0
            if (r0 == 0) goto L_0x01c0
            X.17i r2 = X.17h.A00(r9)
            java.lang.String r0 = r9.A06
            com.instagram.user.model.User r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x01b7
            java.lang.Long r0 = r0.BST()
            if (r0 == 0) goto L_0x01b7
            long r12 = r0.longValue()
            int r0 = (r12 > r32 ? 1 : (r12 == r32 ? 0 : -1))
            if (r0 == 0) goto L_0x01c0
        L_0x01b7:
            java.util.ArrayList r8 = X.00k.A0U(r8)
            java.lang.String r0 = "UNREAD_RAVEN"
            r8.add(r0)
        L_0x01c0:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r17 = 0
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r14)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01d2
            r20 = r11
        L_0x01d2:
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r15)
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r19 = r8
            r21 = r7
            r24 = r17
            r14 = r0
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03c2
        L_0x01e9:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r3 = r2.metadata_
            if (r3 != 0) goto L_0x01f3
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r3 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
        L_0x01f3:
            X.0qQ.A07(r3)
            java.lang.Long r3 = X.C71119OdD.A01(r3)
            boolean r13 = X.C71119OdD.A03(r9, r2, r3, r0)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r9 = r2.content_
            if (r9 != 0) goto L_0x0204
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r9 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x0204:
            int r7 = r9.addMessageContentCase_
            if (r7 != r12) goto L_0x026e
            java.lang.Object r7 = r9.addMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.Link r7 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r7
        L_0x020c:
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r9 = r7.linkContext_
            if (r9 != 0) goto L_0x0212
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r9 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE
        L_0x0212:
            int r7 = r9.bitField0_
            r7 = r7 & 32
            if (r7 == 0) goto L_0x0240
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r7 = r9.linkPreviewThumbnail_
            if (r7 != 0) goto L_0x0220
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r7 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
            if (r7 == 0) goto L_0x0240
        L_0x0220:
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r7 = r7.mediaTransport_
            if (r7 != 0) goto L_0x0226
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r7 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0226:
            java.lang.String r11 = r7.objectId_
            java.lang.String r9 = r7.mimetype_
            r19 = 0
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r7 = new com.facebook.wamsys.wce.EncryptedBackupsAttachment
            r17 = r11
            r18 = r9
            r20 = r19
            r21 = r19
            r22 = r19
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r4.add(r7)
        L_0x0240:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r17 = 0
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r13)
            X.OZ8 r7 = X.OZ8.A00
            java.util.List r19 = r7.A01(r2, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0257
            r4 = 0
        L_0x0257:
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r15)
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r20 = r4
            r21 = r3
            r24 = r17
            r14 = r0
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03c2
        L_0x026e:
            com.instagram.direct.armadilloexpress.transportpayload.Link r7 = com.instagram.direct.armadilloexpress.transportpayload.Link.DEFAULT_INSTANCE
            goto L_0x020c
        L_0x0271:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r4 = r2.content_
            if (r4 != 0) goto L_0x027b
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r4 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x027b:
            com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma r4 = r4.A0M()
            com.instagram.direct.armadilloexpress.transportpayload.Media r4 = r4.media_
            if (r4 != 0) goto L_0x0285
            com.instagram.direct.armadilloexpress.transportpayload.Media r4 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
        L_0x0285:
            X.0qQ.A07(r4)
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r4 = X.C71119OdD.A00(r4, r1)
            if (r4 == 0) goto L_0x0291
            r3.add(r4)
        L_0x0291:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            r19 = 0
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r17)
            X.OZ8 r4 = X.OZ8.A00
            java.util.List r21 = r4.A01(r2, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02a8
            r3 = 0
        L_0x02a8:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r15)
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r22 = r3
            r23 = r7
            r26 = r19
            r16 = r0
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x03c2
        L_0x02c1:
            if (r1 != r8) goto L_0x0303
            java.lang.Object r1 = r14.transportPayload_
            com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload r1 = (com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload) r1
            X.0qQ.A07(r1)
            boolean r3 = r14.openEb_
            boolean r2 = r14.isE2EeAttributed_
            r4 = 1
            if (r0 == r5) goto L_0x02d4
            if (r0 == r8) goto L_0x02d4
            r4 = 0
        L_0x02d4:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x03a8
            java.lang.String r1 = r1.messageOtid_
            if (r1 == 0) goto L_0x03a8
            com.facebook.wamsys.wce.MessageBackupDirective r0 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class
            r0 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r14 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r2)
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r11 = r0
            r12 = r1
            r16 = r14
            r17 = r14
            r18 = r14
            r21 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x03c2
        L_0x0303:
            r11 = 3
            if (r1 != r11) goto L_0x03af
            X.OdD r13 = X.C71119OdD.A00
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r12 = X.C66580MXl.A0S(r14)
            boolean r7 = r14.openEb_
            boolean r2 = r14.isE2EeAttributed_
            int r1 = r12.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x03af
            java.lang.String r1 = r12.targetMessageOtid_
            if (r1 == 0) goto L_0x03af
            java.lang.String r14 = r13.A04(r9, r12, r3)
            if (r14 == 0) goto L_0x03af
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r4 = r12.content_
            if (r4 != 0) goto L_0x0326
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r4 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE
        L_0x0326:
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r9 = r4.A0L()
            java.lang.String r3 = r9.mimetype_
            int r3 = X.C66580MXl.A06(r3)
            if (r3 == 0) goto L_0x03a5
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r3 = r4.A0L()
            java.lang.String r3 = r3.objectId_
            int r3 = X.C66580MXl.A06(r3)
            if (r3 == 0) goto L_0x03a5
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r3 = com.facebook.wamsys.wce.EncryptedBackupsAttachment.$redex_init_class
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r3 = r4.A0L()
            java.lang.String r4 = r3.objectId_
            java.lang.String r3 = r3.mimetype_
            r18 = 0
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r15 = new com.facebook.wamsys.wce.EncryptedBackupsAttachment
            r19 = r18
            r20 = r18
            r21 = r18
            r16 = r4
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.util.List r17 = X.AnonymousClass7TE.A1I(r15)
        L_0x035d:
            r12 = 1
            if (r0 == r5) goto L_0x0363
            if (r0 == r8) goto L_0x0363
            r12 = 0
        L_0x0363:
            X.OZ8 r3 = X.OZ8.A00
            r4 = 0
            java.util.List r6 = r3.A01(r4, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            boolean r0 = r9.seen_
            if (r0 == 0) goto L_0x0397
            java.lang.String r0 = "UNREAD_RAVEN"
            r3.add(r0)
        L_0x0377:
            com.facebook.wamsys.wce.MessageBackupDirective r0 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r12)
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r2)
            com.facebook.wamsys.wce.MessageBackupDirective r0 = new com.facebook.wamsys.wce.MessageBackupDirective
            r11 = r0
            r12 = r1
            r16 = r6
            r18 = r4
            r21 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x03c2
        L_0x0397:
            boolean r0 = r9.replayed_
            if (r0 == 0) goto L_0x0377
            java.util.ArrayList r6 = X.00k.A0U(r6)
            java.lang.String r0 = "RAVEN_REPLAYED"
            r6.add(r0)
            goto L_0x0377
        L_0x03a5:
            r17 = 0
            goto L_0x035d
        L_0x03a8:
            java.lang.String r1 = "ArmadilloExpressBackupGeneratorForProtoBufferTransport"
            java.lang.String r0 = "Delete message backup directive can't be created without a valid target message OTID"
            X.0KC.A0C(r1, r0)
        L_0x03af:
            X.NEf r0 = new X.NEf
            r0.<init>(r6)
            goto L_0x03c2
        L_0x03b5:
            r2 = move-exception
            java.lang.String r1 = "ArmadilloExpressBackupGeneratorForProtoBufferTransport"
            java.lang.String r0 = "Failed to parse protobuf to create backup directive"
            X.0KC.A0F(r1, r0, r2)
            X.NEf r0 = new X.NEf
            r0.<init>(r6)
        L_0x03c2:
            java.lang.Number r1 = r0.getActionType()
            boolean r1 = X.C66583MXo.A1W(r5, r1)
            if (r1 == 0) goto L_0x03d7
            java.lang.String r1 = "CreateMessageBackupDirective generates no-op"
            X.0KC.A0C(r10, r1)
            return r0
        L_0x03d2:
            X.NEf r0 = new X.NEf
            r0.<init>(r6)
        L_0x03d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.IGBackupUpdateGeneratorPluginImplPostmailbox.IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirective(com.facebook.msys.mci.PrivacyContext, long, java.lang.String, long, int, java.lang.Number, java.lang.Object, byte[]):com.facebook.wamsys.wce.MessageBackupDirective");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGBackupUpdateGeneratorPluginImplPostmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession2) {
        super(accountSession, msysActiveUserSession2);
        AnonymousClass7TG.A1O(accountSession, msysActiveUserSession2);
        this.msysActiveUserSession = msysActiveUserSession2;
    }
}
