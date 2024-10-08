package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.model.ActionButtonValue$Information;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.BloksActionNavigationRowDestinationValue;
import com.instagram.settings2.core.model.BloksNavigationRowDestinationValue;
import com.instagram.settings2.core.model.DerivedStringValue;
import com.instagram.settings2.core.model.DerivedStringWrapper;
import com.instagram.settings2.core.model.DictionaryValue;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.FbtLinkTokenValue;
import com.instagram.settings2.core.model.FbtLiteralValue;
import com.instagram.settings2.core.model.FbtTextTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.FrictionValue$ConfirmationValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.ModalActionValue$Navigate;
import com.instagram.settings2.core.model.ModalBodyItemValue;
import com.instagram.settings2.core.model.ModalButtonValue;
import com.instagram.settings2.core.model.ModalValue;
import com.instagram.settings2.core.model.NotValue;
import com.instagram.settings2.core.model.OpenUrlDestinationValue;
import com.instagram.settings2.core.model.OrValue;
import com.instagram.settings2.core.model.ServerValue;
import com.instagram.settings2.core.model.SettingBannerValue;
import com.instagram.settings2.core.session.AbstractValueResolverImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LSs  reason: case insensitive filesystem */
public abstract class C64185LSs {
    public static List A02(C64185LSs lSs, Object obj) {
        List singletonList = Collections.singletonList(new ModalBodyItemValue(lSs, new KY2(obj), (C64185LSs) null));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public static Object A00(Object obj, AnonymousClass4D7 r2) {
        return ((C64185LSs) obj).A07((UserSession) null, (AbstractValueResolverImpl) null, r2);
    }

    public C66419MQz A05() {
        if (!(this instanceof KY2)) {
            if (!(this instanceof DerivedStringValue)) {
                if (!(this instanceof EqualsValue) && !(this instanceof IfValue) && !(this instanceof AndValue) && !(this instanceof C21226XPu) && !(this instanceof KY6) && !(this instanceof OrValue)) {
                    if (!(this instanceof ServerValue)) {
                        if (!(this instanceof ModalBodyItemValue) && !(this instanceof NotValue) && !(this instanceof FbtLinkTokenValue) && !(this instanceof FbtLiteralValue)) {
                            if (this instanceof KYA) {
                                return new C61236JzU(JTP.A0y(((KYA) this).A00.A02));
                            }
                            if (!(this instanceof KYR)) {
                                if (!(this instanceof DerivedStringWrapper)) {
                                    if (!(this instanceof FbtWithTokensValue) && !(this instanceof ModalButtonValue) && !(this instanceof DictionaryValue) && !(this instanceof BloksNavigationRowDestinationValue) && !(this instanceof FbtTextTokenValue) && !(this instanceof ModalValue) && !(this instanceof BloksActionNavigationRowDestinationValue) && !(this instanceof FrictionValue$ConfirmationValue) && !(this instanceof SettingBannerValue) && !(this instanceof KYW)) {
                                        if (this instanceof KY8) {
                                            return C65626Lx3.A00;
                                        }
                                        if (!(this instanceof OpenUrlDestinationValue) && !(this instanceof KYV) && !(this instanceof KYU)) {
                                            boolean z = this instanceof ModalActionValue$Navigate;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return C65624Lx1.A00;
        }
        return C50957Flk.A00;
    }

    public List A08() {
        List list;
        C64185LSs lSs;
        C64185LSs[] lSsArr;
        if (this instanceof KY2) {
            Object obj = ((KY2) this).A00;
            if (obj instanceof List) {
                ArrayList<JVH> A1C = AnonymousClass7TE.A1C();
                for (Object next : (Iterable) obj) {
                    if (JVH.A01(7, next)) {
                        A1C.add(next);
                    }
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (JVH jvh : A1C) {
                    018.A16(00k.A0S(C63416Kwc.A00((C64185LSs) jvh.A01), 00k.A0S(C63416Kwc.A00((C64185LSs) jvh.A02), C63416Kwc.A00((C64185LSs) jvh.A04))), A1C2);
                }
                return A1C2;
            }
            if (JVH.A01(7, obj)) {
                JVH jvh2 = (JVH) obj;
                00k.A0S(C63416Kwc.A00((C64185LSs) jvh2.A01), 00k.A0S(C63416Kwc.A00((C64185LSs) jvh2.A02), C63416Kwc.A00((C64185LSs) jvh2.A04)));
            }
            return 0sn.A00;
        }
        if (!(this instanceof DerivedStringValue)) {
            if (this instanceof EqualsValue) {
                EqualsValue equalsValue = (EqualsValue) this;
                List A1P = 0sr.A1P(new C64185LSs[]{equalsValue.A00, equalsValue.A01});
                list = AnonymousClass7TE.A1C();
                Iterator it = A1P.iterator();
                while (it.hasNext()) {
                    A04(list, it);
                }
            } else if (!(this instanceof C21226XPu) && !(this instanceof KY6)) {
                if (this instanceof IfValue) {
                    IfValue ifValue = (IfValue) this;
                    List A1P2 = 0sr.A1P(new C64185LSs[]{ifValue.A00, ifValue.A02, ifValue.A01});
                    list = AnonymousClass7TE.A1C();
                    Iterator it2 = A1P2.iterator();
                    while (it2.hasNext()) {
                        A04(list, it2);
                    }
                } else if (this instanceof AndValue) {
                    List list2 = ((AndValue) this).A00;
                    list = AnonymousClass7TE.A1C();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        A04(list, it3);
                    }
                } else if (this instanceof OrValue) {
                    List list3 = ((OrValue) this).A00;
                    list = AnonymousClass7TE.A1C();
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        A04(list, it4);
                    }
                } else if (!(this instanceof ServerValue)) {
                    if (this instanceof ModalBodyItemValue) {
                        ModalBodyItemValue modalBodyItemValue = (ModalBodyItemValue) this;
                        C64185LSs lSs2 = modalBodyItemValue.A00;
                        C64185LSs lSs3 = modalBodyItemValue.A01;
                        C64185LSs lSs4 = modalBodyItemValue.A02;
                        if (lSs2 != null) {
                            lSsArr = new C64185LSs[]{lSs3, lSs2, lSs4};
                        } else {
                            lSsArr = new C64185LSs[]{lSs3, lSs4};
                        }
                        List A1P3 = 0sr.A1P(lSsArr);
                        list = AnonymousClass7TE.A1C();
                        Iterator it5 = A1P3.iterator();
                        while (it5.hasNext()) {
                            A04(list, it5);
                        }
                    } else if (this instanceof NotValue) {
                        list = C63416Kwc.A00(((NotValue) this).A00);
                    } else if (this instanceof FbtLinkTokenValue) {
                        FbtLinkTokenValue fbtLinkTokenValue = (FbtLinkTokenValue) this;
                        List A1P4 = 0sr.A1P(new C64185LSs[]{fbtLinkTokenValue.A00, fbtLinkTokenValue.A01});
                        list = AnonymousClass7TE.A1C();
                        Iterator it6 = A1P4.iterator();
                        while (it6.hasNext()) {
                            A04(list, it6);
                        }
                    } else {
                        if (this instanceof FbtLiteralValue) {
                            lSs = ((FbtLiteralValue) this).A00;
                        } else if (!(this instanceof KYA) && !(this instanceof KYR)) {
                            if (this instanceof ModalButtonValue) {
                                ModalButtonValue modalButtonValue = (ModalButtonValue) this;
                                List A1P5 = 0sr.A1P(new C64185LSs[]{modalButtonValue.A01, modalButtonValue.A00});
                                list = AnonymousClass7TE.A1C();
                                Iterator it7 = A1P5.iterator();
                                while (it7.hasNext()) {
                                    A04(list, it7);
                                }
                            } else if (this instanceof DictionaryValue) {
                                DictionaryValue dictionaryValue = (DictionaryValue) this;
                                ArrayList A0S = 00k.A0S(dictionaryValue.A01, dictionaryValue.A00);
                                list = AnonymousClass7TE.A1C();
                                Iterator it8 = A0S.iterator();
                                while (it8.hasNext()) {
                                    A04(list, it8);
                                }
                            } else if (this instanceof DerivedStringWrapper) {
                                return AnonymousClass7TE.A1I(((DerivedStringWrapper) this).A00);
                            } else {
                                if (this instanceof FbtWithTokensValue) {
                                    List list4 = ((FbtWithTokensValue) this).A01;
                                    list = AnonymousClass7TE.A1C();
                                    Iterator it9 = list4.iterator();
                                    while (it9.hasNext()) {
                                        A04(list, it9);
                                    }
                                } else if (this instanceof FbtTextTokenValue) {
                                    List singletonList = Collections.singletonList(((FbtTextTokenValue) this).A00);
                                    list = DbV.A15(singletonList);
                                    Iterator it10 = singletonList.iterator();
                                    while (it10.hasNext()) {
                                        A04(list, it10);
                                    }
                                } else if (this instanceof ModalValue) {
                                    ModalValue modalValue = (ModalValue) this;
                                    List A0X = 00k.A0X(00k.A0S(modalValue.A04, 0sr.A1P(new C64185LSs[]{modalValue.A03, null, modalValue.A01, modalValue.A02, modalValue.A00})));
                                    list = AnonymousClass7TE.A1C();
                                    Iterator it11 = A0X.iterator();
                                    while (it11.hasNext()) {
                                        A04(list, it11);
                                    }
                                } else if (this instanceof BloksNavigationRowDestinationValue) {
                                    BloksNavigationRowDestinationValue bloksNavigationRowDestinationValue = (BloksNavigationRowDestinationValue) this;
                                    List A1P6 = 0sr.A1P(new C64185LSs[]{bloksNavigationRowDestinationValue.A00, bloksNavigationRowDestinationValue.A02, bloksNavigationRowDestinationValue.A01});
                                    list = AnonymousClass7TE.A1C();
                                    Iterator it12 = A1P6.iterator();
                                    while (it12.hasNext()) {
                                        A04(list, it12);
                                    }
                                } else if (this instanceof BloksActionNavigationRowDestinationValue) {
                                    lSs = ((BloksActionNavigationRowDestinationValue) this).A00;
                                } else if (this instanceof FrictionValue$ConfirmationValue) {
                                    List singletonList2 = Collections.singletonList(((FrictionValue$ConfirmationValue) this).A00);
                                    list = DbV.A15(singletonList2);
                                    Iterator it13 = singletonList2.iterator();
                                    while (it13.hasNext()) {
                                        A04(list, it13);
                                    }
                                } else if (this instanceof SettingBannerValue) {
                                    SettingBannerValue settingBannerValue = (SettingBannerValue) this;
                                    List A1P7 = 0sr.A1P(new C64185LSs[]{settingBannerValue.A03, settingBannerValue.A02, settingBannerValue.A01, settingBannerValue.A00});
                                    list = AnonymousClass7TE.A1C();
                                    Iterator it14 = A1P7.iterator();
                                    while (it14.hasNext()) {
                                        A04(list, it14);
                                    }
                                } else if (!(this instanceof KYW) && !(this instanceof KY8)) {
                                    if (this instanceof OpenUrlDestinationValue) {
                                        List singletonList3 = Collections.singletonList(((OpenUrlDestinationValue) this).A00);
                                        list = DbV.A15(singletonList3);
                                        Iterator it15 = singletonList3.iterator();
                                        while (it15.hasNext()) {
                                            A04(list, it15);
                                        }
                                    } else if (!(this instanceof KYV) && !(this instanceof KYU)) {
                                        if (this instanceof ModalActionValue$Navigate) {
                                            List singletonList4 = Collections.singletonList(((ModalActionValue$Navigate) this).A00);
                                            list = DbV.A15(singletonList4);
                                            Iterator it16 = singletonList4.iterator();
                                            while (it16.hasNext()) {
                                                A04(list, it16);
                                            }
                                        } else if (!(this instanceof KYT)) {
                                            if (this instanceof ActionButtonValue$Information) {
                                                List singletonList5 = Collections.singletonList(((ActionButtonValue$Information) this).A00);
                                                list = DbV.A15(singletonList5);
                                                Iterator it17 = singletonList5.iterator();
                                                while (it17.hasNext()) {
                                                    A04(list, it17);
                                                }
                                            } else {
                                                List singletonList6 = Collections.singletonList(((KYG) this).A00);
                                                list = DbV.A15(singletonList6);
                                                Iterator it18 = singletonList6.iterator();
                                                while (it18.hasNext()) {
                                                    A04(list, it18);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return C63416Kwc.A00(lSs);
                    }
                }
            }
            return 00k.A0W(list);
        }
        return 0sn.A00;
    }

    public static String A01(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(" }");
        return sb.toString();
    }

    public static void A03(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(": { ");
    }

    public static void A04(Collection collection, Iterator it) {
        018.A16(C63416Kwc.A00((C64185LSs) it.next()), collection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r2.isEmpty() != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r2.isEmpty() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r4 = X.AnonymousClass7TE.A1C();
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r2.hasNext() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if ((r1 instanceof X.C61236JzU) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r4 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r1.hasNext() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if ((r1.next() instanceof X.C65624Lx1) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r3 = X.C65624Lx1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (r4 == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r1.hasNext() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        if ((r1.next() instanceof X.C65625Lx2) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        r3 = X.C65625Lx2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r2 = X.AnonymousClass7TE.A1C();
        r1 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r1.hasNext() == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        X.018.A16(((X.C61236JzU) r1.next()).A00, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r1 = X.00k.A0k(X.00k.A0W(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        if ((!r1.isEmpty()) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return new X.C61236JzU(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C66419MQz A06() {
        /*
            r5 = this;
            X.MQz r3 = r5.A05()
            boolean r0 = r3 instanceof X.C65626Lx3
            if (r0 != 0) goto L_0x00d2
            java.util.List r0 = r5.A08()
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r1.next()
            X.LSs r0 = (X.C64185LSs) r0
            X.MQz r0 = r0.A06()
            r2.add(r0)
            goto L_0x0014
        L_0x0028:
            java.util.ArrayList r2 = X.00k.A0T(r3, r2)
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L_0x005c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005c
        L_0x0036:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0076
        L_0x003c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x008e
        L_0x0042:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C61236JzU
            if (r0 == 0) goto L_0x004a
            r4.add(r1)
            goto L_0x004a
        L_0x005c:
            java.util.Iterator r1 = r2.iterator()
        L_0x0060:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C65626Lx3
            if (r0 == 0) goto L_0x0060
            X.Lx3 r3 = X.C65626Lx3.A00
        L_0x0070:
            X.MQz r3 = (X.C66419MQz) r3
            return r3
        L_0x0073:
            if (r4 == 0) goto L_0x0076
            goto L_0x0036
        L_0x0076:
            java.util.Iterator r1 = r2.iterator()
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C65624Lx1
            if (r0 == 0) goto L_0x007a
            X.Lx1 r3 = X.C65624Lx1.A00
            goto L_0x0070
        L_0x008b:
            if (r4 == 0) goto L_0x008e
            goto L_0x003c
        L_0x008e:
            java.util.Iterator r1 = r2.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C65625Lx2
            if (r0 == 0) goto L_0x0092
            X.Lx2 r3 = X.C65625Lx2.A00
            goto L_0x0070
        L_0x00a3:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r4.iterator()
        L_0x00ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r1.next()
            X.JzU r0 = (X.C61236JzU) r0
            java.util.Set r0 = r0.A00
            X.018.A16(r0, r2)
            goto L_0x00ab
        L_0x00bd:
            java.util.List r0 = X.00k.A0W(r2)
            java.util.Set r1 = X.00k.A0k(r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d2
            X.JzU r3 = new X.JzU
            r3.<init>(r1)
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64185LSs.A06():X.MQz");
    }

    public String toString() {
        Class<?> cls = getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls, 1);
        return 002.A0G(0q1.A01(cls), ':', hashCode());
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDc, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v10, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v13, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v17, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.4D7, X.MDm] */
    /* JADX WARNING: type inference failed for: r7v23, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v26, types: [X.JZl, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v30, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v41, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v38, types: [X.4D7, X.MDP] */
    /* JADX WARNING: type inference failed for: r9v22, types: [X.JUK, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v47, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v55, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v53, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v57, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v67, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v71, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v87, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v102, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v104, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v82, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v26, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v79 */
    /* JADX WARNING: type inference failed for: r7v80 */
    /* JADX WARNING: type inference failed for: r7v81 */
    /* JADX WARNING: type inference failed for: r7v82 */
    /* JADX WARNING: type inference failed for: r6v110 */
    /* JADX WARNING: type inference failed for: r6v111 */
    /* JADX WARNING: type inference failed for: r5v88 */
    /* JADX WARNING: type inference failed for: r5v89 */
    /* JADX WARNING: type inference failed for: r5v90 */
    /* JADX WARNING: type inference failed for: r5v91 */
    /* JADX WARNING: type inference failed for: r8v29 */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r7v83 */
    /* JADX WARNING: type inference failed for: r7v84 */
    /* JADX WARNING: type inference failed for: r5v92 */
    /* JADX WARNING: type inference failed for: r5v93 */
    /* JADX WARNING: type inference failed for: r5v94 */
    /* JADX WARNING: type inference failed for: r5v95 */
    /* JADX WARNING: type inference failed for: r7v85 */
    /* JADX WARNING: type inference failed for: r7v86 */
    /* JADX WARNING: type inference failed for: r5v96 */
    /* JADX WARNING: type inference failed for: r5v97 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r7v87 */
    /* JADX WARNING: type inference failed for: r7v88 */
    /* JADX WARNING: type inference failed for: r5v98 */
    /* JADX WARNING: type inference failed for: r5v99 */
    /* JADX WARNING: type inference failed for: r7v89 */
    /* JADX WARNING: type inference failed for: r7v90 */
    /* JADX WARNING: type inference failed for: r7v91 */
    /* JADX WARNING: type inference failed for: r7v92 */
    /* JADX WARNING: type inference failed for: r5v100 */
    /* JADX WARNING: type inference failed for: r5v101 */
    /* JADX WARNING: type inference failed for: r5v102 */
    /* JADX WARNING: type inference failed for: r5v103 */
    /* JADX WARNING: type inference failed for: r6v112 */
    /* JADX WARNING: type inference failed for: r6v113 */
    /* JADX WARNING: type inference failed for: r2v134 */
    /* JADX WARNING: type inference failed for: r2v135 */
    /* JADX WARNING: type inference failed for: r6v114 */
    /* JADX WARNING: type inference failed for: r6v115 */
    /* JADX WARNING: type inference failed for: r5v104 */
    /* JADX WARNING: type inference failed for: r5v105 */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r8v32 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03cb, code lost:
        if (r0 != null) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03cd, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03cf, code lost:
        r4 = X.C41845B3m.A0d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03d3, code lost:
        if (r4 != r3) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a44, code lost:
        r1 = r6.A04;
        r0 = X.AnonymousClass7TG.A0r(r1);
        r1 = r1.iterator();
        r15 = r0;
        r7 = (X.C61083JwL) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a56, code lost:
        if (r1.hasNext() == false) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0a58, code lost:
        r5.A01 = r6;
        r5.A02 = r3;
        r5.A03 = r0;
        r5.A04 = r1;
        r5.A05 = r7;
        r5.A06 = r0;
        r5.A00 = 2;
        r4 = r3.A01((X.C64185LSs) r1.next(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a71, code lost:
        if (r4 != r9) goto L_0x0a8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0a73, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0a8f, code lost:
        r15.add(r4);
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0a94, code lost:
        r15 = (java.util.List) r15;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0a97, code lost:
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0a99, code lost:
        if (r0 == null) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0a9b, code lost:
        r5.A01 = r6;
        r5.A02 = r3;
        r5.A03 = r7;
        r5.A04 = r15;
        r5.A05 = r14;
        r5.A06 = null;
        r5.A00 = 4;
        r4 = r3.A01(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0aad, code lost:
        if (r4 != r9) goto L_0x0ac7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0aaf, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0ac7, code lost:
        r11 = (X.C61083JwL) r4;
        r0 = r6;
        r2 = r3;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0ace, code lost:
        r0 = r6;
        r2 = r3;
        r10 = r7;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0ad2, code lost:
        r4 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0ad4, code lost:
        if (r4 == null) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0ad6, code lost:
        r5.A01 = r6;
        r5.A02 = r3;
        r5.A03 = r7;
        r5.A04 = r15;
        r5.A05 = r14;
        r5.A06 = r11;
        r5.A00 = 5;
        r4 = r3.A01(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0ae9, code lost:
        if (r4 != r9) goto L_0x0b07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0aeb, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b07, code lost:
        r12 = (X.C61083JwL) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b0b, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b0c, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b0e, code lost:
        if (r1 == null) goto L_0x0b40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b10, code lost:
        r5.A01 = r10;
        r5.A02 = r15;
        r5.A03 = r14;
        r5.A04 = r11;
        r5.A05 = r12;
        r5.A06 = null;
        r5.A00 = 6;
        r4 = r2.A01(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b23, code lost:
        if (r4 != r9) goto L_0x0b3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b25, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b3d, code lost:
        r13 = (X.C61083JwL) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0b45, code lost:
        return new X.C61059Jvx(r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[PHI: r7 
      PHI: (r7v75 java.lang.Object) = (r7v77 java.lang.Object), (r7v74 java.lang.Object) binds: [B:27:0x0075, B:30:0x0081] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x06f7  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0781 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x07af  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x080b  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0812  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0845 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x087a  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0899  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x08c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x08e9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0913 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x09b4  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x09c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x09ff  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0a0a  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0a26  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0a39  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0a74  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0ab0  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0aec  */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x0b26  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0b6d  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0b80  */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0bac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x0bdc  */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x0bf3  */
    /* JADX WARNING: Removed duplicated region for block: B:584:0x0c23 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0c46  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0c4d  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0c8f  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x0c9c  */
    /* JADX WARNING: Removed duplicated region for block: B:639:0x0cf0  */
    /* JADX WARNING: Removed duplicated region for block: B:643:0x0cfd  */
    /* JADX WARNING: Removed duplicated region for block: B:658:0x0d3b  */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x0d4e  */
    /* JADX WARNING: Removed duplicated region for block: B:677:0x0d8f  */
    /* JADX WARNING: Removed duplicated region for block: B:681:0x0da4  */
    /* JADX WARNING: Removed duplicated region for block: B:701:0x0deb  */
    /* JADX WARNING: Removed duplicated region for block: B:704:0x0dfe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:713:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:715:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07(com.instagram.common.session.UserSession r20, com.instagram.settings2.core.session.AbstractValueResolverImpl r21, X.AnonymousClass4D7 r22) {
        /*
            r19 = this;
            r3 = r21
            r1 = r19
            boolean r0 = r1 instanceof X.KY2
            if (r0 == 0) goto L_0x000e
            r0 = r1
            X.KY2 r0 = (X.KY2) r0
            java.lang.Object r0 = r0.A00
            return r0
        L_0x000e:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.IfValue
            r4 = r22
            if (r0 == 0) goto L_0x0085
            r2 = r1
            com.instagram.settings2.core.model.IfValue r2 = (com.instagram.settings2.core.model.IfValue) r2
            r6 = 32
            boolean r0 = X.ME9.A03(r6, r4)
            if (r0 == 0) goto L_0x0043
            r8 = r4
            X.ME9 r8 = (X.ME9) r8
            int r5 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x0043
            int r5 = r5 - r1
            r8.A00 = r5
        L_0x002d:
            java.lang.Object r7 = r8.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 3
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r1) goto L_0x0057
            if (r0 == r4) goto L_0x0081
            if (r0 == r5) goto L_0x0081
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0043:
            X.ME9 r8 = X.ME9.A00(r2, r4, r6)
            goto L_0x002d
        L_0x0048:
            X.0eS.A00(r7)
            X.LSs r0 = r2.A00
            X.ME9.A01(r2, r3, r8, r1)
            java.lang.Object r7 = r3.A01(r0, r8)
            if (r7 != r6) goto L_0x0062
            return r6
        L_0x0057:
            java.lang.Object r3 = r8.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r2 = r8.A01
            com.instagram.settings2.core.model.IfValue r2 = (com.instagram.settings2.core.model.IfValue) r2
            X.0eS.A00(r7)
        L_0x0062:
            boolean r0 = X.AnonymousClass7TE.A1a(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0078
            X.LSs r0 = r2.A02
            r8.A01 = r1
            r8.A02 = r1
            r8.A00 = r4
        L_0x0071:
            java.lang.Object r7 = r3.A01(r0, r8)
            if (r7 != r6) goto L_0x0084
            return r6
        L_0x0078:
            X.LSs r0 = r2.A01
            r8.A01 = r1
            r8.A02 = r1
            r8.A00 = r5
            goto L_0x0071
        L_0x0081:
            X.0eS.A00(r7)
        L_0x0084:
            return r7
        L_0x0085:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.AndValue
            if (r0 == 0) goto L_0x00f8
            r7 = r1
            com.instagram.settings2.core.model.AndValue r7 = (com.instagram.settings2.core.model.AndValue) r7
            r6 = 28
            boolean r0 = X.ME9.A03(r6, r4)
            if (r0 == 0) goto L_0x00ee
            r5 = r4
            X.ME9 r5 = (X.ME9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ee
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x00a2:
            java.lang.Object r0 = r5.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x00c4
            if (r1 != r4) goto L_0x00f3
            java.lang.Object r1 = r5.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r5.A01
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            X.0eS.A00(r0)
        L_0x00b8:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x00d8
            r4 = 0
        L_0x00bf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            return r2
        L_0x00c4:
            X.0eS.A00(r0)
            java.util.List r1 = r7.A00
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00bf
        L_0x00d4:
            java.util.Iterator r1 = r1.iterator()
        L_0x00d8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r1.next()
            X.LSs r0 = (X.C64185LSs) r0
            X.ME9.A01(r3, r1, r5, r4)
            java.lang.Object r0 = r3.A01(r0, r5)
            if (r0 != r2) goto L_0x00b8
            return r2
        L_0x00ee:
            X.ME9 r5 = X.ME9.A00(r7, r4, r6)
            goto L_0x00a2
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f8:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.OrValue
            if (r0 == 0) goto L_0x016c
            r7 = r1
            com.instagram.settings2.core.model.OrValue r7 = (com.instagram.settings2.core.model.OrValue) r7
            r5 = 34
            boolean r0 = X.ME9.A03(r5, r4)
            if (r0 == 0) goto L_0x0162
            r6 = r4
            X.ME9 r6 = (X.ME9) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0162
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0115:
            java.lang.Object r0 = r6.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r6.A00
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0138
            if (r1 != r4) goto L_0x0167
            java.lang.Object r1 = r6.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r6.A01
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            X.0eS.A00(r0)
        L_0x012c:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x014c
            r5 = 1
        L_0x0133:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            return r2
        L_0x0138:
            X.0eS.A00(r0)
            java.util.List r1 = r7.A00
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0148
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0148
            goto L_0x0133
        L_0x0148:
            java.util.Iterator r1 = r1.iterator()
        L_0x014c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r1.next()
            X.LSs r0 = (X.C64185LSs) r0
            X.ME9.A01(r3, r1, r6, r4)
            java.lang.Object r0 = r3.A01(r0, r6)
            if (r0 != r2) goto L_0x012c
            return r2
        L_0x0162:
            X.ME9 r6 = X.ME9.A00(r7, r4, r5)
            goto L_0x0115
        L_0x0167:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x016c:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.ServerValue
            r5 = r20
            if (r0 == 0) goto L_0x034d
            com.instagram.settings2.core.model.ServerValue r1 = (com.instagram.settings2.core.model.ServerValue) r1
            r3 = 1
            boolean r0 = X.C66139MDr.A01(r3, r4)
            if (r0 == 0) goto L_0x02f2
            r2 = r4
            X.MDr r2 = (X.C66139MDr) r2
            int r7 = r2.A00
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7 & r6
            if (r0 == 0) goto L_0x02f2
            int r7 = r7 - r6
            r2.A00 = r7
        L_0x0189:
            java.lang.Object r6 = r2.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0286
            if (r0 != r3) goto L_0x033d
            java.lang.Object r1 = r2.A01
            com.instagram.settings2.core.model.ServerValue r1 = (com.instagram.settings2.core.model.ServerValue) r1
            X.0eS.A00(r6)
        L_0x019a:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0336
            X.3lr r5 = X.C41846B3n.A0R(r6)
            if (r5 == 0) goto L_0x032f
            java.lang.Class<X.C4g> r4 = X.C43658C4g.class
            r0 = 4224(0x1080, float:5.919E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 2115458663(0x7e175667, float:5.0290513E37)
            X.3lr r7 = r5.A05(r4, r2, r0)
            if (r7 == 0) goto L_0x032f
            X.0ry r5 = r1.A01
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r2 = X.JTQ.A1V(r6, r5)
            r0 = 1050(0x41a, float:1.471E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            if (r2 == 0) goto L_0x026d
            java.lang.Class<X.C4f> r4 = X.C43657C4f.class
            r0 = 1855(0x73f, float:2.6E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = -1167502002(0xffffffffba69554e, float:-8.900956E-4)
            com.google.common.collect.ImmutableList r2 = r7.A06(r4, r2, r0)
        L_0x01d6:
            X.0qQ.A07(r2)
            int r0 = r2.size()
            if (r0 != r3) goto L_0x031f
            boolean r0 = X.JTQ.A1V(r6, r5)
            r10 = 0
            if (r0 == 0) goto L_0x0231
            java.lang.Class<X.C4f> r8 = X.C43657C4f.class
            r0 = 1855(0x73f, float:2.6E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r4 = -1167502002(0xffffffffba69554e, float:-8.900956E-4)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r10, r6, r8, r4)
            java.lang.Object r2 = r0.get(r10)
            X.3lr r2 = (X.C250663lr) r2
            r0 = 774(0x306, float:1.085E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r2.getRequiredStringField(r10, r0)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r10, r6, r8, r4)
            java.lang.Object r2 = r0.get(r10)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "value"
            java.lang.String r4 = r2.getRequiredStringField(r3, r0)
        L_0x0215:
            X.0qQ.A07(r9)
            java.lang.String r2 = r1.A00
            boolean r0 = r9.equals(r2)
            if (r0 == 0) goto L_0x0309
            r0 = r5
            X.0Yh r0 = (X.0Yh) r0
            java.lang.Class r0 = r0.A00
            boolean r0 = X.0q1.A02(r0, r4)
            if (r0 == 0) goto L_0x02f9
            java.lang.String r0 = "null cannot be cast to non-null type T of com.instagram.settings2.core.model.ServerValue"
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x0231:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1V(r0, r5)
            if (r0 == 0) goto L_0x031a
            java.lang.Class<X.C4e> r8 = X.C43656C4e.class
            r0 = 1137(0x471, float:1.593E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r4 = -692867881(0xffffffffd6b3acd7, float:-9.8777461E13)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r3, r6, r8, r4)
            java.lang.Object r2 = r0.get(r10)
            X.3lr r2 = (X.C250663lr) r2
            r0 = 774(0x306, float:1.085E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r2.getRequiredStringField(r10, r0)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r3, r6, r8, r4)
            java.lang.Object r2 = r0.get(r10)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "value"
            boolean r0 = r2.getRequiredBooleanField(r3, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            goto L_0x0215
        L_0x026d:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1V(r0, r5)
            if (r0 == 0) goto L_0x032a
            java.lang.Class<X.C4e> r4 = X.C43656C4e.class
            r0 = 1137(0x471, float:1.593E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = -692867881(0xffffffffd6b3acd7, float:-9.8777461E13)
            com.google.common.collect.ImmutableList r2 = r7.getRequiredCompactedTreeListField(r3, r2, r4, r0)
            goto L_0x01d6
        L_0x0286:
            X.0eS.A00(r6)
            r2.A01 = r1
            r2.A00 = r3
            X.1vn r5 = X.1vm.A01(r5)
            X.0ry r6 = r1.A01
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = X.JTQ.A1V(r0, r6)
            if (r0 == 0) goto L_0x02dc
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.lang.String r0 = r1.A00
            java.util.List r6 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "string_server_values_ids"
        L_0x02a8:
            r8.A05(r0, r6)
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r0 = "data"
            X.1vR r8 = X.JTP.A0L(r8, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.C4h> r12 = X.C43659C4h.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "SettingsAPIGetScreenDependencies"
            r13 = 0
            java.lang.String r17 = "xdt__settings__get_screen_dependencies"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r6 = r5.A04(r7, r2)
            if (r6 != r4) goto L_0x019a
            return r4
        L_0x02dc:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1V(r0, r6)
            if (r0 == 0) goto L_0x0342
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.lang.String r0 = r1.A00
            java.util.List r6 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "boolean_server_values_ids"
            goto L_0x02a8
        L_0x02f2:
            X.MDr r2 = new X.MDr
            r2.<init>(r1, r4, r3)
            goto L_0x0189
        L_0x02f9:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r4)
            java.lang.String r0 = ", is not instance of "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x0309:
            java.lang.String r1 = "Expected server value "
            r0 = 844(0x34c, float:1.183E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0u(r1, r2, r0, r9)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x031a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x031f:
            java.lang.String r1 = "Expected 1 result, got "
            int r0 = r2.size()
            java.lang.IllegalStateException r0 = X.DbW.A0b(r1, r0)
            throw r0
        L_0x032a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x032f:
            java.lang.String r0 = "No result"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0336:
            java.lang.String r0 = "Failed to fetch server value"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x033d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0342:
            r0 = 1050(0x41a, float:1.471E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x034d:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.DerivedStringValue
            if (r0 == 0) goto L_0x0403
            r2 = r1
            com.instagram.settings2.core.model.DerivedStringValue r2 = (com.instagram.settings2.core.model.DerivedStringValue) r2
            r7 = 48
            boolean r0 = X.C66138MDq.A02(r7, r4)
            if (r0 == 0) goto L_0x03d6
            r6 = r4
            X.MDq r6 = (X.C66138MDq) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x03d6
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x036a:
            java.lang.Object r4 = r6.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x0387
            if (r0 != r1) goto L_0x03fe
            java.lang.Object r2 = r6.A01
            com.instagram.settings2.core.model.DerivedStringValue r2 = (com.instagram.settings2.core.model.DerivedStringValue) r2
            X.0eS.A00(r4)
        L_0x037c:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x03dc
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r3 = r4.A00
            return r3
        L_0x0387:
            X.0eS.A00(r4)
            X.XQt r0 = r2.A00
            r6.A01 = r2
            r6.A00 = r1
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x03bf;
                case 1: goto L_0x03a1;
                case 2: goto L_0x03ab;
                case 3: goto L_0x03ba;
                case 4: goto L_0x03a6;
                case 5: goto L_0x039c;
                default: goto L_0x0397;
            }
        L_0x0397:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x039c:
            java.lang.Object r4 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A03(r5, r6)
            goto L_0x03d3
        L_0x03a1:
            java.lang.Object r4 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A00(r5, r6)
            goto L_0x03d3
        L_0x03a6:
            java.lang.Object r4 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A02(r5, r6)
            goto L_0x03d3
        L_0x03ab:
            X.4Cl r0 = X.DbV.A0k(r5)
            java.lang.Integer r0 = r0.Afi()
            if (r0 == 0) goto L_0x03cd
            java.lang.String r0 = r0.toString()
            goto L_0x03cb
        L_0x03ba:
            java.lang.Object r4 = com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A01(r5, r6)
            goto L_0x03d3
        L_0x03bf:
            com.instagram.user.model.User r0 = X.DbT.A0j(r5)
            X.16V r0 = r0.A0J()
            if (r0 == 0) goto L_0x03cd
            java.lang.String r0 = r0.A01
        L_0x03cb:
            if (r0 != 0) goto L_0x03cf
        L_0x03cd:
            java.lang.String r0 = ""
        L_0x03cf:
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x03d3:
            if (r4 != r3) goto L_0x037c
            return r3
        L_0x03d6:
            X.MDq r6 = new X.MDq
            r6.<init>(r2, r4, r7)
            goto L_0x036a
        L_0x03dc:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x03f9
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to get derived string value: "
            r1.append(r0)
            X.XQt r0 = r2.A00
            r1.append(r0)
            r0 = 1984(0x7c0, float:2.78E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r1 = X.JTS.A0d(r4, r0, r1)
            throw r1
        L_0x03f9:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x03fe:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0403:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.DerivedStringWrapper
            if (r0 == 0) goto L_0x044d
            r7 = r1
            com.instagram.settings2.core.model.DerivedStringWrapper r7 = (com.instagram.settings2.core.model.DerivedStringWrapper) r7
            r6 = 22
            boolean r0 = X.MEB.A03(r6, r4)
            if (r0 == 0) goto L_0x0443
            r5 = r4
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0443
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0420:
            java.lang.Object r4 = r5.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0435
            if (r0 != r2) goto L_0x0448
            X.0eS.A00(r4)
        L_0x042e:
            java.lang.String r4 = (java.lang.String) r4
            X.JwL r1 = X.C61083JwL.A01(r4)
            return r1
        L_0x0435:
            X.0eS.A00(r4)
            com.instagram.settings2.core.model.DerivedStringValue r0 = r7.A00
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r1) goto L_0x042e
            return r1
        L_0x0443:
            X.MEB r5 = X.MEB.A00(r7, r4, r6)
            goto L_0x0420
        L_0x0448:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x044d:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.NotValue
            if (r0 == 0) goto L_0x0499
            r7 = r1
            com.instagram.settings2.core.model.NotValue r7 = (com.instagram.settings2.core.model.NotValue) r7
            r6 = 26
            boolean r0 = X.MEB.A03(r6, r4)
            if (r0 == 0) goto L_0x048f
            r5 = r4
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x048f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x046a:
            java.lang.Object r4 = r5.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0481
            if (r0 != r2) goto L_0x0494
            X.0eS.A00(r4)
        L_0x0478:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            return r1
        L_0x0481:
            X.0eS.A00(r4)
            X.LSs r0 = r7.A00
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r1) goto L_0x0478
            return r1
        L_0x048f:
            X.MEB r5 = X.MEB.A00(r7, r4, r6)
            goto L_0x046a
        L_0x0494:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0499:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.EqualsValue
            if (r0 == 0) goto L_0x0507
            com.instagram.settings2.core.model.EqualsValue r1 = (com.instagram.settings2.core.model.EqualsValue) r1
            r6 = 30
            boolean r0 = X.ME9.A03(r6, r4)
            if (r0 == 0) goto L_0x04fd
            r7 = r4
            X.ME9 r7 = (X.ME9) r7
            int r5 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L_0x04fd
            int r5 = r5 - r2
            r7.A00 = r5
        L_0x04b5:
            java.lang.Object r6 = r7.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x04d1
            if (r0 == r4) goto L_0x04e0
            if (r0 != r5) goto L_0x0502
            java.lang.Object r0 = r7.A01
            X.0eS.A00(r6)
        L_0x04c8:
            boolean r0 = X.0qQ.A0K(r0, r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x04d0:
            return r2
        L_0x04d1:
            X.0eS.A00(r6)
            X.LSs r0 = r1.A00
            X.ME9.A01(r1, r3, r7, r4)
            java.lang.Object r6 = r3.A01(r0, r7)
            if (r6 != r2) goto L_0x04eb
            return r2
        L_0x04e0:
            java.lang.Object r3 = r7.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r7.A01
            com.instagram.settings2.core.model.EqualsValue r1 = (com.instagram.settings2.core.model.EqualsValue) r1
            X.0eS.A00(r6)
        L_0x04eb:
            X.LSs r1 = r1.A01
            r7.A01 = r6
            r0 = 0
            r7.A02 = r0
            r7.A00 = r5
            java.lang.Object r1 = r3.A01(r1, r7)
            if (r1 == r2) goto L_0x04d0
            r0 = r6
            r6 = r1
            goto L_0x04c8
        L_0x04fd:
            X.ME9 r7 = X.ME9.A00(r1, r4, r6)
            goto L_0x04b5
        L_0x0502:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0507:
            boolean r0 = r1 instanceof X.KY6
            if (r0 == 0) goto L_0x0568
            r4 = r1
            X.KY6 r4 = (X.KY6) r4
            X.C49142Eq5.A00()
            java.lang.Integer r3 = r4.A00
            r2 = 0
            boolean r0 = X.AnonymousClass7TF.A1U(r2, r5, r3)
            int r1 = r3.intValue()
            if (r1 == r2) goto L_0x0544
            if (r1 == r0) goto L_0x053f
            r0 = 2
            if (r1 == r0) goto L_0x053b
            r0 = 3
            if (r1 != r0) goto L_0x0563
            X.XQs r0 = X.C21247XQs.ANDROID
        L_0x0528:
            X.0ry r2 = r4.A01
            r1 = r2
            X.0Yh r1 = (X.0Yh) r1
            java.lang.Class r1 = r1.A00
            boolean r1 = X.0q1.A02(r1, r0)
            if (r1 == 0) goto L_0x0547
            java.lang.String r1 = "null cannot be cast to non-null type T of com.instagram.settings2.core.model.LocalSystemValue"
            X.0qQ.A0C(r0, r1)
            return r0
        L_0x053b:
            boolean r0 = X.2R8.A00(r5)
        L_0x053f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0528
        L_0x0544:
            java.lang.String r0 = r5.A06
            goto L_0x0528
        L_0x0547:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r0)
            java.lang.String r0 = ", from "
            r1.append(r0)
            java.lang.String r0 = X.C63417Kwd.A00(r3)
            r1.append(r0)
            java.lang.String r0 = ", is not instance of "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>(r0)
            throw r1
        L_0x0563:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0568:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.FbtWithTokensValue
            if (r0 == 0) goto L_0x05c4
            r5 = r1
            com.instagram.settings2.core.model.FbtWithTokensValue r5 = (com.instagram.settings2.core.model.FbtWithTokensValue) r5
            r6 = 0
            boolean r0 = X.C66139MDr.A01(r6, r4)
            if (r0 == 0) goto L_0x05b9
            r7 = r4
            X.MDr r7 = (X.C66139MDr) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x05b9
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0584:
            java.lang.Object r2 = r7.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x05a4
            if (r0 != r6) goto L_0x05bf
            java.lang.Object r5 = r7.A01
            com.instagram.settings2.core.model.FbtWithTokensValue r5 = (com.instagram.settings2.core.model.FbtWithTokensValue) r5
            X.0eS.A00(r2)
        L_0x0596:
            int r0 = r5.A00
            X.JzV r1 = new X.JzV
            r1.<init>(r0)
            r0 = 3
            X.JwL r4 = new X.JwL
            r4.<init>(r0, r1, r2)
            return r4
        L_0x05a4:
            X.0eS.A00(r2)
            r2 = 0
            r1 = 3
            X.JaL r0 = new X.JaL
            r0.<init>((X.AnonymousClass4D7) r2, (java.lang.Object) r5, (java.lang.Object) r3, (int) r1)
            r7.A01 = r5
            r7.A00 = r6
            java.lang.Object r2 = X.19E.A00(r7, r0)
            if (r2 != r4) goto L_0x0596
            return r4
        L_0x05b9:
            X.MDr r7 = new X.MDr
            r7.<init>(r5, r4, r6)
            goto L_0x0584
        L_0x05bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05c4:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.FbtLiteralValue
            if (r0 == 0) goto L_0x060e
            r7 = r1
            com.instagram.settings2.core.model.FbtLiteralValue r7 = (com.instagram.settings2.core.model.FbtLiteralValue) r7
            r6 = 23
            boolean r0 = X.MEB.A03(r6, r4)
            if (r0 == 0) goto L_0x0604
            r5 = r4
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0604
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x05e1:
            java.lang.Object r4 = r5.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x05f6
            if (r0 != r2) goto L_0x0609
            X.0eS.A00(r4)
        L_0x05ef:
            java.lang.String r4 = (java.lang.String) r4
            X.JwL r1 = X.C61083JwL.A01(r4)
            return r1
        L_0x05f6:
            X.0eS.A00(r4)
            X.LSs r0 = r7.A00
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r1) goto L_0x05ef
            return r1
        L_0x0604:
            X.MEB r5 = X.MEB.A00(r7, r4, r6)
            goto L_0x05e1
        L_0x0609:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x060e:
            boolean r0 = r1 instanceof X.KYA
            if (r0 == 0) goto L_0x061e
            r0 = r1
            X.KYA r0 = (X.KYA) r0
            X.JwH r1 = r0.A00
            X.0ry r0 = r0.A01
            java.lang.Object r0 = r3.A00(r1, r4, r0)
            return r0
        L_0x061e:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.FbtLinkTokenValue
            if (r0 == 0) goto L_0x0691
            com.instagram.settings2.core.model.FbtLinkTokenValue r1 = (com.instagram.settings2.core.model.FbtLinkTokenValue) r1
            r6 = 31
            boolean r0 = X.ME9.A03(r6, r4)
            if (r0 == 0) goto L_0x0687
            r7 = r4
            X.ME9 r7 = (X.ME9) r7
            int r5 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L_0x0687
            int r5 = r5 - r2
            r7.A00 = r5
        L_0x063a:
            java.lang.Object r6 = r7.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x065d
            if (r0 == r2) goto L_0x066c
            if (r0 != r4) goto L_0x068c
            java.lang.Object r2 = r7.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r7.A01
            com.instagram.settings2.core.model.FbtLinkTokenValue r1 = (com.instagram.settings2.core.model.FbtLinkTokenValue) r1
            X.0eS.A00(r6)
        L_0x0653:
            X.JwL r6 = (X.C61083JwL) r6
            java.lang.String r0 = r1.A02
            X.GqS r5 = new X.GqS
            r5.<init>(r6, r0, r2)
        L_0x065c:
            return r5
        L_0x065d:
            X.0eS.A00(r6)
            X.LSs r0 = r1.A00
            X.ME9.A01(r1, r3, r7, r2)
            java.lang.Object r6 = r3.A01(r0, r7)
            if (r6 != r5) goto L_0x0677
            return r5
        L_0x066c:
            java.lang.Object r3 = r7.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r7.A01
            com.instagram.settings2.core.model.FbtLinkTokenValue r1 = (com.instagram.settings2.core.model.FbtLinkTokenValue) r1
            X.0eS.A00(r6)
        L_0x0677:
            java.lang.String r6 = (java.lang.String) r6
            X.LSs r0 = r1.A01
            X.ME9.A01(r1, r6, r7, r4)
            java.lang.Object r0 = r3.A01(r0, r7)
            if (r0 == r5) goto L_0x065c
            r2 = r6
            r6 = r0
            goto L_0x0653
        L_0x0687:
            X.ME9 r7 = X.ME9.A00(r1, r4, r6)
            goto L_0x063a
        L_0x068c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0691:
            boolean r0 = r1 instanceof X.C21226XPu
            if (r0 == 0) goto L_0x0698
            java.lang.String r0 = r3.A01
            return r0
        L_0x0698:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.DictionaryValue
            if (r0 == 0) goto L_0x0787
            r6 = r1
            com.instagram.settings2.core.model.DictionaryValue r6 = (com.instagram.settings2.core.model.DictionaryValue) r6
            r5 = 7
            boolean r0 = X.JUK.A02(r5, r4)
            if (r0 == 0) goto L_0x0779
            r9 = r4
            X.JUK r9 = (X.JUK) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0779
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x06b4:
            java.lang.Object r2 = r9.A09
            X.1Hj r10 = X.1Hj.A02
            int r0 = r9.A00
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0752
            if (r0 == r7) goto L_0x072e
            if (r0 != r8) goto L_0x0782
            java.lang.Object r13 = r9.A08
            java.util.AbstractCollection r13 = (java.util.AbstractCollection) r13
            java.lang.Object r12 = r9.A07
            java.lang.Object r1 = r9.A06
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r11 = r9.A05
            java.util.AbstractCollection r11 = (java.util.AbstractCollection) r11
            java.lang.Object r6 = r9.A04
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r9.A03
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.A02
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r3 = r9.A01
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            X.0eS.A00(r2)
        L_0x06e3:
            r1.put(r12, r2)
            X.0gF r0 = X.C60340gF.A00
            r13.add(r0)
        L_0x06eb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0781
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0781
            java.lang.Object r1 = r5.next()
            java.lang.Object r0 = r6.next()
            X.LSs r0 = (X.C64185LSs) r0
            X.LSs r1 = (X.C64185LSs) r1
            X.JUK.A00(r3, r4, r5, r6, r9)
            r9.A05 = r11
            r9.A06 = r0
            r9.A07 = r4
            r9.A08 = r11
            r9.A00 = r7
            java.lang.Object r2 = r3.A01(r1, r9)
            if (r2 == r10) goto L_0x0780
            r13 = r11
            r1 = r4
        L_0x0718:
            X.JUK.A00(r3, r4, r5, r6, r9)
            r9.A05 = r11
            r9.A06 = r1
            r9.A07 = r2
            r9.A08 = r13
            r9.A00 = r8
            java.lang.Object r0 = r3.A01(r0, r9)
            if (r0 == r10) goto L_0x0780
            r12 = r2
            r2 = r0
            goto L_0x06e3
        L_0x072e:
            java.lang.Object r13 = r9.A08
            java.util.AbstractCollection r13 = (java.util.AbstractCollection) r13
            java.lang.Object r1 = r9.A07
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r9.A06
            X.LSs r0 = (X.C64185LSs) r0
            java.lang.Object r11 = r9.A05
            java.util.AbstractCollection r11 = (java.util.AbstractCollection) r11
            java.lang.Object r6 = r9.A04
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r9.A03
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.A02
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r3 = r9.A01
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            X.0eS.A00(r2)
            goto L_0x0718
        L_0x0752:
            X.0eS.A00(r2)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.List r1 = r6.A00
            java.util.List r2 = r6.A01
            java.util.Iterator r5 = r1.iterator()
            java.util.Iterator r6 = r2.iterator()
            r0 = 10
            int r1 = X.0Yv.A1E(r1, r0)
            int r0 = X.0Yv.A1E(r2, r0)
            int r0 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r11 = X.DbS.A0v(r0)
            goto L_0x06eb
        L_0x0779:
            X.JUK r9 = new X.JUK
            r9.<init>(r6, r4, r5)
            goto L_0x06b4
        L_0x0780:
            return r10
        L_0x0781:
            return r4
        L_0x0782:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0787:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.BloksNavigationRowDestinationValue
            if (r0 == 0) goto L_0x0852
            com.instagram.settings2.core.model.BloksNavigationRowDestinationValue r1 = (com.instagram.settings2.core.model.BloksNavigationRowDestinationValue) r1
            r7 = 2
            boolean r0 = r4 instanceof X.MDP
            if (r0 == 0) goto L_0x0846
            r5 = r4
            X.MDP r5 = (X.MDP) r5
            int r0 = r5.A08
            if (r0 != r7) goto L_0x0846
            int r6 = r5.A01
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r2
            if (r0 == 0) goto L_0x0846
            int r6 = r6 - r2
            r5.A01 = r6
        L_0x07a4:
            java.lang.Object r6 = r5.A07
            X.1Hj r8 = X.1Hj.A02
            int r0 = r5.A01
            r13 = 0
            r4 = 3
            r2 = 1
            if (r0 == 0) goto L_0x07d2
            if (r0 == r2) goto L_0x07e8
            if (r0 == r7) goto L_0x0814
            if (r0 != r4) goto L_0x084d
            java.lang.Object r12 = r5.A05
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r10 = r5.A04
            X.XQm r10 = (X.C21241XQm) r10
            java.lang.Object r9 = r5.A03
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r11 = r5.A02
            java.lang.String r11 = (java.lang.String) r11
            X.0eS.A00(r6)
        L_0x07c8:
            boolean r14 = X.AnonymousClass7TE.A1a(r6)
            X.Dtv r8 = new X.Dtv
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x07d2:
            X.0eS.A00(r6)
            java.lang.String r11 = r1.A03
            X.LSs r0 = r1.A00
            r5.A02 = r1
            r5.A03 = r3
            r5.A04 = r11
            r5.A01 = r2
            java.lang.Object r6 = r3.A01(r0, r5)
            if (r6 != r8) goto L_0x07f7
            return r8
        L_0x07e8:
            java.lang.Object r11 = r5.A04
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r5.A03
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r5.A02
            com.instagram.settings2.core.model.BloksNavigationRowDestinationValue r1 = (com.instagram.settings2.core.model.BloksNavigationRowDestinationValue) r1
            X.0eS.A00(r6)
        L_0x07f7:
            r9 = r6
            X.JwL r9 = (X.C61083JwL) r9
            r10 = 0
            com.instagram.settings2.core.model.DictionaryValue r0 = r1.A02
            r5.A02 = r1
            r5.A03 = r3
            r5.A04 = r11
            r5.A05 = r9
            r5.A06 = r10
            r5.A01 = r7
            if (r0 == 0) goto L_0x0812
            java.lang.Object r6 = r3.A01(r0, r5)
            if (r6 != r8) goto L_0x082b
            return r8
        L_0x0812:
            r6 = 0
            goto L_0x082b
        L_0x0814:
            java.lang.Object r10 = r5.A06
            X.XQm r10 = (X.C21241XQm) r10
            java.lang.Object r9 = r5.A05
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r11 = r5.A04
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r5.A03
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r5.A02
            com.instagram.settings2.core.model.BloksNavigationRowDestinationValue r1 = (com.instagram.settings2.core.model.BloksNavigationRowDestinationValue) r1
            X.0eS.A00(r6)
        L_0x082b:
            r12 = r6
            java.util.HashMap r12 = (java.util.HashMap) r12
            X.LSs r1 = r1.A01
            r5.A02 = r11
            r5.A03 = r9
            r5.A04 = r10
            r5.A05 = r12
            r0 = 0
            r5.A06 = r0
            r5.A00 = r13
            r5.A01 = r4
            java.lang.Object r6 = r3.A01(r1, r5)
            if (r6 != r8) goto L_0x07c8
            return r8
        L_0x0846:
            X.MDP r5 = new X.MDP
            r5.<init>(r1, r4, r7)
            goto L_0x07a4
        L_0x084d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0852:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.SettingBannerValue
            if (r0 == 0) goto L_0x0920
            com.instagram.settings2.core.model.SettingBannerValue r1 = (com.instagram.settings2.core.model.SettingBannerValue) r1
            r6 = 30
            boolean r0 = X.ME0.A02(r6, r4)
            if (r0 == 0) goto L_0x0914
            r7 = r4
            X.ME0 r7 = (X.ME0) r7
            int r5 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L_0x0914
            int r5 = r5 - r2
            r7.A00 = r5
        L_0x086e:
            java.lang.Object r9 = r7.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 4
            r6 = 3
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0899
            if (r0 == r2) goto L_0x08ab
            if (r0 == r4) goto L_0x08ca
            if (r0 == r6) goto L_0x08ea
            if (r0 != r8) goto L_0x091b
            java.lang.Object r6 = r7.A03
            X.JwL r6 = (X.C61083JwL) r6
            java.lang.Object r4 = r7.A02
            X.JwL r4 = (X.C61083JwL) r4
            java.lang.Object r2 = r7.A01
            X.JwL r2 = (X.C61083JwL) r2
            X.0eS.A00(r9)
        L_0x0891:
            X.LLo r9 = (X.C64070LLo) r9
            X.JwC r5 = new X.JwC
            r5.<init>((X.C61083JwL) r2, (X.C61083JwL) r4, (X.C61083JwL) r6, (X.C64070LLo) r9)
            return r5
        L_0x0899:
            X.0eS.A00(r9)
            X.LSs r0 = r1.A03
            r7.A01 = r1
            r7.A02 = r3
            r7.A00 = r2
            java.lang.Object r9 = r3.A01(r0, r7)
            if (r9 != r5) goto L_0x08b6
            return r5
        L_0x08ab:
            java.lang.Object r3 = r7.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r7.A01
            com.instagram.settings2.core.model.SettingBannerValue r1 = (com.instagram.settings2.core.model.SettingBannerValue) r1
            X.0eS.A00(r9)
        L_0x08b6:
            r2 = r9
            X.JwL r2 = (X.C61083JwL) r2
            X.LSs r0 = r1.A02
            r7.A01 = r1
            r7.A02 = r3
            r7.A03 = r2
            r7.A00 = r4
            java.lang.Object r9 = r3.A01(r0, r7)
            if (r9 != r5) goto L_0x08d9
            return r5
        L_0x08ca:
            java.lang.Object r2 = r7.A03
            X.JwL r2 = (X.C61083JwL) r2
            java.lang.Object r3 = r7.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r7.A01
            com.instagram.settings2.core.model.SettingBannerValue r1 = (com.instagram.settings2.core.model.SettingBannerValue) r1
            X.0eS.A00(r9)
        L_0x08d9:
            r4 = r9
            X.JwL r4 = (X.C61083JwL) r4
            X.LSs r0 = r1.A01
            X.ME0.A00(r1, r3, r2, r4, r7)
            r7.A00 = r6
            java.lang.Object r9 = r3.A01(r0, r7)
            if (r9 != r5) goto L_0x08fd
            return r5
        L_0x08ea:
            java.lang.Object r4 = r7.A04
            X.JwL r4 = (X.C61083JwL) r4
            java.lang.Object r2 = r7.A03
            X.JwL r2 = (X.C61083JwL) r2
            java.lang.Object r3 = r7.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r7.A01
            com.instagram.settings2.core.model.SettingBannerValue r1 = (com.instagram.settings2.core.model.SettingBannerValue) r1
            X.0eS.A00(r9)
        L_0x08fd:
            r6 = r9
            X.JwL r6 = (X.C61083JwL) r6
            X.LSs r1 = r1.A00
            r7.A01 = r2
            r7.A02 = r4
            r7.A03 = r6
            r0 = 0
            r7.A04 = r0
            r7.A00 = r8
            java.lang.Object r9 = r3.A01(r1, r7)
            if (r9 != r5) goto L_0x0891
            return r5
        L_0x0914:
            X.ME0 r7 = new X.ME0
            r7.<init>(r1, r4, r6)
            goto L_0x086e
        L_0x091b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0920:
            boolean r0 = r1 instanceof X.KYW
            if (r0 == 0) goto L_0x0927
            X.LLo r0 = X.C64070LLo.A00
            return r0
        L_0x0927:
            boolean r0 = r1 instanceof X.KY8
            if (r0 == 0) goto L_0x098e
            r0 = r1
            X.KY8 r0 = (X.KY8) r0
            X.MSo r4 = r0.A00
            X.0ry r2 = r0.A01
            X.AnonymousClass7TG.A1N(r4, r2)
            boolean r0 = r4 instanceof X.MXZ
            if (r0 == 0) goto L_0x0950
            com.instagram.settings2.core.data.SettingsRepository r1 = r3.A00
            r0 = r4
            X.MXZ r0 = (X.MXZ) r0
            java.lang.Boolean r1 = r1.A03(r0)
        L_0x0942:
            if (r1 == 0) goto L_0x097a
            r0 = r2
            X.0Yh r0 = (X.0Yh) r0
            java.lang.Class r0 = r0.A00
            boolean r0 = X.0q1.A02(r0, r1)
            if (r0 == 0) goto L_0x095e
            return r1
        L_0x0950:
            boolean r0 = r4 instanceof X.C66570MXa
            if (r0 == 0) goto L_0x0989
            com.instagram.settings2.core.data.SettingsRepository r1 = r3.A00
            r0 = r4
            X.MXa r0 = (X.C66570MXa) r0
            java.lang.String r1 = r1.A0B(r0)
            goto L_0x0942
        L_0x095e:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r1)
            java.lang.String r0 = ", from "
            r1.append(r0)
            java.lang.String r0 = r4.BOI()
            r1.append(r0)
            java.lang.String r0 = ", is not instance of "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>(r0)
            throw r1
        L_0x097a:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r4)
            java.lang.String r0 = " has no setting update in progress"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        L_0x0989:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x098e:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.OpenUrlDestinationValue
            if (r0 == 0) goto L_0x09d9
            r7 = r1
            com.instagram.settings2.core.model.OpenUrlDestinationValue r7 = (com.instagram.settings2.core.model.OpenUrlDestinationValue) r7
            r6 = 27
            boolean r0 = X.MEB.A03(r6, r4)
            if (r0 == 0) goto L_0x09cf
            r5 = r4
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x09cf
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x09ab:
            java.lang.Object r4 = r5.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x09c1
            if (r0 != r2) goto L_0x09d4
            X.0eS.A00(r4)
        L_0x09b9:
            java.lang.String r4 = (java.lang.String) r4
            X.Dtr r1 = new X.Dtr
            r1.<init>(r4, r2)
            return r1
        L_0x09c1:
            X.0eS.A00(r4)
            X.LSs r0 = r7.A00
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r1) goto L_0x09b9
            return r1
        L_0x09cf:
            X.MEB r5 = X.MEB.A00(r7, r4, r6)
            goto L_0x09ab
        L_0x09d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09d9:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.ModalValue
            if (r0 == 0) goto L_0x0b46
            r6 = r1
            com.instagram.settings2.core.model.ModalValue r6 = (com.instagram.settings2.core.model.ModalValue) r6
            r8 = 4
            boolean r0 = X.C59814JZl.A01(r8, r4)
            if (r0 == 0) goto L_0x0a04
            r5 = r4
            X.JZl r5 = (X.C59814JZl) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0a04
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x09f5:
            java.lang.Object r4 = r5.A07
            X.1Hj r9 = X.1Hj.A02
            int r0 = r5.A00
            r13 = 0
            switch(r0) {
                case 0: goto L_0x0a26;
                case 1: goto L_0x0a39;
                case 2: goto L_0x0a74;
                case 3: goto L_0x0a0a;
                case 4: goto L_0x0ab0;
                case 5: goto L_0x0aec;
                case 6: goto L_0x0b26;
                default: goto L_0x09ff;
            }
        L_0x09ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a04:
            X.JZl r5 = new X.JZl
            r5.<init>(r6, r4, r8)
            goto L_0x09f5
        L_0x0a0a:
            java.lang.Object r15 = r5.A04
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r7 = r5.A03
            X.JwL r7 = (X.C61083JwL) r7
            java.lang.Object r3 = r5.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r6 = r5.A01
            com.instagram.settings2.core.model.ModalValue r6 = (com.instagram.settings2.core.model.ModalValue) r6
            X.0eS.A00(r4)
            int r0 = X.AnonymousClass7TE.A0M(r4)
            java.lang.Integer r14 = X.JTO.A0w(r0)
            goto L_0x0a97
        L_0x0a26:
            X.0eS.A00(r4)
            X.LSs r1 = r6.A03
            r5.A01 = r6
            r5.A02 = r3
            r0 = 1
            r5.A00 = r0
            java.lang.Object r4 = r3.A01(r1, r5)
            if (r4 != r9) goto L_0x0a44
            return r9
        L_0x0a39:
            java.lang.Object r3 = r5.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r6 = r5.A01
            com.instagram.settings2.core.model.ModalValue r6 = (com.instagram.settings2.core.model.ModalValue) r6
            X.0eS.A00(r4)
        L_0x0a44:
            X.JwL r4 = (X.C61083JwL) r4
            java.util.List r1 = r6.A04
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
            r15 = r0
            r7 = r4
        L_0x0a52:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a94
            java.lang.Object r4 = r1.next()
            X.LSs r4 = (X.C64185LSs) r4
            r5.A01 = r6
            r5.A02 = r3
            r5.A03 = r0
            r5.A04 = r1
            r5.A05 = r7
            r5.A06 = r0
            r2 = 2
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r4, r5)
            if (r4 != r9) goto L_0x0a8f
            return r9
        L_0x0a74:
            java.lang.Object r15 = r5.A06
            java.util.Collection r15 = (java.util.Collection) r15
            java.lang.Object r7 = r5.A05
            X.JwL r7 = (X.C61083JwL) r7
            java.lang.Object r1 = r5.A04
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r0 = r5.A03
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r3 = r5.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r6 = r5.A01
            com.instagram.settings2.core.model.ModalValue r6 = (com.instagram.settings2.core.model.ModalValue) r6
            X.0eS.A00(r4)
        L_0x0a8f:
            r15.add(r4)
            r15 = r0
            goto L_0x0a52
        L_0x0a94:
            java.util.List r15 = (java.util.List) r15
            r14 = r13
        L_0x0a97:
            X.LSs r0 = r6.A01
            if (r0 == 0) goto L_0x0ace
            r5.A01 = r6
            r5.A02 = r3
            r5.A03 = r7
            r5.A04 = r15
            r5.A05 = r14
            r5.A06 = r13
            r5.A00 = r8
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r9) goto L_0x0ac7
            return r9
        L_0x0ab0:
            java.lang.Object r14 = r5.A05
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r15 = r5.A04
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r7 = r5.A03
            X.JwL r7 = (X.C61083JwL) r7
            java.lang.Object r3 = r5.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r6 = r5.A01
            com.instagram.settings2.core.model.ModalValue r6 = (com.instagram.settings2.core.model.ModalValue) r6
            X.0eS.A00(r4)
        L_0x0ac7:
            r11 = r4
            X.JwL r11 = (X.C61083JwL) r11
            r0 = r6
            r2 = r3
            r10 = r7
            goto L_0x0ad2
        L_0x0ace:
            r0 = r6
            r2 = r3
            r10 = r7
            r11 = r13
        L_0x0ad2:
            X.LSs r4 = r6.A02
            if (r4 == 0) goto L_0x0b0b
            r5.A01 = r6
            r5.A02 = r3
            r5.A03 = r7
            r5.A04 = r15
            r5.A05 = r14
            r5.A06 = r11
            r1 = 5
            r5.A00 = r1
            java.lang.Object r4 = r3.A01(r4, r5)
            if (r4 != r9) goto L_0x0b07
            return r9
        L_0x0aec:
            java.lang.Object r11 = r5.A06
            X.JwL r11 = (X.C61083JwL) r11
            java.lang.Object r14 = r5.A05
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r15 = r5.A04
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r10 = r5.A03
            X.JwL r10 = (X.C61083JwL) r10
            java.lang.Object r2 = r5.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r2 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r2
            java.lang.Object r0 = r5.A01
            com.instagram.settings2.core.model.ModalValue r0 = (com.instagram.settings2.core.model.ModalValue) r0
            X.0eS.A00(r4)
        L_0x0b07:
            r12 = r4
            X.JwL r12 = (X.C61083JwL) r12
            goto L_0x0b0c
        L_0x0b0b:
            r12 = r13
        L_0x0b0c:
            X.LSs r1 = r0.A00
            if (r1 == 0) goto L_0x0b40
            r5.A01 = r10
            r5.A02 = r15
            r5.A03 = r14
            r5.A04 = r11
            r5.A05 = r12
            r5.A06 = r13
            r0 = 6
            r5.A00 = r0
            java.lang.Object r4 = r2.A01(r1, r5)
            if (r4 != r9) goto L_0x0b3d
            return r9
        L_0x0b26:
            java.lang.Object r12 = r5.A05
            X.JwL r12 = (X.C61083JwL) r12
            java.lang.Object r11 = r5.A04
            X.JwL r11 = (X.C61083JwL) r11
            java.lang.Object r14 = r5.A03
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r15 = r5.A02
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r10 = r5.A01
            X.JwL r10 = (X.C61083JwL) r10
            X.0eS.A00(r4)
        L_0x0b3d:
            X.JwL r4 = (X.C61083JwL) r4
            r13 = r4
        L_0x0b40:
            X.Jvx r9 = new X.Jvx
            r9.<init>((X.C61083JwL) r10, (X.C61083JwL) r11, (X.C61083JwL) r12, (X.C61083JwL) r13, (java.lang.Integer) r14, (java.util.List) r15)
            return r9
        L_0x0b46:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.ModalButtonValue
            if (r0 == 0) goto L_0x0bb7
            r8 = r1
            com.instagram.settings2.core.model.ModalButtonValue r8 = (com.instagram.settings2.core.model.ModalButtonValue) r8
            r5 = 33
            boolean r0 = X.ME9.A03(r5, r4)
            if (r0 == 0) goto L_0x0bad
            r7 = r4
            X.ME9 r7 = (X.ME9) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0bad
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0b63:
            java.lang.Object r6 = r7.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0b80
            if (r0 == r1) goto L_0x0b8f
            if (r0 != r5) goto L_0x0bb2
            java.lang.Object r4 = r7.A01
            X.JwL r4 = (X.C61083JwL) r4
            X.0eS.A00(r6)
        L_0x0b78:
            X.L2R r6 = (X.L2R) r6
            X.JwL r2 = new X.JwL
            r2.<init>((X.C61083JwL) r4, (X.L2R) r6)
            return r2
        L_0x0b80:
            X.0eS.A00(r6)
            X.LSs r0 = r8.A01
            X.ME9.A01(r8, r3, r7, r1)
            java.lang.Object r6 = r3.A01(r0, r7)
            if (r6 != r2) goto L_0x0b9a
            return r2
        L_0x0b8f:
            java.lang.Object r3 = r7.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r8 = r7.A01
            com.instagram.settings2.core.model.ModalButtonValue r8 = (com.instagram.settings2.core.model.ModalButtonValue) r8
            X.0eS.A00(r6)
        L_0x0b9a:
            r4 = r6
            X.JwL r4 = (X.C61083JwL) r4
            X.LSs r1 = r8.A00
            r7.A01 = r4
            r0 = 0
            r7.A02 = r0
            r7.A00 = r5
            java.lang.Object r6 = r3.A01(r1, r7)
            if (r6 != r2) goto L_0x0b78
            return r2
        L_0x0bad:
            X.ME9 r7 = X.ME9.A00(r8, r4, r5)
            goto L_0x0b63
        L_0x0bb2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bb7:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.ModalBodyItemValue
            if (r0 == 0) goto L_0x0c5b
            com.instagram.settings2.core.model.ModalBodyItemValue r1 = (com.instagram.settings2.core.model.ModalBodyItemValue) r1
            r9 = 1
            boolean r0 = X.C66134MDm.A01(r9, r4)
            if (r0 == 0) goto L_0x0c4f
            r8 = r4
            X.MDm r8 = (X.C66134MDm) r8
            int r5 = r8.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L_0x0c4f
            int r5 = r5 - r2
            r8.A00 = r5
        L_0x0bd2:
            java.lang.Object r7 = r8.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 3
            r2 = 2
            if (r0 == 0) goto L_0x0bf3
            if (r0 == r9) goto L_0x0c05
            if (r0 == r2) goto L_0x0c24
            if (r0 != r5) goto L_0x0c56
            boolean r2 = r8.A05
            java.lang.Object r4 = r8.A01
            X.JwL r4 = (X.C61083JwL) r4
            X.0eS.A00(r7)
        L_0x0beb:
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.JV5 r6 = new X.JV5
            r6.<init>((X.C61083JwL) r4, (java.lang.Integer) r7, (boolean) r2)
            return r6
        L_0x0bf3:
            X.0eS.A00(r7)
            X.LSs r0 = r1.A01
            r8.A01 = r1
            r8.A02 = r3
            r8.A00 = r9
            java.lang.Object r7 = r3.A01(r0, r8)
            if (r7 != r6) goto L_0x0c10
            return r6
        L_0x0c05:
            java.lang.Object r3 = r8.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r8.A01
            com.instagram.settings2.core.model.ModalBodyItemValue r1 = (com.instagram.settings2.core.model.ModalBodyItemValue) r1
            X.0eS.A00(r7)
        L_0x0c10:
            r4 = r7
            X.JwL r4 = (X.C61083JwL) r4
            X.LSs r0 = r1.A02
            r8.A01 = r1
            r8.A02 = r3
            r8.A03 = r4
            r8.A00 = r2
            java.lang.Object r7 = r3.A01(r0, r8)
            if (r7 != r6) goto L_0x0c33
            return r6
        L_0x0c24:
            java.lang.Object r4 = r8.A03
            X.JwL r4 = (X.C61083JwL) r4
            java.lang.Object r3 = r8.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r3 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r3
            java.lang.Object r1 = r8.A01
            com.instagram.settings2.core.model.ModalBodyItemValue r1 = (com.instagram.settings2.core.model.ModalBodyItemValue) r1
            X.0eS.A00(r7)
        L_0x0c33:
            boolean r2 = X.AnonymousClass7TE.A1a(r7)
            X.LSs r1 = r1.A00
            r8.A01 = r4
            r0 = 0
            r8.A02 = r0
            r8.A03 = r0
            r8.A05 = r2
            r8.A00 = r5
            if (r1 == 0) goto L_0x0c4d
            java.lang.Object r7 = r3.A01(r1, r8)
            if (r7 != r6) goto L_0x0beb
            return r6
        L_0x0c4d:
            r7 = 0
            goto L_0x0beb
        L_0x0c4f:
            X.MDm r8 = new X.MDm
            r8.<init>(r1, r4, r9)
            goto L_0x0bd2
        L_0x0c56:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c5b:
            boolean r0 = r1 instanceof X.KYV
            if (r0 == 0) goto L_0x0c62
            X.KYQ r0 = X.KYQ.A00
            return r0
        L_0x0c62:
            boolean r0 = r1 instanceof X.KYU
            if (r0 == 0) goto L_0x0c69
            X.KYP r0 = X.KYP.A00
            return r0
        L_0x0c69:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.ModalActionValue$Navigate
            if (r0 == 0) goto L_0x0cb4
            r7 = r1
            com.instagram.settings2.core.model.ModalActionValue$Navigate r7 = (com.instagram.settings2.core.model.ModalActionValue$Navigate) r7
            r6 = 25
            boolean r0 = X.MEB.A03(r6, r4)
            if (r0 == 0) goto L_0x0caa
            r5 = r4
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0caa
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0c86:
            java.lang.Object r4 = r5.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0c9c
            if (r0 != r2) goto L_0x0caf
            X.0eS.A00(r4)
        L_0x0c94:
            X.G5E r4 = (X.G5E) r4
            X.KYN r1 = new X.KYN
            r1.<init>(r4)
            return r1
        L_0x0c9c:
            X.0eS.A00(r4)
            X.LSs r0 = r7.A00
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r1) goto L_0x0c94
            return r1
        L_0x0caa:
            X.MEB r5 = X.MEB.A00(r7, r4, r6)
            goto L_0x0c86
        L_0x0caf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cb4:
            boolean r0 = r1 instanceof X.KYT
            if (r0 == 0) goto L_0x0cbb
            X.KYO r0 = X.KYO.A00
            return r0
        L_0x0cbb:
            boolean r0 = r1 instanceof X.KYR
            if (r0 == 0) goto L_0x0cca
            r0 = r1
            X.KYR r0 = (X.KYR) r0
            X.MSo r1 = r0.A00
            X.KYM r0 = new X.KYM
            r0.<init>(r1)
            return r0
        L_0x0cca:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.FrictionValue$ConfirmationValue
            if (r0 == 0) goto L_0x0d15
            r7 = r1
            com.instagram.settings2.core.model.FrictionValue$ConfirmationValue r7 = (com.instagram.settings2.core.model.FrictionValue$ConfirmationValue) r7
            r6 = 24
            boolean r0 = X.MEB.A03(r6, r4)
            if (r0 == 0) goto L_0x0d0b
            r5 = r4
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0d0b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0ce7:
            java.lang.Object r4 = r5.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0cfd
            if (r0 != r2) goto L_0x0d10
            X.0eS.A00(r4)
        L_0x0cf5:
            X.Jvx r4 = (X.C61059Jvx) r4
            X.JwG r1 = new X.JwG
            r1.<init>((X.C61059Jvx) r4)
            return r1
        L_0x0cfd:
            X.0eS.A00(r4)
            X.LSs r0 = r7.A00
            r5.A00 = r2
            java.lang.Object r4 = r3.A01(r0, r5)
            if (r4 != r1) goto L_0x0cf5
            return r1
        L_0x0d0b:
            X.MEB r5 = X.MEB.A00(r7, r4, r6)
            goto L_0x0ce7
        L_0x0d10:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d15:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.FbtTextTokenValue
            if (r0 == 0) goto L_0x0d69
            r2 = r1
            com.instagram.settings2.core.model.FbtTextTokenValue r2 = (com.instagram.settings2.core.model.FbtTextTokenValue) r2
            r7 = 49
            boolean r0 = X.C66138MDq.A02(r7, r4)
            if (r0 == 0) goto L_0x0d5e
            r6 = r4
            X.MDq r6 = (X.C66138MDq) r6
            int r5 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x0d5e
            int r5 = r5 - r1
            r6.A00 = r5
        L_0x0d32:
            java.lang.Object r5 = r6.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0d4e
            if (r0 != r4) goto L_0x0d64
            java.lang.Object r2 = r6.A01
            com.instagram.settings2.core.model.FbtTextTokenValue r2 = (com.instagram.settings2.core.model.FbtTextTokenValue) r2
            X.0eS.A00(r5)
        L_0x0d44:
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.String r0 = r2.A01
            X.JzX r1 = new X.JzX
            r1.<init>(r5, r0)
            return r1
        L_0x0d4e:
            X.0eS.A00(r5)
            X.LSs r0 = r2.A00
            r6.A01 = r2
            r6.A00 = r4
            java.lang.Object r5 = r3.A01(r0, r6)
            if (r5 != r1) goto L_0x0d44
            return r1
        L_0x0d5e:
            X.MDq r6 = new X.MDq
            r6.<init>(r2, r4, r7)
            goto L_0x0d32
        L_0x0d64:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d69:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.BloksActionNavigationRowDestinationValue
            if (r0 == 0) goto L_0x0dc4
            r8 = r1
            com.instagram.settings2.core.model.BloksActionNavigationRowDestinationValue r8 = (com.instagram.settings2.core.model.BloksActionNavigationRowDestinationValue) r8
            r5 = 29
            boolean r0 = X.ME9.A03(r5, r4)
            if (r0 == 0) goto L_0x0dba
            r7 = r4
            X.ME9 r7 = (X.ME9) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0dba
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0d86:
            java.lang.Object r6 = r7.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x0da4
            if (r0 != r4) goto L_0x0dbf
            java.lang.Object r2 = r7.A02
            X.XQm r2 = (X.C21241XQm) r2
            java.lang.Object r1 = r7.A01
            java.lang.String r1 = (java.lang.String) r1
            X.0eS.A00(r6)
        L_0x0d9c:
            java.util.HashMap r6 = (java.util.HashMap) r6
            X.Dtt r5 = new X.Dtt
            r5.<init>(r2, r1, r6)
            return r5
        L_0x0da4:
            X.0eS.A00(r6)
            java.lang.String r1 = r8.A01
            r2 = 0
            com.instagram.settings2.core.model.DictionaryValue r0 = r8.A00
            X.ME9.A01(r1, r2, r7, r4)
            if (r0 == 0) goto L_0x0db8
            java.lang.Object r6 = r3.A01(r0, r7)
            if (r6 != r5) goto L_0x0d9c
            return r5
        L_0x0db8:
            r6 = 0
            goto L_0x0d9c
        L_0x0dba:
            X.ME9 r7 = X.ME9.A00(r8, r4, r5)
            goto L_0x0d86
        L_0x0dbf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dc4:
            boolean r0 = r1 instanceof com.instagram.settings2.core.model.ActionButtonValue$Information
            if (r0 == 0) goto L_0x0e27
            r8 = r1
            com.instagram.settings2.core.model.ActionButtonValue$Information r8 = (com.instagram.settings2.core.model.ActionButtonValue$Information) r8
            r1 = 2
            boolean r0 = r4 instanceof X.MDc
            if (r0 == 0) goto L_0x0e1c
            r7 = r4
            X.MDc r7 = (X.MDc) r7
            int r0 = r7.A05
            if (r0 != r1) goto L_0x0e1c
            int r2 = r7.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0e1c
            int r2 = r2 - r1
            r7.A02 = r2
        L_0x0de2:
            java.lang.Object r6 = r7.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A02
            r4 = 1
            if (r0 == 0) goto L_0x0dfe
            if (r0 != r4) goto L_0x0e22
            int r2 = r7.A01
            int r1 = r7.A00
            X.0eS.A00(r6)
        L_0x0df4:
            X.JwG r6 = (X.C61078JwG) r6
            r0 = 12
            X.Jw3 r5 = new X.Jw3
            r5.<init>((X.C61078JwG) r6, (int) r1, (int) r2, (int) r0)
        L_0x0dfd:
            return r5
        L_0x0dfe:
            X.0eS.A00(r6)
            r2 = 2131238465(0x7f081e41, float:1.809321E38)
            r1 = 2131964339(0x7f1331b3, float:1.9565457E38)
            X.LSs r0 = r8.A00
            r7.A00 = r2
            r7.A01 = r1
            r7.A02 = r4
            java.lang.Object r6 = r3.A01(r0, r7)
            if (r6 == r5) goto L_0x0dfd
            r2 = 2131964339(0x7f1331b3, float:1.9565457E38)
            r1 = 2131238465(0x7f081e41, float:1.809321E38)
            goto L_0x0df4
        L_0x0e1c:
            X.MDc r7 = new X.MDc
            r7.<init>((com.instagram.settings2.core.model.ActionButtonValue$Information) r8, (X.AnonymousClass4D7) r4)
            goto L_0x0de2
        L_0x0e22:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e27:
            r0 = r1
            X.KYG r0 = (X.KYG) r0
            X.LSs r1 = r0.A00
            X.JwG r0 = new X.JwG
            r0.<init>((X.C64185LSs) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64185LSs.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.4D7):java.lang.Object");
    }
}
