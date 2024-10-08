package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.U8s  reason: case insensitive filesystem */
public final class C14782U8s extends 2YL {
    public boolean A00;
    public final int A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final UserSession A05;
    public final VOI A06;
    public final LeadGenFormData A07;
    public final String A08;
    public final List A09;
    public final C249513ju A0A;
    public final AnonymousClass0r6 A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final boolean A0E;
    public final 05G[] A0F;
    public final 05G[] A0G;
    public final AnonymousClass0r6 A0H;

    public C14782U8s(C319836rJ r12, UserSession userSession, WYZ wyz) {
        int size;
        LeadFormCustomQuestion leadFormCustomQuestion;
        this.A05 = userSession;
        this.A06 = new VOI(wyz);
        Object A002 = r12.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A07 = leadGenFormData;
            Number number = (Number) r12.A00("args_custom_question_index");
            if (number != null) {
                size = number.intValue();
            } else {
                size = leadGenFormData.A06.size();
            }
            this.A01 = size;
            int i = 0;
            this.A0E = AnonymousClass7TF.A1T(size, leadGenFormData.A06.size());
            this.A08 = C13989Tnp.A0s(leadGenFormData.A01);
            this.A00 = true;
            Integer num = AnonymousClass05K.A00;
            1HR A0f = C13990Tnq.A0f();
            this.A0A = A0f;
            this.A0B = 0u9.A04(A0f);
            C16534Uwe uwe = C16534Uwe.MULTIPLE_CHOICE;
            02z r0 = new 02z(uwe);
            this.A0D = r0;
            19B r8 = 19B.A00;
            this.A03 = C226292g8.A00(r8, r0);
            02z r2 = new 02z("");
            this.A0C = r2;
            MCA mca = new MCA(57, (Object) this, (Object) r2);
            this.A0H = mca;
            this.A04 = C226292g8.A00(r8, mca);
            05G[] r22 = new 05G[4];
            int i2 = 0;
            do {
                r22[i2] = new 02z("");
                i2++;
            } while (i2 < 4);
            this.A0F = r22;
            AnonymousClass0r6[] r4 = new 05G[4];
            int i3 = 0;
            do {
                r4[i3] = new 02z(new C61072JwA(21, num));
                i3++;
            } while (i3 < 4);
            this.A0G = r4;
            ArrayList arrayList = new ArrayList(4);
            int i4 = 0;
            do {
                arrayList.add(C226292g8.A00(r8, r4[i4]));
                i4++;
            } while (i4 < 4);
            this.A09 = arrayList;
            05G r7 = this.A0D;
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(this.A0H);
            0tw.A00(this.A0G, arrayList2);
            this.A02 = C226292g8.A00(r8, AnonymousClass10H.A03(new C66193MHj((Object) this, (AnonymousClass4D7) null, 29, 42), r7, new C51623FxC((AnonymousClass0r6[]) arrayList2.toArray(new AnonymousClass0r6[arrayList2.size()]), 8)));
            this.A0D.Epw(!C13991Tnr.A1X(r12, "args_is_multiple_choice") ? C16534Uwe.SHORT_ANSWER : uwe);
            05G[] r1 = this.A0F;
            AnonymousClass11O.A03(C318116oQ.A00(this), new C58028IkL(8, this, Arrays.copyOf(r1, r1.length)));
            if (this.A0E && (leadFormCustomQuestion = (LeadFormCustomQuestion) 00k.A0O(this.A07.A06, this.A01)) != null) {
                this.A0C.Epw(leadFormCustomQuestion.A01);
                for (Object next : leadFormCustomQuestion.A02) {
                    int i5 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    05G[] r13 = this.A0F;
                    if (i < r13.length) {
                        r13[i].Epw(next);
                    }
                    i = i5;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final List A00(C14782U8s u8s) {
        ArrayList arrayList = new ArrayList(r3);
        for (05G value : u8s.A0F) {
            arrayList.add(value.getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            DbV.A1U(next, arrayList2, 00l.A0W((String) next) ? 1 : 0);
        }
        return arrayList2;
    }

    public final void A01() {
        C16534Uwe uwe;
        String str;
        if (DbX.A1a(this.A02.A02())) {
            String str2 = (String) this.A0C.getValue();
            05G r5 = this.A0D;
            Object value = r5.getValue();
            C16534Uwe uwe2 = C16534Uwe.MULTIPLE_CHOICE;
            if (value == uwe2) {
                uwe = uwe2;
            } else {
                uwe = C16534Uwe.SHORT_ANSWER;
            }
            LeadFormCustomQuestion leadFormCustomQuestion = new LeadFormCustomQuestion(uwe, str2, A00(this));
            boolean z = this.A0E;
            ArrayList arrayList = this.A07.A06;
            if (z) {
                arrayList.set(this.A01, leadFormCustomQuestion);
            } else {
                arrayList.add(leadFormCustomQuestion);
            }
            this.A00 = false;
            Object value2 = r5.getValue();
            VOI voi = this.A06;
            String str3 = this.A08;
            0qQ.A0B(str3, 0);
            XB6 xb6 = voi.A00;
            if (value2 == uwe2) {
                str = "custom_multiple_choice_question_done";
            } else {
                str = "custom_short_answer_question_done";
            }
            xb6.Cgq((Bundle) null, str3, "lead_gen_custom_question", str, "click");
            C13991Tnr.A1L(this, C318116oQ.A00(this), 38);
        }
    }
}
