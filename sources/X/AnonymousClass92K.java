package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.92K  reason: invalid class name */
public final class AnonymousClass92K implements AnonymousClass92L {
    public final UserSession A00;
    public final AnonymousClass92I A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final /* synthetic */ MutedWordsFilterManager A03;

    public AnonymousClass92K(UserSession userSession, AnonymousClass92I r3, MutedWordsFilterManager mutedWordsFilterManager) {
        0qQ.A0B(userSession, 2);
        this.A03 = mutedWordsFilterManager;
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final void D8j(ContentFilterDictionaryImpl contentFilterDictionaryImpl) {
        0qQ.A0B(contentFilterDictionaryImpl, 0);
        this.A03.A0D.remove(contentFilterDictionaryImpl);
        A00();
    }

    public final void D8l(ContentFilterDictionaryImpl contentFilterDictionaryImpl) {
        0qQ.A0B(contentFilterDictionaryImpl, 0);
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        mutedWordsFilterManager.A0D.add(contentFilterDictionaryImpl);
        A00();
        ConcurrentHashMap concurrentHashMap = this.A02;
        concurrentHashMap.remove(contentFilterDictionaryImpl.A0A);
        if (concurrentHashMap.isEmpty() && !mutedWordsFilterManager.A0F.getAndSet(true)) {
            182.A06(0Tu.A05, this.A00, 36311925559788346L);
            for (AnonymousClass9V6 r0 : mutedWordsFilterManager.A0C) {
                r0.A00.A01(true);
            }
        }
    }

    private final void A00() {
        for (AnonymousClass9V6 r0 : this.A03.A0C) {
            r0.A00.A07.compareAndSet(false, true);
        }
    }

    public final AnonymousClass92I And() {
        return this.A01;
    }

    public final UserSession CCy() {
        return this.A00;
    }

    public final void D8m(List list) {
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContentFilterDictionaryImpl contentFilterDictionaryImpl = (ContentFilterDictionaryImpl) it.next();
            if (mutedWordsFilterManager.A0B.A00(contentFilterDictionaryImpl.A09)) {
                this.A02.put(contentFilterDictionaryImpl.A0A, C60340gF.A00);
            }
        }
        C262224Cq r3 = mutedWordsFilterManager.A0G;
        AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) list, (Object) mutedWordsFilterManager, (AnonymousClass4D7) null, 10);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void D8n(ContentFilterDictionaryImpl contentFilterDictionaryImpl, List list, List list2) {
        A00();
    }
}
