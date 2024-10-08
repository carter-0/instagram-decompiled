package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.UlZ  reason: case insensitive filesystem */
public final class C15957UlZ extends C324596za {
    public final int A00;
    public final Object A01;

    public C15957UlZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r6) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = AnonymousClass0fD.A03(-387519770);
            i = -1093224139;
        } else {
            A03 = AnonymousClass0fD.A03(-1076487252);
            C15384Ubj ubj = (C15384Ubj) this.A01;
            C59689JTv.A0F(ubj.getActivity(), "live_archive_fail_refresh", 2131965150);
            C15384Ubj.A02(ubj);
            i = 1304711041;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = AnonymousClass0fD.A03(-1295732291);
            i = -1964616280;
        } else {
            A03 = AnonymousClass0fD.A03(-198047874);
            AnonymousClass32G r2 = (AnonymousClass32G) this.A01;
            if (r2.A0X() != null) {
                ((RefreshableListView) r2.A0X()).setIsLoading(false);
                C46445Df7.A01(r2, false);
            }
            i = 722767064;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onStart() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = AnonymousClass0fD.A03(1726824034);
            i = -778053354;
        } else {
            A03 = AnonymousClass0fD.A03(-1773606511);
            C15384Ubj ubj = (C15384Ubj) this.A01;
            if (ubj.A0X() != null) {
                ((RefreshableListView) ubj.A0X()).setIsLoading(true);
            }
            C15384Ubj.A02(ubj);
            i = -1205371489;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        XA3 xa3;
        ProductImageContainer productImageContainer;
        XA4 xa4;
        if (this.A00 != 0) {
            i = AnonymousClass0fD.A03(53925686);
            C43825CEr cEr = (C43825CEr) obj;
            int A0D = AnonymousClass7TG.A0D(cEr, 1158379022);
            C45203CsE A002 = cEr.FH3();
            ArrayList arrayList = new ArrayList();
            List list = A002.A00;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 != 0) {
                    C59721JVf jVf = (C59721JVf) 00k.A0O(list, i3);
                    ImageInfo imageInfo = null;
                    if (jVf == null || (xa4 = (XA4) jVf.A00) == null) {
                        xa3 = null;
                    } else {
                        xa3 = ((C53466Goy) xa4).A00;
                    }
                    Context context = ((Fragment) this.A01).getContext();
                    if (context != null) {
                        if (!(xa3 == null || (productImageContainer = ((C42109BHn) xa3).A00) == null)) {
                            imageInfo = productImageContainer.BGO();
                        }
                        ExtendedImageUrl A012 = 1iI.A01(context, imageInfo);
                        if (A012 != null) {
                            arrayList.add(A012);
                        }
                    }
                }
            }
            LDY ldy = ((C15402UcC) this.A01).A00;
            if (ldy != null) {
                ldy.A00(arrayList);
            }
            AnonymousClass0fD.A0A(-1070621453, A0D);
            i2 = 1462379882;
        } else {
            i = AnonymousClass0fD.A03(-1815580522);
            CGP cgp = (CGP) obj;
            int A03 = AnonymousClass0fD.A03(1866006356);
            C15384Ubj ubj = (C15384Ubj) this.A01;
            CallerContext callerContext = C15384Ubj.A08;
            UserSession userSession = ubj.A01;
            Map map = ubj.A06;
            AnonymousClass7TG.A1T(cgp, userSession, map);
            List<C45408Cvo> list2 = cgp.A00;
            Collections.sort(list2, new C20381WqM((0sL) C20790Wz2.A00, 8));
            for (C45408Cvo cvo : list2) {
                C270194gL r1 = cvo.A02;
                if (r1 != null) {
                    1OP r0 = 1OP.$redex_init_class;
                    ReelStore A032 = ReelStore.A03(userSession);
                    0qQ.A07(A032);
                    A032.A0G(r1);
                    String str = r1.A0X;
                    str.getClass();
                    map.put(str, cvo);
                }
            }
            C15384Ubj.A01(ubj);
            AnonymousClass0fD.A0A(-1384312544, A03);
            i2 = 1317116730;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = AnonymousClass0fD.A03(-407784764);
            AnonymousClass0fD.A0A(-1290117047, AnonymousClass0fD.A03(-2104351167));
            i = 1873998196;
        } else {
            A03 = AnonymousClass0fD.A03(1665412268);
            AnonymousClass0fD.A0A(-2009375148, AnonymousClass0fD.A03(-1786891850));
            i = -510684452;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
