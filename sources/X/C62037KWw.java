package X;

import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;
import com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.KWw  reason: case insensitive filesystem */
public final class C62037KWw extends C252733pa {
    public L26 A00;
    public final AnonymousClass4HW A01 = C335967dq.A00(C59822JZw.A00);
    public final UserSession A02;
    public final C64027LJo A03;
    public final ConcurrentLinkedQueue A04 = new ConcurrentLinkedQueue();
    public final Map A05 = AnonymousClass7TE.A1H();

    public final Object A01(MU9 mu9, Integer num, String str, String str2, AnonymousClass4D7 r14, boolean z) {
        A00(this, str, z);
        Object A002 = this.A01.A00(str, r14, new SavedAudioRepository$setIsAudioSaved$4(new KXL(num, str, str2, z), mu9, this, str, (AnonymousClass4D7) null, 200));
        1Hj r0 = 1Hj.A02;
        if (A002 != r0) {
            A002 = C60340gF.A00;
        }
        if (A002 != r0) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final Object A02(MU9 mu9, Integer num, String str, AnonymousClass4D7 r13, boolean z) {
        A00(this, str, z);
        Object A002 = this.A01.A00(str, r13, new SavedAudioRepository$setIsAudioSaved$4(new KXK(num, str, z), mu9, this, str, (AnonymousClass4D7) null, 200));
        1Hj r0 = 1Hj.A02;
        if (A002 != r0) {
            A002 = C60340gF.A00;
        }
        if (A002 != r0) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final 05F A03(String str, boolean z) {
        0qQ.A0B(str, 0);
        Map map = this.A05;
        Object obj = map.get(str);
        if (obj == null) {
            obj = JTQ.A0s(z);
            map.put(str, obj);
        }
        return 10b.A03((05G) obj);
    }

    public static final void A00(C62037KWw kWw, String str, boolean z) {
        Map map = kWw.A05;
        Object obj = map.get(str);
        if (obj == null) {
            obj = JTQ.A0s(z);
            map.put(str, obj);
        }
        AnonymousClass7TF.A1O((05G) obj, z);
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = kWw.A04;
            if (!DbT.A1b(concurrentLinkedQueue)) {
                break;
            }
            ((PagingSource) concurrentLinkedQueue.remove()).A03();
        }
        L26 l26 = kWw.A00;
        if (l26 != null) {
            l26.A00.A00 = true;
        }
    }

    public C62037KWw(UserSession userSession, C64027LJo lJo) {
        super("Reels", AnonymousClass43D.A00(1497095772));
        this.A02 = userSession;
        this.A03 = lJo;
    }

    public final void onUserSessionWillEnd(boolean z) {
        close();
        this.A05.clear();
    }
}
