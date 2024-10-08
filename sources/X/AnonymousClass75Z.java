package X;

import android.text.Editable;

/* renamed from: X.75Z  reason: invalid class name */
public final class AnonymousClass75Z implements C3260075a {
    public final /* synthetic */ C329307Ij A00;

    public AnonymousClass75Z(C329307Ij r1) {
        this.A00 = r1;
    }

    public final int getSpanEnd(Object obj) {
        return this.A00.A0S.getText().getSpanEnd(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.A00.A0S.getText().getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.A00.A0S.getText().getSpans(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof OCB) {
            C3260875i r2 = ((OCB) obj).A00;
            if (r2.A02() == AnonymousClass7OR.MENTION && r2.A01() == AnonymousClass7OS.AI) {
                C329307Ij r0 = this.A00;
                r0.A0R.A02 = C329307Ij.A01(r0);
            }
        }
        this.A00.A0S.getText().removeSpan(obj);
    }

    public final void CJM(Editable editable) {
        OCB[] ocbArr = (OCB[]) getSpans(0, editable.length(), OCB.class);
        if (ocbArr != null) {
            for (OCB ocb : ocbArr) {
                if (ocb.A00.A02() == AnonymousClass7OR.MENTION && ocb.A00.A01() == AnonymousClass7OS.AI) {
                    this.A00.A0R.A02 = false;
                }
            }
        }
    }
}
