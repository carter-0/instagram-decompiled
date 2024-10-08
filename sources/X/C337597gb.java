package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7gb  reason: invalid class name and case insensitive filesystem */
public abstract class C337597gb implements C251223ml, C251283mr {
    public void A03(C337797gv r1, C337587ga r2, C337587ga r3, C337557gX r4, C337557gX r5, C337557gX r6) {
    }

    public static 2Sg A02(C337557gX r6, int i) {
        Class<AnonymousClass9VY> cls = AnonymousClass9VY.class;
        C337587ga A0E = r6.A0E();
        if (A0E == null) {
            2W6.A00("SectionContext:NoScopeEventHandler", AnonymousClass05K.A0C, "Creating event handler without scope.");
            C382049d4 r3 = C382049d4.A00;
            0qQ.A0C(r3, "null cannot be cast to non-null type com.facebook.litho.NoOpEventHandler<E of com.facebook.litho.NoOpEventHandler.Companion.getNoOpEventHandler>");
            return r3;
        }
        if (cls != A0E.getClass()) {
            Integer num = AnonymousClass05K.A01;
            String str = A0E.A09;
            2W6.A00(002.A0R("SectionLifecycle:WrongContextForEventHandler:", str), num, String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a SectionContext from its Section.", new Object[]{"ClipsCarouselThumbnailsHScrollSection", str}));
        }
        2Sg r32 = new 2Sg(new AnonymousClass2Si(r6, A0E), i);
        C337747gq r1 = r6.A01;
        if (r1 == null || r1.A00 == null || r6.A02.A01.A0V) {
            return r32;
        }
        String A08 = r6.A08();
        C337757gr r0 = r1.A00;
        if (r0 != null) {
            r0.A00.add(new Pair(A08, r32));
            return r32;
        }
        throw new RuntimeException("Trying to use inactive ChangeSetCalculationState!");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, X.7hM] */
    public final Object APh(2Sg r24, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4 = obj;
        2Sg r12 = r24;
        try {
            if (!(this instanceof AnonymousClass9VY)) {
                return null;
            }
            int i = r12.A01;
            if (i == 851046848) {
                C335527d6 r3 = (C335527d6) obj4;
                obj2 = r3.A01;
                obj3 = r3.A00;
            } else if (i == 947264300) {
                C337837gz r32 = (C337837gz) obj4;
                obj2 = r32.A01;
                obj3 = r32.A00;
            } else if (i != 1463818325) {
                return null;
            } else {
                C337887h4 r33 = (C337887h4) obj4;
                AnonymousClass2Si r0 = r12.A00;
                C251233mm r1 = r0.A01;
                2V1 r11 = r0.A00;
                int i2 = r33.A00;
                ImageUrl imageUrl = (ImageUrl) r33.A01;
                AnonymousClass9VY r13 = (AnonymousClass9VY) r1;
                GFO gfo = r13.A03;
                AnonymousClass4DU r22 = r13.A01;
                UserSession userSession = r13.A00;
                JTB jtb = r13.A02;
                boolean z = r13.A04;
                0qQ.A0B(r11, 0);
                0qQ.A0B(gfo, 1);
                0qQ.A0B(r22, 2);
                0qQ.A0B(userSession, 3);
                0qQ.A0B(jtb, 4);
                0qQ.A0B(imageUrl, 7);
                ? obj5 = new Object();
                C251253mo r2 = new C251253mo("Row");
                r2.A00 = null;
                r2.A01 = null;
                r2.A02 = null;
                r2.A03 = null;
                r2.A05 = false;
                r2.A04 = null;
                if (r11.A01 != null) {
                    r2.A01 = r11.A08();
                }
                r2.A02 = C251263mp.A02(r11.A0C);
                AnonymousClass3XV r02 = 2WX.A02;
                2WX r6 = new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A00, 0, Double.doubleToRawLongBits((double) gfo.A02()))), new AnonymousClass9JR(AnonymousClass05K.A01, 0, Double.doubleToRawLongBits((double) gfo.A01()))), new AnonymousClass9JS(AnonymousClass05K.A0u, true, 4));
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(gfo.A03());
                String AyM = gfo.A0D.AyM(gfo.A0H);
                if (AyM == null) {
                    AyM = "";
                }
                String string = r11.A0D.A01.getString(2131954805, Arrays.copyOf(new Object[]{valueOf, valueOf2, AyM}, 3));
                if (string != null) {
                    boolean z2 = z;
                    C53982GxQ gxQ = new C53982GxQ(new 2WX(r6, new AnonymousClass9JS(AnonymousClass05K.A0N, string, 0)), userSession, imageUrl, r22, jtb, gfo, i2, z2);
                    List list = r2.A04;
                    if (list == null) {
                        list = new ArrayList();
                        r2.A04 = list;
                    }
                    list.add(gxQ);
                    obj5.A00 = r2;
                    return new C338347ho(obj5);
                }
                throw new RuntimeException(002.A0R(AnonymousClass000.A00(481), Integer.toHexString(2131954805)));
            }
            0qQ.A0B(obj2, 1);
            0qQ.A0B(obj3, 2);
            return Boolean.valueOf(obj2.equals(obj3));
        } catch (Exception e) {
            2V1 r03 = r12.A00.A00;
            if (r03 != null) {
                throw 2Vb.A00(r03, e);
            }
            throw e;
        }
    }
}
