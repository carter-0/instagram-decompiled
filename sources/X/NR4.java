package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

public final class NR4 extends AnonymousClass4HF {
    public ReboundViewPager A00;
    public C67686MsO A01;
    public String A02;
    public boolean A03;

    public final void DVx(int i, int i2) {
        C67686MsO msO;
        String str;
        String A12;
        if (!this.A03) {
            C67686MsO msO2 = this.A01;
            if (msO2 != null) {
                if (i == 0) {
                    C70752OJy oJy = msO2.A00;
                    if (oJy != null) {
                        C68462NJa.A01(oJy.A00).A0c(false, (String) null);
                    }
                } else if (i <= 5) {
                    List list = msO2.A03;
                    String A1G = C51966G9m.A1G(list, i);
                    String str2 = "";
                    if (A1G == null || (str = DbV.A12(A1G)) == null) {
                        str = str2;
                    }
                    msO2.A02.A0E(str, 0sr.A1P(new String[]{"📍", "👀", "🔥", "🎉", "😴"}).contains(str), false);
                    C70752OJy oJy2 = msO2.A00;
                    if (oJy2 != null) {
                        String A1G2 = C51966G9m.A1G(list, i);
                        if (!(A1G2 == null || (A12 = DbV.A12(A1G2)) == null)) {
                            str2 = A12;
                        }
                        oJy2.A00(i, str2);
                    }
                } else {
                    C70752OJy oJy3 = msO2.A00;
                    if (oJy3 != null) {
                        C68462NJa nJa = oJy3.A00;
                        C68462NJa.A01(nJa).A0Z(AnonymousClass7TF.A0d(DbV.A05(nJa), 2131971063));
                    }
                }
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (i == 0) {
            String str3 = this.A02;
            if (!(str3 == null || (msO = this.A01) == null)) {
                List list2 = msO.A03;
                if (list2.contains(str3)) {
                    list2.remove(str3);
                    list2.add(1, str3);
                    1Av A002 = 1Au.A00(msO.A01);
                    List subList = list2.subList(1, 6);
                    0qQ.A0B(subList, 0);
                    1Av.A06(A002, "friend_map_recent_emoji_list", subList);
                } else {
                    list2.clear();
                    list2.add(str3);
                    UserSession userSession = msO.A01;
                    List A04 = 1Av.A04(1Au.A00(userSession), "friend_map_recent_emoji_list");
                    if (A04.isEmpty()) {
                        A04 = AnonymousClass7TE.A1C();
                    }
                    int i3 = 0;
                    do {
                        Object A0O = 00k.A0O(A04, i3);
                        if (A0O == null) {
                            A0O = " ";
                        }
                        list2.add(A0O);
                        i3++;
                    } while (i3 < 4);
                    1Av.A06(1Au.A00(userSession), "friend_map_recent_emoji_list", list2);
                    list2.add(0, "placeHolderCreateNote");
                    list2.add("placeHolderCustomEmoji");
                }
                0fE.A00(msO, -1825443904);
            }
            this.A02 = null;
            this.A03 = false;
        }
        ReboundViewPager reboundViewPager = this.A00;
        if (reboundViewPager != null) {
            reboundViewPager.performHapticFeedback(1);
        }
    }
}
