package X;

import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.PmU  reason: case insensitive filesystem */
public final class C73950PmU extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Long l;
        String str;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C8124QhG qhG = ((QL1) this.A01).A03;
                if (qhG != null) {
                    qhG.handleMessage(this.A02, this.A03);
                    break;
                }
                break;
            case 1:
                String str2 = this.A02;
                String str3 = this.A03;
                TreeJNI.parseStringDef((String) obj2, str2, str3, (FromStringAble) this.A01);
                return str3;
            case 2:
                if (obj == null) {
                    return null;
                }
                TreeJNI treeJNI = TreeJNI.$redex_init_class;
                throw AnonymousClass7TE.A11("fromString");
            case 3:
                0qQ.A0B(obj, 0);
                TreeJNI treeJNI2 = TreeJNI.$redex_init_class;
                throw AnonymousClass7TE.A11("fromString");
            case 4:
                boolean A1a = AnonymousClass7TE.A1a(obj);
                C12411Sto A0g = C51965G9l.A0g();
                QDN qdn = (QDN) this.A01;
                LoggingContext loggingContext = qdn.A1P;
                String str4 = this.A03;
                PuxContactItem puxContactItem = (PuxContactItem) qdn.A0I.A01;
                if (puxContactItem == null || (str = puxContactItem.A02) == null) {
                    l = null;
                } else {
                    l = DbV.A0q(str);
                }
                SEB A032 = qdn.A1Q.A03();
                String str5 = this.A02;
                LinkedHashMap A0m = C66583MXo.A0m(A032, A1a);
                if (str5 != null) {
                    A0m.put("selected_contact_state", str5);
                }
                A0g.A0I(loggingContext, l, str4, A0m);
                return C60340gF.A00;
            case 5:
                C333867aH r6 = (C333867aH) obj2;
                0qQ.A0B(r6, 0);
                return C335067cK.A06(r6, this.A03, this.A02, new J6O(this.A01, 20));
            case 6:
                return I11.A00((I11) this.A01, this.A03, this.A02, AnonymousClass7TE.A0M(obj));
            case 7:
                MailboxFeature mailboxFeature = (MailboxFeature) obj2;
                0qQ.A0B(mailboxFeature, 0);
                String str6 = this.A02;
                String str7 = this.A03;
                C71722Opg A002 = C71722Opg.A00(this.A01, 34);
                AnonymousClass68L A0I = C66581MXm.A0I(mailboxFeature);
                MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A002);
                C66582MXn.A1E(A0I, new C71666Ool(mailboxFeature, A0J, str6, str7, 0), A0J);
                break;
            default:
                N3R n3r = (N3R) obj2;
                if (n3r.A03 != C69285Nil.LOADING) {
                    List list = n3r.A0C;
                    NV8 nv8 = (NV8) this.A01;
                    String str8 = this.A03;
                    String str9 = this.A02;
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    int i = 0;
                    for (Object next : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        NVH nvh = (NVH) next;
                        nvh.A00 = new C73958Pmc(nv8, n3r, nvh, str8, str9, i);
                        A0r.add(nvh);
                        i = i2;
                    }
                    boolean isEmpty = A0r.isEmpty();
                    List list2 = A0r;
                    if (isEmpty) {
                        list2 = A0r;
                        if (0qQ.A0K(str8, "stacks")) {
                            List list3 = n3r.A0D;
                            0qQ.A0A(list3);
                            list2 = list3;
                        }
                    }
                    C68193N5i n5i = n3r.A02;
                    List list4 = list2;
                    if (n5i != null) {
                        ArrayList A0U = 00k.A0U(list2);
                        A0U.add(0, n5i);
                        list4 = A0U;
                    }
                    List list5 = n3r.A0E;
                    0qQ.A0B(list5, 0);
                    nv8.A02 = list5;
                    nv8.A0B(list4);
                    break;
                } else {
                    ((MYR) this.A01).updateUi(JXP.LOADING, 0sn.A00);
                    break;
                }
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73950PmU(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
