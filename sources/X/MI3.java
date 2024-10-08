package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MI3 extends AnonymousClass1Ek implements 0sI {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05 = 1;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MI3(Context context, C60194JhD jhD, AnonymousClass4D7 r4) {
        super(5, r4);
        this.A00 = context;
        this.A06 = jhD;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MI3 mi3;
        if (this.A05 != 0) {
            boolean A1a = AnonymousClass7TE.A1a(obj4);
            mi3 = new MI3((Context) this.A00, (C60194JhD) this.A06, (AnonymousClass4D7) obj5);
            mi3.A01 = obj;
            mi3.A02 = obj2;
            mi3.A03 = obj3;
            mi3.A04 = A1a;
        } else {
            boolean z = this.A04;
            mi3 = new MI3((DirectShareSheetFragmentViewModel) this.A06, (AnonymousClass4D7) obj5, z);
            mi3.A00 = obj;
            mi3.A01 = obj2;
            mi3.A02 = obj3;
            mi3.A03 = obj4;
        }
        return mi3.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Comparator fw8;
        Character ch;
        Character ch2;
        C361628gX r0;
        if (this.A05 != 0) {
            0eS.A00(obj);
            Map map = (Map) this.A01;
            C361628gX r3 = (C361628gX) this.A02;
            LR6 lr6 = (LR6) this.A03;
            if (this.A04 && lr6 != null) {
                String str = lr6.A00;
                if (str != null && (r0 = (C361628gX) map.get(str)) != null) {
                    List<RemoteMedia> A042 = AJ5.A04(r0.A02);
                    0qQ.A0B(A042, 0);
                    ArrayList A0r = AnonymousClass7TG.A0r(A042);
                    for (RemoteMedia galleryItem : A042) {
                        A0r.add(new GalleryItem(galleryItem));
                    }
                    return A0r;
                } else if (JTT.A1Z(C51968G9o.A0J(this.A00), lr6.A01, 2131962528)) {
                    List<RemoteMedia> A043 = AJ5.A04(r3.A02);
                    0qQ.A0B(A043, 0);
                    ArrayList A0r2 = AnonymousClass7TG.A0r(A043);
                    for (RemoteMedia galleryItem2 : A043) {
                        A0r2.add(new GalleryItem(galleryItem2));
                    }
                    return MAY.A00(00k.A0k(00k.A0S(lr6.A02, A0r2)), 24);
                }
            }
            return 0sn.A00;
        }
        0eS.A00(obj);
        Iterable iterable = (Iterable) this.A00;
        List list = (List) this.A01;
        Object obj2 = this.A02;
        Object obj3 = this.A03;
        EVC evc = EVC.PROGRESS;
        if (!(obj2 == evc || obj3 == evc)) {
            ArrayList<F0B> A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (true) {
                Object obj4 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List list2 = ((F0B) next).A05;
                if (list2 != null) {
                    obj4 = 00k.A0J(list2);
                }
                if (00k.A0u(iterable, obj4)) {
                    A1C.add(next);
                }
            }
            ArrayList A0r3 = AnonymousClass7TG.A0r(A1C);
            for (F0B f0b : A1C) {
                String str2 = f0b.A00;
                if (str2 == null) {
                    str2 = "";
                }
                List list3 = f0b.A04;
                0qQ.A07(list3);
                Object A0I = 00k.A0I(list3);
                0qQ.A07(A0I);
                String str3 = (String) A0I;
                String str4 = f0b.A01;
                if (str4 != null) {
                    ch = JTS.A0b(str4);
                } else {
                    ch = null;
                }
                String str5 = f0b.A02;
                if (str5 != null) {
                    ch2 = JTS.A0b(str5);
                } else {
                    ch2 = null;
                }
                Character[] chArr = {ch, ch2};
                0qQ.A0B(chArr, 0);
                A0r3.add(new C53374Gn4((Bitmap) null, str2, str3, 00k.A0P("", "", "", 03t.A0I(chArr), (0sP) null), R.drawable.instagram_contacts_pano_outline_24, 0));
            }
            boolean z = this.A04;
            DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = (DirectShareSheetFragmentViewModel) this.A06;
            if (z) {
                fw8 = new C51566FwC((Object) new C51566FwC((Object) directShareSheetFragmentViewModel, 1), 2);
            } else {
                fw8 = new C51562Fw8(2);
            }
            List A0g = 00k.A0g(A0r3, fw8);
            UserSession userSession = directShareSheetFragmentViewModel.A0L;
            0qQ.A0B(userSession, 0);
            ((C50321FYb) userSession.A01(C50321FYb.class, new C67570Mq4(userSession, 49))).A00.addAll(A0g);
            05G r2 = directShareSheetFragmentViewModel.A0a;
            JTO.A16(r2).addAll(A0g);
            directShareSheetFragmentViewModel.A0f.Epw(00k.A0a(JTO.A0x(r2)));
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MI3(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, AnonymousClass4D7 r3, boolean z) {
        super(5, r3);
        this.A04 = z;
        this.A06 = directShareSheetFragmentViewModel;
    }
}
