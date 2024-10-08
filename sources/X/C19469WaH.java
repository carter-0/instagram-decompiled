package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.WaH  reason: case insensitive filesystem */
public final class C19469WaH implements C2802350v {
    public UOB A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public final int A00() {
        return AnonymousClass7TG.A0A(this.A00.A09);
    }

    public final int A01() {
        return AnonymousClass7TG.A0A(this.A00.A0B);
    }

    public final String A02() {
        String str = this.A00.A0K;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String A03(Context context, UserSession userSession) {
        Resources resources;
        int i;
        StoryJoinChatStatus storyJoinChatStatus = this.A00.A02;
        if (storyJoinChatStatus == null) {
            storyJoinChatStatus = StoryJoinChatStatus.DEFAULT;
        }
        switch (storyJoinChatStatus.ordinal()) {
            case 0:
                return "";
            case 1:
                resources = context.getResources();
                i = 2131955068;
                break;
            case 2:
                resources = context.getResources();
                i = 2131955069;
                break;
            case 3:
                resources = context.getResources();
                i = C17030VFe.A00(userSession);
                break;
            case 4:
                resources = context.getResources();
                i = 2131955076;
                break;
            case 5:
                resources = context.getResources();
                i = 2131955078;
                break;
            default:
                throw new RuntimeException();
        }
        return AnonymousClass7TF.A0d(resources, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A04(android.content.Context r9, com.instagram.common.session.UserSession r10) {
        /*
            r8 = this;
            X.UOB r0 = r8.A00
            java.lang.Boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0060
            boolean r0 = r8.A09()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0042
            int r0 = r8.A01()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r8.A02()
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x0037
            r1 = 2131964523(0x7f13326b, float:1.956583E38)
            int r0 = r8.A01()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
        L_0x002f:
            java.lang.String r3 = r9.getString(r1, r0)
            X.0qQ.A07(r3)
        L_0x0036:
            return r3
        L_0x0037:
            r2 = 2131974609(0x7f1359d1, float:1.9586287E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = X.C375479Ds.A00(r10)
            goto L_0x0141
        L_0x0042:
            boolean r0 = r8.A08()
            if (r0 != 0) goto L_0x014c
            boolean r0 = r8.A07()
            if (r0 == 0) goto L_0x0136
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r9)
            int r0 = r8.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = X.C66637Ma6.A01(r1, r0, r3)
            goto L_0x0164
        L_0x0060:
            boolean r0 = r8.A09()
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x00b3
            int r2 = r8.A01()
            int r2 = r2 - r7
            if (r2 < r3) goto L_0x00a6
            if (r2 == 0) goto L_0x00a6
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131820739(0x7f1100c3, float:1.9274201E38)
            java.lang.String r3 = X.DbY.A0d(r1, r2, r0)
            X.0qQ.A07(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314631388596972(0x8103f700110aec, double:3.028857345207753E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0036
            X.UOB r0 = r8.A00
            java.lang.Integer r2 = r0.A08
            if (r2 == 0) goto L_0x0036
            int r0 = r2.intValue()
            if (r0 <= 0) goto L_0x0036
            java.lang.String r1 = " • "
            r0 = 2131955065(0x7f130d79, float:1.9546647E38)
            java.lang.String r0 = X.DbW.A0h(r9, r2, r0)
            java.lang.String r3 = X.002.A0g(r3, r1, r0)
            return r3
        L_0x00a6:
            r1 = 2131974609(0x7f1359d1, float:1.9586287E38)
            int r0 = X.C375479Ds.A00(r10)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            goto L_0x002f
        L_0x00b3:
            boolean r0 = r8.A08()
            if (r0 != 0) goto L_0x014c
            boolean r0 = r8.A07()
            if (r0 == 0) goto L_0x011e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320472543404520(0x810947000621e8, double:3.032551315028489E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0154
            X.UOB r0 = r8.A00
            java.util.List r0 = r0.A0N
            if (r0 == 0) goto L_0x0154
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0154
            X.UOB r0 = r8.A00
            java.util.List r0 = r0.A0N
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = X.00k.A0O(r0, r3)
            X.UNT r0 = (X.UNT) r0
            if (r0 == 0) goto L_0x0154
            java.lang.String r6 = r0.A02
            if (r6 == 0) goto L_0x0154
            int r5 = r8.A01()
            int r5 = r5 - r7
            if (r5 <= 0) goto L_0x0112
            android.content.res.Resources r4 = r9.getResources()
            r3 = 2131820613(0x7f110045, float:1.9273946E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r9)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C253673rC.A04(r1, r2, r0, r7, r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            java.lang.String r3 = r4.getQuantityString(r3, r5, r0)
        L_0x010e:
            X.0qQ.A0A(r3)
            return r3
        L_0x0112:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131958716(0x7f131bbc, float:1.9554052E38)
            java.lang.String r3 = r1.getString(r0)
            goto L_0x010e
        L_0x011e:
            r2 = 2131955077(0x7f130d85, float:1.9546671E38)
            int r0 = r8.A01()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.UOB r0 = r8.A00
            java.lang.Integer r0 = r0.A0A
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r1, r0)
            goto L_0x0147
        L_0x0136:
            r2 = 2131964522(0x7f13326a, float:1.9565828E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r8.A01()
            int r0 = 250 - r0
        L_0x0141:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
        L_0x0147:
            java.lang.String r3 = r9.getString(r2, r1)
            goto L_0x010e
        L_0x014c:
            r0 = 2131955080(0x7f130d88, float:1.9546677E38)
            java.lang.String r3 = r9.getString(r0)
            goto L_0x010e
        L_0x0154:
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r9)
            int r0 = r8.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = X.C66637Ma6.A01(r1, r0, r7)
        L_0x0164:
            if (r3 != 0) goto L_0x0036
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131958716(0x7f131bbc, float:1.9554052E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19469WaH.A04(android.content.Context, com.instagram.common.session.UserSession):java.lang.String");
    }

    public final void A05(int i) {
        UOB uob = this.A00;
        0qQ.A0B(uob, 1);
        Integer num = uob.A08;
        AiAgentMetadataDict aiAgentMetadataDict = uob.A00;
        String str = uob.A0D;
        Integer num2 = uob.A09;
        ChatStickerChannelType chatStickerChannelType = uob.A03;
        Integer num3 = uob.A0A;
        String str2 = uob.A0E;
        Long l = uob.A0C;
        String str3 = uob.A0F;
        String str4 = uob.A0G;
        Boolean bool = uob.A06;
        Boolean bool2 = uob.A07;
        String str5 = uob.A0H;
        StoryJoinChatStatus storyJoinChatStatus = uob.A02;
        C21040XAt xAt = uob.A01;
        User user = uob.A05;
        String str6 = uob.A0I;
        List list = uob.A0N;
        ChatStickerStickerType chatStickerStickerType = uob.A04;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        Integer num4 = num2;
        Integer num5 = num3;
        Long l2 = l;
        String str7 = str2;
        AiAgentMetadataDict aiAgentMetadataDict2 = aiAgentMetadataDict;
        C21040XAt xAt2 = xAt;
        StoryJoinChatStatus storyJoinChatStatus2 = storyJoinChatStatus;
        ChatStickerChannelType chatStickerChannelType2 = chatStickerChannelType;
        ChatStickerStickerType chatStickerStickerType2 = chatStickerStickerType;
        User user2 = user;
        this.A00 = C17032VFg.A00(aiAgentMetadataDict2, xAt2, storyJoinChatStatus2, chatStickerChannelType2, chatStickerStickerType2, user2, bool3, bool4, num, num4, num5, Integer.valueOf(i), l2, str, str7, str3, str4, str5, str6, uob.A0J, uob.A0K, uob.A0L, uob.A0M, list);
    }

    public final void A06(StoryJoinChatStatus storyJoinChatStatus) {
        UOB uob = this.A00;
        0qQ.A0B(uob, 1);
        Integer num = uob.A08;
        AiAgentMetadataDict aiAgentMetadataDict = uob.A00;
        String str = uob.A0D;
        Integer num2 = uob.A09;
        ChatStickerChannelType chatStickerChannelType = uob.A03;
        Integer num3 = uob.A0A;
        String str2 = uob.A0E;
        Long l = uob.A0C;
        String str3 = uob.A0F;
        String str4 = uob.A0G;
        Boolean bool = uob.A06;
        Boolean bool2 = uob.A07;
        String str5 = uob.A0H;
        Integer num4 = uob.A0B;
        C21040XAt xAt = uob.A01;
        User user = uob.A05;
        String str6 = uob.A0I;
        List list = uob.A0N;
        ChatStickerStickerType chatStickerStickerType = uob.A04;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        Integer num5 = num3;
        Integer num6 = num4;
        Long l2 = l;
        String str7 = str2;
        AiAgentMetadataDict aiAgentMetadataDict2 = aiAgentMetadataDict;
        C21040XAt xAt2 = xAt;
        ChatStickerChannelType chatStickerChannelType2 = chatStickerChannelType;
        ChatStickerStickerType chatStickerStickerType2 = chatStickerStickerType;
        User user2 = user;
        this.A00 = C17032VFg.A00(aiAgentMetadataDict2, xAt2, storyJoinChatStatus, chatStickerChannelType2, chatStickerStickerType2, user2, bool3, bool4, num, num2, num5, num6, l2, str, str7, str3, str4, str5, str6, uob.A0J, uob.A0K, uob.A0L, uob.A0M, list);
    }

    public final boolean A07() {
        ChatStickerChannelType chatStickerChannelType = this.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.DISCOVERABLE;
        }
        return AnonymousClass7TF.A1W(chatStickerChannelType, ChatStickerChannelType.BROADCAST);
    }

    public final boolean A08() {
        ChatStickerChannelType chatStickerChannelType = this.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.DISCOVERABLE;
        }
        if (chatStickerChannelType == ChatStickerChannelType.BROADCAST && A00() == 2) {
            return true;
        }
        return false;
    }

    public final boolean A09() {
        ChatStickerChannelType chatStickerChannelType = this.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.DISCOVERABLE;
        }
        return AnonymousClass7TF.A1W(chatStickerChannelType, ChatStickerChannelType.SUBSCRIBER);
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final C273914nO BkW() {
        C317876nz r0;
        C273914nO A0C = AnonymousClass7TH.A0C();
        if (A09()) {
            r0 = C317876nz.A1T;
        } else {
            r0 = C317876nz.A11;
        }
        AnonymousClass7TG.A1J(r0, A0C);
        return A0C;
    }

    public final Integer CAk() {
        if (A09()) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0C;
    }
}
