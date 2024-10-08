package X;

import com.instagram.friendmap.data.FriendMapRepository;
import java.util.List;

/* renamed from: X.P3t  reason: case insensitive filesystem */
public final class C72380P3t implements MSJ {
    public final /* synthetic */ N4t A00;
    public final /* synthetic */ C68078Mzj A01;

    public C72380P3t(N4t n4t, C68078Mzj mzj) {
        this.A01 = mzj;
        this.A00 = n4t;
    }

    public final void FHK() {
        List list;
        AnonymousClass913 r0;
        C279864zZ BWY;
        String str;
        Long A10;
        C68078Mzj mzj = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        PGT pgt = mzj.A0B;
        AnonymousClass4AB r6 = this.A00.A05;
        C69028NdD A012 = C68462NJa.A01(pgt.A00);
        C319736r8 r3 = C319736r8.FRIEND_MAP;
        if (r6 != null && (list = r6.A0J) != null && (r0 = (AnonymousClass913) 00k.A0J(list)) != null && (BWY = r0.BWY()) != null && (str = BWY.A0H) != null && (A10 = AnonymousClass7TE.A10(str)) != null) {
            long longValue = A10.longValue();
            FriendMapRepository friendMapRepository = A012.A05;
            if (!friendMapRepository.A0B(longValue)) {
                C3018760k A013 = C3018660j.A01(A012.A02);
                A013.A0J(r3, r6);
                A013.A0E(C69506Nmo.A0O, (GT1) null, HOK.REPLY_SHEET, (Boolean) null, AnonymousClass7TE.A0v(), (Long) null, "❤️", (String) null);
                friendMapRepository.A06(longValue);
                return;
            }
            friendMapRepository.A08.A0E(longValue, (String) null);
            FriendMapRepository.A03(friendMapRepository, longValue, false);
        }
    }
}
