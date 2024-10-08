package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.PmY  reason: case insensitive filesystem */
public final class C73954PmY extends 0Yg implements 0sP {
    public final /* synthetic */ OKR A00;
    public final /* synthetic */ ClipInfo A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73954PmY(OKR okr, ClipInfo clipInfo, Long l, String str, String str2) {
        super(1);
        this.A01 = clipInfo;
        this.A00 = okr;
        this.A02 = l;
        this.A04 = str;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null) {
            Object A13 = AnonymousClass7TE.A13(list);
            0qQ.A0C(A13, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadId");
            MsysThreadId msysThreadId = (MsysThreadId) A13;
            String A0t = DbU.A0t(list, 1);
            if (A0t != null) {
                String A0t2 = DbU.A0t(list, 2);
                if (A0t2 != null) {
                    ClipInfo clipInfo = this.A01;
                    String str = clipInfo.A0F;
                    if (str != null) {
                        OUC ouc = C70947OSu.A01;
                        UserSession userSession = this.A00.A00;
                        long j = msysThreadId.A00;
                        Integer valueOf = Integer.valueOf(clipInfo.A06);
                        Integer valueOf2 = Integer.valueOf(clipInfo.A09);
                        String name = AnonymousClass7TE.A0t(str).getName();
                        0qQ.A07(name);
                        long A002 = clipInfo.A00();
                        int i = clipInfo.A05 - clipInfo.A07;
                        return C303606Aa.A00(ouc.A01(userSession, valueOf, valueOf2, valueOf, valueOf2, (Integer) null, this.A02, AnonymousClass4KK.A01(msysThreadId), "video/mp4", "image/jpeg", name, A0t, A0t2, this.A04, (String) null, this.A03, 4, i, j, A002, false));
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Failed to resolve video ID");
            }
            throw AnonymousClass7TE.A0z("Failed to resolve preview ID");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
