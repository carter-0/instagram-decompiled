package X;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.FaceEffectLinearLayoutManager;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ozv  reason: case insensitive filesystem */
public final class C72286Ozv implements AnonymousClass8DM {
    public int A00;
    public View A01;
    public C355948Rz A02;
    public ArEffectPickerRecyclerView A03;
    public C64998Llb A04;
    public boolean A05;
    public boolean A06;
    public FaceEffectLinearLayoutManager A07;
    public final int A08;
    public final int A09;
    public final Handler A0A = AnonymousClass7TF.A0D();
    public final AnonymousClass8DI A0B;
    public final C68686NSs A0C;
    public final AnonymousClass80W A0D;
    public final Runnable A0E = new C73061PUs(this);
    public final boolean A0F;
    public final View A0G;
    public final ViewStub A0H;
    public final C249403jg A0I = new C67837Mvh(this, 2);
    public final UserSession A0J;
    public final AnonymousClass875 A0K;
    public final AnonymousClass8DO A0L;
    public final NCA A0M = new NCA(this);
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final void APJ() {
    }

    public final void ARV() {
    }

    public final String AqZ(AnonymousClass87G r2) {
        return "";
    }

    public final int B0W(AnonymousClass87G r2) {
        0qQ.A0B(r2, 0);
        int indexOf = this.A0C.A02.indexOf(r2);
        if (indexOf < 0) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return indexOf;
    }

    public final int B0X(String str) {
        0qQ.A0B(str, 0);
        return this.A0C.A00(str);
    }

    public final /* synthetic */ void CLD() {
    }

    public final void CLe() {
    }

    public final void Cuj(Set set) {
    }

    public final void Dke() {
    }

    public final void EUK(boolean z) {
        this.A06 = true;
    }

    public final void EUv(String str) {
    }

    public final void EUw(List list) {
        0qQ.A0B(list, 0);
        this.A0C.A05(Collections.unmodifiableList(list));
    }

    public final void EXs(boolean z) {
    }

    public final void Egp(Product product) {
    }

    public final void Egv(boolean z) {
    }

    public final /* synthetic */ void Eu0() {
    }

    public final void Ev0() {
    }

    public final void FL7(float f) {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final boolean AFa() {
        Object obj = this.A0D.A00.first;
        0qQ.A07(obj);
        if ((obj == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY || obj == AnonymousClass80V.POST_CAPTURE_AR_EFFECT_TRAY) && this.A0F) {
            return true;
        }
        return false;
    }

    public final AnonymousClass8DO AcK() {
        return this.A0L;
    }

    public final AnonymousClass87G Aty() {
        AnonymousClass518 r0;
        C68686NSs nSs = this.A0C;
        if (nSs.A06(nSs.A00)) {
            r0 = (AnonymousClass518) nSs.A02.get(nSs.A00);
        } else {
            r0 = null;
        }
        return (AnonymousClass87G) r0;
    }

    public final AnonymousClass87G B0Q(int i) {
        return (AnonymousClass87G) this.A0C.A01(i);
    }

    public final int B0a() {
        return this.A0C.getItemCount();
    }

    public final int B6H() {
        FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = this.A07;
        if (faceEffectLinearLayoutManager != null) {
            return faceEffectLinearLayoutManager.A1a();
        }
        return 0;
    }

    public final int BLO() {
        FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = this.A07;
        if (faceEffectLinearLayoutManager != null) {
            return faceEffectLinearLayoutManager.A1b();
        }
        return 0;
    }

    public final int BcK() {
        return this.A08;
    }

    public final C252203oj BoF() {
        return this.A0M;
    }

    public final AnonymousClass87G Bre() {
        AnonymousClass518 r0;
        C68686NSs nSs = this.A0C;
        if (nSs.A06(nSs.A00)) {
            r0 = (AnonymousClass518) nSs.A02.get(nSs.A00);
        } else {
            r0 = null;
        }
        return (AnonymousClass87G) r0;
    }

    public final int Brp() {
        return this.A0C.A00;
    }

    public final float C9d() {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            return arEffectPickerRecyclerView.getTranslationY();
        }
        return 0.0f;
    }

    public final boolean CZ5() {
        return AnonymousClass7TF.A1V(this.A03);
    }

    public final boolean CZO(int i) {
        return this.A0C.A06(i);
    }

    public final void Cmz() {
        if (this.A01 == null) {
            FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = new FaceEffectLinearLayoutManager(AnonymousClass7TE.A0S(this.A0G));
            this.A07 = faceEffectLinearLayoutManager;
            faceEffectLinearLayoutManager.A0v(true);
            View inflate = this.A0H.inflate();
            this.A01 = inflate;
            boolean z = this.A0O;
            inflate.setFitsSystemWindows(z);
            if (z) {
                inflate.requestApplyInsets();
            }
            View requireViewById = inflate.requireViewById(R.id.ar_effect_picker_recycler_view);
            ArEffectPickerRecyclerView arEffectPickerRecyclerView = (ArEffectPickerRecyclerView) requireViewById;
            this.A03 = arEffectPickerRecyclerView;
            0qQ.A07(requireViewById);
            String str = this.A0N;
            arEffectPickerRecyclerView.A00 = str;
            arEffectPickerRecyclerView.setLayoutManager(faceEffectLinearLayoutManager);
            arEffectPickerRecyclerView.setAdapter(this.A0C);
            AnonymousClass3AQ r0 = new AnonymousClass3AQ();
            r0.A00 = false;
            arEffectPickerRecyclerView.setItemAnimator(r0);
            arEffectPickerRecyclerView.A15(this.A0I);
            if ("video_call".equals(str)) {
                arEffectPickerRecyclerView.A11(new C67822MvQ(this));
            }
            if (!"video_call".equals(arEffectPickerRecyclerView.A00)) {
                C349087zZ r02 = new C349087zZ();
                r02.A07(arEffectPickerRecyclerView);
                faceEffectLinearLayoutManager.A01 = r02;
            }
            faceEffectLinearLayoutManager.A00 = 100.0f;
            if (0qQ.A0K(str, AnonymousClass000.A00(1555))) {
                arEffectPickerRecyclerView.setBackgroundResource(R.drawable.effect_tray_shadow);
            }
        }
    }

    public final void Crx(int i) {
        this.A0C.notifyItemChanged(i);
    }

    public final void DDM() {
        AnonymousClass7TH.A0R(this.A03);
    }

    public final void EBJ() {
        C68686NSs nSs = this.A0C;
        nSs.A00 = nSs.A03;
    }

    public final boolean EDa(AnonymousClass87G r6) {
        C68686NSs nSs = this.A0C;
        String id = r6.getId();
        int i = 0;
        while (true) {
            List list = nSs.A02;
            if (i >= list.size()) {
                return false;
            }
            if (2PP.A00(id, ((AnonymousClass518) list.get(i)).getId())) {
                list.remove(i);
                return true;
            }
            i++;
        }
    }

    public final boolean EDb(int i) {
        C68686NSs nSs = this.A0C;
        if (!nSs.A06(i)) {
            return false;
        }
        nSs.A02.remove(i);
        nSs.notifyDataSetChanged();
        return true;
    }

    public final void EEa() {
        C68686NSs nSs = this.A0C;
        int i = nSs.A00;
        nSs.A00 = -1;
        if (nSs.A06(i)) {
            nSs.notifyItemChanged(i);
        }
    }

    public final void EI0() {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.A0o(0);
            EEa();
        }
    }

    public final void EKh(int i, boolean z) {
        if (AnonymousClass7TF.A1V(this.A03)) {
            C68686NSs nSs = this.A0C;
            if (nSs.A06(i)) {
                nSs.A02(i);
                boolean z2 = nSs.A01;
                ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
                if (z2) {
                    if (arEffectPickerRecyclerView != null) {
                        arEffectPickerRecyclerView.A0p(i);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (arEffectPickerRecyclerView != null) {
                    arEffectPickerRecyclerView.A0o(i);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
    }

    public final void EL8(String str) {
        C68686NSs nSs = this.A0C;
        int i = 0;
        while (true) {
            List list = nSs.A02;
            if (i >= list.size()) {
                break;
            } else if (2PP.A00(str, ((AnonymousClass518) list.get(i)).getId())) {
                nSs.A02(i);
                break;
            } else {
                i++;
            }
        }
        int i2 = nSs.A00;
        if (nSs.A06(i2)) {
            Cmz();
            nSs.A01 = true;
            ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
            if (arEffectPickerRecyclerView != null) {
                arEffectPickerRecyclerView.A0o(i2);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void EpH(float f) {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.setTranslationY(f);
        }
    }

    public final void EwC(AnonymousClass87G r5) {
        String str;
        int A002;
        if (r5 != null) {
            str = r5.getId();
        } else {
            str = null;
        }
        Cmz();
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            if (str == null) {
                A002 = 0;
            } else {
                A002 = this.A0C.A00(str);
            }
            C68686NSs nSs = this.A0C;
            if (nSs.A06(A002)) {
                nSs.A01 = true;
                nSs.A03(A002);
                arEffectPickerRecyclerView.A0o(A002);
            }
        }
    }

    public final boolean isEmpty() {
        return this.A0P;
    }

    public final void notifyDataSetChanged() {
        this.A0C.notifyDataSetChanged();
    }

    public final void setVisibility(int i) {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public C72286Ozv(View view, AnonymousClass0iw r13, UserSession userSession, AnonymousClass8DI r15, AnonymousClass8DF r16, C70504O9d o9d, AnonymousClass80W r18, String str, boolean z, boolean z2) {
        this.A0J = userSession;
        this.A0D = r18;
        this.A0G = view;
        String str2 = str;
        this.A0N = str2;
        this.A0B = r15;
        this.A0O = z;
        this.A0H = JTR.A0X(view, R.id.default_ar_effect_picker_container_stub);
        C72279Ozo ozo = new C72279Ozo(this);
        this.A0K = ozo;
        C68686NSs nSs = new C68686NSs(AnonymousClass7TE.A0S(view), r13, userSession, ozo, r16, o9d, str2, z2);
        this.A0C = nSs;
        this.A0L = new C72285Ozu(nSs);
        Resources resources = view.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A0P = nSs.A02.isEmpty();
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        boolean z3 = false;
        if (arEffectPickerRecyclerView != null && arEffectPickerRecyclerView.getScrollState() == 0) {
            z3 = true;
        }
        this.A0F = z3;
    }

    public final void A8H(AnonymousClass87G r4, int i) {
        List A1I = AnonymousClass7TE.A1I(r4);
        C68686NSs nSs = this.A0C;
        List unmodifiableList = Collections.unmodifiableList(A1I);
        if (!unmodifiableList.isEmpty()) {
            nSs.A02.addAll(i, unmodifiableList);
            int i2 = nSs.A00;
            if (i2 >= i) {
                nSs.A00 = DbT.A01(unmodifiableList, i2);
            }
            nSs.notifyItemRangeInserted(i, unmodifiableList.size());
        }
    }

    public final AnonymousClass87G BaM() {
        return Bre();
    }

    public final void DCI() {
        Cmz();
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.setVisibility(0);
            ArEffectPickerRecyclerView arEffectPickerRecyclerView2 = this.A03;
            if (arEffectPickerRecyclerView2 != null) {
                arEffectPickerRecyclerView2.post(new C73060PUr(this));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void ELA(String str, int i, boolean z) {
        Cmz();
        this.A0C.A04(str, z, false, i);
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.A0o(i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void EOe(boolean z) {
        this.A05 = z;
    }

    public final void EeZ(C64998Llb llb) {
        this.A04 = llb;
    }

    public final void EpC(C355948Rz r1) {
        this.A02 = r1;
    }
}
