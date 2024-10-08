package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lnj  reason: case insensitive filesystem */
public final class C65121Lnj implements C361698ge, C362058hH, C361528gN, C362078hJ, AnonymousClass8XQ, 1DN, C66421MRb, AdapterView.OnItemSelectedListener {
    public int A00;
    public Medium A01;
    public C339797kB A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public Integer A09;
    public final int A0A;
    public final int A0B;
    public final Activity A0C;
    public final Drawable A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final ImageView A0G;
    public final GridLayoutManager A0H;
    public final RecyclerView A0I;
    public final C355608Qq A0J;
    public final C362488hz A0K;
    public final C328767Gd A0L;
    public final AnonymousClass8XW A0M;
    public final TriangleSpinner A0N;
    public final Runnable A0O = new C65851M1r(this);
    public final View A0P;
    public final ViewGroup A0Q;
    public final KB1 A0R;
    public final C60051JeJ A0S;

    public C65121Lnj(Activity activity, ViewGroup viewGroup, ImageView imageView, AnonymousClass07i r33, KB1 kb1, AnonymousClass0iw r35, UserSession userSession, TriangleSpinner triangleSpinner) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 4);
        ImageView imageView2 = imageView;
        TriangleSpinner triangleSpinner2 = triangleSpinner;
        AnonymousClass7TG.A1S(imageView2, triangleSpinner2);
        AnonymousClass0iw r27 = r35;
        0qQ.A0B(r27, 8);
        Activity activity2 = activity;
        this.A0C = activity2;
        this.A0F = viewGroup2;
        this.A0G = imageView2;
        ViewGroup viewGroup3 = (ViewGroup) AnonymousClass7TF.A0G(viewGroup2, R.id.gallery_container);
        this.A0Q = viewGroup3;
        C328767Gd r15 = new C328767Gd(userSession2);
        this.A0L = r15;
        Integer num = AnonymousClass05K.A00;
        this.A09 = num;
        this.A00 = -1;
        Resources resources = activity2.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        0qQ.A07(displayMetrics);
        RectF rectF = 0nA.A01;
        float f = ((float) displayMetrics.widthPixels) / ((float) displayMetrics.heightPixels);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0A = dimensionPixelSize;
        int A092 = (0nA.A09(activity2) - (dimensionPixelSize * 2)) / 3;
        int A042 = JTO.A04((float) A092, f);
        KB1 kb12 = kb1;
        this.A0R = kb12;
        C355608Qq r17 = new C355608Qq(activity2, userSession2, num, A092, A042, false);
        this.A0J = r17;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity2, 3);
        this.A0H = gridLayoutManager;
        List list = C362488hz.A0H;
        C362168hS r20 = new C362168hS(userSession2, r15, A042);
        Activity activity3 = activity2;
        AnonymousClass0iw r152 = r27;
        C362488hz r13 = new C362488hz(activity3, r152, (C348297yD) null, r17, userSession2, this, r20, (C2801950r) null, this, (String) null, (C62320sa) null, (C62320sa) null, false);
        this.A0K = r13;
        AnonymousClass8XN r1 = new AnonymousClass8XN(r33, r17);
        r1.A03 = AnonymousClass8XO.PHOTO_ONLY;
        r1.A00 = JTO.A04((float) System.currentTimeMillis(), 1000.0f) - Integer.MAX_VALUE;
        r1.A0A = true;
        r1.A07 = this;
        this.A0M = new AnonymousClass8XW(activity2, (2Cn) null, r13, new AnonymousClass8XU(r1));
        this.A0P = viewGroup2.requireViewById(R.id.gallery_empty);
        this.A0E = viewGroup2.requireViewById(R.id.gallery_loading_spinner);
        RecyclerView A0I2 = DbT.A0I(viewGroup3, R.id.gallery_recycler_view);
        this.A0I = A0I2;
        this.A0B = activity2.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        this.A0D = activity2.getDrawable(R.drawable.nav_gallery);
        A0I2.setAdapter(r13.A06);
        A0I2.setLayoutManager(gridLayoutManager);
        A0I2.setOverScrollMode(2);
        C60467Jlz.A00(A0I2, this, 2);
        this.A0N = triangleSpinner2;
        C60051JeJ jeJ = new C60051JeJ(this);
        this.A0S = jeJ;
        triangleSpinner2.setAdapter(jeJ);
        triangleSpinner2.setOnItemSelectedListener(this);
        imageView2.setVisibility(0);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(imageView2);
        A0m.A07 = true;
        C61685KHt.A00(A0m, kb12, 4);
    }

    public final void CLL(boolean z) {
    }

    public final boolean CV4() {
        return false;
    }

    public final boolean CV5() {
        return false;
    }

    public final void DCx(Exception exc) {
    }

    public final void DDR() {
    }

    public final /* synthetic */ void DG3(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    public final /* synthetic */ void DLy(GalleryItem galleryItem, MQT mqt, int i) {
    }

    public final /* synthetic */ void DM8(View view, GalleryItem galleryItem, MQT mqt, int i) {
    }

    public final /* synthetic */ void DMO(GalleryItem galleryItem, boolean z) {
    }

    public final void DMR(GalleryItem galleryItem, MQT mqt, int i, boolean z) {
        0qQ.A0B(mqt, 1);
        if (!(mqt instanceof C59787JYg)) {
            return;
        }
        if (z) {
            this.A0K.A01(galleryItem, ((C59787JYg) mqt).A00);
            return;
        }
        Medium medium = galleryItem.A00;
        if (medium == null) {
            return;
        }
        if (medium.isValid() || medium.A05()) {
            this.A09 = AnonymousClass05K.A01;
            KB1 kb1 = this.A0R;
            if (!kb1.A0B) {
                kb1.A0B = true;
                SQH.A02(kb1.A0R.getParentFragmentManager());
                LP6 lp6 = kb1.A02;
                if (lp6 != null) {
                    String str = medium.A0X;
                    0qQ.A0B(str, 0);
                    Handler handler = lp6.A02;
                    if (handler != null) {
                        handler.removeMessages(1);
                        handler.removeMessages(2);
                        handler.removeMessages(3);
                        Message obtainMessage = handler.obtainMessage(3, str);
                        0qQ.A07(obtainMessage);
                        handler.sendMessage(obtainMessage);
                        return;
                    }
                    lp6.A07.DK7();
                    return;
                }
                KB1.A01(kb1);
            }
        }
    }

    public final void DQY(AnonymousClass8XW r5, List list, List list2, int i) {
        0qQ.A0B(list2, 2);
        if (!this.A03) {
            this.A0M.A0A.A09.AHU();
            this.A0K.Ecr((Integer) null, "", AnonymousClass7TE.A1C());
            return;
        }
        if (list2.isEmpty()) {
            this.A0G.setImageDrawable(this.A0D);
            this.A01 = null;
        } else {
            Medium medium = (Medium) list2.get(0);
            this.A01 = medium;
            C355608Qq r1 = this.A0J;
            if (medium != null) {
                r1.A04(medium, new C64716Lgp(this, 0));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0fE.A00(this.A0S, 1389459069);
        if (this.A04) {
            if (this.A00 >= 0) {
                int i2 = 0;
                int size = list2.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (((Medium) list2.get(i2)).A05 == this.A00) {
                        this.A0H.A1p(i2, 0);
                        break;
                    } else {
                        i2++;
                    }
                }
                this.A00 = -1;
            }
            this.A0E.postDelayed(this.A0O, 300);
        }
    }

    public final /* synthetic */ void DSb() {
    }

    public final void DWm(Map map) {
        this.A07 = false;
        if (C2604245p.A03(this.A0C)) {
            C339797kB r0 = this.A02;
            if (r0 != null) {
                r0.A00();
            }
            this.A02 = null;
            A00(this);
            return;
        }
        this.A06 = true;
        A01(this);
    }

    public final /* synthetic */ void DdF(String str) {
    }

    public final /* synthetic */ void DhL(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    public final void EZk(boolean z) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onResume() {
    }

    public static final void A00(C65121Lnj lnj) {
        Activity activity = lnj.A0C;
        if (C2604245p.A03(activity)) {
            lnj.A05 = true;
            A01(lnj);
            lnj.A0N.setVisibility(0);
            lnj.A0M.A07();
            return;
        }
        A01(lnj);
        if (!lnj.A07) {
            lnj.A07 = true;
            C2604245p.A01(activity, lnj);
        }
    }

    public static final void A01(C65121Lnj lnj) {
        if (lnj.A05) {
            lnj.A0E.setVisibility(0);
            lnj.A0I.setVisibility(4);
        } else if (!C2604245p.A03(lnj.A0C)) {
            lnj.A0E.setVisibility(8);
            lnj.A0I.setVisibility(8);
            lnj.A0P.setVisibility(8);
            if (lnj.A02 == null) {
                ViewGroup viewGroup = lnj.A0F;
                Context context = viewGroup.getContext();
                C339797kB A0O2 = JTQ.A0O(viewGroup);
                A0O2.A05(context.getString(2131967995));
                A0O2.A04(context.getString(2131971017));
                A0O2.A02(2131967994);
                A0O2.A01();
                lnj.A02 = A0O2;
                A0O2.A03(new LYC((Object) lnj, 43));
                return;
            }
            return;
        } else {
            int A002 = lnj.A0K.A00();
            lnj.A0E.setVisibility(8);
            RecyclerView recyclerView = lnj.A0I;
            if (A002 == 0) {
                recyclerView.setVisibility(4);
                lnj.A0P.setVisibility(0);
                return;
            }
            recyclerView.setVisibility(0);
        }
        lnj.A0P.setVisibility(4);
    }

    public final Integer Aso() {
        return null;
    }

    public final /* synthetic */ boolean CKC() {
        return false;
    }

    public final boolean CUA() {
        return C51969G9p.A1a(this.A09, AnonymousClass05K.A0C);
    }

    public final /* synthetic */ boolean CXX() {
        return false;
    }

    public final void DCO(boolean z) {
        this.A0M.A07();
    }

    public final void DHa(float f, float f2) {
        this.A08 = f;
        TriangleSpinner triangleSpinner = this.A0N;
        triangleSpinner.setAlpha(f);
        if (f2 <= 0.0f) {
            this.A04 = false;
            this.A0I.removeCallbacks(this.A0O);
            this.A0M.A08();
            this.A00 = -1;
            this.A0K.Ecr((Integer) null, "", AnonymousClass7TE.A1C());
            triangleSpinner.setVisibility(8);
            A01(this);
        } else if (!this.A04) {
            this.A04 = true;
            if (C2604245p.A03(this.A0C)) {
                C339797kB r0 = this.A02;
                if (r0 != null) {
                    r0.A00();
                }
                this.A02 = null;
            }
            A00(this);
        }
    }

    public final void DsQ(float f, float f2) {
        this.A09 = AnonymousClass05K.A00;
    }

    public final boolean FJb(float f, float f2, float f3) {
        Integer num = this.A09;
        if (num == AnonymousClass05K.A00) {
            if (this.A08 < 0.5f || f2 < ((float) this.A0Q.getTop()) || (this.A0H.A1c() == 0 && f3 > 0.0f)) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            this.A09 = num;
        }
        if (num != AnonymousClass05K.A01) {
            return false;
        }
        return true;
    }

    public final int getColumnCount() {
        return this.A0H.A00;
    }

    public final Folder getCurrentFolder() {
        return this.A0M.A02;
    }

    public final List getFolders() {
        AnonymousClass8XW r1 = this.A0M;
        0qQ.A0B(r1, 0);
        Comparator comparator = C64078LLw.A01;
        0qQ.A0B(comparator, 2);
        ArrayList A042 = r1.A04();
        ArrayList A052 = r1.A05();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Folder folder = (Folder) next;
            if (!(folder == null || folder.A02 == -5 || folder.A05.isEmpty())) {
                A1C.add(next);
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = A052.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Folder folder2 = (Folder) next2;
            if (!(folder2 == null || folder2.A02 == -5 || folder2.A05.isEmpty())) {
                A1C2.add(next2);
            }
        }
        return 00k.A0g(00k.A0S(A1C2, A1C), comparator);
    }

    public final void onPause() {
        this.A0M.A08();
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.A0M.A0D(((Folder) getFolders().get(i)).A02);
        this.A0I.A0o(0);
    }

    public final void ETJ(Integer num) {
    }

    public final /* synthetic */ boolean DHo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        return false;
    }
}
