package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Jij  reason: case insensitive filesystem */
public final class C60287Jij extends 2YL {
    public int A00;
    public final AnonymousClass2Fj A01 = JTO.A0K();
    public final AnonymousClass85D A02;
    public final LFQ A03;
    public final MiniGalleryService A04;
    public final AnonymousClass86D A05;
    public final UserSession A06;
    public final String A07;
    public final Map A08;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (r14.A07 != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.MC8 A00(X.C63871LAa r14, X.C60287Jij r15) {
        /*
            X.86D r0 = r15.A05
            java.lang.String r5 = r15.A07
            r9 = 0
            X.86B r1 = r0.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0025
            X.29E r4 = r1.A01
            java.util.concurrent.atomic.AtomicLong r3 = r1.A03
            long r1 = r3.get()
            java.lang.String r0 = "fetching_gallery_content"
            r4.A0C(r0, r1)
            long r1 = r3.get()
            java.lang.String r0 = "category_id"
            r4.A09(r1, r0, r5)
        L_0x0025:
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r2 = r15.A04
            X.8cJ r3 = X.C359218cI.A03
            X.849 r0 = r14.A00
            X.84A r1 = r0.A00
            java.lang.String r0 = r14.A01
            X.8cI r4 = r3.A01(r1, r0)
            java.lang.String r6 = r14.A02
            if (r6 == 0) goto L_0x0041
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "SAVED"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0046
        L_0x0041:
            boolean r0 = r14.A07
            r10 = 1
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            r5 = 0
            boolean r12 = r14.A06
            r7 = 3
            r11 = 1
            X.7zi r3 = new X.7zi
            r13 = r9
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13)
            com.instagram.ar.core.effectcollection.EffectCollectionService r0 = r2.A02
            X.0r6 r1 = r0.A0F(r3)
            X.MC8 r0 = new X.MC8
            r0.<init>((int) r9, (java.lang.Object) r14, (java.lang.Object) r2, (java.lang.Object) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60287Jij.A00(X.LAa, X.Jij):X.MC8");
    }

    public final void A01() {
        String str;
        if (this.A01.A02() != null) {
            String str2 = this.A07;
            if (!0qQ.A0K(str2, "SAVED")) {
                this.A05.A0B(str2);
                return;
            }
        }
        LFQ lfq = this.A03;
        if (!lfq.A06.getAndSet(true) && !lfq.A05.getAndSet(true)) {
            29E r5 = lfq.A02;
            long A042 = r5.A04(Integer.valueOf(UUID.randomUUID().hashCode()), (String) null, 17633831, lfq.A01);
            lfq.A00 = A042;
            r5.A0A(A042, "category_id", lfq.A03);
            r5.A0A(lfq.A00, "product_id", lfq.A04);
        }
        AnonymousClass86D r1 = this.A05;
        String str3 = this.A07;
        r1.A0B(str3);
        AnonymousClass849 r2 = r1.A03;
        if ((0qQ.A0K(str3, "FOR_YOU") || 0qQ.A0K(str3, "FOR_YOU_MG")) && 0qQ.A0K(AnonymousClass86D.A00(r1), str3)) {
            str = AnonymousClass8YC.A01((AnonymousClass84D) r1.A04.A00.getValue());
        } else {
            str = null;
        }
        DbY.A19(this, new MGZ(this, (AnonymousClass4D7) null, 3), A00(new C63871LAa(r2, str3, (String) null, str, r1.A0G, r1.A0I, r1.A0M.get(), r1.A0K.get()), this));
    }

    public final void onCleared() {
        this.A03.A01("cleared");
    }

    public /* synthetic */ C60287Jij(MiniGalleryService miniGalleryService, AnonymousClass86D r6, UserSession userSession, String str) {
        C348347yI A042 = r6.A04();
        DbW.A1O(miniGalleryService, 4, A042);
        this.A07 = str;
        this.A06 = userSession;
        this.A04 = miniGalleryService;
        this.A05 = r6;
        this.A02 = A042;
        this.A03 = new LFQ(userSession, str, r6.A03.A00.name());
        this.A08 = AnonymousClass7TE.A1H();
        DbY.A19(this, new JVD(this, (AnonymousClass4D7) null, 12), MCA.A00(this, AnonymousClass0Zq.A00(new AnonymousClass9K3((Object) userSession, (AnonymousClass4D7) null, 19, 42)), 12));
    }
}
