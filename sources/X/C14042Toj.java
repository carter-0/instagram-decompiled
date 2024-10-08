package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Toj  reason: case insensitive filesystem */
public final class C14042Toj {
    public int[] A00;
    public long[] A01;
    public boolean[] A02;
    public long[] A03;
    public final AnonymousClass4CR A04;

    /* JADX WARNING: Removed duplicated region for block: B:39:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(int r13, int r14, int r15) {
        /*
            r12 = this;
            r5 = r12
            X.4CR r3 = r12.A04
            r4 = r3
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            X.3AW r0 = r4.A0E
            int r2 = r0.A00()
            boolean[] r1 = r12.A02
            if (r1 != 0) goto L_0x007f
            r0 = 10
            if (r2 >= r0) goto L_0x0016
            r2 = 10
        L_0x0016:
            boolean[] r0 = new boolean[r2]
            r12.A02 = r0
        L_0x001a:
            X.3AW r0 = r4.A0E
            int r0 = r0.A00()
            if (r15 >= r0) goto L_0x008d
            int r2 = r4.A02
            r1 = 1073741824(0x40000000, float:2.0)
            r7 = r13
            r8 = r14
            if (r2 == 0) goto L_0x0068
            r0 = 1
            if (r2 == r0) goto L_0x0068
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            int r9 = android.view.View.MeasureSpec.getSize(r14)
            if (r0 == r1) goto L_0x003b
            int r9 = r3.BKY()
        L_0x003b:
            int r10 = r3.BaC()
            int r0 = r3.Ba8()
        L_0x0043:
            int r10 = r10 + r0
            r3 = 0
            int[] r0 = r12.A00
            if (r0 == 0) goto L_0x004b
            r3 = r0[r15]
        L_0x004b:
            java.util.List r2 = r4.A0J
            int r1 = r2.size()
        L_0x0051:
            if (r3 >= r1) goto L_0x008d
            java.lang.Object r6 = r2.get(r3)
            X.Tok r6 = (X.C14043Tok) r6
            int r0 = r6.A08
            r11 = 0
            if (r0 >= r9) goto L_0x0064
            r5.A06(r6, r7, r8, r9, r10, r11)
        L_0x0061:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0064:
            r5.A07(r6, r7, r8, r9, r10, r11)
            goto L_0x0061
        L_0x0068:
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            int r9 = android.view.View.MeasureSpec.getSize(r13)
            if (r0 == r1) goto L_0x0076
            int r9 = r3.BKY()
        L_0x0076:
            int r10 = r3.Ba9()
            int r0 = r3.BaB()
            goto L_0x0043
        L_0x007f:
            int r0 = r1.length
            if (r0 >= r2) goto L_0x0088
            int r0 = r0 * 2
            if (r0 < r2) goto L_0x0016
            r2 = r0
            goto L_0x0016
        L_0x0088:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            goto L_0x001a
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14042Toj.A0C(int, int, int):void");
    }

    private int A00(FlexItem flexItem, int i) {
        AnonymousClass4CR r5 = this.A04;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        int i2 = ((ViewGroup.LayoutParams) flexItem).height;
        C252553pI r52 = (C252553pI) r5;
        int A042 = C252553pI.A04(r52.A00, r52.A01, r5.BaC() + r5.Ba8() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i, i2, r52.A1Y());
        int size = View.MeasureSpec.getSize(A042);
        int BP7 = flexItem.BP7();
        if (size > BP7 || size < (BP7 = flexItem.BT6())) {
            return View.MeasureSpec.makeMeasureSpec(BP7, View.MeasureSpec.getMode(A042));
        }
        return A042;
    }

    private int A01(FlexItem flexItem, int i) {
        AnonymousClass4CR r5 = this.A04;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        int i2 = ((ViewGroup.LayoutParams) flexItem).width;
        C252553pI r52 = (C252553pI) r5;
        int A042 = C252553pI.A04(r52.A03, r52.A04, r5.Ba9() + r5.BaB() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i, i2, r52.A1X());
        int size = View.MeasureSpec.getSize(A042);
        int BPT = flexItem.BPT();
        if (size > BPT || size < (BPT = flexItem.BTI())) {
            return View.MeasureSpec.makeMeasureSpec(BPT, View.MeasureSpec.getMode(A042));
        }
        return A042;
    }

    private void A05(View view, int i, int i2, int i3) {
        long[] jArr = this.A01;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.A03;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    private void A06(C14043Tok tok, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        double d2;
        C14043Tok tok2 = tok;
        float f = tok2.A00;
        if (f > 0.0f) {
            int i8 = tok2.A08;
            int i9 = i8;
            int i10 = i3;
            if (i10 >= i8) {
                float f2 = ((float) (i3 - i9)) / f;
                int i11 = i4;
                tok2.A08 = i4 + tok2.A03;
                if (!z) {
                    tok2.A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
                }
                int i12 = 0;
                boolean z2 = false;
                int i13 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i12 >= tok2.A06) {
                        break;
                    }
                    int i14 = tok2.A04 + i12;
                    AnonymousClass4CR r10 = this.A04;
                    View Bm1 = r10.Bm1(i14);
                    if (!(Bm1 == null || Bm1.getVisibility() == 8)) {
                        FlexItem flexItem = (FlexItem) Bm1.getLayoutParams();
                        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) r10;
                        int i15 = flexboxLayoutManager.A02;
                        if (i15 == 0 || i15 == 1) {
                            int measuredWidth = Bm1.getMeasuredWidth();
                            long[] jArr = this.A03;
                            if (jArr != null) {
                                measuredWidth = (int) jArr[i14];
                            }
                            int measuredHeight = Bm1.getMeasuredHeight();
                            long[] jArr2 = this.A03;
                            if (jArr2 != null) {
                                measuredHeight = (int) (jArr2[i14] >> 32);
                            }
                            boolean[] zArr = this.A02;
                            if (!zArr[i14]) {
                                float B6V = flexItem.B6V();
                                if (B6V > 0.0f) {
                                    float f4 = ((float) measuredWidth) + (B6V * f2);
                                    if (i12 == tok2.A06 - 1) {
                                        f4 += f3;
                                        f3 = 0.0f;
                                    }
                                    int round = Math.round(f4);
                                    int BPT = flexItem.BPT();
                                    if (round > BPT) {
                                        round = BPT;
                                        zArr[i14] = true;
                                        tok2.A00 -= B6V;
                                        z2 = true;
                                    } else {
                                        f3 += f4 - ((float) round);
                                        double d3 = (double) f3;
                                        if (d3 > 1.0d) {
                                            round++;
                                            d = d3 - 1.0d;
                                        } else if (d3 < -1.0d) {
                                            round--;
                                            d = d3 + 1.0d;
                                        }
                                        f3 = (float) d;
                                    }
                                    int A002 = A00(flexItem, tok2.A0A);
                                    int A042 = C13988Tno.A04(round);
                                    Bm1.measure(A042, A002);
                                    measuredWidth = Bm1.getMeasuredWidth();
                                    measuredHeight = Bm1.getMeasuredHeight();
                                    A05(Bm1, i14, A042, A002);
                                    flexboxLayoutManager.A0A.put(i14, Bm1);
                                }
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                            i13 = Math.max(i13, C13988Tno.A0B(marginLayoutParams, measuredHeight) + r10.Avg(Bm1));
                            i5 = tok2.A08;
                            i6 = measuredWidth + marginLayoutParams.leftMargin;
                            i7 = marginLayoutParams.rightMargin;
                        } else {
                            int measuredHeight2 = Bm1.getMeasuredHeight();
                            long[] jArr3 = this.A03;
                            if (jArr3 != null) {
                                measuredHeight2 = (int) (jArr3[i14] >> 32);
                            }
                            int measuredWidth2 = Bm1.getMeasuredWidth();
                            long[] jArr4 = this.A03;
                            if (jArr4 != null) {
                                measuredWidth2 = (int) jArr4[i14];
                            }
                            boolean[] zArr2 = this.A02;
                            if (!zArr2[i14]) {
                                float B6V2 = flexItem.B6V();
                                if (B6V2 > 0.0f) {
                                    float f5 = ((float) measuredHeight2) + (B6V2 * f2);
                                    if (i12 == tok2.A06 - 1) {
                                        f5 += f3;
                                        f3 = 0.0f;
                                    }
                                    int round2 = Math.round(f5);
                                    int BP7 = flexItem.BP7();
                                    if (round2 > BP7) {
                                        round2 = BP7;
                                        zArr2[i14] = true;
                                        tok2.A00 -= B6V2;
                                        z2 = true;
                                    } else {
                                        f3 += f5 - ((float) round2);
                                        double d4 = (double) f3;
                                        if (d4 > 1.0d) {
                                            round2++;
                                            d2 = d4 - 1.0d;
                                        } else if (d4 < -1.0d) {
                                            round2--;
                                            d2 = d4 + 1.0d;
                                        }
                                        f3 = (float) d2;
                                    }
                                    int A012 = A01(flexItem, tok2.A0A);
                                    int A043 = C13988Tno.A04(round2);
                                    Bm1.measure(A012, A043);
                                    measuredWidth2 = Bm1.getMeasuredWidth();
                                    measuredHeight2 = Bm1.getMeasuredHeight();
                                    A05(Bm1, i14, A012, A043);
                                    flexboxLayoutManager.A0A.put(i14, Bm1);
                                }
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) flexItem;
                            i13 = Math.max(i13, measuredWidth2 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + r10.Avg(Bm1));
                            i5 = tok2.A08;
                            i6 = measuredHeight2 + marginLayoutParams2.topMargin;
                            i7 = marginLayoutParams2.bottomMargin;
                        }
                        tok2.A08 = i5 + i6 + i7;
                        tok2.A02 = Math.max(tok2.A02, i13);
                    }
                    i12++;
                }
                if (z2 && i9 != tok2.A08) {
                    A06(tok2, i, i2, i10, i11, true);
                }
            }
        }
    }

    private void A07(C14043Tok tok, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        C14043Tok tok2 = tok;
        int i8 = tok2.A08;
        float f = tok2.A01;
        if (f > 0.0f) {
            int i9 = i3;
            if (i9 <= i8) {
                float f2 = ((float) (i8 - i3)) / f;
                int i10 = i4;
                tok2.A08 = i4 + tok2.A03;
                if (!z) {
                    tok2.A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
                }
                int i11 = 0;
                boolean z2 = false;
                int i12 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i11 >= tok2.A06) {
                        break;
                    }
                    int i13 = tok2.A04 + i11;
                    AnonymousClass4CR r10 = this.A04;
                    View Bm1 = r10.Bm1(i13);
                    if (!(Bm1 == null || Bm1.getVisibility() == 8)) {
                        FlexItem flexItem = (FlexItem) Bm1.getLayoutParams();
                        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) r10;
                        int i14 = flexboxLayoutManager.A02;
                        if (i14 == 0 || i14 == 1) {
                            int measuredWidth = Bm1.getMeasuredWidth();
                            long[] jArr = this.A03;
                            if (jArr != null) {
                                measuredWidth = (int) jArr[i13];
                            }
                            int measuredHeight = Bm1.getMeasuredHeight();
                            long[] jArr2 = this.A03;
                            if (jArr2 != null) {
                                measuredHeight = (int) (jArr2[i13] >> 32);
                            }
                            boolean[] zArr = this.A02;
                            if (!zArr[i13]) {
                                float B6W = flexItem.B6W();
                                if (B6W > 0.0f) {
                                    float f4 = ((float) measuredWidth) - (B6W * f2);
                                    if (i11 == tok2.A06 - 1) {
                                        f4 += f3;
                                        f3 = 0.0f;
                                    }
                                    int round = Math.round(f4);
                                    int BTI = flexItem.BTI();
                                    if (round < BTI) {
                                        round = BTI;
                                        zArr[i13] = true;
                                        tok2.A01 -= B6W;
                                        z2 = true;
                                    } else {
                                        f3 += f4 - ((float) round);
                                        double d = (double) f3;
                                        if (d > 1.0d) {
                                            round++;
                                            f3 -= 1.0f;
                                        } else if (d < -1.0d) {
                                            round--;
                                            f3 += 1.0f;
                                        }
                                    }
                                    int A002 = A00(flexItem, tok2.A0A);
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, SN3.MAX_SIGNED_POWER_OF_TWO);
                                    Bm1.measure(makeMeasureSpec, A002);
                                    measuredWidth = Bm1.getMeasuredWidth();
                                    measuredHeight = Bm1.getMeasuredHeight();
                                    A05(Bm1, i13, makeMeasureSpec, A002);
                                    flexboxLayoutManager.A0A.put(i13, Bm1);
                                }
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                            i12 = Math.max(i12, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + r10.Avg(Bm1));
                            i5 = tok2.A08;
                            i6 = measuredWidth + marginLayoutParams.leftMargin;
                            i7 = marginLayoutParams.rightMargin;
                        } else {
                            int measuredHeight2 = Bm1.getMeasuredHeight();
                            long[] jArr3 = this.A03;
                            if (jArr3 != null) {
                                measuredHeight2 = (int) (jArr3[i13] >> 32);
                            }
                            int measuredWidth2 = Bm1.getMeasuredWidth();
                            long[] jArr4 = this.A03;
                            if (jArr4 != null) {
                                measuredWidth2 = (int) jArr4[i13];
                            }
                            boolean[] zArr2 = this.A02;
                            if (!zArr2[i13]) {
                                float B6W2 = flexItem.B6W();
                                if (B6W2 > 0.0f) {
                                    float f5 = ((float) measuredHeight2) - (B6W2 * f2);
                                    if (i11 == tok2.A06 - 1) {
                                        f5 += f3;
                                        f3 = 0.0f;
                                    }
                                    int round2 = Math.round(f5);
                                    int BT6 = flexItem.BT6();
                                    if (round2 < BT6) {
                                        round2 = BT6;
                                        zArr2[i13] = true;
                                        tok2.A01 -= B6W2;
                                        z2 = true;
                                    } else {
                                        f3 += f5 - ((float) round2);
                                        double d2 = (double) f3;
                                        if (d2 > 1.0d) {
                                            round2++;
                                            f3 -= 1.0f;
                                        } else if (d2 < -1.0d) {
                                            round2--;
                                            f3 += 1.0f;
                                        }
                                    }
                                    int A012 = A01(flexItem, tok2.A0A);
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, SN3.MAX_SIGNED_POWER_OF_TWO);
                                    Bm1.measure(A012, makeMeasureSpec2);
                                    measuredWidth2 = Bm1.getMeasuredWidth();
                                    measuredHeight2 = Bm1.getMeasuredHeight();
                                    A05(Bm1, i13, A012, makeMeasureSpec2);
                                    flexboxLayoutManager.A0A.put(i13, Bm1);
                                }
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) flexItem;
                            i12 = Math.max(i12, measuredWidth2 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + r10.Avg(Bm1));
                            i5 = tok2.A08;
                            i6 = measuredHeight2 + marginLayoutParams2.topMargin;
                            i7 = marginLayoutParams2.bottomMargin;
                        }
                        tok2.A08 = i5 + i6 + i7;
                        tok2.A02 = Math.max(tok2.A02, i12);
                    }
                    i11++;
                }
                if (z2 && i8 != tok2.A08) {
                    A07(tok2, i, i2, i9, i10, true);
                }
            }
        }
    }

    public final void A08(int i) {
        int[] copyOf;
        int[] iArr = this.A00;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            copyOf = new int[i];
        } else {
            int length = iArr.length;
            if (length < i) {
                int i2 = length * 2;
                if (i2 >= i) {
                    i = i2;
                }
                copyOf = Arrays.copyOf(iArr, i);
            } else {
                return;
            }
        }
        this.A00 = copyOf;
    }

    public final void A09(int i) {
        long[] copyOf;
        long[] jArr = this.A01;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            copyOf = new long[i];
        } else {
            int length = jArr.length;
            if (length < i) {
                int i2 = length * 2;
                if (i2 >= i) {
                    i = i2;
                }
                copyOf = Arrays.copyOf(jArr, i);
            } else {
                return;
            }
        }
        this.A01 = copyOf;
    }

    public final void A0A(int i) {
        long[] copyOf;
        long[] jArr = this.A03;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            copyOf = new long[i];
        } else {
            int length = jArr.length;
            if (length < i) {
                int i2 = length * 2;
                if (i2 >= i) {
                    i = i2;
                }
                copyOf = Arrays.copyOf(jArr, i);
            } else {
                return;
            }
        }
        this.A03 = copyOf;
    }

    public final void A0B(int i) {
        int i2;
        View Bm1;
        AnonymousClass4CR r7 = this.A04;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) r7;
        if (i < flexboxLayoutManager.A0E.A00()) {
            int i3 = flexboxLayoutManager.A02;
            if (flexboxLayoutManager.A00 == 4) {
                int[] iArr = this.A00;
                if (iArr != null) {
                    i2 = iArr[i];
                } else {
                    i2 = 0;
                }
                List list = flexboxLayoutManager.A0J;
                int size = list.size();
                while (i2 < size) {
                    C14043Tok tok = (C14043Tok) list.get(i2);
                    int i4 = tok.A06;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = tok.A04 + i5;
                        if (!(i5 >= flexboxLayoutManager.A0E.A00() || (Bm1 = r7.Bm1(i6)) == null || Bm1.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) Bm1.getLayoutParams();
                            if (flexItem.Aag() == -1 || flexItem.Aag() == 4) {
                                if (i3 == 0 || i3 == 1) {
                                    A04(Bm1, tok.A02, i6);
                                } else {
                                    A03(Bm1, tok.A02, i6);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C14043Tok tok2 : flexboxLayoutManager.A0J) {
                for (Number intValue : tok2.A0B) {
                    int intValue2 = intValue.intValue();
                    View Bm12 = r7.Bm1(intValue2);
                    if (i3 == 0 || i3 == 1) {
                        A04(Bm12, tok2.A02, intValue2);
                    } else {
                        A03(Bm12, tok2.A02, intValue2);
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0219: MOVE  (r0v86 int) = (r27v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x022d  */
    public final void A0F(X.C17190VLu r29, java.util.List r30, int r31, int r32, int r33, int r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r33
            r12 = r30
            X.4CR r13 = r15.A04
            boolean r25 = r13.CWo()
            int r24 = android.view.View.MeasureSpec.getMode(r31)
            int r23 = android.view.View.MeasureSpec.getSize(r31)
            if (r30 != 0) goto L_0x001b
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x001b:
            r0 = r29
            r0.A00 = r12
            r1 = -1
            r22 = 0
            r27 = r34
            r0 = r27
            if (r0 != r1) goto L_0x002a
            r22 = 1
        L_0x002a:
            if (r25 == 0) goto L_0x0397
            r0 = r13
            X.3pI r0 = (X.C252553pI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            if (r0 == 0) goto L_0x0394
            int r1 = r0.getPaddingStart()
        L_0x0037:
            if (r25 == 0) goto L_0x038e
            r0 = r13
            X.3pI r0 = (X.C252553pI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            if (r0 == 0) goto L_0x038b
            int r11 = r0.getPaddingEnd()
        L_0x0044:
            if (r25 == 0) goto L_0x037a
            int r21 = r13.BaC()
        L_0x004a:
            if (r25 == 0) goto L_0x0369
            int r16 = r13.Ba8()
        L_0x0050:
            X.Tok r10 = new X.Tok
            r10.<init>()
            r10.A04 = r14
            int r11 = r11 + r1
            r10.A08 = r11
            r9 = r13
            com.google.android.flexbox.FlexboxLayoutManager r9 = (com.google.android.flexbox.FlexboxLayoutManager) r9
            X.3AW r0 = r9.A0E
            int r20 = r0.A00()
            r8 = 0
            r19 = 0
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0068:
            r0 = r20
            if (r14 >= r0) goto L_0x022c
            android.view.View r7 = r13.Bm1(r14)
            if (r7 == 0) goto L_0x0086
            int r1 = r7.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x009c
            int r0 = r10.A05
            int r0 = r0 + 1
            r10.A05 = r0
            int r0 = r10.A06
            int r0 = r0 + 1
            r10.A06 = r0
        L_0x0086:
            r0 = 1
            int r0 = r20 - r0
            if (r14 != r0) goto L_0x0099
            int r1 = r10.A06
            int r0 = r10.A05
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x0099
            r10.A0A = r8
            r10.A07 = r14
            r12.add(r10)
        L_0x0099:
            int r14 = r14 + 1
            goto L_0x0068
        L_0x009c:
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r6 = (com.google.android.flexbox.FlexItem) r6
            int r1 = r6.Aag()
            r0 = 4
            if (r1 != r0) goto L_0x00b2
            java.util.List r1 = r10.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r1.add(r0)
        L_0x00b2:
            r0 = r6
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            if (r25 == 0) goto L_0x0365
            int r0 = r0.width
        L_0x00b9:
            r17 = r0
            float r1 = r6.B6U()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r24
            if (r0 != r1) goto L_0x00d7
            r0 = r23
            float r1 = (float) r0
            float r0 = r6.B6U()
            float r1 = r1 * r0
            int r17 = java.lang.Math.round(r1)
        L_0x00d7:
            if (r25 == 0) goto L_0x0322
            r2 = r6
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.leftMargin
            int r4 = r11 + r0
            int r0 = r2.rightMargin
            int r4 = r4 + r0
            int r0 = r9.A03
            r1 = r0
            int r0 = r9.A04
            boolean r5 = r9.A1X()
            r3 = r1
            r1 = r0
            r0 = r17
            int r4 = X.C252553pI.A04(r3, r1, r4, r0, r5)
            int r3 = r21 + r16
            int r0 = r2.topMargin
            int r3 = r3 + r0
            int r0 = r2.bottomMargin
            int r3 = r3 + r0
            int r3 = r3 + r8
            r0 = r6
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            int r0 = r0.height
            r1 = r0
            int r0 = r9.A00
            int r5 = r9.A01
            boolean r2 = r9.A1Y()
            int r0 = X.C252553pI.A04(r0, r5, r3, r1, r2)
            r7.measure(r4, r0)
            r15.A05(r7, r14, r4, r0)
        L_0x0115:
            android.util.SparseArray r0 = r9.A0A
            r0.put(r14, r7)
            r15.A02(r7, r14)
            int r1 = r7.getMeasuredState()
            r0 = r19
            int r19 = android.view.View.combineMeasuredStates(r0, r1)
            int r2 = r10.A08
            if (r25 == 0) goto L_0x0317
            int r1 = r7.getMeasuredWidth()
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.leftMargin
        L_0x0134:
            int r1 = r1 + r0
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r25 == 0) goto L_0x0313
            int r3 = r0.rightMargin
        L_0x013c:
            int r3 = r3 + r1
            int r5 = r12.size()
            int r0 = r9.A03
            if (r0 == 0) goto L_0x0156
            boolean r0 = r6.Cex()
            if (r0 != 0) goto L_0x0276
            if (r24 == 0) goto L_0x0156
            int r1 = r9.A07
            r0 = -1
            if (r1 == r0) goto L_0x025f
            int r0 = r5 + 1
            if (r1 > r0) goto L_0x025f
        L_0x0156:
            int r0 = r10.A06
            int r0 = r0 + 1
            r10.A06 = r0
        L_0x015c:
            int[] r1 = r15.A00
            if (r1 == 0) goto L_0x0166
            int r0 = r12.size()
            r1[r14] = r0
        L_0x0166:
            int r1 = r10.A08
            if (r25 == 0) goto L_0x0254
            int r2 = r7.getMeasuredWidth()
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.leftMargin
        L_0x0173:
            int r2 = r2 + r0
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r25 == 0) goto L_0x0250
            int r0 = r0.rightMargin
        L_0x017b:
            int r2 = r2 + r0
            int r1 = r1 + r2
            r10.A08 = r1
            float r1 = r10.A00
            float r0 = r6.B6V()
            float r1 = r1 + r0
            r10.A00 = r1
            float r1 = r10.A01
            float r0 = r6.B6W()
            float r1 = r1 + r0
            r10.A01 = r1
            android.graphics.Rect r0 = com.google.android.flexbox.FlexboxLayoutManager.A0P
            r9.A0k(r7, r0)
            boolean r0 = r9.CWo()
            if (r0 == 0) goto L_0x023a
            int r1 = X.C252553pI.A05(r7)
            int r0 = X.C252553pI.A07(r7)
        L_0x01a4:
            int r1 = r1 + r0
            int r0 = r10.A08
            int r0 = r0 + r1
            r10.A08 = r0
            int r0 = r10.A03
            int r0 = r0 + r1
            r10.A03 = r0
            if (r25 == 0) goto L_0x0230
            int r1 = r7.getMeasuredHeight()
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
        L_0x01ba:
            int r1 = r1 + r0
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r25 == 0) goto L_0x022d
            int r0 = r0.bottomMargin
        L_0x01c2:
            int r1 = r1 + r0
            int r0 = r13.Avg(r7)
            int r1 = r1 + r0
            r0 = r18
            int r18 = java.lang.Math.max(r0, r1)
            int r1 = r10.A02
            r0 = r18
            int r0 = java.lang.Math.max(r1, r0)
            r10.A02 = r0
            if (r25 == 0) goto L_0x01eb
            int r2 = r10.A09
            int r1 = r7.getBaseline()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r0 = r6.topMargin
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r2, r1)
            r10.A09 = r0
        L_0x01eb:
            r2 = 1
            int r0 = r20 - r2
            if (r14 != r0) goto L_0x0201
            int r1 = r10.A06
            int r0 = r10.A05
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x0201
            r10.A0A = r8
            r10.A07 = r14
            r12.add(r10)
            int r0 = r10.A02
            int r8 = r8 + r0
        L_0x0201:
            r1 = -1
            r0 = r27
            if (r0 == r1) goto L_0x0226
            int r0 = r12.size()
            if (r0 <= 0) goto L_0x0226
            int r0 = r12.size()
            int r0 = r0 - r2
            java.lang.Object r0 = r12.get(r0)
            X.Tok r0 = (X.C14043Tok) r0
            int r1 = r0.A07
            r0 = r27
            if (r1 < r0) goto L_0x0226
            if (r14 < r0) goto L_0x0226
            if (r22 != 0) goto L_0x0226
            int r0 = r10.A02
            int r8 = -r0
            r22 = 1
        L_0x0226:
            r0 = r32
            if (r8 <= r0) goto L_0x0099
            if (r22 == 0) goto L_0x0099
        L_0x022c:
            return
        L_0x022d:
            int r0 = r0.rightMargin
            goto L_0x01c2
        L_0x0230:
            int r1 = r7.getMeasuredWidth()
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.leftMargin
            goto L_0x01ba
        L_0x023a:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r0 = r0.A02
            int r1 = r0.top
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r0 = r0.A02
            int r0 = r0.bottom
            goto L_0x01a4
        L_0x0250:
            int r0 = r0.bottomMargin
            goto L_0x017b
        L_0x0254:
            int r2 = r7.getMeasuredHeight()
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            goto L_0x0173
        L_0x025f:
            boolean r0 = r9.CWo()
            if (r0 == 0) goto L_0x02fd
            int r1 = X.C252553pI.A05(r7)
            int r0 = X.C252553pI.A07(r7)
        L_0x026d:
            int r1 = r1 + r0
            if (r1 <= 0) goto L_0x0271
            int r3 = r3 + r1
        L_0x0271:
            int r2 = r2 + r3
            r0 = r23
            if (r0 >= r2) goto L_0x0156
        L_0x0276:
            int r1 = r10.A06
            int r0 = r10.A05
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x028c
            r0 = 0
            if (r14 <= 0) goto L_0x0282
            int r0 = r14 + -1
        L_0x0282:
            r10.A0A = r8
            r10.A07 = r0
            r12.add(r10)
            int r0 = r10.A02
            int r8 = r8 + r0
        L_0x028c:
            r0 = r6
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            if (r25 == 0) goto L_0x02d0
            int r1 = r0.height
            r0 = -1
            if (r1 != r0) goto L_0x02c0
            int r5 = r13.BaC()
            int r0 = r13.Ba8()
            int r5 = r5 + r0
            r1 = r6
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.topMargin
            int r5 = r5 + r0
            int r0 = r1.bottomMargin
            int r5 = r5 + r0
            int r5 = r5 + r8
            r0 = r6
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            int r3 = r0.height
            int r2 = r9.A00
            int r1 = r9.A01
            boolean r0 = r9.A1Y()
            int r0 = X.C252553pI.A04(r2, r1, r5, r3, r0)
            r7.measure(r4, r0)
        L_0x02bd:
            r15.A02(r7, r14)
        L_0x02c0:
            X.Tok r10 = new X.Tok
            r10.<init>()
            r0 = 1
            r10.A06 = r0
            r10.A08 = r11
            r10.A04 = r14
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x015c
        L_0x02d0:
            int r1 = r0.width
            r0 = -1
            if (r1 != r0) goto L_0x02c0
            int r5 = r13.Ba9()
            int r0 = r13.BaB()
            int r5 = r5 + r0
            r1 = r6
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r5 = r5 + r0
            int r0 = r1.rightMargin
            int r5 = r5 + r0
            int r5 = r5 + r8
            r0 = r6
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            int r3 = r0.width
            int r2 = r9.A03
            int r1 = r9.A04
            boolean r0 = r9.A1X()
            int r0 = X.C252553pI.A04(r2, r1, r5, r3, r0)
            r7.measure(r0, r4)
            goto L_0x02bd
        L_0x02fd:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r0 = r0.A02
            int r1 = r0.top
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r0 = r0.A02
            int r0 = r0.bottom
            goto L_0x026d
        L_0x0313:
            int r3 = r0.bottomMargin
            goto L_0x013c
        L_0x0317:
            int r1 = r7.getMeasuredHeight()
            r0 = r6
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            goto L_0x0134
        L_0x0322:
            int r5 = r21 + r16
            r4 = r6
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r0 = r4.leftMargin
            int r5 = r5 + r0
            int r0 = r4.rightMargin
            int r5 = r5 + r0
            int r5 = r5 + r8
            r0 = r6
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            int r0 = r0.width
            r26 = r0
            int r0 = r9.A03
            r2 = r0
            int r0 = r9.A04
            r1 = r0
            boolean r0 = r9.A1X()
            r3 = r2
            r2 = r26
            int r3 = X.C252553pI.A04(r3, r1, r5, r2, r0)
            int r2 = r4.topMargin
            int r2 = r2 + r11
            int r0 = r4.bottomMargin
            int r2 = r2 + r0
            int r0 = r9.A00
            r1 = r0
            int r0 = r9.A01
            boolean r5 = r9.A1Y()
            r4 = r1
            r1 = r0
            r0 = r17
            int r4 = X.C252553pI.A04(r4, r1, r2, r0, r5)
            r7.measure(r3, r4)
            r15.A05(r7, r14, r3, r4)
            goto L_0x0115
        L_0x0365:
            int r0 = r0.height
            goto L_0x00b9
        L_0x0369:
            r0 = r13
            X.3pI r0 = (X.C252553pI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            if (r0 == 0) goto L_0x0376
            int r16 = r0.getPaddingEnd()
            goto L_0x0050
        L_0x0376:
            r16 = 0
            goto L_0x0050
        L_0x037a:
            r0 = r13
            X.3pI r0 = (X.C252553pI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            if (r0 == 0) goto L_0x0387
            int r21 = r0.getPaddingStart()
            goto L_0x004a
        L_0x0387:
            r21 = 0
            goto L_0x004a
        L_0x038b:
            r11 = 0
            goto L_0x0044
        L_0x038e:
            int r11 = r13.Ba8()
            goto L_0x0044
        L_0x0394:
            r1 = 0
            goto L_0x0037
        L_0x0397:
            int r1 = r13.BaC()
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14042Toj.A0F(X.VLu, java.util.List, int, int, int, int):void");
    }

    public final void A0G(List list, int i) {
        int i2 = this.A00[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.A00;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.A01;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    public C14042Toj(AnonymousClass4CR r1) {
        this.A04 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3 > r0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.view.View r6, int r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r4 = (com.google.android.flexbox.FlexItem) r4
            int r3 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            int r0 = r4.BTI()
            if (r3 < r0) goto L_0x001b
            int r0 = r4.BPT()
            r1 = 0
            if (r3 <= r0) goto L_0x001d
        L_0x001b:
            r3 = r0
            r1 = 1
        L_0x001d:
            int r0 = r4.BT6()
            if (r2 < r0) goto L_0x0045
            int r0 = r4.BP7()
            if (r2 > r0) goto L_0x0045
            if (r1 == 0) goto L_0x0044
        L_0x002b:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r1, r0)
            r5.A05(r6, r7, r1, r0)
            X.4CR r0 = r5.A04
            com.google.android.flexbox.FlexboxLayoutManager r0 = (com.google.android.flexbox.FlexboxLayoutManager) r0
            android.util.SparseArray r0 = r0.A0A
            r0.put(r7, r6)
        L_0x0044:
            return
        L_0x0045:
            r2 = r0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14042Toj.A02(android.view.View, int):void");
    }

    private void A03(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        AnonymousClass4CR r5 = this.A04;
        int min = Math.min(Math.max(((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - r5.Avg(view), flexItem.BTI()), flexItem.BPT());
        long[] jArr = this.A03;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i2] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, SN3.MAX_SIGNED_POWER_OF_TWO);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, SN3.MAX_SIGNED_POWER_OF_TWO);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        A05(view, i2, makeMeasureSpec2, makeMeasureSpec);
        ((FlexboxLayoutManager) r5).A0A.put(i2, view);
    }

    private void A04(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        AnonymousClass4CR r5 = this.A04;
        int min = Math.min(Math.max(((i - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) - r5.Avg(view), flexItem.BT6()), flexItem.BP7());
        long[] jArr = this.A03;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, SN3.MAX_SIGNED_POWER_OF_TWO);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, SN3.MAX_SIGNED_POWER_OF_TWO);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        A05(view, i2, makeMeasureSpec, makeMeasureSpec2);
        ((FlexboxLayoutManager) r5).A0A.put(i2, view);
    }

    public final void A0D(View view, C14043Tok tok, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i8 = ((FlexboxLayoutManager) this.A04).A00;
        int Aag = flexItem.Aag();
        if (Aag != -1) {
            i8 = Aag;
        }
        int i9 = tok.A02;
        if (i8 != 0) {
            if (i8 == 1) {
                int i10 = i2 + i9;
                int measuredHeight = i10 - view.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) flexItem).bottomMargin;
                i6 = measuredHeight - i11;
                i5 = i10 - i11;
            } else if (i8 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                i6 = i2 + ((((i9 - view.getMeasuredHeight()) + marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) / 2);
                i5 = view.getMeasuredHeight() + i6;
            } else if (i8 == 3) {
                i7 = Math.max(tok.A09 - view.getBaseline(), ((ViewGroup.MarginLayoutParams) flexItem).topMargin);
                i6 = i2 + i7;
                i5 = i4 + i7;
            } else if (i8 != 4) {
                return;
            }
            view.layout(i, i6, i3, i5);
        }
        i7 = ((ViewGroup.MarginLayoutParams) flexItem).topMargin;
        i6 = i2 + i7;
        i5 = i4 + i7;
        view.layout(i, i6, i3, i5);
    }

    public final void A0E(View view, C14043Tok tok, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i8;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i9 = ((FlexboxLayoutManager) this.A04).A00;
        int Aag = flexItem.Aag();
        if (Aag != -1) {
            i9 = Aag;
        }
        int i10 = tok.A02;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    ViewGroup.MarginLayoutParams A0D = DbS.A0D(view);
                    i7 = (((i10 - view.getMeasuredWidth()) + A0D.getMarginStart()) - A0D.getMarginEnd()) / 2;
                    i8 = i - i7;
                    if (!z) {
                        i6 = i + i7;
                        i5 = i3 + i7;
                        view.layout(i6, i2, i5, i4);
                    }
                    i5 = i3 - i7;
                    view.layout(i6, i2, i5, i4);
                } else if (!(i9 == 3 || i9 == 4)) {
                    return;
                }
            } else if (!z) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                i8 = ((i + i10) - view.getMeasuredWidth()) - marginLayoutParams.rightMargin;
                i3 = (i3 + i10) - view.getMeasuredWidth();
                i7 = marginLayoutParams.rightMargin;
                i5 = i3 - i7;
                view.layout(i6, i2, i5, i4);
            } else {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
                i6 = (i - i10) + view.getMeasuredWidth() + marginLayoutParams.leftMargin;
                i3 = (i3 - i10) + view.getMeasuredWidth();
                i7 = marginLayoutParams.leftMargin;
                i5 = i3 + i7;
                view.layout(i6, i2, i5, i4);
            }
        }
        marginLayoutParams = (ViewGroup.MarginLayoutParams) flexItem;
        if (!z) {
            i6 = i + marginLayoutParams.leftMargin;
            i7 = marginLayoutParams.leftMargin;
            i5 = i3 + i7;
            view.layout(i6, i2, i5, i4);
        }
        i8 = i - marginLayoutParams.rightMargin;
        i7 = marginLayoutParams.rightMargin;
        i5 = i3 - i7;
        view.layout(i6, i2, i5, i4);
    }
}
