package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.List;
import java.util.Map;

public final class U9R extends C252303ot {
    public final int A00;

    public U9R(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        String str;
        List list;
        switch (this.A00) {
            case 0:
                C61060Jvy jvy = (C61060Jvy) obj;
                C61060Jvy jvy2 = (C61060Jvy) obj2;
                AnonymousClass7TG.A1N(jvy, jvy2);
                if (jvy.A03 == jvy2.A03 && jvy.A04 == jvy2.A04) {
                    return true;
                }
                return false;
            case 1:
                C15045UKy uKy = (C15045UKy) obj;
                C15045UKy uKy2 = (C15045UKy) obj2;
                AnonymousClass7TG.A1N(uKy, uKy2);
                C16527UwW uwW = uKy.A03;
                C16527UwW uwW2 = C16527UwW.LOADING;
                if (uwW == uwW2 || uKy2.A03 == uwW2 || !0qQ.A0K(uKy.A09, uKy2.A09)) {
                    return false;
                }
                int i = 0;
                for (Object next : uKy.A08) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) next;
                    String str2 = leadGenFormBaseQuestion.A00;
                    List list2 = uKy2.A08;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = (LeadGenFormBaseQuestion) 00k.A0O(list2, i);
                    Map map = null;
                    if (leadGenFormBaseQuestion2 != null) {
                        str = leadGenFormBaseQuestion2.A00;
                    } else {
                        str = null;
                    }
                    if (!0qQ.A0K(str2, str)) {
                        return false;
                    }
                    List list3 = leadGenFormBaseQuestion.A0D;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion3 = (LeadGenFormBaseQuestion) 00k.A0O(list2, i);
                    if (leadGenFormBaseQuestion3 != null) {
                        list = leadGenFormBaseQuestion3.A0D;
                    } else {
                        list = null;
                    }
                    if (!0qQ.A0K(list3, list)) {
                        return false;
                    }
                    Map map2 = leadGenFormBaseQuestion.A0G;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion4 = (LeadGenFormBaseQuestion) 00k.A0O(list2, i);
                    if (leadGenFormBaseQuestion4 != null) {
                        map = leadGenFormBaseQuestion4.A0G;
                    }
                    if (!0qQ.A0K(map2, map)) {
                        return false;
                    }
                    i = i2;
                }
                return true;
            default:
                AnonymousClass7TG.A1N(obj, obj2);
                return obj.equals(obj2);
        }
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        C16527UwW uwW;
        String str;
        switch (this.A00) {
            case 0:
                C61060Jvy jvy = (C61060Jvy) obj;
                C61060Jvy jvy2 = (C61060Jvy) obj2;
                AnonymousClass7TG.A1N(jvy, jvy2);
                if (((X4H) jvy.A01).CAZ() == ((X4H) jvy2.A01).CAZ()) {
                    return true;
                }
                return false;
            case 1:
                C15045UKy uKy = (C15045UKy) obj;
                C15045UKy uKy2 = (C15045UKy) obj2;
                AnonymousClass7TG.A1N(uKy, uKy2);
                C16527UwW uwW2 = uKy2.A03;
                C16527UwW uwW3 = C16527UwW.LOADING;
                if (uwW2 == uwW3 || (uwW = uKy.A03) == uwW3) {
                    return true;
                }
                if (uwW != uwW2) {
                    return false;
                }
                List list = uKy.A08;
                int size = list.size();
                List list2 = uKy2.A08;
                if (size != list2.size()) {
                    return false;
                }
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String str2 = ((LeadGenFormBaseQuestion) next).A09;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) 00k.A0O(list2, i);
                    if (leadGenFormBaseQuestion != null) {
                        str = leadGenFormBaseQuestion.A09;
                    } else {
                        str = null;
                    }
                    if (!0qQ.A0K(str2, str)) {
                        return false;
                    }
                    i = i2;
                }
                return true;
            default:
                C267324bN r7 = (C267324bN) obj;
                C267324bN r8 = (C267324bN) obj2;
                AnonymousClass7TG.A1N(r7, r8);
                return 0qQ.A0K(r7.getId(), r8.getId());
        }
    }
}
