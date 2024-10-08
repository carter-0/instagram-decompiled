package X;

import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.List;

public final class Q8H extends SpannableStringBuilder {
    public final Class A00;
    public final List A01 = AnonymousClass7TE.A1C();

    private C11464SaS A00(Object obj) {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i >= list.size()) {
                return null;
            }
            C11464SaS saS = (C11464SaS) list.get(i);
            if (saS.A00 == obj) {
                return saS;
            }
            i++;
        }
    }

    private void A01() {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                ((C11464SaS) list.get(i)).A01.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public static void A02(Q8H q8h) {
        int i = 0;
        while (true) {
            List list = q8h.A01;
            if (i < list.size()) {
                ((C11464SaS) list.get(i)).A01.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        C11464SaS A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        C11464SaS A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        C11464SaS A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.A00 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C11464SaS[] saSArr = (C11464SaS[]) super.getSpans(i, i2, C11464SaS.class);
        int length = saSArr.length;
        Object[] objArr = (Object[]) Array.newInstance(cls, length);
        for (int i3 = 0; i3 < length; i3++) {
            objArr[i3] = saSArr[i3].A00;
        }
        return objArr;
    }

    public final int nextSpanTransition(int i, int i2, Class<C11464SaS> cls) {
        if (this.A00 == cls) {
            cls = C11464SaS.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        C11464SaS saS;
        if (obj == null || this.A00 != obj.getClass()) {
            saS = null;
        } else {
            saS = A00(obj);
            if (saS != null) {
                obj = saS;
            }
        }
        super.removeSpan(obj);
        if (saS != null) {
            this.A01.remove(saS);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj != null && this.A00 == obj.getClass()) {
            C11464SaS saS = new C11464SaS(obj);
            this.A01.add(saS);
            obj = saS;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new Q8H(this, this.A00, i, i2);
    }

    public Q8H(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.A00 = cls;
    }

    public final void A03() {
        A01();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                ((C11464SaS) list.get(i)).onTextChanged(this, 0, length(), length());
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

    public Q8H(CharSequence charSequence, Class cls, int i, int i2) {
        super(charSequence, i, i2);
        02V.A03(cls, "watcherClass cannot be null");
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
