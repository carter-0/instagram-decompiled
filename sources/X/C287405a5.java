package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5a5  reason: invalid class name and case insensitive filesystem */
public final class C287405a5 implements AnonymousClass5RD, C287415a6 {
    public final C287245Zp A00;
    public final C287295Zu A01;

    public final long ALf(int i, int i2, int i3, int i4, boolean z) {
        if (!z) {
            return AnonymousClass5SF.A04(i, i3, 0, i4);
        }
        return C288985co.A04(i, i3, 0, i4);
    }

    public final C289145d6 E2o(C268004cb r9, int[] iArr, int[] iArr2, C267974cY[] r12, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        return r9.Cfi(0Yt.A0E(), new AnonymousClass9MN(i7, i, 0, this, iArr, r12), i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C287405a5) {
                C287405a5 r5 = (C287405a5) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RowMeasurePolicy(horizontalArrangement=");
        sb.append(this.A01);
        sb.append(", verticalAlignment=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int CmW(C268014cc r12, List list, int i) {
        int round;
        int i2;
        int EJS = r12.EJS(this.A01.By0());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * EJS, i);
        int size = list.size();
        float f = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C268084cj r7 = (C268084cj) list.get(i4);
            C289085cz A002 = C289075cy.A00(r7);
            if (A002 != null) {
                float f2 = A002.A00;
                if (f2 != 0.0f) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
            }
            int i5 = i - min;
            if (i == Integer.MAX_VALUE) {
                i5 = Integer.MAX_VALUE;
            }
            int min2 = Math.min(r7.CmY(Integer.MAX_VALUE), i5);
            min += min2;
            i3 = Math.max(i3, r7.CmV(min2));
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C268084cj r2 = (C268084cj) list.get(i6);
            C289085cz A003 = C289075cy.A00(r2);
            if (A003 != null) {
                float f3 = A003.A00;
                if (f3 > 0.0f) {
                    if (round != Integer.MAX_VALUE) {
                        i2 = Math.round(((float) round) * f3);
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    i3 = Math.max(i3, r2.CmV(i2));
                }
            }
        }
        return i3;
    }

    public final int CmZ(C268014cc r11, List list, int i) {
        float f;
        int EJS = r11.EJS(this.A01.By0());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C268084cj r1 = (C268084cj) list.get(i4);
            C289085cz A002 = C289075cy.A00(r1);
            if (A002 != null) {
                f = A002.A00;
            } else {
                f = 0.0f;
            }
            int CmY = r1.CmY(i);
            if (f == 0.0f) {
                i3 += CmY;
            } else if (f > 0.0f) {
                f2 += f;
                i2 = Math.max(i2, Math.round(((float) CmY) / f));
            }
        }
        return Math.round(((float) i2) * f2) + i3 + ((list.size() - 1) * EJS);
    }

    public final int CoP(C268014cc r12, List list, int i) {
        int round;
        int i2;
        int EJS = r12.EJS(this.A01.By0());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * EJS, i);
        int size = list.size();
        float f = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C268084cj r7 = (C268084cj) list.get(i4);
            C289085cz A002 = C289075cy.A00(r7);
            if (A002 != null) {
                float f2 = A002.A00;
                if (f2 != 0.0f) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
            }
            int i5 = i - min;
            if (i == Integer.MAX_VALUE) {
                i5 = Integer.MAX_VALUE;
            }
            int min2 = Math.min(r7.CmY(Integer.MAX_VALUE), i5);
            min += min2;
            i3 = Math.max(i3, r7.CoO(min2));
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C268084cj r2 = (C268084cj) list.get(i6);
            C289085cz A003 = C289075cy.A00(r2);
            if (A003 != null) {
                float f3 = A003.A00;
                if (f3 > 0.0f) {
                    if (round != Integer.MAX_VALUE) {
                        i2 = Math.round(((float) round) * f3);
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    i3 = Math.max(i3, r2.CoO(i2));
                }
            }
        }
        return i3;
    }

    public final int CoS(C268014cc r11, List list, int i) {
        float f;
        int EJS = r11.EJS(this.A01.By0());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C268084cj r1 = (C268084cj) list.get(i4);
            C289085cz A002 = C289075cy.A00(r1);
            if (A002 != null) {
                f = A002.A00;
            } else {
                f = 0.0f;
            }
            int CoR = r1.CoR(i);
            if (f == 0.0f) {
                i3 += CoR;
            } else if (f > 0.0f) {
                f2 += f;
                i2 = Math.max(i2, Math.round(((float) CoR) / f));
            }
        }
        return Math.round(((float) i2) * f2) + i3 + ((list.size() - 1) * EJS);
    }

    public final void E35(C268004cb r7, int[] iArr, int[] iArr2, int i) {
        this.A01.ACQ(r7, r7.getLayoutDirection(), iArr, iArr2, i);
    }

    public C287405a5(C287295Zu r1, C287245Zp r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final C289145d6 Cnx(C268004cb r15, List list, long j) {
        List list2 = list;
        return C289065cx.A00(this, r15, list2, (int[]) null, new C267974cY[list2.size()], Constraints.A03(j), Constraints.A02(j), Constraints.A01(j), Constraints.A00(j), r15.EJS(this.A01.By0()), 0, list2.size(), 0);
    }

    public final int ANQ(C267974cY r2) {
        return r2.A00;
    }

    public final int ClO(C267974cY r2) {
        return r2.A01;
    }
}
