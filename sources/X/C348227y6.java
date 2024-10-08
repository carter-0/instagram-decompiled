package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7y6  reason: invalid class name and case insensitive filesystem */
public final class C348227y6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8XY A01;
    public final /* synthetic */ AnonymousClass8XW A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ Map A04;

    public C348227y6(AnonymousClass8XY r1, AnonymousClass8XW r2, List list, Map map, int i) {
        this.A02 = r2;
        this.A03 = list;
        this.A04 = map;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        List list;
        List list2;
        List<C381559bx> list3;
        Integer num;
        AnonymousClass8XX r0;
        AnonymousClass8XW r11 = this.A02;
        AnonymousClass8XX r02 = r11.A01;
        if (r02 == null || (list = r02.AN0()) == null) {
            list = 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        List<Medium> list4 = this.A03;
        for (Medium A022 : list4) {
            AnonymousClass8XW.A02(A022, r11, this.A04);
        }
        AnonymousClass8XU r5 = r11.A0A;
        if (!r5.A0H || (r0 = r11.A01) == null || (list2 = r0.BPh()) == null) {
            list2 = 0sn.A00;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GalleryItem galleryItem = (GalleryItem) it.next();
                if (galleryItem.A02() && (00k.A0u(list4, galleryItem.A00) || 00k.A0u(list2, galleryItem.A00))) {
                    it.remove();
                }
            }
        }
        0t0 A012 = AnonymousClass0eN.A01(new AnonymousClass9M1(27, list4, r11));
        if (!r5.A0I || !((Boolean) A012.getValue()).booleanValue()) {
            list3 = null;
        } else {
            AnonymousClass8XT r1 = r5.A0D;
            if (r1 != null) {
                UserSession userSession = r11.A09;
                if (userSession != null) {
                    num = AnonymousClass5Ea.A00(userSession);
                } else {
                    num = AnonymousClass05K.A00;
                }
                list3 = r1.C2u(num);
                for (C381559bx r3 : list3) {
                    List<Medium> list5 = r3.A05;
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(list5, 10));
                    for (Medium medium : list5) {
                        arrayList2.add(Integer.valueOf(medium.A05));
                    }
                    int hashCode = String.valueOf(Arrays.hashCode(new Object[]{arrayList2, r3.A02})).hashCode();
                    String str = r3.A01;
                    if (str == null) {
                        str = r3.A04;
                    }
                    Folder folder = new Folder(str, r3.A03, hashCode, true);
                    for (Medium medium2 : list5) {
                        AnonymousClass8XO r7 = r5.A08;
                        if ((r7 != AnonymousClass8XO.PHOTO_ONLY || medium2.A05() || 0qQ.A0K(medium2.A0I, true)) && ((r7 != AnonymousClass8XO.STATIC_PHOTO_ONLY || medium2.A05()) && (r7 != AnonymousClass8XO.VIDEO_ONLY || medium2.CeS()))) {
                            AnonymousClass8XW.A01(medium2, folder);
                        }
                    }
                    this.A04.put(Integer.valueOf(hashCode), folder);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        AnonymousClass8XY r10 = this.A01;
        r10.A00.post(new C348237y7(r10, r11, list3, arrayList, this.A04, A012, size, this.A00));
    }
}
