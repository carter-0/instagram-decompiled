package X;

import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9m3  reason: invalid class name and case insensitive filesystem */
public final class C387339m3 extends AnonymousClass6MU {
    public StoryGroupMentionTappableData A00;
    public Integer A01;
    public String A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final List A06;

    public C387339m3(StoryGroupMentionTappableData storyGroupMentionTappableData) {
        Integer num;
        0qQ.A0B(storyGroupMentionTappableData, 1);
        this.A00 = storyGroupMentionTappableData;
        this.A04 = storyGroupMentionTappableData.A02;
        Integer num2 = storyGroupMentionTappableData.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue == 1) {
                num = AnonymousClass05K.A01;
            } else if (intValue == 2) {
                num = AnonymousClass05K.A0C;
            } else if (intValue == 3) {
                num = AnonymousClass05K.A0N;
            }
            this.A01 = num;
            this.A03 = num2;
            this.A05 = storyGroupMentionTappableData.A04;
            this.A06 = AnonymousClass7TE.A1C();
        }
        num = AnonymousClass05K.A00;
        this.A01 = num;
        this.A03 = num2;
        this.A05 = storyGroupMentionTappableData.A04;
        this.A06 = AnonymousClass7TE.A1C();
    }

    public final void A02(Integer num) {
        int i;
        0qQ.A0B(num, 0);
        this.A01 = num;
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        0qQ.A0B(storyGroupMentionTappableData, 1);
        String str = storyGroupMentionTappableData.A02;
        List list = storyGroupMentionTappableData.A04;
        String str2 = storyGroupMentionTappableData.A03;
        switch (num.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        new 1E9(new 1hu((UserSession) null), 6, false);
        this.A00 = new StoryGroupMentionTappableData(valueOf, (String) null, str, str2, list);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.groupmention.model.GroupMentionStickerModel");
        C387339m3 r4 = (C387339m3) obj;
        return 0qQ.A0K(this.A04, r4.A04) && 0qQ.A0K(this.A00.A03, r4.A00.A03) && 0qQ.A0K(this.A03, r4.A03) && 0qQ.A0K(this.A00.A01, r4.A00.A01) && 0qQ.A0K(this.A05, r4.A05) && 0qQ.A0K(this.A06, r4.A06);
    }

    public final StoryGroupMentionTappableData A00() {
        List list = this.A06;
        boolean isEmpty = list.isEmpty();
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        if (isEmpty) {
            return storyGroupMentionTappableData;
        }
        0qQ.A0B(storyGroupMentionTappableData, 1);
        String str = storyGroupMentionTappableData.A01;
        String str2 = storyGroupMentionTappableData.A02;
        Integer num = storyGroupMentionTappableData.A00;
        String str3 = storyGroupMentionTappableData.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(this.A05);
        A1C.addAll(list);
        new 1E9(new 1hu((UserSession) null), 6, false);
        return new StoryGroupMentionTappableData(num, str, str2, str3, A1C);
    }

    public final void A03(String str) {
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        0qQ.A0B(storyGroupMentionTappableData, 1);
        String str2 = storyGroupMentionTappableData.A02;
        List list = storyGroupMentionTappableData.A04;
        Integer num = storyGroupMentionTappableData.A00;
        String str3 = storyGroupMentionTappableData.A03;
        AnonymousClass7TH.A0K();
        this.A00 = new StoryGroupMentionTappableData(num, str, str2, str3, list);
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0s;
    }

    public final int hashCode() {
        int i;
        int A0O = AnonymousClass7TE.A0O(this.A04);
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A00;
        String str = storyGroupMentionTappableData.A03;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int A0A = (((A0O + i) * 31) + AnonymousClass7TG.A0A(this.A03)) * 31;
        String str2 = storyGroupMentionTappableData.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A05, (A0A + i2) * 31));
    }

    public final C387339m3 A01() {
        StoryGroupMentionTappableData A002 = A00();
        0qQ.A0B(A002, 1);
        String str = A002.A01;
        String str2 = A002.A02;
        List list = A002.A04;
        Integer num = A002.A00;
        String str3 = A002.A03;
        AnonymousClass7TH.A0K();
        return new C387339m3(new StoryGroupMentionTappableData(num, str, str2, str3, list));
    }

    public final C273914nO BkW() {
        List A012;
        C273914nO A0C = AnonymousClass7TH.A0C();
        String str = this.A04;
        if (str.length() > 0) {
            A012 = AnonymousClass7TE.A1I(str);
        } else {
            A012 = C317876nz.A0s.A01();
        }
        A0C.A06 = A012;
        return A0C;
    }
}
