package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.4gc  reason: invalid class name and case insensitive filesystem */
public final class C270364gc {
    public SparseArray A00;
    public SparseArray A01;
    public C21283XSo A02;
    public final ConstraintLayout A03;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x06f9 in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public C270364gc(android.content.Context r27, androidx.constraintlayout.widget.ConstraintLayout r28, int r29) {
        /*
            r26 = this;
            r12 = r26
            r12.<init>()
            r10 = -1
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r12.A01 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r12.A00 = r0
            r21 = 0
            r0 = r21
            r12.A02 = r0
            r0 = r28
            r12.A03 = r0
            r11 = r27
            android.content.res.Resources r0 = r11.getResources()
            r1 = r29
            android.content.res.XmlResourceParser r20 = r0.getXml(r1)
            r9 = 0
            int r1 = r20.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x002f:
            r8 = 1     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r1 == r8) goto L_0x08da     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r1 == 0) goto L_0x003b     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r18 = 2     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r18     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r1 != r0) goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x003f     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x003b:
            r20.getName()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x003f:
            java.lang.String r1 = r20.getName()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r1.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            switch(r0) {
                case -1349929691: goto L_0x004f;
                case 80204913: goto L_0x07a8;
                case 1901439077: goto L_0x082b;
                default: goto L_0x004a;
            }     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x004a:
            int r1 = r20.next()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x002f     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x004f:
            java.lang.String r19 = "ConstraintSet"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r19     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            X.4gb r17 = new X.4gb     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r17.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r4 = r20.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r2 = 0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x0063:
            if (r2 >= r4) goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r20     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r5 = r0.getAttributeName(r2)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r1 = r0.getAttributeValue(r2)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r5 == 0) goto L_0x00b0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r1 == 0) goto L_0x00b0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r3 = "id"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r3.equals(r5)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x00b0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r16 = "/"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r16     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r1.contains(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x00ae     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = 47     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r1.indexOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r0 + 1     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r4 = r1.substring(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = r11.getPackageName()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r7 = r2.getIdentifier(r4, r3, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r7 != r10) goto L_0x00ba     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x009f:
            int r0 = r1.length()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 <= r8) goto L_0x00b3     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = r1.substring(r8)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x00ba     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x00ae:
            r7 = -1     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x009f     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x00b0:
            int r2 = r2 + 1     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0063     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x00b3:
            java.lang.String r1 = "ConstraintLayoutStates"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = "error in parsing id"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.util.Log.e(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x00ba:
            int r0 = r20.getEventType()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1 = r21     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00c0:
            if (r0 == r8) goto L_0x079f     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0702     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = -1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r14 = 3     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r6 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2 = r18     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == r2) goto L_0x00cf     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 != r14) goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0706     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00cf:
            java.lang.String r2 = r20.getName()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            switch(r0) {
                case -2025855158: goto L_0x0137;
                case -1984451626: goto L_0x012d;
                case -1962203927: goto L_0x0123;
                case -1269513683: goto L_0x0119;
                case -1238332596: goto L_0x010f;
                case -71750448: goto L_0x0105;
                case 366511058: goto L_0x00fa;
                case 1331510167: goto L_0x00f0;
                case 1791837707: goto L_0x00e5;
                case 1803088381: goto L_0x00db;
                default: goto L_0x00da;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00da:
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00db:
            java.lang.String r0 = "Constraint"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00e5:
            java.lang.String r0 = "CustomAttribute"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00f0:
            java.lang.String r0 = "Barrier"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 3     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x00fa:
            java.lang.String r0 = "CustomMethod"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 9     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0105:
            java.lang.String r0 = "Guideline"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 2     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x010f:
            java.lang.String r0 = "Transform"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 5     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0119:
            java.lang.String r0 = "PropertySet"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 4     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0123:
            java.lang.String r0 = "ConstraintOverride"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x012d:
            java.lang.String r0 = "Motion"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 7     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0137:
            java.lang.String r0 = "Layout"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0140     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = 6     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0140:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r3) {
                case 0: goto L_0x06f9;
                case 1: goto L_0x06f0;
                case 2: goto L_0x06e1;
                case 3: goto L_0x06d4;
                case 4: goto L_0x0680;
                case 5: goto L_0x05e6;
                case 6: goto L_0x0306;
                case 7: goto L_0x024c;
                case 8: goto L_0x0147;
                case 9: goto L_0x0147;
                default: goto L_0x0145;
            }     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x0145:
            goto L_0x0717     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x0147:
            if (r1 == 0) goto L_0x0750     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.util.HashMap r0 = r1.A02     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r25 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r15 = r11.obtainStyledAttributes(r2, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r24 = r15.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r13 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2 = r13     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3 = r13     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r23 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0161:
            r0 = r24     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r5 >= r0) goto L_0x022e     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r4 = r15.getIndex(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r6) goto L_0x0189     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r13 = r15.getString(r4)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r13 == 0) goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r13.length()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 <= 0) goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            char r0 = r13.charAt(r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            char r4 = java.lang.Character.toUpperCase(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = r13.substring(r8)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r13 = X.002.A0D(r0, r4)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0189:
            r0 = 10     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x0195     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r13 = r15.getString(r4)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r23 = 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0195:
            if (r4 != r8) goto L_0x01a3     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r15.getBoolean(r4, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0j     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x01a3:
            if (r4 != r14) goto L_0x01b0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0C     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r15.getColor(r4, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x01b0:
            r0 = r18     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x01bf     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r15.getColor(r4, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x01bf:
            r0 = 7     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r22 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x01dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0u     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r22     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r2 = r15.getDimension(r4, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = android.util.TypedValue.applyDimension(r8, r2, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x01dd:
            r0 = 4     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x01ed     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0u     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r22     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r15.getDimension(r4, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x01ed:
            r0 = 5     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x01fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = 2143289344(0x7fc00000, float:NaN)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r15.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x01fd:
            r0 = 6     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x020b     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r15.getInteger(r4, r10)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x020b:
            r0 = 9     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x0216     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r2 = r15.getString(r4)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0216:
            r0 = 8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r4 != r0) goto L_0x022a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r3 = X.AnonymousClass05K.A15     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r15.getResourceId(r4, r10)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 != r10) goto L_0x0226     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r15.getInt(r4, r10)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0226:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x022a:
            int r5 = r5 + 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0161     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x022e:
            if (r13 == 0) goto L_0x0247     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r2 == 0) goto L_0x0247     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.9uS r4 = new X.9uS     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A04 = r13     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A03 = r3     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r23     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A07 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A00(r2)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r25     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0.put(r13, r4)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0247:
            r15.recycle()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x024c:
            if (r1 == 0) goto L_0x075e     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rj r4 = r1.A04     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A05     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r2, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0C = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r15 = r3.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0261:
            if (r2 >= r15) goto L_0x0301     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r5 = r3.getIndex(r2)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.SparseIntArray r0 = X.C320076rj.A0D     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r0.get(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            switch(r0) {
                case 1: goto L_0x02f5;
                case 2: goto L_0x02ec;
                case 3: goto L_0x02d4;
                case 4: goto L_0x02cd;
                case 5: goto L_0x02c4;
                case 6: goto L_0x02bb;
                case 7: goto L_0x02b2;
                case 8: goto L_0x02a9;
                case 9: goto L_0x02a0;
                case 10: goto L_0x0272;
                default: goto L_0x0270;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0270:
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0272:
            android.util.TypedValue r13 = r3.peekValue(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r13.type     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 != r8) goto L_0x0281     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getResourceId(r5, r10)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A08 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0281:
            int r0 = r13.type     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 != r14) goto L_0x029a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r13 = r3.getString(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0A = r13     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r16     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r13.indexOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 <= 0) goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getResourceId(r5, r10)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A08 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x029a:
            int r0 = r4.A08     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r3.getInteger(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02a0:
            float r0 = r4.A02     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02a9:
            int r0 = r4.A09     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInteger(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A09 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02b2:
            float r0 = r4.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02bb:
            int r0 = r4.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInteger(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02c4:
            int r0 = r4.A04     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A04 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02cd:
            int r0 = r3.getInt(r5, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A05 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02d4:
            android.util.TypedValue r0 = r3.peekValue(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r0.type     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 != r14) goto L_0x02e3     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = r3.getString(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02e0:
            r4.A0B = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02e3:
            java.lang.String[] r13 = X.VJI.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInteger(r5, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r13[r0]     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02e0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02ec:
            int r0 = r4.A06     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A06 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x02fd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02f5:
            float r0 = r4.A01     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x02fd:
            int r2 = r2 + 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0261     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0301:
            r3.recycle()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0306:
            if (r1 == 0) goto L_0x076c     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rk r4 = r1.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A04     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r2, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A12 = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r22 = r3.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x031b:
            r0 = r22     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r2 >= r0) goto L_0x05e1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r5 = r3.getIndex(r2)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.SparseIntArray r14 = X.C320086rk.A16     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r13 = r14.get(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            switch(r13) {
                case 1: goto L_0x05d5;
                case 2: goto L_0x05cc;
                case 3: goto L_0x05c3;
                case 4: goto L_0x05ba;
                case 5: goto L_0x05b3;
                case 6: goto L_0x05aa;
                case 7: goto L_0x05a1;
                case 8: goto L_0x045f;
                case 9: goto L_0x0598;
                case 10: goto L_0x058f;
                case 11: goto L_0x0586;
                case 12: goto L_0x057d;
                case 13: goto L_0x0574;
                case 14: goto L_0x056b;
                case 15: goto L_0x0562;
                case 16: goto L_0x0559;
                case 17: goto L_0x054f;
                case 18: goto L_0x0545;
                case 19: goto L_0x053b;
                case 20: goto L_0x0531;
                case 21: goto L_0x0527;
                case 22: goto L_0x051d;
                case 23: goto L_0x0513;
                case 24: goto L_0x0509;
                case 25: goto L_0x04ff;
                case 26: goto L_0x04f5;
                case 27: goto L_0x04eb;
                case 28: goto L_0x04e1;
                case 29: goto L_0x04d7;
                case 30: goto L_0x0455;
                case 31: goto L_0x04cd;
                case 32: goto L_0x04c3;
                case 33: goto L_0x04b9;
                case 34: goto L_0x04af;
                case 35: goto L_0x04a5;
                case 36: goto L_0x049b;
                case 37: goto L_0x0491;
                case 38: goto L_0x0487;
                case 39: goto L_0x047d;
                case 40: goto L_0x0473;
                case 41: goto L_0x046e;
                case 42: goto L_0x0469;
                default: goto L_0x032c;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x032c:
            switch(r13) {
                case 61: goto L_0x044b;
                case 62: goto L_0x0441;
                case 63: goto L_0x0437;
                default: goto L_0x032f;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x032f:
            r0 = 1065353216(0x3f800000, float:1.0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r15 = "   "     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            switch(r13) {
                case 69: goto L_0x042f;
                case 70: goto L_0x0427;
                case 71: goto L_0x041e;
                case 72: goto L_0x0414;
                case 73: goto L_0x040a;
                case 74: goto L_0x0402;
                case 75: goto L_0x03f8;
                case 76: goto L_0x03ee;
                case 77: goto L_0x03e4;
                case 78: goto L_0x03da;
                case 79: goto L_0x03d0;
                case 80: goto L_0x03c6;
                case 81: goto L_0x03bc;
                case 82: goto L_0x03b2;
                case 83: goto L_0x03a8;
                case 84: goto L_0x039e;
                case 85: goto L_0x0394;
                case 86: goto L_0x038a;
                case 87: goto L_0x0380;
                case 88: goto L_0x0376;
                case 89: goto L_0x036e;
                case 90: goto L_0x0364;
                case 91: goto L_0x035c;
                default: goto L_0x0336;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0336:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r13.<init>()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = "Unknown attribute 0x"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x033d:
            r13.append(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = java.lang.Integer.toHexString(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r13.append(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r13.append(r15)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r14.get(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r13.append(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r5 = r13.toString()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r19     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.Log.w(r0, r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x035c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r13.<init>()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = "unused attribute 0x"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x033d     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0364:
            boolean r0 = r4.A11     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r3.getBoolean(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A11 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x036e:
            java.lang.String r0 = r3.getString(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0x = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0376:
            boolean r0 = r4.A0z     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r3.getBoolean(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0z = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0380:
            boolean r0 = r4.A10     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r3.getBoolean(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A10 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x038a:
            int r0 = r4.A0v     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0v = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0394:
            int r0 = r4.A0X     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0X = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x039e:
            int r0 = r4.A0u     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0u = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03a8:
            int r0 = r4.A0W     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0W = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03b2:
            int r0 = r4.A0V     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0V = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03bc:
            int r0 = r4.A0t     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0t = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03c6:
            int r0 = r4.A08     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A08 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03d0:
            int r0 = r4.A0M     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0M = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03da:
            int r0 = r4.A0A     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0A = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03e4:
            int r0 = r4.A0B     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0B = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03ee:
            int r0 = r4.A0h     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0h = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x03f8:
            boolean r0 = r4.A13     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r3.getBoolean(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A13 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0402:
            java.lang.String r0 = r3.getString(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0y = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x040a:
            int r0 = r4.A0d     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0d = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0414:
            int r0 = r4.A0c     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0c = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x041e:
            java.lang.String r5 = "CURRENTLY UNSUPPORTED"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r19     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.Log.e(r0, r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0427:
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x042f:
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A07 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0437:
            float r0 = r4.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0441:
            int r0 = r4.A0G     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0G = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x044b:
            int r0 = r4.A0F     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0F = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0455:
            int r0 = r4.A0m     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0m = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x045f:
            int r0 = r4.A0J     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0J = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0469:
            X.C270354gb.A04(r3, r4, r5, r8)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x046e:
            X.C270354gb.A04(r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0473:
            int r0 = r4.A0s     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0s = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x047d:
            int r0 = r4.A0Y     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0Y = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0487:
            float r0 = r4.A06     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A06 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0491:
            float r0 = r4.A04     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A04 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x049b:
            float r0 = r4.A05     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A05 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04a5:
            int r0 = r4.A0r     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0r = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04af:
            int r0 = r4.A0q     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0q = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04b9:
            int r0 = r4.A0p     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0p = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04c3:
            int r0 = r4.A0o     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0o = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04cd:
            int r0 = r4.A0n     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0n = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04d7:
            int r0 = r4.A0l     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0l = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04e1:
            int r0 = r4.A0k     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0k = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04eb:
            int r0 = r4.A0j     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0j = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04f5:
            int r0 = r4.A0i     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0i = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x04ff:
            int r0 = r4.A0b     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0b = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0509:
            int r0 = r4.A0a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0a = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0513:
            int r0 = r4.A0Z     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0Z = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x051d:
            int r0 = r4.A0g     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getLayoutDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0g = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0527:
            int r0 = r4.A0e     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getLayoutDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0e = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0531:
            float r0 = r4.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x053b:
            float r0 = r4.A01     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0545:
            int r0 = r4.A0U     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelOffset(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0U = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x054f:
            int r0 = r4.A0T     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelOffset(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0T = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0559:
            int r0 = r4.A0S     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0S = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0562:
            int r0 = r4.A0R     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0R = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x056b:
            int r0 = r4.A0Q     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0574:
            int r0 = r4.A0P     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0P = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x057d:
            int r0 = r4.A0O     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0O = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0586:
            int r0 = r4.A0N     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0N = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x058f:
            int r0 = r4.A0L     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0L = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0598:
            int r0 = r4.A0K     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0K = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05a1:
            int r0 = r4.A0I     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelOffset(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0I = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05aa:
            int r0 = r4.A0H     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelOffset(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0H = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05b3:
            java.lang.String r0 = r3.getString(r5)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0w = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05ba:
            int r0 = r4.A0E     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0E = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05c3:
            int r0 = r4.A0D     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0D = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05cc:
            int r0 = r4.A0C     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.getDimensionPixelSize(r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A0C = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05dd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05d5:
            int r0 = r4.A09     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r3, r5, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r4.A09 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05dd:
            int r2 = r2 + 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x031b     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05e1:
            r3.recycle()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05e6:
            if (r1 == 0) goto L_0x077a     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rl r5 = r1.A06     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A08     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r2, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A0D = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r3 = r4.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x05fb:
            if (r2 >= r3) goto L_0x067b     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r6 = r4.getIndex(r2)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.SparseIntArray r0 = X.C320096rl.A0E     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r0.get(r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            switch(r0) {
                case 1: goto L_0x0670;
                case 2: goto L_0x0667;
                case 3: goto L_0x065e;
                case 4: goto L_0x0655;
                case 5: goto L_0x064c;
                case 6: goto L_0x0643;
                case 7: goto L_0x063a;
                case 8: goto L_0x0631;
                case 9: goto L_0x0628;
                case 10: goto L_0x0616;
                case 11: goto L_0x060b;
                case 12: goto L_0x061f;
                default: goto L_0x060a;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x060a:
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x060b:
            r5.A0C = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r5.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0616:
            float r0 = r5.A0A     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A0A = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x061f:
            int r0 = r5.A0B     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = X.C270354gb.A00(r4, r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A0B = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0628:
            float r0 = r5.A09     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A09 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0631:
            float r0 = r5.A08     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A08 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x063a:
            float r0 = r5.A07     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A07 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0643:
            float r0 = r5.A06     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A06 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x064c:
            float r0 = r5.A05     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A05 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0655:
            float r0 = r5.A04     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A04 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x065e:
            float r0 = r5.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A03 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0667:
            float r0 = r5.A02     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A02 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0678     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0670:
            float r0 = r5.A01     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A01 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0678:
            int r2 = r2 + 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x05fb     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x067b:
            r4.recycle()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0680:
            if (r1 == 0) goto L_0x0788     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6ri r5 = r1.A05     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A06     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r2, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A04 = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r3 = r4.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2 = 0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0695:
            if (r2 >= r3) goto L_0x06d0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r13 = r4.getIndex(r2)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r13 != r8) goto L_0x06a6     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r5.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x06cd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06a6:
            if (r13 != r6) goto L_0x06b7     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r5.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r4.getInt(r13, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A03 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int[] r13 = X.C270354gb.A04     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = r13[r0]     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A03 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x06cd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06b7:
            r0 = 4     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r13 != r0) goto L_0x06c3     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r5.A02     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r4.getInt(r13, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A02 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x06cd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06c3:
            if (r13 != r14) goto L_0x06cd     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r5.A01     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r5.A01 = r0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06cd:
            int r2 = r2 + 1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0695     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06d0:
            r4.recycle()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06d4:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rh r1 = X.C270354gb.A01(r11, r0, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rk r0 = r1.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0.A0f = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06e1:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rh r1 = X.C270354gb.A01(r11, r0, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rk r0 = r1.A03     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0.A14 = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0.A12 = r8     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06f0:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rh r1 = X.C270354gb.A01(r11, r0, r8)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x06f9:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            X.6rh r1 = X.C270354gb.A01(r11, r0, r6)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0702:
            r20.getName()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0706:
            java.lang.String r2 = r20.getName()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r2 = r2.toLowerCase(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            switch(r0) {
                case -2075718416: goto L_0x0738;
                case -190376483: goto L_0x072f;
                case 426575017: goto L_0x0726;
                case 2146106725: goto L_0x071d;
                default: goto L_0x0717;
            }     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0717:
            int r0 = r20.next()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x00c0     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x071d:
            java.lang.String r0 = "constraintset"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x079f     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0726:
            java.lang.String r0 = "constraintoverride"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0740     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x072f:
            java.lang.String r0 = "constraint"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0740     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0738:
            java.lang.String r0 = "guideline"     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0740:
            r0 = r17     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.util.HashMap r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r1.A00     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r2.put(r0, r1)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1 = r21     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0717     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0750:
            int r1 = r20.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0795     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x075e:
            int r1 = r20.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0795     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x076c:
            int r1 = r20.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0795     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x077a:
            int r1 = r20.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0795     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0788:
            int r1 = r20.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
        L_0x0795:
            throw r1     // Catch:{ XmlPullParserException -> 0x0796, IOException -> 0x079b, IOException | XmlPullParserException -> 0x08d6 }
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x079f     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = move-exception     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x079f:
            android.util.SparseArray r1 = r12.A00     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r17     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r1.put(r7, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x07a8:
            java.lang.String r0 = "State"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            X.Koj r9 = new X.Koj     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r9.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r9.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r9.A00 = r10     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r20)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A07     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r5 = r6.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r4 = 0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x07cd:
            if (r4 >= r5) goto L_0x081f     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r1 = r6.getIndex(r4)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = 0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r1 != r0) goto L_0x07df     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r9.A01     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r6.getResourceId(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r9.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x081c     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x07df:
            if (r1 != r8) goto L_0x081c     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r9.A00     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r6.getResourceId(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r9.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r9.A00     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r2 = r1.getResourceTypeName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r9.A00     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r1.getResourceName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = "layout"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x081c     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            X.4gb r3 = new X.4gb     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r9.A02 = r3     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r2 = r9.A00     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r11)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r21     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.view.View r0 = r1.inflate(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A0I(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x081c:
            int r4 = r4 + 1     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x07cd     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x081f:
            r6.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.util.SparseArray r1 = r12.A01     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r9.A01     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r1.put(r0, r9)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x082b:
            java.lang.String r0 = "Variant"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            X.Kon r3 = new X.Kon     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = 2143289344(0x7fc00000, float:NaN)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A02 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A04 = r10     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r20)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int[] r0 = X.C71482dO.A09     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r2 = r4.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r1 = 0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x0853:
            if (r1 >= r2) goto L_0x08ca     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r5 = r4.getIndex(r1)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = 0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r5 != r0) goto L_0x0898     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.A04     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r4.getResourceId(r5, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A04 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.Resources r5 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.A04     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r6 = r5.getResourceTypeName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.content.res.Resources r5 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r0 = r3.A04     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r5.getResourceName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.lang.String r0 = "layout"     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            boolean r0 = r0.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r0 == 0) goto L_0x08c7     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            X.4gb r6 = new X.4gb     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r6.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A05 = r6     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            int r7 = r3.A04     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r11)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = r21     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            android.view.View r0 = r5.inflate(r7, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r6.A0I(r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x08c7     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x0898:
            if (r5 != r8) goto L_0x08a3     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.A00     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r5, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x08c7     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x08a3:
            r0 = r18     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r5 != r0) goto L_0x08b0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.A02     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r5, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A02 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x08c7     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x08b0:
            r0 = 3     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r5 != r0) goto L_0x08bc     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.A01     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r5, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x08c7     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x08bc:
            r0 = 4     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r5 != r0) goto L_0x08c7     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r3.A03     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            float r0 = r4.getDimension(r5, r0)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r3.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x08c7:
            int r1 = r1 + 1     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x0853     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
        L_0x08ca:
            r4.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            if (r9 == 0) goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            java.util.ArrayList r0 = r9.A03     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0.add(r3)     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            goto L_0x004a     // Catch:{ IOException | XmlPullParserException -> 0x08d6 }
            r0 = move-exception
            r0.printStackTrace()
        L_0x08da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270364gc.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }
}
