package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8gL  reason: invalid class name and case insensitive filesystem */
public abstract class C361508gL implements C361518gM {
    public C355148Ov A00;
    public final Context A01;
    public final AnonymousClass2k4 A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LM(this, 39));
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass8ZY A00() {
        return ((C362038hF) this).A00.A02;
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [java.lang.Object, X.2jE] */
    public final void A01(View view, C361528gN r36, boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Object obj;
        C361528gN r12 = r36;
        0qQ.A0B(r12, 0);
        View view2 = view;
        0qQ.A0B(view2, 1);
        C355148Ov r0 = this.A00;
        if (r0 == null || !r0.isShowing()) {
            Context context = this.A01;
            UserSession userSession = this.A03;
            this.A00 = new C355148Ov(context, userSession, (Integer) null, this.A06);
            ArrayList arrayList = new ArrayList();
            String string = context.getString(2131952866);
            0qQ.A07(string);
            KKE kke = new KKE(string);
            String string2 = context.getString(2131952863);
            0qQ.A07(string2);
            KKC kkc = new KKC(string2);
            String string3 = context.getString(2131952865);
            0qQ.A07(string3);
            ArrayList A1M = 0sr.A1M(new C63945LEl[]{kke, kkc, new KKD(string3)});
            if (!this.A05) {
                String string4 = context.getString(2131952867);
                0qQ.A07(string4);
                A1M.add(new KKF(string4));
            }
            List folders = r12.getFolders();
            Folder currentFolder = r12.getCurrentFolder();
            ArrayList<0eP> arrayList2 = new ArrayList<>();
            Iterator it = A1M.iterator();
            while (it.hasNext()) {
                C63945LEl lEl = (C63945LEl) it.next();
                Iterator it2 = folders.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((Folder) obj).A02 == lEl.A00()) {
                        break;
                    }
                }
                Folder folder = (Folder) obj;
                if (folder != null && !folder.A05.isEmpty()) {
                    arrayList2.add(new 0eP(lEl, folder));
                }
            }
            for (0eP r7 : arrayList2) {
                C63945LEl lEl2 = (C63945LEl) r7.A00;
                Folder folder2 = (Folder) r7.A01;
                String A012 = lEl2.A01();
                if (0qQ.A0K(folder2, currentFolder)) {
                    drawable = context.getDrawable(R.drawable.instagram_check_pano_filled_24);
                } else {
                    drawable = null;
                }
                Integer num = lEl2.A00;
                if (num != null) {
                    drawable2 = context.getDrawable(num.intValue());
                } else {
                    drawable2 = null;
                }
                arrayList.add(new C367618rI(drawable, drawable2, (C15048ULb) null, new C40542Adp(this, folder2), (Integer) null, A012, 0, context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, false, true, false, false, false));
            }
            String string5 = context.getResources().getString(2131964571);
            0qQ.A07(string5);
            arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_collections_pano_outline_24), (C15048ULb) null, new C40529Adc(this), (Integer) null, string5, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, false, true, false, false, false));
            List folders2 = r12.getFolders();
            if (!(folders2 instanceof Collection) || !folders2.isEmpty()) {
                Iterator it3 = folders2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (((Folder) it3.next()).A07) {
                        if (new Object().A01(userSession, true)) {
                            String string6 = context.getResources().getString(2131964578);
                            0qQ.A07(string6);
                            arrayList.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_lux_pano_outline_24), (C15048ULb) null, new C40530Add(this), (Integer) null, string6, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, false, true, false, false, false));
                        }
                    }
                }
            }
            C355148Ov r72 = this.A00;
            if (z) {
                if (r72 != null) {
                    r72.A02(arrayList);
                    r72.showAsDropDown(view2, 0, -view2.getHeight(), 8388613);
                }
            } else if (r72 != null) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                r72.A02(arrayList);
                r72.showAsDropDown(view2, dimensionPixelSize, dimensionPixelSize2, 0);
            }
        }
    }

    public final /* synthetic */ void Ch8(C63945LEl lEl, int i) {
    }

    public final /* synthetic */ void Ch9(C61080JwI jwI, int i) {
    }

    public final /* synthetic */ void Cv2() {
    }

    public final /* synthetic */ void DiE(int i, String str) {
    }

    public C361508gL(Context context, AnonymousClass2k4 r5, UserSession userSession, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r5;
        this.A06 = z;
        this.A05 = z2;
    }

    public final void Cuy(C61080JwI jwI, int i) {
        AnonymousClass8ZY A002 = A00();
        if (A002 != null) {
            A002.DSA((C357268Xf) jwI.A00);
        }
        C331157Pu r0 = ((LG7) this.A04.getValue()).A02;
        if (r0 != null) {
            r0.A07();
        }
    }

    public final /* synthetic */ boolean DQC(C63945LEl lEl, int i) {
        return false;
    }
}
