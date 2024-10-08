package X;

import android.text.Editable;

/* renamed from: X.7bE  reason: invalid class name and case insensitive filesystem */
public final class C334417bE extends 0lr {
    public final /* synthetic */ C334397bC A00;
    public final /* synthetic */ C335987ds A01;
    public final /* synthetic */ C52971GgO A02;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        C334417bE.super.onTextChanged(charSequence, i, i2, i3);
        C52971GgO ggO = this.A02;
        C333747a3 r1 = ggO.A09;
        r1.A03.Epw(charSequence);
        r1.A02.Epw(charSequence.toString());
        if (i == 0 && i2 == 0 && (i3 == 1 || i3 == 2)) {
            Integer num = AnonymousClass05K.A01;
            if (ggO.A05) {
                ggO.A05 = false;
                ggO.A0B.A00(new C74192PqY((Object) ggO, (Object) num, (String) null, (String) null, 15));
            }
        }
        C335987ds r12 = this.A01;
        if (r12 != null) {
            r12.A00(charSequence.toString());
        }
    }

    public C334417bE(C334397bC r1, C335987ds r2, C52971GgO ggO) {
        this.A02 = ggO;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void afterTextChanged(Editable editable) {
        C335417cv r5;
        String str;
        boolean z;
        Object value = this.A02.A0V.getValue();
        C381459bn r1 = null;
        if (value instanceof C335417cv) {
            r5 = (C335417cv) value;
            if (r5 != null) {
                str = r5.A06;
                z = r5.A0F;
            }
            str = null;
            z = false;
        } else {
            r5 = null;
            str = null;
            z = false;
        }
        C334397bC r2 = this.A00;
        if (r5 != null) {
            r1 = C334337b6.A01(r5);
        }
        if (z && str != null) {
            r2.AK2(r1, str, false);
        }
    }
}
