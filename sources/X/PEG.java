package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final /* synthetic */ class PEG implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ PEG(AnonymousClass7Z6 r1, String str, String str2, boolean z, boolean z2) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A01;
        String str2 = this.A02;
        boolean z2 = this.A04;
        return new 1cE((N49) null, (C70766OKm) null, (C254933tI) null, (SendMentionData$MentionData) null, C66669Mac.A04(r0.A00, oDs, 1cX.class, str, (String) null, z), (OCA) null, (C69343Nji) null, directThreadKey, (2FW) null, (AnonymousClass3Q2) null, (Boolean) null, (Boolean) null, Boolean.valueOf(z2), (Integer) null, (Integer) null, (Integer) null, l, Long.valueOf(AnonymousClass7TG.A0H()), (Long) null, str2, NetInfoModule.CONNECTION_TYPE_NONE, (String) null, (String) null, (String) null, (List) null, (List) null, false);
    }
}
