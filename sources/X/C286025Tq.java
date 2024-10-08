package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5Tq  reason: invalid class name and case insensitive filesystem */
public final class C286025Tq implements CharSequence {
    public static final C286015Tp A04 = C286035Tr.A00;
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final List A02(int i) {
        ArrayList arrayList;
        List list = this.A01;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                C3022062b r3 = (C3022062b) obj;
                if ((r3.A02 instanceof C305016Gc) && C3021962a.A02(0, i, r3.A01, r3.A00)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        0qQ.A0C(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C286025Tq) {
                C286025Tq r5 = (C286025Tq) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A00 */
    public final C286025Tq subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(002.A0X("start (", ") should be less or equal to end (", ')', i, i2));
        } else if (i == 0 && i2 == this.A00.length()) {
            return this;
        } else {
            String substring = this.A00.substring(i, i2);
            0qQ.A07(substring);
            return new C286025Tq(substring, C3021962a.A01(this.A03, i, i2), C3021962a.A01(this.A02, i, i2), C3021962a.A01(this.A01, i, i2));
        }
    }

    public final C286025Tq A01(C286025Tq r3) {
        C303876Bd r0 = new C303876Bd(16);
        r0.A05(this);
        r0.A05(r3);
        return r0.A02();
    }

    public final List A03(int i, int i2) {
        ArrayList arrayList;
        List list = this.A01;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C3022062b r3 = (C3022062b) obj;
                if ((r3.A02 instanceof String) && C3021962a.A02(i, i2, r3.A01, r3.A00)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        0qQ.A0C(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return arrayList;
    }

    public final List A04(int i, int i2) {
        ArrayList arrayList;
        List list = this.A01;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C3022062b r3 = (C3022062b) obj;
                if ((r3.A02 instanceof HP8) && C3021962a.A02(i, i2, r3.A01, r3.A00)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        0qQ.A0C(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return arrayList;
    }

    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    public final List A05(int i, int i2) {
        ArrayList arrayList;
        List list = this.A01;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C3022062b r3 = (C3022062b) obj;
                if ((r3.A02 instanceof C56050Hrz) && C3021962a.A02(i, i2, r3.A01, r3.A00)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        0qQ.A0C(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return arrayList;
    }

    public final List A06(String str, int i, int i2) {
        ArrayList arrayList;
        List list = this.A01;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C3022062b r7 = (C3022062b) obj;
                if ((r7.A02 instanceof String) && 0qQ.A0K(str, r7.A03) && C3021962a.A02(i, i2, r7.A01, r7.A00)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        0qQ.A0C(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return arrayList;
    }

    public final boolean A07(String str, int i, int i2) {
        List list = this.A01;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3022062b r2 = (C3022062b) list.get(i3);
            if ((r2.A02 instanceof String) && str.equals(r2.A03) && C3021962a.A02(i, i2, r2.A01, r2.A00)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.A00.hashCode() * 31;
        List list = this.A03;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List list2 = this.A02;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List list3 = this.A01;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    public final /* bridge */ int length() {
        return this.A00.length();
    }

    public final String toString() {
        return this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C286025Tq(List list, List list2, String str) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, (List) null);
    }

    public C286025Tq(String str, List list, List list2, List list3) {
        List A0g;
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        if (list2 != null && (A0g = 00k.A0g(list2, new C303996Bp())) != null) {
            int size = A0g.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                C3022062b r2 = (C3022062b) A0g.get(i2);
                if (r2.A01 >= i) {
                    int i3 = r2.A00;
                    if (i3 <= this.A00.length()) {
                        i = r2.A00;
                        i2++;
                    } else {
                        throw new IllegalArgumentException(002.A0n("ParagraphStyle range [", ", ", ") is out of boundary", r2.A01, i3));
                    }
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
            }
        }
    }
}
