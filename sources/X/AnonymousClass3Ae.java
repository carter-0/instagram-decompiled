package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ae  reason: invalid class name */
public final class AnonymousClass3Ae implements C238023Af {
    public int A00 = 0;
    public 02U A01 = new 0vW(30);
    public final C238013Ad A02;
    public final C238033Ag A03;
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();

    public AnonymousClass3Ae(C238013Ad r4) {
        this.A02 = r4;
        this.A03 = new C238033Ag(this);
    }

    public final void EB3(C241543Pp r2) {
        r2.A03 = null;
        this.A01.ECR(r2);
    }

    private int A00(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C241543Pp r3 = (C241543Pp) arrayList.get(size);
            int i9 = r3.A00;
            int i10 = r3.A02;
            if (i9 == 8) {
                if (i10 < r3.A01) {
                    i4 = r3.A02;
                    i5 = r3.A01;
                } else {
                    i4 = r3.A01;
                    i5 = r3.A02;
                }
                if (i < i4 || i > i5) {
                    if (i < r3.A02) {
                        if (i2 == 1) {
                            r3.A02++;
                            i6 = r3.A01 + 1;
                        } else if (i2 == 2) {
                            r3.A02--;
                            i6 = r3.A01 - 1;
                        }
                        r3.A01 = i6;
                    }
                } else if (i4 == r3.A02) {
                    if (i2 == 1) {
                        i8 = r3.A01 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = r3.A01 - 1;
                        }
                        i++;
                    }
                    r3.A01 = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = r3.A02 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = r3.A02 - 1;
                        }
                        i--;
                    }
                    r3.A02 = i7;
                    i--;
                }
            } else if (i10 > i) {
                if (i2 == 1) {
                    i3 = r3.A02 + 1;
                } else if (i2 == 2) {
                    i3 = r3.A02 - 1;
                }
                r3.A02 = i3;
            } else if (r3.A00 == 1) {
                i -= r3.A01;
            } else if (r3.A00 == 2) {
                i += r3.A01;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C241543Pp r2 = (C241543Pp) arrayList.get(size2);
            int i11 = r2.A00;
            int i12 = r2.A01;
            if (i11 == 8) {
                if (i12 != r2.A02 && r2.A01 >= 0) {
                }
            } else if (i12 > 0) {
            }
            arrayList.remove(size2);
            EB3(r2);
        }
        return i;
    }

    private void A01(C241543Pp r11) {
        int i;
        int i2 = r11.A00;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A002 = A00(r11.A02, i2);
        int i3 = r11.A02;
        int i4 = r11.A00;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(r11);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < r11.A01; i6++) {
            int A003 = A00(r11.A02 + (i * i6), i4);
            i4 = r11.A00;
            if (i4 == 2 ? A003 != A002 : !(i4 == 4 && A003 == A002 + 1)) {
                C241543Pp CsX = CsX(r11.A03, i4, A002, i5);
                A08(CsX, i3);
                EB3(CsX);
                i4 = r11.A00;
                if (i4 == 4) {
                    i3 += i5;
                }
                A002 = A003;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = r11.A03;
        EB3(r11);
        if (i5 > 0) {
            C241543Pp CsX2 = CsX(obj, r11.A00, A002, i5);
            A08(CsX2, i3);
            EB3(CsX2);
        }
    }

    private void A02(C241543Pp r5) {
        this.A05.add(r5);
        int i = r5.A00;
        if (i == 1) {
            this.A02.Csm(r5.A02, r5.A01);
        } else if (i == 2) {
            C238013Ad r0 = this.A02;
            int i2 = r5.A02;
            int i3 = r5.A01;
            RecyclerView recyclerView = ((C238003Ac) r0).A00;
            recyclerView.A0w(i2, i3, false);
            recyclerView.A0U = true;
        } else if (i == 4) {
            this.A02.Cm8(r5.A02, r5.A01, r5.A03);
        } else if (i == 8) {
            this.A02.Csn(r5.A02, r5.A01);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(r5);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean A03(int i) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C241543Pp r7 = (C241543Pp) arrayList.get(i2);
            if (r7.A00 != 8) {
                if (r7.A00 == 1) {
                    int i3 = r7.A02;
                    int i4 = i3 + r7.A01;
                    while (i3 < i4) {
                        if (A04(i3, i2 + 1) != i) {
                            i3++;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i2++;
            } else if (A04(r7.A01, i2 + 1) != i) {
                i2++;
            }
            return true;
        }
        return false;
    }

    public final int A04(int i, int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i2 < size) {
            C241543Pp r5 = (C241543Pp) arrayList.get(i2);
            int i3 = r5.A00;
            int i4 = r5.A02;
            if (i3 == 8) {
                if (i4 == i) {
                    i = r5.A01;
                } else {
                    if (r5.A02 < i) {
                        i--;
                    }
                    if (r5.A01 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (r5.A00 == 2) {
                if (i < r5.A02 + r5.A01) {
                    return -1;
                }
                i -= r5.A01;
            } else if (r5.A00 == 1) {
                i += r5.A01;
            }
            i2++;
        }
        return i;
    }

    public final void A05() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C238003Ac) this.A02).A00((C241543Pp) arrayList.get(i));
        }
        A09(arrayList);
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d9, code lost:
        if (r0.A08.A04.contains(r1.itemView) != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0233, code lost:
        if (r0.A08.A04.contains(r1.itemView) != false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (r4.A01 != (r2 - r13)) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (r4.A01 != (r13 - r2)) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0127, code lost:
        if (r1 > r4.A02) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0163, code lost:
        if (r1 >= r4.A02) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r15 = this;
            X.3Ag r8 = r15.A03
            java.util.ArrayList r12 = r15.A04
        L_0x0004:
            int r7 = r12.size()
            r10 = 1
            int r7 = r7 - r10
            r2 = 0
        L_0x000b:
            if (r7 < 0) goto L_0x0199
            java.lang.Object r0 = r12.get(r7)
            X.3Pp r0 = (X.C241543Pp) r0
            int r1 = r0.A00
            r0 = 8
            if (r1 != r0) goto L_0x0194
            if (r2 == 0) goto L_0x0195
            int r6 = r7 + 1
            java.lang.Object r5 = r12.get(r7)
            X.3Pp r5 = (X.C241543Pp) r5
            java.lang.Object r4 = r12.get(r6)
            X.3Pp r4 = (X.C241543Pp) r4
            int r0 = r4.A00
            if (r0 == r10) goto L_0x016b
            r9 = 2
            if (r0 == r9) goto L_0x008f
            r9 = 4
            if (r0 != r9) goto L_0x0004
            int r3 = r5.A01
            int r1 = r4.A02
            r2 = 0
            if (r3 >= r1) goto L_0x007c
            int r1 = r1 - r10
            r4.A02 = r1
        L_0x003d:
            r3 = r2
        L_0x003e:
            int r1 = r5.A02
            int r10 = r4.A02
            if (r1 > r10) goto L_0x0066
            int r0 = r10 + 1
            r4.A02 = r0
        L_0x0048:
            r12.set(r6, r5)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x005d
            r12.set(r7, r4)
        L_0x0052:
            if (r3 == 0) goto L_0x0057
            r12.add(r7, r3)
        L_0x0057:
            if (r2 == 0) goto L_0x0004
            r12.add(r7, r2)
            goto L_0x0004
        L_0x005d:
            r12.remove(r7)
            X.3Af r0 = r8.A00
            r0.EB3(r4)
            goto L_0x0052
        L_0x0066:
            int r0 = r4.A01
            int r10 = r10 + r0
            if (r1 >= r10) goto L_0x0048
            int r10 = r10 - r1
            X.3Af r2 = r8.A00
            int r1 = r1 + 1
            java.lang.Object r0 = r4.A03
            X.3Pp r2 = r2.CsX(r0, r9, r1, r10)
            int r0 = r4.A01
            int r0 = r0 - r10
            r4.A01 = r0
            goto L_0x0048
        L_0x007c:
            int r0 = r4.A01
            int r1 = r1 + r0
            if (r3 >= r1) goto L_0x003d
            int r0 = r0 - r10
            r4.A01 = r0
            X.3Af r3 = r8.A00
            int r1 = r5.A02
            java.lang.Object r0 = r4.A03
            X.3Pp r3 = r3.CsX(r0, r9, r1, r10)
            goto L_0x003e
        L_0x008f:
            int r13 = r5.A02
            int r2 = r5.A01
            r14 = 0
            int r3 = r4.A02
            if (r13 >= r2) goto L_0x00f0
            if (r3 != r13) goto L_0x00a1
            int r1 = r4.A01
            int r0 = r2 - r13
            r11 = 0
            if (r1 == r0) goto L_0x00fc
        L_0x00a1:
            r11 = 0
        L_0x00a2:
            if (r2 >= r3) goto L_0x00d5
            int r3 = r3 - r10
            r4.A02 = r3
        L_0x00a7:
            int r10 = r5.A02
            r2 = 0
            if (r10 > r3) goto L_0x00bf
            int r0 = r3 + 1
            r4.A02 = r0
        L_0x00b0:
            if (r14 == 0) goto L_0x00fe
            r12.set(r7, r4)
            r12.remove(r6)
            X.3Af r0 = r8.A00
            r0.EB3(r5)
            goto L_0x0004
        L_0x00bf:
            int r0 = r4.A01
            int r3 = r3 + r0
            if (r10 >= r3) goto L_0x00b0
            int r3 = r3 - r10
            X.3Af r1 = r8.A00
            int r0 = r10 + 1
            X.3Pp r2 = r1.CsX(r2, r9, r0, r3)
            int r1 = r5.A02
            int r0 = r4.A02
            int r1 = r1 - r0
            r4.A01 = r1
            goto L_0x00b0
        L_0x00d5:
            int r1 = r4.A01
            int r0 = r3 + r1
            if (r2 >= r0) goto L_0x00a7
            int r1 = r1 - r10
            r4.A01 = r1
            r5.A00 = r9
            r5.A01 = r10
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0004
            r12.remove(r6)
            X.3Af r0 = r8.A00
            r0.EB3(r4)
            goto L_0x0004
        L_0x00f0:
            int r0 = r2 + 1
            if (r3 != r0) goto L_0x00fa
            int r0 = r4.A01
            int r13 = r13 - r2
            r11 = 1
            if (r0 == r13) goto L_0x00fc
        L_0x00fa:
            r11 = 1
            goto L_0x00a2
        L_0x00fc:
            r14 = 1
            goto L_0x00a2
        L_0x00fe:
            if (r11 == 0) goto L_0x013c
            if (r2 == 0) goto L_0x0118
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x010d
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x010d:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0118
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0118:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x0123
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0123:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x012e
        L_0x0129:
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x012e:
            r12.set(r7, r4)
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 == r0) goto L_0x0166
            r12.set(r6, r5)
            goto L_0x0057
        L_0x013c:
            if (r2 == 0) goto L_0x0154
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0149
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0149:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0154
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0154:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 < r0) goto L_0x015f
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x015f:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 < r0) goto L_0x012e
            goto L_0x0129
        L_0x0166:
            r12.remove(r6)
            goto L_0x0057
        L_0x016b:
            int r3 = r5.A01
            int r0 = r4.A02
            r2 = 0
            if (r3 >= r0) goto L_0x0173
            r2 = -1
        L_0x0173:
            int r1 = r5.A02
            if (r1 >= r0) goto L_0x0179
            int r2 = r2 + 1
        L_0x0179:
            if (r0 > r1) goto L_0x0180
            int r0 = r4.A01
            int r1 = r1 + r0
            r5.A02 = r1
        L_0x0180:
            int r1 = r4.A02
            if (r1 > r3) goto L_0x0189
            int r0 = r4.A01
            int r3 = r3 + r0
            r5.A01 = r3
        L_0x0189:
            int r1 = r1 + r2
            r4.A02 = r1
            r12.set(r7, r4)
            r12.set(r6, r5)
            goto L_0x0004
        L_0x0194:
            r2 = 1
        L_0x0195:
            int r7 = r7 + -1
            goto L_0x000b
        L_0x0199:
            int r11 = r12.size()
            r10 = 0
        L_0x019e:
            if (r10 >= r11) goto L_0x0278
            java.lang.Object r9 = r12.get(r10)
            X.3Pp r9 = (X.C241543Pp) r9
            int r1 = r9.A00
            r13 = 1
            if (r1 == r13) goto L_0x0273
            r8 = 2
            if (r1 == r8) goto L_0x0211
            r5 = 4
            if (r1 == r5) goto L_0x01b8
            r0 = 8
            if (r1 == r0) goto L_0x0273
        L_0x01b5:
            int r10 = r10 + 1
            goto L_0x019e
        L_0x01b8:
            int r4 = r9.A02
            int r0 = r9.A01
            int r7 = r4 + r0
            r6 = r4
            r2 = -1
            r3 = 0
        L_0x01c1:
            if (r6 >= r7) goto L_0x0203
            X.3Ad r0 = r15.A02
            X.3Ac r0 = (X.C238003Ac) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.3kE r1 = r0.A0X(r6, r13)
            if (r1 == 0) goto L_0x01db
            X.3Aj r0 = r0.A08
            android.view.View r1 = r1.itemView
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01f4
        L_0x01db:
            boolean r0 = r15.A03(r6)
            if (r0 != 0) goto L_0x01f4
            if (r2 != r13) goto L_0x01ee
            java.lang.Object r0 = r9.A03
            X.3Pp r0 = r15.CsX(r0, r5, r4, r3)
            r15.A02(r0)
            r4 = r6
            r3 = 0
        L_0x01ee:
            r2 = 0
        L_0x01ef:
            int r3 = r3 + 1
            int r6 = r6 + 1
            goto L_0x01c1
        L_0x01f4:
            if (r2 != 0) goto L_0x0201
            java.lang.Object r0 = r9.A03
            X.3Pp r0 = r15.CsX(r0, r5, r4, r3)
            r15.A01(r0)
            r4 = r6
            r3 = 0
        L_0x0201:
            r2 = 1
            goto L_0x01ef
        L_0x0203:
            int r0 = r9.A01
            if (r3 == r0) goto L_0x026c
            java.lang.Object r0 = r9.A03
            r15.EB3(r9)
            X.3Pp r9 = r15.CsX(r0, r5, r4, r3)
            goto L_0x026c
        L_0x0211:
            int r7 = r9.A02
            int r0 = r9.A01
            int r6 = r7 + r0
            r5 = r7
            r2 = -1
            r4 = 0
        L_0x021a:
            r3 = 0
            if (r5 >= r6) goto L_0x0261
            X.3Ad r0 = r15.A02
            X.3Ac r0 = (X.C238003Ac) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.3kE r1 = r0.A0X(r5, r13)
            if (r1 == 0) goto L_0x0235
            X.3Aj r0 = r0.A08
            android.view.View r1 = r1.itemView
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0253
        L_0x0235:
            boolean r0 = r15.A03(r5)
            if (r0 != 0) goto L_0x0253
            if (r2 != r13) goto L_0x0251
            X.3Pp r0 = r15.CsX(r3, r8, r7, r4)
            r15.A02(r0)
            r0 = 1
        L_0x0245:
            r2 = 0
        L_0x0246:
            if (r0 == 0) goto L_0x024e
            int r5 = r5 - r4
            int r6 = r6 - r4
            r4 = 1
        L_0x024b:
            int r5 = r5 + 1
            goto L_0x021a
        L_0x024e:
            int r4 = r4 + 1
            goto L_0x024b
        L_0x0251:
            r0 = 0
            goto L_0x0245
        L_0x0253:
            if (r2 != 0) goto L_0x025f
            X.3Pp r0 = r15.CsX(r3, r8, r7, r4)
            r15.A01(r0)
            r0 = 1
        L_0x025d:
            r2 = 1
            goto L_0x0246
        L_0x025f:
            r0 = 0
            goto L_0x025d
        L_0x0261:
            int r0 = r9.A01
            if (r4 == r0) goto L_0x026c
            r15.EB3(r9)
            X.3Pp r9 = r15.CsX(r3, r8, r7, r4)
        L_0x026c:
            if (r2 != 0) goto L_0x0273
            r15.A01(r9)
            goto L_0x01b5
        L_0x0273:
            r15.A02(r9)
            goto L_0x01b5
        L_0x0278:
            r12.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ae.A07():void");
    }

    public final void A08(C241543Pp r5, int i) {
        C238013Ad r2 = this.A02;
        C238003Ac r3 = (C238003Ac) r2;
        r3.A00(r5);
        int i2 = r5.A00;
        if (i2 == 2) {
            int i3 = r5.A01;
            RecyclerView recyclerView = r3.A00;
            recyclerView.A0w(i, i3, true);
            recyclerView.A0U = true;
            recyclerView.mState.A00 += i3;
        } else if (i2 == 4) {
            r2.Cm8(i, r5.A01, r5.A03);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.3Pp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.3Pp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.3Pp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C241543Pp CsX(java.lang.Object r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            X.02U r0 = r1.A01
            java.lang.Object r0 = r0.A7A()
            X.3Pp r0 = (X.C241543Pp) r0
            if (r0 != 0) goto L_0x000f
            X.3Pp r0 = new X.3Pp
            r0.<init>()
        L_0x000f:
            r0.A00 = r3
            r0.A02 = r4
            r0.A01 = r5
            r0.A03 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ae.CsX(java.lang.Object, int, int, int):X.3Pp");
    }

    public final void A06() {
        A05();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C241543Pp r8 = (C241543Pp) arrayList.get(i);
            int i2 = r8.A00;
            if (i2 == 1) {
                C238013Ad r2 = this.A02;
                ((C238003Ac) r2).A00(r8);
                r2.Csm(r8.A02, r8.A01);
            } else if (i2 == 2) {
                C238003Ac r0 = (C238003Ac) this.A02;
                r0.A00(r8);
                int i3 = r8.A02;
                int i4 = r8.A01;
                RecyclerView recyclerView = r0.A00;
                recyclerView.A0w(i3, i4, true);
                recyclerView.A0U = true;
                recyclerView.mState.A00 += i4;
            } else if (i2 == 4) {
                C238013Ad r3 = this.A02;
                ((C238003Ac) r3).A00(r8);
                r3.Cm8(r8.A02, r8.A01, r8.A03);
            } else if (i2 == 8) {
                C238013Ad r22 = this.A02;
                ((C238003Ac) r22).A00(r8);
                r22.Csn(r8.A02, r8.A01);
            }
        }
        A09(arrayList);
        this.A00 = 0;
    }

    public final void A09(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EB3((C241543Pp) list.get(i));
        }
        list.clear();
    }
}
