package X;

public final class I4P {
    public static final I4P A00 = new Object();

    public static /* synthetic */ void A00(C52693Gb5 gb5) {
        if (gb5 != null) {
            C52754Gc7 gc7 = gb5.A03;
            if (gc7 != null) {
                G9w.A16(gc7.A08, C285965Tk.A01);
            }
            C52754Gc7 gc72 = gb5.A03;
            if (gc72 != null) {
                G9w.A16(gc72.A0E, C285965Tk.A01);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025f, code lost:
        if (r9 == -1) goto L_0x0261;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(android.view.inputmethod.HandwritingGesture r14, X.C52754Gc7 r15, X.C52693Gb5 r16, X.AnonymousClass5RG r17, X.0sP r18) {
        /*
            r13 = this;
            X.5Tq r6 = r15.A03
            r1 = 3
            if (r6 == 0) goto L_0x0058
            X.5Oz r2 = r15.A0C
            java.lang.Object r0 = r2.getValue()
            X.I1h r0 = (X.C56553I1h) r0
            if (r0 == 0) goto L_0x031d
            X.62f r0 = r0.A02
            X.62Y r0 = r0.A04
            X.5Tq r0 = r0.A03
        L_0x0015:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r14 instanceof android.view.inputmethod.SelectGesture
            r4 = r18
            if (r0 == 0) goto L_0x0059
            android.view.inputmethod.SelectGesture r14 = (android.view.inputmethod.SelectGesture) r14
            android.graphics.RectF r0 = r14.getSelectionArea()
            X.5VN r2 = X.I2D.A02(r0)
            int r0 = r14.getGranularity()
            r7 = 1
            boolean r1 = X.C51975G9x.A1Q(r0, r7)
            X.JRp r0 = X.C56487HzJ.A01
            long r5 = X.C56646I6b.A03(r15, r2, r0, r1)
        L_0x003a:
            boolean r0 = X.C285965Tk.A03(r5)
            if (r0 != 0) goto L_0x0194
            int r2 = X.C51965G9l.A04(r5)
            int r1 = X.C51968G9o.A02(r5)
            X.IGq r0 = new X.IGq
            r0.<init>(r2, r1)
            r4.invoke(r0)
            r0 = r16
            if (r16 == 0) goto L_0x0057
            r0.A0E(r7)
        L_0x0057:
            r1 = 1
        L_0x0058:
            return r1
        L_0x0059:
            boolean r0 = r14 instanceof android.view.inputmethod.DeleteGesture
            if (r0 == 0) goto L_0x0118
            android.view.inputmethod.DeleteGesture r14 = (android.view.inputmethod.DeleteGesture) r14
            int r0 = r14.getGranularity()
            r3 = 1
            boolean r5 = X.C51975G9x.A1Q(r0, r3)
            android.graphics.RectF r0 = r14.getDeletionArea()
            X.5VN r1 = X.I2D.A02(r0)
            X.JRp r0 = X.C56487HzJ.A01
            long r9 = X.C56646I6b.A03(r15, r1, r0, r5)
        L_0x0076:
            boolean r0 = X.C285965Tk.A03(r9)
            if (r0 != 0) goto L_0x0194
            r1 = 1
            if (r5 != r3) goto L_0x00c4
            int r3 = X.C51965G9l.A04(r9)
            int r2 = X.C51968G9o.A02(r9)
            r7 = 10
            if (r3 <= 0) goto L_0x0114
            int r8 = java.lang.Character.codePointBefore(r6, r3)
        L_0x008f:
            int r5 = r6.length()
            if (r2 >= r5) goto L_0x0099
            int r7 = java.lang.Character.codePointAt(r6, r2)
        L_0x0099:
            boolean r0 = X.C56646I6b.A05(r8)
            if (r0 == 0) goto L_0x00ec
            boolean r0 = java.lang.Character.isWhitespace(r7)
            if (r0 != 0) goto L_0x00af
            r0 = 160(0xa0, float:2.24E-43)
            if (r7 == r0) goto L_0x00af
            boolean r0 = X.C56646I6b.A04(r7)
            if (r0 == 0) goto L_0x00ec
        L_0x00af:
            int r0 = java.lang.Character.charCount(r8)
            int r3 = r3 - r0
            if (r3 == 0) goto L_0x00c0
            int r8 = java.lang.Character.codePointBefore(r6, r3)
            boolean r0 = X.C56646I6b.A05(r8)
            if (r0 != 0) goto L_0x00af
        L_0x00c0:
            long r9 = X.C3026964x.A00(r3, r2)
        L_0x00c4:
            r0 = 2
            X.JNY[] r5 = new X.JNY[r0]
            int r2 = X.C51968G9o.A02(r9)
            X.IGq r0 = new X.IGq
            r0.<init>(r2, r2)
            r3 = 0
            r5[r3] = r0
            int r2 = X.C285965Tk.A00(r9)
            int r0 = X.C285965Tk.A01(r9)
            int r2 = r2 - r0
            X.IGm r0 = new X.IGm
            r0.<init>(r2, r3)
        L_0x00e1:
            r5[r1] = r0
            X.IGj r0 = new X.IGj
            r0.<init>(r5)
            r4.invoke(r0)
            return r1
        L_0x00ec:
            boolean r0 = X.C56646I6b.A05(r7)
            if (r0 == 0) goto L_0x00c4
            boolean r0 = java.lang.Character.isWhitespace(r8)
            if (r0 != 0) goto L_0x0102
            r0 = 160(0xa0, float:2.24E-43)
            if (r8 == r0) goto L_0x0102
            boolean r0 = X.C56646I6b.A04(r8)
            if (r0 == 0) goto L_0x00c4
        L_0x0102:
            int r0 = java.lang.Character.charCount(r7)
            int r2 = r2 + r0
            if (r2 == r5) goto L_0x00c0
            int r7 = java.lang.Character.codePointAt(r6, r2)
            boolean r0 = X.C56646I6b.A05(r7)
            if (r0 != 0) goto L_0x0102
            goto L_0x00c0
        L_0x0114:
            r8 = 10
            goto L_0x008f
        L_0x0118:
            boolean r0 = r14 instanceof android.view.inputmethod.SelectRangeGesture
            if (r0 == 0) goto L_0x013f
            android.view.inputmethod.SelectRangeGesture r14 = (android.view.inputmethod.SelectRangeGesture) r14
            android.graphics.RectF r0 = r14.getSelectionStartArea()
            X.5VN r3 = X.I2D.A02(r0)
            android.graphics.RectF r0 = r14.getSelectionEndArea()
            X.5VN r2 = X.I2D.A02(r0)
            int r0 = r14.getGranularity()
            r7 = 1
            boolean r1 = X.C51975G9x.A1Q(r0, r7)
            X.JRp r0 = X.C56487HzJ.A01
            long r5 = X.C56646I6b.A02(r15, r3, r2, r0, r1)
            goto L_0x003a
        L_0x013f:
            boolean r0 = r14 instanceof android.view.inputmethod.DeleteRangeGesture
            if (r0 == 0) goto L_0x0166
            android.view.inputmethod.DeleteRangeGesture r14 = (android.view.inputmethod.DeleteRangeGesture) r14
            int r0 = r14.getGranularity()
            r3 = 1
            boolean r5 = X.C51975G9x.A1Q(r0, r3)
            android.graphics.RectF r0 = r14.getDeletionStartArea()
            X.5VN r2 = X.I2D.A02(r0)
            android.graphics.RectF r0 = r14.getDeletionEndArea()
            X.5VN r1 = X.I2D.A02(r0)
            X.JRp r0 = X.C56487HzJ.A01
            long r9 = X.C56646I6b.A02(r15, r2, r1, r0, r5)
            goto L_0x0076
        L_0x0166:
            boolean r0 = r14 instanceof android.view.inputmethod.JoinOrSplitGesture
            r7 = r17
            if (r0 == 0) goto L_0x01ec
            android.view.inputmethod.JoinOrSplitGesture r14 = (android.view.inputmethod.JoinOrSplitGesture) r14
            if (r17 == 0) goto L_0x0194
            android.graphics.PointF r0 = r14.getJoinOrSplitPoint()
            float r1 = r0.x
            float r0 = r0.y
            long r0 = X.C289325dP.A00(r1, r0)
            int r5 = X.C56646I6b.A00(r15, r7, r0)
            r0 = -1
            if (r5 == r0) goto L_0x0194
            java.lang.Object r0 = r2.getValue()
            X.I1h r0 = (X.C56553I1h) r0
            r1 = 1
            if (r0 == 0) goto L_0x019e
            X.62f r0 = r0.A02
            boolean r0 = X.C56646I6b.A06(r0, r5)
            if (r0 != r1) goto L_0x019e
        L_0x0194:
            android.view.inputmethod.HandwritingGesture r14 = (android.view.inputmethod.HandwritingGesture) r14
            java.lang.String r2 = r14.getFallbackText()
            if (r2 != 0) goto L_0x0320
            r1 = 3
            return r1
        L_0x019e:
            r3 = r5
        L_0x019f:
            if (r3 <= 0) goto L_0x01b5
            int r2 = java.lang.Character.codePointBefore(r6, r3)
            boolean r0 = java.lang.Character.isWhitespace(r2)
            if (r0 != 0) goto L_0x01af
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 != r0) goto L_0x01b5
        L_0x01af:
            int r0 = java.lang.Character.charCount(r2)
            int r3 = r3 - r0
            goto L_0x019f
        L_0x01b5:
            int r0 = r6.length()
            if (r5 >= r0) goto L_0x01cf
            int r2 = java.lang.Character.codePointAt(r6, r5)
            boolean r0 = java.lang.Character.isWhitespace(r2)
            if (r0 != 0) goto L_0x01c9
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 != r0) goto L_0x01cf
        L_0x01c9:
            int r0 = java.lang.Character.charCount(r2)
            int r5 = r5 + r0
            goto L_0x01b5
        L_0x01cf:
            long r9 = X.C3026964x.A00(r3, r5)
            boolean r0 = X.C285965Tk.A03(r9)
            if (r0 == 0) goto L_0x00c4
            int r3 = X.C51965G9l.A04(r9)
            java.lang.String r6 = " "
            r0 = 2
            X.JNY[] r5 = new X.JNY[r0]
            X.IGq r2 = new X.IGq
            r2.<init>(r3, r3)
            r0 = 0
            r5[r0] = r2
            goto L_0x02c0
        L_0x01ec:
            boolean r0 = r14 instanceof android.view.inputmethod.InsertGesture
            if (r0 == 0) goto L_0x021a
            android.view.inputmethod.InsertGesture r14 = (android.view.inputmethod.InsertGesture) r14
            if (r17 == 0) goto L_0x0194
            android.graphics.PointF r0 = r14.getInsertionPoint()
            float r1 = r0.x
            float r0 = r0.y
            long r0 = X.C289325dP.A00(r1, r0)
            int r5 = X.C56646I6b.A00(r15, r7, r0)
            r0 = -1
            if (r5 == r0) goto L_0x0194
            java.lang.Object r0 = r2.getValue()
            X.I1h r0 = (X.C56553I1h) r0
            r3 = 1
            if (r0 == 0) goto L_0x0301
            X.62f r0 = r0.A02
            boolean r0 = X.C56646I6b.A06(r0, r5)
            if (r0 != r3) goto L_0x0301
            goto L_0x0194
        L_0x021a:
            boolean r0 = r14 instanceof android.view.inputmethod.RemoveSpaceGesture
            if (r0 == 0) goto L_0x032b
            android.view.inputmethod.RemoveSpaceGesture r14 = (android.view.inputmethod.RemoveSpaceGesture) r14
            java.lang.Object r0 = r2.getValue()
            X.I1h r0 = (X.C56553I1h) r0
            if (r0 == 0) goto L_0x02fe
            X.62f r8 = r0.A02
        L_0x022a:
            android.graphics.PointF r0 = r14.getStartPoint()
            float r1 = r0.x
            float r0 = r0.y
            long r2 = X.C289325dP.A00(r1, r0)
            android.graphics.PointF r0 = r14.getEndPoint()
            float r1 = r0.x
            float r0 = r0.y
            long r0 = X.C289325dP.A00(r1, r0)
            X.4ch r5 = r15.A02()
            if (r8 == 0) goto L_0x0261
            if (r5 == 0) goto L_0x0261
            long r2 = r5.EKS(r2)
            long r0 = r5.EKS(r0)
            X.62d r5 = r8.A03
            int r8 = X.C56646I6b.A01(r7, r5, r2)
            int r9 = X.C56646I6b.A01(r7, r5, r0)
            r7 = -1
            if (r8 != r7) goto L_0x02c7
            if (r9 != r7) goto L_0x02ce
        L_0x0261:
            long r11 = X.C285965Tk.A01
        L_0x0263:
            boolean r0 = X.C285965Tk.A03(r11)
            if (r0 != 0) goto L_0x0194
            X.0rk r5 = new X.0rk
            r5.<init>()
            r10 = -1
            r5.A00 = r10
            X.0rk r9 = new X.0rk
            r9.<init>()
            r9.A00 = r10
            int r8 = X.C285965Tk.A01(r11)
            int r7 = X.C285965Tk.A00(r11)
            java.lang.CharSequence r0 = r6.subSequence(r8, r7)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "\\s+"
            X.11S r2 = new X.11S
            r2.<init>(r0)
            r1 = 41
            X.J6U r0 = new X.J6U
            r0.<init>(r1, r5, r9)
            java.lang.String r6 = r2.A02(r3, r0)
            int r5 = r5.A00
            if (r5 == r10) goto L_0x0194
            int r1 = r9.A00
            if (r1 == r10) goto L_0x0194
            int r3 = X.C51965G9l.A04(r11)
            int r2 = r3 + r5
            int r3 = r3 + r1
            int r0 = r6.length()
            int r7 = r7 - r8
            int r7 = r7 - r1
            int r0 = r0 - r7
            java.lang.String r6 = X.C51967G9n.A0q(r6, r5, r0)
            r0 = 2
            X.JNY[] r5 = new X.JNY[r0]
            r1 = 0
            X.IGq r0 = new X.IGq
            r0.<init>(r2, r3)
            r5[r1] = r0
            r1 = 1
        L_0x02c0:
            X.IGr r0 = new X.IGr
            r0.<init>((java.lang.String) r6, (int) r1)
            goto L_0x00e1
        L_0x02c7:
            if (r9 == r7) goto L_0x02cd
            int r8 = java.lang.Math.min(r8, r9)
        L_0x02cd:
            r9 = r8
        L_0x02ce:
            float r8 = r5.A04(r9)
            float r7 = r5.A03(r9)
            float r8 = r8 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r7
            float r7 = X.C289295dM.A01(r2)
            float r0 = X.C289295dM.A01(r0)
            float r3 = java.lang.Math.min(r7, r0)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r8 - r2
            float r0 = java.lang.Math.max(r7, r0)
            float r8 = r8 + r2
            X.5VN r2 = new X.5VN
            r2.<init>(r3, r1, r0, r8)
            r1 = 0
            X.JRp r0 = X.C56487HzJ.A00
            long r11 = r5.A09(r2, r0, r1)
            goto L_0x0263
        L_0x02fe:
            r8 = 0
            goto L_0x022a
        L_0x0301:
            java.lang.String r2 = r14.getTextToInsert()
            X.IGq r1 = new X.IGq
            r1.<init>(r5, r5)
            X.IGr r0 = new X.IGr
            r0.<init>((java.lang.String) r2, (int) r3)
            X.JNY[] r1 = new X.JNY[]{r1, r0}
            X.IGj r0 = new X.IGj
            r0.<init>(r1)
            r4.invoke(r0)
            goto L_0x0057
        L_0x031d:
            r0 = 0
            goto L_0x0015
        L_0x0320:
            r1 = 1
            X.IGr r0 = new X.IGr
            r0.<init>((java.lang.String) r2, (int) r1)
            r4.invoke(r0)
            r1 = 5
            return r1
        L_0x032b:
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4P.A01(android.view.inputmethod.HandwritingGesture, X.Gc7, X.Gb5, X.5RG, X.0sP):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.os.CancellationSignal r8, android.view.inputmethod.PreviewableHandwritingGesture r9, X.C52754Gc7 r10, X.C52693Gb5 r11) {
        /*
            r7 = this;
            X.5Tq r1 = r10.A03
            r4 = 0
            if (r1 == 0) goto L_0x0063
            X.I1h r0 = X.C52754Gc7.A00(r10)
            if (r0 == 0) goto L_0x00e6
            X.62f r0 = r0.A02
            X.62Y r0 = r0.A04
            X.5Tq r0 = r0.A03
        L_0x0011:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0063
            boolean r0 = r9 instanceof android.view.inputmethod.SelectGesture
            if (r0 == 0) goto L_0x0064
            android.view.inputmethod.SelectGesture r9 = (android.view.inputmethod.SelectGesture) r9
            if (r11 == 0) goto L_0x0058
            android.graphics.RectF r0 = r9.getSelectionArea()
            X.5VN r2 = X.I2D.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.C51975G9x.A1Q(r1, r0)
            X.JRp r0 = X.C56487HzJ.A01
            long r1 = X.C56646I6b.A03(r10, r2, r0, r1)
        L_0x0036:
            X.Gc7 r0 = r11.A03
            if (r0 == 0) goto L_0x003f
            X.5Oz r0 = r0.A0E
            X.G9w.A16(r0, r1)
        L_0x003f:
            X.Gc7 r0 = r11.A03
            if (r0 == 0) goto L_0x004a
            long r5 = X.C285965Tk.A01
            X.5Oz r0 = r0.A08
        L_0x0047:
            X.G9w.A16(r0, r5)
        L_0x004a:
            boolean r0 = X.C285965Tk.A03(r1)
            if (r0 != 0) goto L_0x0058
            X.C52693Gb5.A05(r11, r4)
            X.HL2 r0 = X.HL2.None
            X.C52693Gb5.A01(r0, r11)
        L_0x0058:
            if (r8 == 0) goto L_0x0062
            X.I9P r0 = new X.I9P
            r0.<init>(r11)
            r8.setOnCancelListener(r0)
        L_0x0062:
            r4 = 1
        L_0x0063:
            return r4
        L_0x0064:
            boolean r0 = r9 instanceof android.view.inputmethod.DeleteGesture
            if (r0 == 0) goto L_0x0095
            android.view.inputmethod.DeleteGesture r9 = (android.view.inputmethod.DeleteGesture) r9
            if (r11 == 0) goto L_0x0058
            android.graphics.RectF r0 = r9.getDeletionArea()
            X.5VN r2 = X.I2D.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.C51975G9x.A1Q(r1, r0)
            X.JRp r0 = X.C56487HzJ.A01
            long r1 = X.C56646I6b.A03(r10, r2, r0, r1)
        L_0x0083:
            X.Gc7 r0 = r11.A03
            if (r0 == 0) goto L_0x008c
            X.5Oz r0 = r0.A08
            X.G9w.A16(r0, r1)
        L_0x008c:
            X.Gc7 r0 = r11.A03
            if (r0 == 0) goto L_0x004a
            long r5 = X.C285965Tk.A01
            X.5Oz r0 = r0.A0E
            goto L_0x0047
        L_0x0095:
            boolean r0 = r9 instanceof android.view.inputmethod.SelectRangeGesture
            if (r0 == 0) goto L_0x00be
            android.view.inputmethod.SelectRangeGesture r9 = (android.view.inputmethod.SelectRangeGesture) r9
            if (r11 == 0) goto L_0x0058
            android.graphics.RectF r0 = r9.getSelectionStartArea()
            X.5VN r3 = X.I2D.A02(r0)
            android.graphics.RectF r0 = r9.getSelectionEndArea()
            X.5VN r2 = X.I2D.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.C51975G9x.A1Q(r1, r0)
            X.JRp r0 = X.C56487HzJ.A01
            long r1 = X.C56646I6b.A02(r10, r3, r2, r0, r1)
            goto L_0x0036
        L_0x00be:
            boolean r0 = r9 instanceof android.view.inputmethod.DeleteRangeGesture
            if (r0 == 0) goto L_0x0063
            android.view.inputmethod.DeleteRangeGesture r9 = (android.view.inputmethod.DeleteRangeGesture) r9
            if (r11 == 0) goto L_0x0058
            android.graphics.RectF r0 = r9.getDeletionStartArea()
            X.5VN r3 = X.I2D.A02(r0)
            android.graphics.RectF r0 = r9.getDeletionEndArea()
            X.5VN r2 = X.I2D.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.C51975G9x.A1Q(r1, r0)
            X.JRp r0 = X.C56487HzJ.A01
            long r1 = X.C56646I6b.A02(r10, r3, r2, r0, r1)
            goto L_0x0083
        L_0x00e6:
            r0 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4P.A02(android.os.CancellationSignal, android.view.inputmethod.PreviewableHandwritingGesture, X.Gc7, X.Gb5):boolean");
    }
}
