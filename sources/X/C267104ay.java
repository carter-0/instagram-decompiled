package X;

import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ay  reason: invalid class name and case insensitive filesystem */
public final class C267104ay extends SpannableStringBuilder {
    public final Class A00;
    public final List A01 = new ArrayList();

    private C11465SaT A00(Object obj) {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i >= list.size()) {
                return null;
            }
            C11465SaT saT = (C11465SaT) list.get(i);
            if (saT.A00 == obj) {
                return saT;
            }
            i++;
        }
    }

    private void A01() {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                ((C11465SaT) list.get(i)).A01.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public static void A02(C267104ay r3) {
        int i = 0;
        while (true) {
            List list = r3.A01;
            if (i < list.size()) {
                ((C11465SaT) list.get(i)).A01.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        C11465SaT A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        C11465SaT A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        C11465SaT A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.A00 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C11465SaT[] saTArr = (C11465SaT[]) super.getSpans(i, i2, C11465SaT.class);
        int length = saTArr.length;
        Object[] objArr = (Object[]) Array.newInstance(cls, length);
        for (int i3 = 0; i3 < length; i3++) {
            objArr[i3] = saTArr[i3].A00;
        }
        return objArr;
    }

    public final int nextSpanTransition(int i, int i2, Class<C11465SaT> cls) {
        if (cls == null || this.A00 == cls) {
            cls = C11465SaT.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        C11465SaT saT;
        if (obj == null || this.A00 != obj.getClass()) {
            saT = null;
        } else {
            saT = A00(obj);
            if (saT != null) {
                obj = saT;
            }
        }
        super.removeSpan(obj);
        if (saT != null) {
            this.A01.remove(saT);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj != null && this.A00 == obj.getClass()) {
            C11465SaT saT = new C11465SaT(obj);
            this.A01.add(saT);
            obj = saT;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new C267104ay(this, this.A00, i, i2);
    }

    public C267104ay(CharSequence charSequence, Class cls, int i, int i2) {
        super(charSequence, i, i2);
        02V.A03(cls, Pxd.A00(930));
        this.A00 = cls;
    }

    public final void A03() {
        A01();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                ((C11465SaT) list.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        A02(this);
        super.replace(i, i2, charSequence);
        A01();
        return this;
    }

    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    public C267104ay(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.A00 = cls;
    }

    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        A02(this);
        super.replace(i, i2, charSequence, i3, i4);
        A01();
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }
}
