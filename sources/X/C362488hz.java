package X;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8hz  reason: invalid class name and case insensitive filesystem */
public final class C362488hz implements AnonymousClass8XX, C361678gc, C361658ga, C361668gb {
    public static final List A0H = new ArrayList(0);
    public AnonymousClass2tB A00;
    public String A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final C348297yD A04;
    public final C355608Qq A05;
    public final AnonymousClass2t9 A06;
    public final UserSession A07;
    public final C362168hS A08;
    public final C361698ge A09;
    public final String A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final C362078hJ A0D;
    public final C2801950r A0E;
    public final boolean A0F;
    public volatile boolean A0G;

    /* JADX WARNING: type inference failed for: r1v24, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v25, types: [X.2tF, java.lang.Object] */
    public C362488hz(Activity activity, AnonymousClass0iw r21, C348297yD r22, C355608Qq r23, UserSession userSession, C362078hJ r25, C362168hS r26, C2801950r r27, C361698ge r28, String str, C62320sa r30, C62320sa r31, boolean z) {
        Integer num;
        C362168hS r2 = r26;
        0qQ.A0B(r2, 5);
        this.A07 = userSession;
        this.A0D = r25;
        this.A09 = r28;
        this.A08 = r2;
        this.A0C = r30;
        this.A0B = r31;
        this.A05 = r23;
        this.A03 = r21;
        this.A04 = r22;
        this.A0E = r27;
        this.A0A = str;
        this.A0F = z;
        Context applicationContext = activity.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A02 = applicationContext;
        AnonymousClass9LC r12 = new AnonymousClass9LC(this, 42);
        Integer num2 = AnonymousClass05K.A01;
        UserSession userSession2 = this.A07;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession2, 36321060954580017L)) {
            num = num2;
        } else {
            num = AnonymousClass05K.A00;
        }
        AnonymousClass9IV r6 = new AnonymousClass9IV(4, (Object) new C376529Ii(num2, num2, num2, num, 8), (Object) new C376509Ig(num2, num2, AnonymousClass05K.A00, Integer.valueOf(((int) 182.A01(r3, userSession2, 36602080663900705L)) != 24 ? 16 : 24)));
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(activity);
        C361698ge r10 = this.A09;
        A002.A01(new C362508i1(r6, this.A04, this.A05, userSession2, r10, this.A0A, r12));
        C376529Ii r5 = (C376529Ii) r6.A01;
        A002.A01(new C362518i2(r5, this.A0C, r12));
        AnonymousClass0iw r13 = this.A03;
        A002.A01(new C361708gf(r6, r13, userSession2, r10, new AnonymousClass9LC(this, 41)));
        A002.A01(new C362528i3(r5));
        A002.A01(new Object());
        A002.A01(new Object());
        A002.A01(new C362558i6(r13, r10));
        A002.A08 = true;
        A002.A06 = "GalleryGridAdapter";
        this.A06 = A002.A00();
        C61410nE r32 = C61410nE.A00;
        C61480nO A003 = 0nY.A00();
        0qQ.A07(A003);
        0qQ.A0B(r32, 1);
        new C62710vD(r32, A003).ATE(new C362618iC(this));
    }

    public final void A01(GalleryItem galleryItem, Bitmap bitmap) {
        Boolean bool;
        C362168hS r6 = this.A08;
        AnonymousClass9LG r7 = new AnonymousClass9LG(this, 47);
        C361698ge r4 = this.A09;
        AnonymousClass9LG r3 = new AnonymousClass9LG(this, 48);
        C328777Ge r2 = r6.A0H;
        if (r2.CbT(galleryItem)) {
            r2.EDm(galleryItem);
            if (!(r2 instanceof C328767Gd) || !(r6.A02 instanceof AnonymousClass80O)) {
                C362168hS.A00(galleryItem, r6);
                r6.A01(r3);
                bool = false;
            } else {
                return;
            }
        } else if (r2.A8m(new AnonymousClass9SZ(galleryItem, bitmap))) {
            r6.A01(r3);
            bool = true;
        } else {
            r7.invoke(Integer.valueOf(r2.BPA()));
            return;
        }
        boolean booleanValue = bool.booleanValue();
        0qQ.A0B(galleryItem, 0);
        r4.DMO(galleryItem, booleanValue);
    }

    public final void Dmz() {
    }

    public final void Ecr(Integer num, String str, List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        String str2 = str;
        if (list2.isEmpty() || !0qQ.A0K(this.A01, str2)) {
            C362168hS r1 = this.A08;
            0sm A0E2 = 0Yt.A0E();
            0qQ.A0B(A0E2, 0);
            r1.A06 = A0E2;
        }
        this.A01 = str2;
        ArrayList arrayList = new ArrayList();
        for (Object next : list2) {
            String str3 = ((Medium) next).A0X;
            0qQ.A0B(str3, 0);
            11S r12 = C362948il.A00;
            String name = new File(str3).getName();
            0qQ.A07(name);
            if (!r12.A08(name)) {
                arrayList.add(next);
            }
        }
        C362168hS r7 = this.A08;
        LinkedHashMap A032 = 0Yt.A03(r7.A06);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            Medium medium = (Medium) next2;
            int CMJ = r7.A0H.CMJ(medium);
            Integer valueOf = Integer.valueOf(medium.A05);
            String A002 = C362968io.A00.A00(medium, this.A07);
            GalleryItem.LocalGalleryMedium localGalleryMedium = new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
            boolean z = false;
            if (CMJ != -1) {
                z = true;
            }
            AnonymousClass9I9 r18 = new AnonymousClass9I9((DefaultConstructorMarker) null, CMJ, 0, 12, 3, z, false);
            boolean z2 = r7.A0A;
            boolean z3 = r7.A0E;
            int columnCount = this.A0D.getColumnCount();
            Integer valueOf2 = Integer.valueOf(columnCount);
            Context context = this.A02;
            boolean z4 = z2;
            A032.put(valueOf, new C361718gg(r18, localGalleryMedium, new C362958in(valueOf2, Integer.valueOf(AnonymousClass1GB.A01(((float) ((AnonymousClass8XF.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * (columnCount - 1))) / columnCount)) / 0.5625f)), z4, false, z3, false, this.A0G, r7.A02 instanceof AnonymousClass9QA, this.A0F), A002));
            i = i2;
        }
        r7.A06 = 0Yt.A0B(A032);
        A02(this.A00);
        C2801950r r2 = this.A0E;
        if (r2 != null && str != null && str2.length() != 0 && list2.size() > 50) {
            C362078hJ r13 = this.A0D;
            if (r13.Aso() != null) {
                r13.ETJ((Integer) null);
                27p.A01(this.A07).A0J.A03(r2, "set_media");
            }
        }
    }

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public final int A00() {
        C362168hS r2 = this.A08;
        return r2.A06.size() + r2.A07.size();
    }

    public final void A02(AnonymousClass2tB r24) {
        boolean z;
        ArrayList arrayList;
        int i;
        long millis;
        Integer num;
        C362168hS r9 = this.A08;
        Context context = this.A02;
        C62320sa r0 = this.A0B;
        if (r0 != null) {
            z = ((Boolean) r0.invoke()).booleanValue();
        } else {
            z = false;
        }
        boolean A032 = C2604245p.A03(context);
        C362078hJ r02 = this.A0D;
        boolean CXX = r02.CXX();
        boolean CKC = r02.CKC();
        int columnCount = r02.getColumnCount();
        C361818gr r12 = new C361818gr(context);
        C377469Ly r11 = new C377469Ly(48, (Object) this, (Object) r24);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        int i2 = 0;
        if (z) {
            C362568i7 r3 = new C362568i7(r9.A0A, r9.A0B);
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), 0);
            arrayList2.add(r3);
        }
        C362608iB r32 = r9.A03;
        if (r32 != null) {
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), 0);
            arrayList2.add(r32);
        }
        UserSession userSession = r9.A0G;
        0Tu r13 = 0Tu.A05;
        if (!182.A06(r13, userSession, 36321060954907702L) || 182.A06(r13, userSession, 36316662907540027L)) {
            arrayList = new ArrayList();
            arrayList.addAll(r9.A07.values());
            arrayList.addAll(r9.A06.values());
            if (arrayList.size() > 1) {
                01V.A1D(arrayList, new C378869Rn());
            }
            00v.A10(arrayList);
        } else {
            arrayList = 00k.A0S(00k.A0g(r9.A06.values(), new C362668iI()), 00k.A0g(r9.A07.values(), new C362658iH()));
        }
        if (!A032 || arrayList.isEmpty()) {
            Object obj = new Object();
            int size = arrayList2.size();
            if (size != 0 || !CXX) {
                int i3 = 9 - size;
                for (int i4 = 0; i4 < i3; i4++) {
                    linkedHashMap2.put(Integer.valueOf(arrayList2.size()), 0);
                    arrayList2.add(obj);
                }
            }
        } else {
            Iterator it = arrayList.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C232262tL r1 = (C232262tL) next;
                linkedHashMap2.put(Integer.valueOf(arrayList2.size()), Integer.valueOf(i2));
                arrayList2.add(r1);
                if (i5 % columnCount == 0) {
                    if (r1 instanceof C361718gg) {
                        millis = ((C361718gg) r1).A01.A00.A0C * 1000;
                    } else if (r1 instanceof C361728gh) {
                        RemoteMedia remoteMedia = ((C361728gh) r1).A03.A04;
                        if (remoteMedia == null || (num = remoteMedia.A05) == null) {
                            i = 0;
                        } else {
                            i = num.intValue();
                        }
                        millis = TimeUnit.SECONDS.toMillis((long) i);
                    } else {
                        throw new IllegalArgumentException("Unsupported Media View Model");
                    }
                    arrayList3.add(r12.A00(new Date(millis)));
                    Integer valueOf = Integer.valueOf(i2);
                    linkedHashMap.put(valueOf, Integer.valueOf(arrayList3.size() - 1));
                    linkedHashMap3.put(valueOf, Integer.valueOf(i5));
                    i2++;
                }
                i5 = i6;
            }
        }
        if (CKC) {
            Object obj2 = new Object();
            Integer valueOf2 = Integer.valueOf(i2);
            linkedHashMap3.put(valueOf2, Integer.valueOf(arrayList2.size()));
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), valueOf2);
            arrayList2.add(obj2);
            i2++;
        }
        if (CXX && !r9.A07.values().isEmpty()) {
            String A012 = C63551Kz0.A00.A01(context, userSession);
            String string = context.getString(2131962939);
            0qQ.A07(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
            AnonymousClass7AV.A05(spannableStringBuilder, new C48043ESi(context, userSession, context.getColor(2Yu.A06(context))), string);
            C362588i9 r33 = new C362588i9(spannableStringBuilder);
            Integer valueOf3 = Integer.valueOf(i2);
            linkedHashMap3.put(valueOf3, Integer.valueOf(arrayList2.size()));
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), valueOf3);
            arrayList2.add(r33);
            i2++;
        }
        r9.A00 = i2;
        r9.A04 = arrayList3;
        r9.A09 = linkedHashMap;
        r9.A05 = linkedHashMap2;
        r9.A08 = linkedHashMap3;
        if (!arrayList.isEmpty()) {
            for (C231402rc onChanged : r9.A0I.values()) {
                onChanged.onChanged();
            }
        }
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(arrayList2);
        r11.invoke(viewModelListUpdate);
        r9.A0C = false;
    }

    public final void A03(boolean z, boolean z2, boolean z3) {
        C362168hS r2 = this.A08;
        C361698ge r4 = this.A09;
        AnonymousClass9LC r1 = new AnonymousClass9LC(this, 43);
        r2.A0B = z3;
        boolean z4 = z;
        boolean z5 = z2;
        if (r2.A0A != z4 || r2.A0E != z5) {
            r2.A0A = z4;
            r2.A0E = z5;
            r4.DSb();
            Map map = r2.A06;
            LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                C361718gg r10 = (C361718gg) entry.getValue();
                C362958in r0 = r10.A02;
                boolean z6 = r0.A03;
                C362958in r13 = new C362958in(r0.A00, r0.A01, z4, z6, z5, r0.A02, r0.A05, r0.A07, r0.A04);
                C362968io r5 = C362968io.A00;
                GalleryItem.LocalGalleryMedium localGalleryMedium = r10.A01;
                linkedHashMap.put(key, new C361718gg(r10.A00, localGalleryMedium, r13, r5.A00(localGalleryMedium.A00, r2.A0G)));
            }
            r2.A06 = linkedHashMap;
            Map map2 = r2.A07;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key2 = entry2.getKey();
                entry2.getKey();
                C361728gh r6 = (C361728gh) entry2.getValue();
                String str = r6.A05;
                ImageUrl imageUrl = r6.A04;
                String str2 = r6.A06;
                int i = r6.A01;
                int i2 = r6.A00;
                GalleryItem galleryItem = r6.A03;
                linkedHashMap2.put(key2, new C361728gh(galleryItem, imageUrl, str, str2, r6.A07, i, i2, r2.A0H.CMB(galleryItem), z4, r6.A09));
            }
            r2.A07 = linkedHashMap2;
            r1.invoke();
        }
    }

    public final int AJv(int i) {
        Number number = (Number) this.A08.A05.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final int AJz(int i) {
        Number number = (Number) this.A08.A08.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final List AN0() {
        return A0H;
    }

    public final int BCw(int i) {
        return this.A08.A01;
    }

    public final List BPh() {
        Collection<C361718gg> values = this.A08.A06.values();
        ArrayList arrayList = new ArrayList(0Yv.A1E(values, 10));
        for (C361718gg r0 : values) {
            arrayList.add(r0.A01.A00);
        }
        return arrayList;
    }

    public final int Bom() {
        return this.A08.A00;
    }

    public final int Bqm(int i) {
        Number number = (Number) this.A08.A09.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public final List Bqr() {
        return this.A08.A04;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        C362788iU r1 = new C362788iU(dataSetObserver);
        this.A06.registerAdapterDataObserver(r1);
        this.A08.A0I.put(dataSetObserver, r1);
    }

    public final int getItemCount() {
        return A00();
    }
}
