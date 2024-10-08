package X;

import android.graphics.Bitmap;
import android.util.Size;

public final class MGX extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGX(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGX, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGX, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGX, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r3 = new X.MGX(r1, r6, r0);
        r3.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        return new X.MGX(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
        return new X.MGX(r2, r1, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0015;
                case 2: goto L_0x0019;
                case 3: goto L_0x001d;
                case 4: goto L_0x0021;
                case 5: goto L_0x00dd;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00fd;
                case 11: goto L_0x0104;
                case 12: goto L_0x010b;
                case 13: goto L_0x0117;
                case 14: goto L_0x011e;
                case 15: goto L_0x0025;
                case 16: goto L_0x002a;
                case 17: goto L_0x002f;
                case 18: goto L_0x0034;
                case 19: goto L_0x0039;
                case 20: goto L_0x003e;
                case 21: goto L_0x0043;
                case 22: goto L_0x0048;
                case 23: goto L_0x004d;
                case 24: goto L_0x0052;
                case 25: goto L_0x0057;
                case 26: goto L_0x005c;
                case 27: goto L_0x0061;
                case 28: goto L_0x0066;
                case 29: goto L_0x006b;
                case 30: goto L_0x0070;
                case 31: goto L_0x0075;
                case 32: goto L_0x007a;
                case 33: goto L_0x007f;
                case 34: goto L_0x0084;
                case 35: goto L_0x0089;
                case 36: goto L_0x008f;
                case 37: goto L_0x0095;
                case 38: goto L_0x009b;
                case 39: goto L_0x00a1;
                case 40: goto L_0x00a7;
                case 41: goto L_0x00ad;
                case 42: goto L_0x00b3;
                case 43: goto L_0x00b9;
                case 44: goto L_0x00bf;
                case 45: goto L_0x00c5;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A02
            r0 = 49
        L_0x0009:
            X.MGX r3 = new X.MGX
            r3.<init>(r1, r6, r0)
            r3.A00 = r5
            return r3
        L_0x0011:
            java.lang.Object r1 = r4.A02
            r0 = 0
            goto L_0x0009
        L_0x0015:
            java.lang.Object r1 = r4.A02
            r0 = 1
            goto L_0x0009
        L_0x0019:
            java.lang.Object r1 = r4.A02
            r0 = 2
            goto L_0x0009
        L_0x001d:
            java.lang.Object r1 = r4.A02
            r0 = 3
            goto L_0x0009
        L_0x0021:
            java.lang.Object r1 = r4.A02
            r0 = 4
            goto L_0x0009
        L_0x0025:
            java.lang.Object r1 = r4.A02
            r0 = 15
            goto L_0x0009
        L_0x002a:
            java.lang.Object r1 = r4.A02
            r0 = 16
            goto L_0x0009
        L_0x002f:
            java.lang.Object r1 = r4.A02
            r0 = 17
            goto L_0x0009
        L_0x0034:
            java.lang.Object r1 = r4.A02
            r0 = 18
            goto L_0x0009
        L_0x0039:
            java.lang.Object r1 = r4.A02
            r0 = 19
            goto L_0x0009
        L_0x003e:
            java.lang.Object r1 = r4.A02
            r0 = 20
            goto L_0x0009
        L_0x0043:
            java.lang.Object r1 = r4.A02
            r0 = 21
            goto L_0x0009
        L_0x0048:
            java.lang.Object r1 = r4.A02
            r0 = 22
            goto L_0x0009
        L_0x004d:
            java.lang.Object r1 = r4.A02
            r0 = 23
            goto L_0x0009
        L_0x0052:
            java.lang.Object r1 = r4.A02
            r0 = 24
            goto L_0x0009
        L_0x0057:
            java.lang.Object r1 = r4.A02
            r0 = 25
            goto L_0x0009
        L_0x005c:
            java.lang.Object r1 = r4.A02
            r0 = 26
            goto L_0x0009
        L_0x0061:
            java.lang.Object r1 = r4.A02
            r0 = 27
            goto L_0x0009
        L_0x0066:
            java.lang.Object r1 = r4.A02
            r0 = 28
            goto L_0x0009
        L_0x006b:
            java.lang.Object r1 = r4.A02
            r0 = 29
            goto L_0x0009
        L_0x0070:
            java.lang.Object r1 = r4.A02
            r0 = 30
            goto L_0x0009
        L_0x0075:
            java.lang.Object r1 = r4.A02
            r0 = 31
            goto L_0x0009
        L_0x007a:
            java.lang.Object r1 = r4.A02
            r0 = 32
            goto L_0x0009
        L_0x007f:
            java.lang.Object r1 = r4.A02
            r0 = 33
            goto L_0x0009
        L_0x0084:
            java.lang.Object r1 = r4.A02
            r0 = 34
            goto L_0x0009
        L_0x0089:
            java.lang.Object r1 = r4.A02
            r0 = 35
            goto L_0x0009
        L_0x008f:
            java.lang.Object r1 = r4.A02
            r0 = 36
            goto L_0x0009
        L_0x0095:
            java.lang.Object r1 = r4.A02
            r0 = 37
            goto L_0x0009
        L_0x009b:
            java.lang.Object r1 = r4.A02
            r0 = 38
            goto L_0x0009
        L_0x00a1:
            java.lang.Object r1 = r4.A02
            r0 = 39
            goto L_0x0009
        L_0x00a7:
            java.lang.Object r1 = r4.A02
            r0 = 40
            goto L_0x0009
        L_0x00ad:
            java.lang.Object r1 = r4.A02
            r0 = 41
            goto L_0x0009
        L_0x00b3:
            java.lang.Object r1 = r4.A02
            r0 = 42
            goto L_0x0009
        L_0x00b9:
            java.lang.Object r1 = r4.A02
            r0 = 43
            goto L_0x0009
        L_0x00bf:
            java.lang.Object r1 = r4.A02
            r0 = 44
            goto L_0x0009
        L_0x00c5:
            java.lang.Object r1 = r4.A02
            r0 = 45
            goto L_0x0009
        L_0x00cb:
            java.lang.Object r1 = r4.A02
            r0 = 46
            goto L_0x0009
        L_0x00d1:
            java.lang.Object r1 = r4.A02
            r0 = 47
            goto L_0x0009
        L_0x00d7:
            java.lang.Object r1 = r4.A02
            r0 = 48
            goto L_0x0009
        L_0x00dd:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 5
            goto L_0x0124
        L_0x00e3:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 6
            goto L_0x0124
        L_0x00e9:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 7
            goto L_0x0124
        L_0x00ef:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 8
            goto L_0x0111
        L_0x00f6:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 9
            goto L_0x0124
        L_0x00fd:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 10
            goto L_0x0111
        L_0x0104:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 11
            goto L_0x0111
        L_0x010b:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 12
        L_0x0111:
            X.MGX r3 = new X.MGX
            r3.<init>(r1, r2, r6, r0)
            return r3
        L_0x0117:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 13
            goto L_0x0124
        L_0x011e:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 14
        L_0x0124:
            X.MGX r3 = new X.MGX
            r3.<init>(r2, r1, r6, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGX.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0370, code lost:
        if (r2 != 1) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0372, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0373, code lost:
        r12 = X.C51972G9s.A0n();
        X.0qQ.A0B(r4, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0383, code lost:
        if (r1.getWidth() != r4.getWidth()) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x038d, code lost:
        if (r1.getHeight() != r4.getHeight()) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x038f, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0390, code lost:
        r0.A00 = new X.I12(r9, (com.instagram.api.schemas.CameraTool) null, (X.C55718HmF) null, r12, (java.lang.String) null, false);
        r15 = X.C51972G9s.A0n();
        r9 = A00(r1, r4);
        r12 = X.AnonymousClass7TF.A0B(r4.getWidth(), r4.getHeight());
        r8 = X.JTO.A0B(r12);
        r7 = X.JTO.A0C();
        r7.setColor(-1);
        r6 = X.JTO.A0C();
        r6.setColor(-16777216);
        r8.drawRect(0.0f, 0.0f, (float) r4.getWidth(), (float) r4.getHeight(), r7);
        r8.drawRect(X.C63279KuO.A00(r9, r4, r3), r6);
        r0.A01 = new X.I12(r12, (com.instagram.api.schemas.CameraTool) null, (X.C55718HmF) null, r15, (java.lang.String) null, false);
        X.C52966GgJ.A01(r0);
        r9 = X.JTP.A0j(r3 ? 1 : 0);
        r4 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03f8, code lost:
        r3 = r4.getValue();
        r2 = (X.C53361Gml) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0413, code lost:
        if (r4.AIY(r3, X.C53361Gml.A00(r2.A01, r0.A00, r2.A03, r2.A04, r9, r2.A05, r2.A06)) == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0415, code lost:
        r1.getWidth();
        r1.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x041d, code lost:
        r7 = A00(r1, r4);
        r9 = X.AnonymousClass7TF.A0B(r4.getWidth(), r4.getHeight());
        r15 = X.JTO.A0B(r9);
        r6 = X.JTO.A0C();
        r6.setColor(-16777216);
        r15.drawRect(0.0f, 0.0f, (float) r4.getWidth(), (float) r4.getHeight(), r6);
        r15.drawBitmap(r1, X.JTS.A08(r1), X.C63279KuO.A00(r7, r4, r3), X.AnonymousClass7TE.A0V(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0465, code lost:
        if (r3 != null) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04e6, code lost:
        if (r1 == null) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x054e, code lost:
        if (r1 == null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0554, code lost:
        r1.setDisplayedChild(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06e0, code lost:
        r7 = "audioListAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06e4, code lost:
        r7 = "audioList";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06fc, code lost:
        r4 = (androidx.fragment.app.Fragment) r2.A02;
        X.C59689JTv.A03(r4.requireContext(), X.AnonymousClass7TF.A0d(X.DbV.A05(r4), 2131961740), "fetch_suggested_audio_failed", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0814, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x081b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08a4, code lost:
        if (r2.A05 == false) goto L_0x08a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0bdb, code lost:
        if (r4 == null) goto L_0x0f24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0bdd, code lost:
        X.LIi.A01(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0f24, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0f2b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b3, code lost:
        if (r0 == null) goto L_0x0f24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b5, code lost:
        r0.A04(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0bd5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r2 = r26
            int r0 = r2.A01
            r1 = r27
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x003c;
                case 2: goto L_0x00f3;
                case 3: goto L_0x0108;
                case 4: goto L_0x016f;
                case 5: goto L_0x01ba;
                case 6: goto L_0x0f9e;
                case 7: goto L_0x0201;
                case 8: goto L_0x020e;
                case 9: goto L_0x02a0;
                case 10: goto L_0x02c2;
                case 11: goto L_0x02d0;
                case 12: goto L_0x0339;
                case 13: goto L_0x0469;
                case 14: goto L_0x0494;
                case 15: goto L_0x04a3;
                case 16: goto L_0x058e;
                case 17: goto L_0x0640;
                case 18: goto L_0x0690;
                case 19: goto L_0x012a;
                case 20: goto L_0x06b9;
                case 21: goto L_0x0717;
                case 22: goto L_0x0732;
                case 23: goto L_0x0792;
                case 24: goto L_0x07b1;
                case 25: goto L_0x082d;
                case 26: goto L_0x0f0c;
                case 27: goto L_0x0760;
                case 28: goto L_0x0849;
                case 29: goto L_0x085e;
                case 30: goto L_0x085e;
                case 31: goto L_0x0919;
                case 32: goto L_0x0927;
                case 33: goto L_0x093c;
                case 34: goto L_0x09e9;
                case 35: goto L_0x09fe;
                case 36: goto L_0x09fe;
                case 37: goto L_0x0a71;
                case 38: goto L_0x0a86;
                case 39: goto L_0x0a86;
                case 40: goto L_0x0be3;
                case 41: goto L_0x0bf8;
                case 42: goto L_0x0bf8;
                case 43: goto L_0x0d9d;
                case 44: goto L_0x0db2;
                case 45: goto L_0x0db2;
                case 46: goto L_0x0f6b;
                case 47: goto L_0x0f7a;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.0eS.A00(r1)
            java.lang.Object r0 = r2.A02
            X.KOn r0 = (X.C61848KOn) r0
            X.C61848KOn.A01(r0)
        L_0x0013:
            X.0gF r6 = X.C60340gF.A00
        L_0x0015:
            return r6
        L_0x0016:
            java.lang.Object r3 = A01(r1, r2)
            X.KmB r3 = (X.C62773KmB) r3
            boolean r0 = r3 instanceof X.KNK
            if (r0 != 0) goto L_0x06fc
            boolean r0 = r3 instanceof X.KNJ
            if (r0 == 0) goto L_0x0fac
            java.lang.Object r0 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            androidx.recyclerview.widget.RecyclerView r2 = r0.A0A
            if (r2 == 0) goto L_0x06e4
            X.JlX r1 = r0.A0L
            if (r1 == 0) goto L_0x06e0
            X.KNJ r3 = (X.KNJ) r3
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A00
            int r0 = r1.A02(r0)
            r2.A0p(r0)
            goto L_0x0013
        L_0x003c:
            java.lang.Object r1 = A01(r1, r2)
            X.JTb r1 = (X.C59671JTb) r1
            java.lang.Object r2 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r2 = (com.instagram.creation.fragment.AlbumEditFragment) r2
            boolean r0 = X.C60323JjS.A01(r2)
            if (r0 == 0) goto L_0x00d6
            X.0eM r0 = r2.A0b
            java.lang.Object r6 = r0.getValue()
            X.Jh7 r6 = (X.C60188Jh7) r6
            boolean r0 = r1.A00
            java.lang.Integer r8 = X.JTP.A0j(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.82q r1 = r6.A02
            java.util.List r0 = r1.FN1()
            boolean r5 = r0.isEmpty()
            com.instagram.common.session.UserSession r3 = r6.A01
            X.36W r2 = X.JWE.A04(r1)
            java.util.List r0 = r1.Co4()
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x007a
            r0 = 0
        L_0x007a:
            boolean r0 = X.C64132LPg.A02(r3, r2, r5, r0)
            if (r0 == 0) goto L_0x0087
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 31
            X.C66296MMf.A01(r1, r6, r4, r0)
        L_0x0087:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r5 = 1
            boolean r2 = X.AnonymousClass7TF.A1W(r8, r7)
            r0 = 32
            X.MMf r1 = X.C66296MMf.A00(r6, r0)
            X.JV5 r0 = new X.JV5
            r0.<init>((java.lang.Integer) r3, (X.C62320sa) r1, (boolean) r2)
            r4.add(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            boolean r2 = X.AnonymousClass7TF.A1W(r8, r7)
            r0 = 33
            X.MMf r1 = X.C66296MMf.A00(r6, r0)
            X.JV5 r0 = new X.JV5
            r0.<init>((java.lang.Integer) r3, (X.C62320sa) r1, (boolean) r2)
            r4.add(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r0 = 34
            X.C66296MMf.A01(r1, r6, r4, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            if (r8 == r7) goto L_0x00be
            r5 = 0
        L_0x00be:
            r0 = 35
            X.MMf r1 = X.C66296MMf.A00(r6, r0)
            X.JV5 r0 = new X.JV5
            r0.<init>((java.lang.Integer) r2, (X.C62320sa) r1, (boolean) r5)
            r4.add(r0)
            X.05G r1 = r6.A05
        L_0x00ce:
            boolean r0 = X.JTP.A1b(r4, r1)
            if (r0 == 0) goto L_0x00ce
            goto L_0x0013
        L_0x00d6:
            boolean r0 = r1.A00
            int r1 = X.DbW.A01(r0)
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x00e3
            r0.setVisibility(r1)
        L_0x00e3:
            android.view.View r0 = r2.A06
            if (r0 == 0) goto L_0x00ea
            r0.setVisibility(r1)
        L_0x00ea:
            android.view.View r0 = r2.A04
            if (r0 == 0) goto L_0x0013
            r0.setVisibility(r1)
            goto L_0x0013
        L_0x00f3:
            java.lang.Object r0 = A01(r1, r2)
            boolean r0 = r0 instanceof X.KNI
            if (r0 == 0) goto L_0x0fb1
            java.lang.Object r0 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.KB5 r0 = r0.A0D
            if (r0 == 0) goto L_0x0013
            r0.A0M()
            goto L_0x0013
        L_0x0108:
            java.lang.Object r3 = A01(r1, r2)
            X.JwI r3 = (X.C61080JwI) r3
            java.lang.Object r0 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A0C
            if (r1 == 0) goto L_0x0013
            android.content.Context r2 = r0.requireContext()
            r0 = 2131433348(0x7f0b1784, float:1.848848E38)
            android.widget.ImageView r1 = X.DbX.A0J(r1, r0)
            java.lang.Object r0 = r3.A00
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.LHt.A01(r2, r0, r1)
            goto L_0x0013
        L_0x012a:
            java.lang.Object r5 = A01(r1, r2)
            X.JtV r5 = (X.C60911JtV) r5
            java.util.List r1 = r5.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            java.lang.String r7 = "audioListAdapter"
            if (r0 == 0) goto L_0x0160
            java.lang.Object r4 = r2.A02
            X.JcV r4 = (X.C59962JcV) r4
            X.JlX r0 = r4.A0M
            if (r0 == 0) goto L_0x0f24
            r0.A03(r1)
            X.JlX r3 = r4.A0M
            if (r3 == 0) goto L_0x0f24
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r3.A01
            if (r0 == r1) goto L_0x0154
            r3.A01 = r1
            r3.notifyDataSetChanged()
        L_0x0154:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A08
            if (r0 == 0) goto L_0x06e4
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 6
            X.LZ0.A00(r1, r4, r0)
        L_0x0160:
            java.util.List r1 = r5.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r2.A02
            X.JcV r0 = (X.C59962JcV) r0
            X.JlX r0 = r0.A0M
            goto L_0x01b3
        L_0x016f:
            java.lang.Object r5 = A01(r1, r2)
            X.JtU r5 = (X.C60910JtU) r5
            java.util.List r1 = r5.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            java.lang.String r7 = "audioListAdapter"
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r4 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r4 = (com.instagram.creation.fragment.AlbumEditFragment) r4
            X.JlX r0 = r4.A0L
            if (r0 == 0) goto L_0x0f24
            r0.A03(r1)
            X.JlX r3 = r4.A0L
            if (r3 == 0) goto L_0x0f24
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r3.A01
            if (r0 == r1) goto L_0x0199
            r3.A01 = r1
            r3.notifyDataSetChanged()
        L_0x0199:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0A
            if (r0 == 0) goto L_0x06e4
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 3
            X.LZ0.A00(r1, r4, r0)
        L_0x01a5:
            java.util.List r1 = r5.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.JlX r0 = r0.A0L
        L_0x01b3:
            if (r0 == 0) goto L_0x0f24
            r0.A04(r1)
            goto L_0x0013
        L_0x01ba:
            java.lang.Object r3 = A01(r1, r2)
            X.JWG r3 = (X.JWG) r3
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            boolean r0 = r3.A0B(r1)
            if (r0 == 0) goto L_0x01e1
            r3.A08(r1)
        L_0x01cb:
            java.lang.Object r0 = r2.A02
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.KB5 r2 = r0.A0D
            if (r2 == 0) goto L_0x0013
            com.instagram.creation.base.CreationSession r0 = r2.A0S
            java.util.List r0 = r0.A0E
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            r0 = 0
            X.KB5.A0H(r2, r1, r0)
            goto L_0x0013
        L_0x01e1:
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x01fe
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x01fb
            java.lang.String r1 = X.LPN.A02(r0)
        L_0x01ef:
            java.lang.String r0 = "showing incorrect dialog "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "SAVING ALBUM DIALOG"
            X.0kD.A02(r0, r1)
            goto L_0x01cb
        L_0x01fb:
            java.lang.String r1 = "null"
            goto L_0x01ef
        L_0x01fe:
            java.lang.String r1 = "dialog not showing"
            goto L_0x01ef
        L_0x0201:
            java.lang.Object r1 = A01(r1, r2)
            if (r1 == 0) goto L_0x0013
            java.lang.Object r0 = r2.A02
            X.C51965G9l.A1W(r0, r1)
            goto L_0x0013
        L_0x020e:
            X.0eS.A00(r1)
            java.lang.Object r5 = r2.A02
            X.8An r5 = (X.C351818An) r5
            android.app.Application r18 = r5.A0D()
            java.lang.Object r2 = r2.A00
            X.I12 r2 = (X.I12) r2
            android.graphics.Bitmap r1 = r2.A00
            r6 = 0
            if (r1 == 0) goto L_0x0015
            com.instagram.api.schemas.CameraTool r0 = r2.A02
            if (r0 != 0) goto L_0x0228
            com.instagram.api.schemas.CameraTool r0 = com.instagram.api.schemas.CameraTool.UNRECOGNIZED
        L_0x0228:
            X.HmF r4 = r2.A03
            if (r4 == 0) goto L_0x029e
            java.lang.String r9 = r4.A00
        L_0x022e:
            java.lang.String r11 = ""
            if (r9 != 0) goto L_0x0233
            r9 = r11
        L_0x0233:
            java.lang.String r10 = r2.A05
            if (r10 != 0) goto L_0x0238
            r10 = r11
        L_0x0238:
            X.LN5 r8 = new X.LN5
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.LMH r7 = new X.LMH
            r7.<init>(r0, r8)
            com.instagram.common.session.UserSession r0 = r5.A09
            int r23 = r1.getWidth()
            int r24 = r1.getHeight()
            r3 = 0
            r22 = r6
            r20 = r6
            r21 = r0
            r25 = r3
            r19 = r1
            X.8Cl r2 = X.C363868kT.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r7)
            r2.A0p = r0
            if (r4 == 0) goto L_0x029c
            java.lang.String r0 = r4.A02
        L_0x026d:
            r2.A0g = r0
            if (r4 == 0) goto L_0x0273
            java.lang.String r6 = r4.A00
        L_0x0273:
            r2.A0e = r6
            X.8Cl r0 = r5.A07
            r2.A0M = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            com.instagram.common.util.gradient.BackgroundGradientColors r0 = X.0oT.A01(r1, r0)
            X.0v6 r0 = X.0oY.A01(r0, r3)
            r2.A0I = r0
            X.TqF r0 = new X.TqF
            r0.<init>(r1)
            X.TqI r1 = r0.A00()
            r0 = -1
            X.TqH r1 = r1.A01
            if (r1 == 0) goto L_0x0295
            int r0 = r1.A05
        L_0x0295:
            java.lang.Integer r0 = X.JTO.A0w(r0)
            r2.A0R = r0
            return r2
        L_0x029c:
            r0 = r6
            goto L_0x026d
        L_0x029e:
            r9 = r6
            goto L_0x022e
        L_0x02a0:
            java.lang.Object r4 = A01(r1, r2)
            X.Gpy r4 = (X.C53528Gpy) r4
            X.HMG r1 = r4.A02
            boolean r3 = r4.A03
            X.HMG r0 = X.HMG.ENTER_PROMPT
            if (r1 != r0) goto L_0x0013
            X.JLs r1 = r4.A00
            r0 = 1
            boolean r0 = X.C53521Gpr.A00(r0, r1)
            if (r0 == 0) goto L_0x02b9
            if (r3 == 0) goto L_0x0013
        L_0x02b9:
            java.lang.Object r0 = r2.A02
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            goto L_0x0013
        L_0x02c2:
            X.0eS.A00(r1)
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A00
            r1.invoke(r0)
            goto L_0x0013
        L_0x02d0:
            X.0eS.A00(r1)
            java.lang.Object r4 = r2.A02
            X.GgQ r4 = (X.C52973GgQ) r4
            X.05G r3 = r4.A0I
            java.lang.Object r5 = r2.A00
            X.JVf r5 = (X.C59721JVf) r5
        L_0x02dd:
            java.lang.Object r2 = r3.getValue()
            r13 = r2
            X.GnS r13 = (X.C53395GnS) r13
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x0336
            X.HMG r12 = X.HMG.GENERATED_IMAGE_SELECTION_4UP
        L_0x02ea:
            r9 = 0
            java.lang.Object r8 = r5.A01
            X.JwM r8 = (X.C61084JwM) r8
            java.lang.Object r11 = r5.A00
            X.L82 r11 = (X.L82) r11
            r16 = 0
            if (r0 != 0) goto L_0x0310
            java.lang.Integer r14 = X.AnonymousClass05K.A00
        L_0x02f9:
            r17 = 129002(0x1f7ea, float:1.8077E-40)
            r10 = r9
            r15 = r9
            r18 = r16
            r19 = r16
            r20 = r16
            X.GnS r0 = X.C53395GnS.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x02dd
            goto L_0x0013
        L_0x0310:
            com.instagram.common.session.UserSession r7 = r4.A05
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319918497144592(0x8108c6004b1f10, double:3.032200933942745E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0333
            X.0eM r0 = r4.A0D
            X.05G r0 = X.JTU.A0d(r0)
            java.lang.Object r0 = r0.getValue()
            int r1 = X.DbS.A05(r0)
            r0 = 4
            if (r1 > r0) goto L_0x0333
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            goto L_0x02f9
        L_0x0333:
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            goto L_0x02f9
        L_0x0336:
            X.HMG r12 = X.HMG.GENERATED_IMAGE_SELECTION
            goto L_0x02ea
        L_0x0339:
            X.0eS.A00(r1)
            java.lang.Object r0 = r2.A02
            X.GgJ r0 = (X.C52966GgJ) r0
            X.0eM r1 = r0.A07
            java.lang.Object r1 = r1.getValue()
            X.HDl r1 = (X.C54436HDl) r1
            X.I12 r1 = r1.A02()
            if (r1 == 0) goto L_0x0013
            android.graphics.Bitmap r1 = r1.A00
            if (r1 == 0) goto L_0x0013
            int r4 = r1.getWidth()
            int r3 = r1.getHeight()
            r5 = 1
            boolean r4 = X.C51970G9q.A1W(r4, r3)
            java.lang.Object r3 = r2.A00
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r3 == 0) goto L_0x0463
            int r2 = r3.bottom
            if (r2 != r5) goto L_0x0463
            if (r4 == 0) goto L_0x0463
            android.util.Size r4 = X.C63558Kz7.A01
        L_0x036d:
            int r2 = r3.bottom
            r3 = 1
            if (r2 == r5) goto L_0x0373
        L_0x0372:
            r3 = 0
        L_0x0373:
            java.lang.String r12 = X.C51972G9s.A0n()
            r14 = 0
            X.0qQ.A0B(r4, r5)
            int r5 = r1.getWidth()
            int r2 = r4.getWidth()
            if (r5 != r2) goto L_0x041d
            int r5 = r1.getHeight()
            int r2 = r4.getHeight()
            if (r5 != r2) goto L_0x041d
            r9 = r1
        L_0x0390:
            r10 = 0
            r17 = 0
            X.I12 r8 = new X.I12
            r11 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.A00 = r8
            java.lang.String r15 = X.C51972G9s.A0n()
            android.util.Size r9 = A00(r1, r4)
            int r5 = r4.getWidth()
            int r2 = r4.getHeight()
            android.graphics.Bitmap r12 = X.AnonymousClass7TF.A0B(r5, r2)
            android.graphics.Canvas r8 = X.JTO.A0B(r12)
            android.graphics.Paint r7 = X.JTO.A0C()
            r2 = -1
            r7.setColor(r2)
            android.graphics.Paint r6 = X.JTO.A0C()
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setColor(r2)
            int r2 = r4.getWidth()
            float r5 = (float) r2
            int r2 = r4.getHeight()
            float r2 = (float) r2
            r19 = 0
            r18 = r8
            r20 = r19
            r21 = r5
            r22 = r2
            r23 = r7
            r18.drawRect(r19, r20, r21, r22, r23)
            android.graphics.RectF r2 = X.C63279KuO.A00(r9, r4, r3)
            r8.drawRect(r2, r6)
            X.I12 r11 = new X.I12
            r14 = r10
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.A01 = r11
            X.C52966GgJ.A01(r0)
            java.lang.Integer r9 = X.JTP.A0j(r3)
            X.05G r4 = r0.A0A
        L_0x03f8:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.Gml r2 = (X.C53361Gml) r2
            X.I12 r6 = r0.A00
            java.lang.Integer r7 = r2.A03
            X.I12 r5 = r2.A01
            java.util.List r10 = r2.A05
            java.lang.Integer r8 = r2.A04
            boolean r11 = r2.A06
            X.Gml r2 = X.C53361Gml.A00(r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r4.AIY(r3, r2)
            if (r2 == 0) goto L_0x03f8
            r1.getWidth()
            r1.getHeight()
            goto L_0x0013
        L_0x041d:
            android.util.Size r7 = A00(r1, r4)
            int r5 = r4.getWidth()
            int r2 = r4.getHeight()
            android.graphics.Bitmap r9 = X.AnonymousClass7TF.A0B(r5, r2)
            android.graphics.Canvas r15 = X.JTO.A0B(r9)
            android.graphics.Paint r6 = X.JTO.A0C()
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setColor(r2)
            r16 = 0
            int r2 = r4.getWidth()
            float r5 = (float) r2
            int r2 = r4.getHeight()
            float r2 = (float) r2
            r17 = r16
            r18 = r5
            r19 = r2
            r20 = r6
            r15.drawRect(r16, r17, r18, r19, r20)
            android.graphics.Rect r6 = X.JTS.A08(r1)
            android.graphics.RectF r5 = X.C63279KuO.A00(r7, r4, r3)
            r2 = 2
            android.graphics.Paint r2 = X.AnonymousClass7TE.A0V(r2)
            r15.drawBitmap(r1, r6, r5, r2)
            goto L_0x0390
        L_0x0463:
            android.util.Size r4 = X.C63558Kz7.A00
            if (r3 == 0) goto L_0x0372
            goto L_0x036d
        L_0x0469:
            X.0eS.A00(r1)
            java.lang.Object r3 = r2.A02
            X.4gU r3 = (X.C270284gU) r3
            java.lang.Object r0 = r3.getValue()
            X.GnW r0 = (X.C53399GnW) r0
            java.lang.Object r1 = r0.A03
            X.HLZ r0 = X.HLZ.ENTER_PROMPT
            if (r1 != r0) goto L_0x0013
            java.lang.Object r0 = r3.getValue()
            X.GnW r0 = (X.C53399GnW) r0
            java.lang.Object r1 = r0.A04
            r0 = 1
            boolean r0 = X.C53521Gpr.A00(r0, r1)
            if (r0 != 0) goto L_0x0013
            java.lang.Object r0 = r2.A00
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            goto L_0x0013
        L_0x0494:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r1 = r2.A02
            r0 = 45
            X.C51971G9r.A1Q(r1, r3, r0)
            goto L_0x0013
        L_0x04a3:
            java.lang.Object r5 = A01(r1, r2)
            X.KmC r5 = (X.C62774KmC) r5
            boolean r0 = r5 instanceof X.KNS
            if (r0 == 0) goto L_0x0513
            java.lang.Object r1 = r2.A02
            X.LOy r1 = (X.LOy) r1
            X.KNS r5 = (X.KNS) r5
            X.Lmg r4 = r1.A01
            if (r4 == 0) goto L_0x0013
            boolean r0 = r5 instanceof X.KNQ
            java.lang.String r3 = "photoEditToolsBottomSheetContentController"
            if (r0 == 0) goto L_0x04f0
            X.KNQ r5 = (X.KNQ) r5
            X.MVo r2 = r5.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.widget.ViewFlipper r1 = r4.A00
            java.lang.String r3 = "viewContainer"
            if (r1 == 0) goto L_0x04e8
            r0 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r1 = X.DbX.A0I(r1, r0)
            r1.removeAllViews()
            android.widget.ViewFlipper r0 = r4.A00
            if (r0 == 0) goto L_0x04e8
            android.content.Context r0 = r0.getContext()
            android.view.View r0 = r2.AZq(r0)
            r1.addView(r0)
            android.widget.ViewFlipper r1 = r4.A00
            if (r1 != 0) goto L_0x0554
        L_0x04e8:
            X.0qQ.A0F(r3)
        L_0x04eb:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04f0:
            X.KNR r0 = X.KNR.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0fb6
            X.Lmg r2 = r1.A01
            if (r2 == 0) goto L_0x04e8
            android.widget.ViewFlipper r0 = r2.A00
            java.lang.String r3 = "viewContainer"
            if (r0 == 0) goto L_0x04e8
            int r1 = r0.getDisplayedChild()
            r0 = 1
            if (r1 != r0) goto L_0x0013
            android.widget.ViewFlipper r1 = r2.A00
            if (r1 == 0) goto L_0x04e8
            r0 = 0
            r1.setDisplayedChild(r0)
            goto L_0x0013
        L_0x0513:
            boolean r0 = r5 instanceof X.KNP
            if (r0 == 0) goto L_0x0567
            java.lang.Object r0 = r2.A02
            X.LOy r0 = (X.LOy) r0
            X.KNP r5 = (X.KNP) r5
            X.Lmh r4 = r0.A00
            if (r4 == 0) goto L_0x0013
            boolean r0 = r5 instanceof X.KNV
            if (r0 == 0) goto L_0x055a
            X.KNV r5 = (X.KNV) r5
            X.MVo r3 = r5.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            android.widget.ViewFlipper r1 = r4.A02
            java.lang.String r2 = "viewContainer"
            if (r1 == 0) goto L_0x0550
            r0 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r1 = X.DbX.A0I(r1, r0)
            r1.removeAllViews()
            android.widget.ViewFlipper r0 = r4.A02
            if (r0 == 0) goto L_0x0550
            android.content.Context r0 = r0.getContext()
            android.view.View r0 = r3.AZq(r0)
            r1.addView(r0)
            android.widget.ViewFlipper r1 = r4.A02
            if (r1 != 0) goto L_0x0554
        L_0x0550:
            X.0qQ.A0F(r2)
            goto L_0x04eb
        L_0x0554:
            r0 = 1
            r1.setDisplayedChild(r0)
            goto L_0x0013
        L_0x055a:
            X.KNW r0 = X.KNW.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0013
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0567:
            X.KNU r0 = X.KNU.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0582
            java.lang.Object r0 = r2.A02
            X.LOy r0 = (X.LOy) r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r2 = r0.A06
            r1 = 1
        L_0x0576:
            X.MXJ r0 = r2.A03
            if (r0 == 0) goto L_0x057d
            r0.cancel()
        L_0x057d:
            r2.A03(r1)
            goto L_0x0013
        L_0x0582:
            boolean r0 = r5 instanceof X.KNT
            if (r0 == 0) goto L_0x0fbb
            java.lang.Object r0 = r2.A02
            X.LOy r0 = (X.LOy) r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r2 = r0.A06
            r1 = 0
            goto L_0x0576
        L_0x058e:
            java.lang.Object r0 = A01(r1, r2)
            X.KhE r0 = (X.C62522KhE) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0620
            r0 = 1
            if (r1 == r0) goto L_0x0603
            r0 = 2
            if (r1 == r0) goto L_0x05e0
            r0 = 3
            if (r1 == r0) goto L_0x05c5
            r0 = 4
            if (r1 != r0) goto L_0x0013
            java.lang.Object r0 = r2.A02
            X.JcV r0 = (X.C59962JcV) r0
            X.JcW r5 = X.C59962JcV.A01(r0)
            X.05G r4 = r5.A0M
        L_0x05b1:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JcX r2 = (X.C59964JcX) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1 = 0
            boolean r0 = X.C59964JcX.A01(r2, r0, r3, r4)
            if (r0 == 0) goto L_0x05b1
        L_0x05c1:
            r5.A04 = r1
            goto L_0x0013
        L_0x05c5:
            java.lang.Object r0 = r2.A02
            X.JcV r0 = (X.C59962JcV) r0
            X.JcW r5 = X.C59962JcV.A01(r0)
            X.05G r4 = r5.A0M
        L_0x05cf:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JcX r2 = (X.C59964JcX) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 0
            boolean r0 = X.C59964JcX.A01(r2, r0, r3, r4)
            if (r0 == 0) goto L_0x05cf
            goto L_0x05c1
        L_0x05e0:
            java.lang.Object r1 = r2.A02
            X.JcV r1 = (X.C59962JcV) r1
            X.80Q r0 = r1.A0I
            if (r0 == 0) goto L_0x05f3
            X.80R r0 = r0.A00
            X.8BA r0 = r0.A0e
            if (r0 == 0) goto L_0x05f3
            X.8Be r0 = r0.A0y
            r0.A08()
        L_0x05f3:
            X.JcW r0 = X.C59962JcV.A01(r1)
            r0.A07()
            X.JcW r0 = X.C59962JcV.A01(r1)
            r0.A07()
            goto L_0x0013
        L_0x0603:
            java.lang.Object r1 = r2.A02
            X.JcV r1 = (X.C59962JcV) r1
            X.80Q r0 = r1.A0I
            X.JTS.A1P(r0)
            X.80Q r0 = r1.A0I
            if (r0 == 0) goto L_0x0617
            X.JcW r0 = X.C59962JcV.A01(r1)
            r0.A05()
        L_0x0617:
            X.JcW r0 = X.C59962JcV.A01(r1)
            r0.A05()
            goto L_0x0013
        L_0x0620:
            java.lang.Object r2 = r2.A02
            X.JcV r2 = (X.C59962JcV) r2
            com.instagram.creation.toolbar.CreationToolbarView r0 = r2.A0Q
            if (r0 == 0) goto L_0x063e
            android.widget.ImageView r1 = r0.getMusicPickerButton()
        L_0x062c:
            r0 = 2131238572(0x7f081eac, float:1.8093426E38)
            X.C59962JcV.A03(r1, r2, r0)
            X.LG9 r2 = r2.A0L
            if (r2 == 0) goto L_0x0013
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            r2.A02(r0, r1)
            goto L_0x0013
        L_0x063e:
            r1 = 0
            goto L_0x062c
        L_0x0640:
            java.lang.Object r5 = A01(r1, r2)
            X.JwC r5 = (X.C61074JwC) r5
            java.lang.Object r0 = r5.A02
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r4 = r2.A02
            X.JcV r4 = (X.C59962JcV) r4
            X.MXQ r2 = r4.A0J
            java.lang.String r3 = "imageRenderControllerManager"
            if (r2 == 0) goto L_0x0fc0
            int r1 = X.C51970G9q.A0B(r0)
            int r0 = X.C51969G9p.A0A(r0)
            r2.CMq(r1, r0)
            java.lang.Object r1 = r5.A00
            com.instagram.creation.base.CropInfo r1 = (com.instagram.creation.base.CropInfo) r1
            if (r1 == 0) goto L_0x066e
            X.MXQ r0 = r4.A0J
            if (r0 == 0) goto L_0x0fc0
            r0.ETK(r1)
        L_0x066e:
            java.lang.Object r0 = r5.A03
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0683
            X.MXQ r2 = r4.A0J
            if (r2 == 0) goto L_0x0fc0
            int r1 = X.C51970G9q.A0B(r0)
            int r0 = X.C51969G9p.A0A(r0)
            r2.Ef6(r1, r0)
        L_0x0683:
            X.MXQ r1 = r4.A0J
            if (r1 == 0) goto L_0x0fc0
            java.lang.Object r0 = r5.A01
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = (com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel) r0
            r1.APz(r0)
            goto L_0x0013
        L_0x0690:
            java.lang.Object r3 = A01(r1, r2)
            X.8pR r3 = (X.C366648pR) r3
            if (r3 == 0) goto L_0x0013
            java.lang.Object r2 = r2.A02
            X.JcV r2 = (X.C59962JcV) r2
            X.80Q r0 = r2.A0I
            if (r0 == 0) goto L_0x06aa
            X.80R r0 = r0.A00
            X.8BA r1 = r0.A0e
            if (r1 == 0) goto L_0x06aa
            r0 = 0
            r1.A0j(r3, r0)
        L_0x06aa:
            X.80Q r0 = r2.A0I
            if (r0 == 0) goto L_0x0013
            X.80R r0 = r0.A00
            X.8BA r0 = r0.A0e
            if (r0 == 0) goto L_0x0013
            r0.A0b()
            goto L_0x0013
        L_0x06b9:
            java.lang.Object r3 = A01(r1, r2)
            X.KmD r3 = (X.C62775KmD) r3
            boolean r0 = r3 instanceof X.C61811KNa
            if (r0 != 0) goto L_0x06fc
            boolean r0 = r3 instanceof X.KNY
            if (r0 == 0) goto L_0x06e8
            java.lang.Object r0 = r2.A02
            X.JcV r0 = (X.C59962JcV) r0
            androidx.recyclerview.widget.RecyclerView r2 = r0.A08
            if (r2 == 0) goto L_0x06e4
            X.JlX r1 = r0.A0M
            if (r1 == 0) goto L_0x06e0
            X.KNY r3 = (X.KNY) r3
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A00
            int r0 = r1.A02(r0)
            r2.A0p(r0)
            goto L_0x0013
        L_0x06e0:
            java.lang.String r7 = "audioListAdapter"
            goto L_0x0f24
        L_0x06e4:
            java.lang.String r7 = "audioList"
            goto L_0x0f24
        L_0x06e8:
            boolean r0 = r3 instanceof X.KNZ
            if (r0 == 0) goto L_0x0fc8
            java.lang.Object r0 = r2.A02
            X.JcV r0 = (X.C59962JcV) r0
            X.LG9 r2 = r0.A0L
            if (r2 == 0) goto L_0x0013
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            r0 = 0
            r2.A02(r0, r1)
            goto L_0x0013
        L_0x06fc:
            java.lang.Object r4 = r2.A02
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.String r2 = "fetch_suggested_audio_failed"
            android.content.Context r1 = r4.requireContext()
            r0 = 1
            X.C59689JTv.A03(r1, r3, r2, r0)
            goto L_0x0013
        L_0x0717:
            java.lang.Object r4 = A01(r1, r2)
            X.4Cq r4 = (X.C262224Cq) r4
            r3 = 0
            java.lang.Object r2 = r2.A02
            r1 = 49
            X.MG6 r0 = new X.MG6
            r0.<init>(r2, r3, r1)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r0, r4)
            r0 = 0
            X.MH9.A03(r2, r1, r4, r0)
            goto L_0x0013
        L_0x0732:
            java.lang.Object r1 = A01(r1, r2)
            java.lang.Object r2 = r2.A02
            X.K66 r2 = (X.K66) r2
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L_0x0013
            if (r1 == 0) goto L_0x0013
            X.LBG r0 = r2.A06
            if (r0 != 0) goto L_0x074a
            java.lang.String r7 = "viewHolder"
            goto L_0x0f24
        L_0x074a:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0013
            X.LQj r0 = r2.A03
            r1 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x0013
            X.K66.A0E(r2)
            goto L_0x0013
        L_0x0760:
            java.lang.Object r1 = A01(r1, r2)
            boolean r0 = r1 instanceof X.KO1
            if (r0 == 0) goto L_0x077b
            java.lang.Object r0 = r2.A02
            X.LpB r0 = (X.C65205LpB) r0
            X.5Gv r1 = r0.A01
            if (r1 != 0) goto L_0x0774
            java.lang.String r0 = "sellProductTooltip"
            goto L_0x0814
        L_0x0774:
            com.instagram.common.session.UserSession r0 = r0.A05
            r1.A07(r0)
            goto L_0x0013
        L_0x077b:
            boolean r0 = r1 instanceof X.KO0
            if (r0 == 0) goto L_0x0fcd
            java.lang.Object r0 = r2.A02
            X.LpB r0 = (X.C65205LpB) r0
            X.JfA r0 = r0.A00
            if (r0 != 0) goto L_0x078b
            java.lang.String r0 = "bioRow"
            goto L_0x0814
        L_0x078b:
            android.view.View r0 = r0.A06
            X.AnonymousClass7TF.A16(r0)
            goto L_0x0013
        L_0x0792:
            java.lang.Object r3 = A01(r1, r2)
            X.KmF r3 = (X.C62777KmF) r3
            boolean r0 = r3 instanceof X.C61815KNe
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r2.A02
            X.KNd r0 = (X.C61814KNd) r0
            X.3Q2 r1 = r0.A03
            java.lang.String r0 = "pendingMedia"
            if (r1 == 0) goto L_0x0814
            r0 = 1
            r1.A5L = r0
            X.KNe r3 = (X.C61815KNe) r3
            int r0 = r3.A00
            r1.A05 = r0
            goto L_0x0013
        L_0x07b1:
            java.lang.Object r0 = A01(r1, r2)
            boolean r0 = r0 instanceof X.C61816KNf
            if (r0 == 0) goto L_0x0013
            java.lang.Object r5 = r2.A02
            X.KNd r5 = (X.C61814KNd) r5
            X.0eM r0 = r5.A0C
            X.27r r0 = X.C51971G9r.A0g(r0)
            X.29Z r4 = r0.A0F
            X.0Aj r3 = X.JTR.A0d(r4)
            X.283 r2 = r4.A04
            X.JVj r1 = r2.A0C
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x080e
            if (r1 == 0) goto L_0x080e
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x080e
            X.80P r0 = X.AnonymousClass80P.COVER_PHOTO_ADD
            X.JTO.A1O(r0, r3)
            r0 = 2304(0x900, float:3.229E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.JTO.A1T(r3, r0)
            java.lang.String r0 = X.JTP.A0p(r2)
            X.JTO.A1S(r3, r0)
            X.AnonymousClass7TH.A0W(r3, r4)
            X.28D r0 = r2.A09
            X.JTS.A14(r0, r3)
            X.C51965G9l.A1A(r1, r3)
            X.JTP.A1J(r3, r2)
            X.JYm r1 = X.C59793JYm.GALLERY
            java.lang.String r0 = "media_source"
            r3.A8M(r1, r0)
            X.AnonymousClass7TH.A0U(r3)
            X.JTQ.A12(r3, r4)
            X.AnonymousClass7TH.A0V(r3)
        L_0x080e:
            X.3Q2 r0 = r5.A03
            if (r0 != 0) goto L_0x081c
            java.lang.String r0 = "pendingMedia"
        L_0x0814:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x081c:
            r1 = 1
            r0.A5M = r1
            X.Ji7 r0 = r5.A04
            if (r0 != 0) goto L_0x0826
            java.lang.String r0 = "videoScrubbingViewModel"
            goto L_0x0814
        L_0x0826:
            X.05G r0 = r0.A0I
            X.AnonymousClass7TF.A1O(r0, r1)
            goto L_0x0013
        L_0x082d:
            java.lang.Object r0 = A01(r1, r2)
            boolean r0 = r0 instanceof X.C61819KNi
            if (r0 == 0) goto L_0x0fd2
            java.lang.Object r0 = r2.A02
            android.content.Context r2 = X.DbT.A07(r0)
            r0 = 2806(0xaf6, float:3.932E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2131955520(0x7f130f40, float:1.954757E38)
            X.C59689JTv.A0F(r2, r1, r0)
            goto L_0x0013
        L_0x0849:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            r0 = 11
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 12
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x085e:
            X.0eS.A00(r1)
            java.lang.Object r4 = r2.A02
            X.KNu r4 = (X.C61831KNu) r4
            X.4DH r5 = r4.A01
            r5.getModuleName()
            X.KOn r7 = r4.A02
            X.0Ud r6 = r7.A08
            java.lang.Object r0 = r6.getValue()
            X.Drk r0 = (X.C47169Drk) r0
            java.lang.Integer r2 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 1
            if (r2 != r0) goto L_0x08b6
            X.Ki8 r0 = r7.A0B(r1)
            if (r0 != 0) goto L_0x08b6
        L_0x0881:
            r3 = 1
            if (r1 != 0) goto L_0x0897
            java.lang.Object r0 = r6.getValue()
            X.Drk r0 = (X.C47169Drk) r0
            java.lang.Integer r2 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = 0
            if (r2 != r1) goto L_0x08f3
            X.Ki8 r0 = r7.A0B(r0)
            if (r0 != 0) goto L_0x08f3
        L_0x0897:
            X.Drk r2 = X.LSR.A04(r7)
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x08a6
            boolean r1 = r2.A05
            r0 = 1
            if (r1 != 0) goto L_0x08a7
        L_0x08a6:
            r0 = 0
        L_0x08a7:
            X.JfA r1 = r4.A02()
            if (r0 == 0) goto L_0x08b8
            java.util.List r0 = X.C61831KNu.A01(r4)
            r1.setInlineSubtitleContainerItems(r0)
            goto L_0x0013
        L_0x08b6:
            r1 = 0
            goto L_0x0881
        L_0x08b8:
            java.util.List r0 = X.C61831KNu.A01(r4)
            r1.setAppListContainerItems(r0)
            int r0 = X.C61831KNu.A00(r4)
            if (r0 != r3) goto L_0x08e1
            X.JfA r3 = r4.A02()
            android.content.Context r2 = r5.requireContext()
            r1 = 2131955202(0x7f130e02, float:1.9546925E38)
        L_0x08d0:
            int r0 = X.C61831KNu.A00(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            r3.setInlineSubtitle(r0)
            goto L_0x0013
        L_0x08e1:
            int r0 = X.C61831KNu.A00(r4)
            if (r0 <= r3) goto L_0x0013
            X.JfA r3 = r4.A02()
            android.content.Context r2 = r5.requireContext()
            r1 = 2131955201(0x7f130e01, float:1.9546923E38)
            goto L_0x08d0
        L_0x08f3:
            X.JfA r1 = r4.A02()
            java.util.List r0 = X.C61831KNu.A01(r4)
            r1.setAppListContainerItems(r0)
            X.JfA r2 = r4.A02()
            android.content.Context r1 = r5.requireContext()
            r0 = 2131955756(0x7f13102c, float:1.9548048E38)
            java.lang.String r0 = X.JTQ.A0a(r1, r0)
            r2.setInlineSubtitle(r0)
            X.JfA r0 = r4.A02()
            r0.setShowDisabledState(r3)
            goto L_0x0013
        L_0x0919:
            X.0eS.A00(r1)
            java.lang.Object r0 = r2.A02
            X.LpD r0 = (X.C65207LpD) r0
            X.LRa r0 = r0.A03
            r0.A02()
            goto L_0x0013
        L_0x0927:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            r0 = 13
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 14
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x093c:
            java.lang.Object r3 = A01(r1, r2)
            X.KO5 r3 = (X.KO5) r3
            java.lang.Object r6 = r2.A02
            X.LpL r6 = (X.C65215LpL) r6
            boolean r4 = r3.A02
            X.KHU r0 = r6.A00
            java.lang.String r7 = "productTagRow"
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r4)
            X.KHU r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.MUF r2 = r0.A00
            if (r2 == 0) goto L_0x097e
            r0 = r2
            X.Ly3 r0 = (X.C65688Ly3) r0
            X.MVG r0 = r0.A00
            if (r0 != 0) goto L_0x096a
            java.lang.String r0 = "viewHolder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x096a:
            android.view.View r1 = r0.AqN()
            int r0 = X.DbW.A01(r4)
            r1.setVisibility(r0)
            X.Ly1 r0 = new X.Ly1
            r0.<init>(r6)
            X.Ly3 r2 = (X.C65688Ly3) r2
            r2.A01 = r0
        L_0x097e:
            if (r4 == 0) goto L_0x0992
            X.KOi r0 = r6.A05
            r0.A0A()
            X.MXh r1 = r6.A02
            X.KHU r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.Lxz r0 = r0.A04
            android.view.View r0 = r0.A00
            r1.DqW(r0)
        L_0x0992:
            X.KHU r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            java.util.List r0 = r3.A01
            r1.setSuggestedProducts(r0)
            X.KHU r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            X.Jw0 r0 = r3.A00
            r1.setClipsShoppingMetadata(r0)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0013
            X.KHU r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.Lxz r0 = r0.A04
            android.view.View r4 = r0.A00
            X.4DH r0 = r6.A01
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x0013
            X.LMT r3 = r6.A03
            r5 = 0
            r0 = 1
            r3.A00 = r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131973079(0x7f1353d7, float:1.9583184E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            X.2fy r1 = X.C226262fy.ABOVE_ANCHOR
            r0 = 0
            X.LMT.A00(r4, r3, r0, r1, r2)
            X.KOi r0 = r6.A05
            X.05G r4 = r0.A09
            java.lang.Object r0 = r4.getValue()
            X.KO5 r0 = (X.KO5) r0
            boolean r3 = r0.A02
            X.Jw0 r2 = r0.A00
            java.util.List r1 = r0.A01
            X.KO5 r0 = new X.KO5
            r0.<init>(r2, r1, r3, r5)
            r4.Epw(r0)
            goto L_0x0013
        L_0x09e9:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            r0 = 15
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 16
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x09fe:
            X.0eS.A00(r1)
            java.lang.Object r5 = r2.A02
            X.Lp2 r5 = (X.C65198Lp2) r5
            X.4DH r0 = r5.A01
            r0.getModuleName()
            X.KOn r6 = r5.A04
            X.Drk r3 = X.LSR.A04(r6)
            java.lang.Integer r0 = r3.A02
            if (r0 != 0) goto L_0x0a44
            r0 = -1
        L_0x0a15:
            java.lang.String r7 = "recommendOnFbContainer"
            r2 = 1
            r1 = 4
            X.KHY r4 = r5.A00
            if (r0 != r1) goto L_0x0bdb
            if (r4 == 0) goto L_0x0f24
            X.LIi.A01(r4, r2)
            boolean r4 = r3.A05
            r3 = 0
            X.Ki8 r2 = r6.A0B(r3)
            if (r2 == 0) goto L_0x0a49
            r0 = 52
            X.LYG r1 = X.LYG.A01(r5, r2, r0)
            X.KHY r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            X.AnonymousClass0fU.A00(r1, r0)
            r6.A0C(r2, r3)
            com.instagram.common.session.UserSession r1 = r5.A02
            X.JZY r0 = X.JZY.UNAVAILABLE
            X.LPW.A02(r0, r1, r4)
            goto L_0x0013
        L_0x0a44:
            int r0 = r0.intValue()
            goto L_0x0a15
        L_0x0a49:
            X.KHY r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            r0.setChecked(r4)
            X.KHY r1 = r5.A00
            if (r1 == 0) goto L_0x0f24
            r0 = 19
            X.KHY.A02(r1, r5, r0)
            com.instagram.common.session.UserSession r1 = r5.A02
            X.JZY r0 = X.JZY.VIEW
            X.LPW.A02(r0, r1, r4)
            X.L0t r0 = r5.A03
            X.KHY r2 = r5.A00
            if (r2 == 0) goto L_0x0f24
            X.KNp r0 = r0.A00
            X.Loe r1 = r0.A0A
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.REELS_SHARE_SHEET_RECOMMEND_ON_FACEBOOK_ROW
            r1.EBQ(r2, r0)
            goto L_0x0013
        L_0x0a71:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            r0 = 17
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 18
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x0a86:
            X.0eS.A00(r1)
            java.lang.Object r3 = r2.A02
            X.LpH r3 = (X.C65211LpH) r3
            X.4DH r1 = r3.A01
            r1.getModuleName()
            X.KOn r10 = r3.A05
            X.Drk r6 = X.LSR.A04(r10)
            java.lang.Integer r0 = r6.A02
            if (r0 != 0) goto L_0x0b5b
            r0 = -1
        L_0x0a9d:
            java.lang.String r7 = "recommendOnFbContainer"
            r5 = 1
            r2 = 4
            X.JfA r4 = r3.A00
            if (r0 != r2) goto L_0x0bdb
            if (r4 == 0) goto L_0x0f24
            X.LIi.A01(r4, r5)
            boolean r4 = r6.A05
            boolean r6 = r6.A07
            if (r6 == 0) goto L_0x0b57
            java.lang.String r5 = "SHARE_TO_FACEBOOK"
        L_0x0ab2:
            X.JfA r8 = r3.A00
            if (r8 == 0) goto L_0x0f24
            android.content.Context r2 = r1.requireContext()
            java.lang.String r0 = "SHARE_TO_FACEBOOK"
            boolean r5 = r5.equals(r0)
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131955643(0x7f130fbb, float:1.954782E38)
            if (r5 == 0) goto L_0x0acc
            r0 = 2131955685(0x7f130fe5, float:1.9547904E38)
        L_0x0acc:
            java.lang.String r0 = r2.getString(r0)
            X.0qQ.A0A(r0)
            r8.setTitle(r0)
            X.JfA r8 = r3.A00
            if (r8 == 0) goto L_0x0f24
            android.content.Context r0 = r1.requireContext()
            com.instagram.common.session.UserSession r2 = r3.A02
            r9 = 0
            android.content.res.Resources r11 = r0.getResources()
            if (r5 == 0) goto L_0x0b4c
            r5 = 2131955687(0x7f130fe7, float:1.9547909E38)
            X.0eE r0 = X.AnonymousClass0t1.A01
            java.lang.String r0 = X.DbU.A0n(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            android.text.Spanned r0 = X.0bC.A00(r11, r0, r5)
            java.lang.String r0 = r0.toString()
        L_0x0afc:
            r8.setDescription(r0)
            X.Ki8 r8 = r10.A0B(r9)
            if (r8 == 0) goto L_0x0b61
            r0 = 53
            X.LYG r6 = X.LYG.A01(r3, r8, r0)
            X.JfA r11 = r3.A00
            if (r11 == 0) goto L_0x0f24
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A0B
            r5 = 8
            r0.setVisibility(r5)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A0C
            r0.setVisibility(r5)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A0E
            r0.setVisibility(r9)
            X.JfA r0 = r3.A00
            if (r0 == 0) goto L_0x0f24
            android.widget.TextView r0 = r0.A07
            r0.setVisibility(r5)
            X.JfA r5 = r3.A00
            if (r5 == 0) goto L_0x0f24
            android.content.res.Resources r1 = X.DbV.A05(r1)
            r0 = 2131955689(0x7f130fe9, float:1.9547913E38)
            java.lang.String r0 = r1.getString(r0)
            r5.setInlineSubtitle(r0)
            X.JfA r0 = r3.A00
            if (r0 == 0) goto L_0x0f24
            X.AnonymousClass0fU.A00(r6, r0)
            r10.A0C(r8, r9)
            X.JZY r0 = X.JZY.UNAVAILABLE
            X.LPW.A02(r0, r2, r4)
            goto L_0x0013
        L_0x0b4c:
            r0 = 2131955686(0x7f130fe6, float:1.9547906E38)
            java.lang.String r0 = r11.getString(r0)
            X.0qQ.A0A(r0)
            goto L_0x0afc
        L_0x0b57:
            java.lang.String r5 = "RECOMMEND_TO_FACEBOOK"
            goto L_0x0ab2
        L_0x0b5b:
            int r0 = r0.intValue()
            goto L_0x0a9d
        L_0x0b61:
            X.LXT r5 = new X.LXT
            r5.<init>(r3, r9, r4, r6)
            X.JfA r0 = r3.A00
            if (r0 == 0) goto L_0x0f24
            r0.A0D()
            r6 = 8
            X.JfA r8 = r3.A00
            if (r4 == 0) goto L_0x0bc1
            if (r8 == 0) goto L_0x0f24
            android.content.res.Resources r1 = X.DbV.A05(r1)
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
            java.lang.String r0 = r1.getString(r0)
            r8.setInlineSubtitle(r0)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36311706514883300(0x81014e000202e4, double:3.027007643293706E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 != 0) goto L_0x0b9b
            r0 = 36313123853960993(0x81029800000721, double:3.027903974233605E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x0bd1
        L_0x0b9b:
            X.JfA r0 = r3.A00
            if (r0 == 0) goto L_0x0f24
            android.widget.TextView r0 = r0.A07
            r0.setVisibility(r9)
        L_0x0ba4:
            X.JfA r0 = r3.A00
            if (r0 == 0) goto L_0x0f24
            X.AnonymousClass0fU.A00(r5, r0)
            X.JZY r0 = X.JZY.VIEW
            X.LPW.A02(r0, r2, r4)
            X.L0u r0 = r3.A03
            X.JfA r2 = r3.A00
            if (r2 == 0) goto L_0x0f24
            X.KNp r0 = r0.A00
            X.Loe r1 = r0.A0A
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.REELS_SHARE_SHEET_RECOMMEND_ON_FACEBOOK_ROW
            r1.EBQ(r2, r0)
            goto L_0x0013
        L_0x0bc1:
            if (r8 == 0) goto L_0x0f24
            android.content.res.Resources r1 = X.DbV.A05(r1)
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            java.lang.String r0 = r1.getString(r0)
            r8.setInlineSubtitle(r0)
        L_0x0bd1:
            X.JfA r0 = r3.A00
            if (r0 == 0) goto L_0x0f24
            android.widget.TextView r0 = r0.A07
            r0.setVisibility(r6)
            goto L_0x0ba4
        L_0x0bdb:
            if (r4 == 0) goto L_0x0f24
            r0 = 0
            X.LIi.A01(r4, r0)
            goto L_0x0013
        L_0x0be3:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            r0 = 19
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 20
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x0bf8:
            X.0eS.A00(r1)
            java.lang.Object r6 = r2.A02
            X.Lp3 r6 = (X.C65199Lp3) r6
            X.4DH r11 = r6.A01
            r11.getModuleName()
            X.KOn r9 = r6.A04
            X.Drk r2 = X.LSR.A04(r9)
            X.KHX r0 = r6.A00
            java.lang.String r7 = "shareToFbContainer"
            if (r0 == 0) goto L_0x0f24
            r4 = 1
            r8 = 0
            X.LIi.A01(r0, r4)
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0d94
            int r1 = r0.intValue()
            if (r1 == r8) goto L_0x0cb9
            if (r1 == r4) goto L_0x0c4b
            r0 = 2
            if (r1 == r0) goto L_0x0c39
            r0 = 3
            if (r1 != r0) goto L_0x0d94
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r4)
            X.KHX r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            r0 = 30
            X.LYD.A02(r1, r0, r6)
            goto L_0x0013
        L_0x0c39:
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r4)
            X.KHX r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            r0 = 29
            X.LYD.A02(r1, r0, r6)
            goto L_0x0013
        L_0x0c4b:
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r4)
            boolean r4 = r2.A04
            boolean r3 = r2.A07
            X.KHX r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L_0x0f24
            r1.setSubtitle(r0)
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            r0.setChecked(r4)
            X.KHX r2 = r6.A00
            if (r2 == 0) goto L_0x0f24
            X.FdO r0 = new X.FdO
            r0.<init>(r6, r8, r4, r3)
            r2.setOnToggleListener(r0)
            android.content.Context r1 = r11.requireContext()
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            java.lang.String r0 = X.JTQ.A0a(r1, r0)
            r2.setTitle(r0)
            X.KHX r2 = r6.A00
            if (r2 == 0) goto L_0x0f24
            android.content.Context r1 = r11.requireContext()
            r0 = 2131240251(0x7f08253b, float:1.8096832E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setProfileImage(r0)
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            android.view.View r4 = r0.A0F
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x0cb0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 == 0) goto L_0x0cb0
            X.4gb r3 = X.JTQ.A0C(r4)
            r2 = 2131442885(0x7f0b3cc5, float:1.8507822E38)
            r1 = 2131442920(0x7f0b3ce8, float:1.8507893E38)
            r0 = 4
            r3.A0C(r2, r0, r1, r0)
            r3.A0G(r4)
        L_0x0cb0:
            com.instagram.common.session.UserSession r1 = r6.A02
            X.JZY r0 = X.JZY.VIEW
            X.LPW.A02(r0, r1, r8)
            goto L_0x0013
        L_0x0cb9:
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r4)
            boolean r5 = r2.A04
            X.Ki8 r2 = r9.A0B(r4)
            if (r2 == 0) goto L_0x0cef
            r0 = 54
            X.LYG r1 = X.LYG.A01(r6, r2, r0)
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            r0.setShowDisabledState(r4)
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            r0.setEnableSwitchView(r8)
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.AnonymousClass0fU.A00(r1, r0)
            r9.A0C(r2, r4)
            com.instagram.common.session.UserSession r1 = r6.A02
            X.JZY r0 = X.JZY.UNAVAILABLE
        L_0x0cea:
            X.LPW.A02(r0, r1, r5)
            goto L_0x0013
        L_0x0cef:
            r0 = 0
            r3 = r0
            X.KHX r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            r1.setShowDisabledState(r8)
            X.KHX r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            r1.setEnableSwitchView(r4)
            X.KHX r12 = r6.A00
            if (r12 == 0) goto L_0x0f24
            android.content.Context r4 = r11.requireContext()
            r8 = 2131971783(0x7f134ec7, float:1.9580555E38)
            android.content.Context r1 = r11.requireContext()
            r10 = 2131961885(0x7f13281d, float:1.956048E38)
            java.lang.String r2 = X.JTQ.A0a(r1, r10)
            X.Ju9 r1 = r9.A0A()
            if (r1 == 0) goto L_0x0d92
            java.lang.String r1 = r1.A02
        L_0x0d1d:
            java.lang.String r1 = X.DbV.A0u(r4, r2, r1, r8)
            r12.setSubtitle(r1)
            X.KHX r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            r1.setOnClickListener(r0)
            X.KHX r2 = r6.A00
            if (r2 == 0) goto L_0x0f24
            X.Ju9 r1 = r9.A0A()
            if (r1 == 0) goto L_0x0d37
            java.lang.String r3 = r1.A04
        L_0x0d37:
            r2.setTitle(r3)
            android.content.Context r2 = r11.requireContext()
            r1 = 2131230991(0x7f08010f, float:1.807805E38)
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r1)
            if (r3 == 0) goto L_0x0d58
            X.Ju9 r1 = r9.A0A()
            if (r1 == 0) goto L_0x0d58
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x0d58
            X.KHX r1 = r6.A00
            if (r1 == 0) goto L_0x0f24
            r1.setProfileImage(r11, r2, r3)
        L_0x0d58:
            X.KHX r4 = r6.A00
            if (r4 == 0) goto L_0x0f24
            android.content.Context r3 = r11.requireContext()
            android.content.Context r1 = r11.requireContext()
            java.lang.String r2 = X.JTQ.A0a(r1, r10)
            X.Ju9 r1 = r9.A0A()
            if (r1 == 0) goto L_0x0d70
            java.lang.String r0 = r1.A02
        L_0x0d70:
            java.lang.String r0 = X.DbV.A0u(r3, r2, r0, r8)
            r4.setSubtitle(r0)
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            r0.setChecked(r5)
            X.KHX r2 = r6.A00
            if (r2 == 0) goto L_0x0f24
            r1 = 20
            X.LsA r0 = new X.LsA
            r0.<init>(r6, r1)
            r2.setOnToggleListener(r0)
            com.instagram.common.session.UserSession r1 = r6.A02
            X.JZY r0 = X.JZY.VIEW
            goto L_0x0cea
        L_0x0d92:
            r1 = r0
            goto L_0x0d1d
        L_0x0d94:
            X.KHX r0 = r6.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r8)
            goto L_0x0013
        L_0x0d9d:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            r0 = 21
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 22
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x0db2:
            X.0eS.A00(r1)
            java.lang.Object r5 = r2.A02
            X.LpU r5 = (X.C65224LpU) r5
            X.4DH r4 = r5.A01
            r4.getModuleName()
            X.KOn r8 = r5.A05
            X.Drk r1 = X.LSR.A04(r8)
            java.lang.Integer r0 = r1.A02
            if (r0 != 0) goto L_0x0de0
            r0 = -1
        L_0x0dc9:
            java.lang.String r7 = "shareToFbContainer"
            r3 = 1
            r11 = 0
            if (r0 == r11) goto L_0x0e59
            if (r0 == r3) goto L_0x0e3b
            r1 = 2
            if (r0 == r1) goto L_0x0e0f
            r2 = 3
            X.JfA r1 = r5.A00
            if (r0 == r2) goto L_0x0de5
            if (r1 == 0) goto L_0x0f24
            X.LIi.A01(r1, r11)
            goto L_0x0013
        L_0x0de0:
            int r0 = r0.intValue()
            goto L_0x0dc9
        L_0x0de5:
            if (r1 == 0) goto L_0x0f24
            X.LIi.A01(r1, r3)
            X.JfA r3 = r5.A00
            r2 = 0
            if (r3 == 0) goto L_0x0f24
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setInlineSubtitle(r0)
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            r0.setDescription(r2)
            X.JfA r1 = r5.A00
            if (r1 == 0) goto L_0x0f24
            r0 = 34
            X.LYD.A02(r1, r0, r5)
            goto L_0x0013
        L_0x0e0f:
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r3)
            X.JfA r3 = r5.A00
            r2 = 0
            if (r3 == 0) goto L_0x0f24
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setInlineSubtitle(r0)
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            r0.setDescription(r2)
            X.JfA r1 = r5.A00
            if (r1 == 0) goto L_0x0f24
            r0 = 33
            X.LYD.A02(r1, r0, r5)
            goto L_0x0013
        L_0x0e3b:
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r3)
            boolean r3 = r1.A04
            boolean r2 = r1.A07
            r0 = 2
            X.LXT r1 = new X.LXT
            r1.<init>(r5, r0, r3, r2)
            r0 = 0
            X.C65224LpU.A00(r1, r5, r0, r11)
            com.instagram.common.session.UserSession r1 = r5.A02
            X.JZY r0 = X.JZY.VIEW
            X.LPW.A02(r0, r1, r11)
            goto L_0x0013
        L_0x0e59:
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            X.LIi.A01(r0, r3)
            boolean r6 = r1.A04
            boolean r0 = r1.A07
            X.Ki8 r12 = r8.A0B(r3)
            if (r12 == 0) goto L_0x0e9d
            r0 = 55
            X.LYG r10 = X.LYG.A01(r5, r12, r0)
            X.JfA r9 = r5.A00
            r2 = 0
            if (r9 == 0) goto L_0x0f24
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131955756(0x7f13102c, float:1.9548048E38)
            java.lang.String r0 = r1.getString(r0)
            r9.setInlineSubtitle(r0)
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            r0.setDescription(r2)
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            X.AnonymousClass0fU.A00(r10, r0)
            r8.A0C(r12, r3)
            com.instagram.common.session.UserSession r1 = r5.A02
            X.JZY r0 = X.JZY.UNAVAILABLE
            X.LPW.A02(r0, r1, r6)
            goto L_0x0013
        L_0x0e9d:
            X.LXT r1 = new X.LXT
            r1.<init>(r5, r3, r6, r0)
            X.Ju9 r0 = r8.A0A()
            X.C65224LpU.A00(r1, r5, r0, r6)
            if (r6 == 0) goto L_0x0ef0
            X.L0v r1 = r5.A03
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            com.instagram.common.ui.base.IgSimpleImageView r10 = r0.A0B
            X.0qQ.A0B(r10, r11)
            X.KNp r0 = r1.A00
            X.LMT r9 = r0.A0B
            boolean r0 = r9.A00
            if (r0 != 0) goto L_0x0ef0
            com.instagram.common.session.UserSession r2 = r9.A01
            X.2D6 r0 = X.2D5.A00(r2)
            X.0xa r1 = r0.A04
            java.lang.String r0 = "PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP"
            boolean r0 = r1.getBoolean(r0, r11)
            if (r0 != 0) goto L_0x0ef0
            X.819 r1 = X.AnonymousClass819.TOOLTIP_SHARE_SHEET_CCP_REELS
            X.818 r0 = X.AnonymousClass818.IG_REELS_COMPOSER
            boolean r0 = X.C367998ru.A03(r0, r1, r2)
            if (r0 == 0) goto L_0x0ef0
            r9.A00 = r3
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131971860(0x7f134f14, float:1.9580711E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            X.2fy r2 = X.C226262fy.ABOVE_ANCHOR
            r1 = 6
            X.KSP r0 = new X.KSP
            r0.<init>(r9, r1)
            X.LMT.A00(r10, r9, r0, r2, r3)
        L_0x0ef0:
            com.instagram.common.session.UserSession r1 = r5.A02
            X.JZY r0 = X.JZY.VIEW
            X.LPW.A02(r0, r1, r6)
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0013
            X.MXh r2 = r5.A04
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0f24
            com.instagram.common.ui.base.IgSimpleImageView r1 = r0.A0B
            java.lang.String r0 = r4.getModuleName()
            r2.Ev2(r1, r0)
            goto L_0x0013
        L_0x0f0c:
            java.lang.Object r0 = A01(r1, r2)
            boolean r0 = r0 instanceof X.C61835KNz
            if (r0 == 0) goto L_0x0fdc
            java.lang.Object r0 = r2.A02
            X.Lp7 r0 = (X.C65202Lp7) r0
            X.LO1 r6 = r0.A05
            if (r6 == 0) goto L_0x0013
            com.instagram.common.session.UserSession r5 = r0.A02
            X.JfA r0 = r0.A00
            if (r0 != 0) goto L_0x0f2c
            java.lang.String r7 = "advancedSettingsRow"
        L_0x0f24:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0f2c:
            android.widget.TextView r4 = r0.A0A
            r3 = 1
            X.0qQ.A0B(r4, r3)
            X.5Gv r0 = r6.A00
            if (r0 != 0) goto L_0x0f64
            android.content.Context r2 = r4.getContext()
            X.JTO.A1Z(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131974357(0x7f1358d5, float:1.9585776E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            X.5Gt r1 = X.AnonymousClass7TG.A0f(r2, r0)
            r1.A0F = r3
            r1.A03(r4)
            r1.A01()
            r1.A0A = r3
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A00 = r0
            r0 = 11
            X.5Gv r0 = X.KSP.A00(r1, r5, r0)
            r6.A00 = r0
        L_0x0f64:
            if (r0 == 0) goto L_0x0fd7
            r0.A06()
            goto L_0x0013
        L_0x0f6b:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r1 = r2.A02
            r0 = 23
            X.MH9.A04(r1, r3, r0)
            goto L_0x0013
        L_0x0f7a:
            java.lang.Object r3 = A01(r1, r2)
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r2.A02
            X.LpZ r2 = (X.C65229LpZ) r2
            com.instagram.common.session.UserSession r0 = r2.A0J
            boolean r0 = X.LTP.A09(r0)
            if (r0 == 0) goto L_0x0013
            r0 = 24
            X.19B r1 = X.MH9.A01(r2, r3, r0)
            r0 = 25
            X.MH9.A03(r2, r1, r3, r0)
            r0 = 26
            X.MH9.A03(r2, r1, r3, r0)
            goto L_0x0013
        L_0x0f9e:
            java.lang.Object r1 = A01(r1, r2)
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
            r1.invoke(r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0fac:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fb1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fb6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fbb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fc0:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0fc8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fcd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fd2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fd7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0fdc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Size A00(Bitmap bitmap, Size size) {
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float min = Math.min(((float) size.getWidth()) / width, ((float) size.getHeight()) / height);
        return new Size((int) (width * min), (int) (height * min));
    }

    public static Object A01(Object obj, MGX mgx) {
        0eS.A00(obj);
        return mgx.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGX) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGX(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }
}
