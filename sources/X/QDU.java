package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QDU extends 2YL implements C13844TiK {
    public static final REO A0M = REO.SELECT;
    public SparseArray A00;
    public SJ1 A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass2gB A0A;
    public final AnonymousClass2gB A0B;
    public final AnonymousClass2Fj A0C;
    public final AnonymousClass2Fj A0D;
    public final AnonymousClass2Fj A0E;
    public final AnonymousClass2Fj A0F;
    public final AnonymousClass2Fj A0G;
    public final AnonymousClass2Fj A0H;
    public final AnonymousClass2gO A0I;
    public final AnonymousClass2gO A0J;
    public final QDH A0K;
    public final AnonymousClass0eM A0L = AnonymousClass0eN.A01(TUN.A00);

    public static final void A0A(String str, List list) {
        String str2 = str;
        if (str != null) {
            list.add(SUj.A09(new SelectionHeaderItem(RH6.A0p, (Integer) null, AnonymousClass05K.A01, str2, (String) null)));
        }
    }

    public final SUj A0G() {
        C10575RuU ruU;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        RH2 rh2;
        RH2 rh22;
        PuxContactItem puxContactItem;
        String str3 = null;
        RH6 rh6 = RH6.A0c;
        SUj A082 = SUj.A08(new PuxContactItem(rh6, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        SUj A0W = Pxe.A0W(this.A0A);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null) {
            return A082;
        }
        C11022S5z s5z = (C11022S5z) ruU.A01;
        String str4 = s5z.A02;
        S6Z s6z = s5z.A00;
        String str5 = null;
        if (s6z != null) {
            str = s6z.A02;
        } else {
            str = null;
        }
        S6V s6v = s5z.A01;
        if (s6v != null) {
            str2 = s6v.A01;
        } else {
            str2 = null;
        }
        if (!this.A08 || (str4 != null && !00l.A0W(str4))) {
            z = false;
        } else {
            z = true;
        }
        if (!this.A07 || (str != null && !00l.A0W(str))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.A09 || (str2 != null && !00l.A0W(str2))) {
            z3 = false;
        } else {
            z3 = true;
        }
        Boolean[] boolArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
        int i = 0;
        int i2 = 0;
        do {
            if (boolArr[i].booleanValue()) {
                i2++;
            }
            i++;
        } while (i < 3);
        if (i2 == 1) {
            int i3 = 2131961228;
            if (A0D()) {
                i3 = 2131961234;
            }
            if (A0D()) {
                rh22 = RH2.A1F;
            } else {
                rh22 = RH2.A0Y;
            }
            C13216TQh tQh = new C13216TQh(rh22, i3);
            if (z) {
                puxContactItem = new PuxContactItem(rh6, Pxe.A0l(), (String) null, (String) null, (String) null, (String) null, (String) null, false);
            } else if (z2) {
                puxContactItem = new PuxContactItem(rh6, 1, (String) null, (String) null, (String) null, (String) null, (String) null, false);
            } else {
                puxContactItem = new PuxContactItem(rh6, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false);
            }
            return SUj.A0A(puxContactItem, tQh);
        }
        if (!this.A08) {
            str4 = null;
        }
        if (!this.A07) {
            str = null;
        }
        if (!this.A09) {
            str2 = null;
        }
        List A1P = 0sr.A1P(new String[]{str4, str, str2});
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A1P) {
            String str6 = (String) next;
            if (str6 != null && !00l.A0W(str6)) {
                A1C.add(next);
            }
        }
        if (!z && !z2 && !z3) {
            if (this.A07) {
                if (s6z != null) {
                    str3 = s6z.A01;
                }
            } else if (this.A09) {
                if (s6v != null) {
                    str3 = s6v.A02;
                }
            }
            str5 = String.valueOf(str3);
        }
        PuxContactItem puxContactItem2 = new PuxContactItem(rh6, (Integer) null, (String) null, (String) 00k.A0O(A1C, 0), (String) 00k.A0O(A1C, 1), (String) 00k.A0O(A1C, 2), str5, false);
        if (!z && !z2 && !z3) {
            return SUj.A09(puxContactItem2);
        }
        int i4 = 2131961228;
        if (A0D()) {
            i4 = 2131961234;
        }
        if (A0D()) {
            rh2 = RH2.A1F;
        } else {
            rh2 = RH2.A0Y;
        }
        return SUj.A0A(puxContactItem2, new C13216TQh(rh2, i4));
    }

    public final void AGm(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        String str;
        S60 s60;
        Object obj;
        SUj A0W;
        C10575RuU ruU;
        C11022S5z s5z;
        C11022S5z s5z2;
        S60 s602;
        Object obj2;
        SUj A0W2;
        C10575RuU ruU2;
        C11022S5z s5z3;
        0qQ.A0B(contextThemeWrapper, 2);
        String str2 = null;
        SUj A0A2 = SUj.A0A((Object) null, AnonymousClass7TE.A11("Selected item not in the list"));
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
        if (baseCheckoutItem != null && (baseCheckoutItem instanceof BaseSelectionCheckoutItem)) {
            int ordinal = baseCheckoutItem.BJZ().ordinal();
            if (ordinal == 30) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                str = null;
                A08(DbV.A0q(selectionEmailViewItem.A04), "select_existing_email", false);
                SUj A0W3 = Pxe.A0W(this.A0D);
                if (!(A0W3 == null || (s60 = (S60) A0W3.A01) == null)) {
                    Iterator it = s60.A00.A03.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (0qQ.A0K(((S6Z) obj).A02, selectionEmailViewItem.A01)) {
                            break;
                        }
                    }
                    S6Z s6z = (S6Z) obj;
                    if (!(s6z == null || (A0W = Pxe.A0W(this.A0H)) == null || (ruU = (C10575RuU) A0W.A01) == null || (s5z = (C11022S5z) ruU.A01) == null)) {
                        String id = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        S6Z s6z2 = s5z.A00;
                        if (s6z2 != null) {
                            str2 = s6z2.A01;
                        }
                        if (!0qQ.A0K(id, str2)) {
                            s5z2 = new C11022S5z(s6z, s5z.A01, s5z.A02);
                        }
                    }
                }
            } else if (ordinal == 31) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                str = null;
                A08(DbV.A0q(selectionPhoneNumberViewItem.A04), "select_existing_phone", false);
                SUj A0W4 = Pxe.A0W(this.A0D);
                if (!(A0W4 == null || (s602 = (S60) A0W4.A01) == null)) {
                    Iterator it2 = s602.A02.A03.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (0qQ.A0K(((S6V) obj2).A01, selectionPhoneNumberViewItem.A01)) {
                            break;
                        }
                    }
                    S6V s6v = (S6V) obj2;
                    if (!(s6v == null || (A0W2 = Pxe.A0W(this.A0H)) == null || (ruU2 = (C10575RuU) A0W2.A01) == null || (s5z3 = (C11022S5z) ruU2.A01) == null)) {
                        String id2 = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        S6V s6v2 = s5z3.A01;
                        if (s6v2 != null) {
                            str2 = s6v2.A02;
                        }
                        if (!0qQ.A0K(id2, str2)) {
                            s5z2 = new C11022S5z(s5z3.A00, s6v, s5z3.A02);
                        }
                    }
                }
            }
            A0A2 = SUj.A09(new C10575RuU(AnonymousClass05K.A01, s5z2, str));
        }
        if (A0A2.A01 != null) {
            this.A0H.A0B(A0A2);
        }
        ((C13894TjH) fragment).D68();
    }

    public final void AR6(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        0qQ.A0B(contextThemeWrapper, 2);
        D5K(bundle, contextThemeWrapper, fragment, sUj);
    }

    public final void D5K(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
        Integer B7O;
        QXR qxr;
        FormParams A012;
        QXR qxr2;
        QXR qxr3;
        QXR qxr4;
        QXR qxr5;
        QXR qxr6;
        0qQ.A0B(contextThemeWrapper, 2);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionNameViewItem) {
                A08((Long) null, "edit_name", A0C());
                SGF sgf = C9965RkK.A00;
                int i = 2131961336;
                if (A0C()) {
                    i = 2131961335;
                }
                SUj A0W = Pxe.A0W(this.A0F);
                if (A0W == null || (qxr6 = (QXR) A0W.A01) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                A012 = sgf.A01(qxr6, ((SelectionNameViewItem) baseCheckoutItem).A01, i, A0C(), A0B());
            } else if (baseCheckoutItem instanceof SelectionEmailViewItem) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                String str = selectionEmailViewItem.A04;
                A08(DbV.A0q(str), "edit_email", A0C());
                SGE sge = C9964RkJ.A00;
                int i2 = 2131961334;
                if (A0C()) {
                    i2 = 2131961333;
                }
                SUj A0W2 = Pxe.A0W(this.A0E);
                if (A0W2 == null || (qxr5 = (QXR) A0W2.A01) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                A012 = sge.A01(qxr5, 2131961341, str, selectionEmailViewItem.A01, i2, A0C(), A0B());
            } else if (baseCheckoutItem instanceof SelectionPhoneNumberViewItem) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                String str2 = selectionPhoneNumberViewItem.A04;
                A08(DbV.A0q(str2), "edit_phone", A0C());
                SGG sgg = C9966RkL.A00;
                SUj A0W3 = Pxe.A0W(this.A0G);
                if (A0W3 == null || (qxr4 = (QXR) A0W3.A01) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                A012 = sgg.A01(qxr4, 2131961344, str2, selectionPhoneNumberViewItem.A01, 2131961337, A0C(), A0B());
            } else if ((baseCheckoutItem instanceof C13600TdS) && (B7O = ((C13600TdS) baseCheckoutItem).B7O()) != null) {
                int intValue = B7O.intValue();
                if (intValue == 0) {
                    A09("add_phone");
                    SGG sgg2 = C9966RkL.A00;
                    SUj A0W4 = Pxe.A0W(this.A0G);
                    if (A0W4 == null || (qxr = (QXR) A0W4.A01) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    A012 = sgg2.A01(qxr, (Integer) null, (String) null, (String) null, 2131961328, A0C(), A0B());
                } else if (intValue == 1) {
                    A09("add_email");
                    SGE sge2 = C9964RkJ.A00;
                    int i3 = 2131961325;
                    if (A0C()) {
                        i3 = 2131961324;
                    }
                    SUj A0W5 = Pxe.A0W(this.A0E);
                    if (A0W5 == null || (qxr2 = (QXR) A0W5.A01) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    A012 = sge2.A01(qxr2, (Integer) null, (String) null, (String) null, i3, A0C(), A0B());
                } else if (intValue == 5) {
                    A09("add_name");
                    SGF sgf2 = C9965RkK.A00;
                    int i4 = 2131961327;
                    if (A0C()) {
                        i4 = 2131961326;
                    }
                    SUj A0W6 = Pxe.A0W(this.A0F);
                    if (A0W6 == null || (qxr3 = (QXR) A0W6.A01) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    A012 = sgf2.A01(qxr3, (String) null, i4, A0C(), A0B());
                } else {
                    return;
                }
            } else {
                return;
            }
            bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", A012);
            C11336SNr.A00(bundle, fragment, "content_form_fragment", true, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.common.recyclerview.adapteritems.InlineFormItem A00(com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r38, X.QDU r39) {
        /*
            r0 = r38
            com.facebookpay.form.fragment.model.FormParams r0 = r0.A00
            java.util.ArrayList r1 = r0.A0I
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r1.iterator()
        L_0x000e:
            boolean r1 = r6.hasNext()
            java.lang.String r16 = "Required value was null."
            r8 = 0
            r11 = r39
            if (r1 == 0) goto L_0x009b
            java.lang.Object r2 = r6.next()
            com.facebookpay.form.cell.CellParams r2 = (com.facebookpay.form.cell.CellParams) r2
            boolean r1 = r2 instanceof com.facebookpay.form.cell.text.TextCellParams
            if (r1 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x000e
            int r3 = r2.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r1 == 0) goto L_0x000e
            r2 = 2
            if (r3 != r2) goto L_0x0050
            android.util.SparseArray r1 = r11.A00
            java.lang.String r9 = X.Pxj.A0p(r1, r2)
            X.2Fj r1 = r11.A0F
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x008c
            java.lang.Object r7 = r1.A01
            X.QXR r7 = (X.QXR) r7
            if (r7 == 0) goto L_0x008c
            java.lang.String r10 = "add_name"
            r11 = 1
            r12 = r11
            com.facebookpay.form.cell.text.TextCellParams r1 = X.SGF.A00(r7, r8, r9, r10, r11, r12)
        L_0x004c:
            r4.add(r1)
            goto L_0x000e
        L_0x0050:
            r5 = 1
            if (r3 != r5) goto L_0x006e
            android.util.SparseArray r1 = r11.A00
            java.lang.String r3 = X.Pxj.A0p(r1, r5)
            X.2Fj r1 = r11.A0E
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x0091
            java.lang.Object r2 = r1.A01
            X.QXR r2 = (X.QXR) r2
            if (r2 == 0) goto L_0x0091
            java.lang.String r1 = "add_email"
            com.facebookpay.form.cell.text.TextCellParams r1 = X.SGE.A00(r2, r3, r1, r5, r5)
            goto L_0x004c
        L_0x006e:
            if (r3 != 0) goto L_0x000e
            android.util.SparseArray r2 = r11.A00
            r1 = 0
            java.lang.String r3 = X.Pxj.A0p(r2, r1)
            X.2Fj r1 = r11.A0G
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x0096
            java.lang.Object r2 = r1.A01
            X.QXR r2 = (X.QXR) r2
            if (r2 == 0) goto L_0x0096
            java.lang.String r1 = "add_phone"
            com.facebookpay.form.cell.text.TextCellParams r1 = X.SGG.A00(r2, r3, r1, r5, r5)
            goto L_0x004c
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x009b:
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1D(r4)
            int r1 = r0.A04
            r21 = r1
            java.lang.String r1 = r0.A0H
            r19 = r1
            int r1 = r0.A06
            r18 = r1
            java.lang.Integer r1 = r0.A0F
            r24 = r1
            java.lang.Integer r1 = r0.A0E
            r25 = r1
            com.facebookpay.form.fragment.model.FormLoggingEvents r1 = r0.A09
            r20 = r1
            X.RH3 r1 = r0.A0B
            r17 = r1
            int r15 = r0.A03
            int r13 = r0.A00
            int r12 = r0.A02
            int r10 = r0.A01
            com.facebookpay.form.fragment.model.ListCellParams r9 = r0.A0A
            com.facebookpay.form.fragment.model.FeatureConfiguration r8 = r0.A08
            java.lang.Integer r7 = r0.A0G
            java.util.List r6 = r0.A0J
            com.facebookpay.form.cell.CellParams r5 = r0.A07
            java.lang.Integer r4 = r0.A0D
            int r3 = r0.A05
            X.RGo r2 = r0.A0C
            boolean r1 = r0.A0L
            X.0sP r14 = r0.A0K
            com.facebookpay.form.fragment.model.FormParams r0 = new com.facebookpay.form.fragment.model.FormParams
            r26 = r7
            r27 = r4
            r28 = r19
            r30 = r6
            r31 = r14
            r32 = r21
            r33 = r18
            r34 = r15
            r35 = r13
            r36 = r12
            r37 = r10
            r38 = r3
            r39 = r1
            r18 = r5
            r19 = r8
            r21 = r9
            r22 = r17
            r23 = r2
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r11.A02
            java.lang.String r1 = "ecpPaymentRequest"
            if (r2 != 0) goto L_0x0110
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0110:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r2.A05
            if (r1 == 0) goto L_0x0124
            java.lang.String r3 = r1.A00
            if (r3 != 0) goto L_0x011c
            java.lang.String r3 = r1.A02
            if (r3 == 0) goto L_0x0124
        L_0x011c:
            X.RH6 r2 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r1 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r1.<init>(r2, r0, r3)
            return r1
        L_0x0124:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDU.A00(com.facebookpay.common.recyclerview.adapteritems.InlineFormItem, X.QDU):com.facebookpay.common.recyclerview.adapteritems.InlineFormItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r3.A00.A03.isEmpty() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r3.A02.A03.isEmpty() == false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(X.S60 r40, X.QDU r41) {
        /*
            r2 = r41
            boolean r0 = r2.A0D()
            r3 = r40
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x02d0
            if (r40 == 0) goto L_0x0306
            boolean r0 = r2.A08
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L_0x02a2
            X.S5a r0 = r3.A01
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x02a2
        L_0x0022:
            r15 = 1
        L_0x0023:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0033
            X.S6I r0 = r3.A00
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            r20 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            r20 = 0
        L_0x0035:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0045
            X.S6J r0 = r3.A02
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            r19 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0045:
            r19 = 0
        L_0x0047:
            boolean r0 = r2.A08
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A07
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9 = 2
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r7, r6, r0}
            java.util.List r6 = X.0sr.A1P(r0)
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0281
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0281
            r8 = 0
        L_0x006d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r20)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r7, r6, r0}
            java.util.List r6 = X.0sr.A1P(r0)
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0267
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0267
            r10 = 0
        L_0x008c:
            X.QDH r6 = r2.A0K
            X.5tb r0 = X.C298525tb.CONTACT_INFORMATION
            X.RED r6 = r6.A01(r0)
            X.RED r0 = X.RED.OTC
            boolean r13 = X.AnonymousClass7TF.A1W(r6, r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r6 = 0
            r0 = 2131961235(0x7f132593, float:1.9559161E38)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r0)
            if (r10 != 0) goto L_0x0263
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
        L_0x00aa:
            X.RH6 r22 = X.RH6.A0p
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r25 = r6
            r26 = r6
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            X.SUj.A0O(r0, r4)
            boolean r0 = r2.A08
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x0260
            X.S5a r0 = r3.A01
            if (r15 == 0) goto L_0x025d
            X.QXR r11 = r0.A00
            java.lang.String r0 = "label"
            java.lang.String r11 = r11.getOptionalStringField(r5, r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.String r23 = X.Pxj.A0p(r0, r9)
            X.2Fj r0 = r2.A0F
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r0 = r0.A01
            X.QXR r0 = (X.QXR) r0
            if (r0 == 0) goto L_0x02cb
            java.lang.String r24 = "add_name"
            r21 = r0
            r22 = r6
            r25 = r1
            r26 = r1
            com.facebookpay.form.cell.text.TextCellParams r0 = X.SGF.A00(r21, r22, r23, r24, r25, r26)
            r7.add(r0)
        L_0x00f1:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x011e
            X.S6I r9 = r3.A00
            if (r20 == 0) goto L_0x0256
            X.QXR r9 = r9.A00
            java.lang.String r0 = "label"
            java.lang.String r11 = r9.getOptionalStringField(r5, r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.String r12 = X.Pxj.A0p(r0, r1)
            X.2Fj r0 = r2.A0E
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x02c6
            java.lang.Object r9 = r0.A01
            X.QXR r9 = (X.QXR) r9
            if (r9 == 0) goto L_0x02c6
            java.lang.String r0 = "add_email"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.SGE.A00(r9, r12, r0, r1, r1)
            r7.add(r0)
        L_0x011e:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x014b
            if (r19 == 0) goto L_0x024d
            X.S6J r0 = r3.A02
            X.QXR r3 = r0.A00
            java.lang.String r0 = "label"
            java.lang.String r11 = r3.getOptionalStringField(r5, r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.String r9 = X.Pxj.A0p(r0, r5)
            X.2Fj r0 = r2.A0G
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r3 = r0.A01
            X.QXR r3 = (X.QXR) r3
            if (r3 == 0) goto L_0x02c1
            java.lang.String r0 = "add_phone"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.SGG.A00(r3, r9, r0, r1, r1)
            r7.add(r0)
        L_0x014b:
            if (r10 == 0) goto L_0x0300
            if (r8 <= r1) goto L_0x0154
            if (r10 != r1) goto L_0x0154
            A0A(r11, r4)
        L_0x0154:
            boolean r8 = r2.A0C()
            boolean r3 = r2.A0B()
            com.facebookpay.form.fragment.model.FeatureConfiguration r17 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r0 = r17
            r0.<init>(r8, r1, r3)
            r16 = 2131961330(0x7f1325f2, float:1.9559354E38)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.lang.String r12 = "client_add_contact_fail"
            java.lang.String r13 = "client_add_contact_success"
            java.lang.String r14 = "user_add_contact_submit"
            if (r15 == 0) goto L_0x01a3
            java.lang.String r15 = "client_load_contact_success"
            java.lang.String r3 = "add_name_inline"
            com.facebookpay.form.fragment.model.FormDisplayEvent r0 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r0.<init>(r15, r3, r6)
            r11.add(r0)
            com.facebookpay.form.fragment.model.FormClickEvent r0 = new com.facebookpay.form.fragment.model.FormClickEvent
            r0.<init>(r14, r3)
            r10.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r13, r3)
            r9.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r12, r3)
            r8.add(r0)
        L_0x01a3:
            if (r20 == 0) goto L_0x01c9
            java.lang.String r15 = "client_load_contact_success"
            java.lang.String r3 = "add_email_inline"
            com.facebookpay.form.fragment.model.FormDisplayEvent r0 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r0.<init>(r15, r3, r6)
            r11.add(r0)
            com.facebookpay.form.fragment.model.FormClickEvent r0 = new com.facebookpay.form.fragment.model.FormClickEvent
            r0.<init>(r14, r3)
            r10.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r13, r3)
            r9.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r12, r3)
            r8.add(r0)
        L_0x01c9:
            if (r19 == 0) goto L_0x01ef
            java.lang.String r15 = "client_load_contact_success"
            java.lang.String r3 = "add_phone_inline"
            com.facebookpay.form.fragment.model.FormDisplayEvent r0 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r0.<init>(r15, r3, r6)
            r11.add(r0)
            com.facebookpay.form.fragment.model.FormClickEvent r0 = new com.facebookpay.form.fragment.model.FormClickEvent
            r0.<init>(r14, r3)
            r10.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r13, r3)
            r9.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r12, r3)
            r8.add(r0)
        L_0x01ef:
            com.facebookpay.form.fragment.model.FormLoggingEvents r22 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r6
            r28 = r11
            r29 = r10
            r30 = r9
            r31 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r3 = X.C11431STx.A04()
            r0 = 2131961269(0x7f1325b5, float:1.955923E38)
            if (r3 == 0) goto L_0x0212
            r0 = 2131961197(0x7f13256d, float:1.9559084E38)
        L_0x0212:
            com.facebookpay.form.cell.label.LabelCellParams r20 = X.C11089S9k.A01(r0, r5, r5, r5)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r16)
            com.facebookpay.form.fragment.model.FormParams r3 = new com.facebookpay.form.fragment.model.FormParams
            r28 = r6
            r29 = r6
            r30 = r6
            r31 = r7
            r32 = r6
            r33 = r6
            r34 = r1
            r35 = r5
            r36 = r5
            r37 = r5
            r38 = r5
            r39 = r5
            r40 = r5
            r41 = r5
            r19 = r3
            r21 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r2.A02
            java.lang.String r0 = "ecpPaymentRequest"
            if (r1 != 0) goto L_0x02a5
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024d:
            X.S6J r3 = r3.A02
            r0 = r13 ^ 1
            r2.A05(r3, r4, r0, r0)
            goto L_0x014b
        L_0x0256:
            r0 = r13 ^ 1
            r2.A03(r9, r4, r0, r0)
            goto L_0x011e
        L_0x025d:
            r2.A04(r0, r4)
        L_0x0260:
            r11 = r6
            goto L_0x00f1
        L_0x0263:
            java.lang.Integer r24 = X.AnonymousClass05K.A0N
            goto L_0x00aa
        L_0x0267:
            java.util.Iterator r6 = r6.iterator()
            r10 = 0
        L_0x026c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r6.next()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x026c
            int r10 = r10 + 1
            if (r10 >= 0) goto L_0x026c
            goto L_0x029a
        L_0x0281:
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x0286:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r6.next()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0286
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x0286
        L_0x029a:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02a2:
            r15 = 0
            goto L_0x0023
        L_0x02a5:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r1.A05
            if (r0 == 0) goto L_0x02bc
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x02b1
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x02bc
        L_0x02b1:
            X.RH6 r1 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
            X.SUj.A0O(r0, r4)
            goto L_0x0306
        L_0x02bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02d0:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x02e0
            r0 = 2131961235(0x7f132593, float:1.9559161E38)
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r0 = X.Pxj.A0X(r0)
            X.SUj.A0O(r0, r4)
        L_0x02e0:
            if (r40 == 0) goto L_0x0306
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x02eb
            X.S5a r0 = r3.A01
            r2.A04(r0, r4)
        L_0x02eb:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x02f5
            X.S6I r1 = r3.A00
            r0 = 1
            r2.A03(r1, r4, r0, r0)
        L_0x02f5:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0306
            X.S6J r1 = r3.A02
            r0 = 1
            r2.A05(r1, r4, r0, r0)
            goto L_0x0306
        L_0x0300:
            android.util.SparseArray r0 = X.Pxe.A0L()
            r2.A00 = r0
        L_0x0306:
            java.util.List r0 = X.00k.A0a(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDU.A01(X.S60, X.QDU):java.util.List");
    }

    public static final void A02(BaseSelectionCheckoutItem baseSelectionCheckoutItem, QDU qdu) {
        C10575RuU ruU;
        C11022S5z s5z;
        Integer num;
        REO reo = (REO) qdu.A0C.A02();
        if (reo != null) {
            if (reo.ordinal() == 1) {
                num = AnonymousClass05K.A01;
            } else {
                SUj A0W = Pxe.A0W(qdu.A0H);
                if (A0W != null && (ruU = (C10575RuU) A0W.A01) != null && (s5z = (C11022S5z) ruU.A01) != null) {
                    RH6 BJZ = baseSelectionCheckoutItem.BJZ();
                    int ordinal = BJZ.ordinal();
                    String str = null;
                    if (ordinal == 30) {
                        S6Z s6z = s5z.A00;
                        if (s6z != null) {
                            str = s6z.A01;
                        }
                    } else if (ordinal == 31) {
                        S6V s6v = s5z.A01;
                        if (s6v != null) {
                            str = s6v.A02;
                        }
                    } else if (ordinal == 29) {
                        num = AnonymousClass05K.A00;
                    } else {
                        throw C66582MXn.A0k(BJZ, "Invalid contact item type: ", AnonymousClass7TE.A1A());
                    }
                    C9621Rdz.A00(baseSelectionCheckoutItem, str, false);
                    return;
                }
                return;
            }
            baseSelectionCheckoutItem.Ejn(num);
        }
    }

    private final void A03(S6I s6i, List list, boolean z, boolean z2) {
        String A072 = s6i.A00.A07("label");
        A0A(A072, list);
        List<S6Z> list2 = s6i.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (S6Z s6z : list2) {
            String str = s6z.A02;
            if (str != null) {
                String str2 = s6z.A01;
                if (str2 != null) {
                    boolean z3 = s6z.A04;
                    SelectionEmailViewItem selectionEmailViewItem = new SelectionEmailViewItem(RH6.A0o, AnonymousClass05K.A0N, str2, str, A072, s6z.A00, z2, z3);
                    A02(selectionEmailViewItem, this);
                    SUj.A0O(selectionEmailViewItem, A1C);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        list.addAll(A1C);
        if (z) {
            int i = 2131961177;
            if (A0C()) {
                i = 2131961178;
            }
            list.add(SUj.A09(new SelectionActionViewItem(RH6.A0n, 1, Integer.valueOf(i), A072, (String) null)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(X.C11006S5a r12, java.util.List r13) {
        /*
            r11 = this;
            X.QXR r1 = r12.A00
            java.lang.String r0 = "label"
            java.lang.String r4 = r1.A07(r0)
            A0A(r4, r13)
            java.lang.String r9 = r12.A01
            if (r9 == 0) goto L_0x002a
            boolean r0 = X.00l.A0W(r9)
            if (r0 != 0) goto L_0x002a
            X.RH6 r6 = X.RH6.A0q
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.String r8 = ""
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem
            r5 = r0
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0022:
            X.SUj r0 = X.SUj.A09(r0)
            r13.add(r0)
            return
        L_0x002a:
            r0 = 2131961179(0x7f13255b, float:1.9559048E38)
            r5 = 0
            java.lang.Integer r2 = X.Pxe.A0l()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.RH6 r1 = X.RH6.A0n
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDU.A04(X.S5a, java.util.List):void");
    }

    private final void A05(S6J s6j, List list, boolean z, boolean z2) {
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem;
        String optionalStringField = s6j.A00.getOptionalStringField(0, "label");
        A0A(optionalStringField, list);
        List<S6V> list2 = s6j.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (S6V s6v : list2) {
            String str = s6v.A01;
            if (str != null) {
                String str2 = s6v.A02;
                if (str2 != null) {
                    boolean z3 = s6v.A05;
                    selectionPhoneNumberViewItem = new SelectionPhoneNumberViewItem(RH6.A0s, AnonymousClass05K.A0N, str2, str, optionalStringField, s6v.A00, z2, z3);
                    A02(selectionPhoneNumberViewItem, this);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                selectionPhoneNumberViewItem = null;
            }
            SUj.A0O(selectionPhoneNumberViewItem, A1C);
        }
        list.addAll(A1C);
        if (z) {
            int i = 2131961180;
            if (A0C()) {
                i = 2131961361;
            }
            list.add(SUj.A09(new SelectionActionViewItem(RH6.A0n, 0, Integer.valueOf(i), optionalStringField, (String) null)));
        }
    }

    public static final void A06(QDU qdu) {
        List<SUj> list;
        Object obj;
        AnonymousClass2gB r5 = qdu.A0B;
        SUj A0W = Pxe.A0W(r5);
        if (A0W != null && (list = (List) A0W.A01) != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (SUj sUj : list) {
                Object obj2 = sUj.A01;
                if (obj2 != null) {
                    obj = (BaseCheckoutItem) obj2;
                    0qQ.A0B(obj, 0);
                    if (obj instanceof InlineFormItem) {
                        obj = A00((InlineFormItem) obj, qdu);
                    } else if (obj instanceof BaseSelectionCheckoutItem) {
                        A02((BaseSelectionCheckoutItem) obj, qdu);
                    }
                } else {
                    obj = null;
                }
                A0r.add(SUj.A06(sUj, obj));
            }
            Object A022 = r5.A02();
            if (A022 != null) {
                SUj.A0I(r5, (SUj) A022, A0r);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.S6V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.S6V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.S6V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.S6V} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r7 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f3, code lost:
        if (r5 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0159, code lost:
        if (r8 != null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0160, code lost:
        if (r7 != null) goto L_0x006b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.QDU r13, X.SUj r14) {
        /*
            X.2Fj r4 = r13.A0D
            r4.A0B(r14)
            java.lang.String r2 = r13.A04
            java.lang.String r12 = "Required value was null."
            r0 = 0
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r14.A01
            if (r1 == 0) goto L_0x01ef
            X.S60 r1 = (X.S60) r1
            boolean r1 = r13.A0E(r1, r2)
            if (r1 == 0) goto L_0x001a
            r13.A04 = r0
        L_0x001a:
            java.lang.String r2 = r13.A05
            if (r2 == 0) goto L_0x002c
            java.lang.Object r1 = r14.A01
            if (r1 == 0) goto L_0x01ea
            X.S60 r1 = (X.S60) r1
            boolean r1 = r13.A0F(r1, r2)
            if (r1 == 0) goto L_0x002c
            r13.A05 = r0
        L_0x002c:
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x018a
            X.2Fj r2 = r13.A0F
            X.ScN r1 = X.C11562ScN.A00
            X.SUj.A0E(r1, r2, r14)
            X.2Fj r2 = r13.A0E
            X.ScO r1 = X.C11563ScO.A00
            X.SUj.A0E(r1, r2, r14)
            X.2Fj r2 = r13.A0G
            X.ScP r1 = X.C11564ScP.A00
            X.SUj.A0E(r1, r2, r14)
            java.lang.Object r10 = r14.A01
            r9 = r10
            X.S60 r9 = (X.S60) r9
            if (r9 == 0) goto L_0x0166
            X.S6I r1 = r9.A00
            java.lang.String r3 = r1.A02
            X.S5b r5 = r1.A01
            X.S6J r1 = r9.A02
            java.lang.String r8 = r1.A02
            X.S5b r7 = r1.A01
        L_0x005a:
            X.2gB r2 = r13.A0B
            java.util.List r1 = A01(r9, r13)
            X.SUj.A0K(r2, r1)
            if (r3 != 0) goto L_0x00ee
            if (r5 != 0) goto L_0x00f5
            if (r8 != 0) goto L_0x015b
            if (r7 == 0) goto L_0x01b6
        L_0x006b:
            X.2Fj r6 = r13.A0H
            X.SUj r1 = X.Pxe.A0W(r6)
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r1 = r1.A01
            X.RuU r1 = (X.C10575RuU) r1
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r1 = r1.A01
            X.S5z r1 = (X.C11022S5z) r1
            if (r1 == 0) goto L_0x00ec
            X.S6V r1 = r1.A01
            if (r1 == 0) goto L_0x00ec
            java.lang.String r2 = r1.A02
        L_0x0085:
            java.lang.String r1 = r7.A01
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00d5
            if (r10 == 0) goto L_0x0171
            X.S6J r1 = r9.A02
            java.util.List r1 = r1.A03
            r8 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x0098:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.S6V r1 = (X.S6V) r1
            if (r1 == 0) goto L_0x00ea
            java.lang.String r2 = r1.A02
        L_0x00a9:
            java.lang.String r1 = r7.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0098
            r8 = r3
        L_0x00b2:
            X.S6V r8 = (X.S6V) r8
            if (r8 == 0) goto L_0x016c
            X.SUj r5 = X.Pxe.A0W(r6)
            java.lang.Object r4 = r5.A01
            X.RuU r4 = (X.C10575RuU) r4
            java.lang.Object r1 = r4.A01
            X.S5z r1 = (X.C11022S5z) r1
            java.lang.String r2 = r1.A02
            X.S6Z r1 = r1.A00
            X.S5z r3 = new X.S5z
            r3.<init>(r1, r8, r2)
            java.lang.Integer r2 = r4.A00
            X.RuU r1 = new X.RuU
            r1.<init>(r2, r3, r0)
            X.SUj.A0I(r6, r5, r1)
        L_0x00d5:
            X.0eM r0 = r13.A0L
            X.Std r3 = X.Pxh.A0S(r0)
            java.lang.String r2 = r13.A06
            if (r2 != 0) goto L_0x01c6
            java.lang.String r0 = "productID"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ea:
            r2 = r8
            goto L_0x00a9
        L_0x00ec:
            r2 = r0
            goto L_0x0085
        L_0x00ee:
            if (r10 == 0) goto L_0x0185
            r13.A0E(r9, r3)
            if (r5 == 0) goto L_0x0159
        L_0x00f5:
            X.2Fj r6 = r13.A0H
            X.SUj r1 = X.Pxe.A0W(r6)
            if (r1 == 0) goto L_0x0164
            java.lang.Object r1 = r1.A01
            X.RuU r1 = (X.C10575RuU) r1
            if (r1 == 0) goto L_0x0164
            java.lang.Object r1 = r1.A01
            X.S5z r1 = (X.C11022S5z) r1
            if (r1 == 0) goto L_0x0164
            X.S6Z r1 = r1.A00
            if (r1 == 0) goto L_0x0164
            java.lang.String r2 = r1.A01
        L_0x010f:
            java.lang.String r1 = r5.A01
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0159
            if (r10 == 0) goto L_0x0180
            X.S6I r1 = r9.A00
            java.util.List r1 = r1.A03
            java.util.Iterator r4 = r1.iterator()
        L_0x0121:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x017b
            java.lang.Object r3 = r4.next()
            r11 = r3
            X.S6Z r11 = (X.S6Z) r11
            java.lang.String r2 = r11.A01
            java.lang.String r1 = r5.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0121
            if (r3 == 0) goto L_0x017b
            X.SUj r5 = X.Pxe.A0W(r6)
            java.lang.Object r4 = r5.A01
            X.RuU r4 = (X.C10575RuU) r4
            java.lang.Object r1 = r4.A01
            X.S5z r1 = (X.C11022S5z) r1
            java.lang.String r2 = r1.A02
            X.S6V r1 = r1.A01
            X.S5z r3 = new X.S5z
            r3.<init>(r11, r1, r2)
            java.lang.Integer r2 = r4.A00
            X.RuU r1 = new X.RuU
            r1.<init>(r2, r3, r0)
            X.SUj.A0I(r6, r5, r1)
        L_0x0159:
            if (r8 == 0) goto L_0x0160
        L_0x015b:
            if (r10 == 0) goto L_0x0176
            r13.A0F(r9, r8)
        L_0x0160:
            if (r7 == 0) goto L_0x00d5
            goto L_0x006b
        L_0x0164:
            r2 = r0
            goto L_0x010f
        L_0x0166:
            r3 = r0
            r5 = r0
            r8 = r0
            r7 = r0
            goto L_0x005a
        L_0x016c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0176:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x017b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0180:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0185:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x018a:
            boolean r1 = X.SUj.A0S(r14)
            if (r1 == 0) goto L_0x01bf
            X.2Fj r2 = r13.A0H
            java.lang.Throwable r3 = r14.A02
            X.SUj r1 = X.Pxe.A0W(r2)
            if (r1 == 0) goto L_0x01bd
            java.lang.Object r1 = r1.A01
        L_0x019c:
            X.SUj.A0M(r2, r1, r3)
            X.2gB r2 = r13.A0B
            X.SUj r1 = X.Pxe.A0W(r4)
            if (r1 == 0) goto L_0x01ab
            java.lang.Object r0 = r1.A01
            X.S60 r0 = (X.S60) r0
        L_0x01ab:
            java.util.List r0 = A01(r0, r13)
            X.SUj r0 = X.SUj.A0A(r0, r3)
        L_0x01b3:
            r2.A0B(r0)
        L_0x01b6:
            X.2Fj r2 = r13.A0H
            java.lang.Object r0 = r2.A02()
            goto L_0x01e4
        L_0x01bd:
            r1 = r0
            goto L_0x019c
        L_0x01bf:
            X.2gB r2 = r13.A0B
            X.SUj r0 = X.SUj.A08(r0)
            goto L_0x01b3
        L_0x01c6:
            X.QDH r1 = r13.A0K
            X.5tb r0 = X.C298525tb.CONTACT_INFORMATION
            X.SJ1 r0 = X.SJ1.A00(r0, r1, r2)
            X.2gB r2 = r3.A06(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>"
            X.0qQ.A0C(r2, r0)
            X.SUj r1 = X.Pxe.A0W(r2)
            if (r1 == 0) goto L_0x01e8
            X.ScG r0 = X.C11555ScG.A00
            X.SUj r0 = X.SUj.A04(r0, r1)
        L_0x01e4:
            r2.A0B(r0)
            return
        L_0x01e8:
            r0 = 0
            goto L_0x01e4
        L_0x01ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDU.A07(X.QDU, X.SUj):void");
    }

    private final void A08(Long l, String str, boolean z) {
        String str2;
        Map map;
        if (this.A0C.A02() == REO.EDIT || z) {
            str2 = "user_edit_contact_enter";
        } else {
            str2 = "user_click_contact_atomic";
        }
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            Pxh.A11();
            throw AnonymousClass00P.createAndThrow();
        }
        SEB A032 = this.A0K.A03();
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        Pxj.A1K(l, "TARGET_NAME", str, A0n);
        Object obj = A0n.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
            map = AnonymousClass7TE.A1H();
        }
        SUU.A0A(A032, map);
        C12411Sto.A0A(A002, "extra_data", map, str2, A0n);
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A08);
        }
        return false;
    }

    private final boolean A0C() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A09);
        }
        return false;
    }

    private final boolean A0D() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A0A);
        }
        return false;
    }

    private final boolean A0E(S60 s60, String str) {
        Object obj;
        Iterator it = s60.A00.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((S6Z) obj).A01, str)) {
                break;
            }
        }
        S6Z s6z = (S6Z) obj;
        if (s6z == null) {
            return false;
        }
        AnonymousClass2Fj r5 = this.A0H;
        SUj A0W = Pxe.A0W(r5);
        C11022S5z s5z = (C11022S5z) ((C10575RuU) A0W.A01).A01;
        SUj.A0I(r5, A0W, new C10575RuU(AnonymousClass05K.A00, new C11022S5z(s6z, s5z.A01, s5z.A02), (String) null));
        return true;
    }

    private final boolean A0F(S60 s60, String str) {
        Object obj;
        Iterator it = s60.A02.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((S6V) obj).A02, str)) {
                break;
            }
        }
        S6V s6v = (S6V) obj;
        if (s6v == null) {
            return false;
        }
        AnonymousClass2Fj r5 = this.A0H;
        SUj A0W = Pxe.A0W(r5);
        C11022S5z s5z = (C11022S5z) ((C10575RuU) A0W.A01).A01;
        SUj.A0I(r5, A0W, new C10575RuU(AnonymousClass05K.A00, new C11022S5z(s5z.A00, s6v, s5z.A02), (String) null));
        return true;
    }

    public final boolean A0H(String str) {
        SJ1 A002 = SJ1.A00(C298525tb.CONTACT_INFORMATION, this.A0K, str);
        if ((!this.A08 || Pxh.A0S(this.A0L).A0E(A002)) && ((!this.A07 || Pxh.A0S(this.A0L).A0D(A002)) && (!this.A09 || Pxh.A0S(this.A0L).A0F(A002)))) {
            return false;
        }
        return true;
    }

    public final AnonymousClass2Fj AuQ() {
        return this.A0C;
    }

    public final void EIE() {
        AnonymousClass2Fj r2 = this.A0C;
        if (r2.A02() != REO.NONE) {
            r2.A0B(A0M);
            A06(this);
        }
    }

    public final 2Fk ELG() {
        return this.A0B;
    }

    public final boolean Ern() {
        List<Object> A1P = 0sr.A1P(new Boolean[]{Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), Boolean.valueOf(this.A09)});
        if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
            int i = 0;
            for (Object A1a : A1P) {
                if (AnonymousClass7TE.A1a(A1a) && (i = i + 1) < 0) {
                    0sr.A1S();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public final void EzK() {
        AnonymousClass2Fj r3 = this.A0C;
        REO reo = (REO) r3.A02();
        if (reo != null) {
            int ordinal = reo.ordinal();
            if (ordinal == 1) {
                reo = REO.SELECT;
            } else if (ordinal == 2) {
                reo = REO.EDIT;
            }
            r3.A0B(reo);
        }
        A06(this);
    }

    public final void FKb(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }

    public QDU(QDH qdh) {
        this.A0K = qdh;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A0B = A0M2;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        SUj.A0L(A0K2, (Object) null);
        this.A0D = A0K2;
        AnonymousClass2Fj A002 = SUj.A00((Object) null);
        this.A0H = A002;
        this.A0C = new 2Fk(A0M);
        AnonymousClass2gB A0M3 = Pxh.A0M();
        SUj.A0L(A0M3, (Object) null);
        this.A0A = A0M3;
        this.A0F = JTO.A0K();
        this.A0E = JTO.A0K();
        this.A0G = JTO.A0K();
        this.A0I = C11649Sdr.A00(this, 19);
        C11649Sdr A003 = C11649Sdr.A00(this, 20);
        this.A0J = A003;
        this.A00 = Pxe.A0L();
        A0M3.A0E(A002, A003);
        A0M2.A0E(A002, A003);
    }

    private final void A09(String str) {
        Map map;
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            Pxh.A11();
            throw AnonymousClass00P.createAndThrow();
        }
        SEB A032 = this.A0K.A03();
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        A0n.put("TARGET_NAME", str);
        Object obj = A0n.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
            map = AnonymousClass7TE.A1H();
        }
        SUU.A0A(A032, map);
        A0n.put("extra_data", map);
        ImmutableMap copyOf = ImmutableMap.copyOf(A0n);
        0qQ.A07(copyOf);
        A002.Cgl("user_add_contact_enter", copyOf);
    }
}
