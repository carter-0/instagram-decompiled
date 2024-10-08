package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lz5  reason: case insensitive filesystem */
public final class C65751Lz5 implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65751Lz5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    public final void D9V() {
        C331157Pu r2;
        Activity activity;
        Object obj;
        C59944JcA jcA;
        C347087wF r0;
        switch (this.A00) {
            case 0:
                r2 = (C331157Pu) this.A03;
                activity = (Activity) this.A01;
                obj = this.A02;
                break;
            case 1:
                C63135Ks3.A00((Activity) this.A01, (Fragment) this.A02, (UserSession) this.A03);
                return;
            case 2:
                new Handler().postDelayed(new M6V(this, new C65747Lz1(this, 1)), 400);
                return;
            case 3:
                L0I l0i = (L0I) this.A02;
                GalleryGridFormat galleryGridFormat = (GalleryGridFormat) this.A01;
                List list = (List) this.A03;
                0qQ.A0B(list, 1);
                int ordinal = galleryGridFormat.ordinal();
                if (ordinal == 2) {
                    C362048hG r3 = l0i.A00;
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A0r.add(JTR.A0f((Medium) JTO.A1A(it).A00));
                    }
                    C362048hG.A0K(r3, A0r);
                    return;
                } else if (ordinal == 1) {
                    AnonymousClass8XA r4 = l0i.A00.A0w;
                    UserSession userSession = r4.A0F;
                    C365928nu A002 = C365918nt.A00(userSession);
                    28D r11 = r4.A0P.A00.A01;
                    C279284yO r12 = (C279284yO) r4.A0G.A08.A00;
                    ArrayList A0r2 = AnonymousClass7TG.A0r(list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        A0r2.add(JTO.A1A(it2).A00);
                    }
                    A002.A00(r11, r12, 27p.A01(userSession).A0R(), A0r2, true);
                    C65012Llp llp = (C65012Llp) r4.A0X.A00.A00();
                    AnonymousClass0fN.A00((Dialog) llp.A0F.getValue());
                    llp.A07.A03(0);
                    int size = list.size();
                    llp.A00 = size;
                    C347087wF[] r02 = C347077wE.A03;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    018.A18(A1C, C347077wE.A01);
                    018.A18(A1C, C347077wE.A02);
                    C59943Jc9 jc9 = llp.A0B;
                    List list2 = jc9.A01;
                    if (list2.size() != A1C.size()) {
                        jc9.A02.clear();
                        jc9.A03.clear();
                        jc9.A04.clear();
                        list2.clear();
                        Iterator it3 = A1C.iterator();
                        while (it3.hasNext()) {
                            C394479yB r03 = C394479yB.$redex_init_class;
                            switch (((C347087wF) it3.next()).ordinal()) {
                                case 0:
                                    jc9.A07();
                                    continue;
                                case 1:
                                    jcA = jc9.A00;
                                    r0 = C347087wF.A0E;
                                    break;
                                case 2:
                                    jc9.A06();
                                    continue;
                                case 3:
                                    jcA = jc9.A00;
                                    r0 = C347087wF.A0D;
                                    break;
                                case 4:
                                    jc9.A09();
                                    continue;
                                case 5:
                                    jcA = jc9.A00;
                                    r0 = C347087wF.A0B;
                                    break;
                                case 6:
                                    jc9.A05();
                                    continue;
                                case 7:
                                    jcA = jc9.A00;
                                    r0 = C347087wF.A0A;
                                    break;
                                case 8:
                                    jc9.A08();
                                    continue;
                                case 9:
                                    jcA = jc9.A00;
                                    r0 = C347087wF.A0C;
                                    break;
                                default:
                                    0kD.A07("LayoutPostCaptureController", 002.A0R("Unsupported layout configuration: ", llp.A01.A05), (Throwable) null);
                                    continue;
                            }
                            C59943Jc9.A01(jc9, C59944JcA.A00(jcA, r0));
                        }
                    }
                    C347087wF[] A003 = C347077wE.A00(size);
                    C347087wF r04 = (C347087wF) 03t.A05(A003);
                    llp.A01 = r04;
                    GridLayoutManager gridLayoutManager = llp.A04;
                    gridLayoutManager.A1v(r04.A00);
                    C320806sz r05 = llp.A01.A04;
                    if (r05 == null) {
                        r05 = new C320806sz();
                    }
                    gridLayoutManager.A01 = r05;
                    C61751KKq kKq = (C61751KKq) llp.A0E.getValue();
                    kKq.A01.A05(03t.A0J(A003));
                    AnonymousClass8AL r22 = kKq.A01;
                    0nA.A0t(r22.A0P, new C66069MAc(kKq, 3));
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    int size2 = list.size();
                    int i = 0;
                    while (i < size2) {
                        C63809L7p A04 = jc9.A04(llp.A01, i);
                        C71492dQ A032 = jc9.A03(llp.A01, i);
                        Bitmap bitmap = (Bitmap) ((0eP) list.get(i)).A01;
                        Medium medium = (Medium) ((0eP) list.get(i)).A00;
                        C62948Kp0 A004 = C59737JVv.A00((Context) null, llp.A06, medium.A0X, true);
                        if (A004 != null) {
                            String A012 = A004.A01();
                            if (C51966G9m.A1X(A012)) {
                                medium.A0G.A03 = A012;
                            }
                        }
                        if (A032 != null) {
                            A1C2.add(new C63810L7q(bitmap, A032, medium, A04));
                            i++;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    02m.A0p.markerStart(18943966, "total_photos", String.valueOf(size));
                    C60440JlY jlY = llp.A0C;
                    jlY.A00 = new LD3(llp, jlY, size);
                    ArrayList arrayList = jlY.A05;
                    arrayList.clear();
                    arrayList.addAll(A1C2);
                    jlY.notifyDataSetChanged();
                    r4.A0N.A02.A01.A03 = GalleryGridFormat.LAYOUT;
                    return;
                } else {
                    throw AnonymousClass7TF.A0W("Unsupported gallery format: ", galleryGridFormat.name());
                }
            case 4:
                r2 = ((C331127Pr) this.A02).A00();
                activity = (Activity) this.A01;
                obj = this.A03;
                break;
            case 5:
                new Handler().post(new C65992M7d((C63861L9q) this.A02, this.A03));
                return;
            case 6:
                C331157Pu r23 = ((LDJ) this.A03).A01;
                if (r23 != null) {
                    r23.A03((Context) this.A01, (Fragment) this.A02);
                    return;
                }
                return;
            default:
                HNR hnr = (HNR) this.A02;
                if (I5Y.A01((1Xj) this.A01, hnr)) {
                    ((C52033GCf) this.A03).A0H.A0D(hnr);
                    return;
                }
                return;
        }
        r2.A02(activity, (Fragment) obj);
    }

    public final void D9a() {
    }
}
