package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.FormField;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.Qfo  reason: case insensitive filesystem */
public final class C8044Qfo extends C298475tU {
    public AddressTypeaheadController A00;
    public C8041Qfl A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final LoggingContext A0B;
    public final int A0C;
    public final SparseArray A0D = Pxe.A0L();
    public final AddressFormFieldsConfig A0E;
    public final String A0F;
    public final List A0G;
    public final Map A0H;
    public final Set A0I;
    public final Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    private final FormCellLoggingEvents A00(int i) {
        Map map = this.A0H;
        if (map != null) {
            return (FormCellLoggingEvents) C51968G9o.A10(map, i);
        }
        return null;
    }

    public static void A04(C8029QfJ qfJ, FormField formField) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) formField.A04);
        0qQ.A07(copyOf);
        qfJ.A0G.addAll(copyOf);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.addresslist.AddressListCellParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2 == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06(android.util.SparseArray r14, com.google.common.collect.ImmutableList.Builder r15) {
        /*
            r13 = this;
            boolean r0 = r13.A0Q
            r10 = 0
            if (r0 == 0) goto L_0x0072
            com.facebookpay.logging.LoggingContext r4 = r13.A0B
            if (r4 == 0) goto L_0x0072
            java.util.List r3 = r13.A0G
            if (r3 == 0) goto L_0x0072
            r9 = 33
            java.lang.Object r0 = r14.get(r9)
            if (r0 == 0) goto L_0x0072
            int r0 = r3.size()
            r5 = 2
            r11 = 1
            boolean r2 = X.C51970G9q.A1W(r0, r5)
            r1 = 34
            java.lang.Object r0 = r14.get(r1)
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r14.get(r1)
            boolean r0 = X.JTQ.A1W(r0)
            if (r0 != 0) goto L_0x0036
            r0 = 1
            if (r2 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r2 = 2131951651(0x7f130023, float:1.9539723E38)
            if (r0 == 0) goto L_0x0040
            java.util.List r3 = r3.subList(r10, r5)
        L_0x0040:
            java.lang.Object r5 = r14.get(r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem"
            X.0qQ.A0C(r5, r0)
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r5 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r5
            boolean r1 = r13.A0L
            r7 = 0
            X.C51972G9s.A1D(r3, r5)
            r0 = 6
            X.0qQ.A0B(r4, r0)
            r8 = 1065353216(0x3f800000, float:1.0)
            com.facebookpay.form.cell.addresslist.AddressListCellParams r6 = new com.facebookpay.form.cell.addresslist.AddressListCellParams
            r12 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r6.A03 = r0
            r6.A03 = r3
            r6.A01 = r5
            r6.A00 = r2
            r6.A02 = r4
            r6.A04 = r1
            r15.add(r6)
            return r11
        L_0x0072:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8044Qfo.A06(android.util.SparseArray, com.google.common.collect.ImmutableList$Builder):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams, java.lang.Object] */
    private final boolean A07(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z;
        Integer num;
        boolean z2 = false;
        if (!this.A0Q || (list = this.A0G) == null || list.isEmpty()) {
            return false;
        }
        if (list.size() > 2) {
            z = true;
            num = Integer.valueOf(DbT.A02(list, 2));
        } else {
            z = false;
            num = null;
        }
        if (sparseArray.get(34) != null) {
            z2 = JTQ.A1W(sparseArray.get(34));
        }
        int size = list.size();
        int i = R.string.f0nameremoved;
        if (size == 1) {
            i = R.string.f0nameremoved;
        }
        ? cellParams = new CellParams((FormCellLoggingEvents) null, 1.0f, 34, 0, true, true);
        cellParams.A03 = z2;
        cellParams.A04 = z;
        cellParams.A01 = R.string.f0nameremoved;
        cellParams.A00 = i;
        cellParams.A02 = num;
        builder.add(cellParams);
        return true;
    }

    private final boolean A08(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z = false;
        if (sparseArray.get(24) != null) {
            Object obj = sparseArray.get(24);
            if (obj != null) {
                int A0M2 = AnonymousClass7TE.A0M(obj);
                if (A0M2 != 0) {
                    if (this.A0Q && (list = this.A0G) != null && !list.isEmpty()) {
                        z = true;
                    }
                    C8028QfI qfI = new C8028QfI(24);
                    qfI.A03 = A0M2;
                    qfI.A07 = true;
                    int i = R.attr.fbpay_hub_header_item_below_name_margin_top;
                    if (z) {
                        i = R.attr.fbpay_hub_header_item_within_billing_section_margin_top;
                    }
                    qfI.A04 = i;
                    builder.add(qfI.A00());
                    return true;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.checkbox.CheckboxCellParams] */
    private final boolean A09(SparseArray sparseArray, ImmutableList.Builder builder) {
        boolean A1W;
        if (!this.A0S) {
            return false;
        }
        if (sparseArray.get(29) == null) {
            A1W = false;
        } else {
            A1W = JTQ.A1W(sparseArray.get(29));
        }
        boolean z = this.A0L;
        String str = this.A0F;
        ? cellParams = new CellParams((FormCellLoggingEvents) null, 1.0f, 29, 0, true, true);
        cellParams.A03 = A1W;
        cellParams.A01 = R.string.f0nameremoved;
        cellParams.A00 = 2131954882;
        cellParams.A04 = z;
        cellParams.A02 = str;
        builder.add(cellParams);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r1.length() != 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        if (r1.length() != 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0100, code lost:
        if (r0 == 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0165, code lost:
        if (X.C51966G9m.A1a(r2, r1) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017d, code lost:
        if (X.C51966G9m.A1a(r2, r1) == false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0042 A[EDGE_INSN: B:133:0x0042->B:12:0x0042 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I() {
        /*
            r16 = this;
            r7 = r16
            java.lang.Object r6 = X.SRc.A0A(r7)
            java.lang.String r2 = "Required value was null."
            if (r6 == 0) goto L_0x0202
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            r5 = 10
            java.lang.Object r0 = r6.get(r5)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebook.common.locale.Country"
            X.0qQ.A0C(r0, r4)
            com.facebook.common.locale.LocaleMember r0 = (com.facebook.common.locale.LocaleMember) r0
            java.util.Locale r3 = r0.A00
            java.lang.String r1 = r3.getCountry()
            X.0qQ.A07(r1)
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = r7.A0E
            java.util.List<com.facebookpay.form.model.FormCountry> r0 = r0.A01
            com.facebookpay.form.model.FormCountry r0 = X.C11393SRk.A02(r1, r0)
            if (r0 == 0) goto L_0x01fd
            java.util.List<com.facebookpay.form.model.FormField> r9 = r0.A01
            boolean r8 = r9 instanceof java.util.Collection
            if (r8 == 0) goto L_0x01df
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01df
        L_0x0039:
            r15 = 0
        L_0x003a:
            if (r8 == 0) goto L_0x01c1
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01c1
        L_0x0042:
            r14 = 0
        L_0x0043:
            android.util.SparseArray r8 = r7.A04
            java.lang.Object r0 = r8.get(r5)
            X.0qQ.A0C(r0, r4)
            com.facebook.common.locale.LocaleMember r0 = (com.facebook.common.locale.LocaleMember) r0
            java.util.Locale r0 = r0.A00
            java.lang.String r4 = r0.getISO3Country()
            X.0qQ.A07(r4)
            java.lang.String r3 = r3.getISO3Country()
            X.0qQ.A07(r3)
            boolean r1 = r7.A0M
            r5 = 9
            r7 = 8
            r10 = 31
            r9 = 7
            r11 = 30
            r12 = 6
            r13 = 5
            r0 = 2
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r6.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0080
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x0080:
            java.lang.Object r1 = r6.get(r13)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0092
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0092
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x0092:
            java.lang.Object r1 = r6.get(r12)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00a4
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x00a4:
            if (r15 == 0) goto L_0x00b8
            java.lang.Object r1 = r6.get(r11)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00b8
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00b8
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x00b8:
            if (r14 == 0) goto L_0x00cc
            java.lang.Object r1 = r6.get(r10)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00cc
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00cc
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x00cc:
            java.lang.Object r1 = r6.get(r9)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00de
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00de
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x00de:
            java.lang.Object r1 = r6.get(r7)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00f0
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010b
        L_0x00f0:
            java.lang.Object r1 = r6.get(r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0102
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0102
            int r0 = r1.length()
        L_0x0100:
            if (r0 != 0) goto L_0x010b
        L_0x0102:
            boolean r0 = r4.equals(r3)
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x010c
        L_0x010b:
            r0 = 1
        L_0x010c:
            return r0
        L_0x010d:
            java.lang.Object r2 = X.Pxj.A0j(r8, r0)
            java.lang.Object r1 = r6.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x011b
            if (r1 != 0) goto L_0x011d
        L_0x011b:
            java.lang.String r1 = ""
        L_0x011d:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
            java.lang.Object r2 = X.Pxj.A0j(r8, r13)
            java.lang.Object r1 = r6.get(r13)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0131
            if (r1 != 0) goto L_0x0133
        L_0x0131:
            java.lang.String r1 = ""
        L_0x0133:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
            java.lang.Object r2 = X.Pxj.A0j(r8, r12)
            java.lang.Object r1 = r6.get(r12)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0147
            if (r1 != 0) goto L_0x0149
        L_0x0147:
            java.lang.String r1 = ""
        L_0x0149:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
            if (r15 == 0) goto L_0x0167
            java.lang.Object r2 = X.Pxj.A0j(r8, r11)
            java.lang.Object r1 = r6.get(r11)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x015f
            if (r1 != 0) goto L_0x0161
        L_0x015f:
            java.lang.String r1 = ""
        L_0x0161:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
        L_0x0167:
            if (r14 == 0) goto L_0x017f
            java.lang.Object r2 = X.Pxj.A0j(r8, r10)
            java.lang.Object r1 = r6.get(r10)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0177
            if (r1 != 0) goto L_0x0179
        L_0x0177:
            java.lang.String r1 = ""
        L_0x0179:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
        L_0x017f:
            java.lang.Object r2 = X.Pxj.A0j(r8, r9)
            java.lang.Object r1 = r6.get(r9)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x018d
            if (r1 != 0) goto L_0x018f
        L_0x018d:
            java.lang.String r1 = ""
        L_0x018f:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
            java.lang.Object r2 = X.Pxj.A0j(r8, r7)
            java.lang.Object r1 = r6.get(r7)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x01a3
            if (r1 != 0) goto L_0x01a5
        L_0x01a3:
            java.lang.String r1 = ""
        L_0x01a5:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 != 0) goto L_0x010b
            java.lang.Object r2 = X.Pxj.A0j(r8, r5)
            java.lang.Object r1 = r6.get(r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x01b9
            if (r1 != 0) goto L_0x01bb
        L_0x01b9:
            java.lang.String r1 = ""
        L_0x01bb:
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            goto L_0x0100
        L_0x01c1:
            java.util.Iterator r2 = r9.iterator()
        L_0x01c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r2.next()
            com.facebookpay.form.model.FormField r0 = (com.facebookpay.form.model.FormField) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "subdistrict"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01c5
            r14 = 1
            goto L_0x0043
        L_0x01df:
            java.util.Iterator r2 = r9.iterator()
        L_0x01e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()
            com.facebookpay.form.model.FormField r0 = (com.facebookpay.form.model.FormField) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "neighborhood"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01e3
            r15 = 1
            goto L_0x003a
        L_0x01fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0202:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8044Qfo.A0I():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: com.facebookpay.form.cell.text.formatter.TextFormatter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: com.facebookpay.form.cell.text.formatter.TextFormatter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v146, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v223, resolved type: com.facebookpay.form.cell.text.formatter.TextFormatter} */
    /* JADX WARNING: type inference failed for: r0v30, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v49, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v98, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0262, code lost:
        if (r13.A0I.contains(r3) != false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e1, code lost:
        if (r13.A0I.contains(r3) != false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ef, code lost:
        if (r3 != false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f1, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f2, code lost:
        r2.A02 = r0;
        r2.A02 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02fc, code lost:
        if ((7 - r1) == 0) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02fe, code lost:
        r0 = "addressRegion";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0312, code lost:
        r0 = "addressLocality";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0476, code lost:
        r2.A09 = r0;
        r2.A0C = r13.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x047c, code lost:
        r0 = r2.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0480, code lost:
        r10.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (r3.A05 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r3.A05 != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        if (r4 == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        if (X.Pxf.A1U(r13.A0J, 28) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018b, code lost:
        r2.A03 = r0;
        r2.A0E = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019e, code lost:
        r2.A0A = r14.A03;
        r2.A02 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fb, code lost:
        if (r13.A0I.contains(9) != false) goto L_0x01fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.ImmutableList A0M() {
        /*
            r26 = this;
            r13 = r26
            java.lang.Object r12 = X.SRc.A0A(r13)
            java.lang.String r2 = "Required value was null."
            if (r12 == 0) goto L_0x0606
            android.util.SparseArray r12 = (android.util.SparseArray) r12
            com.facebook.common.locale.Country r23 = r13.A0P()
            r0 = r23
            java.util.Locale r0 = r0.A00
            java.lang.String r1 = r0.getCountry()
            X.0qQ.A07(r1)
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = r13.A0E
            java.util.List<com.facebookpay.form.model.FormCountry> r0 = r0.A01
            r25 = r0
            com.facebookpay.form.model.FormCountry r11 = X.C11393SRk.A02(r1, r0)
            com.google.common.collect.ImmutableList$Builder r10 = X.Pxe.A0Y()
            java.util.HashSet r9 = X.AnonymousClass7TE.A1F()
            r8 = 0
            X.0qQ.A0B(r12, r8)
            r1 = 29
            java.lang.Object r0 = r12.get(r1)
            if (r0 != 0) goto L_0x00ca
            r24 = 0
        L_0x003b:
            r1 = 33
            java.lang.Object r0 = r12.get(r1)
            if (r0 != 0) goto L_0x00c2
            r7 = 1
        L_0x0044:
            X.2Fj r0 = r13.A07
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0601
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x05fc
            int r1 = r13.A0C
            if (r1 == 0) goto L_0x007a
            r0 = 25
            X.QfI r2 = new X.QfI
            r2.<init>(r0)
            r2.A03 = r1
            r0 = 1
            r2.A07 = r0
            boolean r1 = r13.A0K
            r0 = 2130969470(0x7f04037e, float:1.7547623E38)
            if (r1 == 0) goto L_0x006a
            r0 = 0
        L_0x006a:
            r2.A04 = r0
            if (r1 == 0) goto L_0x0073
            r0 = 2130969518(0x7f0403ae, float:1.754772E38)
            r2.A00 = r0
        L_0x0073:
            com.facebookpay.form.cell.label.LabelCellParams r0 = r2.A00()
            r10.add(r0)
        L_0x007a:
            java.lang.String r22 = ""
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            if (r11 == 0) goto L_0x04b7
            java.util.List<com.facebookpay.form.model.FormField> r2 = r11.A01
            java.util.Iterator r15 = r2.iterator()
            r14 = 1
            r5 = 0
            r4 = 0
        L_0x008a:
            boolean r0 = r15.hasNext()
            java.lang.String r21 = "zip"
            java.lang.String r20 = "state"
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r3 = r15.next()
            com.facebookpay.form.model.FormField r3 = (com.facebookpay.form.model.FormField) r3
            java.lang.String r1 = r3.A02
            r0 = r20
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b0
            if (r14 == 0) goto L_0x00ad
            boolean r0 = r3.A05
            r14 = 1
            if (r0 == 0) goto L_0x00ae
        L_0x00ad:
            r14 = 0
        L_0x00ae:
            r5 = 1
            goto L_0x008a
        L_0x00b0:
            r0 = r21
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008a
            if (r14 == 0) goto L_0x00bf
            boolean r0 = r3.A05
            r14 = 1
            if (r0 == 0) goto L_0x00c0
        L_0x00bf:
            r14 = 0
        L_0x00c0:
            r4 = 1
            goto L_0x008a
        L_0x00c2:
            java.lang.Object r0 = r12.get(r1)
            boolean r7 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            goto L_0x0044
        L_0x00ca:
            java.lang.Object r0 = r12.get(r1)
            boolean r24 = X.JTQ.A1W(r0)
            goto L_0x003b
        L_0x00d4:
            if (r14 == 0) goto L_0x00dc
            if (r5 == 0) goto L_0x00dc
            r19 = 1
            if (r4 != 0) goto L_0x00de
        L_0x00dc:
            r19 = 0
        L_0x00de:
            boolean r5 = r13.A0N
            if (r5 == 0) goto L_0x00ed
            java.util.Set r1 = r13.A0J
            r0 = 28
            boolean r0 = X.Pxf.A1U(r1, r0)
            r4 = 1
            if (r0 != 0) goto L_0x00ee
        L_0x00ed:
            r4 = 0
        L_0x00ee:
            java.util.Iterator r18 = r2.iterator()
        L_0x00f2:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0491
            java.lang.Object r14 = r18.next()
            com.facebookpay.form.model.FormField r14 = (com.facebookpay.form.model.FormField) r14
            java.lang.String r1 = r14.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1881886578: goto L_0x0108;
                case -1881886577: goto L_0x0151;
                case 120609: goto L_0x01aa;
                case 3053931: goto L_0x0225;
                case 109757585: goto L_0x027e;
                case 498460430: goto L_0x0316;
                case 553963973: goto L_0x0359;
                case 957831062: goto L_0x040d;
                case 1538830798: goto L_0x0441;
                default: goto L_0x0107;
            }
        L_0x0107:
            goto L_0x00f2
        L_0x0108:
            java.lang.String r0 = "street1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x0144
            r0 = r22
            r1 = 5
        L_0x011e:
            X.AnonymousClass7TF.A1M(r9, r1)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r1)
            int r3 = r13.A07
            r2.A01 = r3
            boolean r3 = r14.A05
            r3 = r3 ^ 1
            r2.A04 = r3
            r2.A0B = r0
            A04(r2, r14)
            java.lang.String r0 = "streetAddress"
            r2.A09 = r0
            boolean r0 = r13.A0L
            r2.A0C = r0
            if (r5 == 0) goto L_0x019e
            r0 = 2131954831(0x7f130c8f, float:1.9546172E38)
            goto L_0x018b
        L_0x0144:
            android.util.SparseArray r0 = r13.A0D
            r1 = 5
            java.lang.Object r0 = A01(r0, r13, r1)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x011e
        L_0x0151:
            java.lang.String r0 = "street2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x0191
            r0 = r22
            r1 = 6
        L_0x0167:
            X.AnonymousClass7TF.A1M(r9, r1)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r1)
            int r3 = r13.A08
            r2.A01 = r3
            boolean r3 = r14.A05
            r3 = r3 ^ 1
            r2.A04 = r3
            r2.A0B = r0
            A04(r2, r14)
            java.lang.String r0 = "extendedAddress"
            r2.A09 = r0
            boolean r0 = r13.A0L
            r2.A0C = r0
            if (r5 == 0) goto L_0x019e
            r0 = 2131954832(0x7f130c90, float:1.9546174E38)
        L_0x018b:
            r2.A03 = r0
            r2.A0E = r4
            goto L_0x047c
        L_0x0191:
            android.util.SparseArray r0 = r13.A0D
            r1 = 6
            java.lang.Object r0 = A01(r0, r13, r1)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0167
        L_0x019e:
            java.lang.String r0 = r14.A03
            r2.A0A = r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r1)
            r2.A02 = r0
            goto L_0x047c
        L_0x01aa:
            r0 = r21
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            java.util.Set r0 = r13.A0J
            r16 = r0
            r3 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0219
            r0 = r22
        L_0x01c8:
            r9.add(r1)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r3)
            int r15 = r13.A0A
            r2.A01 = r15
            java.lang.String r15 = r14.A03
            r2.A0A = r15
            java.lang.Integer r15 = r14.A00
            X.0qQ.A0B(r15, r8)
            r2.A08 = r15
            A04(r2, r14)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r19 == 0) goto L_0x01e8
            r14 = 1056964608(0x3f000000, float:0.5)
        L_0x01e8:
            r2.A00 = r14
            r2.A0B = r0
            r0 = r16
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x01fd
            java.util.Set r0 = r13.A0I
            boolean r14 = r0.contains(r1)
            r0 = 0
            if (r14 == 0) goto L_0x01fe
        L_0x01fd:
            r0 = 1
        L_0x01fe:
            r2.A0E = r0
            java.util.Set r0 = r13.A0I
            boolean r1 = r0.contains(r1)
            r0 = 0
            if (r1 == 0) goto L_0x020c
            r0 = 2131954891(0x7f130ccb, float:1.9546294E38)
        L_0x020c:
            r2.A02 = r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r3)
            r2.A02 = r0
            java.lang.String r0 = "postalCode"
            goto L_0x0476
        L_0x0219:
            android.util.SparseArray r0 = r13.A0D
            java.lang.Object r0 = A01(r0, r13, r3)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01c8
        L_0x0225:
            java.lang.String r0 = "city"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x0271
            r0 = r22
            r1 = 7
        L_0x023a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r9.add(r3)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r1)
            int r15 = r13.A02
            r2.A01 = r15
            java.lang.String r15 = r14.A03
            r2.A0A = r15
            boolean r15 = r14.A05
            r15 = r15 ^ 1
            r2.A04 = r15
            r2.A0B = r0
            A04(r2, r14)
            if (r4 != 0) goto L_0x0264
            java.util.Set r0 = r13.A0I
            boolean r14 = r0.contains(r3)
            r0 = 0
            if (r14 == 0) goto L_0x0265
        L_0x0264:
            r0 = 1
        L_0x0265:
            r2.A0E = r0
            java.util.Set r0 = r13.A0I
            boolean r3 = r0.contains(r3)
            r0 = 2131954841(0x7f130c99, float:1.9546193E38)
            goto L_0x02ef
        L_0x0271:
            android.util.SparseArray r0 = r13.A0D
            r1 = 7
            java.lang.Object r0 = A01(r0, r13, r1)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x023a
        L_0x027e:
            r0 = r20
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x0304
            r0 = r22
            r1 = 8
        L_0x0294:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r9.add(r3)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r1)
            int r15 = r13.A06
            r2.A01 = r15
            java.lang.String r15 = r14.A03
            r2.A0A = r15
            r15 = 2131954884(0x7f130cc4, float:1.954628E38)
            r2.A00 = r15
            r2.A0B = r0
            com.facebook.common.locale.Country r0 = r11.A00
            java.util.Locale r0 = r0.A00
            java.lang.String r15 = r0.getCountry()
            java.lang.String r0 = "US"
            boolean r0 = X.0qQ.A0K(r15, r0)
            if (r0 == 0) goto L_0x0302
            com.facebookpay.form.cell.text.formatter.UpperCaseFormatter r0 = new com.facebookpay.form.cell.text.formatter.UpperCaseFormatter
            r0.<init>()
        L_0x02c4:
            r2.A04 = r0
            java.lang.Integer r0 = r14.A00
            X.0qQ.A0B(r0, r8)
            r2.A08 = r0
            A04(r2, r14)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r19 == 0) goto L_0x02d6
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x02d6:
            r2.A00 = r0
            if (r4 != 0) goto L_0x02e3
            java.util.Set r0 = r13.A0I
            boolean r14 = r0.contains(r3)
            r0 = 0
            if (r14 == 0) goto L_0x02e4
        L_0x02e3:
            r0 = 1
        L_0x02e4:
            r2.A0E = r0
            java.util.Set r0 = r13.A0I
            boolean r3 = r0.contains(r3)
            r0 = 2131954887(0x7f130cc7, float:1.9546286E38)
        L_0x02ef:
            if (r3 != 0) goto L_0x02f2
            r0 = 0
        L_0x02f2:
            r2.A02 = r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r1)
            r2.A02 = r0
            int r1 = 7 - r1
            if (r1 == 0) goto L_0x0312
            java.lang.String r0 = "addressRegion"
            goto L_0x0476
        L_0x0302:
            r0 = 0
            goto L_0x02c4
        L_0x0304:
            android.util.SparseArray r0 = r13.A0D
            r1 = 8
            java.lang.Object r0 = A01(r0, r13, r1)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0294
        L_0x0312:
            java.lang.String r0 = "addressLocality"
            goto L_0x0476
        L_0x0316:
            java.lang.String r0 = "neighborhood"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            r1 = 30
            if (r4 == 0) goto L_0x034d
            r0 = r22
        L_0x032d:
            X.AnonymousClass7TF.A1M(r9, r1)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r1)
            int r1 = r13.A05
            r2.A01 = r1
            java.lang.String r1 = r14.A03
            r2.A0A = r1
            boolean r1 = r14.A05
            r1 = r1 ^ 1
            r2.A04 = r1
            r2.A0B = r0
            A04(r2, r14)
            r2.A0E = r4
            r0 = 0
            goto L_0x0476
        L_0x034d:
            android.util.SparseArray r0 = r13.A0D
            java.lang.Object r0 = A01(r0, r13, r1)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x032d
        L_0x0359:
            java.lang.String r0 = "care_of"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r13.A07(r12, r10)
            if (r0 == 0) goto L_0x0370
            r0 = 34
            X.AnonymousClass7TF.A1M(r9, r0)
        L_0x0370:
            boolean r0 = r13.A06(r12, r10)
            if (r0 == 0) goto L_0x037b
            r0 = 33
            X.AnonymousClass7TF.A1M(r9, r0)
        L_0x037b:
            r1 = 24
            r17 = 29
            if (r7 == 0) goto L_0x0409
            boolean r0 = r13.A08(r12, r10)
            if (r0 == 0) goto L_0x038a
            X.AnonymousClass7TF.A1M(r9, r1)
        L_0x038a:
            boolean r16 = r13.A09(r12, r10)
            boolean r3 = r13.A0O
            if (r3 == 0) goto L_0x0399
            if (r16 == 0) goto L_0x0399
            r0 = r17
            X.AnonymousClass7TF.A1M(r9, r0)
        L_0x0399:
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x03f9
            if (r3 == 0) goto L_0x03a1
            if (r24 != 0) goto L_0x00f2
        L_0x03a1:
            android.util.SparseArray r0 = r13.A0D
            r15 = 2
            java.lang.Object r2 = r0.get(r15)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x03b0
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x03bb
        L_0x03b0:
            android.util.SparseArray r0 = r13.A04
            java.lang.Object r2 = r0.get(r15)
            X.0qQ.A0C(r2, r6)
            java.lang.String r2 = (java.lang.String) r2
        L_0x03bb:
            X.AnonymousClass7TF.A1M(r9, r15)
            X.QfJ r1 = new X.QfJ
            r1.<init>(r15)
            int r0 = r13.A04
            r1.A01 = r0
            boolean r0 = r14.A05
            r0 = r0 ^ 1
            r1.A04 = r0
            r1.A0B = r2
            A04(r1, r14)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.0qQ.A0B(r0, r8)
            r1.A08 = r0
            com.facebookpay.form.cell.text.formatter.NameFormatter r0 = new com.facebookpay.form.cell.text.formatter.NameFormatter
            r0.<init>()
            r1.A04 = r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r15)
            r1.A02 = r0
            java.lang.String r0 = "personName"
            r1.A09 = r0
            boolean r0 = r13.A0L
            r1.A0C = r0
            if (r5 == 0) goto L_0x0404
            r0 = 2131954834(0x7f130c92, float:1.9546178E38)
            r1.A03 = r0
        L_0x03f6:
            X.C8029QfJ.A00(r1, r10)
        L_0x03f9:
            if (r3 != 0) goto L_0x00f2
            if (r16 == 0) goto L_0x00f2
        L_0x03fd:
            r0 = r17
            X.AnonymousClass7TF.A1M(r9, r0)
            goto L_0x00f2
        L_0x0404:
            java.lang.String r0 = r14.A03
            r1.A0A = r0
            goto L_0x03f6
        L_0x0409:
            X.AnonymousClass7TF.A1M(r9, r1)
            goto L_0x03fd
        L_0x040d:
            java.lang.String r0 = "country"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            r2 = 10
            X.AnonymousClass7TF.A1M(r9, r2)
            if (r7 == 0) goto L_0x00f2
            com.google.common.collect.ImmutableList r3 = X.DbU.A0K(r25)
            X.QfG r1 = new X.QfG
            r0 = r23
            r1.<init>(r0, r3)
            int r0 = r13.A03
            r1.A01 = r0
            java.lang.String r0 = r14.A03
            r1.A01 = r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r2)
            r1.A02 = r0
            boolean r0 = r13.A0L
            r1.A02 = r0
            com.facebookpay.form.cell.selector.CountrySelectorCellParams r0 = new com.facebookpay.form.cell.selector.CountrySelectorCellParams
            r0.<init>(r1)
            goto L_0x0480
        L_0x0441:
            java.lang.String r0 = "subdistrict"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x00f2
            if (r24 != 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00f2
            r1 = 31
            if (r4 == 0) goto L_0x0485
            r0 = r22
        L_0x0458:
            X.AnonymousClass7TF.A1M(r9, r1)
            X.QfJ r2 = new X.QfJ
            r2.<init>(r1)
            int r1 = r13.A09
            r2.A01 = r1
            java.lang.String r1 = r14.A03
            r2.A0A = r1
            boolean r1 = r14.A05
            r1 = r1 ^ 1
            r2.A04 = r1
            r2.A0B = r0
            A04(r2, r14)
            r2.A0E = r4
            r0 = 0
        L_0x0476:
            r2.A09 = r0
            boolean r0 = r13.A0L
            r2.A0C = r0
        L_0x047c:
            com.facebookpay.form.cell.text.TextCellParams r0 = r2.A01()
        L_0x0480:
            r10.add(r0)
            goto L_0x00f2
        L_0x0485:
            android.util.SparseArray r0 = r13.A0D
            java.lang.Object r0 = A01(r0, r13, r1)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0458
        L_0x0491:
            int r1 = r12.size()
            r0 = 1
            int r1 = r1 - r0
        L_0x0497:
            r0 = -1
            if (r0 >= r1) goto L_0x05fc
            int r0 = r12.keyAt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L_0x04b4
            android.util.SparseArray r0 = r13.A0D
            X.Pxi.A17(r12, r0, r1)
            int r0 = r12.keyAt(r1)
            r12.remove(r0)
        L_0x04b4:
            int r1 = r1 + -1
            goto L_0x0497
        L_0x04b7:
            r13.A07(r12, r10)
            r13.A06(r12, r10)
            if (r7 == 0) goto L_0x05fc
            r13.A08(r12, r10)
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x051b
            r7 = 2
            X.QfJ r4 = new X.QfJ
            r4.<init>(r7)
            int r0 = r13.A04
            r4.A01 = r0
            boolean r1 = r13.A0N
            r0 = 2131954824(0x7f130c88, float:1.9546158E38)
            if (r1 == 0) goto L_0x04da
            r0 = 2131954834(0x7f130c92, float:1.9546178E38)
        L_0x04da:
            r4.A03 = r0
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            X.0qQ.A0B(r9, r8)
            r4.A08 = r9
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r5 = 2131962805(0x7f132bb5, float:1.9562346E38)
            r3 = 2131954871(0x7f130cb7, float:1.9546253E38)
            com.facebookpay.form.cell.text.TextValidatorParams r2 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0 = r22
            r2.<init>(r1, r0, r5, r3)
            java.lang.String r1 = "^.*[\\S]+[ ]+[\\S]+.*$"
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r9, r1, r5, r3)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r2, r0)
            X.0qQ.A07(r1)
            com.google.common.collect.ImmutableList$Builder r0 = r4.A0G
            r0.addAll(r1)
            com.facebookpay.form.cell.text.formatter.NameFormatter r0 = new com.facebookpay.form.cell.text.formatter.NameFormatter
            r0.<init>()
            r4.A04 = r0
            A02(r12, r13, r4, r7)
            java.lang.String r0 = "personName"
            r4.A09 = r0
            boolean r0 = r13.A0L
            r4.A0C = r0
            X.C8029QfJ.A00(r4, r10)
        L_0x051b:
            r13.A09(r12, r10)
            if (r24 != 0) goto L_0x05fc
            r2 = 5
            X.QfJ r1 = new X.QfJ
            r1.<init>(r2)
            int r0 = r13.A07
            r1.A01 = r0
            boolean r3 = r13.A0N
            r0 = 2131954827(0x7f130c8b, float:1.9546164E38)
            if (r3 == 0) goto L_0x0534
            r0 = 2131954831(0x7f130c8f, float:1.9546172E38)
        L_0x0534:
            r1.A03 = r0
            A02(r12, r13, r1, r2)
            java.lang.String r0 = "streetAddress"
            r1.A09 = r0
            boolean r4 = r13.A0L
            r1.A0C = r4
            X.C8029QfJ.A00(r1, r10)
            r2 = 6
            X.QfJ r1 = new X.QfJ
            r1.<init>(r2)
            int r0 = r13.A08
            r1.A01 = r0
            r0 = 2131954828(0x7f130c8c, float:1.9546166E38)
            if (r3 == 0) goto L_0x0557
            r0 = 2131954832(0x7f130c90, float:1.9546174E38)
        L_0x0557:
            r1.A03 = r0
            r1.A04 = r8
            A02(r12, r13, r1, r2)
            java.lang.String r0 = "extendedAddress"
            r1.A09 = r0
            r1.A0C = r4
            X.C8029QfJ.A00(r1, r10)
            r2 = 7
            X.QfJ r1 = new X.QfJ
            r1.<init>(r2)
            int r0 = r13.A02
            r1.A01 = r0
            r0 = 2131954820(0x7f130c84, float:1.954615E38)
            r1.A03 = r0
            A02(r12, r13, r1, r2)
            java.lang.String r0 = "addressLocality"
            r1.A09 = r0
            r1.A0C = r4
            X.C8029QfJ.A00(r1, r10)
            r2 = 8
            X.QfJ r1 = new X.QfJ
            r1.<init>(r2)
            int r0 = r13.A06
            r1.A01 = r0
            r0 = 2131954826(0x7f130c8a, float:1.9546162E38)
            r1.A03 = r0
            java.lang.Object r0 = r12.get(r2)
            X.0qQ.A0C(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            r1.A0B = r0
            com.facebookpay.form.cell.text.formatter.UpperCaseFormatter r0 = new com.facebookpay.form.cell.text.formatter.UpperCaseFormatter
            r0.<init>()
            r1.A04 = r0
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.A00 = r3
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r2)
            r1.A02 = r0
            java.lang.String r0 = "addressRegion"
            r1.A09 = r0
            r1.A0C = r4
            X.C8029QfJ.A00(r1, r10)
            r2 = 9
            X.QfJ r1 = new X.QfJ
            r1.<init>(r2)
            int r0 = r13.A0A
            r1.A01 = r0
            r0 = 2131954830(0x7f130c8e, float:1.954617E38)
            r1.A03 = r0
            r1.A00 = r3
            A02(r12, r13, r1, r2)
            java.lang.String r0 = "postalCode"
            r1.A09 = r0
            r1.A0C = r4
            X.C8029QfJ.A00(r1, r10)
            com.google.common.collect.ImmutableList r3 = X.DbU.A0K(r25)
            r2 = 10
            X.QfG r1 = new X.QfG
            r0 = r23
            r1.<init>(r0, r3)
            int r0 = r13.A03
            r1.A01 = r0
            r0 = 2131954821(0x7f130c85, float:1.9546152E38)
            r1.A00 = r0
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = r13.A00(r2)
            r1.A02 = r0
            r1.A02 = r4
            com.facebookpay.form.cell.selector.CountrySelectorCellParams r0 = new com.facebookpay.form.cell.selector.CountrySelectorCellParams
            r0.<init>(r1)
            r10.add(r0)
        L_0x05fc:
            com.google.common.collect.ImmutableList r0 = X.DbZ.A0K(r10)
            return r0
        L_0x0601:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0606:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8044Qfo.A0M():com.google.common.collect.ImmutableList");
    }

    public final void A0O(SRc sRc, Object obj, Object obj2) {
        LoggingContext loggingContext;
        Boolean bool;
        if (((sRc instanceof C298455tS) || (sRc instanceof C8037Qfh) || (sRc instanceof C8036Qfg) || (sRc instanceof C8040Qfk)) && !0qQ.A0K(obj, obj2) && obj2 != null) {
            if ((sRc instanceof C8037Qfh) && (loggingContext = this.A0B) != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(C51965G9l.A0g().A00, "user_click_shippingasbilling_atomic"), 405), loggingContext, new C58771IxI(loggingContext, (Object) null, "checkbox", 3, bool.booleanValue()));
            }
            A0N();
        }
    }

    public static Object A01(SparseArray sparseArray, SRc sRc, int i) {
        Object obj = sparseArray.get(i);
        if (obj == null) {
            return sRc.A04.get(i);
        }
        return obj;
    }

    public static void A02(SparseArray sparseArray, C8044Qfo qfo, C8029QfJ qfJ, int i) {
        Object obj = sparseArray.get(i);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        qfJ.A0B = (String) obj;
        qfJ.A02 = qfo.A00(i);
    }

    public static final void A03(C7752QVp qVp, C8044Qfo qfo) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        qfo.A05(A1C, 5, qVp.A07("address_line_1"));
        qfo.A05(A1C, 6, qVp.A08("address_line_2"));
        qfo.A05(A1C, 7, qVp.A09(ServerW3CShippingAddressConstants.CITY));
        qfo.A05(A1C, 9, qVp.A0A("postal_code"));
        String A0C2 = qVp.A0C("state_code");
        if (A0C2 == null) {
            A0C2 = qVp.A0B(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        }
        qfo.A05(A1C, 8, A0C2);
        C11231SGq sGq = qfo.A00;
        if (sGq != null) {
            C12411Sto A0g = C51965G9l.A0g();
            LoggingContext loggingContext = sGq.A00;
            LinkedHashMap A082 = SUU.A08(sGq.A01);
            0qQ.A0B(loggingContext, 0);
            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_add_ecpaddresstypeahead_success"), 17), loggingContext, new C74189PqV((Object) A1C, (Object) loggingContext, (Object) A082, "address_typeahead", 3));
        }
    }

    private final void A05(List list, int i, String str) {
        Map map;
        SRc A0D2 = A0D(i);
        if (A0D2 instanceof C8041Qfl) {
            C8041Qfl qfl = (C8041Qfl) A0D2;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            qfl.A0F.A0B(new C10578RuY(str2, false, true));
            if (str != null && str.length() != 0 && (map = this.A0H) != null) {
                Integer valueOf = Integer.valueOf(i);
                if (map.get(valueOf) != null) {
                    Object obj = map.get(valueOf);
                    if (obj != null) {
                        list.add(((FormCellLoggingEvents) obj).A00.A03);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }

    public final void A0E() {
        super.A0E();
        AddressTypeaheadController addressTypeaheadController = this.A00;
        if (addressTypeaheadController != null) {
            19E.A05((CancellationException) null, addressTypeaheadController.A0A);
        }
    }

    public final void A0N() {
        C8041Qfl qfl;
        super.A0N();
        SRc A0D2 = A0D(5);
        if ((A0D2 instanceof C8041Qfl) && (qfl = (C8041Qfl) A0D2) != null) {
            this.A01 = qfl;
            if (this.A00 != null) {
                qfl.A05.A09(C11649Sdr.A00(this, 55));
            }
        }
    }

    public final Country A0P() {
        Object A0A2 = SRc.A0A(this);
        if (A0A2 != null) {
            SparseArray sparseArray = (SparseArray) A0A2;
            if (sparseArray.get(10) == null) {
                return this.A0E.A00;
            }
            Object obj = sparseArray.get(10);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.common.locale.Country");
            return (Country) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8044Qfo(Country country, AddressFormFieldsConfig addressFormFieldsConfig, LoggingContext loggingContext, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, Map map, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(i, z, z2);
        LoggingContext loggingContext2;
        Country country2 = country;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        int i16 = i7;
        String str14 = str5;
        int i17 = i8;
        String str15 = str6;
        int i18 = i9;
        String str16 = str7;
        int i19 = i10;
        String str17 = str8;
        int i20 = i11;
        AddressFormFieldsConfig addressFormFieldsConfig2 = addressFormFieldsConfig;
        0qQ.A0B(addressFormFieldsConfig2, 13);
        HashSet A1F = AnonymousClass7TE.A1F();
        this.A0J = A1F;
        HashSet A1F2 = AnonymousClass7TE.A1F();
        this.A0I = A1F2;
        this.A0P = z3;
        this.A0S = z4;
        this.A0O = z5;
        this.A0N = z7;
        this.A0F = str9;
        this.A0Q = z8;
        this.A0R = z9;
        this.A04 = i3 == 0 ? R.id.full_name_field : i3;
        this.A07 = i3 == 0 ? R.id.street1_field : i13;
        this.A08 = i3 == 0 ? R.id.street2_field : i14;
        this.A05 = i3 == 0 ? R.id.neighborhood_field : i15;
        this.A09 = i3 == 0 ? R.id.subdistrict_field : i16;
        this.A02 = i3 == 0 ? R.id.city_field : i17;
        this.A06 = i3 == 0 ? R.id.state_field : i18;
        this.A0A = i3 == 0 ? R.id.zip_code_field : i19;
        this.A03 = i3 == 0 ? R.id.country_field : i20;
        this.A0H = map;
        this.A0B = loggingContext;
        List list2 = list;
        this.A0G = list2;
        this.A0L = z10;
        this.A0C = i12;
        this.A0K = z11;
        this.A0M = z12;
        if (z4) {
            this.A04.put(29, Boolean.valueOf(z6));
        }
        if (z8 && list != null && !list2.isEmpty()) {
            SparseArray sparseArray = this.A04;
            sparseArray.put(34, false);
            sparseArray.put(33, list2.get(0));
        }
        SparseArray sparseArray2 = this.A04;
        sparseArray2.put(2, str == null ? "" : str13);
        sparseArray2.put(5, str2 == null ? "" : str12);
        sparseArray2.put(6, str3 == null ? "" : str11);
        sparseArray2.put(30, str4 == null ? "" : str10);
        sparseArray2.put(31, str5 == null ? "" : str14);
        sparseArray2.put(7, str6 == null ? "" : str15);
        sparseArray2.put(9, str7 == null ? "" : str16);
        sparseArray2.put(8, str8 == null ? "" : str17);
        sparseArray2.put(24, Integer.valueOf(i2));
        sparseArray2.put(10, country == null ? Country.A00((Country) null, addressFormFieldsConfig2.A00.A00.getCountry()) : country2);
        ImmutableList immutableList3 = immutableList;
        if (immutableList != null && !immutableList3.isEmpty()) {
            A1F.addAll(immutableList3);
        }
        ImmutableList immutableList4 = immutableList2;
        if (immutableList2 != null && !immutableList4.isEmpty()) {
            A1F2.addAll(immutableList4);
        }
        this.A05.A0B(sparseArray2.clone());
        this.A0E = addressFormFieldsConfig2;
        if (182.A06(0Tu.A05, C11431STx.A00(), 36313428796966861L) && (loggingContext2 = this.A0B) != null) {
            AddressTypeaheadController addressTypeaheadController = new AddressTypeaheadController(loggingContext2, new C13351TVy(this, 7), TY1.A00(this, 17));
            this.A00 = addressTypeaheadController;
            addressTypeaheadController.A04.A09(new C64319LZu(10, TY1.A00(this, 18)));
            AddressTypeaheadController addressTypeaheadController2 = this.A00;
            if (addressTypeaheadController2 != null) {
                addressTypeaheadController2.A03.A09(new C64319LZu(10, TY1.A00(this, 19)));
            }
        }
        A0N();
    }
}
