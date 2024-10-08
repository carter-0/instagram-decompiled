package X;

import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U8i  reason: case insensitive filesystem */
public abstract class C14772U8i extends 2YL {
    public boolean A00 = true;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final VOI A04;
    public final List A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G[] A0A;
    public final 05G[] A0B;
    public final AnonymousClass0r6 A0C;

    public C14772U8i(C319836rJ r12, VOI voi) {
        this.A04 = voi;
        Integer num = AnonymousClass05K.A00;
        1HR A0f = C13990Tnq.A0f();
        this.A06 = A0f;
        this.A07 = 0u9.A04(A0f);
        C16534Uwe uwe = C16534Uwe.MULTIPLE_CHOICE;
        02z r0 = new 02z(uwe);
        this.A09 = r0;
        19B r6 = 19B.A00;
        this.A02 = C226292g8.A00(r6, r0);
        02z r2 = new 02z("");
        this.A08 = r2;
        MCA mca = new MCA(56, (Object) this, (Object) r2);
        this.A0C = mca;
        this.A03 = C226292g8.A00(r6, mca);
        05G[] r22 = new 05G[4];
        boolean z = false;
        int i = 0;
        do {
            r22[i] = new 02z("");
            i++;
        } while (i < 4);
        this.A0A = r22;
        AnonymousClass0r6[] r5 = new 05G[4];
        int i2 = 0;
        do {
            r5[i2] = new 02z(new C61072JwA(20, num));
            i2++;
        } while (i2 < 4);
        this.A0B = r5;
        ArrayList arrayList = new ArrayList(4);
        int i3 = 0;
        do {
            arrayList.add(C226292g8.A00(r6, r5[i3]));
            i3++;
        } while (i3 < 4);
        this.A05 = arrayList;
        05G r52 = this.A09;
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add(this.A0C);
        0tw.A00(this.A0B, arrayList2);
        this.A01 = C226292g8.A00(r6, AnonymousClass10H.A03(new C66193MHj((Object) this, (AnonymousClass4D7) null, 28, 42), r52, new MC9(arrayList2.toArray(new AnonymousClass0r6[arrayList2.size()]), 51)));
        Boolean bool = (Boolean) r12.A00("args_is_multiple_choice");
        this.A09.Epw(!(bool != null ? bool.booleanValue() : z) ? C16534Uwe.SHORT_ANSWER : uwe);
        05G[] r1 = this.A0A;
        AnonymousClass11O.A03(C318116oQ.A00(this), new MCA(55, (Object) this, (Object) Arrays.copyOf(r1, r1.length)));
    }

    public final String A00() {
        if (this instanceof C16049Unc) {
            return ((C16049Unc) this).A03;
        }
        return ((C16050Und) this).A03;
    }

    public final List A01() {
        ArrayList arrayList = new ArrayList(r3);
        for (05G value : this.A0A) {
            arrayList.add(value.getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            DbV.A1U(next, arrayList2, 00l.A0W((String) next) ? 1 : 0);
        }
        return arrayList2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.Und} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.Unc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.Und} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Und} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.Und} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.Und} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C16049Unc
            if (r0 == 0) goto L_0x0070
            r3 = r10
            X.Unc r3 = (X.C16049Unc) r3
            X.2Fk r0 = r3.A01
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0065
            X.05G r0 = r3.A08
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            X.05G r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.Uwe r5 = X.C16534Uwe.MULTIPLE_CHOICE
            if (r0 != r5) goto L_0x006d
            r1 = r5
        L_0x0026:
            java.util.List r0 = r3.A01()
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion r4 = new com.instagram.leadgen.organic.model.LeadFormCustomQuestion
            r4.<init>(r1, r2, r0)
            boolean r2 = r3.A04
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = r3.A02
            java.util.ArrayList r1 = r0.A06
            if (r2 == 0) goto L_0x0069
            int r0 = r3.A00
            r1.set(r0, r4)
        L_0x003c:
            r2 = 0
            r3.A00 = r2
            X.05G r0 = r3.A09
            java.lang.Object r1 = r0.getValue()
            X.VOI r0 = r3.A04
            java.lang.String r6 = r3.A00()
            X.0qQ.A0B(r6, r2)
            X.XB6 r4 = r0.A00
            java.lang.String r7 = "lead_gen_custom_question"
            if (r1 != r5) goto L_0x0066
            java.lang.String r8 = "custom_multiple_choice_question_done"
        L_0x0056:
            java.lang.String r9 = "click"
            r5 = 0
            r4.Cgq(r5, r6, r7, r8, r9)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 27
            X.C13991Tnr.A1L(r3, r1, r0)
        L_0x0065:
            return
        L_0x0066:
            java.lang.String r8 = "custom_short_answer_question_done"
            goto L_0x0056
        L_0x0069:
            r1.add(r4)
            goto L_0x003c
        L_0x006d:
            X.Uwe r1 = X.C16534Uwe.SHORT_ANSWER
            goto L_0x0026
        L_0x0070:
            r3 = r10
            X.Und r3 = (X.C16050Und) r3
            X.2Fk r0 = r3.A01
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0065
            X.05G r0 = r3.A08
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            com.instagram.leadgen.core.api.LeadGenInfoFieldTypes r2 = com.instagram.leadgen.core.api.LeadGenInfoFieldTypes.CUSTOM
            X.05G r0 = r3.A09
            java.lang.Object r1 = r0.getValue()
            X.Uwe r5 = X.C16534Uwe.MULTIPLE_CHOICE
            r0 = 0
            if (r1 != r5) goto L_0x0098
            java.util.List r0 = r3.A01()
        L_0x0098:
            X.GSY r4 = new X.GSY
            r4.<init>((com.instagram.leadgen.core.api.LeadGenInfoFieldTypes) r2, (java.lang.String) r6, (java.util.List) r0)
            boolean r2 = r3.A05
            com.instagram.business.promote.model.PromoteData r0 = r3.A01
            java.util.List r1 = r0.A1t
            if (r2 == 0) goto L_0x00ab
            int r0 = r3.A00
            r1.set(r0, r4)
            goto L_0x003c
        L_0x00ab:
            r1.add(r4)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14772U8i.A02():void");
    }

    public final boolean A03(String str) {
        if (this instanceof C16049Unc) {
            C16049Unc unc = (C16049Unc) this;
            Iterator it = unc.A02.A06.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) next;
                    if (i == unc.A00 || !str.equals(leadFormCustomQuestion.A01)) {
                        i = i2;
                    }
                } else {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            return false;
        }
        C16050Und und = (C16050Und) this;
        List list = und.A01.A1t;
        0qQ.A06(list);
        int i3 = 0;
        for (Object next2 : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                GSY gsy = (GSY) next2;
                if (i3 == und.A00 || !str.equals(gsy.A03)) {
                    i3 = i4;
                }
            } else {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return false;
        return true;
    }
}
