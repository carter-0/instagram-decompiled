package X;

import android.content.Context;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class JWM implements AnonymousClass8XX, C361658ga, C361668gb {
    public int A00;
    public int A01;
    public GalleryItem A02;
    public List A03;
    public Map A04 = 0Yt.A0E();
    public Map A05 = 0Yt.A0E();
    public 0sP A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public String A0C;
    public List A0D;
    public Map A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Context A0J;
    public final 2Fk A0K;
    public final 2Fk A0L;
    public final 2Fk A0M;
    public final 1Ng A0N;
    public final UserSession A0O;
    public final JWT A0P;
    public final MUO A0Q;
    public final Comparator A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final List A0W = AnonymousClass7TE.A1C();
    public final boolean A0X;
    public final JWT A0Y;
    public final JWp A0Z;
    public final C59752JWo A0a;
    public final C361588gT A0b;
    public final AnonymousClass0r6 A0c;
    public final AnonymousClass0r6 A0d;
    public final 05G A0e;
    public final boolean A0f;
    public final boolean A0g;

    public static final boolean A03(GalleryItem galleryItem, boolean z) {
        Draft draft;
        0qQ.A0B(galleryItem, 0);
        if (galleryItem.A09 != AnonymousClass05K.A01 || (((draft = galleryItem.A02) != null && draft.A08) || !z || !galleryItem.A06())) {
            return true;
        }
        return false;
    }

    public final void A07() {
        C361818gr r7;
        long j;
        int i;
        JXX jxx = new JXX((C59763JXb) null, (List) null, (DefaultConstructorMarker) null, 3);
        AtomicInteger atomicInteger = new AtomicInteger();
        if (this.A0B) {
            A01(new C64759Lhb(), jxx, atomicInteger);
        }
        List list = this.A0S;
        if (AnonymousClass7TE.A1b(list)) {
            JWT jwt = this.A0P;
            A01(new C64757LhZ(jwt.A00), jxx, atomicInteger);
            C59763JXb jXb = jxx.A00;
            jXb.A03.put(Integer.valueOf(jXb.A00), Integer.valueOf(atomicInteger.get()));
            if (jwt.A00.A02 == AnonymousClass05K.A0N || this.A0A) {
                i = list.size();
            } else {
                i = list.size();
                int i2 = this.A0G;
                if (i > i2) {
                    i = i2;
                }
            }
            for (int i3 = 0; i3 < i; i3++) {
                A00((GalleryItem) list.get(i3), jxx, atomicInteger);
            }
            jXb.A00++;
            A01(new C64757LhZ(this.A0Y.A00), jxx, atomicInteger);
        }
        List<GalleryItem> list2 = this.A0V;
        if (AnonymousClass7TE.A1b(list2)) {
            for (GalleryItem A002 : list2) {
                A00(A002, jxx, atomicInteger);
            }
        }
        boolean A062 = 182.A06(0Tu.A05, this.A0O, 36316662907540027L);
        List list3 = this.A0T;
        List<GalleryItem> list4 = this.A0U;
        Context context = this.A0J;
        if (A062) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.addAll(list4);
            A1C.addAll(list3);
            01V.A1D(A1C, this.A0R);
            int size = A1C.size();
            int size2 = A1C.size();
            for (int i4 = 0; i4 < size2; i4++) {
                GalleryItem galleryItem = (GalleryItem) A1C.get(i4);
                A00(galleryItem, jxx, atomicInteger);
                int i5 = this.A0F;
                if (i4 % i5 == 0 || i5 + i4 >= size) {
                    String A003 = r7.A00(new Date(C64153LQs.A00.A01(galleryItem)));
                    C59763JXb jXb2 = jxx.A00;
                    List list5 = jXb2.A01;
                    list5.add(A003);
                    jXb2.A04.put(Integer.valueOf(jXb2.A00), Integer.valueOf(list5.size() - 1));
                    jXb2.A03.put(Integer.valueOf(jXb2.A00), Integer.valueOf(atomicInteger.get()));
                    jXb2.A00++;
                }
            }
        } else {
            r7 = new C361818gr(context);
            if (AnonymousClass7TE.A1b(list4)) {
                for (GalleryItem A004 : list4) {
                    A00(A004, jxx, atomicInteger);
                }
            }
            int size3 = list3.size();
            int size4 = list3.size();
            for (int i6 = 0; i6 < size4; i6++) {
                GalleryItem galleryItem2 = (GalleryItem) list3.get(i6);
                A00(galleryItem2, jxx, atomicInteger);
                int i7 = this.A0F;
                if (i6 % i7 == 0 || i7 + i6 >= size3) {
                    Medium medium = galleryItem2.A00;
                    if (medium != null) {
                        j = medium.A0C * 1000;
                    } else {
                        j = 0;
                    }
                    String A005 = r7.A00(new Date(j));
                    C59763JXb jXb3 = jxx.A00;
                    List list6 = jXb3.A01;
                    list6.add(A005);
                    jXb3.A04.put(Integer.valueOf(jXb3.A00), Integer.valueOf(list6.size() - 1));
                    jXb3.A03.put(Integer.valueOf(jXb3.A00), Integer.valueOf(atomicInteger.get()));
                    jXb3.A00++;
                }
            }
        }
        if (this.A08) {
            A01(this.A0Z, jxx, atomicInteger);
        }
        if (this.A09) {
            A01(new C64758Lha(), jxx, atomicInteger);
        }
        this.A03 = jxx.A01;
        C59763JXb jXb4 = jxx.A00;
        this.A01 = jXb4.A00;
        this.A0D = jXb4.A01;
        this.A04 = jXb4.A02;
        this.A05 = jXb4.A03;
        this.A0E = jXb4.A04;
        this.A0a.A00.A0G.Dmz();
    }

    public final void A08(C65796Lzo lzo) {
        Integer num;
        Integer num2 = null;
        if (lzo != null) {
            num = Integer.valueOf(lzo.A00);
        } else {
            num = null;
        }
        C65796Lzo lzo2 = (C65796Lzo) this.A0K.A02();
        if (lzo2 != null) {
            num2 = Integer.valueOf(lzo2.A00);
        }
        if (!0qQ.A0K(num, num2)) {
            this.A0e.Epw(lzo);
        }
    }

    public final void A09(String str, List list, 0sP r11) {
        0qQ.A0B(r11, 2);
        List list2 = this.A0U;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new GalleryItem((RemoteMedia) it.next()));
        }
        JWT jwt = this.A0Y;
        JWF jwf = jwt.A00;
        Integer num = (Integer) jwf.A01;
        String str2 = jwf.A04;
        Integer num2 = (Integer) jwf.A02;
        int i = jwf.A00;
        C51974G9v.A1O(num, str2, str, num2);
        jwt.A00 = new JWF(num, num2, str2, str, i);
        jwt.A00(AnonymousClass05K.A00);
        this.A06 = r11;
        A07();
    }

    public final void A0A(List list, boolean z) {
        List<Draft> list2 = list;
        0qQ.A0B(list2, 0);
        this.A0A = z;
        List list3 = this.A0S;
        list3.clear();
        for (Draft draft : list2) {
            0qQ.A0B(draft, 1);
            list3.add(new GalleryItem(draft, (GeneratedMediaMetadata) null, (Medium) null, (RemoteMedia) null, (AnonymousClass8y3) null, (ImageUrl) null, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A01, draft.A04, -1));
        }
        JWT jwt = this.A0P;
        int size = list2.size();
        JWF jwf = jwt.A00;
        Integer num = (Integer) jwf.A01;
        String str = jwf.A04;
        String str2 = jwf.A03;
        Integer num2 = (Integer) jwf.A02;
        C51974G9v.A1O(num, str, str2, num2);
        jwt.A00 = new JWF(num, num2, str, str2, size);
        A02(this);
        A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (X.0qQ.A0K(r2, r0) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ecr(java.lang.Integer r9, java.lang.String r10, java.util.List r11) {
        /*
            r8 = this;
            r6 = r10
            r3 = 0
            X.0qQ.A0B(r11, r3)
            boolean r2 = r8.A0f
            if (r2 == 0) goto L_0x001a
            r1 = -1
            if (r9 == 0) goto L_0x001a
            int r0 = r9.intValue()
            if (r0 != r1) goto L_0x001a
            java.lang.String r0 = r8.A0C
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x001f
        L_0x001a:
            java.util.List r0 = r8.A0T
            r0.clear()
        L_0x001f:
            r8.A0C = r10
            r0 = 0
            if (r2 == 0) goto L_0x0040
            java.util.List r4 = r8.A0T
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0040
            java.lang.Object r2 = X.00k.A0L(r11)
            java.lang.Object r1 = X.00k.A0L(r4)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            if (r1 == 0) goto L_0x003a
            com.instagram.common.gallery.Medium r0 = r1.A00
        L_0x003a:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x007a
        L_0x0040:
            java.util.Iterator r5 = r11.iterator()
        L_0x0044:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r4 = r5.next()
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            java.lang.String r2 = r4.A0X
            X.0qQ.A0B(r2, r3)
            X.11S r1 = X.C362948il.A00
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r0 = r0.getName()
            X.0qQ.A07(r0)
            boolean r0 = r1.A08(r0)
            if (r0 != 0) goto L_0x0044
            java.util.List r2 = r8.A0T
            int r0 = r4.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = new com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium
            r0.<init>(r4, r1)
            r2.add(r0)
            goto L_0x0044
        L_0x007a:
            X.JWT r1 = r8.A0Y
            if (r10 != 0) goto L_0x0080
            java.lang.String r6 = ""
        L_0x0080:
            X.JWF r0 = r1.A00
            java.lang.Object r3 = r0.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r5 = r0.A04
            java.lang.Object r4 = r0.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r7 = r0.A00
            X.C51974G9v.A1O(r3, r5, r6, r4)
            X.JWF r2 = new X.JWF
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A00 = r2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A00(r0)
            r8.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWM.Ecr(java.lang.Integer, java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r0.A0W.indexOf(r6) <= -1) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(com.instagram.common.gallery.model.GalleryItem r20, X.JXX r21, java.util.concurrent.atomic.AtomicInteger r22) {
        /*
            r19 = this;
            r0 = r19
            r6 = r20
            boolean r11 = r0.A07
            r12 = 0
            boolean r1 = r0.A0X
            r9 = 0
            X.8in r8 = new X.8in
            r10 = r9
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0qQ.A0B(r6, r12)
            com.instagram.common.session.UserSession r3 = r0.A0O
            X.0Tu r4 = X.0Tu.A05
            r1 = 36321060954317869(0x8109d0000c242d, double:3.0329234284594314E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 != 0) goto L_0x002f
            java.util.List r1 = r0.A0W
            int r14 = r1.size()
        L_0x002f:
            boolean r1 = r6.A05()
            if (r1 == 0) goto L_0x0040
            java.util.List r1 = r0.A0W
            int r2 = r1.indexOf(r6)
            r1 = -1
            r17 = 1
            if (r2 > r1) goto L_0x0042
        L_0x0040:
            r17 = 0
        L_0x0042:
            boolean r1 = r6.A05()
            if (r1 == 0) goto L_0x00e4
            java.util.List r1 = r0.A0W
            int r15 = r1.indexOf(r6)
        L_0x004e:
            com.instagram.common.gallery.model.GalleryItem r1 = r0.A02
            boolean r18 = X.0qQ.A0K(r1, r6)
            r16 = 3
            X.9I9 r13 = new X.9I9
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.Integer r1 = r6.A09
            int r5 = r1.intValue()
            r2 = 4
            r11 = 1
            r1 = 2
            if (r5 == r1) goto L_0x00a7
            if (r5 == r11) goto L_0x00a1
            if (r5 == r2) goto L_0x009b
            if (r5 != r12) goto L_0x00e7
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r6 = (com.instagram.common.gallery.model.GalleryItem.LocalGalleryMedium) r6
            X.8io r1 = X.C362968io.A00
            com.instagram.common.gallery.Medium r0 = r6.A00
            java.lang.String r0 = r1.A00(r0, r3)
            X.8gg r5 = new X.8gg
            r5.<init>(r13, r6, r8, r0)
        L_0x007b:
            r1 = r21
            java.util.List r0 = r1.A01
            r0.add(r5)
            X.JXb r3 = r1.A00
            java.util.Map r2 = r3.A02
            int r0 = r22.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            r22.incrementAndGet()
            return
        L_0x009b:
            X.LiF r5 = new X.LiF
            r5.<init>(r13, r6, r8)
            goto L_0x007b
        L_0x00a1:
            X.LiD r5 = new X.LiD
            r5.<init>(r13, r6, r8)
            goto L_0x007b
        L_0x00a7:
            r1 = 36321060954186795(0x8109d0000a242b, double:3.03292342837654E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x00de
            com.instagram.common.gallery.RemoteMedia r2 = r6.A04
            if (r2 == 0) goto L_0x00e7
            com.instagram.common.typedurl.ImageUrl r1 = r2.A04
            com.instagram.common.typedurl.ImageUrl r7 = r2.A03
            java.lang.String r8 = r6.A0A
            java.lang.String r9 = r1.getUrl()
            X.0qQ.A07(r9)
            boolean r1 = r6.A03()
            if (r1 != 0) goto L_0x00ca
            r11 = 3
        L_0x00ca:
            int r12 = r2.A01
            int r13 = r13.A00
            boolean r14 = r0.A07
            com.instagram.common.gallery.model.GalleryItem r1 = r0.A02
            boolean r15 = X.0qQ.A0K(r1, r6)
            X.0sP r10 = r0.A06
            X.8gh r5 = new X.8gh
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x007b
        L_0x00de:
            X.LiE r5 = new X.LiE
            r5.<init>(r13, r6, r8)
            goto L_0x007b
        L_0x00e4:
            r15 = -1
            goto L_0x004e
        L_0x00e7:
            java.lang.String r1 = "GalleryMediaGridViewState"
            java.lang.String r0 = "Invalid item type when mapping gallery grid states to view models."
            X.0kD.A07(r1, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWM.A00(com.instagram.common.gallery.model.GalleryItem, X.JXX, java.util.concurrent.atomic.AtomicInteger):void");
    }

    private final void A01(C232262tL r5, JXX jxx, AtomicInteger atomicInteger) {
        C59763JXb jXb = jxx.A00;
        jXb.A03.put(Integer.valueOf(jXb.A00), Integer.valueOf(atomicInteger.get()));
        jxx.A01.add(r5);
        jXb.A02.put(Integer.valueOf(atomicInteger.get()), Integer.valueOf(jXb.A00));
        atomicInteger.incrementAndGet();
        jXb.A00++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.A0S.size() <= r2.A0G) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r2.A0S.size() > r2.A0G) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.JWM r2) {
        /*
            boolean r0 = r2.A0g
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r2.A0S
            int r1 = r0.size()
            int r0 = r2.A0G
            if (r1 <= r0) goto L_0x0027
        L_0x000e:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0010:
            X.JWT r0 = r2.A0P
            r0.A00(r1)
            return
        L_0x0016:
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x001d
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0010
        L_0x001d:
            java.util.List r0 = r2.A0S
            int r1 = r0.size()
            int r0 = r2.A0G
            if (r1 > r0) goto L_0x000e
        L_0x0027:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWM.A02(X.JWM):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r1 == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(com.instagram.common.gallery.model.GalleryItem r7) {
        /*
            r6 = this;
            java.util.List r3 = r6.A0S
            boolean r0 = X.00k.A0u(r3, r7)
            if (r0 != 0) goto L_0x001a
            java.util.List r0 = r6.A0T
            boolean r0 = X.00k.A0u(r0, r7)
            if (r0 != 0) goto L_0x001a
            java.util.List r0 = r6.A0U
            boolean r0 = X.00k.A0u(r0, r7)
            if (r0 != 0) goto L_0x001a
            r2 = -1
            return r2
        L_0x001a:
            java.lang.Integer r0 = r7.A09
            if (r0 == 0) goto L_0x0089
            int r1 = r0.intValue()
            r5 = 2
            r0 = 1
            if (r1 == r5) goto L_0x002b
            if (r1 == r0) goto L_0x0082
            r0 = 0
            if (r1 != r0) goto L_0x0089
        L_0x002b:
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 != 0) goto L_0x0032
            r5 = 0
        L_0x0032:
            com.instagram.common.session.UserSession r4 = r6.A0O
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316662907540027(0x8105d00008123b, double:3.030142085967611E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0077
            java.util.List r2 = r6.A0T
            java.util.List r0 = r6.A0U
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r1.addAll(r0)
            r1.addAll(r2)
            java.util.Comparator r0 = r6.A0R
            X.01V.A1D(r1, r0)
        L_0x0054:
            int r2 = r1.indexOf(r7)
            int r2 = r2 + r5
            X.JWT r0 = r6.A0P
            X.JWF r0 = r0.A00
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0072
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x0072
            int r1 = r3.size()
            int r0 = r6.A0G
            if (r1 <= r0) goto L_0x0070
            r1 = r0
        L_0x0070:
            int r2 = r2 + r1
            return r2
        L_0x0072:
            int r1 = r3.size()
            goto L_0x0070
        L_0x0077:
            java.util.List r1 = r6.A0U
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x0054
            java.util.List r1 = r6.A0T
            goto L_0x0054
        L_0x0082:
            int r0 = r3.indexOf(r7)
            int r2 = r0 + 1
            return r2
        L_0x0089:
            r0 = 972(0x3cc, float:1.362E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWM.A04(com.instagram.common.gallery.model.GalleryItem):int");
    }

    public final GalleryItem A05() {
        GalleryItem galleryItem = (GalleryItem) 00k.A0J(this.A0T);
        GalleryItem A062 = A06();
        if (galleryItem == null || (A062 != null && this.A0R.compare(galleryItem, A062) > 0)) {
            return A062;
        }
        return galleryItem;
    }

    public final GalleryItem A06() {
        Object obj;
        Iterator it = this.A0U.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GalleryItem galleryItem = (GalleryItem) obj;
            if (galleryItem.A04() && (!galleryItem.A06() || !AJ5.A06(this.A0O, C64153LQs.A00(galleryItem)))) {
                break;
            }
        }
        return (GalleryItem) obj;
    }

    public final List AN0() {
        return C51966G9m.A1J(this.A0W);
    }

    public final List BPh() {
        List list = this.A0T;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(JTP.A0O(it));
        }
        return 00k.A0X(A0r);
    }

    public final int Bqm(int i) {
        return AnonymousClass7TG.A0A((Number) C51968G9o.A10(this.A0E, i));
    }

    public final List Bqr() {
        return this.A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A0O, 36319493290597825L) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ejh(com.instagram.common.gallery.model.GalleryItem r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x001f
            java.util.List r0 = r5.A0U
            boolean r0 = X.00k.A0u(r0, r6)
            if (r0 != 0) goto L_0x0020
            java.util.List r0 = r5.A0S
            boolean r0 = X.00k.A0u(r0, r6)
            if (r0 != 0) goto L_0x0020
            java.util.List r0 = r5.A0T
            boolean r0 = X.00k.A0u(r0, r6)
            if (r0 != 0) goto L_0x0020
            java.util.List r0 = r5.A0W
            r0.remove(r6)
        L_0x001f:
            return
        L_0x0020:
            if (r7 == 0) goto L_0x005a
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x002b
            java.util.List r0 = r5.A0W
            r0.clear()
        L_0x002b:
            java.util.List r4 = r5.A0W
            boolean r0 = r4.contains(r6)
            if (r0 != 0) goto L_0x0054
            int r1 = r4.size()
            int r0 = r5.A0H
            if (r1 < r0) goto L_0x0040
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0040
            return
        L_0x0040:
            if (r8 != 0) goto L_0x0051
            com.instagram.common.session.UserSession r3 = r5.A0O
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319493290597825(0x81086300021dc1, double:3.0319320316104005E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0054
        L_0x0051:
            r4.add(r6)
        L_0x0054:
            X.MUO r0 = r5.A0Q
            r0.DQg(r6, r8)
            goto L_0x0077
        L_0x005a:
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0077
            java.util.List r2 = r5.A0W
            int r1 = r2.indexOf(r6)
            r0 = -1
            if (r1 <= r0) goto L_0x0077
            r2.remove(r6)
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0077
            X.MUO r0 = r5.A0Q
            r0.DQh(r6, r8)
        L_0x0077:
            X.6SR r2 = X.AnonymousClass6SR.A01()
            java.util.List r0 = r5.A0W
            int r1 = r0.size()
            r2.A06 = r1
            int r0 = r2.A05
            int r0 = java.lang.Math.max(r0, r1)
            r2.A05 = r0
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0094
            r0 = 1
            r2.A0K = r0
        L_0x0094:
            r5.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWM.Ejh(com.instagram.common.gallery.model.GalleryItem, boolean, boolean):void");
    }

    public JWM(Context context, UserSession userSession, C59752JWo jWo, MUO muo, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A0O = userSession;
        this.A0J = context;
        this.A0a = jWo;
        this.A0g = z;
        this.A0F = i;
        this.A0G = i2;
        this.A0H = i3;
        this.A0Q = muo;
        this.A0I = i4;
        this.A0f = z2;
        this.A0X = z3;
        0sn r1 = 0sn.A00;
        this.A03 = r1;
        this.A0D = r1;
        this.A0E = 0Yt.A0E();
        Comparator reverseOrder = Collections.reverseOrder(JXI.A00);
        0qQ.A07(reverseOrder);
        this.A0R = reverseOrder;
        this.A0T = AnonymousClass7TE.A1C();
        this.A0V = AnonymousClass7TE.A1C();
        this.A0U = AnonymousClass7TE.A1C();
        this.A0S = AnonymousClass7TE.A1C();
        this.A0Z = new JWp();
        this.A0P = new JWT(AnonymousClass05K.A00);
        this.A0Y = new JWT(AnonymousClass05K.A0C);
        this.A0N = AnonymousClass1Nd.A00(userSession);
        this.A06 = JXJ.A00;
        C361588gT A002 = C361578gS.A00(userSession);
        this.A0b = A002;
        02z A012 = 106.A01((Object) null);
        this.A0e = A012;
        19B r2 = 19B.A00;
        this.A0K = C226292g8.A00(r2, A012);
        AnonymousClass0Ud r12 = A002.A05;
        C61820pm A013 = C66193MHj.A01(r12, A012, 10);
        this.A0d = A013;
        this.A0M = C226292g8.A00(r2, A013);
        C61820pm A014 = C66193MHj.A01(r12, A012, 9);
        this.A0c = A014;
        this.A0L = C226292g8.A00(r2, A014);
    }

    public final int BCw(int i) {
        return this.A0I;
    }
}
