package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.PPf  reason: case insensitive filesystem */
public final class C72921PPf implements C337237fw, C336267eL {
    public OKM A00;
    public C65615Lwq A01;
    public C72919PPd A02;
    public C65616Lwr A03;
    public Object A04;
    public Object A05 = AnonymousClass7TE.A1C();
    public String A06;
    public HashMap A07 = AnonymousClass7TE.A1E();
    public boolean A08;
    public boolean A09;
    public C337237fw A0A;
    public final AnonymousClass4D6 A0B;
    public final OWV A0C;
    public final C336267eL A0D;
    public final C336267eL A0E;
    public final C336267eL A0F;
    public final boolean A0G;
    public final UserSession A0H;
    public final L1T A0I;
    public final O8H A0J;
    public final C63856L9l A0K;
    public final Integer A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;
    public final boolean A0P;

    public final void DDU() {
    }

    public final void Dam(C337257fy r15) {
        C336267eL r6;
        String str;
        Object obj;
        Object obj2;
        AnonymousClass9B2 r1;
        Object obj3;
        String str2;
        0qQ.A0B(r15, 0);
        C336267eL r4 = this.A0F;
        if (0qQ.A0K(r4.BiY(), this.A06) && ((r6 = this.A0E) == null || 0qQ.A0K(r6.BiY(), this.A06))) {
            C72919PPd pPd = this.A02;
            Object obj4 = null;
            if (!((pPd != null && !0qQ.A0K(pPd.A02, this.A06)) || (str = this.A06) == null || str.length() == 0)) {
                Object Bo1 = r4.Bo1();
                if (r6 != null) {
                    obj = r6.Bo1();
                } else {
                    obj = null;
                }
                if (pPd != null) {
                    obj2 = pPd.A01;
                } else {
                    obj2 = null;
                }
                C65615Lwq lwq = this.A01;
                if (lwq != null) {
                    obj4 = lwq.A01;
                }
                Object B3J = r4.B3J();
                if (B3J != null) {
                    HashMap hashMap = this.A07;
                    0qQ.A0C(B3J, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                    hashMap.putAll((HashMap) B3J);
                }
                if (obj != null) {
                    OWV owv = this.A0C;
                    HashMap hashMap2 = this.A07;
                    List Bqo = r4.Bqo();
                    List<C74253Prh> list = (List) obj;
                    0qQ.A0B(hashMap2, 0);
                    0qQ.A0B(list, 1);
                    for (C74253Prh prh : list) {
                        if (prh instanceof C72646PDz) {
                            obj3 = Integer.valueOf(((C72646PDz) prh).A00);
                            str2 = "message_content";
                        } else if (prh instanceof PE0) {
                            PE0 pe0 = (PE0) prh;
                            if (pe0.A02) {
                                obj3 = pe0.A00;
                                str2 = "reshared_content";
                            }
                        }
                        hashMap2.put(str2, obj3);
                    }
                    DirectShareTarget directShareTarget = null;
                    if (!(!owv.A0J || (r1 = owv.A02) == null || r1.A00() == null)) {
                        directShareTarget = r1.A00();
                        0qQ.A0C(directShareTarget, "null cannot be cast to non-null type T of com.instagram.direct.search.provider.InteropProviderDelegateImpl");
                    }
                    owv.A04 = directShareTarget;
                    if (directShareTarget != null) {
                        hashMap2.put("meta_ai_agent", directShareTarget);
                    }
                    if (Bqo != null) {
                        hashMap2.put("section_order", Bqo);
                    }
                    this.A07 = hashMap2;
                }
                OWV owv2 = this.A0C;
                Object obj5 = this.A04;
                String str3 = this.A06;
                if (str3 == null) {
                    str3 = "";
                }
                this.A05 = owv2.A01(obj5, Bo1, obj, obj2, obj4, str3);
                boolean CWX = r4.CWX();
                String A002 = AnonymousClass000.A00(12);
                if (CWX) {
                    Object Bo12 = r4.Bo1();
                    0qQ.A0C(Bo12, A002);
                    owv2.A02(2, 0, (long) DbS.A05(Bo12));
                }
                OKM okm = this.A00;
                if (okm != null) {
                    Object Bo13 = r4.Bo1();
                    0qQ.A0C(Bo13, A002);
                    okm.A00(true, DbS.A05(Bo13));
                }
                A00(this);
            }
        }
        C336267eL r12 = this.A0D;
        if (r12 != null && (r15 instanceof C389819qH) && ((C336257eK) r15).A06) {
            this.A09 = false;
            HashMap hashMap3 = this.A07;
            Object Bo14 = r12.Bo1();
            0qQ.A0B(hashMap3, 0);
            if (Bo14 != null) {
                hashMap3.put("ibc_chats_context_lines", Bo14);
            }
            this.A07 = hashMap3;
            A00(this);
        }
    }

    public final void ERO(List list) {
        C336267eL r0;
        0qQ.A0B(list, 0);
        if ((!list.isEmpty()) && !this.A09 && (r0 = this.A0D) != null && !r0.CWX()) {
            this.A09 = true;
            this.A0B.schedule(new C72226Oyu(2, this, list), 301436582, 2, false, false);
        }
    }

    public static final void A00(C72921PPf pPf) {
        C337237fw r0 = pPf.A0A;
        if (r0 != null) {
            r0.Dam(pPf);
        }
    }

    public final String Amq() {
        return this.A0M;
    }

    public final /* bridge */ /* synthetic */ Object B3J() {
        return this.A07;
    }

    public final boolean BBY() {
        return this.A0P;
    }

    public final String BiY() {
        return this.A06;
    }

    public final String BjE() {
        return this.A0N;
    }

    public final Integer BlQ() {
        return this.A0L;
    }

    public final String BnF() {
        String BnF;
        String str = this.A06;
        if (str != null && str.length() != 0 && (BnF = this.A0F.BnF()) != null) {
            return BnF;
        }
        OWV owv = this.A0C;
        if (str == null || str.length() == 0) {
            return owv.A06;
        }
        return owv.A07;
    }

    public final Object Bo1() {
        return this.A05;
    }

    public final List Bqo() {
        return this.A0O;
    }

    public final boolean CT5() {
        C336267eL r0;
        C336267eL r6 = this.A0F;
        if (r6.CT5()) {
            this.A0C.A02(2, 2, 0);
            OKM okm = this.A00;
            if (okm != null) {
                okm.A00(true, 0);
            }
        }
        if (r6.CT5() || ((r0 = this.A0E) != null && r0.CT5())) {
            return true;
        }
        return false;
    }

    public final boolean CWX() {
        C336267eL r2 = this.A0F;
        String BiY = r2.BiY();
        if (BiY == null || BiY.length() == 0) {
            return true;
        }
        return r2.CWX();
    }

    public final boolean CYL() {
        return this.A09;
    }

    public final void EJE() {
        this.A0F.EJE();
        C336267eL r0 = this.A0E;
        if (r0 != null) {
            r0.EJE();
        }
    }

    public final void EcJ(C337237fw r2) {
        if (this.A0A != r2) {
            this.A0A = r2;
        }
    }

    public final void EhX(String str) {
        ArrayList A1C;
        this.A06 = str;
        OWV owv = this.A0C;
        this.A05 = AnonymousClass7TE.A1C();
        this.A08 = true;
        C72919PPd pPd = this.A02;
        if (pPd != null) {
            pPd.A01 = AnonymousClass7TE.A1C();
            C337237fw r0 = pPd.A00;
            if (r0 != null) {
                r0.Dam(pPd);
            }
        }
        C65615Lwq lwq = this.A01;
        if (lwq != null) {
            lwq.A01 = 0sn.A00;
            C337237fw r02 = lwq.A00;
            if (r02 != null) {
                r02.Dam(lwq);
            }
        }
        String str2 = this.A06;
        if (str2 == null || str2.length() == 0) {
            C65616Lwr lwr = this.A03;
            if (lwr != null) {
                lwr.EhX(str);
                this.A0F.EhX(str);
                lwr.EcJ(this);
            } else if (this.A0G) {
                this.A08 = true;
                this.A0B.schedule(new C72222Oyq(this, str), 301436582, 2, false, false);
                return;
            } else {
                if (!owv.A09) {
                    C290645fe r03 = owv.A03;
                    if (r03 == null) {
                        A1C = AnonymousClass7TE.A1C();
                        this.A05 = A1C;
                        HashMap hashMap = this.A07;
                        owv.A03(hashMap);
                        this.A07 = hashMap;
                        Object obj = this.A05;
                        0qQ.A0C(obj, AnonymousClass000.A00(12));
                        owv.A02(1, 0, (long) DbS.A05(obj));
                        this.A0F.EhX(str);
                    } else {
                        OWV.A00(r03, owv);
                    }
                }
                A1C = AnonymousClass7TE.A1C();
                List list = owv.A08;
                if (list != null) {
                    A1C.addAll(list);
                }
                this.A05 = A1C;
                HashMap hashMap2 = this.A07;
                owv.A03(hashMap2);
                this.A07 = hashMap2;
                Object obj2 = this.A05;
                0qQ.A0C(obj2, AnonymousClass000.A00(12));
                owv.A02(1, 0, (long) DbS.A05(obj2));
                this.A0F.EhX(str);
            }
            this.A08 = false;
            A00(this);
            return;
        }
        this.A0B.schedule(new C72224Oys(this, str));
    }

    public final boolean isLoading() {
        C336267eL r0;
        if (this.A08 || this.A0F.isLoading() || ((r0 = this.A0E) != null && r0.isLoading())) {
            return true;
        }
        return false;
    }

    public C72921PPf(UserSession userSession, AnonymousClass4D6 r5, OWV owv, L1T l1t, O8H o8h, C63856L9l l9l, C336267eL r10, C336267eL r11, C336267eL r12, boolean z) {
        this.A0H = userSession;
        this.A0B = r5;
        this.A0F = r10;
        this.A0E = r11;
        this.A0D = r12;
        this.A0C = owv;
        this.A0K = l9l;
        this.A0J = o8h;
        this.A0I = l1t;
        this.A0G = z;
        this.A0N = r10.BjE();
        this.A0M = owv.A05;
        this.A0O = r10.Bqo();
        this.A0P = r10.BBY();
        this.A06 = r10.BiY();
        this.A0L = r10.BlQ();
        if (l9l != null) {
            this.A03 = new C65616Lwr(l9l, new OAG(this));
        }
        if (o8h != null) {
            this.A02 = new C72919PPd(userSession, o8h);
        }
        if (l1t != null) {
            this.A01 = new C65615Lwq(l1t);
        }
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36320416708632973L)) {
            this.A00 = C69969Nv9.A00(userSession);
        }
    }
}
