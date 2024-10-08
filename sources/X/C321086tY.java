package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.AssetHubRepository$allCutoutStickers$1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6tY  reason: invalid class name and case insensitive filesystem */
public final class C321086tY {
    public final UserSession A00;
    public final C353588If A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 1));
    public final AnonymousClass0r6 A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;

    public C321086tY(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C353588If(userSession);
        02z r4 = new 02z(new LinkedHashMap());
        this.A06 = r4;
        this.A08 = r4;
        02z r3 = new 02z(new LinkedHashMap());
        this.A05 = r3;
        this.A07 = r3;
        02z r2 = new 02z(new LinkedHashMap());
        this.A04 = r2;
        this.A03 = AnonymousClass10H.A00(new AssetHubRepository$allCutoutStickers$1(this, (AnonymousClass4D7) null), r4, r3, r2);
    }

    public final void A02(C317876nz r6) {
        0qQ.A0B(r6, 0);
        05G r4 = this.A04;
        String str = r6.A0Z;
        if (!((Map) r4.getValue()).containsKey(str)) {
            LinkedHashMap A032 = 0Yt.A03((Map) r4.getValue());
            A032.put(str, new C376649Iu(r6, (String) null));
            r4.Epw(A032);
        }
    }

    public final void A03(String str, String str2) {
        0qQ.A0B(str, 0);
        AnonymousClass0Ud r1 = this.A08;
        if (((Map) r1.getValue()).containsKey(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) r1.getValue()).entrySet()) {
                boolean A0K = 0qQ.A0K(entry.getKey(), str);
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (A0K) {
                    C317876nz r12 = (C317876nz) ((C376649Iu) value).A00;
                    0qQ.A0B(r12, 1);
                    value = new C376649Iu(r12, str2);
                }
                linkedHashMap.put(key, value);
            }
            this.A06.Epw(linkedHashMap);
        }
        AnonymousClass0Ud r13 = this.A07;
        if (((Map) r13.getValue()).containsKey(str)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : ((Map) r13.getValue()).entrySet()) {
                boolean A0K2 = 0qQ.A0K(entry2.getKey(), str);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (A0K2) {
                    C317876nz r14 = (C317876nz) ((C376649Iu) value2).A00;
                    0qQ.A0B(r14, 1);
                    value2 = new C376649Iu(r14, str2);
                }
                linkedHashMap2.put(key2, value2);
            }
            this.A05.Epw(linkedHashMap2);
        }
        05G r6 = this.A04;
        if (((Map) r6.getValue()).containsKey(str)) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : ((Map) r6.getValue()).entrySet()) {
                boolean A0K3 = 0qQ.A0K(entry3.getKey(), str);
                Object key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (A0K3) {
                    C317876nz r15 = (C317876nz) ((C376649Iu) value3).A00;
                    0qQ.A0B(r15, 1);
                    value3 = new C376649Iu(r15, str2);
                }
                linkedHashMap3.put(key3, value3);
            }
            r6.Epw(linkedHashMap3);
        }
    }

    public static final LinkedHashMap A00(C321086tY r2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) r2.A04.getValue());
        linkedHashMap.putAll((Map) r2.A07.getValue());
        linkedHashMap.putAll((Map) r2.A08.getValue());
        return linkedHashMap;
    }

    public final void A01(int i, String str) {
        C353588If r0 = this.A01;
        int i2 = i;
        CH4 ch4 = new CH4(this, i2);
        1vn r2 = r0.A01;
        2IS r6 = new 2IS();
        2IS r5 = new 2IS();
        Integer valueOf = Integer.valueOf(i2);
        r6.A03("sticker_count_limit", valueOf);
        boolean z = false;
        if (valueOf != null) {
            z = true;
        }
        r6.A04("after", str);
        17k.A0E(z);
        AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
        r2.A06(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "ClipsMemeHubAssetQuery", r6.getParamsCopy(), r5.getParamsCopy(), C42308BYz.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_meme_hub_graphql", new ArrayList()), ch4);
    }

    public final boolean A04() {
        if (!((Map) this.A06.getValue()).isEmpty() || !((Map) this.A05.getValue()).isEmpty() || !((Map) this.A04.getValue()).isEmpty()) {
            return false;
        }
        return true;
    }
}
