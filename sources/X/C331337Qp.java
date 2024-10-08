package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.SuggestionSpan;
import com.instagram.common.session.UserSession;
import com.instagram.direct.share.ui.mediacomposer.core.MessagePartial;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Qp  reason: invalid class name and case insensitive filesystem */
public final class C331337Qp implements TextWatcher {
    public int A00;
    public C3260075a A01;
    public boolean A02;
    public boolean A03;
    public MessagePartial[] A04;
    public final UserSession A05;
    public final List A06 = new ArrayList();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377229La(this, 39));

    public final void afterTextChanged(Editable editable) {
        int i;
        int length;
        OCB[] ocbArr;
        int length2;
        SuggestionSpan[] suggestionSpanArr;
        L8A[] l8aArr;
        OCB[] ocbArr2;
        0qQ.A0B(editable, 0);
        int length3 = editable.length();
        C3260075a r1 = this.A01;
        int i2 = 0;
        if (r1 == null || (ocbArr2 = (OCB[]) r1.getSpans(0, length3, OCB.class)) == null) {
            i = 0;
        } else {
            i = ocbArr2.length;
        }
        C3260075a r12 = this.A01;
        if (!(r12 == null || (l8aArr = (L8A[]) r12.getSpans(0, length3, L8A.class)) == null)) {
            i2 = l8aArr.length;
        }
        int i3 = i + i2;
        C3260075a r2 = this.A01;
        int i4 = 0;
        if (!(r2 == null || (suggestionSpanArr = (SuggestionSpan[]) r2.getSpans(0, length3, SuggestionSpan.class)) == null)) {
            i4 = suggestionSpanArr.length;
        }
        List list = this.A06;
        if ((!list.isEmpty()) && i3 == 0 && this.A00 != i4) {
            Object[] spans = editable.getSpans(0, editable.length(), SuggestionSpan.class);
            0qQ.A07(spans);
            List A0A = 03t.A0A(new C41286ArR(editable), spans);
            List<C17423VVc> A0g = 00k.A0g(00k.A0a(list), new C20372WqC());
            if (!A0A.isEmpty()) {
                int i5 = 0;
                C17423VVc vVc = null;
                int i6 = 0;
                while (i5 < A0A.size() && i6 < A0g.size()) {
                    Object obj = A0A.get(i5);
                    if (vVc == null) {
                        vVc = new C17423VVc(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj));
                    }
                    C17423VVc vVc2 = (C17423VVc) A0g.get(i6);
                    0qQ.A0B(vVc2, 0);
                    if (vVc.A01 <= vVc2.A00 && vVc.A00 >= vVc2.A01) {
                        editable.removeSpan(obj);
                    } else if (vVc2.A01 <= vVc.A01) {
                        i6++;
                    }
                    i5++;
                    vVc = null;
                }
                for (C17423VVc vVc3 : A0g) {
                    editable.setSpan(vVc3.A02, vVc3.A01, vVc3.A00, 33);
                }
            }
        }
        list.clear();
        if (!this.A03) {
            MessagePartial[] messagePartialArr = this.A04;
            int i7 = 0;
            if (!(messagePartialArr == null || (length = messagePartialArr.length) == 0)) {
                boolean z = false;
                int i8 = Integer.MAX_VALUE;
                int i9 = -1;
                do {
                    MessagePartial messagePartial = messagePartialArr[i7];
                    if (editable.getSpanStart(messagePartial) >= 0) {
                        i8 = Math.min(editable.getSpanStart(messagePartial), i8);
                        i9 = Math.max(editable.getSpanEnd(messagePartial), i9);
                        int length4 = editable.length();
                        C3260075a r13 = this.A01;
                        int i10 = 0;
                        if (r13 == null || (ocbArr = (OCB[]) r13.getSpans(0, length4, OCB.class)) == null || (length2 = ocbArr.length) <= 0) {
                            editable.removeSpan(messagePartial);
                            z = true;
                        } else {
                            do {
                                OCB ocb = ocbArr[i10];
                                C3260075a r0 = this.A01;
                                if (r0 != null) {
                                    r0.removeSpan(ocb);
                                }
                                i10++;
                            } while (i10 < length2);
                            editable.removeSpan(messagePartial);
                            z = true;
                        }
                    }
                    i7++;
                } while (i7 < length);
                if (z) {
                    editable.delete(i8, Math.min(i9, editable.length()));
                } else {
                    this.A04 = null;
                }
            }
        }
        C3260075a r02 = this.A01;
        if (r02 != null) {
            r02.CJM(editable);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C3260075a r0;
        C3260075a r2;
        Object[] objArr;
        SuggestionSpan[] suggestionSpanArr;
        Integer num;
        if (i == 0) {
            if (i2 == i3 && ((Boolean) this.A07.getValue()).booleanValue()) {
                List list = this.A06;
                list.clear();
                C3260075a r1 = this.A01;
                if (r1 == null || (objArr = r1.getSpans(0, i2, Object.class)) == null) {
                    objArr = new Object[0];
                }
                for (Object obj : objArr) {
                    if ((obj instanceof OCB) || (obj instanceof L8A)) {
                        C3260075a r02 = this.A01;
                        Integer num2 = null;
                        if (r02 != null) {
                            num = Integer.valueOf(r02.getSpanStart(obj));
                        } else {
                            num = null;
                        }
                        C3260075a r03 = this.A01;
                        if (r03 != null) {
                            num2 = Integer.valueOf(r03.getSpanEnd(obj));
                        }
                        if (!(num == null || num2 == null)) {
                            list.add(new C17423VVc(obj, num.intValue(), num2.intValue()));
                        }
                    }
                }
                C3260075a r22 = this.A01;
                int i4 = 0;
                if (!(r22 == null || (suggestionSpanArr = (SuggestionSpan[]) r22.getSpans(0, i2, SuggestionSpan.class)) == null)) {
                    i4 = suggestionSpanArr.length;
                }
                this.A00 = i4;
            }
            if (this.A02 || (charSequence != null && charSequence.length() > 0 && (charSequence.charAt(i) == '@' || charSequence.charAt(i) == '/'))) {
                this.A02 = false;
                return;
            }
        }
        if (this.A04 != null) {
            this.A04 = null;
            return;
        }
        C3260075a r3 = this.A01;
        if (r3 != null) {
            int i5 = i + i2;
            Object[] spans = r3.getSpans(i, i5, L8A.class);
            MessagePartial[] messagePartialArr = (MessagePartial[]) r3.getSpans(i, i5, MessagePartial.class);
            if (messagePartialArr != null && messagePartialArr.length != 0) {
                if (i2 > 0) {
                    this.A04 = messagePartialArr;
                    return;
                }
                if (spans != null) {
                    0sC r5 = new 0sC(spans);
                    while (r5.hasNext()) {
                        L8A l8a = (L8A) r5.next();
                        if (!(i == r3.getSpanStart(l8a) || i == r3.getSpanEnd(l8a) || (r2 = this.A01) == null)) {
                            for (Object removeSpan : l8a.A03) {
                                r2.removeSpan(removeSpan);
                            }
                            r2.removeSpan(l8a);
                        }
                    }
                }
                0sC r23 = new 0sC(messagePartialArr);
                while (r23.hasNext()) {
                    Object next = r23.next();
                    if (!(i == r3.getSpanStart(next) || i == r3.getSpanEnd(next) || (r0 = this.A01) == null)) {
                        r0.removeSpan(next);
                    }
                }
            }
        }
    }

    public C331337Qp(UserSession userSession) {
        this.A05 = userSession;
    }
}
