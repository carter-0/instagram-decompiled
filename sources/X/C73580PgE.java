package X;

import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.PgE  reason: case insensitive filesystem */
public final class C73580PgE extends 0Yk implements 0sI {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73580PgE(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.Mu6> r3 = X.C67752Mu6.class
            r1 = 5
            java.lang.String r4 = "createEmojiUiState"
            java.lang.String r5 = "createEmojiUiState(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)Lcom/instagram/direct/reactions/customize/viewmodel/DirectReactionsPickerViewModel$EmojisUiState;"
        L_0x000c:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel> r3 = com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.class
            r1 = 5
            java.lang.String r4 = "calculateViewState"
            java.lang.String r5 = "calculateViewState(Lcom/instagram/direct/fragment/channels/discovery/base/ChannelDiscoveryViewModel$FetchStatus;Lcom/instagram/direct/fragment/channels/discovery/model/SearchSurface;Ljava/util/List;Ljava/util/List;)Lcom/instagram/direct/fragment/channels/discovery/base/ChannelDiscoveryViewModel$ViewState;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73580PgE.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        Object obj6 = obj4;
        Object obj7 = obj3;
        Object obj8 = obj2;
        Object obj9 = obj;
        if (this.A00 != 0) {
            return new C68270N8h((List) obj6, (Set) obj9, (Set) obj8, (Set) obj7);
        }
        C62510Kh0 kh0 = (C62510Kh0) obj9;
        C69374NkE nkE = (C69374NkE) obj8;
        List list = (List) obj7;
        Collection collection = (Collection) obj6;
        ChannelDirectoryInboxViewModel channelDirectoryInboxViewModel = (ChannelDirectoryInboxViewModel) this.receiver;
        ArrayList A1M = 0sr.A1M(new C232262tL[]{new C71956Oth(nkE)});
        if (channelDirectoryInboxViewModel.A01 && nkE == C69374NkE.A06 && AnonymousClass7TE.A1b(list)) {
            int A04 = DbS.A04(0Tu.A05, channelDirectoryInboxViewModel.A04, 36599409195945475L);
            boolean A1R = AnonymousClass7TF.A1R(A04);
            Integer num = AnonymousClass05K.A01;
            if (!A1R || list.size() > A04) {
                i = 2131959523;
            } else {
                i = null;
            }
            A1M.add(new C67119Mid(num, i, "channel_directory_invites_header", 2131959455, false, C51969G9p.A1a(channelDirectoryInboxViewModel.A05, C69263NiP.ACTIVITY_FEED)));
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                DbV.A1U(next, A1C, channelDirectoryInboxViewModel.A06.contains(((N64) next).A07) ? 1 : 0);
            }
            List list2 = A1C;
            if (A1R) {
                list2 = 00k.A0d(A1C, A04);
            }
            A1M.addAll(list2);
            if (channelDirectoryInboxViewModel.A02) {
                A1M.add(new C67119Mid(AnonymousClass05K.A00, (Integer) null, "channel_directory_suggestions_header", 2131959564, true, true));
            }
        }
        A1M.addAll(collection);
        return new OBR(kh0, A1M);
    }
}
