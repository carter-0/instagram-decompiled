package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: X.Vvi  reason: case insensitive filesystem */
public final class C18642Vvi {
    public final Set A00 = Collections.newSetFromMap(new WeakHashMap());
    public final C18062Vko A01;
    public final Set A02 = new LinkedHashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (X.2PP.A00(r1, r0) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0178, code lost:
        if (X.2PP.A00(r0, r1) != false) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C18642Vvi r10, java.util.Set r11) {
        /*
            java.util.Set r1 = r10.A02
            boolean r0 = X.2PP.A00(r11, r1)
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            r1.clear()
            if (r11 == 0) goto L_0x0012
            r1.addAll(r11)
        L_0x0012:
            X.Vko r2 = r10.A01
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r2.A00(r0)
            r5.add(r0)
            goto L_0x001d
        L_0x002f:
            java.util.Set r0 = r10.A00
            java.util.Iterator r11 = r0.iterator()
        L_0x0035:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r6 = r11.next()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r6 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r6
            int r0 = r5.size()
            r4 = 0
            r7 = 1
            if (r0 != r7) goto L_0x0065
            java.util.Iterator r0 = r5.iterator()
            java.lang.Object r0 = r0.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            java.lang.String r1 = X.C18231Vnv.A01(r0)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r6.A0H
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = X.C18231Vnv.A01(r0)
        L_0x005f:
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 != 0) goto L_0x0067
        L_0x0065:
            r6.A0H = r4
        L_0x0067:
            X.VwL r0 = r6.mMapViewController
            X.Vjs r0 = r0.A01
            if (r0 == 0) goto L_0x01fd
            java.util.HashSet r0 = r0.A00(r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x0075:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r2.next()
            X.UGt r1 = (X.C14955UGt) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0L(r0, r7)
            goto L_0x0075
        L_0x0087:
            X.VwL r0 = r6.mMapViewController
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            X.Vjs r0 = r0.A01
            if (r0 == 0) goto L_0x01f8
            r0.A01(r1)
            X.Vvi r0 = r6.A0C
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r0.A01()
            if (r1 == 0) goto L_0x00bb
            X.VwL r0 = r6.mMapViewController
            X.UGt r2 = r0.A05(r1)
            if (r2 == 0) goto L_0x00bb
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A0L(r0, r7)
            X.VwL r0 = r6.mMapViewController
            X.Vjs r0 = r0.A01
            if (r0 == 0) goto L_0x01f3
            r0.A01(r1)
        L_0x00bb:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00f4
            X.W1f r2 = r6.A0B
            X.0hq r0 = r2.A03
            int r1 = r0.A0M()
            boolean r0 = X.C18780W1f.A02(r2)
            if (r0 == 0) goto L_0x00d4
            if (r1 != r7) goto L_0x00d4
            r2.A04()
        L_0x00d4:
            X.WPk r0 = r6.mMapChromeController
            X.WJk r0 = r0.A0I
            X.2cs r0 = r0.A04
            r0.A04()
            X.WgO r2 = r6.mClipsVideoPlayerManager
            if (r2 == 0) goto L_0x0035
            r2.A01 = r4
            X.4M3 r1 = r2.A05
            boolean r0 = r1.isPlaying()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = ""
            r1.EyP(r0, r7)
            r2.A00 = r4
            goto L_0x0035
        L_0x00f4:
            java.util.Iterator r0 = r5.iterator()
            java.lang.Object r2 = r0.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = (com.instagram.discovery.mediamap.model.MediaMapPin) r2
            int r1 = r5.size()
            X.WPk r0 = r6.mMapChromeController
            if (r1 <= r7) goto L_0x01e7
            r0.A04()
        L_0x0109:
            X.WgO r3 = r6.mClipsVideoPlayerManager
            if (r3 == 0) goto L_0x0128
            r3.A01 = r2
            if (r2 == 0) goto L_0x01e4
            X.4sL r0 = r2.A03
            if (r0 == 0) goto L_0x01e1
            X.4bN r1 = X.C295325ny.A02(r0)
        L_0x0119:
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r3.A01
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = X.C18231Vnv.A01(r0)
        L_0x0121:
            if (r1 == 0) goto L_0x01cd
            if (r0 == 0) goto L_0x01cd
            r3.A02(r1, r0)
        L_0x0128:
            X.VwL r0 = r6.mMapViewController
            X.UGt r8 = r0.A05(r2)
            if (r8 == 0) goto L_0x0153
            com.instagram.model.venue.LocationDict r7 = r2.A09
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.String r3 = r2.A0D
            com.instagram.common.typedurl.ImageUrl r1 = r2.A00()
            java.lang.String r0 = r7.getShortName()
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = r7.getName()
        L_0x0146:
            r8.A0K(r1, r3, r0)
            boolean r0 = r8 instanceof X.C16076Uo3
            if (r0 == 0) goto L_0x0153
            X.VN8 r0 = r6.A0e
            X.Uo3 r8 = (X.C16076Uo3) r8
            r0.A00 = r8
        L_0x0153:
            X.W1f r7 = r6.A0B
            com.instagram.discovery.mediamap.intf.MediaMapQuery r3 = r6.A0E
            com.instagram.discovery.mediamap.model.MediaMapPinPreview r10 = r6.A0I
            X.0hq r9 = r7.A03
            r8 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r9.A0P(r8)
            boolean r0 = r1 instanceof com.instagram.discovery.mediamap.fragment.LocationDetailFragment
            if (r0 == 0) goto L_0x0187
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r1 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r1
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r1.A03
            r1 = 0
            if (r0 != 0) goto L_0x0182
            r0 = r4
        L_0x016e:
            if (r2 == 0) goto L_0x0174
            java.lang.String r1 = X.C18231Vnv.A01(r2)
        L_0x0174:
            boolean r0 = X.2PP.A00(r0, r1)
            if (r0 == 0) goto L_0x0187
        L_0x017a:
            com.instagram.discovery.mediamap.model.MediaMapPinPreview r0 = r6.A0I
            if (r0 == 0) goto L_0x0035
            r6.A0I = r4
            goto L_0x0035
        L_0x0182:
            java.lang.String r0 = X.C18231Vnv.A01(r0)
            goto L_0x016e
        L_0x0187:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.instagram.common.session.UserSession r0 = r7.A05
            X.DbU.A1D(r1, r0)
            if (r2 == 0) goto L_0x0198
            java.lang.String r0 = "arg_map_pins"
            r1.putParcelable(r0, r2)
        L_0x0198:
            if (r10 == 0) goto L_0x019f
            java.lang.String r0 = "arg_tapped_media_preview"
            r1.putParcelable(r0, r10)
        L_0x019f:
            java.lang.String r0 = "arg_query"
            r1.putParcelable(r0, r3)
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r3 = new com.instagram.discovery.mediamap.fragment.LocationDetailFragment
            r3.<init>()
            r3.setArguments(r1)
            X.C18780W1f.A02(r7)
            X.0s1 r2 = new X.0s1
            r2.<init>(r9)
            r1 = 2130772037(0x7f010045, float:1.7147181E38)
            r0 = 2130772039(0x7f010047, float:1.7147185E38)
            r2.A07(r1, r0, r1, r0)
            r2.A0A(r3, r8)
            java.lang.String r0 = "DETAIL"
            r2.A0I(r0)
            r0 = 0
            int r0 = r2.A0J(r0)
            r7.A00 = r0
            goto L_0x017a
        L_0x01cd:
            X.4M3 r1 = r3.A05
            boolean r0 = r1.isPlaying()
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = ""
            r1.EyP(r0, r7)
            r3.A00 = r4
            goto L_0x0128
        L_0x01de:
            r0 = r4
            goto L_0x0121
        L_0x01e1:
            r1 = 0
            goto L_0x0119
        L_0x01e4:
            r1 = r4
            goto L_0x0119
        L_0x01e7:
            X.WJk r0 = r0.A0I
            X.2cs r0 = r0.A04
            r0.A04()
            goto L_0x0109
        L_0x01f0:
            r0 = 0
            goto L_0x005f
        L_0x01f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0202:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18642Vvi.A00(X.Vvi, java.util.Set):boolean");
    }

    public final MediaMapPin A01() {
        Set set = this.A02;
        if (set.isEmpty()) {
            return null;
        }
        C18062Vko vko = this.A01;
        return (MediaMapPin) vko.A02.get(set.iterator().next());
    }

    public final TreeSet A02() {
        C18062Vko vko = this.A01;
        Set set = this.A02;
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            treeSet.add(vko.A00(AnonymousClass7TE.A18(it)));
        }
        return treeSet;
    }

    public final void A03(String str) {
        LinkedHashSet linkedHashSet;
        if (str != null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(str);
        } else {
            linkedHashSet = null;
        }
        A00(this, linkedHashSet);
    }

    public C18642Vvi(C18062Vko vko) {
        this.A01 = vko;
    }
}
