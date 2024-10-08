package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VtF  reason: case insensitive filesystem */
public final class C18516VtF {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = -1;
    public C17941ViW A06 = new C17941ViW(AnonymousClass05K.A0N);
    public String A07;
    public String A08 = "";
    public boolean A09;
    public boolean A0A;
    public final C18602Vuv A0B;

    public C18516VtF(C18602Vuv vuv) {
        0qQ.A0B(vuv, 1);
        this.A0B = vuv;
    }

    public static final void A00(C18516VtF vtF, ImageUrl imageUrl) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C240603Ln r1 = new C240603Ln(C240593Lm.A03, 0Yt.A0E(), vtF.A01, vtF.A00, vtF.A03);
        C17941ViW viW = vtF.A06;
        viW.A08 = r1;
        AnonymousClass2i4 r3 = viW.A06;
        if (r3 == null) {
            r3 = new AnonymousClass2i4();
        }
        r3.A01 = vtF.A05;
        r3.A00 = vtF.A04;
        Map map = r3.A0A;
        if (map == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(AnonymousClass000.A00(1307), Integer.valueOf(imageUrl.getWidth()));
        linkedHashMap.put(AnonymousClass000.A00(1306), Integer.valueOf(imageUrl.getHeight()));
        linkedHashMap.put("encoded_size", Integer.valueOf(vtF.A02));
        r3.A0A = linkedHashMap;
        Map map2 = r3.A09;
        if (map2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        String str = vtF.A07;
        if (str != null) {
            linkedHashMap2.put("origin", str);
        } else {
            linkedHashMap2.remove("origin");
        }
        linkedHashMap2.put("custom_uri_key", AnonymousClass7TF.A0h(imageUrl));
        r3.A09 = linkedHashMap2;
        C17941ViW viW2 = vtF.A06;
        viW2.A06 = r3;
        if (vtF.A0A) {
            vtF.A0B.A00(viW2, AnonymousClass05K.A0N);
        }
    }
}
