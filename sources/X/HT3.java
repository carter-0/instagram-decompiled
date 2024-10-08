package X;

import com.instagram.api.schemas.IGAIAgentType;

public abstract class HT3 {
    public static final void A00(C286575Wy r16, LRW lrw, IGAIAgentType iGAIAgentType, C62625Kiw kiw, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4) {
        int i5 = i;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        Integer num2 = num;
        String str10 = str6;
        C62625Kiw kiw2 = kiw;
        String str11 = str5;
        LRW lrw2 = lrw;
        DbW.A1O(lrw2, 0, str11);
        C286575Wy r3 = r16;
        r3.ExV(-1194604412);
        int i6 = i4;
        if ((i4 & 2) != 0) {
            i5 = 0;
        }
        if ((i4 & 4) != 0) {
            str7 = null;
        }
        if ((i4 & 8) != 0) {
            str8 = null;
        }
        if ((i4 & 16) != 0) {
            str9 = null;
        }
        if ((i6 & 128) != 0) {
            num2 = null;
        }
        if ((i6 & 512) != 0) {
            str10 = null;
        }
        if ((i6 & 1024) != 0) {
            kiw2 = null;
        }
        if (0fL.A02()) {
            0fL.A01(-1341672889, "com.instagram.aistudio.home.view.launchedeffect.AiHomeImpressionEvent (AiHomeImpressionEvent.kt:23)");
        }
        IGAIAgentType iGAIAgentType2 = iGAIAgentType;
        String str12 = str4;
        C286645Xf.A04(r3, C60340gF.A00, new C66158MFv(lrw2, iGAIAgentType2, kiw2, num2, str7, str8, str9, str12, str11, str10, (AnonymousClass4D7) null, i5));
        if (0fL.A02()) {
            0fL.A00(-1851094738);
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCR(lrw2, iGAIAgentType2, kiw2, num2, str7, str8, str9, str12, str11, str10, i5, i2, i3, i6);
        }
    }
}
