package X;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8b6  reason: invalid class name and case insensitive filesystem */
public abstract class C358558b6 extends 2Rw implements TextWatcher {
    public List A00 = new ArrayList();
    public boolean A01;
    public final C355638Qt A02 = new C355638Qt(0);
    public final List A03 = new ArrayList();

    public void A02(CharSequence charSequence) {
        this.A01 = false;
        C337257fy r1 = ((C358548b5) this).A05;
        if (r1 != null) {
            r1.EhX(charSequence.toString());
        }
    }

    public void A03(List list) {
        this.A01 = true;
        this.A00 = list;
    }

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        List list = this.A03;
        list.clear();
        for (AnonymousClass91O r4 : (AnonymousClass91O[]) C263324Kh.A06(editable, AnonymousClass91O.class)) {
            int spanStart = editable.getSpanStart(r4);
            int spanEnd = editable.getSpanEnd(r4);
            User user = r4.A00;
            String username = user.getUsername();
            CharSequence subSequence = editable.subSequence(spanStart + 1, spanEnd);
            0qQ.A0C(subSequence, "null cannot be cast to non-null type android.text.Spanned");
            if (!A1O.A00((Spanned) subSequence, username)) {
                editable.removeSpan(r4);
            } else {
                list.add(user);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        if (i3 >= 1) {
            int i4 = i3 + i;
            int i5 = i;
            while (i5 < i4) {
                if (charSequence.charAt(i5) == ' ') {
                    i5++;
                } else {
                    return;
                }
            }
            int i6 = i - 1;
            int i7 = i6;
            while (-1 < i7 && charSequence.charAt(i7) != ' ') {
                if (charSequence.charAt(i7) == '@') {
                    String obj = charSequence.subSequence(i7 + 1, i6 + 1).toString();
                    if (obj != null && this.A03.size() < 20) {
                        int size = this.A00.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            User user = (User) this.A00.get(i8);
                            if (0qQ.A0K(user.getUsername(), obj)) {
                                ((C358548b5) this).A00.DRH(user, i8);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                i7--;
            }
        }
    }

    public void A01() {
        if (this.A01) {
            this.A00.clear();
        }
        this.A01 = false;
        C337257fy r1 = ((C358548b5) this).A05;
        if (r1 != null) {
            r1.EhX("".toString());
        }
    }
}
