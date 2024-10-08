package com.instagram.notifications.push.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;

public final class FcmListenerService extends FirebaseMessagingService {
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x035b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0377, code lost:
        if (r0 != null) goto L_0x0388;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.google.firebase.messaging.RemoteMessage r26) {
        /*
            r25 = this;
            r23 = r26
            java.util.Map r1 = r23.A02()
            java.lang.String r0 = "data"
            java.lang.String r0 = X.DbT.A11(r0, r1)
            r6 = 0
            if (r0 == 0) goto L_0x004a
            byte[] r12 = X.C66582MXn.A1a(r0)
        L_0x0013:
            com.facebook.pushlite.model.PushInfraMetaData$Companion r1 = com.facebook.pushlite.model.PushInfraMetaData.Companion
            r0 = r23
            com.facebook.pushlite.model.PushInfraMetaData r9 = r1.A02(r0)
            r24 = r25
            if (r9 == 0) goto L_0x0317
            java.lang.String r13 = r9.A02
            java.lang.String r3 = r9.A04
            java.lang.String r11 = r9.A03
            if (r13 == 0) goto L_0x0317
            if (r11 == 0) goto L_0x0317
            if (r3 == 0) goto L_0x0317
            X.0Tu r2 = X.0Tu.A05
            r0 = 18306688213853279(0x4109d60000245f, double:1.895587328056122E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0317
            boolean r0 = X.C282435Db.A01(r9)
            if (r0 == 0) goto L_0x004c
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            java.lang.String r1 = r0.toString()
            r0 = 17
            X.C67295MlU.A01(r9, r1, r0)
            goto L_0x004c
        L_0x004a:
            r12 = r6
            goto L_0x0013
        L_0x004c:
            X.96w r0 = X.C3737796w.A00(r24)     // Catch:{ Exception -> 0x0308 }
            java.security.KeyPair r1 = r0.A01(r3)     // Catch:{ NotFoundException -> 0x02fa }
            java.security.PublicKey r0 = r1.getPublic()     // Catch:{ Exception -> 0x0308 }
            boolean r0 = r0 instanceof java.security.interfaces.ECPublicKey     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02f2
            java.security.PublicKey r14 = r1.getPublic()     // Catch:{ Exception -> 0x0308 }
            java.security.interfaces.ECPublicKey r14 = (java.security.interfaces.ECPublicKey) r14     // Catch:{ Exception -> 0x0308 }
            java.security.spec.ECPoint r0 = r14.getW()     // Catch:{ Exception -> 0x0308 }
            X.AnonymousClass9E6.A00(r0)     // Catch:{ Exception -> 0x0308 }
            java.security.PrivateKey r0 = r1.getPrivate()     // Catch:{ Exception -> 0x0308 }
            boolean r0 = r0 instanceof java.security.interfaces.ECPrivateKey     // Catch:{ Exception -> 0x0308 }
            if (r0 == 0) goto L_0x02ea
            java.security.PrivateKey r10 = r1.getPrivate()     // Catch:{ Exception -> 0x0308 }
            java.security.interfaces.ECPrivateKey r10 = (java.security.interfaces.ECPrivateKey) r10     // Catch:{ Exception -> 0x0308 }
            r2 = 16
            long r7 = java.lang.Long.parseLong(r13, r2)     // Catch:{ Exception -> 0x02e8 }
            r4 = 255(0xff, double:1.26E-321)
            r0 = 8
            long r0 = r7 >> r0
            long r4 = r4 & r0
            long r2 = r7 >> r2
            r16 = 65535(0xffff, double:3.23786E-319)
            long r2 = r2 & r16
            r0 = 32
            long r0 = r7 >> r0
            long r0 = r0 & r16
            r15 = 48
            long r7 = r7 >> r15
            long r7 = r7 & r16
            int r15 = (int) r4     // Catch:{ Exception -> 0x02e8 }
            byte r4 = (byte) r15     // Catch:{ Exception -> 0x02e8 }
            java.util.HashMap r5 = X.AnonymousClass9E7.A01     // Catch:{ Exception -> 0x02e8 }
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch:{ Exception -> 0x02e8 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ Exception -> 0x02e8 }
            X.9E7 r4 = (X.AnonymousClass9E7) r4     // Catch:{ Exception -> 0x02e8 }
            if (r4 == 0) goto L_0x02d8
            int r5 = (int) r2     // Catch:{ Exception -> 0x02e8 }
            java.util.HashMap r2 = X.AnonymousClass9EA.A03     // Catch:{ Exception -> 0x02e8 }
            java.lang.Object r2 = X.C51968G9o.A0z(r2, r5)     // Catch:{ Exception -> 0x02e8 }
            X.9EA r2 = (X.AnonymousClass9EA) r2     // Catch:{ Exception -> 0x02e8 }
            if (r2 == 0) goto L_0x02d0
            int r3 = (int) r0     // Catch:{ Exception -> 0x02e8 }
            java.util.HashMap r0 = X.AnonymousClass9E9.A02     // Catch:{ Exception -> 0x02e8 }
            java.lang.Object r3 = X.C51968G9o.A0z(r0, r3)     // Catch:{ Exception -> 0x02e8 }
            X.9E9 r3 = (X.AnonymousClass9E9) r3     // Catch:{ Exception -> 0x02e8 }
            if (r3 == 0) goto L_0x02c8
            int r1 = (int) r7     // Catch:{ Exception -> 0x02e8 }
            java.util.HashMap r0 = X.AnonymousClass9E8.A02     // Catch:{ Exception -> 0x02e8 }
            java.lang.Object r5 = X.C51968G9o.A0z(r0, r1)     // Catch:{ Exception -> 0x02e8 }
            X.9E8 r5 = (X.AnonymousClass9E8) r5     // Catch:{ Exception -> 0x02e8 }
            if (r5 == 0) goto L_0x02e0
            byte[] r0 = X.C66582MXn.A1a(r11)     // Catch:{ Exception -> 0x0308 }
            r1 = 0
            byte[] r7 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x0308 }
            if (r12 != 0) goto L_0x00d4
            goto L_0x0316
        L_0x00d4:
            byte[] r18 = android.util.Base64.decode(r12, r1)     // Catch:{ Exception -> 0x0308 }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x0308 }
            r22 = r0
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x0308 }
            r21 = r0
            int r8 = r2.A02     // Catch:{ Exception -> 0x0308 }
            r0 = 1
            if (r8 != r0) goto L_0x00eb
            X.NNZ r17 = new X.NNZ     // Catch:{ Exception -> 0x0308 }
            r17.<init>()     // Catch:{ Exception -> 0x0308 }
            goto L_0x00f3
        L_0x00eb:
            r0 = 2
            if (r8 != r0) goto L_0x02b9
            X.NNa r17 = new X.NNa     // Catch:{ Exception -> 0x0308 }
            r17.<init>()     // Catch:{ Exception -> 0x0308 }
        L_0x00f3:
            int r0 = r3.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r20 = r0
            r11 = 16
            if (r0 != r11) goto L_0x02a2
            int r0 = r5.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r19 = r0
            r11 = 1
            if (r0 != r11) goto L_0x029a
            int r0 = r7.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r13 = 65
            if (r0 != r13) goto L_0x0292
            byte r11 = r7[r1]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0 = 4
            if (r11 != r0) goto L_0x028a
            r11 = 33
            r12 = 1
            byte[] r0 = java.util.Arrays.copyOfRange(r7, r12, r11)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r13 = java.util.Arrays.copyOfRange(r7, r11, r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.math.BigInteger r11 = new java.math.BigInteger     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r11.<init>(r12, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0.<init>(r12, r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.security.spec.ECPoint r13 = new java.security.spec.ECPoint     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r13.<init>(r11, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            X.AnonymousClass9E6.A00(r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            X.AnonymousClass9E6.A00(r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.security.spec.ECParameterSpec r0 = X.AnonymousClass9E6.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.security.spec.ECPublicKeySpec r11 = new java.security.spec.ECPublicKeySpec     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r11.<init>(r13, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.security.PublicKey r11 = r0.generatePublic(r11)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.security.interfaces.ECPublicKey r11 = (java.security.interfaces.ECPublicKey) r11     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.lang.String r0 = "ECDH"
            javax.crypto.KeyAgreement r0 = javax.crypto.KeyAgreement.getInstance(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            if (r0 == 0) goto L_0x02aa
            r0.init(r10)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0.doPhase(r11, r12)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r15 = r0.generateSecret()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.security.spec.ECPoint r0 = r14.getW()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.AnonymousClass9E6.A01(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r16 = 2
            byte[][] r0 = new byte[][]{r7, r0}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r11 = X.C71060Oae.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r7 = X.C71060Oae.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A00(r20)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[][] r0 = new byte[][]{r7, r0}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r10 = X.C71060Oae.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            int r13 = r3.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r12 = X.C71060Oae.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[][] r0 = new byte[][]{r12, r10, r0, r15}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r3 = X.C71060Oae.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0 = 32
            byte[] r0 = new byte[r0]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.lang.String r7 = "HmacSHA256"
            byte[] r0 = X.C66582MXn.A1b(r0, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r3.<init>(r0, r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r11 = X.C71060Oae.A01(r3, r0, r11, r10, r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.O5L.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte r14 = r4.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            if (r14 != 0) goto L_0x0283
            byte[] r13 = new byte[r1]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = new byte[r1]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            int r10 = r2.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            int r4 = r2.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            int r2 = r5.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r15 = X.C71060Oae.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r5 = X.C71060Oae.A00(r20)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r3 = X.C71060Oae.A00(r19)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r8 = X.C71060Oae.A00(r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[][] r3 = new byte[][]{r15, r5, r3, r8}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r3 = X.C71060Oae.A02(r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r5 = new byte[r2]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r8 = X.O5L.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[][] r0 = new byte[][]{r12, r3, r8, r0}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r5 = X.C66582MXn.A1b(r5, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r8 = X.O5L.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0 = r22
            byte[][] r0 = new byte[][]{r12, r3, r8, r0}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r2 = X.C66582MXn.A1b(r2, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0.write(r14)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0.write(r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r0.write(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r5 = r0.toByteArray()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.O5L.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[][] r0 = new byte[][]{r12, r3, r0, r13}     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A02(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C66582MXn.A1b(r11, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r2.<init>(r0, r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.O5L.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r8 = X.C71060Oae.A01(r2, r0, r5, r3, r10)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.O5L.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r0 = X.C71060Oae.A01(r2, r0, r5, r3, r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            int r4 = r0.length     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r5 = new byte[r4]     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            byte[] r7 = new byte[r4]     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r3 = 0
            java.lang.System.arraycopy(r0, r1, r7, r1, r4)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
        L_0x0216:
            if (r3 >= r4) goto L_0x0223
            byte r2 = r7[r3]     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            byte r0 = r5[r3]     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r2 = r2 ^ r0
            byte r0 = (byte) r2     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r7[r3] = r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            int r3 = r3 + 1
            goto L_0x0216
        L_0x0223:
            int r2 = r8.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r0 = r17
            int r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            if (r2 != r0) goto L_0x026b
            r0 = 12
            if (r4 != r0) goto L_0x0277
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r4.<init>(r8, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r3 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r3.<init>(r0, r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r0 = r16
            r2.init(r0, r4, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r0 = r21
            r2.updateAAD(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r0 = r18
            byte[] r12 = r2.doFinal(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r4 = 11
            r3 = 0
        L_0x0255:
            byte r2 = r5[r4]     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r0 = -1
            if (r2 == r0) goto L_0x0260
            int r0 = r2 + 1
            byte r0 = (byte) r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r5[r4] = r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            goto L_0x0263
        L_0x0260:
            r5[r4] = r1     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            goto L_0x0264
        L_0x0263:
            r3 = 1
        L_0x0264:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0317
            if (r3 != 0) goto L_0x0317
            goto L_0x0255
        L_0x026b:
            java.lang.String r0 = "Key has invalid length: "
            java.lang.String r0 = X.002.A0O(r0, r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r1.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            goto L_0x0282
        L_0x0277:
            java.lang.String r0 = "Nonce has invalid length: "
            java.lang.String r0 = X.002.A0O(r0, r4)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
            r1.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
        L_0x0282:
            throw r1     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x02c1 }
        L_0x0283:
            java.lang.String r0 = "Only mode_base is supported"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            goto L_0x02b1
        L_0x028a:
            java.lang.String r0 = "Only uncompressed point format accepted"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            goto L_0x02b1
        L_0x0292:
            java.lang.String r0 = "Point does not match P256 EC field size"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            goto L_0x02b1
        L_0x029a:
            java.lang.String r0 = "Only HKDF-SHA256 is supported."
            X.NnB r1 = new X.NnB     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            goto L_0x02b1
        L_0x02a2:
            java.lang.String r0 = "Only DHKEM_P256_SHA256 is supported."
            X.NnB r1 = new X.NnB     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            goto L_0x02b1
        L_0x02aa:
            java.lang.String r0 = "Could not get instance of KeyAgreement for algorithm ECDH."
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
        L_0x02b1:
            throw r1     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x02b2 }
        L_0x02b2:
            r0 = move-exception
            X.NnB r1 = new X.NnB     // Catch:{ Exception -> 0x0308 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0308 }
            goto L_0x02c7
        L_0x02b9:
            java.lang.String r0 = "Only AES256GCM or AES128GCM are supported."
            X.NnB r1 = new X.NnB     // Catch:{ Exception -> 0x0308 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0308 }
            goto L_0x02c7
        L_0x02c1:
            r0 = move-exception
            X.NnB r1 = new X.NnB     // Catch:{ Exception -> 0x0308 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0308 }
        L_0x02c7:
            throw r1     // Catch:{ Exception -> 0x0308 }
        L_0x02c8:
            java.lang.String r0 = "Algorithm kdf does not exist for value"
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x02e8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02e8 }
            goto L_0x02e7
        L_0x02d0:
            java.lang.String r0 = "Algorithm aead does not exist for value"
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x02e8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02e8 }
            goto L_0x02e7
        L_0x02d8:
            java.lang.String r0 = "Algorithm mode does not exist for value"
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x02e8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02e8 }
            goto L_0x02e7
        L_0x02e0:
            java.lang.String r0 = "Algorithm kdf does not exist for value"
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x02e8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02e8 }
        L_0x02e7:
            throw r1     // Catch:{ Exception -> 0x02e8 }
        L_0x02e8:
            r2 = move-exception
            goto L_0x02fc
        L_0x02ea:
            java.lang.String r1 = "Key retrieved from keystore is not an ECPrivateKey"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ Exception -> 0x0308 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0308 }
            throw r0     // Catch:{ Exception -> 0x0308 }
        L_0x02f2:
            java.lang.String r1 = "Key retrieved from keystore is not an ECPublicKey"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ Exception -> 0x0308 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0308 }
            throw r0     // Catch:{ Exception -> 0x0308 }
        L_0x02fa:
            r1 = move-exception
            goto L_0x0307
        L_0x02fc:
            java.lang.String r0 = "Error parsing ciphersuite string: "
            java.lang.String r0 = X.002.A0R(r0, r13)     // Catch:{ Exception -> 0x0308 }
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x0308 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0308 }
        L_0x0307:
            throw r1     // Catch:{ Exception -> 0x0308 }
        L_0x0308:
            r2 = move-exception
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            java.lang.String r1 = r0.toString()
            r0 = 18
            X.C67295MlU.A00(r9, r2, r1, r0)
            r12 = 0
            goto L_0x0317
        L_0x0316:
            r12 = 0
        L_0x0317:
            if (r9 == 0) goto L_0x0360
            java.lang.String r1 = r9.A01
            if (r1 == 0) goto L_0x0360
            java.lang.String r0 = "zstd"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0360
            X.0Tu r2 = X.0Tu.A05
            r0 = 18306688213918816(0x4109d600012460, double:1.8955873280820255E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0360
            boolean r0 = X.C282435Db.A01(r9)     // Catch:{ Exception -> 0x037a }
            if (r0 == 0) goto L_0x0343
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM     // Catch:{ Exception -> 0x037a }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x037a }
            r0 = 20
            X.C67295MlU.A01(r9, r1, r0)     // Catch:{ Exception -> 0x037a }
        L_0x0343:
            if (r12 == 0) goto L_0x0386
            com.facebook.zstd.ZstdInputStream r0 = com.facebook.zstd.ZstdInputStream.$redex_init_class     // Catch:{ Exception -> 0x037a }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x037a }
            r0.<init>(r12)     // Catch:{ Exception -> 0x037a }
            com.facebook.zstd.ZstdInputStream r2 = new com.facebook.zstd.ZstdInputStream     // Catch:{ Exception -> 0x037a }
            r2.<init>(r0)     // Catch:{ Exception -> 0x037a }
            byte[] r12 = X.C11108SAj.A01(r2)     // Catch:{ all -> 0x0359 }
            r2.close()     // Catch:{ Exception -> 0x037a }
            goto L_0x0360
        L_0x0359:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x035b }
        L_0x035b:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x037a }
            throw r0     // Catch:{ Exception -> 0x037a }
        L_0x0360:
            if (r12 == 0) goto L_0x0386
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x0386 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0386 }
            r1.<init>(r12, r0)     // Catch:{ IOException -> 0x0386 }
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM     // Catch:{ IOException -> 0x0386 }
            java.lang.String r0 = X.AnonymousClass3FH.A00(r0)     // Catch:{ IOException -> 0x0386 }
            X.5HJ r6 = X.AnonymousClass5HJ.A01(r1, r0)     // Catch:{ IOException -> 0x0386 }
            if (r6 == 0) goto L_0x0386
            java.lang.String r0 = r6.A0j
            if (r0 != 0) goto L_0x0388
            goto L_0x0386
        L_0x037a:
            r2 = move-exception
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            java.lang.String r1 = r0.toString()
            r0 = 21
            X.C67295MlU.A00(r9, r2, r1, r0)
        L_0x0386:
            java.lang.String r0 = ""
        L_0x0388:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass5HM.A00(r0)
            X.1wA r0 = X.AnonymousClass1w6.A00
            if (r0 != 0) goto L_0x039c
            X.0fA r2 = X.AnonymousClass1w6.A01
            if (r2 == 0) goto L_0x039c
            r1 = 817901599(0x30c0301f, float:1.3983515E-9)
            java.lang.String r0 = "PushManager was not initialized before access"
            r2.AEf(r0, r1)
        L_0x039c:
            X.1wA r0 = X.AnonymousClass1w6.A00
            r1 = 0
            if (r0 == 0) goto L_0x03c1
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.MZw r2 = (X.MZw) r2
            if (r2 == 0) goto L_0x03c1
            r0 = r23
            com.facebook.pushlite.model.PushInfraMetaData r7 = r2.A03(r0)
        L_0x03b1:
            if (r3 == 0) goto L_0x03c3
            X.0Tu r0 = X.0Tu.A05
            r4 = 36321335831962908(0x810a100008251c, double:3.0330972621889975E-306)
            boolean r0 = X.182.A06(r0, r3, r4)
            if (r0 == 0) goto L_0x03c3
            return
        L_0x03c1:
            r7 = r1
            goto L_0x03b1
        L_0x03c3:
            if (r6 == 0) goto L_0x03c7
            java.lang.String r1 = r6.A0j
        L_0x03c7:
            X.69F r4 = X.AnonymousClass69E.A00(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            long r1 = r4.ExJ(r0)
            java.lang.String r0 = "FcmListenerService"
            r4.Eac(r0, r1)
            if (r6 == 0) goto L_0x03db
            X.MZZ.A00(r6, r1)
        L_0x03db:
            if (r7 == 0) goto L_0x03e4
            java.lang.String r0 = r7.A07
            if (r0 == 0) goto L_0x03e4
            r4.EhU(r0, r1)
        L_0x03e4:
            r5 = 1
            if (r7 == 0) goto L_0x03f6
            java.lang.Long r0 = r7.A00
            r7 = 52
            if (r0 == 0) goto L_0x03f6
            long r1 = r0.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            int r0 = r23.A01()
            if (r0 != r5) goto L_0x0459
            if (r3 == 0) goto L_0x0459
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325252841812763(0x810da00003331b, double:3.0355743949905785E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0459
            X.0wX r7 = X.C61170le.A00
            java.lang.Class<X.OTq> r4 = X.C70969OTq.class
            r2 = 43
            X.G2g r1 = new X.G2g
            r0 = r24
            r1.<init>(r0, r2)
            java.lang.Object r4 = r7.A01(r4, r1)
            X.OTq r4 = (X.C70969OTq) r4
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0459
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0459
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "ForegroundEligibilityStatus"
            java.lang.String r0 = "High priority FCM received. Timer started for start foreground service safety eligibility."
            r2.A00(r1, r0)
            r4.A00 = r5
            X.0eM r2 = r4.A05
            android.os.Handler r1 = X.JTO.A0E(r2)
            java.lang.Runnable r0 = r4.A02
            r1.removeCallbacks(r0)
            android.os.Handler r0 = X.JTO.A0E(r2)
            java.lang.Runnable r1 = r4.A03
            r0.removeCallbacks(r1)
            boolean r0 = X.C70969OTq.A00(r4)
            if (r0 == 0) goto L_0x04ad
            r1.run()
        L_0x044e:
            boolean r0 = X.C70969OTq.A00(r4)
            if (r0 == 0) goto L_0x04a3
            java.lang.Runnable r0 = r4.A01
            r0.run()
        L_0x0459:
            java.util.Map r1 = r23.A02()
            java.lang.String r0 = "message_type"
            java.lang.String r4 = X.DbT.A11(r0, r1)
            if (r6 == 0) goto L_0x04a1
            java.lang.String r0 = r6.A0N
        L_0x0467:
            if (r4 != 0) goto L_0x046a
            r4 = r0
        L_0x046a:
            if (r6 == 0) goto L_0x0480
            int r0 = r23.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0I = r0
            int r0 = r23.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0H = r0
        L_0x0480:
            if (r3 == 0) goto L_0x04b5
            boolean r0 = X.AnonymousClass5HM.A01(r3)
            if (r0 == 0) goto L_0x04b5
            X.0eM r0 = X.MZr.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36320360874123618(0x81092d00042162, double:3.0324806949255904E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x04b5
            X.OMX r1 = X.O1Q.A00(r3)
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            r1.A00(r6, r0, r4)
            return
        L_0x04a1:
            r0 = 0
            goto L_0x0467
        L_0x04a3:
            android.os.Handler r1 = X.JTO.A0E(r2)
            java.lang.Runnable r0 = r4.A01
            r1.post(r0)
            goto L_0x0459
        L_0x04ad:
            android.os.Handler r0 = X.JTO.A0E(r2)
            r0.post(r1)
            goto L_0x044e
        L_0x04b5:
            X.1XZ r1 = X.AnonymousClass3F2.A00()
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            r1.A08(r6, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.push.fcm.FcmListenerService.A04(com.google.firebase.messaging.RemoteMessage):void");
    }
}
