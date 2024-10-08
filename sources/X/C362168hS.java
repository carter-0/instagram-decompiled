package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8hS  reason: invalid class name and case insensitive filesystem */
public final class C362168hS {
    public int A00;
    public int A01;
    public C279284yO A02;
    public C362608iB A03;
    public List A04 = 0sn.A00;
    public Map A05 = 0Yt.A0E();
    public Map A06 = 0Yt.A0E();
    public Map A07 = 0Yt.A0E();
    public Map A08 = 0Yt.A0E();
    public Map A09 = 0Yt.A0E();
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final 2Fk A0F;
    public final UserSession A0G;
    public final C328777Ge A0H;
    public final Map A0I = new HashMap();
    public final 05G A0J;
    public final AnonymousClass0Ud A0K;
    public final C361588gT A0L;

    public static final void A00(GalleryItem galleryItem, C362168hS r26) {
        GalleryItem galleryItem2 = galleryItem;
        Medium medium = galleryItem2.A00;
        if (medium != null && galleryItem2.A09 == AnonymousClass05K.A00) {
            C362168hS r4 = r26;
            Map map = r4.A06;
            LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                int intValue = ((Number) entry.getKey()).intValue();
                C361718gg r8 = (C361718gg) entry.getValue();
                if (intValue == medium.A05) {
                    int CMJ = r4.A0H.CMJ(medium);
                    C362958in r5 = r8.A02;
                    boolean z = r4.A0A;
                    boolean z2 = r4.A0E;
                    boolean z3 = r5.A03;
                    Integer num = r5.A00;
                    Integer num2 = r5.A01;
                    boolean z4 = r5.A02;
                    boolean z5 = r5.A05;
                    boolean z6 = z5;
                    boolean z7 = z4;
                    C362958in r10 = new C362958in(num, num2, z, z3, z2, z7, z6, r5.A07, r5.A04);
                    String A002 = C362968io.A00.A00(medium, r4.A0G);
                    GalleryItem.LocalGalleryMedium localGalleryMedium = new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
                    boolean z8 = false;
                    if (CMJ != -1) {
                        z8 = true;
                    }
                    r8 = new C361718gg(new AnonymousClass9I9((DefaultConstructorMarker) null, CMJ, 0, 12, 3, z8, false), localGalleryMedium, r10, A002);
                }
                linkedHashMap.put(key, r8);
            }
            r4.A06 = linkedHashMap;
        }
    }

    public final void A01(0sP r21) {
        C328777Ge r1 = this.A0H;
        int count = r1.getCount();
        for (int i = 0; i < count; i++) {
            A00(r1.BJM(i).A01, this);
        }
        Map map = this.A06;
        LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((Number) entry.getKey()).intValue();
            C361718gg r8 = (C361718gg) entry.getValue();
            C362958in r2 = r8.A02;
            boolean z = this.A0E;
            boolean z2 = r2.A06;
            boolean z3 = r2.A03;
            Integer num = r2.A00;
            Integer num2 = r2.A01;
            boolean z4 = r2.A02;
            boolean z5 = z4;
            C362958in r10 = new C362958in(num, num2, z2, z3, z, z5, r2.A05, r2.A07, r2.A04);
            C362968io r4 = C362968io.A00;
            GalleryItem.LocalGalleryMedium localGalleryMedium = r8.A01;
            linkedHashMap.put(key, new C361718gg(r8.A00, localGalleryMedium, r10, r4.A00(localGalleryMedium.A00, this.A0G)));
        }
        this.A06 = linkedHashMap;
        Map map2 = this.A07;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key2 = entry2.getKey();
            entry2.getKey();
            C361728gh r42 = (C361728gh) entry2.getValue();
            String str = r42.A05;
            ImageUrl imageUrl = r42.A04;
            String str2 = r42.A06;
            int i2 = r42.A01;
            int i3 = r42.A00;
            GalleryItem galleryItem = r42.A03;
            int CMB = r1.CMB(galleryItem);
            boolean z6 = this.A0A;
            boolean z7 = z6;
            linkedHashMap2.put(key2, new C361728gh(galleryItem, imageUrl, str, str2, r42.A07, i2, i3, CMB, z7, r42.A09));
        }
        this.A07 = linkedHashMap2;
        r21.invoke(true);
    }

    public C362168hS(UserSession userSession, C328777Ge r7, int i) {
        this.A0G = userSession;
        this.A01 = i;
        this.A0H = r7;
        C361588gT A002 = C361578gS.A00(userSession);
        this.A0L = A002;
        02z A012 = 106.A01((Object) null);
        this.A0J = A012;
        this.A0K = 10b.A03(A012);
        this.A0F = C226292g8.A00(19B.A00, AnonymousClass10H.A03(new C376949Jy(5, (AnonymousClass4D7) null), A002.A05, A012));
    }
}
